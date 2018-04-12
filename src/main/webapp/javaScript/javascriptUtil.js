/**
 * 自定义异步请求：传送类型为POST,返回类型为JSON,该函数接收一个JSON的参数对象
	object.path为自定义请求地址
	object.data为自定义发送的JSON对象
	object.success为自定义处理data的逻辑函数
	object.error为自定义错误消息
 * @returns
 */
function ajaxJson()
	{
		console.log(arguments[0]);
		if (arguments.length==1 && typeof arguments[0] === 'object')
			{
				$.ajax(
					{
						url : path + arguments[0].url,
						type : "post",
						data : arguments[0].data,
						dataType : "json",
						success :arguments[0].success
					});
			}
	}


/**
 * 传入任意字符串返回唯一的hashcode值
 * @param str任意字符串
 * @returns
 */
function hashcode(str)
	{
		var hash = 0, i, chr, len;
		if (str.length === 0)
			return hash;
		for (i = 0, len = str.length; i < len; i++)
			{
				chr = str.charCodeAt(i);
				hash = ((hash << 5) - hash) + chr;
				hash |= 0; // Convert to 32bit integer
			}
		return hash;
	}
