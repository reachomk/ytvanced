package defpackage;

/* renamed from: bdfw */
public final class bdfw implements bcuo {
    public final bdbr a = new bdbr();

    public final boolean c() {
        return this.a.c();
    }

    public final void b() {
        this.a.b();
    }

    public final void a(bcuo bcuo) {
        if (bcuo != null) {
            bcuo bcuo2;
            bdbr bdbr = this.a;
            do {
                bcuo2 = (bcuo) bdbr.get();
                if (bcuo2 == bdbq.a) {
                    bcuo.b();
                    return;
                }
            } while (!bdbr.compareAndSet(bcuo2, bcuo));
            if (bcuo2 != null) {
                bcuo2.b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }
}
