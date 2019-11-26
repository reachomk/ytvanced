package defpackage;

/* renamed from: afkk */
final /* synthetic */ class afkk implements Runnable {
    private final afki a;

    afkk(afki afki) {
        this.a = afki;
    }

    public final void run() {
        this.a.setKeepScreenOn(false);
    }
}
