package powtorkasda.obiektowe.watki.bykowskiu;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//16347

public class OtoDom {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();

        ExecutorService service = Executors.newFixedThreadPool(30);
        URL otodom = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/sopot/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        in.close();

        String content = stringBuilder.toString();

        Set<String> listOfLinks = new TreeSet<>();

        for (int i = 0; i < content.length(); i++) {
             i = content.indexOf("https://www.otodom.pl/pl/oferta/", i);
             if(i < 0)
                 break;
            String substring = content.substring(i);
            String link = substring.split(".html")[0];
            readWebsite(link, i + ".html");
            listOfLinks.add(link);
        }

        for (int i = 0; i < listOfLinks.size(); i++) {
           final int finalI = i ;
            service.submit(() -> {
                try {
                    readWebsite(listOfLinks.toArray()[finalI].toString(), finalI + ".html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        service.shutdown();
        long end = System.currentTimeMillis();

        listOfLinks.forEach(System.out::println);
        System.out.println(listOfLinks.size());
        System.out.println(end - start);

    }
    public static void readWebsite(String link, String fileName) throws IOException {
        URL otodom = new URL(link);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }

        in.close();

             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
             bw.write(stringBuilder.toString());
             bw.close();

    }
}
