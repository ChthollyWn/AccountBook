
window.onload = function(){
	utils.getData('/manage/login/getuser',function(user){
		
		if(user){
			$('.navbar-text').html("欢迎，"+user.username);
			$('.row .info img').attr('src','imgs/'+user.logo);
			$('.row .info div').html(user.username);
		}
	})
	
	
}