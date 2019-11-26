package defpackage;

/* renamed from: acnj */
final /* synthetic */ class acnj implements Runnable {
    private final acnc a;
    private final int b;
    private final boolean c;
    private final int d;

    acnj(acnc acnc, int i, boolean z, int i2) {
        this.a = acnc;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final void run() {
        acnc acnc = this.a;
        int i = this.b;
        boolean z = this.c;
        int i2 = this.d;
        if (acnc.bb) {
            acnc.a(i - 1, z, acnc.ah(), i2);
        }
    }
}
