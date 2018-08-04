
function zz(){
    alert("zzsagdsadfz");
}


var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },

    save : function () {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 등록되었습니다.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    },

    getData : function(){
        $.ajax({
            type:'GET',
            url : 'cardDeck/user'
        }).done(function(item){
            console.log('item',item);
        }).fail(function (err){
            console.log('err',err);
        })
    }

};

main.init();
main.getData();