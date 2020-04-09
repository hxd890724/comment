$(function() {
	common.showMessage($("#message").val());
});

function modify() {
	$("#mainForm").submit();
	//location.href = $('#basePath').val() + '/businesses';
}

function goback() {
	location.href = $('#basePath').val() + '/businesses';
}