package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerStateCache;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.SelectableItemRegistry;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mmk */
public final class mmk implements xcp {
    public ahmh A;
    public aeeu B;
    public mln C;
    public zyw D;
    public zzl E;
    public mry F;
    public mrw G;
    public xpt H;
    public mrs I;
    private final mmq J;
    private final aibb K;
    private final vvf L;
    private final vwu M;
    private final nim N;
    private final nje O;
    private final nit P;
    private final aige Q;
    private final aihx R;
    private final aife S;
    private final aicw T;
    private final aigo U;
    private final aiii V;
    private final mrb W;
    private final mqv X;
    private final afjt Y;
    private final mra Z;
    public final mlp a;
    private aifl aa;
    private final aifi ab;
    private final bdfu ac;
    private final amky ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private mmo ah;
    private int ai = 1;
    private int aj = 1;
    public final nip b;
    public boolean c;
    public aiqq d;
    public int e;
    public final ApiPlayerStateCache f = new ApiPlayerStateCache();
    public aizy g;
    public ajam h;
    public ajgv i;
    public ajjl j;
    public ahnq k;
    public aicn l;
    public airt m;
    public ajql n;
    public aiaw o;
    public vvh p;
    public waw q;
    public akkq r;
    public Executor s;
    public ajoo t;
    public xsc u;
    public ScheduledExecutorService v;
    public ajgn w;
    public EmbedInteractionLoggerCoordinator x;
    public msd y;
    public xci z;

    public mmk(Context context, mmq mmq, mlp mlp, aiug aiug, afjt afjt, vvd vvd, vws vws, aibb aibb, muz muz, nhv nhv, SelectableItemRegistry selectableItemRegistry, aigc aigc, aihv aihv, aifc aifc, aicu aicu, aifi aifi, aigp aigp, aiif aiif, RemoteDataBus remoteDataBus, amky amky) {
        Context context2 = context;
        mlp mlp2 = mlp;
        aibb aibb2 = aibb;
        aigc aigc2 = aigc;
        RemoteDataBus remoteDataBus2 = remoteDataBus;
        this.Y = (afjt) amqw.a((Object) afjt);
        this.J = (mmq) amqw.a((Object) mmq);
        this.a = (mlp) amqw.a((Object) mlp);
        this.ad = (amky) amqw.a((Object) amky);
        if (this.ah == null) {
            this.ah = this.a.f.m().a(this.a.f.oU().a).a();
        }
        this.ah.a(this);
        amqw.a((Object) aiug);
        amqw.a((Object) vvd);
        this.K = (aibb) amqw.a((Object) aibb);
        amqw.a((Object) aicu);
        amqw.a((Object) aifi);
        amqw.a((Object) aigp);
        amqw.a((Object) aiif);
        this.ac = new bdfu();
        n();
        this.W = new mrb(remoteDataBus2);
        this.z.a(this.W);
        this.X = new mqv(mlp2.f.oD(), remoteDataBus2);
        this.z.a(this.X);
        this.Z = new mra(remoteDataBus2, this.E);
        mra mra = this.Z;
        mra.b.a().b(mqz.a).a(bdfe.b()).c().a(new mrc(mra));
        mmm mmm = new mmm(this);
        mqy mqy = new mqy(context2, new mrt(mmm), new mru(mmm, this.W));
        this.L = new vvf(vvd, acvx.g, mqy, new vva[0]);
        this.M = new vwu(mqy, vws, mlp2.f.oy(), aiui.a(aiug), this.q);
        nim nim = r1;
        mqy mqy2 = mqy;
        nim nim2 = new nim(context, this.g, this.o, aibb, this.B, mlp2.f.oz(), mlp2.f.oB(), muz);
        this.N = nim;
        this.O = new nje(this.x, nhv, context2);
        aibb2.a(this.l.a(aibb2, aigc2));
        this.Q = new aige(this.g, aigc2);
        this.R = new aihx(context.getResources(), this.g, aihv);
        this.S = new aife(this.g, aifc);
        Context context3 = context;
        this.T = new aicw(context3, aicu, this.t, this.s, this.r, this.v, this.u, this.E);
        mqy mqy3 = mqy2;
        this.b = new nip(context3, this.x, mqy3, selectableItemRegistry, remoteDataBus);
        this.P = new nit(this.b.a(), this.x, mqy3, nhv, mlp2.f.i(), selectableItemRegistry, remoteDataBus);
        this.ab = aifi;
        this.aa = new aifl(aifi, this.i, this.j, this.w, this.v);
        aiug.a(new aici(aibb2));
        this.U = new aigo(aigp, this.r, true);
        this.V = new aiii(aiif);
        this.p.a(this.L);
        r();
        this.k.g();
    }

