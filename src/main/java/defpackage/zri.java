package defpackage;

/* renamed from: zri */
final /* synthetic */ class zri implements Runnable {
    private final zrg a;

    zri(zrg zrg) {
        this.a = zrg;
    }

    public final void run() {
        this.a.as.getLooper().quit();
    }
}
