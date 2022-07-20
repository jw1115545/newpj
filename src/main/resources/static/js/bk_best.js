
$(document).ready(function(){
    $.getJSON("/api/v1/bestbk", function(result){
        let html = "";
        $.each(result, function(i, field){
            // $("div").append(field + " ");
            // console.log(field.menu);
            // console.log(field['price']);
            // console.log(field.img);
            html += "<h3 style=\"text-align: center\">" + field.menu + "</h3>";
            html += "<h5 style=\"text-align: center\"> 단품 가격 : " + field.price + "</h5>";
            html += "<h5 style=\"text-align: center\"> 세트 가격 : " +field.price2+"</h5>";
            html += "<div style=\"text-align: center\"><img src='" + field.img + "' width='600'/></div>";
        });
        $("#bestbk").html(html);

    });
});