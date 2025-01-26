import java.util.*;
public class SystemProperties {
    public static void main(String[] args) {
        // javac .\SystemProperties.java
        // java -D"pencil_color=GREEN" SystemProperties os.arch os.version java.class.path java.lang.version java.specification.version
        System.out.println(System.getProperty("pencil_color"));
        for(int i=0;i<args.length;i++) {
            System.out.println(System.getProperty(args[i]));
        }
    }
}