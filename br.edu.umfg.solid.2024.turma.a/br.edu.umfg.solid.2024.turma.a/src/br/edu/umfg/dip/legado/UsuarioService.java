package br.edu.umfg.dip.legado;

public class UsuarioService {
    private final String EMAIL_PADRAO = "minha.empresa@email.com";

    private EmailService emailService;
    /*
    * A classe de alto nivel UsuarioService depende diretamente da classe de baixo nivel EmailService,
    * Isso cria um acoplamento rigido e dificulta a substituição do EmailService por outra implementação
    * */
    public UsuarioService(){
        this.emailService = new EmailService();
    }

    public void registrarUsuario(String email){
        String mensagem = "Bem vindo! Você foi registrado.";
        this.emailService.enviarEmail(this.EMAIL_PADRAO, email, mensagem);
    }
}
