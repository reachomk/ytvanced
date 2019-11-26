package defpackage;

/* renamed from: ulq */
public final class ulq extends ulu {
    public long[] a;
    public long b;

    ulq(ulo ulo) {
        super(ulo);
    }

    public final void a(ulh ulh) {
        ulh a = ulh.a(a());
        super.a(a);
        int b = (int) a.b();
        this.a = new long[b];
        this.b = a.f();
        for (int i = 0; i < b; i++) {
            this.a[i] = a.b();
        }
        a.b(a.g());
        ulh.a(a);
    }
}
