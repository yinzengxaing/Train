
$(function(e){
	dataInit();
});

function dataInit(){
	
	$('body').on('click','#btn',function(e){
		alert("hello");
		AjaxPostUtil.request({url:path+"/post/UserController/queryUserById",params:null,type:'json',callback:function(json){
			alert("进");
			if(json.returnCode==0){
		      alert("成功") ;
		      
			}else{
				alert("失败");
			}
		}});
	});

}
