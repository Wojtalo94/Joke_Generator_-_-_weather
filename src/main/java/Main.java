import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ChuckNorrisQuotes generator = new ChuckNorrisQuotes();
        System.out.println("Joke " + generator.getRandomQuote());

        Document document = Jsoup.connect("https://pogoda.onet.pl/prognoza-pogody/krakow-306020").get();
        JOptionPane.showMessageDialog(null, "The temperature in Krakow is " + document.getElementsByClass("temp").first().text()+ " C");
    }

}
