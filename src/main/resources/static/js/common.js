hljs.initHighlightingOnLoad();

// モーダル初期化
var myModal = new bootstrap.Modal(
	document.getElementById('modal1'), 
	{
		backdrop: true
	}
);

// モーダルの表示・非表示
// type:1 OK ボタンのみ
// type:2 OK Cancelボタン　funk: OKボタンを押したときの処理内容
function showModal(msg, type, func){
	$('#modal1Body').append(msg);
	if (type == 1) {
		$('#modal1Cancel').hide();
		$('#modal1Ok').on('click', hideModal);
	} else if (type ==2) {
		$('#modal1Cancel').show();
		$('#modal1Ok').on('click', func);
		$('#modal1Cancel').on('click', hideModal);
	}
	myModal.show();
}
function hideModal(){
	myModal.hide();
	$('#modal1Body').empty();
}