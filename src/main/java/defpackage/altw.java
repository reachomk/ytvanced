package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: altw */
final /* synthetic */ class altw implements FileFilter {
    public static final FileFilter a = new altw();

    private altw() {
    }

    public final boolean accept(File file) {
        return file.getName().startsWith("BLOB_STORAGE");
    }
}
