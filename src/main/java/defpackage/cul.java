package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: cul */
final class cul implements FileFilter {
    cul() {
    }

    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i = 3; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
