package br.com.ravelino.login.client.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import br.com.ravelino.login.client.LoginPciRequest;
import br.com.ravelino.login.client.RetornoSegurancaWSVO;

public class LoginClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(LoginClient.class);
	
	
	public RetornoSegurancaWSVO login(String usuario, String senha) {

	    LoginPciRequest request = new LoginPciRequest();
	    //request.setName(country);
	    request.setNmUsuario(usuario);
	    request.setSnUsuario(senha);
	    request.setCdSistema("");
	    request.setIpUsuario("");

	    log.info("LoginPciRequest: " + request);
	    
	    SoapActionCallback callback = new SoapActionCallback("loginPCI");

	    RetornoSegurancaWSVO response = (RetornoSegurancaWSVO)
	    		getWebServiceTemplate()
	    			.marshalSendAndReceive("http://localhost:8080/login", request, callback);

	    return response;
	  }
	
}
