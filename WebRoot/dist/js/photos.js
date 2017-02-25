$(function(){
	var num = 0;
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
		$.ajax({url:"http://139.129.236.10:8090/NewBlog/getimage.action?num=" + num,
			dataType:"json",
			success: function(data){
				var row = $('#row');
				row.empty();
				for (var i = 0 ;i < data.list.length;i++){
					row.append('<a class="photo" href="' + data.list[i].picurl + '" data-lightbox="myphoto"><img src="'+ data.list[i].picurl +'?t='+ Math.random() + '"/></a>');
					//由于缓存问题所以在src后面加一个随机生成的参数就可以每次都改变了
					if ((i + 1) % 5 == 0){
						row.append('<br/>');
					}
				}
			}});
	}
	load(0);
});