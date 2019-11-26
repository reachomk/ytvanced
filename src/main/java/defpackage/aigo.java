package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;

/* renamed from: aigo */
public final class aigo implements ajan, xcp {
    public final aigp a;
    public Bitmap b;
    public boolean c;
    private final akkq d;
    private final wxg e = wxl.a(new Handler(), new aigx(this));
    private final boolean f;
    private wxi g;
    private Uri h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final int m = -1;
    private final int n = -1;

    public aigo(aigp aigp, akkq akkq, boolean z) {
        this.a = (aigp) amqw.a((Object) aigp);
        this.d = (akkq) amqw.a((Object) akkq);
        this.f = z;
    }

    public final long e() {
        return 2097152;
    }

    private final void a() {
        this.h = null;
        this.b = null;
        wxi wxi = this.g;
        if (wxi != null) {
            wxi.a();
            this.g = null;
        }
        this.a.at_();
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 2097152)).a(ajcg.a(ajam.O(), 2097152)).a(new aigr(this), aigq.a), ajam.P().a.a(ajcg.b(ajam.O(), 2097152)).a(ajcg.a(ajam.O(), 2097152)).a(new aigt(this), aigs.a), ajam.P().b.a(ajcg.b(ajam.O(), 2097152)).a(ajcg.a(ajam.O(), 2097152, 0)).a(new aigv(this), aigu.a)};
    }

    /* JADX WARNING: Missing block: B:8:0x001b, code skipped:
            if (r2 <= 0) goto L_0x001d;
     */
    public final void a(defpackage.ahkn r6) {
        /*
        r5 = this;
        r0 = r6.a;
        r1 = defpackage.airi.NEW;
        if (r0 != r1) goto L_0x000a;
    L_0x0006:
        r5.a();
        goto L_0x0062;
    L_0x000a:
        r0 = r6.a;
        r1 = defpackage.airi.PLAYBACK_LOADED;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x0062;
    L_0x0014:
        r0 = r5.n;
        r1 = 0;
        if (r0 <= 0) goto L_0x001d;
    L_0x0019:
        r2 = r5.m;
        if (r2 > 0) goto L_0x003d;
    L_0x001d:
        r0 = r5.a;
        r2 = r0 instanceof defpackage.aiub;
        if (r2 == 0) goto L_0x002a;
    L_0x0023:
        r0 = (defpackage.aiub) r0;
        r0 = r0.a();
        goto L_0x002b;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r2 = r0.getWidth();
        goto L_0x0034;
    L_0x0032:
        r2 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
    L_0x0034:
        if (r0 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r0.getHeight();
        goto L_0x003d;
    L_0x003b:
        r0 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
    L_0x003d:
        r3 = r6.b;
        if (r3 == 0) goto L_0x0062;
    L_0x0041:
        r3 = r3.g();
        r4 = r3.a();
        if (r4 == 0) goto L_0x0053;
    L_0x004b:
        r0 = r3.a(r2, r0);
        r1 = r0.a();
    L_0x0053:
        if (r1 == 0) goto L_0x005d;
    L_0x0055:
        r0 = r5.h;
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0060;
    L_0x005d:
        r5.a();
    L_0x0060:
        r5.h = r1;
    L_0x0062:
        r0 = r6.a;
        r1 = defpackage.airi.PLAYBACK_LOADED;
        r0 = r0.a(r1);
        r5.i = r0;
        r6 = r6.a;
        r0 = 4;
        r0 = new defpackage.airi[r0];
        r1 = 0;
        r2 = defpackage.airi.PLAYBACK_LOADED;
        r0[r1] = r2;
        r1 = defpackage.airi.PLAYBACK_INTERRUPTED;
        r2 = 1;
        r0[r2] = r1;
        r1 = 2;
        r3 = defpackage.airi.READY;
        r0[r1] = r3;
        r1 = 3;
        r3 = defpackage.airi.ENDED;
        r0[r1] = r3;
        r6 = r6.a(r0);
        r6 = r6 ^ r2;
        r5.j = r6;
        r5.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aigo.a(ahkn):void");
    }

    public final void a(ahkl ahkl) {
        this.k = ahkl.a;
        b();
    }

    public final void a(ahjn ahjn) {
        this.l = ahjn.a == airc.REMOTE;
        b();
    }

    private final void b() {
        if ((!(this.i && (this.k || this.l)) && (this.j || !this.f)) || this.c) {
            this.a.ag_();
            return;
        }
        if (this.b == null && this.h != null && this.g == null) {
            this.g = wxi.a(this.e);
            this.d.b(this.h, this.g);
        }
        this.a.af_();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkl.class, ahkn.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkl) obj);
            return null;
        } else if (i == 2) {
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
