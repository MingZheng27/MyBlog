$(function(){
	var a = 0;
	function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); 
            var r = window.location.search.substr(1).match(reg);  
            if (r != null) return unescape(r[2]); return null; 
        }
	$.ajax({url:"http://139.129.236.10:8090/NewBlog/getarticle.action?id=" + getUrlParam('id'),
		success: function(data,textStatus,xhr){
			console.info(data);
			$('#title').append(data.article.title);
			$('#date').append(data.article.updatetime + ' by ' + data.article.author);
			$('#content').append(data.article.content);
			},
		dataType:"json"
		});
});