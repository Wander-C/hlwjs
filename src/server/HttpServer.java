/*
 * @Description: 专门负责与client的链接与交互
 */
package src.server;

import java.io.*;
import java.net.*;
import java.net.http.HttpRequest;
import java.util.concurrent.*;

import src.common.Utils;
import src.server.handlers.*;

public class HttpServer {
  private ServerSocket serverSocket;
  private ExecutorService threadPool; // 和频繁开Thread相比更方便管理
  private boolean isLong;

  public static void main(String[] args) {
    try {
      HttpServer server = new HttpServer(8080); // 在8080端口启动服务器
      server.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * @description: 初始化field
   * @return {*}
   */
  public HttpServer(int port) throws IOException {
    serverSocket = new ServerSocket(port);
    threadPool = Executors.newCachedThreadPool();
  }

  /**
   * @description: server主循环，监听是否有client连接，连接后开新线程处理client事项
   *               TODO:以及可能需要处理一些错误码(在handler之外)，比如500？
   * @return {*}
   */
  public void start() {
    Utils.LOG("Server started");
    while (true) {
      try {
        Socket clientSocket = serverSocket.accept();
        Utils.LOG("new client found");
        threadPool.submit(new ClientHandler(clientSocket));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * @description: 释放资源
   *               TODO:在合适的地方调用它
   * @return {*}
   */
  public void stop() throws IOException {
    serverSocket.close();
    threadPool.shutdown();
  }

  private static class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
      this.clientSocket = socket;
    }

    /**
     * @description: 服务器连接上客户端后要做的事情。steps:
     *               <p>
     *               1. 接收客户端发送的信息;
     *               <p>
     *               2. 根据请求行判断是GET还是POST，并看情况调用GetHandler或者PostHandler,
     *               构建响应报文
     */
    @Override
    public void run() {
      try {
        // TODO:接受clientSocket的输出流的String,这是严格按照http格式的报文
        // 调用parseRequest方法，解析这个完整格式的报文
        HttpRequest request;
        

        // 关闭连接
        if (!isLong) {
          clientSocket.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
