package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;

/* renamed from: ahgn */
public final class ahgn {
    public final Context a;
    public final bcaa b;
    public final aiqf c;
    public bcaa d;
    public final zzl e;
    public final zyw f;
    public final ahgw g;
    public final ahgt h;
    public final bapu i;
    public ahgu j;
    public Runnable k = new ahgq(this);
    public int l;
    private final aiwh m;
    private final aepu n;
    private final aiws o;
    private final aitk p;
    private final bcud q;
    private boolean r;
    private final ServiceConnection s = new ahgs(this);

    public ahgn(Context context, bcaa bcaa, aiqf aiqf, aiwh aiwh, aepu aepu, aitk aitk, bcud bcud, aiws aiws, zzl zzl, zyw zyw, bapu bapu) {
        this.a = (Context) amqw.a((Object) context);
        this.c = (aiqf) amqw.a((Object) aiqf);
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.m = (aiwh) amqw.a((Object) aiwh);
        this.n = (aepu) amqw.a((Object) aepu);
        this.o = aiws;
        this.e = zzl;
        this.f = zyw;
        this.p = aitk;
        this.q = bcud;
        this.i = bapu;
        this.g = new ahgw(this);
        this.h = new ahgt(this);
        this.l = 1;
        this.r = false;
    }

    public final void a() {
        this.p.a = new ahgr(this);
        if (aipo.h(this.f)) {
            this.c.h = true;
        }
    }

    public final void b() {
        if (c() && this.c.h) {
            g();
            ((aisx) this.i.get()).b();
        }
    }

    private final void i() {
        if (c()) {
            ((aisx) this.i.get()).b(true);
        }
    }

    private final aakj j() {
        bcaa bcaa = this.d;
        if (!(bcaa == null || bcaa.get() == null)) {
            ajlj ajlj = this.o.a;
            if (ajlj != null) {
                return ajlj.q();
            }
        }
        return null;
    }

