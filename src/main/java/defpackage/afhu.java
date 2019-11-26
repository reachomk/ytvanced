package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: afhu */
final class afhu implements FilenameFilter {
    afhu() {
    }

    public final boolean accept(File file, String str) {
        int i;
        if (str.equals("cached_content_index.exi") || afhs.a.matcher(str).matches() || afhs.b.matcher(str).matches() || afhs.c.matcher(str).matches()) {
            i = 1;
        } else {
            i = 0;
        }
        return i ^ 1;
    }
}
