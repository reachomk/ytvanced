package defpackage;

/* renamed from: afdl */
final /* synthetic */ class afdl implements Runnable {
    private final afdi a;
    private final int b;
    private final int c;

    afdl(afdi afdi, int i, int i2) {
        this.a = afdi;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        afdi afdi = this.a;
        int i = this.b;
        int i2 = this.c;
        afkh afkh = afdi.a.u;
        if (afkh != null) {
            afkh.a(i, i2);
        }
    }
}
