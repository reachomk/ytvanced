package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ajmo */
final class ajmo implements ajnd {
    public final ajpu a;
    public final ajma b;
    public final aepu c;
    public final ajmn d;
    private final ajmm e;
    private final aiqf f;
    private final ajll g;
    private final ajlz h;
    private final ahjg i;
    private final xsc j;
    private final zyw k;

    ajmo(aepu aepu, ajmm ajmm, ajll ajll, aiqf aiqf, ajlz ajlz, ahjg ahjg, ajma ajma, xsc xsc, ajpu ajpu, ajmn ajmn, zyw zyw) {
        this.a = ajpu;
        this.b = ajma;
        this.e = ajmm;
        this.f = aiqf;
        this.d = ajmn;
        this.g = ajll;
        this.c = aepu;
        this.h = ajlz;
        this.i = ahjg;
        this.j = xsc;
        this.k = zyw;
        ajma.b = new WeakReference(ajpu);
    }

    public final void b() {
    }

    private final boolean n() {
        awde a = aipo.a(this.k);
        boolean z = true;
        if (a != null && a.r) {
            return true;
        }
        if (!this.d.a().e()) {
            if (ajlv.a(this.d.b())) {
                if (this.d.a().a(airi.PLAYBACK_INTERRUPTED)) {
                    return z;
                }
                return false;
            }
            z = false;
        }
        return z;
    }

    public final void j() {
        ajma ajma = this.b;
        ajma.a.clear();
        ajma.b.clear();
        this.a.U().d();
        this.a.W().a(false);
        this.a.W().a();
        this.a.a().d();
        this.a.a().b();
    }

    private final void b(int i) {
        ajlv.a(this.a, i);
        this.d.a(this.a, 4);
    }

    public final ajni k() {
        return this.a.T();
    }

    public final String l() {
        return this.a.Q();
    }

    public final aakj m() {
        return this.a.Z();
    }

    public final void a() {
        this.d.a(2);
    }

