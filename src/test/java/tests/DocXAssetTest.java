package tests;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readDocxFile;

public class DocXAssetTest {

    @Test
    void docxAssertTest() throws IOException {
        String docFilePath = "./src/test/resources/files/1.docx";
        String expectedText = "I am a computer programmer";

        String actualData = readDocxFile(docFilePath);
        assertThat(actualData, containsString(expectedText));
    }
}