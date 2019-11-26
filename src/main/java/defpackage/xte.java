package defpackage;

/* renamed from: xte */
public final /* synthetic */ class xte implements Runnable {
    private final xtb a;

    public xte(xtb xtb) {
        this.a = xtb;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (IllegalStateException e) {
            xtl.a("GooglePlayProviderInstaller failed.", e);
        }
    }
}
