package defpackage;

/* renamed from: imi */
final class imi implements afsw {
    private final afsw a;
    private final /* synthetic */ ima b;

    public final void a(bqn bqn) {
        ima ima = this.b;
        int i = ima.c + 1;
        ima.c = i;
        if (i <= ima.d) {
            ima.a(ima.b, ima.a);
            ima ima2 = this.b;
            ima2.a(ima2.b);
            return;
        }
        ima.c = 0;
        this.a.a(bqn);
        this.b.b();
    }

    /* synthetic */ imi(ima ima, afsw afsw) {
        this.b = ima;
        this.a = afsw;
    }
}
