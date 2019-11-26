package defpackage;

/* renamed from: zht */
final /* synthetic */ class zht implements Runnable {
    private final zhu a;

    zht(zhu zhu) {
        this.a = zhu;
    }

    public final void run() {
        zhu zhu = this.a;
        zhu.af.setOnClickListener(zhu);
        if (zhu.u()) {
            zhu.ad.a(zhu.b.c(), ((zhu.ap - zhu.ar) + 360) % 360);
        }
    }
}