    /* JADX WARNING: Missing block: B:12:0x0063, code skipped:
            if (r12.d.a().a(defpackage.airi.READY) != false) goto L_0x0065;
     */
    public final void c() {
        /*
        r12 = this;
        r0 = r12.j;
        r0 = r0.a();
        r2 = r12.f;
        r3 = r12.m();
        r2 = defpackage.ajlv.a(r2, r3);
        if (r2 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r12.c;
        r0.o();
        return;
    L_0x0018:
        r2 = r12.c;
        r2 = r2.h();
        r2 = r2.c();
        r4 = r12.a;
        r4 = defpackage.ajlv.f(r4);
        r5 = 0;
        if (r4 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0036;
    L_0x002d:
        r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0036;
    L_0x0031:
        r4 = r12.a;
        defpackage.ajlv.b(r4, r2);
    L_0x0036:
        r2 = r12.a;
        r3 = r12.c;
        r3 = r3.h();
        r3 = r3.a();
        defpackage.ajlv.a(r2, r3);
        r2 = r12.d;
        r3 = 3;
        r2.a(r3);
        r2 = r12.n();
        r3 = 0;
        r4 = 1;
        if (r2 != 0) goto L_0x0065;
    L_0x0053:
        r2 = r12.d;
        r2 = r2.a();
        r7 = new defpackage.airi[r4];
        r8 = defpackage.airi.READY;
        r7[r3] = r8;
        r2 = r2.a(r7);
        if (r2 == 0) goto L_0x01e0;
    L_0x0065:
        r2 = r12.d;
        r2 = r2.c();
        r7 = r12.f;
        r8 = r12.a;
        r8 = r8.Z();
        r8 = r8.c;
        r8 = defpackage.ajln.a(r8);
        r9 = r12.c;
        r7.a(r8, r9);
        r7 = r12.d;
        r7.a(r12);
        if (r2 == r12) goto L_0x00e2;
    L_0x0085:
        r2 = r12.a;
        r2 = r2.R();
        if (r2 != r4) goto L_0x00bb;
    L_0x008d:
        r2 = r12.d;
        r7 = r12.a;
        r7 = r7.Q();
        r2.a(r7);
        r2 = r12.d;
        r7 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r2.a(r7);
        r2 = r12.a;
        r2 = r2.a();
        r7 = r12.a;
        r7 = r7.Z();
        r8 = r12.a;
        r8 = r8.Q();
        r9 = r12.a;
        r9 = r9.R();
        r2.a(r7, r8, r9);
        goto L_0x00e2;
    L_0x00bb:
        r2 = r12.d;
        r2.d();
        r2 = r12.d;
        r7 = defpackage.airi.VIDEO_REQUESTED;
        r2.a(r7);
        r2 = r12.a;
        r2 = r2.a();
        r7 = r12.a;
        r7 = r7.Q();
        r8 = r12.a;
        r8 = r8.Z();
        r9 = r12.a;
        r9 = r9.R();
        r2.a(r7, r8, r9);
    L_0x00e2:
        r2 = r12.a;
        r2 = defpackage.ajlv.f(r2);
        if (r2 == 0) goto L_0x0100;
    L_0x00ea:
        r2 = r12.c;
        r2 = r2.h();
        r7 = r2.a();
        r9 = -1;
        r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r2 == 0) goto L_0x00fb;
    L_0x00fa:
        r5 = r7;
    L_0x00fb:
        r2 = r12.a;
        defpackage.ajlv.a(r2, r5);
    L_0x0100:
        r2 = r12.a;
        r2 = r2.a();
        r5 = r12.a;
        r5 = defpackage.ajlv.b(r5);
        r7 = r12.a;
        r7 = r7.Q();
        r8 = r12.a;
        r8 = r8.Z();
        r9 = r12.a;
        r9 = r9.R();
        r10 = r2.d;
        if (r10 != 0) goto L_0x013d;
    L_0x0122:
        r10 = r8.m();
        r11 = r10.f;
        if (r11 != 0) goto L_0x012b;
    L_0x012a:
        goto L_0x0138;
    L_0x012b:
        r10 = r10.b;
        if (r10 == 0) goto L_0x0138;
    L_0x012f:
        r10 = r2.c;
        r7 = r10.a(r8, r7, r9);
        r2.d = r7;
        goto L_0x013d;
    L_0x0138:
        r7 = "Missing QoE or Vss base url";
        defpackage.xtl.d(r7);
    L_0x013d:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0142;
    L_0x0141:
        goto L_0x0172;
    L_0x0142:
        r7 = r2.B;
        if (r7 == 0) goto L_0x0162;
    L_0x0146:
        r2 = new java.lang.StringBuilder;
        r7 = 65;
        r2.<init>(r7);
        r7 = "Warning: unexpected playback play ";
        r2.append(r7);
        r2.append(r5);
        r5 = " surpressed";
        r2.append(r5);
        r2 = r2.toString();
        defpackage.xtl.d(r2);
        goto L_0x0172;
    L_0x0162:
        r2.a(r4);
        r2.v = r5;
        r5 = r2.t;
        r5 = defpackage.aipo.d(r5);
        if (r5 != 0) goto L_0x0172;
    L_0x016f:
        r2.d();
    L_0x0172:
        r2 = r12.e;
        r2.a();
        r2 = r12.d;
        r2 = r2.a();
        r5 = new defpackage.airi[r4];
        r6 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r5[r3] = r6;
        r2 = r2.a(r5);
        if (r2 == 0) goto L_0x01a5;
    L_0x0189:
        r2 = r12.d;
        r5 = defpackage.airi.INTERSTITIAL_PLAYING;
        r2.a(r5);
        r2 = r12.d;
        r5 = defpackage.airh.VIDEO_PLAYING;
        r6 = r12.a;
        r2.a(r5, r6);
        r2 = new ahjq;
        r5 = r12.c;
        r5 = defpackage.ajlv.a(r5);
        r2.<init>(r5, r4);
        goto L_0x01a6;
    L_0x01a5:
        r2 = 0;
    L_0x01a6:
        r5 = r12.d;
        r5 = r5.a();
        r6 = 2;
        r7 = new defpackage.airi[r6];
        r8 = defpackage.airi.VIDEO_REQUESTED;
        r7[r3] = r8;
        r8 = defpackage.airi.READY;
        r7[r4] = r8;
        r4 = r5.a(r7);
        if (r4 == 0) goto L_0x01cf;
    L_0x01bd:
        r2 = r12.d;
        r4 = defpackage.airi.VIDEO_PLAYING;
        r2.a(r4);
        r2 = new ahjq;
        r4 = r12.c;
        r4 = defpackage.ajlv.a(r4);
        r2.<init>(r4, r3);
    L_0x01cf:
        if (r2 != 0) goto L_0x01d2;
    L_0x01d1:
        goto L_0x01dd;
    L_0x01d2:
        r2.a = r0;
        r0 = r12.a;
        r0 = r0.F();
        r0.e_(r2);
    L_0x01dd:
        r12.b(r6);
    L_0x01e0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmo.c():void");
    }

    public final void d() {
        if (n()) {
            ajfd ajfd = this.a.a().d;
            if (ajfd != null) {
                ajfd.a(false);
            }
            this.a.U().b();
            b(3);
        }
    }

    public final void e() {
        if (this.d.h()) {
            this.d.a(1);
            if (n()) {
                ajfd ajfd = this.a.a().d;
                if (ajfd != null) {
                    ajfd.a(false);
                }
                this.e.b();
                b(4);
            }
        }
    }

    public final void f() {
        if (n()) {
            this.e.b();
            ajmn ajmn = this.d;
            ajpu ajpu = this.a;
            ajmn.a(ajpu, 4, -1, ajlv.c(ajpu), ajlv.c(this.a));
            ajdt a = this.a.a();
            ajfd ajfd = a.d;
            if (ajfd != null) {
                ajfd.a(false);
                ajfd.f();
                ajfd.e();
                if (ajfd.x > 0) {
                    if (ajfd.a()) {
                        ScheduledFuture scheduledFuture = ajfd.P;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                            ajfd.P = null;
                        }
                    }
                    ajfd.a(2);
                }
            }
            ajfm ajfm = a.e;
            if (ajfm != null) {
                ajfm.b();
            }
            this.a.U().c();
            if (this.d.a().a()) {
                ajlv.a(this.a, 7);
                this.d.a(this.a, 2);
                this.d.a(false);
                this.d.a(this.a, 3);
                if (!ajlv.a(this.d.b())) {
                    this.g.b(this.a);
                    return;
                }
                return;
            }
            if (this.d.a() == airi.PLAYBACK_INTERRUPTED) {
                this.d.f();
            } else if (!this.a.X().f() || ((!ajlv.a(this.d.b()) || (this.a.Z().c != null && this.a.Z().c.j == 10)) && this.a.X().c(this.a.Q()))) {
                this.d.e();
            }
            b(7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARNING: Missing block: B:23:0x008d, code skipped:
            if (defpackage.aipo.a(r0.c).B != 2) goto L_0x0078;
     */
    public final void a(defpackage.afif r14) {
        /*
        r13 = this;
        r0 = r13.h;
        r0 = r0.a(r14);
        if (r0 != 0) goto L_0x018a;
    L_0x0008:
        r0 = r14.d();
        r1 = 1;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r13.d;
        r0.a(r1);
    L_0x0014:
        r0 = r13.n();
        if (r0 == 0) goto L_0x018a;
    L_0x001a:
        r0 = r13.g;
        r2 = r13.a;
        r0.a(r14, r2);
        r0 = r13.d;
        r0 = r0.g();
        if (r0 != 0) goto L_0x018a;
    L_0x0029:
        r0 = r14.d();
        if (r0 == 0) goto L_0x018a;
    L_0x002f:
        r0 = r13.d;
        r0 = r0.a();
        r0 = r0.a();
        if (r0 == 0) goto L_0x004e;
    L_0x003b:
        r0 = r13.d;
        r0 = r0.b();
        r0 = defpackage.ajlv.a(r0);
        if (r0 != 0) goto L_0x004e;
    L_0x0047:
        r14 = r13.d;
        r14.a(r1);
        goto L_0x017f;
    L_0x004e:
        r0 = r13.m();
        r6 = r0.b();
        r0 = r13.i;
        r7 = r14.a();
        r2 = "net.unavailable";
        r2 = r7.contains(r2);
        r3 = 7;
        r4 = 2131952344; // 0x7f1302d8 float:1.9541128E38 double:1.0533244117E-314;
        r5 = 2131953747; // 0x7f130853 float:1.9543974E38 double:1.053325105E-314;
        r8 = 2131953380; // 0x7f1306e4 float:1.954323E38 double:1.0533249236E-314;
        r9 = 2131952150; // 0x7f130216 float:1.9540735E38 double:1.053324316E-314;
        r10 = 0;
        r11 = 10;
        r12 = 0;
        if (r2 == 0) goto L_0x007c;
    L_0x0075:
        r4 = 2131952141; // 0x7f13020d float:1.9540716E38 double:1.0533243114E-314;
    L_0x0078:
        r3 = 10;
        goto L_0x014c;
    L_0x007c:
        r2 = "offline.fmt.noneavailable";
        r2 = r7.contains(r2);
        if (r2 == 0) goto L_0x0092;
    L_0x0084:
        r14 = r0.c;
        r14 = defpackage.aipo.a(r14);
        r14 = r14.B;
        r2 = 2;
        if (r14 == r2) goto L_0x0090;
    L_0x008f:
        goto L_0x0078;
    L_0x0090:
        r1 = 0;
        goto L_0x0078;
    L_0x0092:
        r2 = "net.connect";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0147;
    L_0x009a:
        r2 = "net.connect.timeout";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0147;
    L_0x00a2:
        r2 = "net.dns";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0147;
    L_0x00aa:
        r2 = "net.retryexhausted";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0141;
    L_0x00b2:
        r2 = "net.closed";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0141;
    L_0x00ba:
        r2 = "net.read";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0141;
    L_0x00c2:
        r2 = "net.read.timeout";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0141;
    L_0x00ca:
        r2 = "net.timeout";
        r2 = r7.contains(r2);
        if (r2 != 0) goto L_0x0141;
    L_0x00d2:
        r2 = "fmt.unplayable";
        r2 = r7.startsWith(r2);
        if (r2 != 0) goto L_0x013c;
    L_0x00da:
        r2 = "drm.missingapi";
        r2 = r7.startsWith(r2);
        if (r2 != 0) goto L_0x0137;
    L_0x00e2:
        r2 = "drm.unimplemented";
        r2 = r7.startsWith(r2);
        if (r2 != 0) goto L_0x0132;
    L_0x00ea:
        r2 = "drm.unavailable";
        r2 = r7.startsWith(r2);
        if (r2 != 0) goto L_0x012d;
    L_0x00f2:
        r2 = "drm.auth";
        r2 = r7.startsWith(r2);
        if (r2 != 0) goto L_0x00fb;
    L_0x00fa:
        goto L_0x0111;
    L_0x00fb:
        r2 = r14.c;
        r4 = r2 instanceof defpackage.aetl;
        if (r4 == 0) goto L_0x0111;
    L_0x0101:
        r2 = (defpackage.aetl) r2;
        r1 = r2.e();
        if (r1 != 0) goto L_0x010a;
    L_0x0109:
        goto L_0x010c;
    L_0x010a:
        r3 = 9;
    L_0x010c:
        r12 = r2.f();
        goto L_0x0129;
    L_0x0111:
        r14 = r14.b();
        if (r14 != 0) goto L_0x0128;
    L_0x0117:
        r14 = "policy.app";
        r14 = r7.equals(r14);
        if (r14 == 0) goto L_0x0125;
    L_0x011f:
        r14 = 14;
        r1 = 0;
        r3 = 14;
        goto L_0x0129;
    L_0x0125:
        r3 = 10;
        goto L_0x0129;
    L_0x0128:
        r1 = 0;
    L_0x0129:
        r4 = 2131953380; // 0x7f1306e4 float:1.954323E38 double:1.0533249236E-314;
        goto L_0x014c;
    L_0x012d:
        r4 = 2131952331; // 0x7f1302cb float:1.9541102E38 double:1.0533244053E-314;
        goto L_0x0090;
    L_0x0132:
        r4 = 2131952367; // 0x7f1302ef float:1.9541175E38 double:1.053324423E-314;
        goto L_0x0090;
    L_0x0137:
        r4 = 2131952330; // 0x7f1302ca float:1.95411E38 double:1.053324405E-314;
        goto L_0x0090;
    L_0x013c:
        r4 = 2131953757; // 0x7f13085d float:1.9543994E38 double:1.05332511E-314;
        goto L_0x0090;
    L_0x0141:
        r3 = 10;
        r4 = 2131952150; // 0x7f130216 float:1.9540735E38 double:1.053324316E-314;
        goto L_0x014c;
    L_0x0147:
        r3 = 10;
        r4 = 2131953747; // 0x7f130853 float:1.9543974E38 double:1.053325105E-314;
    L_0x014c:
        if (r12 != 0) goto L_0x0156;
    L_0x014e:
        r14 = r0.b;
        r14 = r14.getString(r4);
        r5 = r14;
        goto L_0x0157;
    L_0x0156:
        r5 = r12;
    L_0x0157:
        r14 = new ahjc;
        r2 = r14;
        r4 = r1;
        r2.<init>(r3, r4, r5, r6, r7);
        r0 = r14.a;
        if (r0 == 0) goto L_0x017a;
    L_0x0162:
        r0 = r13.d;
        r0 = r0.a();
        r0 = r0.f();
        if (r0 != 0) goto L_0x016f;
    L_0x016e:
        goto L_0x017a;
    L_0x016f:
        r0 = r13.a;
        r1 = r13.c;
        r1 = defpackage.ajlv.a(r1);
        defpackage.ajlv.a(r0, r1);
    L_0x017a:
        r0 = r13.d;
        r0.a(r14);
    L_0x017f:
        r14 = r13.e;
        r14.b();
        r14 = 8;
        r13.b(r14);
    L_0x018a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmo.a(afif):void");
    }

    public final void a(long j) {
        if (n()) {
            this.a.a().a(j);
            this.e.e = this.a.U().a(j, false);
            b(9);
        }
    }

    public final void b(long j) {
        if (n()) {
            this.a.a().a(j);
            this.e.e = this.a.U().a(j, false);
            b(10);
        }
    }

    public final void g() {
        if (n()) {
            b(5);
        }
    }

    public final void h() {
        if (n()) {
            b(6);
        }
    }

    public final void i() {
        long a = this.j.a();
        if (n() && ajlv.a(this.d.b())) {
            this.a.a().c();
            this.g.a(this.a.Q());
            this.d.a(airi.PLAYBACK_INTERRUPTED);
        }
        ajqm b = this.a.X().b(this.a.Q(), this.a.T().c);
        if (b != null) {
            this.a.H().e_(new ahjy(b.e, a));
        }
    }

    public final void a(aetv aetv) {
        this.a.a().a(aetv);
        ajll ajll = this.g;
        ajpu ajpu = this.a;
        for (ajps a : ajll.b) {
            a.a(aetv, ajpu.Q());
        }
        ajpu.A().e_(aetv);
    }

    public final void a(int i) {
        this.f.g();
        this.a.K().e_(new ahkg(i));
        this.d.a(i, this.a.Q());
    }

    public final void a(long j, long j2) {
        ajlv.b(this.a, j2);
        this.a.T().e = j;
    }

    public final void a(float f) {
        aakj Z = this.d.b().Z();
        ajll ajll = this.g;
        ajlv.a(this.c, Z);
        ahjd ahjd = new ahjd(Z, f);
        ajpu ajpu = this.a;
        for (ajps a_ : ajll.b) {
            a_.a_(ahjd);
        }
        ajpu.E().e_(ahjd);
    }

    public final void a(String str, aevf aevf) {
        ajll ajll = this.g;
        String l = l();
        for (ajps a : ajll.b) {
            a.a(str, aevf, l);
        }
    }

    public final void a(aett aett) {
        if (ajlv.a(this.d.b())) {
            this.a.X().a(m(), l());
            ajll ajll = this.g;
            ahiy ahiy = new ahiy(aett, l());
            ajpu ajpu = this.a;
            for (ajps a : ajll.b) {
                a.a(ahiy);
            }
            ajpu.M().e_(ahiy);
        }
    }
}
