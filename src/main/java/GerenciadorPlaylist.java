import java.util.Iterator;

public class GerenciadorPlaylist {
    public static Integer contarMusicasOffline(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.isBaixadaOffline()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicas(Playlist playlist) {
        int quantidade = 0;
        for (Iterator<Musica> m = playlist.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }
}
