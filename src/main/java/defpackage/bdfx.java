package defpackage;

/* renamed from: bdfx */
public final class bdfx implements bcuo {
    private final bdbr a = new bdbr();

    public final boolean c() {
        return this.a.c();
    }

    public final void b() {
        this.a.b();
    }

    public final void a(bcuo bcuo) {
        if (bcuo != null) {
            bdbr bdbr = this.a;
            bcuo bcuo2;
            do {
                bcuo2 = (bcuo) bdbr.get();
                if (bcuo2 == bdbq.a) {
                    bcuo.b();
                    return;
                }
            } while (!bdbr.compareAndSet(bcuo2, bcuo));
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }
}
