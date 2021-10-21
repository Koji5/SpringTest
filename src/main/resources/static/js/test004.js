$(function() {
	// bootstrap datepicker設定
	$('.datepicker').datepicker({
		language: 'ja',
		format: 'yyyy/mm/dd',
		todayHighlight: true,
		autoclose: true,
		immediateUpdates: true
	});
	// jQuery validator設定
	// 半角アルファベット（大文字･小文字）もしくは数字のみ
	jQuery.validator.addMethod(
		"alphanum", 
		function(value, element) {
			return this.optional(element) || /^([a-zA-Z0-9]+)$/.test(value);
		}, 
		"半角英数字を入力してください"
	);
	// バリデーション
	$("#form1").validate({
		rules: {
			newScreenId: {
				required: function(element) {
					return $("#screenId").val() == "";
				},
				alphanum: true,
				rangelength: [1, 10]
			},
			indexDate: {
				required: true,
				date: true
			},
			indexTitle: {
				required: true,
				rangelength: [1, 40]
			}
		},
		submitHandler: function(form) {
			postRecordData();
		},
		errorElement: 'p',
		focusInvalid: false
	});
	// 画面IDが変更されたときのイベント処理
   	$("#screenId").change(function() {
   		$("#form1").validate().resetForm();
   		var val = $(this).val();
   		if (val == ""){
   			$("#newScreenId").prop('disabled', false);
   			setFormValue("", "", "", "");
   			return;
   		}
   		$("#newScreenId").val("");
   		$("#newScreenId").prop('disabled', true);
   		changeScreenId(val);
   	});
});

// ajaxで画面IDに対応するレコードデータを取得
function changeScreenId(id) {
	$.ajax({
		url : "/Test004/changeScreenId",
		dataType : "text",
		type : "GET",
		data : {idData : id}
	// Ajaxが正常終了した場合
	}).done(function(data, textStatus, jqXHR) {
		// 該当するデータが無かった場合
		if(!data){
			showModal("該当するデータはありませんでした", 1, null);
			return;
		}
		const indexData = JSON.parse(data);
		var memo = indexData.indexMemo;
		memo = memo.replace(/\+/g," ");
		setFormValue(
			decodeURIComponent(indexData.indexTitle),
			decodeURIComponent(indexData.indexDate),
			decodeURIComponent(indexData.indexExp),
			unescape(decodeURIComponent(memo))
		);
	// Ajaxが異常終了した場合
	}).fail(function(jqXHR, textStatus, errorThrown) {
		showModal("エラーが発生し、データが取得できませんでした" + jqXHR.status, 1, null);
	});
}
		
// ajaxでフォームのデータを送信
function postRecordData() {
	var scrId;
	if ($("#screenId").val() == "") {
		scrId = $("#newScreenId").val();
	} else {
		scrId = $("#screenId").val();
	}
	//各フォームをエンコードしてJSON文字列を作成
	var obj = JSON.stringify({
		indexTitle : encodeURIComponent($("#indexTitle").val()),
		indexExp : encodeURIComponent($("#indexExp").val()),
		indexDate : encodeURIComponent($("#indexDate").val()),
		indexMemo : encodeURIComponent($("#indexMemo").val()),
		screenId : encodeURIComponent(scrId)
	});
	// JSONをListとして使いたい場合は、以下のようにする
//			var obj = JSON.stringify({
//				test004Dto : [
//					{
//						indexTitle : "f",
//						indexExp : "g",
//						indexDate : "h",
//						indexMemo : "i",
//						screenId : "j"
//					}, {
//						indexTitle : "a",
//						indexExp : "b",
//						indexDate : "c",
//						indexMemo : "d",
//						screenId : "e"
//					}, {
//						indexTitle : encodeURIComponent($("#indexTitle").val()),
//						indexExp : encodeURIComponent($("#indexExp").val()),
//						indexDate : encodeURIComponent($("#indexDate").val()),
//						indexMemo : encodeURIComponent($("#indexMemo").val()),
//						screenId : encodeURIComponent($("#screenId").val())
//					}
//				]
//			});
	$.ajax({
		url : "/Test004/postRecordData",
		dataType : "text",
		type : "POST",
		data : {updateDate : obj}
	// Ajaxが正常終了した場合
	}).done(function(data, textStatus, jqXHR) {
		showModal(decodeURIComponent(data), 1, null);
	// Ajaxが異常終了した場合
	}).fail(function(jqXHR, textStatus, errorThrown) {
		showModal(jqXHR.responseText, 1, null);
	});
}
	    
// 各フォーム内容の変更処理
function setFormValue(fTitle, fDate, fExp, fMemo) {
   	$("#indexTitle").val(fTitle);
   	$("#indexDate").val(fDate);
   	$("#indexExp").val(fExp);
   	$("#indexMemo").val(fMemo);
}
