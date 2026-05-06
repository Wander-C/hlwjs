/*
 * @Description: 处理POST请求
 */
package src.server.handlers;

import java.io.OutputStream;
import java.net.http.HttpRequest;

public class PostHandler {

  /**
   * @description: 处理POST请求。根据GPT，登录和注册也算是POST
   *               记得处理错误码：确定statusCode(别直接用数字！参见HttpStatus.java)后直接调用ErrorHandler
   * @param {HttpRequest}  request 请求内容
   * @param {OutputStream} out 与客户端 socket 的输出流相连（TODO:不确定这么写可不可以）
   * @return {*}
   */
  public String handle(HttpRequest request, OutputStream out) {
    return null;
  }

}
