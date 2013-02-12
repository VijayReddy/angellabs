/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package co.angellabs.mailsrvices.basic;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author admin
 */
public class SmtpAuthenticator extends Authenticator {
	private String username;
	private String password;

	public SmtpAuthenticator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
	}
}
