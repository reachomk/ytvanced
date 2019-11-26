package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

/* renamed from: acrz */
public final class acrz implements abzb, Callback {
    public final boolean a;
    public final boolean b;
    public final Activity c;
    public final abza d;
    public final abzs e;
    public final abyh f;
    public abzt g;
    public abyt h;
    public abyz i;
    public abyr j;
    public abyc k;
    public abzr l;
    public acab m;
    public acsl n = new acsl();
    public boolean o;
    public volatile boolean p;
    public final Object q = new Object();

    public acrz(boolean z, boolean z2, SurfaceView surfaceView, Activity activity, abza abza, abyh abyh) {
        this.a = z;
        this.b = z2;
        this.c = activity;
        this.d = (abza) amqw.a((Object) abza);
        this.f = (abyh) amqw.a((Object) abyh);
        this.e = new abzs(surfaceView, this);
        surfaceView.getHolder().addCallback(this);
        abza.a(new abzf(abza, new acsc(this, activity, abza)));
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void b() {
        xak.a();
        abyh abyh = this.f;
        if (abyh != null) {
            abyh.h();
            this.n.a = this.f.g();
            this.n.b = this.f.a();
        }
    }

    public final boolean c() {
        abyh abyh = this.f;
        return abyh != null && abyh.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    public final void a(defpackage.acsl r3) {
        /*
        r2 = this;
        defpackage.xak.a();
        if (r3 != 0) goto L_0x001f;
    L_0x0005:
        r3 = r2.f;
        r3.b();
        r3 = r2.n;
        r0 = r2.f;
        r0 = r0.g();
        r3.a = r0;
        r3 = r2.n;
        r0 = r2.f;
        r0 = r0.a();
        r3.b = r0;
        goto L_0x0056;
    L_0x001f:
        r0 = r3.d;
        if (r0 == 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0033;
    L_0x0024:
        r0 = r2.n;
        r0 = r0.c;
        r1 = r3.c;
        if (r0 == r1) goto L_0x0033;
    L_0x002c:
        r2.n = r3;
        r3 = r2.n;
        r3.c = r0;
        goto L_0x0035;
    L_0x0033:
        r2.n = r3;
    L_0x0035:
        r3 = r2.f;
        r0 = r2.n;
        r0 = r0.a;
        r3.a(r0);
        r3 = r2.m;
        if (r3 == 0) goto L_0x004a;
    L_0x0042:
        r0 = r2.n;
        r0 = r0.c;
        r3.a(r0);
        goto L_0x0056;
    L_0x004a:
        r3 = r2.d;
        r3 = r3.a;
        r0 = new acsb;
        r0.<init>(r2);
        r3.post(r0);
    L_0x0056:
        r3 = r2.m;
        if (r3 == 0) goto L_0x005d;
    L_0x005a:
        r3.e();
    L_0x005d:
        r2.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrz.a(acsl):void");
    }

    public final void a(int i) {
        i = (360 - (i * 90)) % 360;
        xak.a();
        acsl acsl = this.n;
        if (!acsl.d || acsl.c % 180 == i % 180) {
            acsl.c = i;
            acab acab = this.m;
            if (acab != null) {
                acab.a(i);
            }
        }
    }

    public final void a(boolean z) {
        xak.a();
        amqw.b(this.e != null, (Object) "camera is not started yet");
        this.e.a(z);
    }

    public final int d() {
        amqw.a(this.f, (Object) "Must call startCamera before getCameraCount");
        return this.f.a;
    }

    public final void a() {
        abza abza = this.d;
        if (abza.b.a) {
            abza.c();
        }
        if (!this.a) {
            abyc abyc = this.k;
            if (abyc != null && abyc.c) {
                Handler handler = abyc.b;
                if (handler != null) {
                    handler.post(abyc.d);
                } else {
                    abyc.d.run();
                }
            }
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.d.a.post(new acsh(this, surfaceHolder, i2, i3));
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d.a.post(new acsk(this));
    }
}
