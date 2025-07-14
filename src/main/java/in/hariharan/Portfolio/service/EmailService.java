package in.hariharan.Portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
  
	
	@Autowired
	private JavaMailSender mailSender;
	public void sendContactMail(String name,String email,String subject, String message) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("hari6064717@gmail.com");
		mail.setSubject("New Contact Message"+subject);
		mail.setText("From:"+name+ "\nEmail:"+email+"\n\nMessage:\n"+message);
		mailSender.send(mail);
	}
	
	
}
