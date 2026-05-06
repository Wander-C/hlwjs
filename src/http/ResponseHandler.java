/*
 * @Description: 
 */
package src.http;

import java.io.File;

public class ResponseHandler {

  /**
   * @description: 解析传入文件的内容。将其视作响应报文并提取关键元素，放入一个HttpResponse对象中
   * @param {File} requestFile
   * @return {*} HttpResponse对象，用来存储💾响应
   */
  static HttpResponse parseResponse(File responseFile) {
    return null;
  }

  /**
   * @description: 根据HttpResponse对象，构建一个响应报文
   * @param {HttpRequest} request
   * @return {*} 响应报文
   */
  static String buildResponse(HttpResponse request) {
    return null;
  }

}
