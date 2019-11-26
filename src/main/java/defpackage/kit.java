package defpackage;

/* renamed from: kit */
final /* synthetic */ class kit implements Runnable {
    private final kip a;
    private final String b;
    private final aysn c;

    kit(kip kip, String str, aysn aysn) {
        this.a = kip;
        this.b = str;
        this.c = aysn;
    }

    public final void run() {
        kip kip = this.a;
        String str = this.b;
        aysn aysn = this.c;
        fno fno = (fno) kip.a.e.get(str);
        if (fno == null) {
            return;
        }
        if ((aysn.a & 1) != 0) {
            auvr auvr = aysn.b;
            if (auvr == null) {
                auvr = auvr.c;
            }
            if ((auvr.a & 1) != 0) {
                auvr = aysn.b;
                if (auvr == null) {
                    auvr = auvr.c;
                }
                auvn auvn = auvr.b;
                if (auvn == null) {
                    auvn = auvn.l;
                }
                fno.c = auvn;
                return;
            }
            return;
        }
        fno.c = null;
    }
}
