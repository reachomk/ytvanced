package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: mvl */
final class mvl {
    public static final mvl a = new mvl(null);
    private final WeakReference b;
    private nhb c;
    private boolean d = false;

    public mvl(ndi ndi) {
        this.b = new WeakReference(ndi);
    }

    public final synchronized boolean a(ndi ndi) {
        return amqq.a(this.b.get(), ndi);
    }

    public final synchronized void a(nhb nhb) {
        if (!nhb.equals(this.c)) {
            ndi ndi = (ndi) this.b.get();
            if (ndi == null) {
                return;
            }
            if (!this.d || nhb.a != 1) {
                int i = nhb.a;
                if (i == 1) {
                    this.d = true;
                } else if (i == 5) {
                    this.d = false;
                }
                ndi.b.post(new ndo(ndi, nhb.d));
                ndi.b.post(new ndl(ndi, nhb.a, nhb.b, nhb.c));
                this.c = nhb;
            }
        }
    }

    public final synchronized void a() {
        nhb nhb = this.c;
        a(new nhb(5, nhb != null ? nhb.b : null, Long.MIN_VALUE, 0));
    }
}
