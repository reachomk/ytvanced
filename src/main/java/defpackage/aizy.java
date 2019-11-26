package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: aizy */
public final class aizy implements ahfz, ajkl, ajmk, ajoy {
    public final Context a;
    public final aepu b;
    public final ahgn c;
    public final aiqf d;
    public final afgs e;
    public aixk f;
    public ajaj g;
    public final ajbx h;
    private final xci i;
    private final ajai j;
    private final Handler k;
    private final airt l;
    private final ajgn m;
    private final ajmh n;
    private final aiyw o;
    private final bcaa p;
    private final ahfv q;
    private final ajlg r;
    private final zzl s;
    private final Runnable t;
    private final ahfw u;
    private final ahgk v;
    private final aixn w;
    private final aixu x;
    private final aiws y;
    private final ajbk z;

    public aizy(Context context, xci xci, aepu aepu, ajgn ajgn, ajmh ajmh, ahgn ahgn, aiqf aiqf, airt airt, aiyw aiyw, bcaa bcaa, ajmf ajmf, afgs afgs, ahfv ahfv, ajlg ajlg, afmi afmi, zzl zzl, zyw zyw, ajbp ajbp, aixn aixn, aixu aixu, aiws aiws, ajbx ajbx, aiyx aiyx, bcud bcud) {
        bctz bctz;
        xci xci2 = xci;
        Object obj = ajgn;
        ahgn ahgn2 = ahgn;
        Object obj2 = aiyw;
        Object obj3 = ahfv;
        zyw zyw2 = zyw;
        ajbp ajbp2 = ajbp;
        this.a = (Context) amqw.a((Object) context);
        this.i = (xci) amqw.a((Object) xci);
        this.b = (aepu) amqw.a((Object) aepu);
        this.c = (ahgn) amqw.a((Object) ahgn);
        this.d = (aiqf) amqw.a((Object) aiqf);
        this.l = (airt) amqw.a((Object) airt);
        this.p = (bcaa) amqw.a((Object) bcaa);
        this.e = (afgs) amqw.a((Object) afgs);
        this.r = (ajlg) amqw.a((Object) ajlg);
        this.s = (zzl) amqw.a((Object) zzl);
        this.q = obj3;
        if (aipo.a(zyw2, 8589934592L)) {
            bctz bctz2 = ajbp2.a;
            ahfv.getClass();
            bctz2.a(new ajab(obj3));
            bctz2 = ajbp2.d;
            ahfv.getClass();
            bctz2.a(new ajaa(obj3));
        } else {
            xci2.a(obj3);
        }
        if (aipo.h(zyw) && aipo.g(zyw)) {
            bctz = ajbp2.d;
            ahgn.getClass();
            bctz.a(new ajad(ahgn2));
        }
        afmi.a = (afnh) amqw.a((Object) aepu);
        this.m = obj;
        if (obj != null) {
            if (aipo.a(zyw2, 17179869184L)) {
                bctz = ajbp2.a;
                ajgn.getClass();
                bctz.a(new ajac(obj));
                bctz = ajbp2.e;
                ajgn.getClass();
                bctz.a(new ajaf(obj));
            } else {
                xci2.a(obj);
            }
        }
        this.n = ajmh;
        this.o = obj2;
        this.v = new aizw(this);
        if (obj2 != null) {
            if (aipo.a(zyw2, 34359738368L)) {
                bcuo[] bcuoArr = new bcuo[]{obj2.c.a.a(new aizb(obj2)), obj2.c.c.a(new aiza(obj2)), obj2.a.a(new aizd(obj2)), obj2.b.a(new aizc(obj2))};
            } else {
                xci2.a(obj2);
            }
        }
        this.w = aixn;
        aixu aixu2 = aixu;
        this.x = aixu2;
        aiws aiws2 = aiws;
        this.y = aiws2;
        ajbx ajbx2 = ajbx;
        this.h = ajbx2;
        this.z = new ajbk(this, bcud, aiyx, xci, airt, ajbx2, aixn, aixu2, aiws2);
        this.j = new ajai(this);
        this.k = new Handler(context.getMainLooper());
        this.u = new ahfw(context);
        ahfw ahfw = this.u;
        ahfw.b = (aiqf) amqw.a((Object) aiqf);
        if (!ahfw.c) {
            ahfw.a.registerReceiver(ahfw, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            ahfw.c = true;
        }
        this.g = new ajaj(this);
        ahgn2.d = new ajae(this);
        ahgn2.j = this.g;
        this.t = new ajah(this, ajmf, aiqf, aixn, ajgn);
    }

    public final void a(aiqq aiqq) {
        a(aiqq, aiqw.a);
    }

    public final void a(aiqq aiqq, aiqw aiqw) {
        xak.a();
        amqw.a((Object) aiqq);
        this.i.d(new ahjo());
        if (!(aiqw == null || aiqw.a() == null)) {
            aiqw.a().a("pl_i");
        }
        ahgn ahgn = this.c;
        if (aipo.h(ahgn.f)) {
            ahgn.g();
            if (aipo.g(ahgn.f) && !ahgn.c()) {
                ((aisx) ahgn.i.get()).b(false);
            }
        }
        this.r.a();
        G();
        if (C()) {
            if (aiqq.j()) {
                ajlj ajlj = this.y.a;
                if (ajlj != null && ajlj.a(airi.PLAYBACK_LOADED) && !ajlj.b(airi.ENDED) && TextUtils.equals(aiqq.b(), ajlj.l()) && this.f.a(aiqq)) {
                    aixn aixn = this.w;
                    ajlj ajlj2 = this.y.a;
                    String E = ajlj2 != null ? ajlj2.E() : null;
                    aiye d = this.z.d();
                    xak.a();
                    amqw.a((Object) aiqq);
                    aixn.k = aiqq;
                    aixn.b(1);
                    aixn.e.d().e_(new ainy(aiqq.c()));
                    aixn.a(aiqq, 1, E, d, aiqw.a);
                    return;
                }
            }
            aizl b = this.f.b(aiqq);
            if (b != null) {
                b(b);
                return;
            }
        }
        h();
        this.f = ((aiyh) this.p.get()).a(aiqq);
        aixn aixn2 = this.w;
        aixn2.k = aiqq;
        aixn2.n = aiqq.a.p;
        aixn2.i = ((aixl) aixn2.a.get()).b(aiqq);
        this.w.a();
        this.f.a();
        if (aiqq.q()) {
            this.i.c(ainz.NAVIGATION);
        }
        this.l.a(aiqq.n());
        this.l.b(aiqq.o());
        if (C()) {
            this.f.b();
            this.z.a(aiqq, aiqw);
            this.j.a();
        }
    }

    public final void a(ajcp ajcp) {
        aiqw aiqw = aiqw.a;
        xak.a();
        this.i.d(new ahjr());
        if (!(aiqw == null || aiqw.a() == null)) {
            aiqw.a().a("pl_r");
        }
        h();
        ahgc ahgc = ajcp.e;
        if (ahgc != null) {
            this.q.h = ahgc;
        }
        aiqg aiqg = ajcp.b;
        if (aiqg != null) {
            aiqf aiqf = this.d;
            aiqf.e = aiqg.a;
            aiqf.f = aiqg.b;
            aiqf.i = aiqg.c;
            aiqf.j = aiqg.d;
            aiqf.g = aiqg.h;
            aiqf.l = aiqg.e;
            aiqf.m = aiqg.f;
            aiqf.o = aiqg.g;
            aiqf.p = aiqg.i;
            aiqf.r = aiqg.j;
        }
        this.f = ((aiyh) this.p.get()).a(ajcp.d);
        if (C()) {
            aixn aixn = this.w;
            aizx aizx = (aizs) ajcp.d;
            amqw.a((Object) aizx);
            aixn.l = aizx.a;
            aixn.m = aizx.b;
            aixn.j = aizx.d;
            aixn.k = aizx.e;
            aixn.n = aizx.f;
            aixn.i = ((aixl) aixn.a.get()).b(aizx);
            this.w.a();
            this.f.a();
            ajpz ajpz = ajcp.c;
            xak.a();
            this.r.a();
            G();
            if (ajpz == null) {
                this.f.b();
                this.z.a(this.w.k, aiqw);
            } else {
                this.f.b();
                this.h.a();
                this.y.a(ajpz, aiqw);
                if (airg.a(this.w.o, 5)) {
                    aixn aixn2 = this.w;
                    aixn2.a(aixn2.c(), null, aiqw.a());
                } else {
                    this.f.b();
                    this.z.a(ajpz.d, aiqw);
                }
            }
            this.j.a();
        } else {
            this.i.d(new ahjp());
        }
        x();
    }

    public final boolean d() {
        xak.a();
        if (D() == null || !D().a(airi.READY)) {
            return g();
        }
        xak.a();
        if (D() != null) {
            ajpu D = D().D();
            if (D.Z() != null) {
                aiqs s = this.w.k.s();
                s.g = D.T().c;
                aiqq b = s.b();
                this.y.a(b, aiqw.b().a());
                this.x.a(D.Z(), b, new ajag(), null);
                return true;
            }
        }
        if (!g()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Missing block: B:14:0x004f, code skipped:
            if (defpackage.airg.a(r2.o, 3) == false) goto L_0x0056;
     */
    public final boolean e() {
        /*
        r9 = this;
        r0 = r9.C();
        r1 = 0;
        if (r0 == 0) goto L_0x005e;
    L_0x0007:
        r2 = r9.w;
        r0 = r9.y;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r0.E();
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        r5 = r0;
        r0 = r9.z;
        r6 = r0.d();
        r0 = r2.o;
        r8 = 1;
        r3 = new int[r8];
        r4 = 5;
        r3[r1] = r4;
        r0 = defpackage.airg.a(r0, r3);
        if (r0 == 0) goto L_0x0036;
    L_0x002a:
        r3 = r2.j;
        if (r3 == 0) goto L_0x0036;
    L_0x002e:
        r4 = 1;
        r7 = defpackage.aiqw.a;
        r2.a(r3, r4, r5, r6, r7);
        r1 = 1;
        goto L_0x0056;
    L_0x0036:
        r0 = r2.o;
        r3 = new int[r8];
        r4 = 4;
        r3[r1] = r4;
        r0 = defpackage.airg.a(r0, r3);
        if (r0 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r0 = r2.o;
        r3 = new int[r8];
        r4 = 3;
        r3[r1] = r4;
        r0 = defpackage.airg.a(r0, r3);
        if (r0 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0056;
    L_0x0052:
        r3 = r2.k;
        if (r3 != 0) goto L_0x0057;
    L_0x0056:
        return r1;
    L_0x0057:
        r4 = 1;
        r7 = defpackage.aiqw.a;
        r2.a(r3, r4, r5, r6, r7);
        return r8;
    L_0x005e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizy.e():boolean");
    }

    @Deprecated
    public final boolean f() {
        if (D() != null) {
            D().a(false);
        }
        return g();
    }

    public final boolean g() {
        xak.a();
        if (!C()) {
            return false;
        }
        if (D() != null) {
            this.y.a(this.w.k, aiqw.b().a());
        }
        this.f.d();
        aixn aixn = this.w;
        ajlj ajlj = this.y.a;
        aixn.a(ajlj != null ? ajlj.E() : null, this.z.d());
        return true;
    }

    public final void h() {
        xak.a();
        this.b.q();
        if (C()) {
            if (D() != null) {
                acxt acxt = (acxt) D().D().Y().get();
                if (acxt != null) {
                    acxt.a("pl_int");
                }
                D().c();
            }
            this.f.c();
            this.x.a();
            this.w.b();
            aixu aixu = this.x;
            aixu.c.b = false;
            aixu.a();
            aixn aixn = this.w;
            aixn.b();
            aixn.i = null;
            aixn.l = null;
            aixn.m = null;
            aixn.j = null;
            aixn.k = null;
            this.y.a();
            this.f = null;
            w();
        }
        aiyw aiyw = this.o;
        if (aiyw != null) {
            Object obj = this.v;
            aiyw.d = (ahgk) amqw.a(obj);
            obj.getClass();
            aiyw.e = new aiyz(obj);
            obj.getClass();
            aiyw.f = new aiyy(obj);
            aiyw.a();
        }
    }

    public final void i() {
        xak.a();
        this.n.b();
        this.i.d(new ahjp());
        this.c.e();
        this.r.b();
        F();
        h();
    }

    public final void j() {
        h(false);
    }

    public final String k() {
        xak.a();
        aiqq H = H();
        return H != null ? H.b() : null;
    }

    public final int l() {
        xak.a();
        aiqq H = H();
        if (H == null) {
            return -1;
        }
        return H.d();
    }

    public final String m() {
        xak.a();
        aiqq H = H();
        return H != null ? H.c() : null;
    }

    @Deprecated
    public final long n() {
        return D() != null ? D().m() : 0;
    }

    public final long o() {
        return D() != null ? D().o() : 0;
    }

    public final ajmq p() {
        return D() != null ? D().d() : null;
    }

    public final ajmq q() {
        return D() != null ? D().d() : null;
    }

    public final boolean r() {
        if (!C()) {
            return false;
        }
        if (airg.a(this.f.j(), 2)) {
            return true;
        }
        if (!airg.a(this.f.j(), 4, 5) || D() == null) {
            return false;
        }
        return D().p();
    }

    public final boolean c() {
        return this.b.f();
    }

    public final boolean s() {
        return D() != null && D().h();
    }

    public final boolean t() {
        return D() != null && D().i();
    }

    public final void a() {
        xak.a();
        if (C()) {
            this.l.c(true);
            if (D() == null || !aizy.a(D())) {
                g();
                return;
            }
            if (this.f.j() == 2) {
                D().a(false);
            }
            D().f();
        }
    }

    public final void u() {
        xak.a();
        if (C()) {
            this.l.c(true);
            if (D() != null && aizy.a(D())) {
                D().g();
            }
        }
    }

    public final void v() {
        g(true);
    }

    public final void w() {
        g(false);
    }

    private final void g(boolean z) {
        xak.a();
        if (C()) {
            this.l.c(false);
            if (D() != null) {
                if (z) {
                    D().t();
                } else {
                    D().u();
                }
            }
        }
        this.r.b();
        ajai ajai = this.j;
        if (ajai.a) {
            ajai.b.a.unregisterReceiver(ajai);
            ajai.a = false;
        }
        ahfx ahfx = this.q.f;
        if (ahfx.a) {
            ahfx.b.a.unregisterReceiver(ahfx);
            ahfx.a = false;
        }
    }

    public final void b() {
        xak.a();
        if (C()) {
            this.l.c(false);
            this.i.d(new ahjp());
            if (D() == null) {
                return;
            }
            if (this.f.j() == 2) {
                D().a(true);
            } else if (airg.a(this.f.j(), 4, 5)) {
                D().j();
            }
        }
    }

    public final void a(long j) {
        if (D() != null && aizy.a(D())) {
            D().a(j);
        }
    }

    public final void b(long j) {
        if (D() != null && aizy.a(D())) {
            D().b(j);
        }
    }

    private static boolean a(ajlj ajlj) {
        return ajlj.v() == null;
    }

    public final void b(float f) {
        if (D() != null) {
            D().a(f);
        }
    }

    public final void a(boolean z) {
        if (C()) {
            this.f.b(z);
        }
    }

    public final boolean a(aizl aizl) {
        return C() && this.f.a(aizl);
    }

    public final void b(aizl aizl) {
        xak.a();
        if (C()) {
            this.f.b(aizl);
            this.h.a();
            if (this.f.e().a() && aizl.e != aizn.AUTOPLAY) {
                this.x.a();
                this.w.b();
            }
            aiqq c = this.f.c(aizl);
            if (c != null) {
                aiqw aiqw = aizl.g;
                if (aiqw == null) {
                    aiqw = ((aiwu) this.f).a.bD_();
                }
                ajlj ajlj = this.y.a;
                if (ajlj == null || !ajlj.a(c, aiqw)) {
                    this.z.a(c, aiqw);
                }
            }
        }
    }

    public final void x() {
        this.k.post(this.t);
    }

    private final void F() {
        this.i.d(new ahjl(false));
    }

    private final void G() {
        this.i.d(new ahjl(true));
    }

    public final boolean y() {
        return this.d.i;
    }

    @Deprecated
    public final boolean z() {
        aiqf aiqf = this.d;
        return aiqf.i || aiqf.k;
    }

    public final void a(afjt afjt, aiqd aiqd) {
        this.d.a((aiqd) amqw.a((Object) aiqd));
        xak.a();
        this.c.a((afjt) amqw.a((Object) afjt));
        if (D() != null) {
            this.r.a();
            G();
            if (!c() && airg.a(this.f.j(), 4, 5)) {
                this.r.a(1);
            }
        }
    }

    public final void b(boolean z) {
        xak.a();
        if (!z()) {
            if (this.c.l == 3) {
                ajaj ajaj = this.g;
                if (ajaj == null) {
                    xtl.d("In background pending state with no listener!");
                    return;
                }
                ajaj.b = true;
                ajaj.a = z;
                return;
            }
            c(z);
            this.g = null;
        }
    }

    public final void c(boolean z) {
        this.d.h = true;
        h(z);
        if (!aipo.a(this.s).n) {
            this.r.b();
            F();
            this.r.c();
        }
        this.b.r();
        this.d.c();
    }

    private final void h(boolean z) {
        this.i.d(new ahjp());
        this.c.e();
        if (z) {
            i();
            return;
        }
        v();
        if (D() != null) {
            D().A();
        }
    }

    public final void d(boolean z) {
        aiqf aiqf = this.d;
        if (z != aiqf.f) {
            aiqf.f = z;
            aiqf.g();
        }
    }

    public final void a(wxg wxg) {
        ajgn ajgn = this.m;
        wxg wxg2 = ajgn.i;
        String string = ajgn.b.getString(R.string.turn_off_subtitles);
        Object arrayList;
        if (ajgn.b()) {
            arrayList = new ArrayList();
            arrayList.add(ajis.a(string));
            arrayList.addAll(ajii.a(ajgn.k, ajgn.a()));
            wxg.a(null, arrayList);
        } else if (ajgn.j != null) {
            arrayList = new ArrayList();
            arrayList.add(ajis.a(string));
            arrayList.addAll(ajgn.j.a());
            wxg.a(null, arrayList);
        } else {
            ajiu ajiu = ajgn.h;
            if (ajiu != null) {
                wxg.a(null, ajiu.a());
            } else {
                wxg.a(null, null);
            }
        }
    }

    public final void a(ajis ajis) {
        this.m.a(ajis);
    }

    public final ajis A() {
        return this.m.g;
    }

    public final void e(boolean z) {
        this.q.h.a = z;
    }

    public final void a(float f) {
        this.d.c = f;
        if (D() != null) {
            D().x();
        }
    }

    public final boolean b(aiqq aiqq) {
        aiqq H = H();
        return (aiqq == null || H == null) ? false : aiqx.a(H, aiqq);
    }

    public final ajcp B() {
        return b(0);
    }

    public final ajcp f(boolean z) {
        return b(!z ? 1 : 2);
    }

    private final ajcp b(int i) {
        if (D() == null) {
            return new ajcp(null, this.d.l(), null, null, this.q.h);
        }
        return new ajcp(H(), i != 0 ? this.d.l() : null, this.f.i(), D().b(i), this.q.h);
    }

    public final boolean C() {
        return this.f != null;
    }

    public final ajlj D() {
        return this.y.a;
    }

    private final aiqq H() {
        aixk aixk = this.f;
        return aixk != null ? aixk.f() : null;
    }

    @Deprecated
    public final void E() {
        ahga ahga = this.q.d;
        ahga.a = false;
        ahga.b = false;
    }

    public final int c(aizl aizl) {
        return C() ? this.f.d(aizl) : 1;
    }

    public final void a(int i) {
        ahga ahga = this.q.d;
        ahga.d = i;
        if (ahga.b && ahga.a()) {
            ahga.b = false;
            ahfz ahfz = ahga.c.g;
            if (ahfz != null) {
                ahfz.a();
            }
        }
    }
}
