package defpackage;

/* renamed from: afaa */
final /* synthetic */ class afaa implements Runnable {
    private final aezw a;
    private final aezf b;

    afaa(aezw aezw, aezf aezf) {
        this.a = aezw;
        this.b = aezf;
    }

    public final void run() {
        aezw aezw = this.a;
        aezw.a.post(new afac(aezw, this.b));
    }
}
