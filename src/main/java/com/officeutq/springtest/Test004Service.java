package com.officeutq.springtest;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.domain.test.Test004Dto;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;
import com.officeutq.springtest.mapper.test.Test004Mapper;
import com.officeutq.springtest.utility.AjaxUtil;
import com.officeutq.springtest.utility.DateUtil;
import com.officeutq.springtest.utility.HtmlUtil;

@Service
public class Test004Service {

	@Autowired
	private IndexListMapper indexListMapper;
	@Autowired
	private Test004Mapper test004Mapper;
	
    public IndexList findThisPart(String screenId) {
    	IndexListExample example = new IndexListExample();
    	example.createCriteria().andScreenIdEqualTo(screenId);
    	List<IndexList> list = indexListMapper.selectByExample(example);
    	if (CollectionUtils.isEmpty(list)) {
    		  return null;
    		}
    	return list.get(0);
    }
    
    /**
     * 画面IDのセレクトボックスに表示するリストを取得
     * @return
     */
    public List<String> getIndexList(){
    	return test004Mapper.getScreenIdList();
    }

    /**
     * 受け取ったscreenIdからレコードを検索し、JSON文字列を返す
     * @param screenId
     * @return
     */
	public String getJsonRecord(String screenId) {
		IndexList list = findThisPart(screenId);
		Test004Dto dto = new Test004Dto();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		dto.indexTitle = AjaxUtil.encode(list.getIndexTitle());
		dto.indexMemo = AjaxUtil.encode(HtmlUtil.unescapeHtml(list.getIndexMemo()));
		dto.indexExp = AjaxUtil.encode(list.getIndexExp());
		dto.indexDate = AjaxUtil.encode(dateFormat.format(list.getIndexDate()));
		dto.screenId = AjaxUtil.encode(list.getScreenId());
		
		return AjaxUtil.getJson(dto);
	}

	/**
	 * 受け取ったレコードデータでデータベースを更新する
	 * @param updateData
	 * @return
	 */
	public String updateIndexList(String updateData) {
		IndexList entity = new IndexList();
		// JSON形式をオブジェクトに変換
		Test004Dto dto = AjaxUtil.readJson(updateData, Test004Dto.class);
		// 入力チェック
		String error = inputCheck(dto);
		if (StringUtils.isNotEmpty(error)) {
			return error;			
		}
		// デコード
		entity.setScreenId(AjaxUtil.decode(dto.screenId));
		entity.setIndexTitle(AjaxUtil.decode(dto.indexTitle));
		entity.setIndexMemo(HtmlUtil.escapeTagValue(AjaxUtil.decode(dto.indexMemo), "code"));
		entity.setIndexExp(AjaxUtil.decode(dto.indexExp));
		entity.setIndexDate(DateUtil.parse(AjaxUtil.decode(dto.indexDate), DateUtil.yyyy_MM_dd));
		// 新規作成処理
		if (findThisPart(entity.getScreenId()) == null) {
			indexListMapper.insert(entity);
			return "レコードを新規作成しました";
		}
		// 更新処理
		indexListMapper.updateByPrimaryKey(entity);
		return "レコードを更新しました";
		// JSONをListとして使いたい場合、以下のようにする
		// Test004JsonDto dto = AjaxUtil.readJson(updateData, Test004JsonDto.class);
		// return dto.test004Dto.get(2).indexDate;
 	}
	
	/**
	 * 入力チェック
	 * @param dto
	 */
	private String inputCheck(Test004Dto dto) {
		String error = "";
		if (StringUtils.isEmpty(dto.screenId)
				|| StringUtils.isEmpty(dto.indexTitle)
				|| StringUtils.isEmpty(dto.indexDate)) {
			error = "入力されていない必須項目があります。<br/>";
		}
		if (DateUtil.parse(AjaxUtil.decode(dto.indexDate), DateUtil.yyyy_MM_dd) == null) {
			error = error + "日付が正しくありません。";
		}
		return error;
	}

}
