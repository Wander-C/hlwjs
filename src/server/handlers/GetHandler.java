/*
 * @Description: 处理GET请求
 */
package src.server.handlers;

import java.io.OutputStream;
import java.net.http.HttpRequest;

public class GetHandler {

  /**
   * @description: 处理GET请求。包含对MIME的支持。如果对MIME支持的代码比较多可以单开一个文件
   *               记得处理错误码：确定statusCode(别直接用数字！参见HttpStatus.java)后直接调用ErrorHandler
   * @param {HttpRequest}  request 请求内容
   * @param {OutputStream} out 与客户端 socket 的输出流相连（TODO:不确定这么写可不可以）
   * @return {*}
   */
  public String handle(HttpRequest request, OutputStream out) {
    return null;
  }

}
