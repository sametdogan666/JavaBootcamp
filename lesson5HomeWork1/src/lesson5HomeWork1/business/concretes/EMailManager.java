package lesson5HomeWork1.business.concretes;

import lesson5HomeWork1.business.abstracts.EMailService;

public class EMailManager implements EMailService{

	@Override
	public void send() {
		System.out.println("Doğrulama linkiniz mail adresinize gönderilmiştir.");
		
	}

	@Override
	public void verify() {
		System.out.println("Mail adresiniz doğrulanmıştır.");
		
	}

}
