$(function() {
	common.showMessage($("#message").val());
	$("#mainForm").validate({
		rules : { // 表单校验的规则
			"title" : "required", // title-表单name的值.
			"link" : "required",
			"weight" : {
				required : true,
				digits : true,
				maxlength : 5
			}
		},
		messages : { // 错误提示信息，不写则默认为message_zh.js的提示语.
			"title" : "请输入标题！"
		}
	});
});

function modify() {
	$("#mainForm").submit();
}

function goback() {
	location.href = $('#basePath').val() + '/ad';
}