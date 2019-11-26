package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: altu */
final /* synthetic */ class altu implements FilenameFilter {
    public static final FilenameFilter a = new altu();

    private altu() {
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".tmp") || str.endsWith(".rm");
    }
}
