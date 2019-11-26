package defpackage;

/* renamed from: ahmu */
final /* synthetic */ class ahmu implements Runnable {
    private final ahmt a;
    private final boolean b;

    ahmu(ahmt ahmt, boolean z) {
        this.a = ahmt;
        this.b = z;
    }

    public final void run() {
        ahmt ahmt = this.a;
        boolean z = this.b;
        ahmw ahmw = ahmt.k;
        if (ahmw != null) {
            int i = 0;
            if (!z) {
                ahmw.setProgress(0);
            }
            ahmw ahmw2 = ahmt.k;
            if (z) {
                i = 8;
            }
            ahmw2.setVisibility(i);
        }
    }
}
