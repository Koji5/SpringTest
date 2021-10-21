package com.officeutq.springtest;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.officeutq.springtest.domain.mybatis.IndexList;
import com.officeutq.springtest.domain.mybatis.IndexListExample;
import com.officeutq.springtest.mapper.mybatis.IndexListMapper;

@Service
public class Test006Service {

	@Autowired
	private IndexListMapper indexListMapper;

    public IndexList findThisPart(String screenId) {
    	IndexListExample example = new IndexListExample();
    	example.createCriteria().andScreenIdEqualTo(screenId);
    	List<IndexList> list = indexListMapper.selectByExample(example);
    	if (CollectionUtils.isEmpty(list)) {
    		  return null;
    		}
    	return list.get(0);
    }
    
    public Map<String, String> getUserRecords() {
    	// Firebaseの初期化
    	FirebaseOptions options = null;
		try {
			options = FirebaseOptions.builder()
				    .setCredentials(GoogleCredentials.getApplicationDefault())
				    .build();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    	FirebaseApp.initializeApp(options);
    	
    	String uid = "RZ1dZJobMzftqohyGPrRqJ7SsA93";
    	UserRecord userRecord = null;

		// ユーザー情報の取得
		try {
			userRecord = FirebaseAuth.getInstance().getUser(uid);
		} catch (FirebaseAuthException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    	// See the UserRecord reference doc for the contents of userRecord.
    	Map<String, String> map = new LinkedHashMap<>();
    	map.put("UID: ", userRecord.getUid());
    	map.put("DisplayName: ", userRecord.getDisplayName());
    	map.put("Email: ", userRecord.getEmail());
    	map.put("PhoneNumber: ", userRecord.getPhoneNumber());
    	map.put("PhotoUrl: ", userRecord.getPhotoUrl());
    	map.put("ProviderId: ", userRecord.getProviderId());
    	map.put("TenantId: ", userRecord.getTenantId());
    	map.put("EmailVerified: ", userRecord.isEmailVerified() ? "true" : "false");
    	map.put("Disabled: ", userRecord.isDisabled() ? "true" : "false");

    	return map;
    }
}
