package defpackage;

import java.io.File;

/* renamed from: ebg */
final class ebg {
    public final File a;

    public ebg(File file) {
        this.a = file;
    }

    public final void a() {
        if (this.a.exists()) {
            this.a.delete();
        }
    }
}
