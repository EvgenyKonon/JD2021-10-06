package by.it.drankevich.jd02_06;

import java.io.File;

public class Filenames {
    private Filenames() {}

    public static String getFullPath(Class<?> classstructure, String filename) {
        String name= classstructure.getName().replace(classstructure.getSimpleName(),"")
                .replace(".", File.separator);

        return System.getProperty("user.dir")+ File.separator+"src"+File.separator+name + filename;
    }
}
