import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import api.SearchEngine;

public class SearchEngineTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/data/Data.txt", numLinesToSkip = 1)
    void SearchSongBySongName(String songName, String artist) {
        SearchEngine searchEngine = new SearchEngine(songName);
        System.out.print(searchEngine.response());
        Assertions.assertFalse(searchEngine.response().toLowerCase().contains(artist.toLowerCase()));
    }
}
