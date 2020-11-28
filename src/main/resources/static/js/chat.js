$(function(){
    let initApplication = function()
    {
        $('.messages-and-users').css({display: 'flex'});
        $('.controls').css({display: 'flex'});
        //TODO: init events
    };

    let registerUser = function(name)
    {
        $.post('/auth', {name: name}, function(response){
            if(response.result) {
                initApplication();
            }
        });
    };

    $.get('/init', {}, function(response){
        if(!response.result)
        {
            let name = prompt('Введите Ваше имя:');
            registerUser(name);
            return;
        }
        initApplication();
    });
});