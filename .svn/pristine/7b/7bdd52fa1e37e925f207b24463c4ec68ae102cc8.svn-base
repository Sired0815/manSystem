$(function() {
	/* 验证姓名不能为空 */
	var checkName = function() {

		var m = $(".name").val();
		var n = $(".name").next();
		n.html("");
		if (m.length == 0 || m == '') {
			n.html("X").css("color", "red");
			return false;
		} else {
			return true;
		}
	};
	$(".name").blur(function() {
		checkName();
	});
	/* 验证信息来源 */// ???????????可以不需要，要了页面有毛病????????????
	var checkxinxi = function() {
		var m = $(".xinxi").val();
		var n = $(".xinxi").next();
		n.html("");
		if (m == '' || m.length == 0) {
			n.html("请选择!").css("color", "red");
			return false;
		} else {

			return true;
		}
	};
	$(".xinxi").blur(function() {
		checkxinxi();
	});

	/* 时间插件 */
	/* 点击提交 */
	$("#btn").click(function() {
		var a = checkxinxi();
		var b = checkName();
		if (a & b) {// 执行提交

		}
	});

	// 添加配置
	laydate.render({
		elem : "#t",
		triggle : "click",/* 设置点击触发方式 */
		theme : 'molv'
	});
});