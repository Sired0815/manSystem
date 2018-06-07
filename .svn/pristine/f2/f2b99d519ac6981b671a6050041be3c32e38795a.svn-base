$(function(){
    //左侧管理页面点击事件
    $(".manager-list>li").click(
        function(){
            if($(this).children('ul').css("display")=="none"){
                $(this).children('ul').slideDown();
            }else{
                $(this).children('ul').slideUp();
            }

        }
    )

})
$(function () {
    function getTimeOfToday(){
        var date = new Date();
        var year  = date.getFullYear();
        var month = date.getMonth();
        var day = date.getDate();
        var hour = date.getHours();
        var min = date.getMinutes();
        var sc = date.getSeconds();
        var dayOfWeek = date.getDay();
        if(dayOfWeek==0){
            dayOfWeek='日';
        }else if(dayOfWeek==1){
            dayOfWeek='一';
        }else if(dayOfWeek==2){
            dayOfWeek='二';
        }else if(dayOfWeek==3){
            dayOfWeek='三';
        }else if(dayOfWeek==4){
            dayOfWeek='四';
        }else if(dayOfWeek==5){
            dayOfWeek='五';
        }else if(dayOfWeek==6){
            dayOfWeek='六';
        }

        var st ="时间："+ year+"年"+(month+1)+"月"+day+"日"+" "+hour+":"+min+":"+sc+" 周"+dayOfWeek;
        return st;
    }
    $("#date").html(getTimeOfToday());

    setInterval(function() {
        $("#date").html(getTimeOfToday());
    }, 1000);
})




