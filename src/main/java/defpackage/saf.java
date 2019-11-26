package defpackage;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: saf */
public abstract class saf implements pte, pth, sbs {
    public static String b;
    private static final String r = sdf.a(saf.class);
    public sal a;
    public Context c;
    public bbb d;
    public baz e;
    public san f;
    public CastDevice g;
    public String h;
    public sde i;
    public final Set j = new CopyOnWriteArraySet();
    public int k = 4;
    public boolean l;
    public ptd m;
    public boolean n;
    public String o;
    public int p = 0;
    public sco q;
    private String s;
    private int t;
    private AsyncTask u;
    private int v;
    private Handler w;

    protected saf() {
    }

    private static boolean b(int i, int i2) {
        return i == 0 || (i & i2) == i2;
    }

    public abstract pjh a();

    public void a(int i, int i2) {
        throw null;
    }

    public abstract void a(pjb pjb, String str, boolean z);

    /* Access modifiers changed, original: protected */
    public void a(boolean z) {
        throw null;
    }

    public abstract void b();

    public abstract void b(int i);

    /* Access modifiers changed, original: protected */
    public void c() {
    }

    public final bae d() {
        return null;
    }

    public void l() {
        throw null;
    }

    protected saf(Context context, sal sal) {
        this.a = sal;
        this.v = sal.d;
        b = context.getString(R.string.ccl_version);
        this.s = sal.e;
        String str = b;
        String str2 = this.s;
        String.valueOf(str).length();
        String.valueOf(str2).length();
        this.c = context.getApplicationContext();
        this.i = new sde(this.c);
        this.w = new Handler(new sai(this));
        this.i.a("application-id", this.s);
        this.d = bbb.a(this.c);
        bbc bbc = new bbc();
        bbc.a(pjn.a(this.s));
        this.e = bbc.a();
        this.f = new san(this);
        this.d.a(this.e, this.f, 4);
    }

