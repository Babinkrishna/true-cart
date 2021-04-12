package com.nit.web.utils;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private JavaMailSender javaMailSender;
	private MailContentBuilder mailContentBuilder;
	private String[] variables;
	private String[] recipients;
	private String[] carbonCopy;
	private String[] blindCarbonCopy;
	private Map<String, Object> messageVariables;

	private Integer i = 0;

	@Autowired
	public EmailService(JavaMailSender javaMailSender, MailContentBuilder mailContentBuilder

	) {
		this.javaMailSender = javaMailSender;
		this.mailContentBuilder = mailContentBuilder;
	}

	/**
	 * Sends unformatted emails
	 *
	 * @param from
	 * @param to
	 * @param cc
	 * @param bcc
	 * @param subject
	 * @param body
	 */
	@Async
	public void send(String from, String[] to, String[] cc, String[] bcc, String subject, String body) {

		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(from);
			message.setTo(to);
			message.setCc(cc);
			message.setBcc(bcc);
			message.setSubject(subject);
			message.setText(body);
			this.javaMailSender.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Sends HTML formatted Emails
	 *
	 * @param from
	 * @param to
	 * @param cc
	 * @param bcc
	 * @param subject
	 * @param message
	 * @param emailTemplate
	 */
	@Async
	public void sendFormattedMail(String from, String[] to, String[] cc, String[] bcc, String subject,
			Map<String, Object> message, String emailTemplate) {

		MimeMessagePreparator messagePreparator = mimeMessage -> {
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
			messageHelper.setFrom(from);
			messageHelper.setTo(to);
			messageHelper.setCc(cc);
			messageHelper.setBcc(bcc);
			messageHelper.setSubject(subject);
			String content = mailContentBuilder.build(message, emailTemplate);
			messageHelper.setText(content, true);
		};
		try {
			javaMailSender.send(messagePreparator);
		} catch (MailException e) {
			e.printStackTrace();
		}
	}
}
