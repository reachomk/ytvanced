package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aexj */
public final class aexj implements aexg, afai, afdr, Observer {
    private final xsc A;
    private final aexq B = new aexm(this);
    private final oev C;
    private final aeya D;
    private final aeyd E;
    private aexq F = this.B;
    private final boolean G;
    public final oay a;
    public final aeqo b;
    public final oye c;
    public final afis d;
    public final nyx e;
    public final aexc f;
    public final aexh g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final Handler i;
    public final aeyg j;
    public final aeyj k;
    public final aeyh l;
    public final afjj m;
    public final aema n;
    public final aeyo o;
    public final oav p = new oav();
    public afiq[] q;
    public ool r;
    public aewh s;
    public aewh t;
    public Surface u;
    public ofb v;
    public float w = 1.0f;
    public int x;
    public final affj y;
    public final Context z;

    public aexj(aeqo aeqo, xsc xsc, ScheduledExecutorService scheduledExecutorService, aeeu aeeu, Context context, afis afis, afjc afjc, afjj afjj, xhv xhv, aema aema, ozb ozb, afgz afgz, afjv afjv, aetb aetb, affj affj, bcaa bcaa) {
        aeqo aeqo2 = aeqo;
        Context context2 = context;
        afjj afjj2 = afjj;
        affj affj2 = affj;
        oye oye = oye.a;
        aexs aexs = new aexs(scheduledExecutorService, aeqo2, aeeu, context2);
        amro amro = affd.a;
        amro amro2 = affd.b;
        this.A = xsc;
        this.c = oye;
        oax oax = new oax();
        this.a = oax.a(null, oye);
        this.b = aeqo2;
        this.d = afis;
        this.m = afjj2;
        this.n = aema;
        this.z = context2;
        aexn aexn = new aexn(this);
        boolean z = true;
        HashMap hashMap = new HashMap(1);
        hashMap.put("aid", xsl.a(aexs.d));
        aeyt aeyt = new aeyt(aetb, hashMap, this.h, aexn, this.m, this.a);
        aexs aexs2 = aexs;
        this.f = new aexc(aexs, aeyt, afjc, xhv, afgz, afjv, bcaa, amro, amro2, ozb);
        this.o = new aeyo(this.f, this.h);
        this.D = new aeya(this.f);
        this.j = new aeyg(aexs2.d, this.f.b.m(), this.a, this.h, this.D);
        this.k = new aeyj(aexs2.d, this.a, this.f, this.h, this.D);
        afjc afjc2 = this.f.c;
        this.l = new aeyh(this.h, this.a, afjc2.e(), afjc2.b(), afjc2.c(), afjc2.d());
        this.C = new oev();
        Context context3 = aexs2.d;
        this.e = new nyz(new oal[]{this.j, this.k, this.l, this.C}, this.o, new aeyb(this.f), nza.a(context3), oye.a, Looper.getMainLooper());
        oay oay = this.a;
        Object obj = this.e;
        if (!(oay.c == null || oay.b.a.isEmpty())) {
            z = false;
        }
        oxz.b(z);
        oay.c = (oaf) oxz.a(obj);
        this.e.a((oah) this.a);
        this.g = new aexh(this, this.f, afjj2);
        oay = this.a;
        oay.a.add(this.g);
        this.f.c.addObserver(this);
        this.f.f.addObserver(this);
        this.i = new Handler(this.e.d());
        this.y = affj2;
        this.E = new aeyd(this, affj2);
        this.G = afjc.a().t;
    }

    public final void a(String str, aajf aajf) {
        if (this.n.b()) {
            synchronized (this) {
                aexq aexq = this.F;
                if (aexq instanceof aexm) {
                    a(new aexo(this, aajf));
                } else {
                    String str2 = "Invalid warmVideo state transition. desiredState: ";
                    str = aexq.getClass().getSimpleName();
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    aepe.a(str);
                }
            }
        }
    }

    public final void bx_() {
        nyx nyx = this.e;
        nyx.a(nyx.c(), 0);
        m();
    }

