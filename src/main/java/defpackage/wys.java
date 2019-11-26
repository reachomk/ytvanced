package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: wys */
final /* synthetic */ class wys implements FilenameFilter {
    public static final FilenameFilter a = new wys();

    private wys() {
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".cache");
    }
}
