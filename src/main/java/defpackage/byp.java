package defpackage;

import java.io.IOException;

/* renamed from: byp */
final class byp implements bsv {
    private final String a;
    private final byq b;
    private Object c;

    byp(String str, byq byq) {
        this.a = str;
        this.b = byq;
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
        } catch (IllegalArgumentException e) {
            bsy.a(e);
        }
    }

    public final void a() {
        try {
            this.b.a(this.c);
        } catch (IOException unused) {
        }
    }

    public final Class d() {
        return this.b.a();
    }
}
