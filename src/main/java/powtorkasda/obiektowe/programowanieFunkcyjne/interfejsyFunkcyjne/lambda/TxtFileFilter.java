package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.lambda;

import java.io.File;

public class TxtFileFilter implements FileFilter{
    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".txt");
    }
}
