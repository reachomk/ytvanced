package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: xsz */
final /* synthetic */ class xsz implements FileFilter {
    public static final FileFilter a = new xsz();

    private xsz() {
    }

    public final boolean accept(File file) {
        return file.getAbsolutePath().contains("_cleanup_mv");
    }
}
