package br.com.mariojp.solid.dip;

public class TestMailSender implements MailSender {
	public void send (String to, String subject, String body){
        System.out.println("[NOOP] DRY_RUN ativo, email não enviado");
	}

}
