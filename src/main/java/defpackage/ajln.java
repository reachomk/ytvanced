package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: ajln */
public final class ajln implements ajdd, ajlj, ajmd, ajng, ajox, ajph {
    public static final ajlt a = new ajlt();
    private long A;
    private final Map B;
    private boolean C;
    public final xsc b;
    public final ajll c;
    public final aiqf d;
    public final xua e;
    public final zzl f;
    public final ajqi g;
    public ajmo h;
    public ajqb i;
    public ajmo j;
    public ajqb k;
    public ajmo l;
    public airi m = airi.NEW;
    public boolean n;
    public int o;
    private final aepu p;
    private final ahjg q;
    private final airt r;
    private final aajk s;
    private final ajqe t;
    private final ajlz u;
    private final zyw v;
    private final boolean w;
    private final ajmm x;
    private final ajpw y;
    private final ajme z;

    ajln(xsc xsc, aepu aepu, ahjg ahjg, ajll ajll, aiqf aiqf, airt airt, aajk aajk, xua xua, ajqe ajqe, ajlz ajlz, zzl zzl, zyw zyw, ajpw ajpw, ajme ajme) {
        this.b = (xsc) amqw.a((Object) xsc);
        this.p = (aepu) amqw.a((Object) aepu);
        this.q = (ahjg) amqw.a((Object) ahjg);
        amqw.a((Object) zzl);
        this.c = (ajll) amqw.a((Object) ajll);
        this.d = (aiqf) amqw.a((Object) aiqf);
        this.r = (airt) amqw.a((Object) airt);
        this.s = aajk;
        this.e = (xua) amqw.a((Object) xua);
        this.t = (ajqe) amqw.a((Object) ajqe);
        this.u = (ajlz) amqw.a((Object) ajlz);
        this.f = zzl;
        this.v = zyw;
        this.z = ajme;
        this.x = new ajmm(xsc, zzl, new Handler(Looper.getMainLooper()), new ajlq(this));
        this.g = new ajqi(this, new ajlp(this));
        this.w = aipo.a(zzl, airv.b) > 15000;
        this.y = ajpw;
        this.B = new HashMap();
    }

    public final boolean G() {
        return false;
    }

    public final void s() {
        for (ajps a : this.c.b) {
            a.a((ajox) this);
        }
        this.p.q();
        this.p.o();
        this.o = 1;
        this.x.g = false;
        this.C = false;
        this.d.q = 1;
        O();
        this.k = null;
        this.i = null;
    }

    private final void P() {
        if (this.n) {
            if (v() == null) {
                afpc.a(2, afpf.player, "maybeRegenerateCpnAndStatsClient called unexpectedly, but no error.");
            } else {
                afpf afpf = afpf.player;
                String valueOf = String.valueOf(v().c);
                String str = "maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                afpc.a(2, afpf, valueOf, new Exception(v().d));
            }
            this.h.a.a().d();
            this.c.b();
            this.c.b(this.h.a);
            this.h.a.a().b();
            String a = this.e.a();
            aakj Z = this.h.a.Z();
            aiqq S = this.h.a.S();
            acxt acxt = (acxt) this.h.a.Y().get();
            long j = this.h.a.T().c;
            this.h = a(a, 0, S, acxt);
            ajmo ajmo = this.h;
            this.l = ajmo;
            ajlv.a(ajmo.a, j);
            ajln.a(this.h.a, Z);
            this.n = false;
            for (ajps ba_ : this.c.b) {
                ba_.ba_();
            }
        }
    }

    public final void c() {
        this.p.o();
        this.x.g = true;
        Y();
        if (this.m != airi.NEW) {
            this.h.j();
            O();
            this.h.a.W().a(false);
            this.h.a.W().a();
            this.i = null;
            this.k = null;
            this.h.a.T().i = null;
            this.g.g();
            O();
            for (ajmo ajmo : this.B.values()) {
                if (ajmo != this.h) {
                    if (ajlv.a(D())) {
                        ajmo.a.a().d();
                    }
                    this.c.b(ajmo.a);
                }
            }
            this.B.clear();
            ajpx T = this.h.a.T();
            T.c = 0;
            T.d = -1;
            T.e = 0;
            T.f = 0;
            T.g = 0;
            T.h = 4;
            this.o = 1;
            this.p.q();
            this.p.b();
            this.p.o();
            this.x.b();
            c(airi.NEW);
            this.c.b();
            this.c.b(this.h.a);
            awde a = aipo.a(this.v);
            if (a == null || !a.i) {
                this.d.g();
            }
            this.c.a();
        }
    }

    public final void a(boolean z) {
        this.x.g = z;
    }

    public final ajmq d() {
        return this.h.b;
    }

    public final ajpu D() {
        return this.h.a;
    }

    public final ajpu F() {
        ajmo ajmo = this.j;
        return ajmo != null ? ajmo.a : null;
    }

    private final ajpu Q() {
        return this.l.a;
    }

    public final ajoz B() {
        return this.h.a.W();
    }

    public final void a(float f) {
        D().T().b = f;
        if (!this.m.a()) {
            aepu aepu = this.p;
            double d = (double) f;
            boolean z = false;
            if (d >= 0.25d && d <= 2.0d) {
                z = true;
            }
            amqw.a(z);
            if (aepu.c.a()) {
                aepu.a("setPlaybackRate");
                aepu.b.post(new aepz(aepu, f));
                return;
            }
            aepu.d.b(f);
        }
    }

    public static float a(ajmo ajmo) {
        return ajmo.a.T().b;
    }

    public final float C() {
        aepu aepu = this.p;
        xak.a();
        return aepu.d.s();
    }

