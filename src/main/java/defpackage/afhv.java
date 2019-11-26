package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: afhv */
final class afhv implements FilenameFilter {
    afhv() {
    }

    public final boolean accept(File file, String str) {
        return afhs.a.matcher(str).matches() || afhs.b.matcher(str).matches();
    }
}
