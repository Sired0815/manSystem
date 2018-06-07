$(function() {
	$("h2").each(function(index, element) {
		var animation = TweenMax.to(this, 0.2, {
			className : '+= superShadow',
			marginTop : '-10px',
			marginBottom : '10px',
			ease : Power1.easeIn,
			paused : true
		});
		element.animation = animation;
	})
	$('h2').hover(function() {
		this.animation.play()
	}, function() {
		this.animation.reverse();
	})
})
   $(function() {
    		$("#datagrid").datagrid({
    			url : "consultant/getAll",
    			iconCls : "icon-save",//
    			pagination : true,// 分页
    			pageSize : 16,// 每页几条
    			pageList : [ 16, 32,48 ],
    			fixed : true,// 自适应
    			fitColumns : true,// 表格下放有没有滚动条的属性
    			nowrap : true,// 字段太多,是否折行
    			border : true,// 是否有边框,
    			striped : true,
    			autoRowHeight : false,
    			//rownumbers : true,
    			singleSelect:true,//只准单选
  			    fit:true,//充满容器
    			frozenColumns : [ 
    			 ],
    			columns : [ [ {
    				title : "编号",
    				width : 50,
    				field : "id",
    				checkbox : true
    			} ,{
    				title : "姓名",
    				field : "name",
    				width : 100,
    			}, {
    				title : "首咨时间",
    				field : "firstTime",
    				width : 150,
    			}, {
    				title : "性别",
    				field : "gender",
    				width : 50,
    			}, {
    				title : "类型",
    				field : "studentName",
    				width : 50,
    			}, {
    				title : "电话",
    				field : "phone",
    				width : 100,
    			}, {
    				title : "QQ",
    				field : "qq",
    				width : 100,
    			}, {
    				title : "咨询师",
    				field : "userName",// 与字段名相同
    				width : 80,
    			}, {
    				title : "最后回访",
    				field : "userName",// 与字段名相同
    				width : 80,
    			}, {
    				title : "最后回访时间",
    				field : "lastTime",// 与字段名相同
    				width : 150,
    			}, {
    				title : "创量人",
    				field : "userName",
    				width : 80,
    			}, {
    				title : "关键字",
    				field : "keyWord",
    				width : 100,
    			}, {
    				title : "信息来源",
    				field : "informationName",
    				width : 100,
    			}, {
    				title : "课程",
    				field : "lessonName",
    			} ] ],
    			toolbar : [ {
    				text : "添加",
    				iconCls : "icon-add",
    				handler : function() {
    					$("#addBox").window('open')
    				}
    			}, '-',{
    				text : "所有",
    				iconCls : "icon-reload",
    				handler : function() {
    					$("#datagrid").datagrid('load',{})
    				}
    			}, '-',
    				{
    				text : "编辑",
    				iconCls : "icon-edit",
    				handler : function() {
    					var row = $('#datagrid').datagrid('getSelected')
    					var id=""
    					if (row){
    						id=row.id
                            alert(row.id)
                        }else{
                        	alert("请先选中一条数据")
                        	return
                        }
                        $("#updateBox").window('open')
                        $.get(
                            "consultant/getConsultantById",
							{id:id},
                            function(e){
                                console.info(e);
                                $("#updateId").val(e.id);
                                $("#updateName").val(e.name);
                                $("input[name='gender'][value='"+row.gender+"']").attr("checked",true);
                                $("#updateAge").val(e.age);
                                $("#updateCityId").val(e.cityId);
                                $("#updatePhone").val(e.phone);
                                $("#updateEducationId").val(e.educationId);
                                $("#updateQQ").val(e.qq);
                                $("#updateFirstTime").val(e.firstTime);
                                $("#updateStudentId").val(e.studentId);
                                $("#updateKeyWord").val(e.keyWord);
                                $("#updateText").val(e.text);
                                $("#updateInformationId").val(e.informationId);
                                $("#updateLastTime").val(e.lastTime);
                                $("#updateLessonId").val(e.lessonId);
                                $("#updateVisitId").val(e.visitId);
                                $("#updateExperience").val(e.experience);
                            }
                        )
    				}
    			}, '-', {
    				text : "查询",
    				iconCls : "icon-search",
    				handler : function() {
    					
    					$("#searchBox").window('open');
    				}
    			}, '-', {
    				text : "取消勾选",
    				iconCls : "icon-redo",
    				handler : function() {
    					$("#datagrid").datagrid('clearChecked');
    				}
    			}, '-', {
    				text : "已报班",
    				iconCls : "icon-man",
    				handler : function() {
    					$("#datagrid").datagrid('load',{studentId:5})
    				}
    			}, '-',
    			{
    				text : "统计",
    				iconCls : "icon-large-chart",
    				handler : function() {

    				}
    			},'-',
    			{
    				text : "导出",
    				iconCls : "icon-print",
    				handler : function() {
    					
    				}
    			}, '-']
    		});
//*****************************添加部分************************************    		
    		//定义添加框
    	    $('#addBox').window({
    	  	    width:500,
    	  	    height:400,
    	  	    modal:true,
    	  	    closed:true,
    	  	    title:'添加咨询者',
    	  	});


    		//初始化添加按键
    	    $("[name='add']").linkbutton({
    	        iconCls: 'icon-add'
    	    });
    		//为添加绑定事件
    	    $("[name='add']").on("click",function(){
    	    	$.get(
    	    		"consultant/addConsultant",
    	    		$("#addForm").serialize(),
    	    		function(e){
    	    			console.info(e);
    	    			if(e.result==true){
    	    				$('#addForm').form('reset');
    	    				$("#datagrid").datagrid('load');
    	        	    	$("#addBox").window('close');
    	    			}
    	    		}
    	    	)
    	    })
    	    //初始化清空按键
    	    $("[name='back']").linkbutton({
    	        iconCls: 'icon-clear'
    	    });
    		//绑定事件
    	    $("[name='back']").on("click",function(){
    	    	$('#addForm').form('reset');    	
    	    })
    	    
    	    
//*****************************查询部分************************************
    	    //初始化询弹框
    	    $('#searchBox').window({
    	  	    width:500,
    	  	    height:350,
    	  	    modal:true,
    	  	    closed:true,
    	  	    title:'查询学生',
    	  	});
    		//初始化查询按钮
    	    $("[name='search']").linkbutton({
    	        iconCls: 'icon-search'
    	    });
    		//初始化清空按钮
    	    $("[name='insert']").linkbutton({
    	        iconCls: 'icon-clear'
    	    });
    		//点击查询按钮
    	    $("[name='search']").on("click",function(){
    	    	var name=$("#searchName").val();
    	    	var educationId=$("#searchEducationId").val();
    	    	var userId=$("#searchUserId").val();
    	    	var studentId=$("#searchStudentId").val();
    	    	var first1=$("#first1").val();
    	    	var first2=$("#first2").val();
    	    	var visitId=$("#searchVisitId").val();
    	    	var last1=$("#last1").val();
    	    	var last2=$("#last2").val();
    	    	var informationId=$("#searchInformationId").val();
    	    	var keyWord=$("#searchKeyWord").val();
    	    	var lessonId=$("#searchLessonId").val();
    	    	$("#datagrid").datagrid('load',{
    	    		name:name,
    	    		educationId:educationId,
    	    		userId:userId,
    	    		studentId:studentId, 
    	    		first1:first1,
    	    		first2:first2,
    	    		visitId:visitId,
    	    		last1:last1,
    	    		last2:last2,
    	    		informationId:informationId,
    	    		keyWord:keyWord,
    	    		lessonId:lessonId   
    	    	})
    	    	  $("#searchBox").window('close');  
    	    })
    	    //点击清空按钮
    	    $("[name='insert']").click(function(){
    	    	$('#searchForm').form('reset'); 
    	    })
//**********************************修改部分******************************
       //修改框
       $('#updateBox').window({
           width:500,
           height:400,
           modal:true,
           closed:true,
           title:'修改咨询者',
       });
       //初始化修改按键
       $("[name='edit']").linkbutton({
           iconCls: 'icon-edit'
       });
       //为修改绑定事件
       $("[name='edit']").on("click",function(){
           $.get(
               "consultant/updateConsultant",
               $("#updateForm").serialize(),
               function(e){
                   if(e.result){
                	   $("#updateBox").window('close');
                       $("#datagrid").datagrid('load');
                   }else{
                	   alert("修改失败，请重新修改")
                   }
               }
           )
       })
//*****************************导出excel********************************************
       
    	})