

var utils = {
		
		searchForm:function(formSeria,url,callback){
			
			//阻止默认的表单提交
			event.preventDefault();
			$.ajax({
				type:'post',
				url:url,
				data:formSeria,
				success:function(data){
					callback.call(null,data);
				}
			})
		},
		postMultiForm:function(formData,url,redirectUrl){
			
			//阻止默认的表单提交
			event.preventDefault();
			$.ajax({
				type:'post',
				url:url,
				data:formData,
				contentType:false,
			    processData:false,
				success:function(data){
					if(data==1){
						alert("提交成功");
						location.href=redirectUrl;
					}else{
						alert("系统忙，请稍后再试...");
					}
					
				}
			})
		},
		getData:function(url,callback){
			$.ajax({
				type:'get',
				url:url,
				success:function(data){
					callback.call(null,data);
				}
			})
		},
		ORDER_STATUS:{
			0:'待支付',
			1:'支付成功',
			2:'支付失败'
		},
		MESSAGE_STATUS:{
			0:'未支付',
			1:'已支付'
		},
		STOCK_STATUS:{
			0:'锁定库存',
			1:'成功支付',
			2:'支付超时'
		},
		TRADE_PAY:{
			1:'支付宝',
			2:'微信'
		}
		
		
		
}