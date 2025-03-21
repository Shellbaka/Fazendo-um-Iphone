public sealed class iPhone extends Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
    permits iPhonePro {  

    public iPhone(String modelo, String fabricante) {
        super(modelo, fabricante);
    }

    @Override
    public void tocar() {
        System.out.println("🎵 Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸ Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("🎶 Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("📲 Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📩 Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("📑 Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 Atualizando página...");
    }
}
