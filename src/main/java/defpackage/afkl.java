package defpackage;

/* renamed from: afkl */
final /* synthetic */ class afkl implements Runnable {
    private final afki a;

    afkl(afki afki) {
        this.a = afki;
    }

    public final void run() {
        this.a.setKeepScreenOn(true);
    }
}
