$(function () {
    //省下拉框
    $.get(
        "province/getAllProvince",
        function (e) {
            $(e).each(function () {
                var op = $("<option value='" + this.id + "'>" + this.name + "</option>")
                $(".sheng").append(op);
            })
        }
    )
    $(".sheng").on('change', function () {
        $(".shi").val(0);
        $(".city").remove();
        $.get(
            "province/getAllCityById",
            {provinceId: $(".sheng").val()},
            function (e) {
                $(e).each(function () {
                    var op = $("<option value='" + this.id + "' class='city'>" + this.name + "</option>")
                    $(".shi").append(op);
                })
            }
        )
    })
})
