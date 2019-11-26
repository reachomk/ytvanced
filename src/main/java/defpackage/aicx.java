package defpackage;

/* renamed from: aicx */
final /* synthetic */ class aicx implements Runnable {
    private final aicw a;
    private final aygk b;

    aicx(aicw aicw, aygk aygk) {
        this.a = aicw;
        this.b = aygk;
    }

    public final void run() {
        aicw aicw = this.a;
        aygk aygk = this.b;
        aidk aidk = aicw.d;
        if (aidk != null) {
            aidk.a(aygk);
            aicw.d.a(true);
            aicw.g = true;
        }
    }
}
