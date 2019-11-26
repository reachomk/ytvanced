package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: mvs */
public abstract class mvs extends amlj {
    public boolean A;
    private final msw B = new msw(this.a);
    private final FrameLayout C;
    private muf D;
    private mso E;
    private final mtu F;
    private final mub G;
    private amlc H;
    private boolean I;
    public final Handler a;
    public final myo b = new myo(this.B);
    public final myv c = new myv(this.a);
    public final aiuf d;
    public final aicq e;
    public final aify f;
    public final aihw g;
    public final aifd h;
    public final muz i;
    public mug j;
    public nhv k;
    public muo l;
    public aiic m;
    public final mtm n;
    public final vwa o;
    public final aidl p;
    public final aifz q;
    public final aigz r;
    public final Context s;
    public final msh t;
    public final mts u;
    public amlt v;
    public amlr w;
    public amlp x;
    public amln y;
    public String z;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182 A:{Catch:{ RuntimeException -> 0x0211 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d7  */
    public mvs(android.content.Context r13, defpackage.msh r14, defpackage.aiuf r15) {
        /*
        r12 = this;
        r12.<init>();
        r0 = "context cannot be null";
        r0 = defpackage.amqw.a(r13, r0);
        r0 = (android.content.Context) r0;
        r12.s = r0;
        r0 = "activityProxy cannot be null";
        r0 = defpackage.amqw.a(r14, r0);
        r0 = (defpackage.msh) r0;
        r12.t = r0;
        r0 = "playerOverlaysLayout cannot be null";
        r0 = defpackage.amqw.a(r15, r0);
        r0 = (defpackage.aiuf) r0;
        r12.d = r0;
        r0 = new android.widget.FrameLayout;
        r0.<init>(r13);
        r12.C = r0;
        r0 = r12.C;
        r0.addView(r15);
        r0 = new android.os.Handler;
        r1 = r13.getMainLooper();
        r0.<init>(r1);
        r12.a = r0;
        r0 = new msw;
        r1 = r12.a;
        r0.<init>(r1);
        r12.B = r0;
        r0 = new myo;
        r1 = r12.B;
        r0.<init>(r1);
        r12.b = r0;
        r0 = new myv;
        r1 = r12.a;
        r0.<init>(r1);
        r12.c = r0;
        r0 = r13.getPackageName();
        r1 = "com.google.android.play.games";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x005f:
        r0 = defpackage.mub.r;
        r12.G = r0;
        goto L_0x0070;
    L_0x0064:
        r0 = new mta;
        r1 = new mwp;
        r1.<init>(r12);
        r0.<init>(r15, r14, r1);
        r12.G = r0;
    L_0x0070:
        r5 = new mwm;
        r5.<init>(r12);
        r7 = new xot;
        r0 = r14.c();
        r1 = r14.a();
        r7.<init>(r0, r1, r15);
        r0 = new mtu;
        r2 = r0;
        r3 = r13;
        r4 = r14;
        r6 = r15;
        r2.<init>(r3, r4, r5, r6, r7);
        r12.F = r0;
        r14 = new mts;
        r0 = new mwn;
        r0.<init>(r12);
        r14.<init>(r13, r0, r15);
        r12.u = r14;
        r14 = 0;
        r0 = new defpackage.aibb[r14];
        r1 = new defpackage.aigc[r14];
        r2 = new defpackage.aihv[r14];
        r3 = new defpackage.aifc[r14];
        r4 = new defpackage.muz[r14];
        r5 = 2;
        r6 = 1;
        r7 = new nhv;	 Catch:{ RuntimeException -> 0x0106 }
        r7.<init>();	 Catch:{ RuntimeException -> 0x0106 }
        r12.k = r7;	 Catch:{ RuntimeException -> 0x0106 }
        r7 = new muf;	 Catch:{ RuntimeException -> 0x0106 }
        r8 = r12.G;	 Catch:{ RuntimeException -> 0x0106 }
        r7.<init>(r13, r8);	 Catch:{ RuntimeException -> 0x0106 }
        r12.D = r7;	 Catch:{ RuntimeException -> 0x0106 }
        r7 = new mug;	 Catch:{ RuntimeException -> 0x0106 }
        r8 = r12.G;	 Catch:{ RuntimeException -> 0x0106 }
        r9 = new nic;	 Catch:{ RuntimeException -> 0x0106 }
        r10 = r12.k;	 Catch:{ RuntimeException -> 0x0106 }
        r9.<init>(r10);	 Catch:{ RuntimeException -> 0x0106 }
        r7.<init>(r13, r8, r9);	 Catch:{ RuntimeException -> 0x0106 }
        r12.j = r7;	 Catch:{ RuntimeException -> 0x0106 }
        r7 = r12.j;	 Catch:{ RuntimeException -> 0x0106 }
        r8 = new mvv;	 Catch:{ RuntimeException -> 0x0106 }
        r8.<init>(r12);	 Catch:{ RuntimeException -> 0x0106 }
        r7.a = r8;	 Catch:{ RuntimeException -> 0x0106 }
        r7 = new defpackage.aibb[r5];	 Catch:{ RuntimeException -> 0x0106 }
        r8 = r12.D;	 Catch:{ RuntimeException -> 0x0106 }
        r7[r14] = r8;	 Catch:{ RuntimeException -> 0x0106 }
        r9 = r12.j;	 Catch:{ RuntimeException -> 0x0106 }
        r7[r6] = r9;	 Catch:{ RuntimeException -> 0x0106 }
        r0 = new defpackage.aigc[r5];	 Catch:{ RuntimeException -> 0x0107 }
        r0[r14] = r8;	 Catch:{ RuntimeException -> 0x0107 }
        r0[r6] = r9;	 Catch:{ RuntimeException -> 0x0107 }
        r1 = new defpackage.aihv[r5];	 Catch:{ RuntimeException -> 0x0108 }
        r1[r14] = r8;	 Catch:{ RuntimeException -> 0x0108 }
        r1[r6] = r9;	 Catch:{ RuntimeException -> 0x0108 }
        r2 = new defpackage.aifc[r5];	 Catch:{ RuntimeException -> 0x0109 }
        r2[r14] = r8;	 Catch:{ RuntimeException -> 0x0109 }
        r2[r6] = r9;	 Catch:{ RuntimeException -> 0x0109 }
        r3 = new defpackage.muz[r5];	 Catch:{ RuntimeException -> 0x010a }
        r3[r14] = r8;	 Catch:{ RuntimeException -> 0x010a }
        r3[r6] = r9;	 Catch:{ RuntimeException -> 0x010a }
        r4 = r9.d();	 Catch:{ RuntimeException -> 0x010b }
        r8 = new muo;	 Catch:{ RuntimeException -> 0x010c }
        r8.<init>(r13);	 Catch:{ RuntimeException -> 0x010c }
        r12.l = r8;	 Catch:{ RuntimeException -> 0x010c }
        r8 = r12.B;	 Catch:{ RuntimeException -> 0x010c }
        r9 = defpackage.ngq.RELATED_VIDEOS_SCREEN;	 Catch:{ RuntimeException -> 0x010c }
        r10 = r12.l;	 Catch:{ RuntimeException -> 0x010c }
        r8.a(r9, r10);	 Catch:{ RuntimeException -> 0x010c }
        goto L_0x0113;
    L_0x0106:
        r7 = r0;
    L_0x0107:
        r0 = r1;
    L_0x0108:
        r1 = r2;
    L_0x0109:
        r2 = r3;
    L_0x010a:
        r3 = r4;
    L_0x010b:
        r4 = 0;
    L_0x010c:
        r8 = new java.lang.Object[r14];
        r9 = "Cannot load modern controls UI. Upgrade to the latest version of the Android YouTube API.";
        defpackage.ammj.a(r9, r8);
    L_0x0113:
        r8 = r12.D;
        if (r8 == 0) goto L_0x011b;
    L_0x0117:
        r8 = r12.j;
        if (r8 != 0) goto L_0x0154;
    L_0x011b:
        r0 = 0;
        r12.D = r0;
        r12.j = r0;
        r0 = new mso;	 Catch:{ RuntimeException -> 0x0216 }
        r1 = r12.G;	 Catch:{ RuntimeException -> 0x0216 }
        r0.<init>(r13, r1);	 Catch:{ RuntimeException -> 0x0216 }
        r12.E = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r12.E;	 Catch:{ RuntimeException -> 0x0216 }
        r1 = new mvu;	 Catch:{ RuntimeException -> 0x0216 }
        r1.<init>(r12);	 Catch:{ RuntimeException -> 0x0216 }
        r0.b = r1;	 Catch:{ RuntimeException -> 0x0216 }
        r7 = new defpackage.aibb[r6];	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r12.E;	 Catch:{ RuntimeException -> 0x0216 }
        r7[r14] = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r1 = new defpackage.aigc[r6];	 Catch:{ RuntimeException -> 0x0216 }
        r1[r14] = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r2 = new defpackage.aihv[r6];	 Catch:{ RuntimeException -> 0x0216 }
        r2[r14] = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r3 = new defpackage.aifc[r6];	 Catch:{ RuntimeException -> 0x0216 }
        r3[r14] = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r4 = new defpackage.muz[r6];	 Catch:{ RuntimeException -> 0x0216 }
        r4[r14] = r0;	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r0.c;	 Catch:{ RuntimeException -> 0x0216 }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x0216 }
        r11 = r4;
        r4 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r11;
    L_0x0154:
        r8 = new aicq;
        r8.<init>(r7);
        r12.e = r8;
        r7 = new aify;
        r7.<init>(r0);
        r12.f = r7;
        r0 = new aihw;
        r0.<init>(r1);
        r12.g = r0;
        r0 = new aifd;
        r0.<init>(r2);
        r12.h = r0;
        r0 = new mvx;
        r0.<init>(r3);
        r12.i = r0;
        r0 = new mtm;	 Catch:{ RuntimeException -> 0x0211 }
        r0.<init>(r13, r4);	 Catch:{ RuntimeException -> 0x0211 }
        r12.n = r0;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = r12.j;	 Catch:{ RuntimeException -> 0x0211 }
        if (r0 == 0) goto L_0x018b;
    L_0x0182:
        r1 = r12.n;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = r0.c();	 Catch:{ RuntimeException -> 0x0211 }
        r1.a(r0);	 Catch:{ RuntimeException -> 0x0211 }
    L_0x018b:
        r0 = new vwa;	 Catch:{ RuntimeException -> 0x0211 }
        r0.<init>(r13);	 Catch:{ RuntimeException -> 0x0211 }
        r12.o = r0;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = new aidl;	 Catch:{ RuntimeException -> 0x0211 }
        r0.<init>(r13);	 Catch:{ RuntimeException -> 0x0211 }
        r12.p = r0;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = new aifz;	 Catch:{ RuntimeException -> 0x0211 }
        r0.<init>(r13);	 Catch:{ RuntimeException -> 0x0211 }
        r12.q = r0;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = new aigz;	 Catch:{ RuntimeException -> 0x0211 }
        r0.<init>(r13);	 Catch:{ RuntimeException -> 0x0211 }
        r12.r = r0;	 Catch:{ RuntimeException -> 0x0211 }
        r0 = new aiic;	 Catch:{ RuntimeException -> 0x01af }
        r0.<init>(r13);	 Catch:{ RuntimeException -> 0x01af }
        r12.m = r0;	 Catch:{ RuntimeException -> 0x01af }
        goto L_0x01b6;
    L_0x01af:
        r13 = new java.lang.Object[r14];
        r0 = "Cannot load paid content UI. Upgrade to the latest version of the Android YouTube API.";
        defpackage.ammj.a(r0, r13);
    L_0x01b6:
        r13 = new defpackage.aiub[r6];
        r0 = r12.r;
        r13[r14] = r0;
        r15.a(r13);
        r13 = r12.m;
        if (r13 == 0) goto L_0x01ca;
    L_0x01c3:
        r0 = new defpackage.aiub[r6];
        r0[r14] = r13;
        r15.a(r0);
    L_0x01ca:
        r13 = new defpackage.aiub[r6];
        r0 = r12.q;
        r13[r14] = r0;
        r15.a(r13);
        r13 = r12.D;
        if (r13 == 0) goto L_0x01f0;
    L_0x01d7:
        r0 = r12.j;
        if (r0 == 0) goto L_0x01f0;
    L_0x01db:
        r1 = new defpackage.aiub[r5];
        r1[r14] = r13;
        r1[r6] = r0;
        r15.a(r1);
        r13 = r12.l;
        if (r13 == 0) goto L_0x01f9;
    L_0x01e8:
        r0 = new defpackage.aiub[r6];
        r0[r14] = r13;
        r15.a(r0);
        goto L_0x01f9;
    L_0x01f0:
        r13 = new defpackage.aiub[r6];
        r0 = r12.E;
        r13[r14] = r0;
        r15.a(r13);
    L_0x01f9:
        r13 = 3;
        r13 = new defpackage.aiub[r13];
        r0 = r12.n;
        r13[r14] = r0;
        r14 = r12.o;
        r13[r6] = r14;
        r14 = r12.p;
        r13[r5] = r14;
        r15.a(r13);
        r13 = defpackage.amlc.DEFAULT;
        r12.a(r13);
        return;
    L_0x0211:
        r13 = move-exception;
        defpackage.ankx.a(r13);
        throw r13;
    L_0x0216:
        r13 = move-exception;
        defpackage.ankx.a(r13);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvs.<init>(android.content.Context, msh, aiuf):void");
    }

    public abstract void A();

    public abstract boolean B();

    public abstract boolean C();

    public abstract boolean D();

    public abstract void E();

    public abstract void F();

    public abstract int G();

    public abstract int H();

    public abstract void I();

    public abstract void J();

    public abstract boolean K();

    public abstract void L();

    public abstract void M();

    public abstract void N();

    public abstract void a(acwc acwc);

    public abstract boolean a(byte[] bArr);

    public abstract void c(String str, int i);

    public abstract void c(String str, int i, int i2);

    public abstract void c(List list, int i, int i2);

    public abstract boolean c(int i, KeyEvent keyEvent);

    public abstract void d(String str, int i);

    public abstract void d(String str, int i, int i2);

    public abstract void d(List list, int i, int i2);

    public abstract boolean d(int i, KeyEvent keyEvent);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void f(boolean z);

    public abstract void g(boolean z);

    public abstract void h(boolean z);

    public abstract void i(boolean z);

    public abstract void j(boolean z);

    public abstract byte[] x();

    public abstract void y();

    public abstract void z();

    private final void a() {
        if (!d()) {
            throw new IllegalStateException("This YouTubePlayer has been released");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return this.I ^ 1;
    }

    public final void e() {
        if (d()) {
            mtu mtu = this.F;
            if (mtu.g && !mtu.l) {
                mtu.b.b(true);
            }
        }
    }

    public final void f() {
        if (d()) {
            I();
        }
    }

    public final void g() {
        if (d()) {
            i(this.t.d());
        }
    }

    public final void h() {
        if (d()) {
            this.A = false;
            this.u.dismiss();
        }
    }

    public final void a(boolean z) {
        c(z);
    }

    public final void i() {
        amlr amlr = this.w;
        if (!(amlr == null || this.I)) {
            try {
                amlr.b(amkz.UNEXPECTED_SERVICE_DISCONNECTION.name());
            } catch (RemoteException e) {
                throw new ammg(e);
            }
        }
        c(true);
    }

    public final ammf j() {
        return ammk.a(this.C);
    }

    public final void a(amlt amlt) {
        a();
        this.v = amlt;
    }

    public final void a(amlr amlr) {
        a();
        this.w = amlr;
    }

    public final void a(amlp amlp) {
        a();
        this.x = amlp;
    }

    public final void a(amln amln) {
        a();
        this.y = amln;
    }

    public final void a(int i) {
        a();
        this.F.a(i);
    }

    public final int k() {
        a();
        return this.F.b();
    }

    public final void b(int i) {
        a();
        this.F.a(i | k());
    }

    public final void a(String str) {
        amlc a = amlc.a(str);
        a();
        a(a);
    }

    private final void a(amlc amlc) {
        String str = "Unhandled PlayerStyle";
        int ordinal;
        if (this.j == null || this.D == null) {
            ordinal = amlc.ordinal();
            if (ordinal == 0) {
                this.E.h(false);
                this.E.i(false);
                this.d.setFocusable(true);
            } else if (ordinal == 1) {
                this.E.h(true);
                this.E.i(false);
                this.d.setFocusable(true);
            } else if (ordinal != 2) {
                xtl.c(str);
                amlc = this.H;
            } else {
                this.E.i(true);
                this.d.setFocusable(false);
            }
            this.H = amlc;
            return;
        }
        ordinal = amlc.ordinal();
        if (ordinal == 0) {
            this.j.setVisibility(0);
            this.D.setVisibility(8);
            this.d.setFocusable(true);
        } else if (ordinal == 1) {
            this.j.setVisibility(8);
            this.D.setVisibility(0);
            this.D.h(false);
            this.d.setFocusable(true);
        } else if (ordinal != 2) {
            xtl.c(str);
            amlc = this.H;
        } else {
            this.j.setVisibility(8);
            this.D.setVisibility(0);
            this.D.h(true);
            this.d.setFocusable(false);
        }
        this.H = amlc;
    }

    public final void b(boolean z) {
        a();
        g(z);
    }

    public final void a(Configuration configuration) {
        if (d()) {
            mtu mtu = this.F;
            if (configuration.orientation != mtu.e) {
                mtu.e = configuration.orientation;
                int i = configuration.orientation;
                if (mtu.g && mtu.j && i == 1) {
                    mtu.b.a(false);
                } else if (mtu.n && mtu.m && i != 1) {
                    mtu.d();
                }
                mtu.m = false;
            }
        }
    }

    public final void a(String str, int i) {
        a();
        c(str, i);
    }

    public final void b(String str, int i) {
        a();
        d(str, i);
    }

    public final void a(String str, int i, int i2) {
        a();
        c(str, i, i2);
    }

    public final void b(String str, int i, int i2) {
        a();
        d(str, i, i2);
    }

    public final void a(List list, int i, int i2) {
        a();
        c(list, i, i2);
    }

    public final void b(List list, int i, int i2) {
        a();
        d(list, i, i2);
    }

    public final void l() {
        a();
        y();
    }

    public final void m() {
        a();
        z();
    }

    public final void n() {
        a();
        A();
    }

    public final void c(boolean z) {
        if (d()) {
            this.I = true;
            mtu mtu = this.F;
            mtu.o.e();
            mtu.c.disable();
            mtu.f = false;
            this.G.b();
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            j(z);
        }
    }

    public final boolean o() {
        a();
        return B();
    }

    public final boolean p() {
        a();
        return C();
    }

    public final boolean q() {
        a();
        return D();
    }

    public final void r() {
        a();
        if (p()) {
            E();
            return;
        }
        throw new NoSuchElementException("Called next at end of playlist");
    }

    public final void s() {
        a();
        if (q()) {
            F();
            return;
        }
        throw new NoSuchElementException("Called previous at start of playlist");
    }

    public final int t() {
        a();
        return G();
    }

    public final int u() {
        a();
        return H();
    }

    public final void c(int i) {
        a();
        e(i);
    }

    public final void d(int i) {
        a();
        f(i);
    }

    public final void d(boolean z) {
        a();
        f(z);
    }

    public final void e(boolean z) {
        a();
        h(z);
    }

    public final void v() {
        a();
        J();
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        return d() ? c(i, keyEvent) : false;
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        return d() ? d(i, keyEvent) : false;
    }

    public final Bundle w() {
        if (!d()) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("playerStyle", this.H.name());
        mtu mtu = this.F;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("isFullscreen", mtu.g);
        bundle2.putInt("defaultRequestedOrientation", mtu.i);
        bundle2.putInt("controlFlags", mtu.b());
        bundle.putBundle("fullscreenHelperState", bundle2);
        bundle.putByteArray("apiPlayerState", x());
        return bundle;
    }

    public final boolean a(Bundle bundle) {
        if (!d() || bundle == null) {
            return false;
        }
        a(bundle.getString("playerStyle"));
        mtu mtu = this.F;
        Bundle bundle2 = bundle.getBundle("fullscreenHelperState");
        mtu.h = true;
        mtu.a(bundle2.getInt("controlFlags"));
        mtu.i = bundle2.getInt("defaultRequestedOrientation");
        if (bundle2.getBoolean("isFullscreen")) {
            mtu.b.a(true);
        }
        return a(bundle.getByteArray("apiPlayerState"));
    }

    public final void a(String str, String str2) {
        this.z = str;
        mug mug = this.j;
        if (mug != null) {
            mug.a(str2);
        } else {
            this.E.c.b.c.setText(str2);
        }
    }

    public final void k(boolean z) {
        if (d()) {
            mtu mtu = this.F;
            mtu.g = z;
            if (z) {
                Object obj;
                if (mtu.j) {
                    obj = mtu.a.getResources().getConfiguration().orientation != 2 ? 1 : null;
                    mtu.b(6);
                    xoa xoa = mtu.c;
                    if (!xoa.a) {
                        xoa.enable();
                    }
                } else {
                    obj = null;
                }
                if (mtu.n) {
                    if (obj == null) {
                        mtu.m = false;
                        mtu.d();
                    } else {
                        mtu.m = true;
                    }
                }
                if (!mtu.l) {
                    if (obj == null || !mtu.d) {
                        mtu.b.b(true);
                        return;
                    }
                    return;
                }
                return;
            }
            mtu.m = false;
            if (mtu.j) {
                if (!mtu.k) {
                    mtu.c.disable();
                }
                if (mtu.a()) {
                    mtu.b(mtu.i);
                }
            }
            if (mtu.n) {
                mtu.o.b();
            }
            if (!mtu.l) {
                mtu.b.b(false);
            }
        }
    }

    public final void O() {
        if (d()) {
            this.F.a(true);
        }
    }

    public final void P() {
        if (d()) {
            this.F.a(false);
        }
    }

    public final void Q() {
        if (d()) {
            mtu mtu = this.F;
            mtu.p = true;
            mtu.c();
            a(acwc.PLAYER_YOU_TUBE_BUTTON);
        }
    }

    public final void R() {
        if (d()) {
            mtu mtu = this.F;
            mtu.p = false;
            mtu.c();
        }
    }

    public final void S() {
        if (d()) {
            this.G.a();
        }
    }

    public final void T() {
        if (d()) {
            this.G.b();
        }
    }

    public final void a(String str, amkz amkz) {
        if (d() && o()) {
            n();
            ammj.a(str, new Object[0]);
            a(amkz);
        }
    }

    public final void U() {
        this.a.post(new mwf(this));
    }

    public final void V() {
        this.a.post(new mwe(this));
    }

    public final void W() {
        this.a.post(new mwh(this));
    }

    public final void X() {
        this.a.post(new mwg(this));
    }

    public final void b(String str) {
        this.a.post(new mwj(this, str));
    }

    public final void Y() {
        this.a.post(new mwi(this));
    }

    public final void Z() {
        this.a.post(new mwl(this));
    }

    public final void aa() {
        this.a.post(new mwk(this));
    }

    public final void a(amkz amkz) {
        this.a.post(new mvw(this, amkz));
    }

    public final void ab() {
        this.a.post(new mvz(this));
    }

    public final void ac() {
        this.a.post(new mvy(this));
    }

    public final void ad() {
        this.a.post(new mwb(this));
    }

    public final void l(boolean z) {
        this.a.post(new mwa(this, z));
    }

    public final void a(long j) {
        this.a.post(new mwd(this, j));
    }

    public final void m(boolean z) {
        this.a.post(new mwc(this, z));
    }
}
