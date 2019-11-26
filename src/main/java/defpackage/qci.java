package defpackage;

import java.io.File;

/* renamed from: qci */
public final class qci {
    public final File a;
    public final File b;
    public final File c;

    public qci(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public final File a() {
        return this.a.getParentFile();
    }

    public final boolean b() {
        if (this.a.isFile()) {
            File file = this.b;
            if (file != null && file.isDirectory()) {
                return true;
            }
        }
        return false;
    }
}