    public final boolean c() {
        return this.m.c() && aiur.a(j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARNING: Missing block: B:16:0x0053, code skipped:
            if ((r0.w() ^ 1) != 0) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:58:0x0102, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:64:0x0115, code skipped:
            return r0;
     */
    public final synchronized defpackage.ahhb d() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.l;	 Catch:{ all -> 0x0116 }
        r1 = 3;
        r2 = 1;
        if (r0 != r2) goto L_0x0103;
    L_0x0007:
        r0 = r7.c;	 Catch:{ all -> 0x0116 }
        r0.h = r2;	 Catch:{ all -> 0x0116 }
        r0 = r7.d;	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x00a9;
    L_0x000f:
        r0 = r0.get();	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0015:
        r0 = r7.d;	 Catch:{ all -> 0x0116 }
        r0 = r0.get();	 Catch:{ all -> 0x0116 }
        r0 = (defpackage.aixk) r0;	 Catch:{ all -> 0x0116 }
        r0 = r0.j();	 Catch:{ all -> 0x0116 }
        r3 = new int[r2];	 Catch:{ all -> 0x0116 }
        r4 = 0;
        r5 = 2;
        r3[r4] = r5;	 Catch:{ all -> 0x0116 }
        r0 = defpackage.airg.a(r0, r3);	 Catch:{ all -> 0x0116 }
        if (r0 != 0) goto L_0x0055;
    L_0x002d:
        r0 = r7.d;	 Catch:{ all -> 0x0116 }
        r0 = r0.get();	 Catch:{ all -> 0x0116 }
        r0 = (defpackage.aixk) r0;	 Catch:{ all -> 0x0116 }
        r0 = r0.j();	 Catch:{ all -> 0x0116 }
        r3 = new int[r5];	 Catch:{ all -> 0x0116 }
        r6 = 4;
        r3[r4] = r6;	 Catch:{ all -> 0x0116 }
        r4 = 5;
        r3[r2] = r4;	 Catch:{ all -> 0x0116 }
        r0 = defpackage.airg.a(r0, r3);	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0047:
        r0 = r7.o;	 Catch:{ all -> 0x0116 }
        r0 = r0.a;	 Catch:{ all -> 0x0116 }
        if (r0 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x00a9;
    L_0x004e:
        r0 = r0.w();	 Catch:{ all -> 0x0116 }
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x00a9;
    L_0x0055:
        r0 = r7.m;	 Catch:{ all -> 0x0116 }
        r0 = r0.c();	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x00a9;
    L_0x005d:
        r0 = r7.d;	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x007d;
    L_0x0061:
        r0 = r0.get();	 Catch:{ all -> 0x0116 }
        if (r0 == 0) goto L_0x007d;
    L_0x0067:
        r0 = r7.d;	 Catch:{ all -> 0x0116 }
        r0 = r0.get();	 Catch:{ all -> 0x0116 }
        r0 = (defpackage.aixk) r0;	 Catch:{ all -> 0x0116 }
        r0 = r0.j();	 Catch:{ all -> 0x0116 }
        if (r0 != r5) goto L_0x007d;
    L_0x0075:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r2 = defpackage.ahhd.PENDING;	 Catch:{ all -> 0x0116 }
        r0.<init>(r2);	 Catch:{ all -> 0x0116 }
        goto L_0x00b0;
    L_0x007d:
        r0 = r7.j();	 Catch:{ all -> 0x0116 }
        r2 = defpackage.aiur.a(r0);	 Catch:{ all -> 0x0116 }
        if (r2 == 0) goto L_0x008f;
    L_0x0087:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r2 = defpackage.ahhd.SUCCESS;	 Catch:{ all -> 0x0116 }
        r0.<init>(r2);	 Catch:{ all -> 0x0116 }
        goto L_0x00b0;
    L_0x008f:
        r2 = 0;
        if (r0 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00a1;
    L_0x0093:
        r3 = r0.l();	 Catch:{ all -> 0x0116 }
        if (r3 == 0) goto L_0x00a1;
    L_0x0099:
        r0 = r0.l();	 Catch:{ all -> 0x0116 }
        r2 = defpackage.aiqr.e(r0);	 Catch:{ all -> 0x0116 }
    L_0x00a1:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r3 = defpackage.ahhd.VIDEO_NOT_BACKGROUNDABLE;	 Catch:{ all -> 0x0116 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0116 }
        goto L_0x00b0;
    L_0x00a9:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r2 = defpackage.ahhd.NOT_APPLICABLE;	 Catch:{ all -> 0x0116 }
        r0.<init>(r2);	 Catch:{ all -> 0x0116 }
    L_0x00b0:
        r2 = r0.a;	 Catch:{ all -> 0x0116 }
        r3 = defpackage.ahhd.PENDING;	 Catch:{ all -> 0x0116 }
        if (r2 != r3) goto L_0x00d9;
    L_0x00b6:
        r2 = r7.f;	 Catch:{ all -> 0x0116 }
        r2 = defpackage.aipo.h(r2);	 Catch:{ all -> 0x0116 }
        if (r2 == 0) goto L_0x00d3;
    L_0x00be:
        r7.l = r1;	 Catch:{ all -> 0x0116 }
        r1 = r7.p;	 Catch:{ all -> 0x0116 }
        r1.a();	 Catch:{ all -> 0x0116 }
        r1 = r7.f;	 Catch:{ all -> 0x0116 }
        r1 = defpackage.aipo.g(r1);	 Catch:{ all -> 0x0116 }
        if (r1 != 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x0114;
    L_0x00ce:
        r7.b();	 Catch:{ all -> 0x0116 }
        monitor-exit(r7);
        return r0;
    L_0x00d3:
        r7.l = r1;	 Catch:{ all -> 0x0116 }
        r7.l();	 Catch:{ all -> 0x0116 }
        goto L_0x0114;
    L_0x00d9:
        r1 = r0.a;	 Catch:{ all -> 0x0116 }
        r2 = defpackage.ahhd.SUCCESS;	 Catch:{ all -> 0x0116 }
        if (r1 != r2) goto L_0x0114;
    L_0x00df:
        r1 = r7.f;	 Catch:{ all -> 0x0116 }
        r1 = defpackage.aipo.h(r1);	 Catch:{ all -> 0x0116 }
        if (r1 == 0) goto L_0x00fb;
    L_0x00e7:
        r7.k();	 Catch:{ all -> 0x0116 }
        r1 = r7.p;	 Catch:{ all -> 0x0116 }
        r1.a();	 Catch:{ all -> 0x0116 }
        r1 = r7.f;	 Catch:{ all -> 0x0116 }
        r1 = defpackage.aipo.g(r1);	 Catch:{ all -> 0x0116 }
        if (r1 == 0) goto L_0x0101;
    L_0x00f7:
        r7.b();	 Catch:{ all -> 0x0116 }
        goto L_0x0101;
    L_0x00fb:
        r7.k();	 Catch:{ all -> 0x0116 }
        r7.l();	 Catch:{ all -> 0x0116 }
    L_0x0101:
        monitor-exit(r7);
        return r0;
    L_0x0103:
        if (r0 != r1) goto L_0x010d;
    L_0x0105:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r1 = defpackage.ahhd.PENDING;	 Catch:{ all -> 0x0116 }
        r0.<init>(r1);	 Catch:{ all -> 0x0116 }
        goto L_0x0114;
    L_0x010d:
        r0 = new ahhb;	 Catch:{ all -> 0x0116 }
        r1 = defpackage.ahhd.SUCCESS;	 Catch:{ all -> 0x0116 }
        r0.<init>(r1);	 Catch:{ all -> 0x0116 }
    L_0x0114:
        monitor-exit(r7);
        return r0;
    L_0x0116:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgn.d():ahhb");
    }

    public final synchronized void a(afjt afjt) {
        aiqf aiqf = this.c;
        aiqf.h = false;
        this.l = 1;
        aiqf.a(false);
        aiqf.d = afjt;
        if (!this.c.j) {
            this.n.a(afjt);
        }
        if (this.d.get() != null) {
            ((aixk) this.d.get()).c(false);
        }
        if (this.r) {
            this.q.e_(ahgy.d);
            if (!aipo.h(this.f)) {
                h();
            }
        }
        if (aipo.h(this.f) && aipo.g(this.f)) {
            i();
        }
    }

    private final void k() {
        this.l = 2;
        aiqf aiqf = this.c;
        aiqf.a(true);
        aiqf.d = null;
        this.n.r();
        if (this.d.get() != null) {
            ((aixk) this.d.get()).c(true);
        }
    }

    public final void e() {
        if (this.l == 3) {
            xtl.d("About to stop background service while in a pending state.");
        }
        this.l = 1;
        if (aipo.h(this.f)) {
            if (aipo.g(this.f)) {
                i();
            }
            if (this.r) {
                this.a.stopService((Intent) this.b.get());
                this.a.unbindService(this.s);
                this.r = false;
            }
        } else {
            h();
        }
        this.c.b();
    }

    public final synchronized void a(aakj aakj) {
        if (this.l != 3) {
            return;
        }
        if (aiur.a(aakj)) {
            k();
        } else {
            f();
        }
    }

    public final void f() {
        this.l = 1;
        if (aipo.h(this.f) && aipo.g(this.f)) {
            i();
        } else {
            h();
        }
        ahgu ahgu = this.j;
        if (ahgu != null) {
            ahgu.a();
        }
    }

    public final void g() {
        if (!this.r) {
            this.a.bindService((Intent) this.b.get(), this.s, 1);
            this.r = true;
        }
    }

    private final void l() {
        if (!this.r) {
            Intent intent = (Intent) this.b.get();
            if (VERSION.SDK_INT < 26 || !aipo.j(this.e)) {
                this.a.startService(intent);
            } else {
                this.a.startForegroundService(intent);
            }
            this.p.a();
            this.r = true;
        }
    }

    public final void h() {
        if (!aipo.h(this.f) && this.r) {
            if (this.p.e()) {
                if (this.l == 1) {
                    this.a.stopService((Intent) this.b.get());
                    this.r = false;
                }
            } else if (this.p.d() && this.k == null) {
                this.k = new ahgp(this);
            } else if (this.k == null) {
                this.r = false;
            }
        }
    }
}
