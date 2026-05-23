import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class GerenciadorPlaylistTest {
    @Test
    public void deveContarMusicasOffline() {
        Playlist playlist = new Playlist(
                new Musica("Song 1", true),
                new Musica("Song 2", true),
                new Musica("Song 3", false),
                new Musica("Song 4", true)
        );

        assertEquals(3, GerenciadorPlaylist.contarMusicasOffline(playlist).intValue());
    }

    @Test
    public void deveContarTotalMusicas() {
        Playlist playlist = new Playlist(
                new Musica("Song 1", true),
                new Musica("Song 2", true),
                new Musica("Song 3", false),
                new Musica("Song 4", true)
        );

        assertEquals(4, GerenciadorPlaylist.contarTotalMusicas(playlist).intValue());
    }
}