    public final void a(CastDevice castDevice, bbs bbs) {
        for (sbm a : this.j) {
            a.a(castDevice, bbs);
        }
        if (castDevice != null) {
            this.g = castDevice;
            castDevice = this.g;
            this.h = castDevice.c;
            ptd ptd = this.m;
            if (ptd == null) {
                String.valueOf(castDevice).length();
                pjh a2 = a();
                ptf ptf = new ptf(this.c);
                ptf.a(pje.a, a2.a());
                ptf.a((pte) this);
                ptf.a((pth) this);
                this.m = ptf.b();
                this.m.c();
            } else if (!(ptd.f() || this.m.g())) {
                this.m.c();
            }
            return;
        }
        a(false, true, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    public final void a(boolean r6, boolean r7, boolean r8) {
        /*
        r5 = this;
        r0 = r5.g;
        if (r0 == 0) goto L_0x00b6;
    L_0x0004:
        r0 = 0;
        r5.g = r0;
        r5.h = r0;
        r1 = "disconnectDevice() Disconnect Reason: ";
        r2 = r5.n;
        r3 = 0;
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = "Connectivity lost";
        r1.concat(r2);
        r1 = 1;
        goto L_0x0033;
    L_0x0017:
        r2 = r5.p;
        if (r2 == 0) goto L_0x002d;
    L_0x001b:
        r4 = 2005; // 0x7d5 float:2.81E-42 double:9.906E-321;
        if (r2 == r4) goto L_0x0026;
    L_0x001f:
        r2 = "Other";
        r1.concat(r2);
        r1 = 0;
        goto L_0x0033;
    L_0x0026:
        r2 = "App was taken over or not available anymore";
        r1.concat(r2);
        r1 = 2;
        goto L_0x0033;
    L_0x002d:
        r2 = "Intentional disconnect";
        r1.concat(r2);
        r1 = 3;
    L_0x0033:
        r2 = r5.j;
        r2 = r2.iterator();
    L_0x0039:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0049;
    L_0x003f:
        r4 = r2.next();
        r4 = (defpackage.sbm) r4;
        r4.a(r1);
        goto L_0x0039;
    L_0x0049:
        r1 = r5.n;
        if (r1 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0056;
    L_0x004e:
        if (r7 == 0) goto L_0x0056;
    L_0x0050:
        r5.e(r3);
        r5.n();
    L_0x0056:
        r1 = r5.h();	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        if (r1 != 0) goto L_0x0063;
    L_0x005c:
        r1 = r5.i();	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        if (r1 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0085;
    L_0x0063:
        if (r6 == 0) goto L_0x0085;
    L_0x0065:
        r5.m();	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r6 = defpackage.pje.b;	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r1 = r5.m;	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r2 = r5.o;	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r6 = r6.a(r1, r2);	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r1 = new saj;	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r1.<init>(r5);	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        r6.a(r1);	 Catch:{ sbt -> 0x007d, sbt | sbv -> 0x007b }
        goto L_0x0085;
    L_0x007b:
        r6 = move-exception;
        goto L_0x007e;
    L_0x007d:
        r6 = move-exception;
    L_0x007e:
        r1 = r;
        r2 = "Failed to stop the application after disconnecting route";
        defpackage.sdf.a(r1, r2, r6);
    L_0x0085:
        r5.c();
        r6 = r5.m;
        if (r6 == 0) goto L_0x00af;
    L_0x008c:
        r6 = r6.g();
        if (r6 != 0) goto L_0x009a;
    L_0x0092:
        r6 = r5.m;
        r6 = r6.f();
        if (r6 == 0) goto L_0x009f;
    L_0x009a:
        r6 = r5.m;
        r6.e();
    L_0x009f:
        r6 = r5.d;
        if (r6 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00ad;
    L_0x00a4:
        if (r8 == 0) goto L_0x00ad;
    L_0x00a6:
        r6 = defpackage.bbb.b();
        defpackage.bbb.a(r6);
    L_0x00ad:
        r5.m = r0;
    L_0x00af:
        r5.n = r3;
        r5.o = r0;
        r5.a(r7);
    L_0x00b6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.saf.a(boolean, boolean, boolean):void");
    }

    public final synchronized void e() {
        this.t++;
        if (!this.l) {
            this.l = true;
            this.w.removeMessages(1);
            this.w.sendEmptyMessageDelayed(0, 300);
        }
        int i = this.t;
    }

    /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            return;
     */
    public final synchronized void f() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.t;	 Catch:{ all -> 0x0021 }
        r0 = r0 + -1;
        r4.t = r0;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001f;
    L_0x0009:
        r0 = r4.l;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r0 = 0;
        r4.l = r0;	 Catch:{ all -> 0x0021 }
        r1 = r4.w;	 Catch:{ all -> 0x0021 }
        r1.removeMessages(r0);	 Catch:{ all -> 0x0021 }
        r0 = r4.w;	 Catch:{ all -> 0x0021 }
        r1 = 1;
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0.sendEmptyMessageDelayed(r1, r2);	 Catch:{ all -> 0x0021 }
    L_0x001d:
        monitor-exit(r4);
        return;
    L_0x001f:
        monitor-exit(r4);
        return;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.saf.f():void");
    }

    public final void g() {
        this.d.a(this.e, this.f, 4);
    }

    public final boolean h() {
        ptd ptd = this.m;
        return ptd != null && ptd.f();
    }

    public final boolean i() {
        ptd ptd = this.m;
        return ptd != null && ptd.g();
    }

    public final boolean c(int i) {
        return (this.v & i) == i;
    }

    public final void d(int i) {
        if (this.k != i) {
            this.k = i;
            for (sbm h : this.j) {
                h.h();
            }
        }
    }

    public final void j() {
        AsyncTask asyncTask = this.u;
        if (asyncTask != null && !asyncTask.isCancelled()) {
            this.u.cancel(true);
        }
    }

    public final void k() {
        a(10, null);
    }

    public final void a(int i, String str) {
        String.format("reconnectSessionIfPossible(%d, %s)", new Object[]{Integer.valueOf(i), str});
        if (!h()) {
            String str2 = "route-id";
            String a = this.i.a(str2);
            String str3 = "session-id";
            String a2 = this.i.a(str3);
            String a3 = this.i.a(str2);
            String a4 = this.i.a("ssid");
            if (a2 != null && a3 != null && (str == null || (a4 != null && a4.equals(str)))) {
                List<bbs> a5 = bbb.a();
                bbs bbs = null;
                if (a5 != null) {
                    for (bbs bbs2 : a5) {
                        if (bbs2.c.equals(a)) {
                            bbs = bbs2;
                            break;
                        }
                    }
                }
                if (bbs == null) {
                    d(1);
                } else if (!h()) {
                    str = this.i.a(str3);
                    a = this.i.a(str2);
                    String.valueOf(str).length();
                    String.valueOf(a).length();
                    if (!(str == null || a == null)) {
                        d(2);
                        CastDevice a6 = CastDevice.a(bbs.r);
                        if (a6 != null) {
                            String.valueOf(a6).length();
                            a(a6, bbs);
                        }
                    }
                }
                AsyncTask asyncTask = this.u;
                if (!(asyncTask == null || asyncTask.isCancelled())) {
                    this.u.cancel(true);
                }
                this.u = new sae(this, i);
                if (VERSION.SDK_INT >= 11) {
                    this.u.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                } else {
                    this.u.execute(new Void[0]);
                }
            }
        }
    }

    public final void a(Bundle bundle) {
        if (this.n) {
            this.n = false;
            if (bundle == null || !bundle.getBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING")) {
                l();
                return;
            }
            if (h() || i()) {
                a(false, true, true);
            }
        } else if (h()) {
            try {
                if (c(8)) {
                    this.i.a("ssid", sdh.a(this.c));
                }
                pje.b.a(this.m);
                sal sal = this.a;
                if (!sal.m) {
                    a(sal.e, sal.i);
                }
                for (sbm a : this.j) {
                    a.a();
                }
            } catch (IOException | IllegalStateException e) {
                sdf.a(r, "requestStatus()", e);
            }
        } else {
            if (this.k == 2) {
                d(4);
            }
        }
    }

    public void a(psa psa) {
        int i = psa.b;
        String.valueOf(psa.toString()).length();
        a(false, false, false);
        this.n = false;
        if (this.d != null) {
            bbb.a(bbb.b());
        }
        for (sbm a : this.j) {
            a.a(psa);
        }
        PendingIntent pendingIntent = psa.c;
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException e) {
                sdf.a(r, "Failed to show recovery from the recoverable error", e);
            }
        }
    }

    public final void a(int i) {
        this.n = true;
        for (sbm b : this.j) {
            b.b();
        }
    }

    public final void a(String str, pjr pjr) {
        if (!h()) {
            if (this.k == 2) {
                d(4);
                return;
            }
            m();
        }
        if (this.k == 2) {
            pje.b.b(this.m, str, this.i.a("session-id")).a(new sah(this));
            return;
        }
        pje.b.a(this.m, str, pjr).a(new sag(this));
    }

    public final void m() {
        if (!h()) {
            if (this.n) {
                throw new sbv();
            }
            throw new sbt();
        }
    }

    public final void e(int i) {
        if (saf.b(i, 4)) {
            this.i.a("session-id", null);
        }
        if (saf.b(i, 1)) {
            this.i.a("route-id", null);
        }
        if (saf.b(i, 2)) {
            this.i.a("ssid", null);
        }
        if (saf.b(i, 8)) {
            this.i.a.edit().remove("media-end").apply();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void n() {
        sco sco = this.q;
        if (sco != null) {
            BroadcastReceiver broadcastReceiver = sco.a;
            if (broadcastReceiver != null) {
                sco.c.unregisterReceiver(broadcastReceiver);
                sco.a = null;
            }
        }
    }
}
