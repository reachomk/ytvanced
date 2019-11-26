package defpackage;

/* renamed from: afzz */
final /* synthetic */ class afzz implements Runnable {
    private final afzs a;
    private final String b;
    private final String c;

    afzz(afzs afzs, String str, String str2) {
        this.a = afzs;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        afzs afzs = this.a;
        ((agci) afzs.p.get()).a(this.b, this.c, agqq.OFFLINE_IMMEDIATELY, agqf.ACTIVE);
    }
}
