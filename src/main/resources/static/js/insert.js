var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        })
    },
    save : function () {
        var data = {
            menu : $("#menu").val(),
            price : $("#price").val(),
            price2 : $("#price2").val(),
            img : $("#img").val()
        };

        $.ajax({
            type : 'POST',
            url : '/api/v1/insert',
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function () {
            alert('등록되었습니다.');
            window.location.href = '/see';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        })
    }
};

main.init();