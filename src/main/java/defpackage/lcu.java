package defpackage;

import android.provider.Settings.System;

/* renamed from: lcu */
final class lcu implements exv {
    private final ldh a;
    private final bdfu b = new bdfu();
    private final /* synthetic */ lcs c;

    public final void a() {
        if (foh.x(this.c.d)) {
            bdfu bdfu = this.b;
            ajam ajam = this.c.f;
            bdfu.a(ajam.Q().a.f().a(emg.a(this.c.d, 256, 1)).a(new lcx(this.c), lcw.a), ajam.a(lcz.a, lcy.a).f().a(emg.a(this.c.d, 256, 0)).a(new ldb(this.c), lda.a), ajam.a(ldd.a, ldc.a).f().a(emg.a(this.c.d, 256, 1)).a(new ldf(this.c), lde.a));
        } else {
            Object obj = this.c;
            obj.e.a(obj);
        }
        this.c.b.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.a);
        this.c.e();
    }

    public final void b() {
        if (foh.x(this.c.d)) {
            this.b.a();
        } else {
            lcs lcs = this.c;
            lcs.e.b(lcs);
        }
        this.c.b.getContentResolver().unregisterContentObserver(this.a);
    }

    /* synthetic */ lcu(lcs lcs) {
        this.c = lcs;
        this.a = new ldh(lcs, lcs.c);
    }
}