    private final boolean p() {
        int i = this.ai;
        if (i == 0) {
            throw null;
        } else if (i == 5) {
            ammj.a("This YouTubePlayer has been released - ignoring command.", new Object[0]);
            return true;
        } else if (i == 0) {
            throw null;
        } else if (i != 4) {
            return false;
        } else {
            ammj.a("This YouTubePlayer has been paused - ignoring command.", new Object[0]);
            return true;
        }
    }

    private final void q() {
        this.c = false;
    }

    public final void a(aiqq aiqq, int i) {
        a(aiqq, false, i);
    }

    public final void a(aiqq aiqq, boolean z, int i) {
        if (!p()) {
            this.e = i;
            EmbedInteractionLoggerCoordinator embedInteractionLoggerCoordinator = this.x;
            embedInteractionLoggerCoordinator.a = i;
            embedInteractionLoggerCoordinator.a(i, mrd.a(aiqq));
            boolean equals = TextUtils.equals("", aiqq.c());
            nkn nkn = (nkn) ((anxo) aiqq.a.toBuilder());
            nkn.copyOnWrite();
            nkm nkm = (nkm) nkn.instance;
            nkm.a |= 32768;
            nkm.p = equals ^ 1;
            aiqq.a = (nkm) ((anxl) nkn.build());
            String a = this.ad.a(aiqq.b());
            this.G.a = a;
            this.F.a = a;
            this.y.a = z;
            this.b.b = z;
            this.d = aiqq;
            aizy aizy = this.g;
            mrs mrs = this.I;
            aiqz b = aiqw.b();
            atyw atyw = atyw.LATENCY_ACTION_WATCH;
            acxt a2 = mrs.a.a(atyw);
            atyl atyl = (atyl) atyi.l.createBuilder();
            atyl.a(atyw);
            a2.a((atyi) ((anxl) atyl.build()));
            aizy.a(aiqq, b.a(a2).a());
        }
    }

