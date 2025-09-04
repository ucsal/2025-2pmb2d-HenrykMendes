package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender MS;
	
    public EmailNotifier() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            this.MS = new TestMailSender();
        } else {
            this.MS = new SmtpClient();
        }
    }

	public void welcome(User user) {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
		}
		MS.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
