package defpackage;

/* renamed from: bdaa */
final class bdaa extends bcum {
    private final bcum a;
    private final bcvq b;
    private boolean c;

    public bdaa(bcum bcum, bcvq bcvq) {
        this.a = bcum;
        this.b = bcvq;
    }

    public final void a(Object obj) {
        try {
            obj = this.b.a(obj);
            this.a.a(obj);
        } catch (Throwable th) {
            bcva.b(th);
            b();
            a(bcvh.a(th, obj));
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            bdeh.a(th);
            return;
        }
        this.c = true;
        this.a.a(th);
    }
}
