
	window.onload = function(){
		
		//向服务器发起ajax请求，
			//返回登录用户的信息
			
		$.ajax({
			type:'get',
			url:'/manage/login/getuser',
			success:function(data){//用户信息为data
				
				if(data){
					
					//如果用户登录了
					loaddata();
					//充填头像，用户名
					$('.navbar-text').html("欢迎，"+user.username);
					$('.row .info img').attr('src','imgs/'+user.logo);
					$('.row .info div').html(user.username);
				}else{
					//否则,跳转到登录页
					location.href="login.html";
				}
			}
		})
		
	}