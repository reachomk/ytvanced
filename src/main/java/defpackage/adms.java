package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: adms */
public final class adms extends adqq implements ajlj, vrh, xcp {
    private static final String p = xtl.b("MDX.player.director");
    private aiqq A;
    private int B;
    private long C = 0;
    private aahn D;
    private final admz E;
    private final Map F;
    private amul G;
    public final xci a;
    public final bctz b;
    public final admv c = new admv(this);
    public final bdfu d = new bdfu();
    public final Handler e;
    public final adqe f;
    public airi h;
    public adpy i;
    public final ajpu j;
    public final admz k;
    public ajpu l;
    public aakj m;
    public ajpu n;
    public boolean o = false;
    private final Context q;
    private final xsc r;
    private final Executor s;
    private final airt t;
    private final aajx u;
    private final boolean v;
    private final ajll w;
    private final xua x;
    private final ajpw y;
    private final ajph z = new admw();

    adms(Context context, xsc xsc, Executor executor, xci xci, bctz bctz, adqe adqe, airt airt, aajx aajx, boolean z, ajll ajll, xua xua, ajpw ajpw) {
        this.q = (Context) amqw.a((Object) context);
        this.r = (xsc) amqw.a((Object) xsc);
        this.s = (Executor) amqw.a((Object) executor);
        this.a = (xci) amqw.a((Object) xci);
        this.b = bctz;
        this.f = (adqe) amqw.a((Object) adqe);
        this.t = (airt) amqw.a((Object) airt);
        this.u = (aajx) amqw.a((Object) aajx);
        this.k = new admz(this);
        this.E = new admz(this);
        this.v = z;
        this.w = ajll;
        this.x = xua;
        this.y = ajpw;
        this.F = new HashMap();
        this.e = new admt(this, this.q.getMainLooper());
        this.j = a(this.x.a(), 0);
        a(this.j);
        this.w.c(this.j);
        this.h = airi.NEW;
        this.B = 4;
        a(airi.PLAYBACK_PENDING, null);
        this.G = amul.g();
        this.f.a((adqg) this);
    }

    public final ajoz B() {
        return null;
    }

    public final float C() {
        return 1.0f;
    }

    public final void a() {
    }

    public final void a(float f) {
    }

    public final void a(ahjc ahjc) {
    }

    public final void a(boolean z) {
    }

    public final boolean a(aiqq aiqq, aiqw aiqw) {
        return false;
    }

    public final ajpz b(int i) {
        return null;
    }

    public final long c(long j) {
        return -1;
    }

    public final void c(int i) {
    }

    public final void k() {
    }

    public final long n() {
        return 0;
    }

    public final void t() {
    }

    public final void u() {
    }

    public final void x() {
    }

    public final boolean y() {
        return false;
    }

    public final boolean z() {
        return false;
    }

    public final void c() {
        this.k.a();
        this.E.a();
        this.m = null;
        M();
        this.j.T().a(null);
        this.j.T().i = null;
        M();
        K();
        this.k.a = null;
        this.E.a = null;
        this.m = null;
        this.A = null;
        this.C = 0;
        this.D = null;
        this.G = amul.g();
        a(airi.NEW, null);
        a(null, 4);
        this.e.removeMessages(1);
        this.d.a();
        this.a.b(this);
        this.f.b((adqg) this);
        a(airi.NEW, null);
        this.w.b();
        this.w.b(this.j);
        this.w.a();
        K();
        this.o = true;
    }

    private final void K() {
        for (ajpu ajpu : this.F.values()) {
            if (ajpu != this.j) {
                this.w.b(ajpu);
            }
        }
        this.F.clear();
    }

    public final ajmq d() {
        return this.k;
    }

    public final void e() {
        a(1, this.f.A());
        b(this.n, 1);
        a(1);
        d(1);
    }

