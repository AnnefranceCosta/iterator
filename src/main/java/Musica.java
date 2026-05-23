public class Musica {
    private String titulo;
    private boolean baixadaOffline;

    public Musica(String titulo, boolean baixadaOffline) {
        this.titulo = titulo;
        this.baixadaOffline = baixadaOffline;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isBaixadaOffline() {
        return baixadaOffline;
    }

    public void setBaixadaOffline(boolean baixadaOffline) {
        this.baixadaOffline = baixadaOffline;
    }
}
