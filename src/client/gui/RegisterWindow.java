/*
 * @Description: 注册界面的UI
 */
package src.client.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.client.HttpClient;

public class RegisterWindow extends JFrame {
  // TODO：field gen by GPT, 请仔细检查正确性
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton registerButton;
  private HttpClient httpClient;

  public RegisterWindow(HttpClient httpClient) {
    // TODO:初始化field，初始化组件，把组件添加到窗口

    /**
     * @description: 调用httpClient.sendRegisterRequest()向server发送报文，把帐号密码存到server
     * @return {*}
     */
    class registerButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    }
    registerButton.addActionListener(new registerButtonListener());
  }
}
