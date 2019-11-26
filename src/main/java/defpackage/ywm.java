package defpackage;

/* renamed from: ywm */
public final /* synthetic */ class ywm implements Runnable {
    private final ywk a;
    private final ykk b;
    private final ymo c;

    public ywm(ywk ywk, ykk ykk, ymo ymo) {
        this.a = ywk;
        this.b = ykk;
        this.c = ymo;
    }

    public final void run() {
        ywk ywk = this.a;
        ykk ykk = this.b;
        ymo ymo = this.c;
        aaea b = ywk.b.b();
        String str = ykk.a;
        ymo.b(false);
        ymo.a(false);
        b.a(str, aadu.a("technodrome_metadata", (anxl) ymo.build())).a();
    }
}
