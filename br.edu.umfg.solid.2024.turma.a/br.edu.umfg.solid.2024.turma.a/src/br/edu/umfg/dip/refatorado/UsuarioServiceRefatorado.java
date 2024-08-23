package br.edu.umfg.dip.refatorado;

import br.edu.umfg.dip.legado.UsuarioService;

//implementacao concreta
public class UsuarioServiceRefatorado{

    private final String EMAIL_PADRAO = "minha.empresa@email.com";
    private IEmailService emailService;

    public UsuarioServiceRefatorado(IEmailService emailService){
        this.emailService = emailService;

    }
    public void registrarUsuario(String email){
        String mensagem = "Bem Vindo! Voce foi registrado";
        this.emailService.enviarEmail(this.EMAIL_PADRAO, email, mensagem);
    }
}
