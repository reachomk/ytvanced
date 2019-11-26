package defpackage;

import android.os.Handler;

/* renamed from: ajml */
final /* synthetic */ class ajml implements Runnable {
    private final ajmm a;
    private final bcaa b;

    ajml(ajmm ajmm, bcaa bcaa) {
        this.a = ajmm;
        this.b = bcaa;
    }

    public final void run() {
        ajmm ajmm = this.a;
        ajmo ajmo = (ajmo) this.b.get();
        if (!ajmm.g) {
            long j;
            int i = (ajmm.c.b() < ajmm.f || ajlv.e(ajmo.a) != 2) ? aipo.a(ajmm.d).h ? 2 : 1 : 4;
            aeql h = ajmo.c.h();
            ajmo.d.a(ajmo.a, i, h.b(), h.a(), h.d());
            if (i == 4) {
                long b = ajmm.c.b();
                j = ajmm.f;
                if (b - j > 1000) {
                    ajmm.f = ajmm.c.b() + 1000;
                } else {
                    ajmm.f = j + 1000;
                }
            }
            Handler handler = ajmm.b;
            Runnable runnable = ajmm.a;
            j = ajmm.e;
            long j2 = 100;
            if (j > 0 && j <= 100) {
                j2 = j;
            }
            handler.postDelayed(runnable, j2);
            ajmm.e = Long.MAX_VALUE;
        }
    }
}