    private final void d(int i) {
        aahn[] aahnArr = new aahn[this.G.size()];
        this.G.toArray(aahnArr);
        aahn aahn = this.D;
        aahr aahr = null;
        if (aahn == null) {
            amxn amxn = (amxn) this.G.listIterator();
            while (amxn.hasNext()) {
                aahn aahn2 = (aahn) amxn.next();
                if (aahn2.c) {
                    aahn = aahn2;
                    break;
                }
            }
            aahn = null;
        }
        if (aahn != null) {
            aaht aaht = new aaht();
            String str = aahn.a;
            String str2 = aahn.b;
            boolean z = aahn.c;
            arlx arlx = aaht.a;
            aoyf aoyf = (aoyf) aoyg.e.createBuilder();
            aoyf.b(str);
            aoyf.a(str2);
            aoyf.a(z);
            arlx.copyOnWrite();
            arlv arlv = (arlv) arlx.instance;
            arlv.x = (aoyg) ((anxl) aoyf.build());
            arlv.a |= 268435456;
            aahr = aaht.a();
        }
        aetv aetv = new aetv(aahr, aetv.a, aahnArr);
        if (i == 0) {
            ajll ajll = this.w;
            ajpu ajpu = this.n;
            for (ajps b : ajll.b) {
                b.b(aetv, ajpu.Q());
            }
            ajpu.x().e_(aetv);
            return;
        }
        this.w.a(aetv, this.n.Q());
    }

    public final void a(aakj aakj, aiqq aiqq) {
        if (this.f.d() == 1) {
            this.k.a = aakj;
            this.A = aiqq;
            Locale locale = Locale.US;
            r0 = new Object[2];
            int i = 0;
            r0[0] = aakj.b();
            r0[1] = this.t.h();
            String.format(locale, "Loading videoId %s, playlistId %s.", r0);
            aakj aakj2 = null;
            this.m = null;
            a(airi.PLAYBACK_LOADED, null);
            boolean a = aiqr.a(aakj.l());
            aajx aajx = this.u;
            if (aakj.a(aajx) != null) {
                aakj2 = aakj.a(aajx).b;
            }
            if (this.v && aakj2 != null && aiqr.a(aakj2.l())) {
                i = 1;
            }
            if (!a && i == 0) {
                s();
                return;
            }
            Object obj;
            String b = aakj.b();
            adqe adqe = this.f;
            if (TextUtils.isEmpty(adqe.s()) && adqe.F().equals(b)) {
                obj = adng.SHOWING_TV_QUEUE;
            } else {
                obj = adng.PLAYING_VIDEO;
            }
            String.valueOf(obj).length();
            this.a.d(obj);
            String valueOf;
            if (this.f.a(aakj.b(), this.t.h())) {
                valueOf = String.valueOf(aakj.b());
                b = "MdxDirector: flinging video ";
                if (valueOf.length() == 0) {
                    valueOf = new String(b);
                } else {
                    b.concat(valueOf);
                }
                L();
                if (F()) {
                    a(this.f.u());
                }
                return;
            }
            b = aakj.b().equals(this.f.s()) ? "Remote screen already playing " : "Showing TV queue with first video id ";
            valueOf = String.valueOf(aakj.b());
            if (valueOf.length() == 0) {
                valueOf = new String(b);
            } else {
                b.concat(valueOf);
            }
            a(this.f.u());
        }
    }

    private final void L() {
        if (this.k.a == null) {
            xtl.a(p, "Can not fling video, missing playerResponse.");
            return;
        }
        adpv a = adpw.n().a(this.k.a.b());
        aiqq aiqq = this.A;
        if (aiqq != null) {
            a.a(aiqq.g()).c(this.A.h()).d(this.A.i()).a(this.A.k());
        }
        String h = this.t.h();
        if (h != null) {
            a.b(h);
        }
        this.f.b(a.e());
    }

    public final void f() {
        if (F()) {
            this.f.j();
        } else {
            L();
        }
    }

    public final void g() {
        if (F()) {
            this.f.j();
        }
    }

    public final boolean h() {
        return b(airi.INTERSTITIAL_PLAYING);
    }

    public final boolean i() {
        return b(airi.VIDEO_PLAYING);
    }

    public final void j() {
        if (F()) {
            this.f.k();
        }
    }

    public final void c_(String str) {
        if (F()) {
            this.f.a(str);
        }
    }

    public final void a(long j) {
        if (F()) {
            this.f.a(Math.max(j, 0));
        }
    }

    public final void b(long j) {
        a(this.f.o() + j);
    }

    public final void a(int i, int i2) {
        this.f.C();
    }

    public final String l() {
        aakj aakj = this.k.a;
        return aakj != null ? aakj.b() : null;
    }

