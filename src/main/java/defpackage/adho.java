package defpackage;

/* renamed from: adho */
final class adho implements adqi {
    private final /* synthetic */ adhk a;

    adho(adhk adhk) {
        this.a = adhk;
    }

    public final void a(adqe adqe) {
        this.a.b = true;
    }

    public final void b(adqe adqe) {
        adhk adhk = this.a;
        adhk.b = true;
        adhk.b();
    }

    public final void c(adqe adqe) {
        adhk adhk = this.a;
        adhk.b = false;
        adhk.b();
    }
}
