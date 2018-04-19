/**
 * 自定义异步请求：传送类型为POST,返回类型为JSON,该函数返回只接受一个对应的消息，并不做返回数据的处理
	object.path为自定义请求地址
	object.data为自定义发送的JSON对象
	object.success为自定义处理data的逻辑函数
	object.error为自定义错误消息
 * @returns
 */
function ajaxJsonReturnMessage()
	{
		if (arguments.length==1 && typeof arguments[0] === 'object')
			{
				arguments[0].type="post";
				arguments[0].dataType="json";
				arguments[0].success=function(result)
					{
						var state = result.state;
						var data = result.data;
						var message = result.message;
						if (state == 0)
							{
								layer.msg(data);
							} else
							{
								layer.msg(message);
							}
						return false;// 阻止表单跳转
					}
				$.ajax(arguments[0]);
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
