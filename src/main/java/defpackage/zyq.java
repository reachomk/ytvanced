package defpackage;

/* renamed from: zyq */
final /* synthetic */ class zyq implements Runnable {
    private final zyr a;

    zyq(zyr zyr) {
        this.a = zyr;
    }

    public final void run() {
        try {
            this.a.a.a();
        } catch (aanq e) {
            xtl.a("RefreshConfigCommandResolver", "Could not refresh the config: ", e);
        }
    }
}
