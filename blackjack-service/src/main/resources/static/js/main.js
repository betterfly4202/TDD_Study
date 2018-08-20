
function zz(){
    alert("zzsagdsadfz");
}


var result =  [];

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
            url : '/cardDeck/user'
        }).done(function(item){
            console.log('item',item);
            result = item;
        }).fail(function (err){
            console.log('err',err);
        })
    }

};

main.init();
main.getData();


//핸들바 템플릿 가져오기
var source = $("#entry-template").html();

//핸들바 템플릿 컴파일
var template = Handlebars.compile(source);

//핸들바 템플릿에 바인딩할 데이터
var data = {
    users: [
        { name: "홍길동1", id: "aaa1", email: "aaa1@gmail.com" },
        { name: "홍길동2", id: "aaa2", email: "aaa2@gmail.com" },
        { name: "홍길동3", id: "aaa3", email: "aaa3@gmail.com" },
        { name: "홍길동4", id: "aaa4", email: "aaa4@gmail.com" },
        { name: "홍길동5", id: "aaa5", email: "aaa5@gmail.com" }
    ]
};

//핸들바 템플릿에 데이터를 바인딩해서 HTML 생성
var html = template(data);

//생성된 HTML을 DOM에 주입
$('body').append(html);