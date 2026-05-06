/*
 * @Description: 处理错误状态
 */
package src.server.handlers;

import java.io.OutputStream;

public class ErrorHandler {

  /**
   * @description: 根据错误码构建返回报文（ResponseBuilder）
   * @param {int} statusCode
   * @param {OutputStream} out
   * @return {*}
   */  
  public String handle(int statusCode, OutputStream out) {
    return null;
  }
}
