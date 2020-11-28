$(function(){
    $('.send-message').on('click', function(){
        $.get('/init', {}, function(response){
            alert(response);
        });
    });
});