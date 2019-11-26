package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: byy */
final class byy implements bsv {
    private final File a;
    private final byx b;
    private Object c;

    byy(File file, byx byx) {
        this.a = file;
        this.b = byx;
    }

    public final void b() {
    }

    public final int c() {
        return 1;
    }

    public final void a(bre bre, bsy bsy) {
        try {
            this.c = this.b.a(this.a);
            bsy.a(this.c);
        } catch (FileNotFoundException e) {
            bsy.a(e);
        }
    }

    public final void a() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.a(obj);
            } catch (IOException unused) {
            }
        }
    }

    public final Class d() {
        return this.b.a();
    }
}
