package defpackage;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: agpv */
public final class agpv implements oww {
    public final String a;
    public final ovh b;
    private final oww c;

    public agpv(oww oww, String str) {
        ovy ovy = new ovy();
        amqw.a(oww != null);
        this.c = oww;
        this.a = str;
        this.b = ovy;
    }

    public final boolean a() {
        oww oww = this.c;
        if (!(oww instanceof oxu)) {
            return true;
        }
        try {
            ((oxu) oww).a();
            return true;
        } catch (owv unused) {
            return false;
        }
    }

    public final void b() {
        this.c.b();
    }

    public final NavigableSet a(String str) {
        return this.c.a(str);
    }

    public final Set c() {
        return this.c.c();
    }

    public final long d() {
        return this.c.d();
    }

    public final oxf b(String str, long j) {
        return this.c.b(str, j);
    }

    public final oxf a(String str, long j) {
        return this.c.a(str, j);
    }

    public final File a(String str, long j, long j2) {
        return this.c.a(str, j, j2);
    }

    public final void a(File file, long j) {
        this.c.a(file, j);
    }

    public final void a(oxf oxf) {
        this.c.a(oxf);
    }

    public final void b(oxf oxf) {
        this.c.b(oxf);
    }

    public final boolean b(String str, long j, long j2) {
        return this.c.b(str, j, j2);
    }

    public final void a(String str, oxq oxq) {
        this.c.a(str, oxq);
    }

    public final oxo b(String str) {
        return this.c.b(str);
    }
}
