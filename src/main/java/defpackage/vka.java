package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vka */
public final class vka {
    public final String a;
    public final vsm b;
    public final int c;
    public final vjz d;
    public final vkc e;
    public final aakj f;
    public final AtomicReference g;
    private final AtomicReference h;
    private final boolean i;

    public vka(String str, vsm vsm, int i, aakj aakj, vkc vkc, boolean z, vqy vqy, aett aett) {
        Object vjz = new vjz();
        this.a = xvd.a(str);
        this.b = (vsm) amqw.a((Object) vsm);
        this.c = i;
        this.f = (aakj) amqw.a((Object) aakj);
        this.d = (vjz) amqw.a(vjz);
        this.e = (vkc) amqw.a((Object) vkc);
        this.i = z;
        this.h = new AtomicReference(vqy);
        this.g = new AtomicReference(aett != null ? new vkd(aett, aett) : null);
    }

    public final boolean a() {
        return this.i && this.f.n().aq();
    }

    public final vkd b() {
        return (vkd) this.g.get();
    }

    public final vqy c() {
        return (vqy) this.h.get();
    }

    public final void a(vqy vqy) {
        this.h.set(vqy);
    }
}
