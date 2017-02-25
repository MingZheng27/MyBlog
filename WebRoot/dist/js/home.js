$(function(){
	
	$.ajax({url:"http://139.129.236.10:8090/NewBlog/getonearticle.action",
			success: function(data,textStatus,xhr){
				//console.info(data);
				$('#title').append(data.details.title);
				$('#date').append(data.details.updatetime + ' by ' + data.details.author);
				$('#content').append(data.details.content);
				},
			dataType:"json"
			});
	
});