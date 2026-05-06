/*
 * @description: 提升代码可读性，把常见HTTP Status Code放入类中
 */

package src.common;

public class HttpStatus {
	public static final int OK = 200; // 请求成功
	public static final int MovedPermanently = 301; // 永久重定向
	public static final int Found = 302; // 临时重定向
	public static final int NotModified = 304; // 未修改
	public static final int NotFound = 404; // 找不到资源
	public static final int MethodNotAllowed = 405; // 不允许的请求方法
	public static final int InternalServerError = 500; // 服务器内部错误
}