    public final void a(aaje aaje, aeuy aeuy) {
        if (!this.n.b()) {
            aaje.i.a(null);
        } else if (aaje.l) {
            try {
                this.n.a(aaje, aeuy);
            } catch (afgr unused) {
                aepe.a("MissingStreamException in sendOnesieRequestEarlyFetch.");
            }
        } else {
            synchronized (this) {
                aexq aexq = this.F;
                if (aexq instanceof aexm) {
                    a(new aexr(this, aaje, this.B.a, this.n.d().o, aeuy));
                } else {
                    String str = "Invalid loadOnesieVideo state transition. desiredState: ";
                    String simpleName = aexq.getClass().getSimpleName();
                    if (simpleName.length() == 0) {
                        simpleName = new String(str);
                    } else {
                        simpleName = str.concat(simpleName);
                    }
                    aepe.a(simpleName);
                }
            }
        }
    }

    public final synchronized afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        afne afne;
        affa affa2 = affa;
        aeuy aeuy2 = aeuy;
        synchronized (this) {
            aexq aexp;
            this.y.c(afne.ANDROID_EXOPLAYER_V2);
            if (this.F.a(str, aajj, aeuy2, aajs)) {
                aexq aexp2 = new aexp(this, afkh, (afaj) amqw.a(this.F.b()), f2, z, affa2.a, f, i);
            } else {
                try {
                    aexp = new aexp(this, str, afkh, f2, aajj, aeuy, z, affa2.a, aajs, f, i);
                } catch (afgr e) {
                    a(aeuy2, new afif("fmt.noneavailable", o(), e.getMessage()));
                    return afne.ANDROID_EXOPLAYER_V2;
                }
            }
            a(aexp);
            long j = affa2.a;
            if (j > 0) {
                aeuy2.a("st", (aevf) new aetw(Long.toString(j)));
            }
            afne = afne.ANDROID_EXOPLAYER_V2;
        }
        return afne;
    }

    public final synchronized boolean a(affw affw) {
        boolean z;
        if (this.F.a(affw)) {
            z();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void b() {
        if (this.F.c()) {
            z();
        }
    }

    public final void c() {
        afaj afaj = this.f.j;
        if (afaj != null) {
            afgv b = b(afaj);
            if (b != null) {
                this.o.a(this.e, b.f);
                this.o.a(afaj);
            }
        }
    }

    public final afgv b(afaj afaj) {
        try {
            afgv a = a(afaj.e(), afaj.b, afaj.d(), afaj.a());
            afaj.a(a);
            return a;
        } catch (afgr e) {
            a(afaj.c, new afif("fmt.noneavailable", o(), e.getMessage()));
            return null;
        }
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        aajs aajs2 = aajs;
        aajj aajj2 = aajj;
        aexc aexc = this.f;
        afgz afgz = aexc.e;
        List list = aajs2.n;
        Set set = affd.a(aajs, aajj, aexc.c, aexc.a(aajj), this.f.g).a;
        aexc = this.f;
        Set set2 = affd.a(aajs, aajj, aexc.c, aexc.b(aajj)).a;
        return afgz.a(aajj2, list, afgt, set, set2, true, false, z ^ 1, true, i, afgs.c);
    }

    public final aahr d() {
        afaj afaj = this.f.j;
        return afaj != null ? afaj.q : null;
    }

    public final aahr e() {
        afaj afaj = this.f.j;
        return afaj != null ? afaj.g : null;
    }

    public final boolean f() {
        return this.f.j != null && this.e.f();
    }

    public final boolean g() {
        return this.e.e() == 2;
    }

    public final long o() {
        oav B = B();
        return B != null ? B.c() + this.e.l() : -1;
    }

    public final long a(long j) {
        ool ool = this.r;
        return ool instanceof afae ? ((afae) ool).a(nyr.b(j)) : -1;
    }

    public final long t() {
        oav B = B();
        if (B != null) {
            long j = B.c;
            if (j != -9223372036854775807L) {
                return j + this.e.l();
            }
        }
        return -1;
    }

    public final long u() {
        oav B = B();
        return (B == null || B.i == -9223372036854775807L) ? -1 : B.c() + (B.i / 1000);
    }

    public final long v() {
        oav B = B();
        return B != null ? B.c() + this.e.m() : -1;
    }

    public final int w() {
        afgp b;
        afaj afaj = this.f.j;
        if (afaj != null) {
            b = afaj.b();
        } else {
            b = afgp.a;
        }
        return b.a(t(), this.A.a());
    }

    public final int i() {
        aexh aexh = this.g;
        int i = aexh.a;
        odk odk = aexh.b;
        return i + (odk != null ? odk.e : 0);
    }

    public final int j() {
        return this.g.l();
    }

    public final defpackage.aerm k() {
        /*
        r9 = this;
        r0 = r9.f;
        r0 = r0.j;
        r1 = r9.f;
        r1 = r1.b;
        r8 = new aerl;
        r8.<init>();
        r2 = r1.e;
        if (r2 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0060;
    L_0x0012:
        r2 = "securityLevel";
        r2 = r1.a(r2);
        r3 = r2.hashCode();
        r4 = -1;
        r5 = 0;
        r6 = 2;
        r7 = 1;
        switch(r3) {
            case 2405: goto L_0x0038;
            case 2406: goto L_0x002e;
            case 2407: goto L_0x0024;
            default: goto L_0x0023;
        };
    L_0x0023:
        goto L_0x0042;
    L_0x0024:
        r3 = "L3";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0042;
    L_0x002c:
        r2 = 2;
        goto L_0x0043;
    L_0x002e:
        r3 = "L2";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0042;
    L_0x0036:
        r2 = 1;
        goto L_0x0043;
    L_0x0038:
        r3 = "L1";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0042;
    L_0x0040:
        r2 = 0;
        goto L_0x0043;
    L_0x0042:
        r2 = -1;
    L_0x0043:
        if (r2 == 0) goto L_0x004e;
    L_0x0045:
        if (r2 == r7) goto L_0x004e;
    L_0x0047:
        if (r2 == r6) goto L_0x004b;
    L_0x0049:
        r3 = -1;
        goto L_0x004f;
    L_0x004b:
        r2 = 3;
        r3 = 3;
        goto L_0x004f;
    L_0x004e:
        r3 = 1;
    L_0x004f:
        r2 = r1.e;
        if (r2 == r7) goto L_0x0055;
    L_0x0053:
        r4 = 1;
        goto L_0x0056;
    L_0x0055:
        r4 = 0;
    L_0x0056:
        if (r2 != r6) goto L_0x0059;
    L_0x0058:
        r5 = 1;
    L_0x0059:
        r6 = r1.f;
        r7 = 0;
        r2 = r8;
        r2.a(r3, r4, r5, r6, r7);
    L_0x0060:
        r2 = r1.g;
        if (r2 == 0) goto L_0x0095;
    L_0x0064:
        r2 = r1.c;
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0095;
    L_0x006c:
        r2 = new android.util.SparseIntArray;
        r2.<init>();
        r1 = r1.c;
        r1 = r1.values();
        r1 = r1.iterator();
    L_0x007b:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0093;
    L_0x0081:
        r3 = r1.next();
        r3 = (defpackage.aeyz) r3;
        r4 = r3.a;
        r4 = r4.intValue();
        r3 = r3.b;
        r2.put(r4, r3);
        goto L_0x007b;
    L_0x0093:
        r8.b = r2;
    L_0x0095:
        r1 = defpackage.afne.ANDROID_EXOPLAYER_V2;
        r8.a = r1;
        if (r0 == 0) goto L_0x00a0;
    L_0x009b:
        r0 = r0.e();
        goto L_0x00a1;
    L_0x00a0:
        r0 = 0;
    L_0x00a1:
        r8.c = r0;
        r0 = r8.a();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexj.k():aerm");
    }

    public final synchronized void m() {
        if (this.e.e() == 4) {
            this.F.a(0);
        }
        this.F.a(true);
        z();
    }

    public final synchronized void n() {
        if (this.F.a(false)) {
            z();
        }
    }

    public final synchronized void b(long j) {
        if (this.F.a(j)) {
            z();
        }
    }

    public final synchronized void c(afaj afaj) {
        if (afaj.equals(this.F.b())) {
            b(0);
        }
    }

    public final void a(boolean z) {
        this.y.d(afne.ANDROID_EXOPLAYER_V2);
        if (z) {
            this.f.d().e();
        }
        x();
    }

    public final synchronized void x() {
        aexq aexq = this.F;
        aexq aexq2 = this.B;
        if (aexq != aexq2) {
            aexq2.b = false;
        }
        a(aexq2);
    }

    public final void p() {
        this.y.e(afne.ANDROID_EXOPLAYER_V2);
        this.f.d().e();
        if (this.G) {
            this.B.b = true;
        }
        a(this.B);
    }

    public final void q() {
        afkh afkh = this.f.i;
        if (afkh != null) {
            afkh.c();
        }
    }

    public final synchronized void a(afkh afkh) {
        this.y.a(afne.ANDROID_EXOPLAYER_V2);
        if (this.F.a(afkh)) {
            z();
        }
    }

    public final synchronized void r() {
        this.y.b(afne.ANDROID_EXOPLAYER_V2);
        if (this.F.a(null)) {
            z();
        }
    }

    public final synchronized void a(float f) {
        if (this.F.b(f)) {
            z();
        }
    }

    public final synchronized void b(float f) {
        if (this.F.a(f)) {
            z();
        }
    }

    public final int a(aajs aajs, aajj aajj) {
        afjc afjc = this.f.c;
        int i = !afdp.a(aajs, false) ? 4 : 5;
        if (afjc.i()) {
            i |= 16;
        }
        return aajj.am() ? i | 2 : i;
    }

    public final String l() {
        afaj afaj = this.f.j;
        return afaj != null ? afaj.b : null;
    }

    public final float s() {
        return this.e.i().b;
    }

    /* JADX WARNING: Missing block: B:6:0x0015, code skipped:
            if (r1.g != false) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:8:0x0020, code skipped:
            if (r0.b.getBoolean("medialib_enable_exo_player_v2", false) != false) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:10:0x0024, code skipped:
            if (r5.t != false) goto L_0x0027;
     */
    /* JADX WARNING: Missing block: B:12:0x002b, code skipped:
            if (r5.m() != false) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:14:0x0030, code skipped:
            if (r5.u == 3) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:16:0x0037, code skipped:
            if (r5.r() != false) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:18:0x003d, code skipped:
            if (r5.s() != false) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:20:0x0043, code skipped:
            if (r5.x() != false) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:22:0x0049, code skipped:
            if (r5.c() != false) goto L_0x007d;
     */
    /* JADX WARNING: Missing block: B:24:0x004f, code skipped:
            if (r5.n() == false) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:26:0x0055, code skipped:
            if (r5.d() == false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:28:0x005b, code skipped:
            if (defpackage.affd.c(r5, r6, r0) != false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:30:0x006b, code skipped:
            if (defpackage.affd.b(r5, r6, r0, r4.f.a(r6), r4.f.g) != false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:32:0x0071, code skipped:
            if (r5.e() != false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:34:0x0077, code skipped:
            if (r5.f() == false) goto L_0x007a;
     */
    /* JADX WARNING: Missing block: B:35:0x007a, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:37:0x007c, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:38:0x007d, code skipped:
            return false;
     */
    public final boolean b(defpackage.aajs r5, defpackage.aajj r6) {
        /*
        r4 = this;
        r0 = r4.f;
        r0 = r0.c;
        r1 = r6.c;
        r2 = r1.a;
        r2 = r2 & 2;
        r3 = 0;
        if (r2 == 0) goto L_0x0018;
    L_0x000d:
        r1 = r1.d;
        if (r1 != 0) goto L_0x0013;
    L_0x0011:
        r1 = defpackage.arhh.bv;
    L_0x0013:
        r1 = r1.g;
        if (r1 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0022;
    L_0x0018:
        r1 = r0.b;
        r2 = "medialib_enable_exo_player_v2";
        r1 = r1.getBoolean(r2, r3);
        if (r1 == 0) goto L_0x007d;
    L_0x0022:
        r1 = r5.t;
        if (r1 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x002d;
    L_0x0027:
        r1 = r5.m();
        if (r1 != 0) goto L_0x007d;
    L_0x002d:
        r1 = r5.u;
        r2 = 3;
        if (r1 == r2) goto L_0x0033;
    L_0x0032:
        goto L_0x007d;
    L_0x0033:
        r1 = r5.r();
        if (r1 != 0) goto L_0x007d;
    L_0x0039:
        r1 = r5.s();
        if (r1 != 0) goto L_0x007d;
    L_0x003f:
        r1 = r5.x();
        if (r1 != 0) goto L_0x007d;
    L_0x0045:
        r1 = r5.c();
        if (r1 != 0) goto L_0x007d;
    L_0x004b:
        r1 = r5.n();
        if (r1 == 0) goto L_0x0057;
    L_0x0051:
        r1 = r5.d();
        if (r1 == 0) goto L_0x007b;
    L_0x0057:
        r1 = defpackage.affd.c(r5, r6, r0);
        if (r1 != 0) goto L_0x007b;
    L_0x005d:
        r1 = r4.f;
        r1 = r1.a(r6);
        r2 = r4.f;
        r2 = r2.g;
        r6 = defpackage.affd.b(r5, r6, r0, r1, r2);
        if (r6 != 0) goto L_0x007b;
    L_0x006d:
        r6 = r5.e();
        if (r6 != 0) goto L_0x007b;
    L_0x0073:
        r5 = r5.f();
        if (r5 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007b;
    L_0x007a:
        return r3;
    L_0x007b:
        r5 = 1;
        return r5;
    L_0x007d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexj.b(aajs, aajj):boolean");
    }

    public final void a(nyy nyy, afaj afaj) {
        aeuy d;
        int i;
        if (afaj == null) {
            d = this.f.d();
            i = 0;
        } else {
            aeuy aeuy = afaj.c;
            i = afaj.a().c;
            d = aeuy;
        }
        afif a = aevl.a((Exception) nyy, o(), this.u, this.f.d, i);
        if (!a.a().equals("staleconfig")) {
            a = a.f();
        }
        if (a.a().equals("fmt.decode")) {
            this.y.a(d);
        }
        d.a(a);
        if (d.equals(this.f.d())) {
            x();
        }
    }

    private final oav B() {
        oau r = this.e.r();
        if (r.c()) {
            return null;
        }
        if (!(r instanceof aeyn)) {
            return r.a(this.e.k(), this.p);
        }
        aeyn aeyn = (aeyn) r;
        int k = this.e.k();
        return aeyn.b[k].a(0, this.p);
    }

    public final void a(aeuy aeuy, afif afif) {
        aeuy.a(afif);
        if (aeuy.equals(this.f.d()) && afif.d()) {
            x();
        }
    }

    public final void a(afif afif, afaj afaj) {
        this.h.post(new aexi(this, afaj, afif));
    }

    public final void a(Exception exception, aeuy aeuy) {
        a(aeuy, aevl.a(exception, o(), "keyerror", (Object) exception, false));
    }

    public final synchronized void h() {
        this.F.d();
    }

    /* JADX WARNING: Missing block: B:13:0x0036, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:18:0x003b, code skipped:
            return;
     */
    public final synchronized void a(defpackage.afaj r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        if (r7 == 0) goto L_0x003a;
    L_0x0003:
        r0 = r6.F;	 Catch:{ all -> 0x0037 }
        r0 = r0.b();	 Catch:{ all -> 0x0037 }
        r0 = r7.equals(r0);	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x003a;
    L_0x000f:
        r0 = r6.B();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x0015:
        r1 = r0.i;	 Catch:{ all -> 0x0037 }
        r3 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 == 0) goto L_0x0035;
    L_0x0020:
        r1 = r0.c();	 Catch:{ all -> 0x0037 }
        r7 = r7.c;	 Catch:{ all -> 0x0037 }
        r3 = r0.i;	 Catch:{ all -> 0x0037 }
        r3 = defpackage.nyr.a(r3);	 Catch:{ all -> 0x0037 }
        r3 = r3 + r1;
        r7.a(r1, r3);	 Catch:{ all -> 0x0037 }
        r6.z();	 Catch:{ all -> 0x0037 }
        monitor-exit(r6);
        return;
    L_0x0035:
        monitor-exit(r6);
        return;
    L_0x0037:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
    L_0x003a:
        monitor-exit(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexj.a(afaj):void");
    }

    public final void y() {
        z();
    }

    public final void update(Observable observable, Object obj) {
        if (!(observable instanceof afjc)) {
            aexc aexc = this.f;
            if (observable == aexc.f) {
                afaj afaj = aexc.j;
                if (afaj != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        d(afaj);
                        return;
                    }
                    this.h.post(new aexl(this, afaj));
                }
            }
        } else if ((obj instanceof Integer) && ((Integer) obj).intValue() == 2) {
            z();
        }
    }

    public final afgv a(aajs aajs, String str, aajj aajj, affh affh) {
        aajs aajs2 = aajs;
        aajj aajj2 = aajj;
        aexc aexc = this.f;
        affe a = affd.a(aajs2, aajj2, aexc.c, aexc.b(aajj2));
        aexc aexc2 = this.f;
        afgz afgz = aexc2.e;
        List list = aajs2.n;
        Set set = affh.a;
        Set set2 = a.a;
        boolean l = aexc2.b.l();
        boolean z = false;
        if (l && aajj.T()) {
            z = true;
        }
        return afgz.a(aajj, list, null, set, set2, true, false, false, false, afam.a(aajs2, z), str);
    }

    public final afkn a(afkh afkh, afaj afaj) {
        afjc afjc = this.f.c;
        return afdp.a(afaj.e(), afkh, afaj.d(), afjc, afaj.i.c == 3, false, afjc.e);
    }

    public final void d(afaj afaj) {
        aexc aexc = this.f;
        afjs a = afdp.a(aexc.f, aexc.b());
        this.o.a(this.e, a);
        if (afaj.k) {
            aexc aexc2 = this.f;
            afaj.a(aexc2.c, aexc2.d, a);
        }
    }

    public final synchronized void a(ool ool) {
        this.r = ool;
        ool.a(this.h, this.a);
        oak a = this.e.a(this.j);
        a.a(10001);
        a.a(new aewj(this.m, 1, 0));
        a.a();
        a = this.e.a(this.l);
        a.a(10001);
        a.a(new aewj(this.m, 2, 0));
        a.a();
        a = this.e.a(this.k);
        a.a(10001);
        a.a(new aewj(this.m, 2, 0));
        a.a();
        this.a.d();
        this.e.a(ool);
    }

    public final synchronized void a(aexq aexq) {
        this.F = aexq;
        z();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void z() {
        aexq aexq = this.F;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            aexq.e();
            return;
        }
        afkh afkh = aexq.c.f.i;
        if (afkh != aexq.a) {
            if (afkh != null) {
                afkh.c();
                afkh.a(null);
                aexq.c.y.a(null, afne.ANDROID_EXOPLAYER_V2);
            }
            int i = 1;
            int i2 = afkh == null ? 1 : 0;
            afkh afkh2 = aexq.a;
            if (afkh2 != null) {
                i = 0;
            }
            aexq.c.B.a(afkh2);
            aexq.c.f.i = aexq.a;
            if ((i2 ^ i) != 0) {
                aexq.c.o.a(aexq.b());
            }
            afkh = aexq.a;
            if (afkh != null) {
                afkh.a(aexq.c.E);
                aexj aexj = aexq.c;
                aexj.y.a(aexj.E, afne.ANDROID_EXOPLAYER_V2);
            }
        }
        if (aexq.a != null) {
            afaj b = aexq.b();
            if (b != null) {
                affj affj = aexq.c.y;
                aeuy aeuy = b.c;
                if (affj.a && affj.b == null) {
                    affj.a(16, afne.ANDROID_EXOPLAYER_V2);
                    affj.a(aeuy);
                }
                aexj aexj2 = aexq.c;
                if (aexj2.G) {
                    aexq.a.a(aexj2.E);
                }
                afkn a = aexq.c.a(aexq.a, b);
                aexq.c.y.a(a, afne.ANDROID_EXOPLAYER_V2);
                aexq.a.a(a, aexq.c.f.c.g(), aexq.c.f.c.h());
            }
            if (b != null || aexq.c.G) {
                aexq.g();
            }
        } else if (aexq.c.G) {
            aexq.g();
        }
        aexq.a();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void A() {
        this.F.g();
    }

    public final void a(int i) {
        this.h.postDelayed(new aexk(this), (long) i);
    }

    public final void a(afaj afaj, int i) {
        this.o.a(this.e, afaj.f().f);
        aexc aexc = this.f;
        afjs a = afdp.a(aexc.f, aexc.b());
        aexc aexc2 = this.f;
        afaj.a(a, i, aexc2.c, aexc2.d);
    }

    public final void a(aeuy aeuy, int i, String str, Object obj) {
        a(aeuy, new afif(i, str, o(), obj));
    }

    public final void a(IOException iOException, aeuy aeuy) {
        a(aeuy, aevl.a(iOException, o(), this.f.d, 8));
    }
}
