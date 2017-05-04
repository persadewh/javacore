package com.ray.mail;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author : ray
 * @date : 2017年5月4日
 * 使用javamail测试简单的邮件发送功能
 */
public class SendMailTest {

	public static final String MAILSERVER = "*********";
	
	public static final String USER = "*********";
	public static final String PWD = "*********";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 创建参数配置, 用于连接邮件服务器的参数配置
		Properties props = new Properties();                    // 参数配置
		props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
		props.setProperty("mail.smtp.host", MAILSERVER);   // 发件人的邮箱的 SMTP 服务器地址
		props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
		
		// 2. 根据配置创建会话对象, 用于和邮件服务器交互
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);                                 // 设置为debug模式, 可以查看详细的发送 log

		// 3. 创建一封邮件
		MimeMessage message = new MimeMessage(session);
		try 
		{
			message.setFrom(new InternetAddress(USER, "ray", "UTF-8"));
			message.setRecipient(RecipientType.TO, new InternetAddress(USER, "ray", "UTF-8"));
			message.setSubject("测试邮件", "UTF-8");
			message.setContent("TEST这是邮件正文...", "text/html;charset=UTF-8");
			message.setSentDate(new Date());
			message.saveChanges();
		
		// 4. 根据 Session 获取邮件传输对象
			Transport transport = session.getTransport();
			transport.connect(USER, PWD);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
