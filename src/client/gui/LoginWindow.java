/*
 * @Description: 登录界面的UI
 */
package src.client.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.HttpRequest;

import src.client.HttpClient;
import src.client.ClientApp;

public class LoginWindow extends JFrame {

  // TODO：field gen by GPT, 请仔细检查正确性
  private JTextField usernameField; // 用户名输入框
  private JPasswordField passwordField; // 密码输入框
  private JButton loginButton; // 登录按钮
  private JButton registerButton; // 注册按钮
  private HttpClient httpClient; // HttpClient 实例
  private ClientApp clientApp; // 客户端应用程序实例

  /**
   * @description: 构造函数。初始化窗口的元素并合适地排列。设定login和register按钮的行为。
   */
  public LoginWindow(HttpClient httpClient, ClientApp clientApp) {
    // TODO:初始化field，初始化窗口行为，初始化组件，把组件添加到窗口

    /**
     * @description: 调用httpClient.sendLoginRequest，如果返回值为真，调出主界面。
     *               TODO: 这个方法的代码可能有错，请仔细检查！
     */
    class LoginButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO:把报文组织成HttpRequest实例，传给sendRequest

        // TODO:如果login请求报文得到了一个200 OK的回应报文，就...
        if (null) {
          dispose(); // 似乎是关闭当前窗口
          clientApp.showMainWindow();
        } else {
          // TODO: 请完善！（显示失败画面，完善重新回到login窗口的逻辑？）
        }
      }
    }
    loginButton.addActionListener(new LoginButtonListener());

    /**
     * @description: 调出注册窗口
     * @return {*}
     */
    class registerButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose(); // 似乎是关闭当前窗口
        clientApp.showRegisterWindow();
      }
    }
    registerButton.addActionListener(new registerButtonListener());
  }
}
