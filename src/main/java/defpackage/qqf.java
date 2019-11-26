package defpackage;

import java.io.File;

/* renamed from: qqf */
public final class qqf {
    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                qqf.a(a);
            }
        }
        return file.delete();
    }
}
