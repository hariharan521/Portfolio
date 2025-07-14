package in.hariharan.Portfolio.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.hariharan.Portfolio.Repository.ContactRepository;
import in.hariharan.Portfolio.model.Contact;
import in.hariharan.Portfolio.service.EmailService;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository  contactRepository;
	
	@Autowired
	private EmailService emailService;
	@PostMapping("/contact")
	public String handleContact(@ModelAttribute Contact contact) {
		contactRepository.save(contact);
		emailService.sendContactMail(
				contact.getName(),
				contact.getEmail(),
				contact.getSubject(),
	            contact.getMessage());
		return "redirect:/#contact?success";
	}
	
}
