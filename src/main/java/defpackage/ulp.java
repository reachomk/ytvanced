package defpackage;

/* renamed from: ulp */
final class ulp extends ulu {
    private final int[] a = new int[9];

    ulp(ulo ulo) {
        super(ulo);
    }

    public final void a(ulh ulh) {
        ulh a = ulh.a(a());
        super.a(a);
        int i = this.c;
        if (i == 0) {
            a.b();
            a.b();
            a.b();
            a.b(4);
            a.b();
        } else if (i == 1) {
            a.d();
            a.d();
            a.b();
            a.b(4);
            a.d();
        } else {
            throw new ult("Invalid atom version");
        }
        a.b(8);
        a.a();
        a.a();
        a.a();
        a.b(2);
        for (i = 0; i < 9; i++) {
            this.a[i] = a.c();
        }
        a.b();
        a.b();
        a.b(a.g());
        ulh.a(a);
    }
}