    public final long m() {
        if (F() && this.f.d() == 1) {
            this.C = this.f.o();
        }
        return this.C;
    }

    public final long o() {
        return (F() && a(airi.PLAYBACK_LOADED)) ? N() : 0;
    }

    public final boolean p() {
        return b(airi.ENDED) ^ 1;
    }

    public final boolean a(airi airi) {
        return this.h.a(airi);
    }

    public final boolean b(airi airi) {
        return this.h.a(airi);
    }

    public final aakj q() {
        return this.k.a;
    }

    public final aeqj r() {
        return aepu.a;
    }

    public final aeqj a(aakj aakj) {
        return aepu.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    public final void a(int r25) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r0.f;
        r1 = r1.A();
        if (r1 == 0) goto L_0x0015;
    L_0x000a:
        r1 = r0.f;
        r1 = r1.A();
        r1 = r1.o;
        r1 = r1 * 1000;
        goto L_0x0016;
    L_0x0015:
        r1 = 0;
    L_0x0016:
        r2 = r24.N();
        r4 = r0.h;
        r4 = r4.ordinal();
        r5 = 0;
        r7 = -1;
        if (r4 == 0) goto L_0x0074;
    L_0x0026:
        r9 = 1;
        if (r4 == r9) goto L_0x0074;
    L_0x0029:
        r9 = 2;
        if (r4 == r9) goto L_0x0061;
    L_0x002c:
        r5 = 5;
        if (r4 == r5) goto L_0x0055;
    L_0x002f:
        r1 = 8;
        if (r4 == r1) goto L_0x0040;
    L_0x0033:
        r1 = 9;
        if (r4 != r1) goto L_0x003a;
    L_0x0037:
        r0.C = r2;
        goto L_0x005e;
    L_0x003a:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x0040:
        r1 = r0.f;
        r4 = r1.o();
        r0.C = r4;
        r1 = r0.f;
        r7 = r1.q();
        r1 = r0.f;
        r4 = r1.r();
        goto L_0x006f;
    L_0x0055:
        r2 = (long) r1;
        r1 = r0.f;
        r4 = r1.o();
        r0.C = r4;
    L_0x005e:
        r16 = r2;
        goto L_0x0078;
    L_0x0061:
        r0.C = r5;
        r1 = r0.f;
        r7 = r1.q();
        r1 = r0.f;
        r4 = r1.r();
    L_0x006f:
        r16 = r2;
        r12 = r4;
        r14 = r7;
        goto L_0x007a;
    L_0x0074:
        r0.C = r5;
        r16 = r5;
    L_0x0078:
        r12 = r7;
        r14 = r12;
    L_0x007a:
        r1 = new ahkm;
        r10 = r0.C;
        r18 = 0;
        r2 = r0.r;
        r20 = r2.b();
        r22 = 0;
        r2 = r0.n;
        r23 = r2.Q();
        r9 = r1;
        r9.<init>(r10, r12, r14, r16, r18, r20, r22, r23);
        if (r25 != 0) goto L_0x009d;
    L_0x0094:
        r2 = r0.w;
        r3 = r0.n;
        r4 = 4;
        r2.b(r3, r1, r4);
        return;
    L_0x009d:
        r2 = r0.w;
        r2.b(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adms.a(int):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(airi airi, aagr aagr) {
        if (this.h != airi) {
            this.h = airi;
            String.valueOf(airi).length();
            h();
            a(0, aagr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e A:{SKIP} */
    private final void a(int r13, defpackage.aagr r14) {
        /*
        r12 = this;
        r0 = r12.k;
        r0 = r0.a;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r0.j();
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r10 = 1;
        goto L_0x0012;
    L_0x0011:
        r10 = 0;
    L_0x0012:
        r0 = r12.E;
        r3 = r12.m;
        r0.a = r3;
        r0 = 0;
        r3 = 2;
        if (r14 == 0) goto L_0x005b;
    L_0x001c:
        r4 = r12.h;
        r5 = new defpackage.airi[r3];
        r6 = defpackage.airi.INTERSTITIAL_PLAYING;
        r5[r2] = r6;
        r6 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r5[r1] = r6;
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x005b;
    L_0x002e:
        r3 = r14.j;
        r4 = r12.l;
        if (r4 == 0) goto L_0x003e;
    L_0x0034:
        r4 = r4.Q();
        r4 = android.text.TextUtils.equals(r4, r3);
        if (r4 != 0) goto L_0x00ea;
    L_0x003e:
        r4 = r12.F;
        r4 = r4.get(r3);
        r4 = (defpackage.ajpu) r4;
        r12.l = r4;
        r4 = r12.l;
        if (r4 != 0) goto L_0x00ea;
    L_0x004c:
        r1 = r12.a(r3, r1);
        r12.l = r1;
        r1 = r12.F;
        r4 = r12.l;
        r1.put(r3, r4);
        goto L_0x00ea;
    L_0x005b:
        r4 = " | lastMdxPlayerState: ";
        r5 = " | adPlayerResponse: ";
        if (r14 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x00ae;
    L_0x0062:
        r6 = r12.h;
        r7 = new defpackage.airi[r3];
        r8 = defpackage.airi.INTERSTITIAL_PLAYING;
        r7[r2] = r8;
        r8 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r7[r1] = r8;
        r1 = r6.a(r7);
        if (r1 == 0) goto L_0x00ae;
    L_0x0074:
        r1 = defpackage.afpf.mdx;
        r6 = r12.m;
        r6 = java.lang.String.valueOf(r6);
        r7 = r12.i;
        r7 = java.lang.String.valueOf(r7);
        r8 = r6.length();
        r9 = r7.length();
        r11 = new java.lang.StringBuilder;
        r8 = r8 + 132;
        r8 = r8 + r9;
        r11.<init>(r8);
        r8 = "MdxDirector setVideoStage ad null when playing interstitial | broadcastType: ";
        r11.append(r8);
        r11.append(r13);
        r11.append(r5);
        r11.append(r6);
        r11.append(r4);
        r11.append(r7);
        r4 = r11.toString();
        defpackage.afpc.a(r3, r1, r4);
        goto L_0x00ea;
    L_0x00ae:
        if (r14 == 0) goto L_0x00ea;
    L_0x00b0:
        r14 = defpackage.afpf.mdx;
        r1 = r12.h;
        r1 = java.lang.String.valueOf(r1);
        r6 = r12.i;
        r6 = java.lang.String.valueOf(r6);
        r7 = r1.length();
        r8 = r6.length();
        r9 = new java.lang.StringBuilder;
        r7 = r7 + 134;
        r7 = r7 + r8;
        r9.<init>(r7);
        r7 = "MdxDirector setVideoStage ad should be null when videoStage is not an Ad state ";
        r9.append(r7);
        r9.append(r13);
        r9.append(r5);
        r9.append(r1);
        r9.append(r4);
        r9.append(r6);
        r1 = r9.toString();
        defpackage.afpc.a(r3, r14, r1);
        r14 = r0;
    L_0x00ea:
        r1 = r12.h;
        r11 = new ahkn;
        r3 = r12.k;
        r5 = r3.a;
        r3 = r12.E;
        r6 = r3.a;
        r3 = r1.a();
        if (r3 == 0) goto L_0x00ff;
    L_0x00fc:
        r3 = r12.E;
        goto L_0x0101;
    L_0x00ff:
        r3 = r12.k;
    L_0x0101:
        r7 = r3;
        r3 = r12.j;
        if (r3 == 0) goto L_0x010c;
    L_0x0106:
        r3 = r3.Q();
        r8 = r3;
        goto L_0x010d;
    L_0x010c:
        r8 = r0;
    L_0x010d:
        if (r14 == 0) goto L_0x0111;
    L_0x010f:
        r0 = r14.j;
    L_0x0111:
        r9 = r0;
        r3 = r11;
        r4 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        if (r13 != 0) goto L_0x0123;
    L_0x0119:
        r13 = r12.j;
        r13 = r13.y();
        r13.e_(r11);
        goto L_0x0128;
    L_0x0123:
        r13 = r12.w;
        r13.a(r11);
    L_0x0128:
        r13 = r1.a();
        if (r13 == 0) goto L_0x0161;
    L_0x012e:
        if (r14 == 0) goto L_0x0161;
    L_0x0130:
        r13 = r12.m;
        if (r13 == 0) goto L_0x0143;
    L_0x0134:
        r13 = r14.an();
        r14 = r12.m;
        r13.p = r14;
        r13 = r13.b();
        r14 = r13;
        r14 = (defpackage.aagr) r14;
    L_0x0143:
        r13 = new vpd;
        r4 = r12.a;
        r6 = defpackage.vsm.PRE_ROLL;
        r0 = r12.k;
        r7 = r0.a;
        r9 = defpackage.vrd.a;
        r3 = r13;
        r5 = r14;
        r8 = r12;
        r3.<init>(r4, r5, r6, r7, r8, r9);
        r13.a(r11);
        r13 = r14.p();
        if (r13 == 0) goto L_0x0161;
    L_0x015e:
        r12.a(r2);
    L_0x0161:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adms.a(int, aagr):void");
    }

    private final void a(adpy adpy) {
        String.valueOf(adpy).length();
        this.s.execute(new admr(this, adpy, this.f.A()));
    }

    public final void a(ajpu ajpu, int i) {
        this.B = i;
        b(ajpu, 0);
    }

    private final void b(ajpu ajpu, int i) {
        ahkr ahkr = new ahkr(this.B);
        if (i == 0) {
            this.w.a(ahkr, ajpu);
        } else {
            this.w.a(ahkr);
        }
    }

    public final void s() {
        ahjc ahjc = new ahjc(3, adpr.UNPLAYABLE.i, this.q.getString(adpr.UNPLAYABLE.h));
        this.j.T().i = ahjc;
        this.w.a(ahjc, this.n, 4);
    }

    private final void M() {
        ajpu ajpu = this.l;
        if (ajpu != null) {
            this.w.b(ajpu);
            this.F.remove(this.l.Q());
            this.l = null;
        }
    }

    public final void a(vra vra) {
        this.a.d(new vow(this.f.A(), vra));
        new vpd(this.a, this.f.A(), vsm.PRE_ROLL, this.k.a, this, vrd.a).a();
    }

    private final long N() {
        if (this.f.p() != 0) {
            return this.f.p();
        }
        aakj aakj = this.k.a;
        if (aakj != null) {
            return ((long) aakj.h()) * 1000;
        }
        return 0;
    }

    public final ahjc v() {
        return this.j.T().i;
    }

    public final boolean w() {
        return this.f.d() == 2;
    }

    public final void A() {
        this.f.l();
    }

    public final ajpu D() {
        return this.j;
    }

    public final String E() {
        ajpu ajpu = this.j;
        return ajpu != null ? ajpu.Q() : null;
    }

    private final ajpu a(String str, int i) {
        ajpu a = this.y.a(str).a(i).a(new adnf()).a(this.z).a();
        this.w.a(a);
        if (i == 1) {
            this.F.put(str, a);
        }
        return a;
    }

    public final void a(ajpu ajpu) {
        if (ajpu == null) {
            afpf afpf = afpf.mdx;
            String valueOf = String.valueOf(this.l);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 84);
            stringBuilder.append("MdxDirector Null singleVideoComponent given to updateCurrentComponent | adComponent ");
            stringBuilder.append(valueOf);
            String str = "non-null";
            if (stringBuilder.toString() == null) {
                valueOf = String.valueOf(this.j);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 25);
                stringBuilder2.append("null | contentComponent: ");
                stringBuilder2.append(valueOf);
                if (stringBuilder2.toString() == null) {
                    str = "null";
                }
            }
            afpc.a(2, afpf, str);
            return;
        }
        boolean containsKey = this.F.containsKey(ajpu.Q());
        if (!containsKey) {
            this.F.put(ajpu.Q(), ajpu);
        }
        if (!(this.n == ajpu && containsKey)) {
            this.n = ajpu;
            this.w.d(this.n);
        }
    }

    public final boolean F() {
        return amqq.a(l(), this.f.s());
    }

    public final void a(List list) {
        this.G = amul.a((Collection) list);
        d(0);
    }

    public final void a(aahn aahn) {
        this.D = aahn;
        d(0);
    }

    public final boolean G() {
        return this.v;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vqf.class, adpx.class};
        } else if (i == 0) {
            a(-1, -1);
        } else if (i == 1) {
            adpx adpx = (adpx) obj;
            if (F() && a(airi.PLAYBACK_LOADED)) {
                a(adpx.a);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
