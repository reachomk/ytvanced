package defpackage;

/* renamed from: afkf */
final /* synthetic */ class afkf implements Runnable {
    private final afkc a;

    afkf(afkc afkc) {
        this.a = afkc;
    }

    public final void run() {
        afkc afkc = this.a;
        if (!afkc.b) {
            afkc.removeView(afkc.a);
            afkc.addView(afkc.a, 0);
        }
    }
}
