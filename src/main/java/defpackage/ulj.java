package defpackage;

/* renamed from: ulj */
public final class ulj extends ulu {
    public long a;
    public long[] b;

    ulj(ulo ulo) {
        super(ulo);
    }

    public final void a(ulh ulh) {
        ulh a = ulh.a(a());
        super.a(a);
        int d = (int) a.d();
        this.b = new long[d];
        this.a = a.f();
        for (int i = 0; i < d; i++) {
            this.b[i] = a.d();
        }
        a.b(a.g());
        ulh.a(a);
    }
}
