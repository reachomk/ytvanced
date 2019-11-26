package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: bcv */
final class bcv implements bca {
    private final WeakReference a;

    public bcv(bcw bcw) {
        this.a = new WeakReference(bcw);
    }

    public final void b(Object obj, int i) {
        bcw bcw = (bcw) this.a.get();
        if (bcw != null) {
            bcx bcx = bcw.b;
            if (bcx != null) {
                bcx.b(i);
            }
        }
    }

    public final void a(Object obj, int i) {
        bcw bcw = (bcw) this.a.get();
        if (bcw != null) {
            bcx bcx = bcw.b;
            if (bcx != null) {
                bcx.a(i);
            }
        }
    }
}
