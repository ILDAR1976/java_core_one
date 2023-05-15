package basic_1;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Converter {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("F:\\projects\\java\\AtQ\\Theorems_and_Tasks" +
                "\\source\\basic_1\\source.txt");

        Stream<String> sourceFromFile = Files.lines(Paths.get(sourceFile.getAbsolutePath()));

        StringBuilder outString = new StringBuilder();
        outString.append("Z = left lbrace stack { "+ "\r\n");
        var stream = sourceFromFile.collect(Collectors.toList()).stream().map(s -> {

            s = (s.length() != 0)? s.replaceAll("\\+","\"+\"")
                    .replaceAll("\\#","\"#\"").replaceAll("->","rightarrow") + " ,#":"";
            return s;
        });

        for (var e:stream.collect(Collectors.toList())) {
            outString.append(e.toString() + "\r\n");
        }

        outString.append("\r\n" + " } right none");
        System.out.println(outString);

    }
}
