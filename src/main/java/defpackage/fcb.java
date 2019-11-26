package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import java.util.concurrent.TimeUnit;

/* renamed from: fcb */
public final class fcb implements ajan, albc, eib, ejc, t, xcp {
    public final aaas a;
    public fdl b;
    private final fbp c;
    private final Handler d;
    private final bcaa e;
    private final bcaa f;
    private final Object g = new Object();
    private volatile boolean h = false;
    private final fee i;
    private fdn j;
    private fdl k;
    private final xci l;
    private final ajam m;
    private final zyw n;
    private final bdfu o = new bdfu();

    public fcb(fbp fbp, aaas aaas, bcaa bcaa, Handler handler, bcaa bcaa2, fee fee, xci xci, ajam ajam, zyw zyw) {
        this.c = fbp;
        this.a = aaas;
        this.d = handler;
        this.e = bcaa;
        this.f = bcaa2;
        this.i = fee;
        this.l = xci;
        this.m = ajam;
        this.n = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final long e() {
        return 1;
    }

    public final void a(aybc aybc) {
        a(aybc, false);
    }

    /* JADX WARNING: Missing block: B:20:0x0070, code skipped:
            if (r1 != 0) goto L_0x0074;
     */
    public final void a(defpackage.aybc r8, boolean r9) {
        /*
        r7 = this;
        if (r8 == 0) goto L_0x0146;
    L_0x0002:
        r0 = new fbc;
        r0.<init>();
        r1 = 0;
        r0.a(r1);
        r0.d = r8;
        r2 = 1;
        r3 = java.lang.Boolean.valueOf(r2);
        r0.a = r3;
        r3 = java.lang.Boolean.valueOf(r1);
        r0.b = r3;
        r3 = java.lang.Boolean.valueOf(r1);
        r0.c = r3;
        r0.c(r2);
        r0.d(r2);
        r0.b(r1);
        r3 = r8.a;
        r4 = r3 & 1;
        r5 = 2;
        r6 = 0;
        if (r4 == 0) goto L_0x0085;
    L_0x0031:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0037;
    L_0x0035:
        r8 = defpackage.ayao.n;
    L_0x0037:
        r0.e = r8;
        r0.f = r6;
        r0.g = r6;
        r0.a(r2);
        r1 = r8.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x004b;
    L_0x0045:
        r6 = r8.d;
        if (r6 != 0) goto L_0x004b;
    L_0x0049:
        r6 = defpackage.arml.f;
    L_0x004b:
        r1 = defpackage.ajqy.a(r6);
        r0.h = r1;
        r1 = r8.k;
        r1 = defpackage.ayaq.a(r1);
        if (r1 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005b;
    L_0x005a:
        r1 = 1;
    L_0x005b:
        r0.c(r1);
        r1 = r8.a;
        r1 = r1 & 8192;
        if (r1 == 0) goto L_0x0073;
    L_0x0064:
        r1 = r8.l;
        if (r1 != 0) goto L_0x006a;
    L_0x0068:
        r1 = defpackage.ayay.c;
    L_0x006a:
        r1 = r1.b;
        r1 = defpackage.ayba.a(r1);
        if (r1 == 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0074;
    L_0x0073:
        r1 = 1;
    L_0x0074:
        r0.d(r1);
        r1 = r8.m;
        r0.b(r1);
        r8 = r8.f;
        if (r8 != 0) goto L_0x0082;
    L_0x0080:
        r8 = defpackage.apxu.d;
    L_0x0082:
        r0.i = r8;
        goto L_0x00f2;
    L_0x0085:
        r4 = r3 & 2;
        if (r4 != 0) goto L_0x00b7;
    L_0x0089:
        r1 = r3 & 8;
        if (r1 == 0) goto L_0x00f2;
    L_0x008d:
        r8 = r8.e;
        if (r8 != 0) goto L_0x0093;
    L_0x0091:
        r8 = defpackage.ayaa.h;
    L_0x0093:
        r0.g = r8;
        r0.e = r6;
        r0.f = r6;
        r1 = 3;
        r0.a(r1);
        r1 = r8.a;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x00a8;
    L_0x00a2:
        r6 = r8.b;
        if (r6 != 0) goto L_0x00a8;
    L_0x00a6:
        r6 = defpackage.arml.f;
    L_0x00a8:
        r1 = defpackage.ajqy.a(r6);
        r0.h = r1;
        r8 = r8.e;
        if (r8 != 0) goto L_0x00b4;
    L_0x00b2:
        r8 = defpackage.apxu.d;
    L_0x00b4:
        r0.i = r8;
        goto L_0x00f2;
    L_0x00b7:
        r8 = r8.c;
        if (r8 != 0) goto L_0x00bd;
    L_0x00bb:
        r8 = defpackage.axzw.k;
    L_0x00bd:
        r0.f = r8;
        r0.e = r6;
        r0.g = r6;
        r0.a(r5);
        r3 = r8.a;
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x00d1;
    L_0x00cb:
        r6 = r8.c;
        if (r6 != 0) goto L_0x00d1;
    L_0x00cf:
        r6 = defpackage.arml.f;
    L_0x00d1:
        r3 = defpackage.ajqy.a(r6);
        r0.h = r3;
        r3 = r8.i;
        r3 = defpackage.ayaq.a(r3);
        if (r3 == 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e1;
    L_0x00e0:
        r3 = 1;
    L_0x00e1:
        r0.c(r3);
        r0.d(r2);
        r0.b(r1);
        r8 = r8.e;
        if (r8 != 0) goto L_0x00f0;
    L_0x00ee:
        r8 = defpackage.apxu.d;
    L_0x00f0:
        r0.i = r8;
    L_0x00f2:
        r8 = r0.a();
        r0 = r8.d();
        if (r0 == 0) goto L_0x0146;
    L_0x00fc:
        r0 = r7.c;
        r0 = r0.e;
        if (r0 == 0) goto L_0x0146;
    L_0x0102:
        r0 = r0.a();
        r0.c = r9;
        r9 = r8.p();
        r0 = 4;
        if (r9 == r0) goto L_0x011a;
    L_0x010f:
        r9 = r8.o();
        if (r9 != r5) goto L_0x0116;
    L_0x0115:
        goto L_0x011a;
    L_0x0116:
        r7.a(r8);
        return;
    L_0x011a:
        r9 = r7.h;
        if (r9 != 0) goto L_0x0144;
    L_0x011e:
        r9 = r7.g;
        monitor-enter(r9);
        r0 = r7.h;	 Catch:{ all -> 0x0141 }
        if (r0 == 0) goto L_0x0127;
    L_0x0125:
        monitor-exit(r9);	 Catch:{ all -> 0x0141 }
        goto L_0x0144;
    L_0x0127:
        r0 = r7.e;	 Catch:{ all -> 0x0141 }
        r0 = r0.get();	 Catch:{ all -> 0x0141 }
        r0 = (defpackage.eif) r0;	 Catch:{ all -> 0x0141 }
        r0.a(r7);	 Catch:{ all -> 0x0141 }
        r0 = r7.f;	 Catch:{ all -> 0x0141 }
        r0 = r0.get();	 Catch:{ all -> 0x0141 }
        r0 = (defpackage.eic) r0;	 Catch:{ all -> 0x0141 }
        r0.a(r7);	 Catch:{ all -> 0x0141 }
        r7.h = r2;	 Catch:{ all -> 0x0141 }
        monitor-exit(r9);	 Catch:{ all -> 0x0141 }
        goto L_0x0144;
    L_0x0141:
        r8 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0141 }
        throw r8;
    L_0x0144:
        r7.b = r8;
    L_0x0146:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcb.a(aybc, boolean):void");
    }

    public final void a(fdl fdl) {
        BottomUiContainer bottomUiContainer = this.c.e;
        if (bottomUiContainer != null && !xrn.c(bottomUiContainer.getContext())) {
            Object a = fdl.n().a(new fce(this, fdl)).a();
            this.c.b((fbr) a);
            if (this.j == null) {
                fee fee = this.i;
                this.j = new fdn((akvp) fee.a((akvp) fee.a.get(), 1), (aaas) fee.a((aaas) fee.b.get(), 2), (HatsContainer) fee.a(bottomUiContainer.a(), 3));
            }
            bottomUiContainer.a(a, this.j, BottomUiContainer.a((albc) this, a));
            this.b = null;
        }
    }

    public final void b(aybc aybc) {
        if (aybc != null) {
            fdl fdl = this.b;
            if (fdl == null || !fdl.a(aybc)) {
                fdl = this.k;
                if (fdl != null && fdl.a(aybc)) {
                    this.c.e.b(3);
                    return;
                }
                return;
            }
            this.b = null;
        }
    }

    public final void B_() {
        if (foh.x(this.n)) {
            this.o.a();
            this.o.a(a(this.m));
            return;
        }
        this.l.a((Object) this);
    }

    public final void C_() {
        if (foh.x(this.n)) {
            this.o.a();
        } else {
            this.l.b(this);
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!ejd2.c()) {
            this.b = null;
        }
    }

    public final void a(ahkn ahkn) {
        if (this.b == null) {
            return;
        }
        if (ahkn.a == airi.ENDED && this.b.o() == 2) {
            fdl fdl = this.b;
            a(fdl.n().a(ahkn.e).a());
        } else if (ahkn.a == airi.VIDEO_PLAYING && this.b.p() == 4) {
            this.d.postDelayed(new fca(this), TimeUnit.SECONDS.toMillis((long) this.b.k()));
        }
    }

    public final void a(eja eja) {
        fdl fdl = this.b;
        if (fdl != null && fdl.p() == 4) {
            this.b = null;
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.n, 262144, 1)).a(new fcd(this), fcc.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
