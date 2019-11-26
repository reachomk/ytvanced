package defpackage;

/* renamed from: ztr */
final class ztr implements zsn {
    private final /* synthetic */ ztk a;

    ztr(ztk ztk) {
        this.a = ztk;
    }

    public final void a() {
        this.a.b();
    }

    public final void b() {
        arqk arqk = (arqk) ((anxo) this.a.a.toBuilder());
        ztk ztk = this.a;
        boolean z = ((arqh) arqk.instance).f;
        arqk.copyOnWrite();
        arqh arqh = (arqh) arqk.instance;
        arqh.a |= 128;
        arqh.f = z ^ 1;
        ztk.a = (arqh) ((anxl) arqk.build());
    }

    public final void c() {
        this.a.a();
    }
}
