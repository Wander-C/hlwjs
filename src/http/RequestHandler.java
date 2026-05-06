/*
 * @Description: 进行请求的构建和解析工作 
 */
package src.http;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestHandler {

  /**
   * @description: 解析传入文件的内容。将其视作请求报文并提取关键元素，放入一个HttpRequest对象中
   * @param {File} requestFile
   * @return {*} HttpRequest对象，用来存储💾请求
   */;
  static HttpRequest parseRequest(String requestStr) {
    Map<String, String> headerLines = new HashMap<>();
    String[] lines = requestStr.split("\r?\n");
    String []firstLine=lines[0].split(" ");
    String method=firstLine[0];
    String url=firstLine[1];
    String httpVersion=firstLine[2];
    for(int i=1;i<lines.length-1;i++){
      String line=lines[i];
      if(line.contains(":")){
        String []inside=line.split(":");
        String key=inside[0].trim();
        String value=inside[0].trim();
        headerLines.put(key,value);
      }
    }
    String mainbody=lines[lines.length-1];
    return new HttpRequest(method,url,httpVersion,headerLines,mainbody);
  }

  /**
   * @description: 根据HttpRequest对象，构建一个请求报文
   * @param {HttpRequest} request
   * @return {*} 请求报文
   */
  static String buildRequest(HttpRequest request) {
    StringBuilder requestMessage = new StringBuilder();
    requestMessage.append(request.getMethod())
                  .append(" ")
                  .append(request.getUrl())
                  .append(" ")
                  .append(request.getHttpVersion())
                  .append("\r\n");
    Map<String, String> headers = request.getHeaderLines();
    for (Map.Entry<String, String> entry : headers.entrySet()) {
      requestMessage.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\r\n");
    }
    String body = request.getMainbody();
    requestMessage.append(body);
    return requestMessage.toString();
  }

}
