$(function(){
	var num = 0;
	//js内部方法定义了外面访问不到啊。。。所以要在内部通过jquery来修改onclick
	var next = function next(){
		num = num + 1;
		load(num);
	};
	var previous = function previous(){
		if (num >= 1){
			num = num - 1;
			load(num);
		}else{
			load(0);
		}

	};
	$('#previous').attr('onclick','').click(previous);
	$('#next').attr('onclick','').click(next);
	function load(num){
		$.ajax({
			url:"http://139.129.236.10:8090/NewBlog/getarticletitle.action?num=" + num,
			dataType:"json",
			success: function(data){
				var content = $('#content');
				content.empty();
				if (data.list.length == 0){
					content.append('<h4>no articles</h4>');
				}
				for (var i = 0 ; i < data.list.length ;i++){
					content.append('<a href="http://localhost:8090/NewBlog/details.jsp?id=' + data.list[i][1] +'">'+ data.list[i][0] +'</a></br>' );
				}
			}
		});
	};
	load(0);
});