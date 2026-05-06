/*
 * @Description: 
 */
/*
 * @Description: 专门负责与server的通信工作
 */
package src.client;

import java.io.*;
import java.net.*;
import java.util.*;
import src.http.*;

public class HttpClient {

  // TODO: fields, GPT gen, 注意正确性
  private static final String SERVER_URL = "http://localhost:8080"; // 服务器URL
  private Socket socket; // 与服务器的Socket连接
  private PrintWriter out; // 输出流
  private BufferedReader in; // 输入流
  public static Stack<HttpRequest> requests = new Stack<>();

  /**
   * @description: 1. 把request压栈
   *               <p>
   *               2. 把request转换成String格式，严格按照报文的结构（注意空格和CRLF）
   *               <p>
   *               3. 把String用socket发过去
   * 
   * @param {HttpRequest} request
   * @return {*}
   */
  public boolean sendRequest(HttpRequest request) {
    // TODO:把request

    return false;
  }
}
