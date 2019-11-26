package defpackage;

/* renamed from: uln */
final class uln extends ulu {
    private final int[] a = new int[9];

    uln(ulo ulo) {
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
            a.b();
        } else if (i == 1) {
            a.d();
            a.d();
            a.b();
            a.d();
        } else {
            throw new ult("Invalid atom version");
        }
        a.c();
        a.a();
        a.b(10);
        for (i = 0; i < 9; i++) {
            this.a[i] = a.c();
        }
        a.b(24);
        a.b();
        a.b(a.g());
        ulh.a(a);
    }
}
