public non-sealed class iPhonePro extends iPhone {
    public iPhonePro(String modelo, String fabricante) {
        super(modelo, fabricante);
    }

    public void usarFaceID() {
        System.out.println("🔓 Desbloqueando com Face ID...");
    }
}
