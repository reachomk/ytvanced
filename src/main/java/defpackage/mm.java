package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: mm */
final class mm implements FileFilter {
    private final /* synthetic */ String a;

    mm(String str) {
        this.a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        return (name.startsWith(this.a) || name.equals("MultiDex.lock")) ? false : true;
    }
}
