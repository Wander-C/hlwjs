/*
 * @Description: 
 */
/*
 * @Description: 负责应用层用户的交互。
 */
package src.client;

import src.client.gui.LoginWindow;
import src.client.gui.MainWindow;
import src.client.gui.RegisterWindow;
import javax.swing.*;

public class ClientApp {
  private HttpClient httpClient;

  public static void main(String[] args) {
    ClientApp app = new ClientApp();
    app.start();
  }

  public ClientApp() {
    httpClient = new HttpClient();
  }

// TODO:把调出窗口的方法抽象到一个类里面

  /**
   * @description: 客户端运行时的操作函数。只是把login窗口显示出来，剩下的逻辑交给窗口。(GPT gen)
   * @return {*}
   */  
  public void start() {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        // TODO:长连接
        // 显示登录窗口
        new LoginWindow(httpClient, new ClientApp()).setVisible(true);
      }
    });
  }

  /**
   * @description: 登录成功后进入窗口。(GPT gen)
   * @return {*}
   */
  public void showMainWindow() {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        // 显示主界面
        new MainWindow(httpClient).setVisible(true);
      }
    });
  }

  /**
   * @description: 在login窗口中点击注册后会唤起的函数，显示注册窗口。（GPT gen）
   * @return {*}
   */
  public void showRegisterWindow() {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        // 显示注册窗口
        new RegisterWindow(httpClient).setVisible(true);
      }
    });
  }

}
