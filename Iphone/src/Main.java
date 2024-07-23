public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");
        reprodutor.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("+55 123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
