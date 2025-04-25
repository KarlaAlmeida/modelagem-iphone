
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Inicializando Correio de Voz");
    }

    public void exibirPagina(String url){
        System.out.println("Endereço da Página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando Página");
    }

}
