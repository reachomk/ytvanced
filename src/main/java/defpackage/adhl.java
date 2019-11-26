package defpackage;

/* renamed from: adhl */
final class adhl implements adqh {
    private final /* synthetic */ adhk a;

    adhl(adhk adhk) {
        this.a = adhk;
    }

    public final void a() {
        adhk adhk = this.a;
        adhk.a = true;
        adhk.b();
    }

    public final void b() {
        adhk adhk = this.a;
        adhk.a = false;
        adhk.b();
    }

    public final void c() {
        adhk adhk = this.a;
        adhk.a = false;
        adhk.b();
    }

    public final void d() {
        adhk adhk = this.a;
        adhk.a = false;
        adhk.a(5000);
    }
}
