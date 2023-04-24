package com.officeutq.springtest;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "index_list")
public class IndexListDto {

	@Id
    @Column(name = "screen_id", unique = true)
    private String screenId;

    @Column(name = "index_title")
    private String indexTitle;

    @Column(name = "index_exp")
    private String indexExp;

    @Column(name = "index_date")
    private Date indexDate;

    @Column(name = "index_memo")
    private String indexMemo;

    // コンストラクタ
    public IndexListDto() {
    }

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
