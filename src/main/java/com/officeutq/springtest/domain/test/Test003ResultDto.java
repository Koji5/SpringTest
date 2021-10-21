package com.officeutq.springtest.domain.test;

import java.util.Date;
import lombok.Data;

@Data
public class Test003ResultDto {

	// データ
	private Integer sequenceId;
	private String fruitsId;
	private String fruitsName;
	private Integer fruitsPrice;
	private String partnerId;
	private String partnerName;
	private String partnerProducts;
	private Integer transactionCount;
	private Date transactionDate;
	
//	// アクセサ
//	public String getFruitsId() {
//        return fruitsId;
//    }
//	public void setFruitsId(String fruitsId) {
//        this.fruitsId = fruitsId == null ? null : fruitsId.trim();
//    }
//	
//	public String getFruitsName() {
//        return fruitsName;
//    }
//	public void setFruitsName(String fruitsName) {
//        this.fruitsName = fruitsName == null ? null : fruitsName.trim();
//    }
//	
//	public Integer getFruitsPrice() {
//        return fruitsPrice;
//    }
//	public void setFruitsPrice(Integer fruitsPrice) {
//        this.fruitsPrice = fruitsPrice;
//    }
//	
//	public String getPartnerId() {
//        return partnerId;
//    }
//	public void setPartnerId(String partnerId) {
//        this.partnerId = partnerId == null ? null : partnerId.trim();
//    }
//	
//	public String getPartnerName() {
//        return partnerName;
//    }
//	public void setPartnerName(String partnerName) {
//        this.partnerName = partnerName == null ? null : partnerName.trim();
//    }
//	
//	public Object getPartnerProducts() {
//        return partnerProducts;
//    }
//	public void setPartnerProducts(Object partnerProducts) {
//        this.partnerProducts = partnerProducts;
//    }
//	
//	public Integer getTransactionCount() {
//        return transactionCount;
//    }
//	public void setTransactionCount(Integer transactionCount) {
//        this.transactionCount = transactionCount;
//    }
//	
//	public Date getTransactionDate() {
//        return transactionDate;
//    }
//	public void setTransactionDate(Date transactionDate) {
//        this.transactionDate = transactionDate;
//    }

}