    public final void e() {
        d(1);
        a(this.l.a, 4, 1);
        if (N()) {
            a(false, 1, this.l.a);
        } else {
            ajpu ajpu = this.l.a;
            a(ajpu, ajpu.T().d, this.l.a.T().c, this.l.a.T().g, false, 4, 1);
        }
        a(D().T().i, 4, 1);
        aakj Z = this.h.a.Z();
        if (this.p != null && Z != null) {
            aajs aajs = Z.c;
            aajj n = Z.n();
            if (aajs != null && n != null) {
                try {
                    afgv a = this.p.a(aajs, n, this.d.j);
                    aetv aetv = new aetv(a.d, a.e, a.f);
                    this.l.a.a().a(aetv);
                    this.c.a(aetv, this.l.a.Q());
                } catch (afgr unused) {
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(airi airi) {
        if (airi != airi.PLAYBACK_PENDING) {
            Y();
        } else if (this.w && (X() instanceof afkh)) {
            ((afkh) X()).a(2);
        }
        this.m = airi;
        String valueOf = String.valueOf(airi.toString());
        String str = "VideoStage: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        int ordinal = airi.ordinal();
        if (ordinal == 2) {
            this.h.a.U().d();
        } else if (ordinal == 4) {
            ajmo ajmo = this.j;
            if (ajmo != null) {
                ajmo.a.U().d();
                this.j.a.U().a();
            }
        } else if (ordinal == 7) {
            this.h.a.U().a();
        }
        d(0);
        switch (airi.ordinal()) {
            case 1:
                a(airh.PLAYBACK_PENDING, this.h.a);
                return;
            case 2:
                a(airh.PLAYBACK_LOADED, this.h.a);
                return;
            case 3:
                a(airh.PLAYBACK_INTERRUPTED, this.h.a);
                return;
            case 6:
                a(airh.READY, this.h.a);
                return;
            case 7:
                a(airh.VIDEO_REQUESTED, this.h.a);
                return;
            case 8:
                a(airh.VIDEO_PLAYING, this.h.a);
                return;
            case 9:
                a(airh.ENDED, this.h.a);
                return;
            default:
                return;
        }
    }

    public final void a(airh airh, ajpu ajpu) {
        String valueOf = String.valueOf(airh);
        String Q = ajpu.Q();
        valueOf.length();
        String.valueOf(Q).length();
        this.h.a.Z();
        ajpu.Q();
        ajpu.z().e_(new ahka(airh));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    public final void d(int r11) {
        /*
        r10 = this;
        r1 = r10.m;
        r0 = defpackage.airi.PLAYBACK_LOADED;
        r0 = r1.a(r0);
        r2 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x000b:
        r0 = r10.h;
        r0 = r0.a;
        r0 = r0.Z();
        r3 = r0;
        goto L_0x0016;
    L_0x0015:
        r3 = r2;
    L_0x0016:
        r0 = r1.a();
        if (r0 == 0) goto L_0x0029;
    L_0x001c:
        r0 = r10.j;
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0029;
    L_0x0021:
        r0 = r0.a;
        r0 = r0.Z();
        r4 = r0;
        goto L_0x002a;
    L_0x0029:
        r4 = r2;
    L_0x002a:
        r0 = defpackage.airi.PLAYBACK_LOADED;
        r0 = r10.a(r0);
        if (r0 == 0) goto L_0x003c;
    L_0x0032:
        r0 = r10.h;
        r0 = r0.a;
        r0 = r0.Q();
        r5 = r0;
        goto L_0x003d;
    L_0x003c:
        r5 = r2;
    L_0x003d:
        r0 = r10.m;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0052;
    L_0x0045:
        r0 = r10.j;
        if (r0 != 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0052;
    L_0x004a:
        r0 = r0.a;
        r0 = r0.Q();
        r6 = r0;
        goto L_0x0053;
    L_0x0052:
        r6 = r2;
    L_0x0053:
        r0 = r10.D();
        r7 = defpackage.ajlv.f(r0);
        r8 = new ahkn;
        r0 = r1.a();
        if (r0 == 0) goto L_0x0068;
    L_0x0063:
        r0 = r10.j;
        r0 = r0.b;
        goto L_0x006c;
    L_0x0068:
        r0 = r10.h;
        r0 = r0.b;
    L_0x006c:
        r9 = r0;
        r0 = r8;
        r2 = r3;
        r3 = r4;
        r4 = r9;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        if (r11 != 0) goto L_0x0080;
    L_0x0076:
        r11 = r10.c;
        r0 = r10.h;
        r0 = r0.a;
        r11.a(r8, r0);
        return;
    L_0x0080:
        r11 = r10.c;
        r11.a(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajln.d(int):void");
    }

    public final void a(boolean z, int i, ajpu ajpu) {
        a(z, i, ajpu, ajlv.b(ajpu));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b3  */
    private final void a(boolean r20, int r21, defpackage.ajpu r22, long r23) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r22;
        r4 = r23;
        r3 = r0.m;
        r3 = r3.a();
        r6 = 0;
        if (r3 == 0) goto L_0x006e;
    L_0x0011:
        r3 = r0.j;
        if (r3 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x006e;
    L_0x0016:
        r3 = r3.a;
        r3 = r3.U();
        r7 = r3.a(r4, r1);
        r1 = r0.j;
        r1 = r1.a;
        r1 = r1.Z();
        if (r1 == 0) goto L_0x006d;
    L_0x002a:
        r1 = r1.h();
        r3 = r0.x;
        r3.e = r7;
        r14 = new ahkm;
        r3 = java.util.concurrent.TimeUnit.SECONDS;
        r7 = (long) r1;
        r10 = r3.toMillis(r7);
        r1 = r0.b;
        r15 = r1.b();
        if (r2 == 0) goto L_0x004a;
    L_0x0043:
        r1 = r22.Q();
        r17 = r1;
        goto L_0x004c;
    L_0x004a:
        r17 = r6;
    L_0x004c:
        r6 = -1;
        r8 = -1;
        r12 = 0;
        r1 = 0;
        r3 = r14;
        r4 = r23;
        r18 = r14;
        r14 = r15;
        r16 = r1;
        r3.<init>(r4, r6, r8, r10, r12, r14, r16, r17);
        r1 = r0.j;
        r1 = r1.a;
        r1 = r1.a();
        r3 = r18;
        r1.a(r3);
        r1 = r3;
        goto L_0x00b1;
    L_0x006d:
        return;
    L_0x006e:
        r3 = r22.U();
        r7 = r3.a(r4, r1);
        r1 = r0.x;
        r1.e = r7;
        r1 = r19.Z();
        if (r1 == 0) goto L_0x00b0;
    L_0x0080:
        r1 = new ahkm;
        r6 = -1;
        r3 = r22.T();
        r8 = r3.e;
        r10 = defpackage.ajlv.c(r22);
        r12 = defpackage.ajlv.d(r22);
        r3 = r0.b;
        r14 = r3.b();
        r16 = 0;
        r17 = r22.Q();
        r3 = r1;
        r4 = r23;
        r3.<init>(r4, r6, r8, r10, r12, r14, r16, r17);
        r3 = r0.l;
        r3 = r3.a;
        r3 = r3.a();
        r3.a(r1);
        goto L_0x00b1;
    L_0x00b0:
        r1 = r6;
    L_0x00b1:
        if (r1 == 0) goto L_0x00b9;
    L_0x00b3:
        r3 = 4;
        r4 = r21;
        r0.a(r4, r2, r1, r3);
    L_0x00b9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajln.a(boolean, int, ajpu, long):void");
    }

    public final void a(ajqb ajqb, aakj aakj, long j, float f) {
        this.x.g = ajqb.a ^ 1;
        this.C = ajqb.b;
        this.h.a.T().c = ajqb.d;
        this.h.a.T().b = f;
        ajmo ajmo = this.j;
        if (ajmo != null) {
            ajln.a(ajmo.a, aakj);
            this.j.a.T().c = j;
        }
        this.d.g();
        this.h.a.a().b();
        if (!ajqb.c) {
            this.h.a.a().a(ajqb.f);
        }
        ajqd ajqd = ajqb.g;
        if (ajqd != null) {
            this.t.a(ajqd, new ajpr(ajqb.c, this.h.a.Q()));
        }
    }

    public final boolean a(aiqq aiqq, aiqw aiqw) {
        if (!(this.l == null || !this.g.d() || this.B == null)) {
            ajqm b = this.g.b(this.l.l(), this.l.k().a());
            ajmo ajmo = b != null ? (ajmo) this.B.get(b.e) : null;
            if (ajmo != null && aiqq.b().equals(ajmo.m().b())) {
                amro Y = ajmo.a.Y();
                if (Y instanceof aipr) {
                    ((aipr) Y).a = aiqw.a();
                }
                this.p.bx_();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    public final void a(defpackage.aakj r10, defpackage.aiqq r11) {
        /*
        r9 = this;
        r0 = r9.m;
        if (r0 == 0) goto L_0x01a1;
    L_0x0004:
        r1 = defpackage.airi.PLAYBACK_PENDING;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x01a1;
    L_0x000c:
        r0 = r10.l();
        r0 = defpackage.aiqr.a(r0);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x001a;
    L_0x0018:
        r0 = 1;
        goto L_0x0026;
    L_0x001a:
        r0 = r10.l();
        r0 = defpackage.aiqr.f(r0);
        if (r0 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0018;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        defpackage.amqw.b(r0);
        r0 = r9.h;
        r0 = r0.a;
        defpackage.ajln.a(r0, r10);
        r0 = r9.h;
        r0 = r0.a;
        r0 = defpackage.ajlv.a(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r9.h;
        r0 = r0.a;
        r0 = r0.X();
        r0.a();
    L_0x0045:
        r0 = r10.l();
        r0 = defpackage.aiqr.f(r0);
        if (r0 == 0) goto L_0x0068;
    L_0x004f:
        r10 = defpackage.airi.PLAYBACK_LOADED;
        r9.c(r10);
        r10 = r9.f;
        r10 = defpackage.aipo.g(r10);
        if (r10 == 0) goto L_0x0067;
    L_0x005c:
        r10 = r9.h;
        r10 = r10.a;
        r10 = r10.W();
        r10.a(r1);
    L_0x0067:
        return;
    L_0x0068:
        r0 = r9.b;
        r0 = defpackage.aira.a(r10, r0);
        if (r0 == 0) goto L_0x0084;
    L_0x0070:
        r0 = r9.q;
        r3 = new ahjc;
        r4 = 3;
        r0 = r0.b;
        r5 = 2131952119; // 0x7f1301f7 float:1.9540672E38 double:1.0533243006E-314;
        r0 = r0.getString(r5);
        r5 = defpackage.ahjg.a;
        r3.<init>(r4, r2, r0, r5);
        goto L_0x0085;
    L_0x0084:
        r3 = 0;
    L_0x0085:
        if (r3 == 0) goto L_0x00a0;
    L_0x0087:
        if (r11 == 0) goto L_0x009b;
    L_0x0089:
        r10 = r11.d;
        if (r10 > 0) goto L_0x0094;
    L_0x008d:
        r10 = r10 + r1;
        r11.d = r10;
        r9.M();
        return;
    L_0x0094:
        r10 = defpackage.afpf.player;
        r11 = "Max reloads [%s] reached on expired stream load.";
        defpackage.afpc.a(r1, r10, r11);
    L_0x009b:
        r10 = 4;
        r9.a(r3, r10);
        return;
    L_0x00a0:
        r0 = r9.f;
        r0 = defpackage.aipo.i(r0);
        if (r0 == 0) goto L_0x00c1;
    L_0x00a8:
        r0 = r9.g;
        r3 = r9.D();
        r3 = r3.Z();
        r4 = r9.D();
        r4 = r4.Q();
        r3 = r0.a(r3, r4, r2);
        r0.a(r3);
    L_0x00c1:
        if (r11 != 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        r11.d = r2;
    L_0x00c6:
        r11 = r9.h;
        r11 = r11.a;
        defpackage.ajll.e(r11);
        r10 = r10.n();
        r3 = r10.as();
        r5 = 0;
        r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r11 <= 0) goto L_0x00f2;
    L_0x00db:
        r11 = r9.D();
        r3 = defpackage.ajlv.b(r11);
        r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r11 != 0) goto L_0x00f2;
    L_0x00e7:
        r11 = r9.D();
        r3 = r10.as();
        defpackage.ajlv.a(r11, r3);
    L_0x00f2:
        r11 = r10.c;
        r0 = r11.a;
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x0107;
    L_0x00fa:
        r11 = r11.f;
        if (r11 != 0) goto L_0x0100;
    L_0x00fe:
        r11 = defpackage.awcc.g;
    L_0x0100:
        r11 = r11.d;
        if (r11 == 0) goto L_0x0107;
    L_0x0104:
        r9.a(r1);
    L_0x0107:
        r11 = r9.s;
        r0 = defpackage.amqw.a(r10);
        r0 = (defpackage.aajj) r0;
        r11.c = r0;
        r0 = r11.a;
        r3 = new aajn;
        r3.<init>(r11, r10);
        r0.execute(r3);
        r10 = r9.h;
        r10 = r10.a;
        r9.a(r1, r2, r10);
        r10 = defpackage.airi.PLAYBACK_LOADED;
        r9.c(r10);
        r10 = r9.h;
        r10 = r10.a;
        if (r10 == 0) goto L_0x0167;
    L_0x012d:
        r10 = r10.Z();
        if (r10 == 0) goto L_0x0167;
    L_0x0133:
        r11 = r10.h();
        r3 = (long) r11;
        r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r11 != 0) goto L_0x013d;
    L_0x013c:
        goto L_0x0167;
    L_0x013d:
        r11 = r10.c;
        if (r11 == 0) goto L_0x0150;
    L_0x0141:
        r11 = r11.a();
        if (r11 == 0) goto L_0x0148;
    L_0x0147:
        goto L_0x0167;
    L_0x0148:
        r10 = r10.c;
        r10 = r10.g();
        if (r10 != 0) goto L_0x0167;
    L_0x0150:
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r11 = r9.h;
        r11 = r11.a;
        r5 = defpackage.ajlv.b(r11);
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r5 = r5 + r7;
        r10 = r10.toSeconds(r5);
        r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r0 < 0) goto L_0x0167;
    L_0x0165:
        r10 = 1;
        goto L_0x0168;
    L_0x0167:
        r10 = 0;
    L_0x0168:
        r11 = r9.C;
        if (r11 == 0) goto L_0x016d;
    L_0x016c:
        goto L_0x0175;
    L_0x016d:
        if (r10 != 0) goto L_0x0175;
    L_0x016f:
        r10 = defpackage.airi.READY;
        r9.c(r10);
        goto L_0x017e;
    L_0x0175:
        r10 = defpackage.airi.ENDED;
        r9.c(r10);
        r10 = r9.x;
        r10.g = r1;
    L_0x017e:
        r10 = r9.N();
        if (r10 == 0) goto L_0x019d;
    L_0x0184:
        r10 = r9.l;
        r10 = r10.a;
        r9.a(r2, r2, r10);
        r10 = new ahjp;
        r10.<init>();
        r11 = r9.D();
        defpackage.ajll.a(r10, r11);
        r10 = r9.l;
        r9.c(r10);
        return;
    L_0x019d:
        r9.f();
        return;
    L_0x01a1:
        r10 = new java.lang.IllegalStateException;
        r11 = "loadVideo() called on LocalDirector in wrong state";
        r10.<init>(r11);
        goto L_0x01aa;
    L_0x01a9:
        throw r10;
    L_0x01aa:
        goto L_0x01a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajln.a(aakj, aiqq):void");
    }

    static boolean a(aajs aajs) {
        return aajs != null && aajs.n();
    }

    public final void a(aakj aakj, String str) {
        amqw.a(this.i, (Object) "Can only play an interstitial while interrupted");
        this.h.a.a().b();
        this.o = 1;
        b(str);
        ajln.a(this.j.a, aakj);
        ajlv.a(F(), 0);
        ajll.e(this.j.a);
        this.c.a(this.h.a.Q());
        d(this.j);
    }

    private final void d(ajmo ajmo) {
        if (b(ajmo.m()) == 0) {
            c(airi.INTERSTITIAL_REQUESTED);
            a(airh.VIDEO_REQUESTED, ajmo.a);
            b(ajmo);
            this.j.a.a().a(ajmo.m(), ajmo.l(), 1);
            return;
        }
        afpc.a(1, afpf.player, "Interstitial Video was unplayable");
    }

    public final void b() {
        if (this.m.a()) {
            u();
            ajmo ajmo = this.j;
            if (ajmo != null) {
                ajmo.a.a().d();
            }
            O();
            c(this.h);
        }
    }

    public final void f() {
        if (!a(airi.INTERSTITIAL_REQUESTED)) {
            xtl.d("play() called when the player wasn't loaded.");
        } else if (ajlv.a(this.d, q())) {
            xtl.d("play() blocked because Background Playability failed");
        } else {
            if (!M()) {
                this.x.g = false;
                D().T().i = null;
                if (H() || I()) {
                    int ordinal = this.m.ordinal();
                    if (ordinal != 6) {
                        if (ordinal == 9) {
                            ajlv.a(D(), 0);
                        }
                        this.p.m();
                    }
                    this.l.a.U().a();
                    c(airi.VIDEO_PLAYING);
                    this.p.m();
                } else {
                    if (this.i != null) {
                        ajmo ajmo = this.j;
                        if (!(ajmo == null || ajmo.a.Z() == null)) {
                            d(this.j);
                            return;
                        }
                    }
                    if (this.g.d() || this.g.f()) {
                        P();
                        if (b(this.h.a.Z()) == 0) {
                            if (aipo.i(this.f)) {
                                this.h.a.W().a(true);
                                if (this.i == null) {
                                    if (this.h.m().j() && !this.h.m().i()) {
                                        ajlv.a(D(), 0);
                                    }
                                    if (b(airi.ENDED)) {
                                        c(airi.VIDEO_REQUESTED);
                                        a(D(), 0, true);
                                    } else {
                                        a(this.l.a, true);
                                    }
                                }
                            } else if (b(airi.ENDED)) {
                                c(airi.VIDEO_REQUESTED);
                                a(D(), 0, false);
                            } else {
                                a(this.l.a, false);
                            }
                            this.h.a.a().a(this.h.a.Q(), this.h.a.Z(), 0);
                            return;
                        }
                    }
                    P();
                    if (b(this.h.m()) == 0) {
                        this.h.a.W().a(true);
                        if (this.i == null) {
                            if (this.h.m().j() && !this.h.m().i()) {
                                ajlv.a(D(), 0);
                            }
                            if (b(airi.ENDED)) {
                                ajlv.a(D(), 0);
                                c(airi.VIDEO_REQUESTED);
                            }
                            O();
                            if (!a(airi.VIDEO_REQUESTED)) {
                                c(airi.VIDEO_REQUESTED);
                            }
                            b(this.h);
                            this.h.a.a().a(this.h.l(), this.h.m(), 0);
                        }
                    }
                }
            }
        }
    }

    public final boolean H() {
        boolean a = aipo.h(this.f) ? a(this.l.a) : this.o == 3;
        return !this.g.f() && a;
    }

    public final boolean I() {
        boolean a = aipo.h(this.f) ? a(this.l.a) : this.o != 1;
        return this.g.f() && a && this.m != airi.ENDED;
    }

    public final void g() {
        f();
        Iterator it = this.c.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final int b(aakj aakj) {
        if (aakj == null || aakj.c != null) {
            return ajlv.a(this.d, aakj) ? 2 : 0;
        } else {
            afpc.a(1, afpf.player, "playVideo called on player response with no videoStreamingData.");
            return 1;
        }
    }

    public final void b(ajmo ajmo) {
        aakj m = ajmo.m();
        aajj n = m.n();
        this.x.g = false;
        boolean z = true;
        if (ajmo.a.R() == 1) {
            z = false;
        }
        a(z, 0, ajmo.a);
        this.d.a(ajln.a(ajmo.m().c), this.p);
        ajll.a(new ahjv(n.v()), D());
        this.p.a(m.c, aepu.a(ajlv.b(ajmo.a), n.at(), n.au()), ajmo.l(), n, X(), ajmo, a(n), ajln.a(ajmo), true, V());
        c(ajmo);
        this.x.a();
        ajme ajme = this.z;
        Object obj = ajme.a;
        if (!(obj == null || obj == this)) {
            obj.K();
        }
        ajme.a = this;
    }

    public final void J() {
        c(airi.ENDED);
    }

    public final void K() {
        this.x.g = true;
        this.l.e();
    }

    public final boolean a(airi airi) {
        return this.m.a(airi);
    }

    public final boolean b(airi airi) {
        return this.m == airi;
    }

    private final boolean a(ajpu ajpu) {
        return TextUtils.equals(this.p.l(), ajpu.Q());
    }

    private final boolean a(airi... airiArr) {
        return this.m.a(airiArr);
    }

    public final boolean h() {
        return this.m.a();
    }

    public final boolean i() {
        return a(airi.VIDEO_REQUESTED, airi.VIDEO_PLAYING);
    }

    public final boolean p() {
        boolean z = true;
        if (!this.m.c()) {
            if (this.m.d()) {
                return this.p.f() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final void a(ahjc ahjc) {
        zzl zzl = this.f;
        if (zzl != null && zzl.b() != null) {
            auuo auuo = this.f.b().k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            awtm awtm = auuo.e;
            if (awtm == null) {
                awtm = awtm.x;
            }
            if (awtm.c) {
                a(ahjc, 2);
                this.c.b(this.h.a);
                Y();
            }
        }
    }

    public final aakj q() {
        return this.h.a.Z();
    }

    public final String E() {
        return this.h.a.Q();
    }

    public final ahjc v() {
        return D().T().i;
    }

    private final void R() {
        boolean a = aipo.h(this.f) ? a(this.l.a) : this.o != 1;
        if (!N()) {
            if (!this.m.a(airi.PLAYBACK_INTERRUPTED) && a && !ajlv.g(this.l.a)) {
                this.l.a.T().c = ajlv.a(this.p);
            }
        }
    }

    public final void j() {
        this.p.n();
        R();
    }

    public final void L() {
        this.h.f();
    }

    public final void t() {
        c(true);
        this.o = 1;
        ajlv.a(Q(), 4);
    }

    public final void u() {
        c(false);
    }

    private final void c(boolean z) {
        R();
        this.x.g = true;
        if (z) {
            this.p.p();
        } else {
            this.p.o();
        }
        if (this.m == airi.VIDEO_REQUESTED) {
            c(airi.READY);
        }
    }

    public final boolean w() {
        if (aipo.h(this.f)) {
            if (this.p.l() == null) {
                return true;
            }
        } else if (this.o == 1) {
            return true;
        }
        return false;
    }

    public final void x() {
        float a = a((aajj) this.s.get());
        aepu aepu = this.p;
        boolean z = false;
        if (a >= 0.0f && ((double) a) <= 1.0d) {
            z = true;
        }
        amqw.a(z);
        if (aepu.c.a()) {
            aepu.a("setVolume");
            aepu.b.post(new aeqa(aepu, a));
            return;
        }
        aepu.d.a(a);
    }

    public final boolean y() {
        this.d.q = 2;
        x();
        ajfd ajfd = this.l.a.a().d;
        if (ajfd != null && ajfd.B) {
            ajfd.e();
            ajfd.D = true;
            ajfd.d();
        }
        return true;
    }

    public final boolean z() {
        aajj aajj = (aajj) this.s.get();
        if (aajj != null && aajj.m()) {
            return false;
        }
        this.d.q = 3;
        x();
        ajfd ajfd = this.l.a.a().d;
        if (ajfd != null && ajfd.B) {
            ajfd.e();
            ajfd.D = false;
            ajfd.d();
        }
        return true;
    }

    public final float a(aajj aajj) {
        if (ajfd.a(aajj, this.d)) {
            return 0.0f;
        }
        return (aajj != null ? aajj.l() : 1.0f) * this.d.a();
    }

    public final void a(int i) {
        this.i = a(false, false, i);
        j();
        this.x.b();
        ajqb ajqb = this.k;
        if (ajqb != null) {
            this.x.g = ajqb.a ^ 1;
            this.C = ajqb.b;
            if (!ajqb.c) {
                b(ajqb.e);
                this.j.a.a().a(ajqb.f);
                ajlv.a(F(), ajqb.d);
            }
            ajqd ajqd = ajqb.g;
            if (ajqd != null) {
                this.t.a(ajqd, new ajpr(ajqb.c, this.h.a.Q()));
            }
        }
        this.k = null;
        c(airi.PLAYBACK_INTERRUPTED);
    }

    public final void a() {
        a(this.i, null, 0, ajln.a(this.h));
        this.x.b();
        this.i = null;
        ajmo ajmo = this.l;
        ajmo ajmo2 = this.h;
        if (ajmo != ajmo2) {
            c(ajmo2);
        }
        O();
        if (aiqr.f(this.h.a.Z().l()) && aipo.g(this.f)) {
            c(airi.PLAYBACK_LOADED);
            return;
        }
        c(!this.C ? airi.READY : airi.ENDED);
        if (!N()) {
            this.o = 1;
            f();
        } else if (this.C) {
            if (!this.g.d() || this.g.e(this.h.a.Q())) {
                aakj Z = this.h.a.Z();
                this.p.a(Z.c, aepu.c(ajlv.b(D())), this.h.a.Q(), Z.n(), X(), this.h, a(Z.n()), ajln.a(this.h), false, V());
                long c = ajlv.c(D());
                a(D(), 4, -1, c, c);
            } else {
                ajqm d = this.g.d(this.h.l());
                if (d != null) {
                    a(ajqi.a(this.g, d.e, 0, Long.MAX_VALUE), true, true);
                }
            }
        }
    }

    public final void a(long j) {
        aakj Z = this.h.a.Z();
        if (!(b(airi.NEW) || Z == null || Z.c == null || ajlv.a(this.d, Z))) {
            if (!this.m.b() || ajlv.a(D())) {
                long c;
                boolean z;
                Object obj;
                if (ajlv.a(D())) {
                    c = ajlv.c(D());
                } else {
                    c = ajlv.c(Q());
                }
                c = Math.min(Math.max(j, D().T().e), c);
                if (!ajlv.a(this.h.a)) {
                    this.l.a.T().c = c;
                }
                boolean b = b(airi.ENDED);
                aajj n = Z.n();
                if (aipo.h(this.f) ? !a(this.l.a) : this.o == 1) {
                    if (this.g.f()) {
                        a(ajqi.a(this.g, this.l.a.Q(), c, Long.MAX_VALUE), true, false);
                        z = true;
                    } else {
                        String Q = this.h.a.Q();
                        z = true;
                        this.p.a(Z.c, aepu.c(c), Q, n, X(), this.h, a(n), ajln.a(this.h), true, V());
                        c(this.h);
                    }
                    this.x.a();
                    obj = 1;
                } else {
                    obj = null;
                    z = true;
                }
                if (b || b(airi.READY)) {
                    c(airi.VIDEO_REQUESTED);
                }
                if (ajlv.a(D()) && this.m.d()) {
                    if (!aipo.i(this.f)) {
                        this.g.a(this.h.a.Z(), this.h.a.Q());
                    }
                    if (this.g.a(U(), c)) {
                        c = this.g.b(c);
                        this.l.a.T().c = c;
                        this.p.b(c);
                    } else {
                        a(c, z);
                    }
                } else if (this.m.f()) {
                    ajlv.a(this.l.a, 9);
                    this.p.b(c);
                    ajpu ajpu = this.l.a;
                    if (ajlv.f(ajpu) ? c > ajlv.c(ajpu) : (!ajpu.X().f() || ajpu.X().c(ajpu.Q())) && c >= ajlv.c(ajpu)) {
                        u();
                        J();
                    }
                } else {
                    xtl.c("Attempting to seek when video is not playing");
                }
                if (obj != null) {
                    if (b) {
                        this.x.g = false;
                    } else {
                        this.p.n();
                    }
                }
                ajmo ajmo = this.l;
                a(false, 0, ajmo.a, ajmo.k().a());
                return;
            }
            xtl.e("Attempting to seek during an ad");
        }
    }

    public final void b(long j) {
        long a;
        if (this.g.d()) {
            ajqi ajqi = this.g;
            if (ajqi.b) {
                a = ajqi.a(this.l.l(), this.l.a.T().c);
                a(a + j);
            }
        }
        a = T();
        a(a + j);
    }

    public final void c(int i) {
        if (this.p.d() != null && !this.m.b()) {
            this.p.c();
            this.l.a.D().e_(new ahjb(i));
        }
    }

    public final void c_(String str) {
        if (this.p.d() != null && !this.m.b()) {
            this.p.c();
        }
    }

    public final void k() {
        this.p.q();
    }

    public final void b(ahjc ahjc) {
        aahr d = this.p.d();
        if (d == null) {
            aepu aepu = this.p;
            xak.a();
            d = aepu.d.e();
        }
        if (d == null || !d.w()) {
            int i = ahjc.h;
            int i2 = i - 1;
            if (i != 0) {
                String str = "net.retryexhausted";
                if (i2 == 6) {
                    str = "servererror";
                } else if (i2 != 7) {
                    if (i2 != 8) {
                        String str2;
                        afpf afpf = afpf.player;
                        switch (ahjc.h) {
                            case 1:
                                str2 = "UNKNOWN";
                                break;
                            case 2:
                                str2 = "VIDEO_ERROR";
                                break;
                            case 3:
                                str2 = "UNPLAYABLE";
                                break;
                            case 4:
                                str2 = "REQUEST_FAILED";
                                break;
                            case 5:
                                str2 = "USER_AGE_CHECK_FAILED";
                                break;
                            case 6:
                                str2 = "USER_CONTENT_CHECK_FAILED";
                                break;
                            case 7:
                                str2 = "LICENSE_SERVER_ERROR";
                                break;
                            case 8:
                                str2 = "LICENSE_SERVER_NET_ERROR";
                                break;
                            case 9:
                                str2 = "LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR";
                                break;
                            case 10:
                                str2 = "PLAYER_ERROR";
                                break;
                            case 11:
                                str2 = "NO_STREAMS";
                                break;
                            case 12:
                                str2 = "WATCH_NEXT_ERROR";
                                break;
                            case 13:
                                str2 = "UNPLAYABLE_IN_BACKGROUND";
                                break;
                            case 14:
                                str2 = "UNPLAYABLE_BY_APP_POLICY";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        StringBuilder stringBuilder = new StringBuilder(str2.length() + 31);
                        stringBuilder.append("Unexpected heartbeat response: ");
                        stringBuilder.append(str2);
                        afpc.a(2, afpf, stringBuilder.toString());
                    } else {
                        str = "stop";
                    }
                }
                this.c.a(new afif(6, str, this.p.h().a()), this.l.a);
                u();
                a(ahjc, 4);
                return;
            }
            throw null;
        }
    }

    public final void A() {
        this.h.a.a().c();
        ajll ajll = this.c;
        String Q = this.l.a.Q();
        for (ajps b : ajll.b) {
            b.b(Q);
        }
    }

    public final String l() {
        return this.h.a.Z() != null ? this.h.a.Z().b() : null;
    }

    private final long S() {
        if (!this.m.a()) {
            return 0;
        }
        long b;
        if (N()) {
            b = ajlv.b(F());
        } else {
            b = ajlv.a(this.p);
        }
        return b;
    }

    private final long T() {
        if (this.m.f() && !N() && !ajlv.g(this.l.a)) {
            return ajlv.a(this.p);
        }
        if (b(airi.ENDED)) {
            return o();
        }
        return ajlv.b(D());
    }

    public final long m() {
        if (ajlv.a(D())) {
            return U();
        }
        if (this.m.a()) {
            return S();
        }
        return T();
    }

    private final long U() {
        ajmo ajmo = this.l;
        String l = ajmo.l();
        if (this.g.a(l) != null) {
            return this.g.a(l, ajlv.b(ajmo.a));
        }
        return this.A;
    }

    public final long n() {
        return ajlv.d(Q());
    }

    public final long o() {
        return ajlv.c(D());
    }

    public final aeqj r() {
        return a(this.h.a.Z());
    }

    public final aeqj a(aakj aakj) {
        return ajlv.a(this.p, aakj);
    }

    public final Void b(boolean z) {
        if (ajlv.a(D())) {
            a(U(), false);
        } else if (this.g.a(this.l.l()) != null) {
            a(this.l.a, z);
        } else {
            a(this.h.a, z);
        }
        return null;
    }

    private final void a(long j, boolean z) {
        a(ajqi.a(this.g, null, j, Long.MAX_VALUE), z, true);
    }

    private final void a(ajpu ajpu, long j, boolean z) {
        a(ajqi.a(this.g, ajpu.Q(), j, Long.MAX_VALUE), z, true);
    }

    private final void a(ajpu ajpu, boolean z) {
        a(ajpu, ajpu.T().c, z);
    }

    private final void a(List list, boolean z, boolean z2) {
        this.p.b();
        if (!list.isEmpty()) {
            ajmo ajmo;
            aajj n;
            aepu aepu;
            aajs aajs;
            String str;
            ajqj ajqj = (ajqj) list.remove(0);
            Object obj = (aipo.h(this.f) ? !a(this.l.a) : this.o == 1) ? 1 : null;
            String str2 = null;
            if (!z && this.l.a.Q().equals(ajqj.a()) && obj == null) {
                ajmo = null;
            } else {
                str2 = ajqj.a();
                ajmo = (ajmo) this.B.get(ajqj.a());
                if (ajmo == null && ajqj.a().equals(this.h.l())) {
                    ajmo = this.h;
                }
                n = ajqj.b().n();
                if (!aipo.i(this.f)) {
                    this.p.a(ajqj.b().c, aepu.c(ajqj.a), ajqj.a(), ajqj.b().n(), X(), ajqj.d, a(ajqj.b().n()), ajln.a(this.h), true, V());
                } else if (ajmo != null) {
                    affa a;
                    ajll.a(new ahjv(n.v()), ajmo.a);
                    this.x.g = false;
                    aepu = this.p;
                    aajs = ajqj.b().c;
                    if (z2) {
                        a = aepu.a(ajqj.a, n.at(), n.au());
                    } else {
                        a = aepu.c(ajqj.a);
                    }
                    aepu.a(aajs, a, ajqj.a(), n, X(), ajqj.d, a(ajqj.b().n()), ajln.a(this.h), true, V());
                    this.x.a();
                } else {
                    afpc.a(2, afpf.player, "LocalDirector loading a CPN which does not have a component.");
                }
                if (ajmo != null) {
                    c(ajmo);
                    ajlv.a(ajmo.a, ajqj.a);
                }
            }
            for (ajqj ajqj2 : list) {
                long j;
                aepu = this.p;
                aajs = ajqj2.b().c;
                affa c = aepu.c(ajqj2.a);
                String a2 = ajqj2.a();
                n = ajqj2.b().n();
                ajnd ajnd = ajqj2.d;
                ajls ajls = new ajls(this, ajqj2);
                ajlr ajlr = new ajlr(this);
                if (ajqj.c) {
                    str = str2;
                    j = -1;
                } else {
                    str = str2;
                    j = ajqj.b;
                }
                aepu.a(aajs, c, a2, n, ajnd, ajls, ajlr, j);
                ajqj = ajqj2;
                str2 = str;
            }
            str = str2;
            if (ajmo != null) {
                if (ajmo.a.R() == 1) {
                    if (!this.m.a()) {
                        b(str);
                        c(airi.INTERSTITIAL_REQUESTED);
                        this.j.a.a().a(this.j.a.Z(), this.j.a.Q(), this.j.a.R());
                    }
                } else if (!this.m.f()) {
                    c(airi.VIDEO_REQUESTED);
                }
                if (aipo.i(this.f) && !ajlv.a(D())) {
                    boolean z3 = true;
                    if (ajmo.a.R() == 1) {
                        z3 = false;
                    }
                    a(z3, 0, ajmo.a);
                }
            }
        }
    }

    private final int V() {
        return this.d.s != 3 ? 0 : 1;
    }

    public final boolean M() {
        boolean a = aira.a(this.h.a.Z(), this.b);
        if (a) {
            aajs aajs = this.h.a.Z().c;
            long b = this.b.b();
            int convert = aajs.a(b) ? (int) TimeUnit.SECONDS.convert(b - aajs.e, TimeUnit.MILLISECONDS) : -1;
            this.o = 1;
            ajll ajll = this.c;
            aioa aioa = new aioa(convert);
            ajpu ajpu = this.l.a;
            Iterator it = ajll.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            ajpu.J().e_(aioa);
        }
        return a;
    }

    private final boolean W() {
        if (!p()) {
            if (!N()) {
                if (!this.m.a(airi.NEW, airi.PLAYBACK_LOADED, airi.INTERSTITIAL_REQUESTED, airi.PLAYBACK_PENDING, airi.READY)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private final afjt X() {
        aiqf aiqf = this.d;
        if (aiqf.j) {
            return null;
        }
        return aiqf.d;
    }

    private final void Y() {
        if (this.w && (X() instanceof afkh)) {
            ((afkh) X()).b(2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    public final defpackage.ajpz b(int r29) {
        /*
        r28 = this;
        r0 = r28;
        r1 = r29;
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0008:
        r13 = 1;
        goto L_0x000b;
    L_0x000a:
        r13 = 0;
    L_0x000b:
        r4 = 0;
        if (r13 == 0) goto L_0x0018;
    L_0x000e:
        r5 = r0.m;
        r5 = r5.a();
        if (r5 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        return r4;
    L_0x0018:
        if (r13 != 0) goto L_0x0025;
    L_0x001a:
        r5 = r0.h;
        r5 = r5.a;
        r5 = r5.Q();
        r24 = r5;
        goto L_0x0027;
    L_0x0025:
        r24 = r4;
    L_0x0027:
        if (r13 == 0) goto L_0x002e;
    L_0x0029:
        r20 = r4;
        r21 = r20;
        goto L_0x0049;
    L_0x002e:
        r5 = r0.i;
        if (r5 != 0) goto L_0x0029;
    L_0x0032:
        r5 = r0.j;
        if (r5 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0029;
    L_0x0037:
        r5 = r5.a;
        r5 = r5.Z();
        r6 = r0.j;
        r6 = r6.a;
        r6 = r6.Q();
        r20 = r5;
        r21 = r6;
    L_0x0049:
        r5 = r0.r;
        if (r5 == 0) goto L_0x005d;
    L_0x004d:
        r5 = r5.c();
        if (r5 == 0) goto L_0x005d;
    L_0x0053:
        r5 = r0.r;
        r5 = r5.f();
        r5 = r5 ^ r2;
        r19 = r5;
        goto L_0x005f;
    L_0x005d:
        r19 = 0;
    L_0x005f:
        if (r1 == r2) goto L_0x0063;
    L_0x0061:
        r1 = 1;
        goto L_0x0064;
    L_0x0063:
        r1 = 0;
    L_0x0064:
        r27 = new ajpz;
        r15 = r0.a(r13, r1, r3);
        r5 = r0.i;
        if (r5 == 0) goto L_0x00a8;
    L_0x006e:
        r5 = r0.j;
        if (r5 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x00a8;
    L_0x0073:
        if (r1 != 0) goto L_0x007e;
    L_0x0075:
        r1 = r28.W();
        if (r1 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x007e;
    L_0x007c:
        r5 = 1;
        goto L_0x007f;
    L_0x007e:
        r5 = 0;
    L_0x007f:
        r8 = r28.S();
        r1 = r0.j;
        r1 = r1.a;
        r1 = r1.a();
        r10 = r1.a();
        r1 = r0.t;
        r11 = r1.a();
        r1 = new ajqb;
        r6 = 0;
        r4 = r0.j;
        r4 = r4.a;
        r12 = r4.Q();
        r4 = r1;
        r7 = r13;
        r4.<init>(r5, r6, r7, r8, r10, r11, r12);
        r16 = r1;
        goto L_0x00aa;
    L_0x00a8:
        r16 = r4;
    L_0x00aa:
        r1 = r0.h;
        r1 = r1.a;
        r17 = r1.Z();
        r1 = r0.h;
        r1 = r1.a;
        r18 = r1.S();
        r22 = r28.S();
        r1 = r0.h;
        r25 = defpackage.ajln.a(r1);
        if (r13 != 0) goto L_0x00ce;
    L_0x00c6:
        r1 = r0.n;
        if (r1 != 0) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00ce;
    L_0x00cb:
        r26 = 1;
        goto L_0x00d0;
    L_0x00ce:
        r26 = 0;
    L_0x00d0:
        r14 = r27;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26);
        return r27;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajln.b(int):ajpz");
    }

    private final ajqb a(boolean z, boolean z2, int i) {
        return a(z, z2, i, false);
    }

    public final ajqb a(boolean z, boolean z2, int i, boolean z3) {
        int i2 = i;
        ajqb ajqb = this.i;
        if (ajqb != null) {
            boolean z4 = ajqb.b || z3;
            return new ajqb(false, z4, z, ajqb.d, ajqb.f, ajqb.g, ajqb.e);
        }
        boolean z5;
        long T;
        if (z || z2 || !W()) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z6 = this.m == airi.ENDED || z3;
        ajdv a = this.h.a.a().a();
        ajqd a2 = this.t.a();
        if (i2 > 0) {
            T = T();
        } else {
            T = T() + ((long) i2);
        }
        return new ajqb(z5, z6, z, Math.max(T, 0), a, a2, this.h.a.Q());
    }

    private final boolean Z() {
        aakj Z = this.h.a.Z();
        boolean z = true;
        if (Z != null && Z.n() != null && Z.n().Y() && Z.j() && aipo.a(this.f).f && !this.m.a()) {
            if (ajlv.b(Q()) == 0 && ajlv.c(Q()) == 0) {
                z = false;
            } else if (Q().T().d != -1) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final ajnd a(String str, aakj aakj, int i) {
        if (TextUtils.equals(str, E())) {
            return this.h;
        }
        ajmo ajmo = (ajmo) this.B.get(str);
        if (ajmo == null) {
            ajmo = a(str, i, null, null);
        }
        ajmo.a.T().a(aakj);
        return ajmo;
    }

    public final long c(long j) {
        aepu aepu = this.p;
        xak.a();
        return aepu.d.a(j);
    }

    public final boolean N() {
        return this.x.g;
    }

    private final ajmo a(String str, int i, aiqq aiqq, acxt acxt) {
        String str2 = str;
        int i2 = i;
        ajmo ajmo = new ajmo(this.p, this.x, this.c, this.d, this.u, this.q, new ajma(this), this.b, this.y.a(str2).a(i2).a(this.g).a(this).a(aiqq).a(acxt).a(), new ajlu(this), this.v);
        ajmo.a.a().a.g = this;
        this.c.a(ajmo.a);
        if (i2 != 0) {
            this.B.put(str2, ajmo);
        }
        return ajmo;
    }

    public final void c(ajmo ajmo) {
        boolean containsKey = this.B.containsKey(ajmo.l());
        if (!containsKey) {
            this.B.put(ajmo.l(), ajmo);
        }
        if (ajmo.a.R() == 0) {
            ajmo ajmo2 = this.h;
            if (ajmo2 != ajmo) {
                this.h = ajmo;
                this.c.c(ajmo.a);
                ajmo2.j();
                this.g.b(ajmo2.l());
                c(airi.NEW);
                c(airi.PLAYBACK_PENDING);
                c(airi.PLAYBACK_LOADED);
                c(airi.READY);
            }
        }
        if (this.l != ajmo || !containsKey) {
            this.l = ajmo;
            this.c.d(this.l.a);
        }
    }

    public final void O() {
        ajmo ajmo = this.j;
        if (ajmo != null) {
            this.c.b(ajmo.a);
            this.j.j();
            this.B.remove(this.j.a.Q());
            this.j = null;
            if (this.m.a(airi.INTERSTITIAL_PLAYING, airi.INTERSTITIAL_REQUESTED) && this.h.m() != null) {
                c(airi.PLAYBACK_INTERRUPTED);
            }
        }
    }

    public final ajmo a(String str, aiqq aiqq, aiqw aiqw) {
        return a(str, 0, aiqq, aiqw != null ? aiqw.a() : null);
    }

    public final void b(String str) {
        ajmo ajmo = this.j;
        if (ajmo == null || !TextUtils.equals(ajmo.l(), str)) {
            this.j = (ajmo) this.B.get(str);
            if (this.j == null) {
                this.j = a(str, 1, null, null);
            }
        }
    }

    private static void a(ajpu ajpu, aakj aakj) {
        ajpu.T().a(aakj);
    }

    public final void a(ajpu ajpu, int i, int i2) {
        ahkr ahkr = new ahkr(ajlv.e(ajpu), ajpu == null ? null : ajpu.Q());
        if (i2 == 0) {
            this.c.a(ahkr, i, ajpu);
        } else {
            this.c.a(ahkr);
        }
    }

    private final void a(int i, ajpu ajpu, ahkm ahkm, int i2) {
        if (a(airi.INTERSTITIAL_PLAYING, airi.INTERSTITIAL_REQUESTED) && ajlv.a(D())) {
            ahkm ahkm2 = new ahkm(ahkm, ahkm.g, ajpu.Q());
            ahkm ahkm3 = new ahkm(this.g.a((ajni) ahkm, ajpu.Q()), ahkm.g, this.h.a.Q());
            this.A = ahkm3.a;
            if (i == 0) {
                this.c.a(ajpu, ahkm2, i2);
            } else {
                this.c.a(ahkm2);
            }
            ahkm = ahkm3;
        } else {
            if (D().R() == 0) {
                this.A = ahkm.a;
            }
            if (i == 0) {
                this.c.a(ajpu, ahkm, i2);
            } else {
                this.c.a(ahkm);
            }
        }
        if (i == 0) {
            this.c.b(ajpu, ahkm, i2);
        } else {
            this.c.b(ahkm);
        }
    }

    private final void a(ajpu ajpu, long j, long j2, long j3, boolean z, int i, int i2) {
        if (a(airi.INTERSTITIAL_REQUESTED, airi.INTERSTITIAL_PLAYING, airi.VIDEO_REQUESTED, airi.VIDEO_PLAYING, airi.ENDED)) {
            if (Z()) {
                ahkm ahkm = new ahkm(j2, j, ajpu.T().e, ajpu.T().f, j3, this.b.b(), z, ajpu.Q());
                this.l.a.a().a(ahkm);
                a(i2, ajpu, ahkm, i);
            }
            return;
        }
        String valueOf = String.valueOf(this.m.name());
        String str = "Media progress reported outside media playback: ";
        xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    private final void a(ahjc ahjc, int i, int i2) {
        if (ahjc != null) {
            if (ahjc != D().T().i) {
                ahjg ahjg = this.q;
                String l = this.l.l();
                String string = ahjg.b.getString(R.string.cpn_msg_on_error);
                if (!TextUtils.equals(l, ahjc.b)) {
                    ahjc.b = l;
                    if (!(TextUtils.isEmpty(l) || TextUtils.isEmpty(string))) {
                        String str = ahjc.c;
                        string = String.format(string, new Object[]{l});
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(string).length());
                        stringBuilder.append(str);
                        stringBuilder.append("\n");
                        stringBuilder.append(string);
                        ahjc.c = stringBuilder.toString();
                    }
                }
            }
            if (i2 == 0) {
                this.c.a(ahjc, this.l.a, i);
            } else {
                ajll ajll = this.c;
                for (ajps a : ajll.b) {
                    a.a(ahjc);
                }
                ajll.a.d(ahjc);
            }
        }
        D().T().i = ahjc;
    }

    public final void a(ahjc ahjc, int i) {
        this.n = true;
        if (a(airi.READY)) {
            c(airi.READY);
        } else if (a(airi.INTERSTITIAL_REQUESTED)) {
            c(airi.PLAYBACK_LOADED);
        }
        a(ahjc, i, 0);
    }

    /* Access modifiers changed, original: final */
    public final void a(ajpu ajpu, int i, long j, long j2, long j3) {
        long j4 = j2;
        if (j4 >= 0) {
            this.x.e = ajpu.U().a(j4);
            ajpu ajpu2;
            if (a(ajpu) || (ajlv.c(ajpu) > 0 && ajlv.c(ajpu) == j4)) {
                ajpu.T().d = j;
                ajpu2 = ajpu;
                ajlv.a(ajpu, j4);
                ajpu.T().g = j3;
            } else {
                ajpu2 = ajpu;
                long j5 = j;
                long j6 = j3;
            }
            if (i != 1) {
                boolean a = aipo.h(this.f) ? a(ajpu) : this.o == 3;
                a = !aipo.a(this.f).o || a;
                a(ajpu, j, j2, j3, a, i, 0);
            }
        }
    }
}
