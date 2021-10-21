package com.officeutq.springtest.domain.test;

import java.util.Date;

import com.officeutq.springtest.utility.BeanUtil;

/**
 * Indexで使用するリストのDto
 * @author Koji Sakamoto
 *
 */
public class IndexListDto {

	// コンストラクタ
	public IndexListDto(){
		
	}
	// コンストラクタ
	public IndexListDto(IndexListDto indexListDto){
		BeanUtil.copyProperties(this, indexListDto);
	}
	
	// 画面ID
	private String screenId;
	// タイトル
	private String indexTitle;
	// 説明
	private String indexExp;
	// 日付
	private Date indexDate;
	// メモ
	private String indexMemo;
	
	// ゲッター
	public String getScreenId() {
		return this.screenId;
	}
	public String getIndexTitle() {
		return this.indexTitle;
	}
	public String getIndexExp() {
		return this.indexExp;
	}
	public Date getIndexDate() {
		return this.indexDate;
	}
	public String getIndexMemo() {
		return this.indexMemo;
	}
	
	// セッター
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public void setIndexTitle(String indexTitle) {
		this.indexTitle = indexTitle;
	}
	public void setIndexExp(String indexExp) {
		this.indexExp = indexExp;
	}
	public void setIndexDate(Date indexDate) {
		this.indexDate = indexDate;
	}
	public void setIndexMemo(String indexMemo) {
		this.indexMemo = indexMemo;
	}
	
}
