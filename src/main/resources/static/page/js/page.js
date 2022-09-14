

$('.prevpage').click(function(){
	event.preventDefault();
	var page = $("#pageno").val();
	if(page==1){
		return;
	}
	$("#pageno").val(page-1);
	loaddata();
})

$('.nextpage').click(function(){
	event.preventDefault();
	var page = $("#pageno").val();
	$("#pageno").val(page-0+1);
	loaddata();
})

$('.jumppage').click(function(){
	var page = $("#pageno").val();
	if(page<=0){//避免非法值
		page=1;
		$("#pageno").val(page)
	}
	loaddata();
});


