public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 13", "Apple");
        iPhonePro meuIphonePro = new iPhonePro("iPhone 15 Pro", "Apple");

        // Teste do iPhone normal
        System.out.println("Modelo: " + meuIphone.getModelo() + " | Fabricante: " + meuIphone.getFabricante());
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.ligar("11987654321");
        meuIphone.exibirPagina("https://www.google.com");

        // Teste do iPhone Pro
        System.out.println("\nModelo: " + meuIphonePro.getModelo() + " | Fabricante: " + meuIphonePro.getFabricante());
        meuIphonePro.usarFaceID();
    }
}