    public final void a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            ammj.a("No video ID provided.", new Object[0]);
            return;
        }
        aiqq a = mrd.a(str, (long) i);
        a.a(true);
        a(a, i2);
    }

    public final void a(String str, boolean z, int i, boolean z2, int i2) {
        if (TextUtils.isEmpty(str)) {
            ammj.a("No video ID provided.", new Object[0]);
            return;
        }
        arcm arcm;
        aiqs s = mrd.a(str, (long) i).s();
        i = z2 ^ 1;
        s.c = i;
        zzl zzl = this.E;
        if (zzl == null || zzl.b() == null) {
            arcm = arcm.e;
        } else {
            arcm = zzl.b().w;
            if (arcm == null) {
                arcm = arcm.e;
            }
        }
        if (arcm.b) {
            s.e = i;
        }
        a(s.b(), z, i2);
    }

    public final void a(String str, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            ammj.a("No playlist ID provided.", new Object[0]);
            return;
        }
        aiqq a = mrd.a(str, i, (long) i2);
        a.a(true);
        a(a, i3);
    }

    public final void a(String str, int i, int i2, boolean z, int i3) {
        if (TextUtils.isEmpty(str)) {
            ammj.a("No playlist ID provided.", new Object[0]);
            return;
        }
        aiqs s = mrd.a(str, i, (long) i2).s();
        s.c = z ^ 1;
        a(s.b(), i3);
    }

    public final void a(List list, int i, int i2, int i3) {
        if (mmk.a(list)) {
            aiqq a = mrd.a(list, i, (long) i2);
            a.a(true);
            a(a, i3);
            return;
        }
        ammj.a("No video IDs provided.", new Object[0]);
    }

    public final void a(List list, int i, int i2, boolean z, int i3) {
        if (mmk.a(list)) {
            aiqs s = mrd.a(list, i, (long) i2).s();
            s.c = z ^ 1;
            a(s.b(), i3);
            return;
        }
        ammj.a("No video IDs provided.", new Object[0]);
    }

    private static boolean a(List list) {
        if (!(list == null || list.isEmpty())) {
            for (String isEmpty : list) {
                if (!TextUtils.isEmpty(isEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!p() && this.ai == 3) {
            this.g.a();
        }
    }

    public final void b() {
        if (!p()) {
            int i = this.ai;
            if (i == 3 || i == 2) {
                this.z.c(ainz.PLAYER_CONTROL);
                this.g.a();
            }
        }
    }

    public final void c() {
        if (!p()) {
            int i = this.ai;
            if (i == 3 || i == 2) {
                this.g.b();
            }
        }
    }

    public final boolean d() {
        int i = this.ai;
        if (i == 3 || i == 2) {
            return this.g.a(aizl.a);
        }
        return false;
    }

    public final boolean e() {
        int i = this.ai;
        if (i == 3 || i == 2) {
            return this.g.a(aizl.b);
        }
        return false;
    }

    public final void f() {
        if (!p()) {
            if (d()) {
                this.ai = 2;
                this.z.c(ainz.NAVIGATION);
                this.g.b(aizl.a);
            } else {
                ammj.a("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            }
        }
    }

    public final void g() {
        if (!p()) {
            if (e()) {
                this.ai = 2;
                this.z.c(ainz.NAVIGATION);
                this.g.b(aizl.b);
            } else {
                ammj.a("Ignoring call to next() on YouTubePlayer as already at end of playlist.", new Object[0]);
            }
        }
    }

    public final long h() {
        return this.ai == 3 ? this.g.n() : 0;
    }

    public final long i() {
        return this.ai == 3 ? this.g.o() : 0;
    }

    public final void a(int i) {
        if (!p() && this.ai == 3) {
            this.g.a((long) i);
        }
    }

    public final void b(int i) {
        if (!p() && this.ai == 3) {
            this.g.b((long) i);
        }
    }

    public final void a(boolean z) {
        this.N.d.c_(z ^ 1);
    }

    public final void b(boolean z) {
        this.g.d(z);
        if (this.ai == 4) {
            g(z);
        }
    }

    public final void c(boolean z) {
        this.g.e(z);
    }

    public final void j() {
        if (!p() && this.ai == 3) {
            this.g.j();
        }
    }

    public final boolean k() {
        return this.g.r();
    }

    public final void l() {
        this.K.e();
    }

    public final void d(boolean z) {
        this.C.b();
        e(z);
        this.Y.m();
        this.ai = 5;
    }

    public final void m() {
        int i = this.ai;
        if (i != 5 && i == 4) {
            this.aa = new aifl(this.ab, this.i, this.j, this.w, this.v);
            n();
            r();
            this.p.a(this.L);
            this.g.x();
            this.k.g();
            this.ai = this.aj;
        }
    }

    public final void n() {
        this.g.a(this.Y, new aiqd());
    }

    public final void e(boolean z) {
        int i = this.ai;
        if (i != 5 && i != 4) {
            aiii aiii;
            nim nim;
            q();
            this.J.a(this.g.n());
            this.k.f();
            xci oC = this.a.f.oC();
            this.ac.a();
            if (!aipo.b(this.D)) {
                oC.b(this.k);
            }
            if (!aipo.c(this.D)) {
                oC.b(this.T);
                oC.b(this.A);
            }
            if (!aipo.d(this.D)) {
                oC.b(this.aa);
                oC.b(this.U);
                oC.b(this.Q);
                oC.b(this.R);
                oC.b(this.S);
                aiii = this.V;
                if (aiii != null) {
                    oC.b(aiii.a);
                }
                nim = this.N;
                if (nim != null) {
                    oC.b(nim.A);
                }
            }
            oC.b(this);
            aiii = this.V;
            if (aiii != null) {
                oC.b(aiii.b);
            }
            nim = this.N;
            if (nim != null) {
                oC.b(nim.B);
            }
            oC.b(this.m);
            oC.b(this.O);
            oC.b(this.P);
            oC.b(this.b);
            oC.b(this.n);
            oC.b(this.x);
            this.ag = false;
            this.p.e();
            this.g.b(z);
            this.aa.a();
            this.aa = null;
            this.aj = this.ai;
            this.ai = 4;
        }
    }

    private final void r() {
        if (!this.ag) {
            aiii aiii;
            nim nim;
            xci oC = this.a.f.oC();
            if (aipo.b(this.D)) {
                this.ac.a(this.k.a(this.h));
            } else {
                oC.a(this.k);
            }
            if (aipo.c(this.D)) {
                this.ac.a(this.T.a(this.h));
                this.ac.a(this.A.a(this.h));
            } else {
                oC.a(this.T);
                oC.a(this.A);
            }
            if (aipo.d(this.D)) {
                this.ac.a(this.U.a(this.h));
                this.ac.a(this.aa.a(this.h));
                this.ac.a(this.Q.a(this.h));
                this.ac.a(this.R.a(this.h));
                this.ac.a(this.S.a(this.h));
                aiii = this.V;
                if (aiii != null) {
                    this.ac.a(aiii.a.a(this.h));
                }
                nim = this.N;
                if (nim != null) {
                    this.ac.a(nim.A.a(this.h));
                }
            } else {
                oC.a(this.U);
                oC.a(this.aa);
                oC.a(this.Q);
                oC.a(this.R);
                oC.a(this.S);
                aiii = this.V;
                if (aiii != null) {
                    oC.a(aiii.a);
                }
                nim = this.N;
                if (nim != null) {
                    oC.a(nim.A);
                }
            }
            nim = this.N;
            if (nim != null) {
                this.ac.a(nim.b.a(this.h));
            }
            vwu vwu = this.M;
            if (vwu != null) {
                this.ac.a(vwu.a(this.h));
            }
            oC.a((Object) this);
            oC.a(this.m);
            aiii = this.V;
            if (aiii != null) {
                oC.a(aiii.b);
            }
            nim = this.N;
            if (nim != null) {
                oC.a(nim.B);
            }
            oC.a(this.O);
            oC.a(this.P);
            oC.a(this.b);
            oC.a(this.n);
            oC.a(this.x);
            this.ag = true;
        }
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        return this.K.onKeyDown(i, keyEvent);
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        return this.K.onKeyUp(i, keyEvent);
    }

    public final void a(ajcp ajcp) {
        this.g.a(ajcp);
    }

    public final ajcp o() {
        return this.g.f(false);
    }

    private final void f(boolean z) {
        this.ae = z;
        this.J.a(z, this.g.n());
    }

    private final void g(boolean z) {
        if (this.af != z) {
            this.af = z;
            this.J.a(z);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0039, code skipped:
            if (r2 != 3) goto L_0x022d;
     */
    public final java.lang.Class[] a(java.lang.Class r23, java.lang.Object r24, int r25) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r25;
        r2 = 9;
        r3 = 7;
        r4 = 5;
        r5 = 4;
        r6 = 6;
        r7 = 3;
        r8 = 2;
        r9 = 1;
        r10 = 0;
        r11 = 0;
        switch(r1) {
            case -1: goto L_0x01ff;
            case 0: goto L_0x01f1;
            case 1: goto L_0x01a6;
            case 2: goto L_0x0195;
            case 3: goto L_0x018b;
            case 4: goto L_0x0176;
            case 5: goto L_0x0160;
            case 6: goto L_0x00c8;
            case 7: goto L_0x00ac;
            case 8: goto L_0x004a;
            case 9: goto L_0x002b;
            default: goto L_0x0012;
        };
    L_0x0012:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = 32;
        r3.<init>(r4);
        r4 = "unsupported op code: ";
        r3.append(r4);
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x002b:
        r1 = r24;
        r1 = (defpackage.aiob) r1;
        r1 = r1.a;
        r2 = r1 + -1;
        if (r1 == 0) goto L_0x0049;
    L_0x0035:
        if (r2 == r9) goto L_0x0043;
    L_0x0037:
        if (r2 == r8) goto L_0x003d;
    L_0x0039:
        if (r2 == r7) goto L_0x0043;
    L_0x003b:
        goto L_0x022d;
    L_0x003d:
        r1 = r0.J;
        r1.a();
        return r11;
    L_0x0043:
        r1 = r0.J;
        r1.b();
        return r11;
    L_0x0049:
        throw r11;
    L_0x004a:
        r1 = r24;
        r1 = (defpackage.ahkr) r1;
        r2 = r22.p();
        if (r2 != 0) goto L_0x022d;
    L_0x0054:
        r2 = r1.a;
        r1 = r1.c();
        if (r1 == 0) goto L_0x0064;
    L_0x005c:
        r1 = r0.ae;
        if (r1 != 0) goto L_0x0064;
    L_0x0060:
        r0.f(r9);
        goto L_0x006f;
    L_0x0064:
        if (r2 == r8) goto L_0x0068;
    L_0x0066:
        if (r2 != r7) goto L_0x006f;
    L_0x0068:
        r1 = r0.ae;
        if (r1 == 0) goto L_0x006f;
    L_0x006c:
        r0.f(r10);
    L_0x006f:
        switch(r2) {
            case 2: goto L_0x0098;
            case 3: goto L_0x0089;
            case 4: goto L_0x0080;
            case 5: goto L_0x0072;
            case 6: goto L_0x0072;
            case 7: goto L_0x0080;
            case 8: goto L_0x0080;
            case 9: goto L_0x0074;
            case 10: goto L_0x0074;
            default: goto L_0x0072;
        };
    L_0x0072:
        goto L_0x022d;
    L_0x0074:
        r1 = r0.J;
        r2 = r0.g;
        r2 = r2.n();
        r1.b(r2);
        return r11;
    L_0x0080:
        r1 = r0.J;
        r1.h();
        r22.q();
        return r11;
    L_0x0089:
        r1 = r0.J;
        r2 = r0.g;
        r2 = r2.n();
        r1.a(r2);
        r22.q();
        return r11;
    L_0x0098:
        r0.c = r9;
        r1 = r0.J;
        r2 = r0.g;
        r2 = r2.n();
        r4 = r0.g;
        r4 = r4.o();
        r1.a(r2, r4);
        return r11;
    L_0x00ac:
        r1 = r24;
        r1 = (defpackage.ahkm) r1;
        r2 = r0.g;
        r2 = r2.s();
        if (r2 == 0) goto L_0x00ba;
    L_0x00b8:
        goto L_0x022d;
    L_0x00ba:
        r2 = r0.J;
        r3 = r1.a;
        r4 = (int) r3;
        r3 = (long) r4;
        r5 = r1.d;
        r1 = (int) r5;
        r5 = (long) r1;
        r2.b(r3, r5);
        return r11;
    L_0x00c8:
        r1 = r24;
        r1 = (defpackage.ahkn) r1;
        r12 = r1.a;
        r12 = r12.ordinal();
        if (r12 == r9) goto L_0x0158;
    L_0x00d4:
        if (r12 == r2) goto L_0x0152;
    L_0x00d6:
        if (r12 == r5) goto L_0x014c;
    L_0x00d8:
        if (r12 == r4) goto L_0x0146;
    L_0x00da:
        if (r12 == r6) goto L_0x00e6;
    L_0x00dc:
        if (r12 == r3) goto L_0x00e0;
    L_0x00de:
        goto L_0x022d;
    L_0x00e0:
        r1 = r0.J;
        r1.f();
        return r11;
    L_0x00e6:
        r0.ai = r7;
        r12 = r0.J;
        r2 = r1.b;
        r13 = r2.b();
        r2 = r1.b;
        r14 = r2.c();
        r2 = r0.g;
        r15 = r2.n();
        r2 = r0.g;
        r17 = r2.o();
        r2 = r0.g;
        r3 = defpackage.aizl.b;
        r19 = r2.a(r3);
        r2 = r0.g;
        r3 = defpackage.aizl.a;
        r20 = r2.a(r3);
        r1 = r1.b;
        r1 = r1.a;
        if (r1 != 0) goto L_0x011b;
    L_0x0118:
        r21 = 0;
        goto L_0x0141;
    L_0x011b:
        r2 = r1.x;
        if (r2 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0118;
    L_0x0120:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0126;
    L_0x0124:
        r2 = defpackage.awdk.h;
    L_0x0126:
        r2 = r2.b;
        if (r2 == r8) goto L_0x012b;
    L_0x012a:
        goto L_0x0118;
    L_0x012b:
        r1 = r1.x;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0133;
    L_0x0131:
        r1 = defpackage.awdk.h;
    L_0x0133:
        r2 = r1.b;
        if (r2 != r8) goto L_0x0118;
    L_0x0137:
        r1 = r1.c;
        r1 = (java.lang.Integer) r1;
        r10 = r1.intValue();
        r21 = r10;
    L_0x0141:
        r12.a(r13, r14, r15, r17, r19, r20, r21);
        goto L_0x022d;
    L_0x0146:
        r1 = r0.J;
        r1.i();
        return r11;
    L_0x014c:
        r1 = r0.J;
        r1.e();
        return r11;
    L_0x0152:
        r1 = r0.J;
        r1.g();
        return r11;
    L_0x0158:
        r0.ai = r8;
        r1 = r0.J;
        r1.d();
        return r11;
    L_0x0160:
        r1 = r24;
        r1 = (defpackage.ahkk) r1;
        r1 = r1.a;
        if (r1 == 0) goto L_0x016f;
    L_0x0168:
        r1 = r0.J;
        r1.j();
        goto L_0x022d;
    L_0x016f:
        r1 = r0.J;
        r1.k();
        goto L_0x022d;
    L_0x0176:
        r1 = r24;
        r1 = (defpackage.ahkf) r1;
        r1 = r1.e;
        if (r1 == r6) goto L_0x0180;
    L_0x017e:
        goto L_0x022d;
    L_0x0180:
        r1 = r0.J;
        r2 = defpackage.amkz.EMPTY_PLAYLIST;
        r1.a(r2);
        r22.q();
        return r11;
    L_0x018b:
        r1 = r0.J;
        r1.c();
        r22.q();
        goto L_0x022d;
    L_0x0195:
        r1 = r24;
        r1 = (defpackage.ahjn) r1;
        r1 = r1.b;
        r2 = defpackage.airc.FULLSCREEN;
        if (r1 != r2) goto L_0x01a0;
    L_0x019f:
        goto L_0x01a1;
    L_0x01a0:
        r9 = 0;
    L_0x01a1:
        r0.g(r9);
        goto L_0x022d;
    L_0x01a6:
        r1 = r24;
        r1 = (defpackage.ahjc) r1;
        r0.ai = r9;
        r1 = r1.h;
        r2 = r1 + -1;
        if (r1 == 0) goto L_0x01f0;
    L_0x01b2:
        switch(r2) {
            case 1: goto L_0x01e8;
            case 2: goto L_0x01e8;
            case 3: goto L_0x01ca;
            case 4: goto L_0x01c2;
            case 5: goto L_0x01c2;
            case 6: goto L_0x01ca;
            case 7: goto L_0x01b5;
            case 8: goto L_0x01ca;
            case 9: goto L_0x01ca;
            case 10: goto L_0x01ca;
            case 11: goto L_0x01b5;
            case 12: goto L_0x01e8;
            default: goto L_0x01b5;
        };
    L_0x01b5:
        r1 = "Unhandled ErrorReason in onError";
        defpackage.xtl.c(r1);
        r1 = r0.J;
        r2 = defpackage.amkz.UNKNOWN;
        r1.a(r2);
        goto L_0x022d;
    L_0x01c2:
        r1 = r0.J;
        r2 = defpackage.amkz.USER_DECLINED_RESTRICTED_CONTENT;
        r1.a(r2);
        goto L_0x022d;
    L_0x01ca:
        r1 = r0.a;
        r1 = r1.f;
        r1 = r1.oD();
        r1 = r1.c();
        if (r1 == 0) goto L_0x01e0;
    L_0x01d8:
        r1 = r0.J;
        r2 = defpackage.amkz.INTERNAL_ERROR;
        r1.a(r2);
        goto L_0x022d;
    L_0x01e0:
        r1 = r0.J;
        r2 = defpackage.amkz.NETWORK_ERROR;
        r1.a(r2);
        goto L_0x022d;
    L_0x01e8:
        r1 = r0.J;
        r2 = defpackage.amkz.NOT_PLAYABLE;
        r1.a(r2);
        goto L_0x022d;
    L_0x01f0:
        throw r11;
    L_0x01f1:
        r1 = r24;
        r1 = (defpackage.vpa) r1;
        r1 = r1.a;
        r2 = defpackage.vpb.AD_INTERRUPT_ACQUIRED;
        if (r1 == r2) goto L_0x01fc;
    L_0x01fb:
        goto L_0x022d;
    L_0x01fc:
        r0.ai = r7;
        return r11;
    L_0x01ff:
        r1 = 10;
        r11 = new java.lang.Class[r1];
        r1 = defpackage.vpa.class;
        r11[r10] = r1;
        r1 = defpackage.ahjc.class;
        r11[r9] = r1;
        r1 = defpackage.ahjn.class;
        r11[r8] = r1;
        r1 = defpackage.ahkd.class;
        r11[r7] = r1;
        r1 = defpackage.ahkf.class;
        r11[r5] = r1;
        r1 = defpackage.ahkk.class;
        r11[r4] = r1;
        r1 = defpackage.ahkn.class;
        r11[r6] = r1;
        r1 = defpackage.ahkm.class;
        r11[r3] = r1;
        r1 = 8;
        r3 = defpackage.ahkr.class;
        r11[r1] = r3;
        r1 = defpackage.aiob.class;
        r11[r2] = r1;
    L_0x022d:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmk.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
