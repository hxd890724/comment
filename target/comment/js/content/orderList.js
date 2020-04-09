function search() {
    var phone = $('#title').val();
    $("#mainForm").attr("method","GET");
    $("#mainForm").attr("action",$("#basePath").val() + "/orders/search/"+phone);
    $("#mainForm").submit();
}