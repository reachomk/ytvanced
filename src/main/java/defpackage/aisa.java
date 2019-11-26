package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: aisa */
public final class aisa implements xhs {
    private final xci a;
    private final WeakReference b;
    private final zzz c = new zzz();
    private final zzw d = new zzw();
    private final zzx e = new zzx();
    private final zzu f = new zzu();

    aisa(xci xci, acxt acxt) {
        this.a = xci;
        this.b = new WeakReference(acxt);
    }

    public final void a() {
        this.a.d(this.c);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.c.g);
        }
    }

    public final void b() {
        this.a.d(this.d);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.d.g);
        }
    }

    public final void c() {
        this.a.d(this.e);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.e.g);
        }
    }

    public final void d() {
        this.a.d(this.f);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.f.g);
        }
    }
}
