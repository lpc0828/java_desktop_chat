package com.pengcheng.chat.server;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @version V1.0.0
 * @author: <a href="mailto:pengcheng.liu0828@gmail.com">pc.liu</a>.
 * @since: 2017/2/26.
 */
public class ChatServerFrame extends JFrame {

    private JPanel jPanel1;
    private JLabel jLabel11;
    private JLabel jLabel12;

    private JLabel jLabel121;
    private JTextField jTextField121;
    private JButton jButton121;

    private JPanel jPanel3;
    private JTextField jTextField31;
    private JScrollPane jScrollPane31;


    private void initCompnent() {
        jPanel1 = new JPanel();
        jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
        jLabel11 = new JLabel("服务器状态");
        jLabel12 = new JLabel("停止");


    }


    public ChatServerFrame() {

    }

}
