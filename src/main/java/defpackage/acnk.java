package defpackage;

/* renamed from: acnk */
final /* synthetic */ class acnk implements Runnable {
    private final acnc a;

    acnk(acnc acnc) {
        this.a = acnc;
    }

    public final void run() {
        acnc acnc = this.a;
        acnc.au.setVisibility(8);
        acnc.bd = true;
        Runnable runnable = acnc.be;
        if (runnable != null) {
            runnable.run();
        }
    }
}
