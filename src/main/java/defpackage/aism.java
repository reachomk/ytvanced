package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: aism */
public final class aism implements xhs {
    private final xci a;
    private final WeakReference b;
    private final aaaf c = new aaaf();
    private final aaac d = new aaac();

    aism(xci xci, acxt acxt) {
        this.a = xci;
        this.b = new WeakReference(acxt);
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        this.a.d(this.c);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.c.g);
        }
    }

    public final void d() {
        this.a.d(this.d);
        if (this.b.get() != null) {
            ((acxt) this.b.get()).a(this.d.g);
        }
    }
}
