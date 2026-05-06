/*
 * @Description: 主界面的UI.
 */
package src.client.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import src.client.HttpClient;

public class MainWindow extends JFrame {
    private JTextArea messageArea; // 用于显示响应报文的区域
    private JTextField sendField; // 用于输入发送的报文：不要这样实现！实现成很多项，而不是一个大输入框，从而降低数据处理难度
    private JButton sendButton; // 发送按钮
    private HttpClient httpClient; // 用于与服务器通信的 HttpClient

    public MainWindow(HttpClient httpClient) {
      // TODO：初始化field, 布局好主界面。
      
      
      // TODO: 主界面发送报文的部分的逻辑：确定好主菜单里面sendButton的行为:组织成一个String类型的rawRequest，再调用HttpClient.sendRequest()

      // TODO: 主界面接收报文部分的逻辑：从socket的InputStream里面读取传过来的报文，显示在MainWindow的一个Area里面。具体的实现可以参考Head First Java的socket章节的例子

    }
}

