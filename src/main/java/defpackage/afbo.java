package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper.Listener;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: afbo */
public final class afbo implements aevv, afdr, Listener, Observer, nlu, now {
    private static final afcr M = afcb.a;
    private static final afcy N = afca.a;
    public Future A;
    public volatile Object B;
    public afdq C;
    public afgp D;
    public afgv E;
    public aahr F;
    public aahr G;
    public aequ H;
    public aahr I;
    public afgq J = afgq.a;
    public int K = 0;
    public int L;
    private final afcr O;
    private final afdg P;
    private final aeeu Q;
    private final afis R;
    private final aajk S;
    private final aelg T;
    private final afdh U;
    private afcp V;
    private final afgz W;
    private final afde X;
    private final afco Y;
    private final afcx Z;
    public final Context a;
    private long aA;
    private nni aB = new nnk(0, 0);
    private ScheduledFuture aC;
    private afjs aD;
    private boolean aE;
    private int aF = 0;
    private final afjv aa;
    private final afcv ab;
    private final AtomicInteger ac = new AtomicInteger();
    private final afhg ad;
    private final afcs ae = new afcs();
    private final ozb af;
    private final baeu ag;
    private final xsc ah;
    private afcz ai;
    private affz aj;
    private nnj ak;
    private nnj al;
    private Surface am;
    private aewz an;
    private aerz ao;
    private float ap;
    private boolean aq;
    private String ar;
    private WidevineHelper as;
    private boolean at;
    private aewh au;
    private aewh av;
    private float aw;
    private int ax;
    private int ay;
    private boolean az;
    public final amro b;
    public final xhv c;
    public final ScheduledExecutorService d;
    public final afjj e;
    public final aeqo f;
    public final affj g;
    public final bcaa h;
    public aeuy i;
    public final Handler j;
    public final afjc k;
    public final aema l;
    public final affr m = new affr();
    public final afgk n;
    public final nwi o;
    public afkh p;
    public nlp q;
    public affy r;
    public aajs s;
    public afdb t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public aajj y;
    public boolean z;

    public afbo(Context context, xhv xhv, aeeu aeeu, ScheduledExecutorService scheduledExecutorService, afis afis, aajk aajk, afjj afjj, aeqo aeqo, aelg aelg, afgz afgz, aetb aetb, afjc afjc, afjv afjv, aema aema, baeu baeu, xsc xsc, bcaa bcaa, afhg afhg, ozb ozb, affj affj, bcaa bcaa2) {
        afjj afjj2 = afjj;
        Object obj = aeff.a;
        Context context2 = context;
        Object afbr = new afbr(context, bcaa, afjj2, aetb);
        Object obj2 = M;
        Object obj3 = affd.a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = context.getApplicationContext();
        this.c = (xhv) amqw.a((Object) xhv);
        this.Q = (aeeu) amqw.a((Object) aeeu);
        this.d = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.R = (afis) amqw.a((Object) afis);
        this.S = (aajk) amqw.a((Object) aajk);
        this.e = (afjj) amqw.a((Object) afjj);
        this.f = (aeqo) amqw.a((Object) aeqo);
        this.T = (aelg) amqw.a((Object) aelg);
        this.W = (afgz) amqw.a((Object) afgz);
        this.k = (afjc) amqw.a((Object) afjc);
        this.aa = (afjv) amqw.a((Object) afjv);
        this.l = (aema) amqw.a((Object) aema);
        this.ag = (baeu) amqw.a((Object) baeu);
        this.o = (nwi) amqw.a(obj);
        this.ah = (xsc) amqw.a((Object) xsc);
        this.D = afgp.a;
        this.P = (afdg) amqw.a(afbr);
        this.ad = (afhg) amqw.a((Object) afhg);
        this.O = (afcr) amqw.a(obj2);
        this.b = (amro) amqw.a(obj3);
        this.af = (ozb) amqw.a((Object) ozb);
        this.g = affj;
        this.h = (bcaa) amqw.a((Object) bcaa2);
        this.j = handler;
        this.ab = new afcv(this);
        this.i = aeuy.e;
        this.U = new afdh(this);
        this.V = new afcp(new afbq(this), this.i, afjj2, "ExoPlayer");
        this.Y = new afco(this);
        this.X = new afde(this);
        this.Z = new afcx(this, handler);
        this.n = new afgk();
        this.aw = 1.0f;
        this.az = true;
    }

    public final long a(long j) {
        return -1;
    }

    public final void a() {
    }

    public final boolean a(affw affw) {
        return false;
    }

    public final void b() {
    }

    public final void bx_() {
    }

    public final void h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Missing block: B:8:0x0030, code skipped:
            if (r1.u == 3) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:24:0x007b, code skipped:
            if (r18.T() == false) goto L_0x007e;
     */
    private final defpackage.afcq a(defpackage.aajs r17, defpackage.aajj r18, defpackage.afgt r19, boolean r20, boolean r21, int r22, java.lang.String r23, defpackage.affh r24) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r24;
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0033;
    L_0x000b:
        r4 = r3.a;
        r5 = r1.p;
        r5 = r5.iterator();
    L_0x0013:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x0033;
    L_0x0019:
        r6 = r5.next();
        r6 = (defpackage.aahr) r6;
        r6 = r6.b();
        r6 = java.lang.Integer.valueOf(r6);
        r6 = r4.contains(r6);
        if (r6 == 0) goto L_0x0013;
    L_0x002d:
        r4 = r1.u;
        r5 = 3;
        if (r4 != r5) goto L_0x0033;
    L_0x0032:
        goto L_0x003d;
    L_0x0033:
        r3 = r0.k;
        r4 = r0.b;
        r5 = r0.h;
        r3 = defpackage.affd.a(r1, r2, r3, r4, r5);
    L_0x003d:
        r13 = r3;
        r3 = r0.k;
        r4 = defpackage.affd.b;
        r3 = defpackage.affd.a(r1, r2, r3, r4);
        r14 = new afcq;
        r4 = r0.W;
        r5 = r1.n;
        r6 = r13.a;
        r7 = r3.a;
        r8 = r18.v();
        r3 = r18.v();
        r9 = 1;
        r10 = 0;
        if (r3 != 0) goto L_0x005e;
    L_0x005c:
        r11 = 0;
        goto L_0x0062;
    L_0x005e:
        if (r20 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x005c;
    L_0x0061:
        r11 = 1;
    L_0x0062:
        r12 = r21 ^ 1;
        r3 = r1.t;
        if (r3 == 0) goto L_0x007d;
    L_0x0068:
        r1 = r17.m();
        if (r1 != 0) goto L_0x007d;
    L_0x006e:
        r1 = r0.as;
        if (r1 != 0) goto L_0x0073;
    L_0x0072:
        goto L_0x007e;
    L_0x0073:
        r1 = r1.h;
        if (r1 == 0) goto L_0x007e;
    L_0x0077:
        r1 = r18.T();
        if (r1 == 0) goto L_0x007e;
    L_0x007d:
        r9 = 0;
    L_0x007e:
        if (r9 != 0) goto L_0x0083;
    L_0x0080:
        r15 = r22;
        goto L_0x0087;
    L_0x0083:
        r1 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r15 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
    L_0x0087:
        r10 = 1;
        r1 = r4;
        r2 = r18;
        r3 = r5;
        r4 = r19;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r11;
        r9 = r12;
        r11 = r15;
        r12 = r23;
        r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r2 = r13.c;
        r14.<init>(r1, r2);
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(aajs, aajj, afgt, boolean, boolean, int, java.lang.String, affh):afcq");
    }

    private final nvo a(aajj aajj) {
        return new afiw(this.R.a(aajj, 5).a());
    }

    public final void a(String str, aajf aajf) {
        a(str, aajf, N);
    }

    private final synchronized void a(String str, aajf aajf, afcy afcy) {
        aajj aajj = this.y;
        if (aajj == null) {
            aajj = (aajj) this.S.get();
        }
        aajs aajs = this.s;
        if (aajs != null) {
            if (str.equals(aajs.c)) {
                aepe.a("warmVideo scheduled too late.");
                return;
            }
        }
        H();
        Builder buildUpon = aajf.a.buildUpon();
        String str2 = aajf.b;
        if (str2 != null) {
            if (!str2.isEmpty()) {
                buildUpon.appendQueryParameter("cpn", aajf.b);
            }
        }
        if (!this.z) {
            this.au = afcy.a(buildUpon, "134", a(aajj), this.d);
            this.au.a();
            this.e.d();
        }
        this.av = afcy.a(buildUpon, "140", a(aajj), this.d);
        this.av.a();
        this.e.e();
    }

    private final synchronized void H() {
        aewh aewh = this.au;
        if (aewh != null) {
            aewh.b();
            this.au = null;
        }
        aewh = this.av;
        if (aewh != null) {
            aewh.b();
            this.av = null;
        }
    }

    public final String l() {
        return this.ar;
    }

    public final void a(aaje aaje, aeuy aeuy) {
        aaje aaje2 = aaje;
        aeuy aeuy2 = aeuy;
        this.T.a(aeuy2, aaje2.b);
        if (!aaje2.l) {
            this.i = aeuy.e;
        }
        if (aaje2.l) {
            try {
                this.l.a(aaje2, aeuy2);
                return;
            } catch (afgr unused) {
                aepe.a("MissingStreamException in sendOnesieRequestEarlyFetch.");
                return;
            }
        }
        String str = "MissingStreamException in sendOnesieRequest";
        if (aaje2.c.f) {
            int incrementAndGet = this.ac.incrementAndGet();
            try {
                aajs aajs;
                aemt aemt;
                if (aaje.e()) {
                    aajs = aaje2.j;
                } else {
                    aajs = aajs.a;
                }
                aajs aajs2 = aajs;
                afcz afcz = new afcz(aema.a("video/x-unknown", this.d), aema.a("audio/x-unknown", this.d));
                Object obj = new Object();
                this.B = obj;
                aemt afda = new afda(this, aaje, afcz, aajs2, this.B, aeuy);
                aema aema = this.l;
                if (!this.k.a().i) {
                    aemt = afcz;
                }
                aemk a = aema.a(aaje2, aemt, aeuy2);
                if (a != null) {
                    this.j.post(new afcd(this, incrementAndGet, aaje, afcz, aajs2, a, obj));
                }
                return;
            } catch (afgr unused2) {
                aepe.a(str);
                return;
            }
        }
        try {
            this.l.a(aaje2, aemt.a, aeuy2);
        } catch (afgr unused3) {
            aepe.a(str);
        }
    }

    public final void a(aaje aaje, afcz afcz, aajs aajs, aemk aemk, int i) {
        xak.a();
        I();
        this.y = aaje.e;
        this.s = aajs;
        if (a(i)) {
            int i2 = aemk.a;
            this.L = i2;
            this.ae.a(i2, this.y.ai(), this.y.ah(), false);
            a(V(), false);
            this.ai = afcz;
            nlx J = J();
            nnj[] nnjArr = new nnj[2];
            nnjArr[1] = a(J, afcz.b, this.y.W(), this.L == 3);
            nnjArr[0] = a(J, afcz.c, 1);
            a(nnjArr);
            a(nnjArr, 0);
            this.C = new afdq(aaje.g, nnjArr, new afiq[]{this.R.a(this.y, 5), this.R.a(this.y, 5)});
        }
    }

    public final boolean x() {
        return this.C != null;
    }

    /* JADX WARNING: Missing block: B:23:0x0095, code skipped:
            if ((r0.o.a() - r4.n) <= r5.d) goto L_0x0098;
     */
    public final defpackage.afne a(defpackage.aajs r12, defpackage.affa r13, java.lang.String r14, defpackage.aajj r15, defpackage.afkh r16, defpackage.aeuy r17, float r18, float r19, boolean r20, int r21) {
        /*
        r11 = this;
        r0 = r11;
        r1 = r12;
        r2 = r14;
        r3 = r15;
        r4 = r16;
        r5 = r0.g;
        r6 = defpackage.afne.ANDROID_EXOPLAYER;
        r5.c(r6);
        r5 = r18;
        r0.ap = r5;
        r5 = r19;
        r0.aw = r5;
        r5 = r20;
        r0.az = r5;
        r5 = r21;
        r0.aF = r5;
        r5 = r3.e;
        r0.aE = r5;
        r6 = 0;
        if (r5 == 0) goto L_0x0029;
    L_0x0024:
        r5 = defpackage.afkn.SURFACE;
        r11.a(r5, r6);
    L_0x0029:
        r5 = new aeva;
        r7 = new aevd;
        r8 = r17;
        r7.<init>(r8);
        r5.<init>(r7);
        r0.i = r5;
        r7 = new afcp;
        r8 = new afcc;
        r8.<init>(r11);
        r9 = r0.e;
        r10 = "ExoPlayer";
        r7.<init>(r8, r5, r9, r10);
        r0.V = r7;
        r7 = r0.p;
        if (r7 == r4) goto L_0x0054;
    L_0x004b:
        if (r4 != 0) goto L_0x0051;
    L_0x004d:
        r11.r();
        goto L_0x0054;
    L_0x0051:
        r11.a(r4);
    L_0x0054:
        r11.G();
        r7 = r0.T;
        r7.a(r5, r14);
        if (r4 != 0) goto L_0x005f;
    L_0x005e:
        r6 = 1;
    L_0x005f:
        r0.z = r6;
        r4 = 0;
        r0.t = r4;
        r4 = r12.a();
        if (r4 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0072;
    L_0x006b:
        r6 = 0;
        r8 = r1.d;
        r5.a(r6, r8);
    L_0x0072:
        r4 = r12.x();
        if (r4 != 0) goto L_0x0079;
    L_0x0078:
        goto L_0x0098;
    L_0x0079:
        r4 = r1.i;
        if (r4 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x009c;
    L_0x007e:
        r5 = r4.l;
        r5 = (defpackage.npf) r5;
        if (r5 == 0) goto L_0x009c;
    L_0x0084:
        r6 = r5.c;
        if (r6 == 0) goto L_0x0098;
    L_0x0088:
        r6 = r0.o;
        r6 = r6.a();
        r8 = r4.n;
        r6 = r6 - r8;
        r4 = r5.d;
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 <= 0) goto L_0x0098;
    L_0x0097:
        goto L_0x009c;
    L_0x0098:
        r11.a(r12, r13, r14, r15);
        goto L_0x00c7;
    L_0x009c:
        r4 = new aeke;
        r5 = r1.c;
        r6 = r12.j();
        r4.<init>(r5, r14, r6);
        r5 = new aejy;
        r6 = r0.ad;
        r7 = new afcl;
        r16 = r7;
        r17 = r11;
        r18 = r12;
        r19 = r13;
        r20 = r14;
        r21 = r15;
        r16.<init>(r17, r18, r19, r20, r21);
        r5.<init>(r6, r15, r4, r7);
        r1 = r0.d;
        r1 = r1.submit(r5);
        r0.A = r1;
    L_0x00c7:
        r1 = defpackage.afne.ANDROID_EXOPLAYER;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(aajs, affa, java.lang.String, aajj, afkh, aeuy, float, float, boolean, int):afne");
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x02a8 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01df A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021b A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x046d A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0474 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0491 A:{SYNTHETIC, Splitter:B:239:0x0491} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0193 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ad A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ac A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cf A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01df A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021b A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x046d A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0474 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0491 A:{SYNTHETIC, Splitter:B:239:0x0491} */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5 A:{Catch:{ all -> 0x0519 }} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4 A:{Catch:{ all -> 0x0519 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A:{Catch:{ all -> 0x0519 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0133 A:{Catch:{ afgr -> 0x04fd }} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0193 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ac A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ad A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cf A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01df A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021b A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x046d A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0474 A:{Catch:{  }} */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0491 A:{SYNTHETIC, Splitter:B:239:0x0491} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:246:0x04e2 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:246|247|248|249) */
    /* JADX WARNING: Missing block: B:130:0x026f, code skipped:
            if (r4.a().e != false) goto L_0x0271;
     */
    /* JADX WARNING: Missing block: B:135:0x0280, code skipped:
            if (r4.a().f != false) goto L_0x0282;
     */
    /* JADX WARNING: Missing block: B:226:0x0428, code skipped:
            if (r0 > r13) goto L_0x042a;
     */
    /* JADX WARNING: Missing block: B:247:?, code skipped:
            a(new defpackage.afif(5, "unparseable", o()));
     */
    /* JADX WARNING: Missing block: B:248:0x04f1, code skipped:
            r10.B = null;
            r10.C = null;
     */
    /* JADX WARNING: Missing block: B:249:0x04f6, code skipped:
            return;
     */
    public final void a(defpackage.aajs r25, defpackage.affa r26, java.lang.String r27, defpackage.aajj r28) {
        /*
        r24 = this;
        r10 = r24;
        r0 = r25;
        r11 = r26;
        r1 = r27;
        r12 = r28;
        r13 = 0;
        defpackage.xak.a();	 Catch:{ all -> 0x0519 }
        r2 = r10.z;	 Catch:{ all -> 0x0519 }
        r3 = r25.n();	 Catch:{ all -> 0x0519 }
        r15 = 0;
        if (r3 != 0) goto L_0x0020;
    L_0x0017:
        r3 = r28.o();	 Catch:{ all -> 0x0519 }
        if (r3 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r3 = 0;
        goto L_0x0021;
    L_0x0020:
        r3 = 1;
    L_0x0021:
        r2 = r2 | r3;
        r10.z = r2;	 Catch:{ all -> 0x0519 }
        if (r2 != 0) goto L_0x0051;
    L_0x0026:
        r2 = r28.g();	 Catch:{ all -> 0x0519 }
        if (r2 == 0) goto L_0x0051;
    L_0x002c:
        r2 = r10.p;	 Catch:{ all -> 0x0519 }
        if (r2 == 0) goto L_0x0051;
    L_0x0030:
        r2 = r2.n();	 Catch:{ all -> 0x0519 }
        if (r2 != 0) goto L_0x0051;
    L_0x0036:
        r2 = "EXO surface missing during loadVideo().";
        defpackage.xtl.d(r2);	 Catch:{ all -> 0x0519 }
        r2 = r28.h();	 Catch:{ all -> 0x0519 }
        r2 = (long) r2;	 Catch:{ all -> 0x0519 }
        r4 = "src.none";
        r10.a(r2, r4);	 Catch:{ all -> 0x0519 }
        r2 = new afdb;	 Catch:{ all -> 0x0519 }
        r2.<init>(r0, r11, r1, r12);	 Catch:{ all -> 0x0519 }
        r10.t = r2;	 Catch:{ all -> 0x0519 }
        r10.B = r13;
        r10.C = r13;
        return;
    L_0x0051:
        r2 = r10.i;	 Catch:{ all -> 0x0519 }
        r2.j();	 Catch:{ all -> 0x0519 }
        r2 = r0.i;	 Catch:{ all -> 0x0519 }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r18 = -1;
        r8 = 0;
        if (r2 == 0) goto L_0x00b2;
    L_0x0060:
        r2 = r2.l;	 Catch:{ all -> 0x0519 }
        r2 = (defpackage.npf) r2;	 Catch:{ all -> 0x0519 }
        if (r2 == 0) goto L_0x00b2;
    L_0x0066:
        r3 = r2.b();	 Catch:{ all -> 0x0519 }
        if (r3 == 0) goto L_0x00b2;
    L_0x006c:
        r2 = r2.a(r15);	 Catch:{ all -> 0x0519 }
        r3 = r2 instanceof defpackage.aeki;	 Catch:{ all -> 0x0519 }
        if (r3 == 0) goto L_0x00b2;
    L_0x0074:
        r3 = r2;
        r3 = (defpackage.aeki) r3;	 Catch:{ all -> 0x0519 }
        r3 = r3.c;	 Catch:{ all -> 0x0519 }
        r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1));
        if (r5 == 0) goto L_0x00b2;
    L_0x007d:
        r5 = r2.b;	 Catch:{ all -> 0x0519 }
        r5 = r5.isEmpty();	 Catch:{ all -> 0x0519 }
        if (r5 != 0) goto L_0x00b2;
    L_0x0085:
        r5 = r2.b;	 Catch:{ all -> 0x0519 }
        r5 = r5.get(r15);	 Catch:{ all -> 0x0519 }
        r5 = (defpackage.npe) r5;	 Catch:{ all -> 0x0519 }
        r6 = r5.b;	 Catch:{ all -> 0x0519 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0519 }
        if (r6 != 0) goto L_0x00b2;
    L_0x0095:
        r5 = r5.b;	 Catch:{ all -> 0x0519 }
        r5 = r5.get(r15);	 Catch:{ all -> 0x0519 }
        r5 = (defpackage.npm) r5;	 Catch:{ all -> 0x0519 }
        r5 = r5.d();	 Catch:{ all -> 0x0519 }
        if (r5 == 0) goto L_0x00b2;
    L_0x00a3:
        r6 = r2.a;	 Catch:{ all -> 0x0519 }
        r3 = r3 - r6;
        r2 = r5.a();	 Catch:{ all -> 0x0519 }
        r5 = r5.a(r2);	 Catch:{ all -> 0x0519 }
        r5 = r5 / r16;
        r3 = r3 - r5;
        goto L_0x00b3;
    L_0x00b2:
        r3 = r8;
    L_0x00b3:
        r10.aA = r3;	 Catch:{ all -> 0x0519 }
        r24.H();	 Catch:{ all -> 0x0519 }
        r2 = r10.aa;	 Catch:{ all -> 0x0519 }
        r2.deleteObserver(r10);	 Catch:{ all -> 0x0519 }
        r2 = r10.k;	 Catch:{ all -> 0x0519 }
        r2.deleteObserver(r10);	 Catch:{ all -> 0x0519 }
        r10.s = r0;	 Catch:{ all -> 0x0519 }
        r10.ar = r1;	 Catch:{ all -> 0x0519 }
        r10.y = r12;	 Catch:{ all -> 0x0519 }
        r0 = r10.Z;	 Catch:{ all -> 0x0519 }
        r0.a();	 Catch:{ all -> 0x0519 }
        r0 = r10.s;	 Catch:{ all -> 0x0519 }
        r0 = r0.d();	 Catch:{ all -> 0x0519 }
        if (r0 == 0) goto L_0x00de;
    L_0x00d5:
        r0 = r10.i;	 Catch:{ all -> 0x0519 }
        r1 = "cat";
        r2 = defpackage.aetw.b;	 Catch:{ all -> 0x0519 }
        r0.a(r1, r2);	 Catch:{ all -> 0x0519 }
    L_0x00de:
        r0 = r24.x();	 Catch:{ all -> 0x0519 }
        if (r0 != 0) goto L_0x00ec;
    L_0x00e4:
        r0 = r10.ac;	 Catch:{ all -> 0x0519 }
        r0.incrementAndGet();	 Catch:{ all -> 0x0519 }
        r24.Y();	 Catch:{ all -> 0x0519 }
    L_0x00ec:
        r0 = r10.P;	 Catch:{ all -> 0x0519 }
        r1 = r24.F();	 Catch:{ all -> 0x0519 }
        r0 = r0.a(r10, r1, r12);	 Catch:{ all -> 0x0519 }
        r10.as = r0;	 Catch:{ all -> 0x0519 }
        r0 = new afgp;	 Catch:{ all -> 0x0519 }
        r1 = r10.y;	 Catch:{ all -> 0x0519 }
        r2 = r10.s;	 Catch:{ all -> 0x0519 }
        r3 = new afcf;	 Catch:{ all -> 0x0519 }
        r3.<init>(r10);	 Catch:{ all -> 0x0519 }
        r4 = r10.j;	 Catch:{ all -> 0x0519 }
        r0.<init>(r1, r2, r3, r4);	 Catch:{ all -> 0x0519 }
        r10.D = r0;	 Catch:{ all -> 0x0519 }
        r10.u = r15;	 Catch:{ all -> 0x0519 }
        r10.v = r15;	 Catch:{ all -> 0x0519 }
        r10.w = r15;	 Catch:{ all -> 0x0519 }
        r0 = r10.p;	 Catch:{ all -> 0x0519 }
        if (r0 == 0) goto L_0x0117;
    L_0x0114:
        r0.c();	 Catch:{ all -> 0x0519 }
    L_0x0117:
        r2 = r10.s;	 Catch:{ afgr -> 0x04fd }
        r3 = r10.y;	 Catch:{ afgr -> 0x04fd }
        r6 = r10.z;	 Catch:{ afgr -> 0x04fd }
        r0 = r10.ar;	 Catch:{ afgr -> 0x04fd }
        r1 = r10.k;	 Catch:{ afgr -> 0x04fd }
        r1 = r1.a();	 Catch:{ afgr -> 0x04fd }
        r1 = r1.k;	 Catch:{ afgr -> 0x04fd }
        if (r1 == 0) goto L_0x0166;
    L_0x0129:
        r1 = r10.C;	 Catch:{ afgr -> 0x04fd }
        if (r1 == 0) goto L_0x0166;
    L_0x012d:
        r1 = r10.s;	 Catch:{ afgr -> 0x04fd }
        r4 = r10.q;	 Catch:{ afgr -> 0x04fd }
        if (r4 == 0) goto L_0x0166;
    L_0x0133:
        r4 = r1.t;	 Catch:{ afgr -> 0x04fd }
        if (r4 == 0) goto L_0x0138;
    L_0x0137:
        goto L_0x0166;
    L_0x0138:
        r4 = r1.x();	 Catch:{ afgr -> 0x04fd }
        if (r4 != 0) goto L_0x0166;
    L_0x013e:
        r4 = r1.d();	 Catch:{ afgr -> 0x04fd }
        if (r4 != 0) goto L_0x0166;
    L_0x0144:
        r4 = r1.s();	 Catch:{ afgr -> 0x04fd }
        if (r4 != 0) goto L_0x0166;
    L_0x014a:
        r4 = r1.r();	 Catch:{ afgr -> 0x04fd }
        if (r4 != 0) goto L_0x0166;
    L_0x0150:
        r4 = r10.C;	 Catch:{ afgr -> 0x04fd }
        r4 = r4.a;	 Catch:{ afgr -> 0x04fd }
        if (r4 == 0) goto L_0x0166;
    L_0x0156:
        r1 = r1.c;	 Catch:{ afgr -> 0x04fd }
        r1 = r4.equals(r1);	 Catch:{ afgr -> 0x04fd }
        if (r1 != 0) goto L_0x015f;
    L_0x015e:
        goto L_0x0166;
    L_0x015f:
        r1 = r10.C;	 Catch:{ afgr -> 0x04fd }
        r1 = r1.d;	 Catch:{ afgr -> 0x04fd }
        r20 = r1;
        goto L_0x0168;
    L_0x0166:
        r20 = r13;
    L_0x0168:
        r4 = 0;
        r5 = 1;
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = r24;
        r13 = r8;
        r8 = r0;
        r9 = r20;
        r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0516 }
        r9 = r0.a;	 Catch:{  }
        r10.E = r9;	 Catch:{  }
        r1 = r10.i;	 Catch:{  }
        r2 = "pmqs";
        r3 = new aetw;	 Catch:{  }
        r4 = r9.c();	 Catch:{  }
        r3.<init>(r4);	 Catch:{  }
        r1.a(r2, r3);	 Catch:{  }
        r1 = r9.f;	 Catch:{  }
        r2 = r1.c();	 Catch:{  }
        if (r2 == 0) goto L_0x01a5;
    L_0x0193:
        r2 = r10.i;	 Catch:{  }
        r3 = "sc";
        r4 = new aetw;	 Catch:{  }
        r1 = r1.b;	 Catch:{  }
        r1 = java.lang.Integer.toString(r1);	 Catch:{  }
        r4.<init>(r1);	 Catch:{  }
        r2.a(r3, r4);	 Catch:{  }
    L_0x01a5:
        r1 = r9.h;	 Catch:{  }
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 != r2) goto L_0x01ad;
    L_0x01ac:
        goto L_0x01bd;
    L_0x01ad:
        r3 = r10.i;	 Catch:{  }
        r4 = "lmdu";
        r5 = new aetw;	 Catch:{  }
        r1 = java.lang.Integer.toString(r1);	 Catch:{  }
        r5.<init>(r1);	 Catch:{  }
        r3.a(r4, r5);	 Catch:{  }
    L_0x01bd:
        r3 = r9.a;	 Catch:{  }
        r1 = r9.a();	 Catch:{  }
        r10.x = r1;	 Catch:{  }
        r0 = r0.b;	 Catch:{  }
        r10.L = r0;	 Catch:{  }
        r0 = r10.k;	 Catch:{  }
        r0 = r0.e;	 Catch:{  }
        if (r0 != 0) goto L_0x01d8;
    L_0x01cf:
        r0 = r9.b();	 Catch:{  }
        if (r0 == 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x01d8;
    L_0x01d6:
        r0 = 0;
        goto L_0x01d9;
    L_0x01d8:
        r0 = 1;
    L_0x01d9:
        r10.at = r0;	 Catch:{  }
        r0 = r10.p;	 Catch:{  }
        if (r0 == 0) goto L_0x020c;
    L_0x01df:
        r1 = r10.x;	 Catch:{  }
        r4 = r10.y;	 Catch:{  }
        r4 = r4.aa();	 Catch:{  }
        r5 = r10.y;	 Catch:{  }
        r5 = r5.ab();	 Catch:{  }
        r0.a(r1, r4, r5);	 Catch:{  }
        r0 = r24.V();	 Catch:{  }
        r0 = r10.a(r0, r15);	 Catch:{  }
        if (r0 == 0) goto L_0x0206;
    L_0x01fa:
        r0 = r10.p;	 Catch:{  }
        r1 = 1;
        r4 = 0;
        r0.a(r1, r4, r13);	 Catch:{ all -> 0x0202 }
        goto L_0x020c;
    L_0x0202:
        r0 = move-exception;
        r1 = r4;
        goto L_0x051b;
    L_0x0206:
        r4 = 0;
        r10.B = r4;
        r10.C = r4;
        return;
    L_0x020c:
        r0 = r10.l;	 Catch:{  }
        r1 = r10.s;	 Catch:{  }
        r0.a(r1);	 Catch:{  }
        r0 = r10.ai;	 Catch:{  }
        if (r0 != 0) goto L_0x021b;
    L_0x0217:
        r23 = r9;
        goto L_0x0469;
    L_0x021b:
        r1 = r0.b;	 Catch:{  }
        r1.e();	 Catch:{  }
        r0 = r0.c;	 Catch:{  }
        r0.e();	 Catch:{  }
        r0 = r10.s;	 Catch:{  }
        r1 = r0.t;	 Catch:{  }
        if (r1 != 0) goto L_0x0217;
    L_0x022b:
        r0 = r0.x();	 Catch:{  }
        if (r0 != 0) goto L_0x0217;
    L_0x0231:
        r0 = r10.s;	 Catch:{  }
        r0 = r0.d();	 Catch:{  }
        if (r0 != 0) goto L_0x0217;
    L_0x0239:
        r0 = r10.s;	 Catch:{  }
        r0 = r0.s();	 Catch:{  }
        if (r0 != 0) goto L_0x0217;
    L_0x0241:
        r0 = r10.s;	 Catch:{  }
        r0 = r0.r();	 Catch:{  }
        if (r0 != 0) goto L_0x0217;
    L_0x0249:
        r0 = r9.a();	 Catch:{  }
        if (r0 != 0) goto L_0x0217;
    L_0x024f:
        r0 = r3.length;	 Catch:{  }
        if (r0 == 0) goto L_0x0217;
    L_0x0252:
        r0 = r10.C;	 Catch:{  }
        if (r0 == 0) goto L_0x0217;
    L_0x0256:
        r0 = r10.q;	 Catch:{  }
        if (r0 == 0) goto L_0x0217;
    L_0x025a:
        r0 = r10.ai;	 Catch:{  }
        r1 = r10.s;	 Catch:{  }
        r4 = r10.k;	 Catch:{  }
        r5 = r0.b;	 Catch:{  }
        r5 = r5.a(r1);	 Catch:{  }
        if (r5 == 0) goto L_0x0269;
    L_0x0268:
        goto L_0x0271;
    L_0x0269:
        r5 = r4.a();	 Catch:{  }
        r5 = r5.e;	 Catch:{  }
        if (r5 == 0) goto L_0x0217;
    L_0x0271:
        r0 = r0.c;	 Catch:{  }
        r0 = r0.a(r1);	 Catch:{  }
        if (r0 == 0) goto L_0x027a;
    L_0x0279:
        goto L_0x0282;
    L_0x027a:
        r0 = r4.a();	 Catch:{  }
        r0 = r0.f;	 Catch:{  }
        if (r0 == 0) goto L_0x0217;
    L_0x0282:
        r0 = r10.C;	 Catch:{  }
        r0 = r0.a;	 Catch:{  }
        r1 = r10.s;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        r0 = r0.equals(r1);	 Catch:{  }
        if (r0 == 0) goto L_0x0217;
    L_0x0290:
        r0 = r10.C;	 Catch:{  }
        r0 = r0.b;	 Catch:{  }
        r1 = r0.length;	 Catch:{  }
        r4 = 1;
        if (r1 <= r4) goto L_0x02a1;
    L_0x0298:
        r0 = r0[r4];	 Catch:{  }
        r0 = r0 instanceof defpackage.aewo;	 Catch:{  }
        if (r0 != 0) goto L_0x029f;
    L_0x029e:
        goto L_0x02a1;
    L_0x029f:
        r0 = 1;
        goto L_0x02a2;
    L_0x02a1:
        r0 = 0;
    L_0x02a2:
        r1 = r24.U();	 Catch:{  }
        if (r0 != r1) goto L_0x0217;
    L_0x02a8:
        r0 = r10.e;	 Catch:{  }
        r0 = r0.a;	 Catch:{  }
        r1 = new aeiq;	 Catch:{  }
        r1.<init>();	 Catch:{  }
        r0.a(r1);	 Catch:{  }
        r0 = r10.C;	 Catch:{  }
        r0 = r0.b;	 Catch:{  }
        r10.a(r0);	 Catch:{  }
        r0 = r10.y;	 Catch:{  }
        r0 = r0.v();	 Catch:{  }
        if (r0 != 0) goto L_0x02c5;
    L_0x02c3:
        r0 = 1;
        goto L_0x02c8;
    L_0x02c5:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x02c8:
        r12 = r9.b;	 Catch:{  }
        r1 = r10.s;	 Catch:{  }
        r7 = r1.d;	 Catch:{  }
        r1 = r12[r15];	 Catch:{  }
        r1 = r1.f;	 Catch:{  }
        r2 = r9.f;	 Catch:{  }
        r1 = r10.a(r1, r2);	 Catch:{  }
        r10.r = r1;	 Catch:{  }
        r1 = r10.C;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        if (r1 == 0) goto L_0x0307;
    L_0x02e0:
        r1 = r10.y;	 Catch:{  }
        r1 = r1.E();	 Catch:{  }
        if (r1 == 0) goto L_0x02ee;
    L_0x02e8:
        r1 = r10.C;	 Catch:{  }
        r1.a();	 Catch:{  }
        goto L_0x0307;
    L_0x02ee:
        r1 = r10.C;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        r1 = r1[r15];	 Catch:{  }
        r2 = r10.y;	 Catch:{  }
        r4 = 0;
        r1.a(r2, r4);	 Catch:{ all -> 0x0202 }
        r1 = r10.C;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        r2 = 1;
        r1 = r1[r2];	 Catch:{  }
        r2 = r10.y;	 Catch:{  }
        r4 = 0;
        r1.a(r2, r4);	 Catch:{ all -> 0x0202 }
    L_0x0307:
        r1 = r10.y;	 Catch:{  }
        r2 = r10.f;	 Catch:{  }
        r6 = defpackage.afge.a(r1, r2);	 Catch:{  }
        r2 = r10.a(r3);	 Catch:{  }
        r4 = r10.r;	 Catch:{  }
        r1 = r10.ar;	 Catch:{  }
        r20 = r10.a(r3, r1, r0);	 Catch:{  }
        r1 = r10.C;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        if (r1 == 0) goto L_0x0325;
    L_0x0321:
        r1 = r1[r15];	 Catch:{  }
        r15 = r1;
        goto L_0x0326;
    L_0x0325:
        r15 = 0;
    L_0x0326:
        r21 = 0;
        r1 = r24;
        r3 = r4;
        r4 = r7;
        r25 = r6;
        r6 = r21;
        r21 = r7;
        r7 = r20;
        r8 = r25;
        r23 = r9;
        r9 = r15;
        r1 = r1.a(r2, r3, r4, r6, r7, r8, r9);	 Catch:{  }
        r2 = r10.ai;	 Catch:{  }
        r2 = r2.b;	 Catch:{  }
        r2.a(r1);	 Catch:{  }
        r2 = r10.s;	 Catch:{  }
        r2 = r2.a();	 Catch:{  }
        if (r2 != 0) goto L_0x0351;
    L_0x034c:
        r2 = r10.r;	 Catch:{  }
        r2.a(r1);	 Catch:{  }
    L_0x0351:
        r2 = r10.b(r12);	 Catch:{  }
        r1 = r10.ar;	 Catch:{  }
        r7 = r10.a(r12, r1, r0);	 Catch:{  }
        r0 = r10.y;	 Catch:{  }
        r8 = defpackage.afge.a(r0);	 Catch:{  }
        r0 = r10.C;	 Catch:{  }
        r0 = r0.c;	 Catch:{  }
        if (r0 == 0) goto L_0x036c;
    L_0x0367:
        r1 = 1;
        r0 = r0[r1];	 Catch:{  }
        r9 = r0;
        goto L_0x036d;
    L_0x036c:
        r9 = 0;
    L_0x036d:
        r3 = 0;
        r6 = 1;
        r1 = r24;
        r4 = r21;
        r0 = r1.a(r2, r3, r4, r6, r7, r8, r9);	 Catch:{  }
        r1 = r10.C;	 Catch:{  }
        r1.a();	 Catch:{  }
        r1 = r10.ai;	 Catch:{  }
        r1 = r1.c;	 Catch:{  }
        r1.a(r0);	 Catch:{  }
        r0 = r10.z;	 Catch:{  }
        r1 = -1;
        if (r0 == 0) goto L_0x0393;
    L_0x0388:
        r0 = r10.ak;	 Catch:{  }
        if (r0 == 0) goto L_0x0393;
    L_0x038c:
        r0 = r10.q;	 Catch:{  }
        r2 = 1;
        r0.a(r2, r1);	 Catch:{  }
        goto L_0x0394;
    L_0x0393:
        r2 = 1;
    L_0x0394:
        r0 = r25;
        r3 = 0;
        r0 = r0.a(r1, r3);	 Catch:{ all -> 0x0465 }
        r3 = r11.a;	 Catch:{  }
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 == 0) goto L_0x0458;
    L_0x03a1:
        r5 = r11.b;	 Catch:{  }
        r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1));
        if (r7 == 0) goto L_0x041b;
    L_0x03a7:
        r5 = r10.k;	 Catch:{  }
        r5 = r5.a();	 Catch:{  }
        r5 = r5.g;	 Catch:{  }
        if (r5 != 0) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03b3;
    L_0x03b2:
        r0 = 1;
    L_0x03b3:
        r2 = r10.ai;	 Catch:{  }
        r2 = r2.b;	 Catch:{  }
        r5 = r11.b;	 Catch:{  }
        r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1));
        if (r7 == 0) goto L_0x0411;
    L_0x03bd:
        r2 = r2.d();	 Catch:{  }
        r5 = r2 instanceof defpackage.nqy;	 Catch:{  }
        if (r5 == 0) goto L_0x0411;
    L_0x03c5:
        r2 = (defpackage.nqy) r2;	 Catch:{  }
        r5 = r11.a;	 Catch:{  }
        r5 = r5 * r16;
        r7 = r2.e;	 Catch:{  }
        r8 = r2.a;	 Catch:{  }
        r8 = r8 + r1;
        r15 = r7[r8];	 Catch:{  }
        r1 = r2.d;	 Catch:{  }
        r7 = r1[r8];	 Catch:{  }
        r15 = r15 + r7;
        r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1));
        if (r1 <= 0) goto L_0x03e1;
    L_0x03db:
        r0 = "Invalid start position or chunk index.";
        defpackage.aepe.a(r0);	 Catch:{  }
        goto L_0x0411;
    L_0x03e1:
        r1 = r0;
        r7 = r13;
    L_0x03e3:
        r9 = r2.a;	 Catch:{  }
        if (r1 < r9) goto L_0x03e8;
    L_0x03e7:
        goto L_0x03f3;
    L_0x03e8:
        r9 = r2.e;	 Catch:{  }
        r15 = r9[r1];	 Catch:{  }
        r9 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1));
        if (r9 < 0) goto L_0x03f3;
    L_0x03f0:
        r1 = r1 + r0;
        r7 = r15;
        goto L_0x03e3;
    L_0x03f3:
        r0 = (double) r7;
        r5 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r0);
        r0 = r0 / r5;
        r0 = java.lang.Math.ceil(r0);	 Catch:{  }
        r0 = (long) r0;	 Catch:{  }
        r5 = r11.b;	 Catch:{  }
        r7 = r11.a;	 Catch:{  }
        r11 = r7 - r0;
        r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r2 >= 0) goto L_0x040f;
    L_0x040c:
        r18 = r7 - r5;
        goto L_0x0411;
    L_0x040f:
        r18 = r0;
    L_0x0411:
        r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1));
        if (r0 < 0) goto L_0x0416;
    L_0x0415:
        goto L_0x0418;
    L_0x0416:
        r18 = r3;
    L_0x0418:
        r0 = r18;
        goto L_0x041c;
    L_0x041b:
        r0 = r3;
    L_0x041c:
        r2 = r10.q;	 Catch:{  }
        r2.a(r0);	 Catch:{  }
        r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r2 <= 0) goto L_0x0426;
    L_0x0425:
        goto L_0x042a;
    L_0x0426:
        r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1));
        if (r2 <= 0) goto L_0x0458;
    L_0x042a:
        r2 = r10.i;	 Catch:{  }
        r5 = "st";
        r6 = new aetw;	 Catch:{  }
        r3 = java.lang.Long.toString(r3);	 Catch:{  }
        r4 = java.lang.String.valueOf(r3);	 Catch:{  }
        r4 = r4.length();	 Catch:{  }
        r4 = r4 + 21;
        r7 = new java.lang.StringBuilder;	 Catch:{  }
        r7.<init>(r4);	 Catch:{  }
        r7.append(r3);	 Catch:{  }
        r3 = 59;
        r7.append(r3);	 Catch:{  }
        r7.append(r0);	 Catch:{  }
        r0 = r7.toString();	 Catch:{  }
        r6.<init>(r0);	 Catch:{  }
        r2.a(r5, r6);	 Catch:{  }
    L_0x0458:
        r0 = r10.ap;	 Catch:{  }
        r10.a(r0);	 Catch:{  }
        r0 = r10.aF;	 Catch:{  }
        r10.b(r0);	 Catch:{  }
        r0 = r23;
        goto L_0x04c1;
    L_0x0465:
        r0 = move-exception;
        r1 = r3;
        goto L_0x051b;
    L_0x0469:
        r0 = r10.C;	 Catch:{  }
        if (r0 == 0) goto L_0x0470;
    L_0x046d:
        r0.a();	 Catch:{  }
    L_0x0470:
        r0 = r10.A;	 Catch:{  }
        if (r0 != 0) goto L_0x0485;
    L_0x0474:
        r0 = r10.ac;	 Catch:{  }
        r0.incrementAndGet();	 Catch:{  }
        r0 = r10.P;	 Catch:{  }
        r1 = r24.F();	 Catch:{  }
        r0 = r0.a(r10, r1, r12);	 Catch:{  }
        r10.as = r0;	 Catch:{  }
    L_0x0485:
        r0 = r10.y;	 Catch:{  }
        r0 = r0.L();	 Catch:{  }
        r0 = r10.a(r0);	 Catch:{  }
        if (r0 == 0) goto L_0x04f7;
    L_0x0491:
        r2 = r10.s;	 Catch:{ afct -> 0x04e2 }
        r0 = r23;
        r4 = r0.b;	 Catch:{ afct -> 0x04e2 }
        r5 = r0.f;	 Catch:{ afct -> 0x04e2 }
        r6 = r24.U();	 Catch:{ afct -> 0x04e2 }
        r1 = r24;
        r1 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ afct -> 0x04e2 }
        r1 = r10.a(r1);	 Catch:{ afct -> 0x04e2 }
        r2 = r10.ae;	 Catch:{  }
        r3 = r10.L;	 Catch:{  }
        r4 = r10.y;	 Catch:{  }
        r4 = r4.ai();	 Catch:{  }
        r5 = r10.y;	 Catch:{  }
        r5 = r5.ah();	 Catch:{  }
        r6 = r10.x;	 Catch:{  }
        r2.a(r3, r4, r5, r6);	 Catch:{  }
        r2 = r11.a;	 Catch:{  }
        r10.a(r1, r2);	 Catch:{  }
    L_0x04c1:
        r10.a(r0);	 Catch:{  }
        r0 = r10.aw;	 Catch:{  }
        r10.b(r0);	 Catch:{  }
        r24.M();	 Catch:{  }
        r1 = 0;
        r10.B = r1;
        r10.C = r1;
        r0 = r10.aa;
        r0.addObserver(r10);
        r0 = r10.k;
        r0.addObserver(r10);
        r24.D();
        r24.X();
        return;
    L_0x04e2:
        r0 = new afif;	 Catch:{  }
        r1 = "unparseable";
        r2 = r24.o();	 Catch:{  }
        r4 = 5;
        r0.<init>(r4, r1, r2);	 Catch:{  }
        r10.a(r0);	 Catch:{  }
        r1 = 0;
        r10.B = r1;
        r10.C = r1;
        return;
    L_0x04f7:
        r1 = 0;
        r10.B = r1;
        r10.C = r1;
        return;
    L_0x04fd:
        r0 = move-exception;
        r1 = new afif;	 Catch:{  }
        r2 = "fmt.noneavailable";
        r3 = r24.o();	 Catch:{  }
        r0 = r0.getMessage();	 Catch:{  }
        r1.<init>(r2, r3, r0);	 Catch:{  }
        r10.a(r1);	 Catch:{  }
        r1 = 0;
        r10.B = r1;
        r10.C = r1;
        return;
    L_0x0516:
        r0 = move-exception;
        r1 = 0;
        goto L_0x051b;
    L_0x0519:
        r0 = move-exception;
        r1 = r13;
    L_0x051b:
        r10.B = r1;
        r10.C = r1;
        goto L_0x0521;
    L_0x0520:
        throw r0;
    L_0x0521:
        goto L_0x0520;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(aajs, affa, java.lang.String, aajj):void");
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return a(aajs, aajj, afgt, false, z, i, afgs.c, null).a;
    }

    public final void c() {
        if (this.q != null) {
            aajs aajs = this.s;
            if (!(aajs == null || this.ak == null)) {
                try {
                    aahr aahr;
                    afcq a = a(aajs, this.y, null, true, this.z, Integer.MAX_VALUE, this.ar, null);
                    afgv afgv = a.a;
                    if (afgv.f.a()) {
                        aeuy aeuy = this.i;
                        aahr = this.F;
                        String valueOf = String.valueOf(aahr != null ? Integer.valueOf(aahr.u()) : "none");
                        int d = afgv.d();
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                        stringBuilder.append("curr.");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(";new.");
                        stringBuilder.append(d);
                        aeuy.a("mqs", (aevf) new aetw(stringBuilder.toString()));
                    }
                    this.E = afgv;
                    this.I = afgv.c;
                    if (this.y.v()) {
                        a(afgv);
                    } else {
                        aahr aahr2 = afgv.a[0];
                        aahr = afgv.b[0];
                        if (!(aahr2.equals(this.F) && aahr.equals(this.G)) && a(this.y.L())) {
                            aahr[] aahrArr = new aahr[]{aahr2};
                            this.L = a.b;
                            try {
                                nnj[] a2 = a(a(this.s, aahrArr, afgv.b, afgv.f, U()));
                                this.i.k();
                                a(a2, o());
                                b(this.aw);
                                M();
                            } catch (afct unused) {
                                a(new afif(5, "unparseable", o()));
                            }
                        }
                    }
                } catch (afgr unused2) {
                }
            }
        }
    }

    public final aahr d() {
        return this.F;
    }

    public final aahr e() {
        return this.G;
    }

    public final void a(afif afif) {
        String a = afif.a();
        Object obj = afif.c;
        if (obj instanceof Throwable) {
            xtl.a(a, (Throwable) obj);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 2) + valueOf.length());
            stringBuilder.append(a);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
        }
        this.i.a(afif);
        this.l.a();
        I();
    }

    private final void I() {
        G();
        S();
        this.f.c();
        this.ak = null;
        this.aj = null;
        this.al = null;
        this.s = null;
        this.t = null;
        Y();
        this.ac.incrementAndGet();
        H();
        this.aa.deleteObserver(this);
        this.k.deleteObserver(this);
        this.aA = 0;
        this.aB = new nnk(0, 0);
        Future future = this.A;
        if (future != null) {
            future.cancel(true);
            this.A = null;
        }
        this.m.a();
        this.aq = false;
        this.ar = null;
        this.x = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A:{Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A:{Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A:{Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A:{Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A:{Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }} */
    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            if (r0.t == false) goto L_0x0031;
     */
    private final boolean a(int r21) {
        /*
        r20 = this;
        r1 = r20;
        r0 = r1.q;
        r2 = 0;
        if (r0 == 0) goto L_0x0031;
    L_0x0008:
        r0 = r1.y;
        r0 = r0.c;
        r4 = r0.a;
        r4 = r4 & 2;
        if (r4 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0018;
    L_0x0016:
        r0 = defpackage.arhh.bv;
    L_0x0018:
        r0 = r0.A;
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0027;
    L_0x001d:
        r0 = r1.s;
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0031;
    L_0x0022:
        r0 = r0.t;
        if (r0 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0031;
    L_0x0027:
        r0 = r1.q;
        r4 = r0.i();
        r20.P();
        goto L_0x0032;
    L_0x0031:
        r4 = r2;
    L_0x0032:
        r0 = r1.q;
        if (r0 != 0) goto L_0x0055;
    L_0x0036:
        r0 = r1.O;
        r6 = r1.y;
        r6 = r6.M();
        r7 = r21;
        r0 = r0.a(r7, r6);
        r1.q = r0;
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x004f;
    L_0x004a:
        r0 = r1.q;
        r0.a(r4);
    L_0x004f:
        r0 = r1.q;
        r0.a(r1);
        goto L_0x005b;
    L_0x0055:
        r20.O();
        r20.y();
    L_0x005b:
        r2 = 0;
        r0 = r1.s;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r3 = 1;
        r4 = 0;
        if (r0 == 0) goto L_0x00c8;
    L_0x0062:
        r5 = r0.t;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        if (r5 == 0) goto L_0x00c8;
    L_0x0066:
        r4 = r1.as;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r6 = r0.y();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r1.q;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r8 = r0.a();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r9 = r1.j;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r1.s;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r11 = r0.c;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r12 = r1.ar;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r14 = r0.h;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r15 = r0.z();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r1.s;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r16 = r0.a();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r1.p;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        if (r0 == 0) goto L_0x0095;
    L_0x008a:
        r0 = r0.o();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r0.k;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        if (r0 != 0) goto L_0x0093;
    L_0x0092:
        goto L_0x0095;
    L_0x0093:
        r0 = 1;
        goto L_0x0096;
    L_0x0095:
        r0 = 0;
    L_0x0096:
        r4.k = r0;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r4.h = r2;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r4.i = r2;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r5 = 18;
        if (r0 < r5) goto L_0x00c2;
    L_0x00a2:
        r0 = r4.e;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r0.get();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r17 = r0;
        r17 = (defpackage.aese) r17;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r7 = r4.g;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r13 = r4.d;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0 = r4.f;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r5 = r4.c;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r10 = r4;
        r18 = r0;
        r19 = r5;
        r0 = com.google.android.libraries.youtube.media.player.drm.WidevineHelper.V18CompatibilityLayer.createDrmSessionManager18(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r4.j = r0;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r4 = r4.j;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        goto L_0x00c8;
    L_0x00c2:
        r0 = new java.lang.UnsupportedOperationException;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
    L_0x00c8:
        r1.ao = r4;	 Catch:{ UnsupportedOperationException -> 0x00e0, nqp -> 0x00cb }
        return r3;
    L_0x00cb:
        r0 = move-exception;
        r5 = r20.o();
        r3 = r0.a;
        r4 = r0.getCause();
        r7 = 1;
        r0 = defpackage.aevl.a(r3, r4, r5, r7);
        r1.a(r0);
        return r2;
    L_0x00e0:
        r0 = new afif;
        r4 = 4;
        r6 = r20.o();
        r8 = 0;
        r5 = "missingapi";
        r3 = r0;
        r3.<init>(r4, r5, r6, r8);
        r1.a(r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(int):boolean");
    }

    private final void a(nnj[] nnjArr, long j) {
        this.q.a(j);
        a(this.ap);
        b(this.aF);
        z();
        this.q.a(nnjArr);
        if (this.z && this.ak != null) {
            this.q.a(1, -1);
        }
    }

    private final void a(afgv afgv) {
        boolean z = false;
        amqw.b(this.q != null);
        if (this.y != null) {
            z = true;
        }
        amqw.b(z);
        if (this.y.v() && afgv.a.length > 1) {
            this.q.a(this.r, 1, afgv.f);
        }
        b(afgv);
    }

    private final void b(afgv afgv) {
        if (this.q != null) {
            aajj aajj = this.y;
            if (aajj != null && afgv != null && this.aq && aajj.v() && afgv.b.length > 1) {
                String str = afgv.g.e;
                int b = this.q.b(0);
                String str2 = null;
                String str3 = null;
                for (aahr aahr : afgv.b) {
                    if (str != null && str.equals(aahr.k())) {
                        str2 = aahr.e;
                        break;
                    }
                    if (str3 == null && aahr.j()) {
                        str3 = aahr.e;
                    }
                }
                if (str2 == null && str3 != null) {
                    str2 = str3;
                }
                if (str2 != null) {
                    int c = this.q.c();
                    for (int i = 0; i < c; i++) {
                        if (str2.equals(this.q.a(i).a)) {
                            if (i != b) {
                                this.q.a(0, i);
                                nlp nlp = this.q;
                                nlp.a(nlp.i() + 1);
                            }
                            return;
                        }
                    }
                }
                this.q.a(0, 0);
            }
        }
    }

    private final nnj[] a(nnj[] nnjArr) {
        S();
        this.al = null;
        this.ak = null;
        int length = nnjArr.length;
        if (length > 0) {
            this.al = nnjArr[0];
            if (length > 1) {
                this.ak = nnjArr[1];
            }
        }
        return nnjArr;
    }

    public static int[] a(aahr[] aahrArr, npe npe) {
        Collection arrayList = new ArrayList(r1);
        for (aahr aahr : aahrArr) {
            String str = aahr.e;
            for (int i = 0; i < npe.b.size(); i++) {
                if (str.equals(((npm) npe.b.get(i)).b.a)) {
                    if (aahr.j()) {
                        arrayList.add(0, Integer.valueOf(i));
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return anhe.a(arrayList);
    }

    private final noz a(aahr[] aahrArr) {
        return new afce(this, aahrArr);
    }

    private final noz b(aahr[] aahrArr) {
        int i = 1;
        if (aahrArr.length != 1) {
            int b = aahrArr[0].b();
            ArrayList arrayList = new ArrayList();
            arrayList.add(aahrArr[0]);
            while (i < aahrArr.length) {
                if (b == aahrArr[i].b()) {
                    arrayList.add(aahrArr[i]);
                }
                i++;
            }
            aahrArr = (aahr[]) arrayList.toArray(new aahr[arrayList.size()]);
        }
        return new afch(this, aahrArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Missing block: B:21:0x0061, code skipped:
            if (r0.be == false) goto L_0x0063;
     */
    private final defpackage.nnj[] a(defpackage.aajs r38, defpackage.aahr[] r39, defpackage.aahr[] r40, defpackage.afgq r41, boolean r42) {
        /*
        r37 = this;
        r15 = r37;
        r0 = r38;
        r9 = r39;
        r14 = r40;
        r10 = r41;
        r1 = r38.x();
        r13 = 2;
        r16 = 0;
        r12 = 1;
        if (r1 != 0) goto L_0x024f;
    L_0x0014:
        r1 = r38.d();
        r11 = 5;
        if (r1 == 0) goto L_0x017b;
    L_0x001b:
        r17 = r38.b();
        r0 = r14[r16];
        r0 = r0.f;
        r0 = r15.a(r0, r10);
        r15.r = r0;
        r18 = r37.J();
        r0 = r15.y;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & r13;
        if (r1 == 0) goto L_0x0043;
    L_0x0036:
        r0 = r0.d;
        if (r0 != 0) goto L_0x003c;
    L_0x003a:
        r0 = defpackage.arhh.bv;
    L_0x003c:
        r0 = r0.bg;
        if (r0 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0043;
    L_0x0041:
        r0 = 0;
        goto L_0x0048;
    L_0x0043:
        r0 = new java.util.concurrent.Exchanger;
        r0.<init>();
    L_0x0048:
        r19 = r0;
        r20 = r37.B();
        if (r17 != 0) goto L_0x0065;
    L_0x0050:
        r0 = r15.y;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & r13;
        if (r1 == 0) goto L_0x0063;
    L_0x0059:
        r0 = r0.d;
        if (r0 != 0) goto L_0x005f;
    L_0x005d:
        r0 = defpackage.arhh.bv;
    L_0x005f:
        r0 = r0.be;
        if (r0 != 0) goto L_0x0065;
    L_0x0063:
        r7 = 0;
        goto L_0x0066;
    L_0x0065:
        r7 = 1;
    L_0x0066:
        r10 = r15.y;
        r21 = new aevp;
        r1 = r15.ar;
        r0 = r15.R;
        r2 = new afcg;
        r2.<init>(r10);
        r3 = defpackage.afiq.a(r0, r2, r11);
        r4 = r15.r;
        r5 = r15.D;
        r6 = r15.o;
        r8 = r15.j;
        r22 = 0;
        r23 = r37.F();
        r2 = r15.y;
        r0 = r15.s;
        r24 = r0.g();
        r0 = r21;
        r25 = r2;
        r2 = r39;
        r26 = r8;
        r8 = r20;
        r9 = r19;
        r27 = r10;
        r10 = r26;
        r11 = r22;
        r12 = r23;
        r13 = r25;
        r14 = r24;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r0 = new affz;
        r1 = r15.y;
        r1 = r1.z();
        r2 = r15.y;
        r2 = r2.y();
        r1 = r1 * r2;
        r4 = r1 << 10;
        r5 = r15.j;
        r6 = r15.X;
        r7 = r37.F();
        r1 = r15.y;
        r8 = r1.X();
        r9 = 0;
        r10 = r37.L();
        r1 = r0;
        r2 = r21;
        r3 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r15.aj = r0;
        r0 = r15.aj;
        r1 = r37.U();
        r21 = r15.a(r0, r1);
        r22 = new aevp;
        r1 = r15.ar;
        r0 = r15.R;
        r2 = new afcj;
        r3 = r27;
        r2.<init>(r3);
        r3 = 5;
        r3 = defpackage.afiq.a(r0, r2, r3);
        r4 = 0;
        r5 = r15.D;
        r6 = r15.o;
        r10 = r15.j;
        r12 = r37.F();
        r13 = r15.y;
        r0 = r15.s;
        r14 = r0.g();
        r0 = r22;
        r2 = r40;
        r7 = r17;
        r8 = r20;
        r9 = r19;
        r11 = r37;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        r29 = new affu;
        r0 = r15.y;
        r0 = r0.A();
        r1 = r15.y;
        r1 = r1.y();
        r0 = r0 * r1;
        r4 = r0 << 10;
        r5 = r15.j;
        r6 = r15.Y;
        r7 = r37.F();
        r0 = r15.y;
        r8 = r0.X();
        r9 = 0;
        r1 = r29;
        r2 = r22;
        r3 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = new aevy;
        r1 = r15.ae;
        r2 = r15.ao;
        r3 = r15.j;
        r4 = r15.V;
        r5 = new aewj;
        r6 = r15.e;
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r8 = r15.y;
        r8 = r8.L();
        r8 = (long) r8;
        r7 = r7.toMicros(r8);
        r11 = 1;
        r5.<init>(r6, r11, r7);
        r6 = r15.y;
        r35 = r6.am();
        r28 = r0;
        r30 = r1;
        r31 = r2;
        r32 = r3;
        r33 = r4;
        r34 = r5;
        r28.<init>(r29, r30, r31, r32, r33, r34, r35);
        r12 = 2;
        r1 = new defpackage.nnj[r12];
        r1[r16] = r0;
        r1[r11] = r21;
        return r1;
    L_0x017b:
        r3 = 5;
        r11 = 1;
        r12 = 2;
        r13 = r0.d;
        r8 = r37.J();
        r7 = r9.length;
        if (r7 > 0) goto L_0x0188;
    L_0x0187:
        r12 = 1;
    L_0x0188:
        r12 = new defpackage.nnj[r12];
        r0 = r15.y;
        r0 = r0.v();
        if (r0 != 0) goto L_0x0194;
    L_0x0192:
        r6 = 1;
        goto L_0x019a;
    L_0x0194:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x019a:
        r0 = r15.y;
        r1 = r15.s;
        r0 = defpackage.afbo.a(r0, r1);
        r1 = 6;
        if (r0 == 0) goto L_0x01d7;
    L_0x01a5:
        r5 = r40;
        r0 = r5.length;
        if (r0 <= 0) goto L_0x01d5;
    L_0x01aa:
        r0 = defpackage.aahv.k();
        r2 = r5[r16];
        r2 = r2.b();
        r2 = java.lang.Integer.valueOf(r2);
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x01d5;
    L_0x01be:
        r0 = r15.y;
        r0 = r0.e();
        if (r0 == 0) goto L_0x01d5;
    L_0x01c6:
        r0 = defpackage.affd.b;
        r0 = r0.get();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01da;
    L_0x01d5:
        r3 = 6;
        goto L_0x01da;
    L_0x01d7:
        r5 = r40;
        r3 = 1;
    L_0x01da:
        r1 = r15.b(r5);
        r2 = 0;
        r17 = 1;
        r0 = r15.ar;
        r18 = r15.a(r5, r0, r6);
        r0 = r15.y;
        r19 = defpackage.afge.a(r0);
        r20 = 0;
        r0 = r37;
        r11 = r3;
        r3 = r13;
        r5 = r17;
        r36 = r6;
        r6 = r18;
        r17 = r7;
        r7 = r19;
        r18 = r13;
        r13 = r8;
        r8 = r20;
        r0 = r0.a(r1, r2, r3, r5, r6, r7, r8);
        r0 = r15.a(r13, r0, r11);
        r12[r16] = r0;
        if (r17 <= 0) goto L_0x024e;
    L_0x020e:
        r11 = r40;
        r0 = r11[r16];
        r0 = r0.f;
        r0 = r15.a(r0, r10);
        r15.r = r0;
        r1 = r15.a(r9);
        r2 = r15.r;
        r5 = 0;
        r0 = r15.ar;
        r11 = r36;
        r6 = r15.a(r9, r0, r11);
        r0 = r15.y;
        r3 = r15.f;
        r7 = defpackage.afge.a(r0, r3);
        r8 = 0;
        r0 = r37;
        r3 = r18;
        r0 = r0.a(r1, r2, r3, r5, r6, r7, r8);
        r1 = r15.r;
        r1.a(r0);
        r1 = r15.y;
        r1 = r1.W();
        r2 = r42;
        r0 = r15.a(r13, r0, r1, r2);
        r1 = 1;
        r12[r1] = r0;
    L_0x024e:
        return r12;
    L_0x024f:
        r11 = r14;
        r12 = 2;
        r13 = r0.i;
        r0 = r11[r16];
        r0 = r0.f;
        r0 = r15.a(r0, r10);
        r15.r = r0;
        r14 = r37.J();
        r0 = r15.s;
        r1 = r15.y;
        r17 = defpackage.afbo.c(r0, r1);
        r0 = r15.j;
        r1 = new afck;
        r1.<init>(r15, r13);
        r13.p = r0;
        r13.o = r1;
        r10 = new aevn;
        r2 = r15.a(r9);
        r0 = r15.y;
        r3 = r15.a(r0);
        r4 = r15.r;
        r7 = r15.j;
        r9 = r37.F();
        r0 = r10;
        r1 = r13;
        r5 = r17;
        r8 = r37;
        r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9);
        r0 = new affz;
        r1 = r15.y;
        r1 = r1.z();
        r2 = r15.y;
        r2 = r2.y();
        r1 = r1 * r2;
        r4 = r1 << 10;
        r5 = r15.j;
        r6 = r15.X;
        r7 = r37.F();
        r1 = r15.y;
        r8 = r1.X();
        r9 = r15.ao;
        r19 = r37.L();
        r1 = r0;
        r2 = r10;
        r3 = r14;
        r10 = r19;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r15.aj = r0;
        r0 = r15.aj;
        r1 = r37.U();
        r10 = r15.a(r0, r1);
        r0 = r15.s;
        if (r0 == 0) goto L_0x02df;
    L_0x02cf:
        r0 = r0.a();
        if (r0 != 0) goto L_0x02df;
    L_0x02d5:
        r0 = r15.r;
        r1 = new aevm;
        r1.<init>(r13);
        r0.a(r1);
    L_0x02df:
        r19 = new aevn;
        r2 = r15.b(r11);
        r0 = r15.y;
        r3 = r15.a(r0);
        r4 = 0;
        r7 = r15.j;
        r9 = r37.F();
        r0 = r19;
        r1 = r13;
        r5 = r17;
        r8 = r37;
        r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9);
        r21 = new affu;
        r0 = r15.y;
        r0 = r0.A();
        r1 = r15.y;
        r1 = r1.y();
        r0 = r0 * r1;
        r4 = r0 << 10;
        r5 = r15.j;
        r6 = r15.Y;
        r7 = r37.F();
        r0 = r15.y;
        r8 = r0.X();
        r9 = r15.ao;
        r1 = r21;
        r2 = r19;
        r3 = r14;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = new aevy;
        r1 = r15.ae;
        r2 = r15.ao;
        r3 = r15.j;
        r4 = r15.V;
        r5 = new aewj;
        r6 = r15.e;
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r8 = r15.y;
        r8 = r8.L();
        r8 = (long) r8;
        r7 = r7.toMicros(r8);
        r9 = 1;
        r5.<init>(r6, r9, r7);
        r6 = r15.y;
        r27 = r6.am();
        r20 = r0;
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r26 = r5;
        r20.<init>(r21, r22, r23, r24, r25, r26, r27);
        r1 = new defpackage.nnj[r12];
        r1[r16] = r0;
        r0 = 1;
        r1[r0] = r10;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(aajs, aahr[], aahr[], afgq, boolean):nnj[]");
    }

    private final nnj a(noc noc, boolean z) {
        if (z) {
            return a((nne) noc);
        }
        afkh afkh = this.p;
        if (afkh != null) {
            afkh.i();
        }
        awdg awdg = this.y.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            if (arhh.aZ) {
                return new aewa(this.a, noc, this.ae, this.ao, this.j, this.U, new aewj(this.e, 2, TimeUnit.MILLISECONDS.toMicros((long) this.y.L())), W(), K(), this.y.W(), V().l, (long) this.y.ad());
            }
        }
        Context context = this.a;
        afcs afcs = this.ae;
        aerz aerz = this.ao;
        Handler handler = this.j;
        return new nmu(context, noc, afcs, 5000, aerz, true, handler, this.U, W());
    }

    private final nlx J() {
        afci afbt;
        aajs aajs = this.s;
        if (aajs == null || !aajs.a() || this.s.b() || !this.s.d() || this.y.aG() == 2) {
            afbt = new afbt(this);
        } else {
            afbt = new afci(this);
        }
        return new affs(new nvp(this.y.y() << 10), this.o, afbt, new afbs(this), new afbv(this), this.af, this.s.m());
    }

    private final affy a(int i, afgq afgq) {
        afev affg;
        afjs a = afdp.a(this.aa, this.p);
        int F = F();
        if (this.k.l()) {
            affg = new affg();
        } else {
            aeqo aeqo = this.f;
            xhv xhv = this.c;
            aajj aajj = this.y;
            aeeu aeeu = this.Q;
            boolean ae = aajj.ae();
            int i2 = a.b;
            int i3 = a.c;
            afbu afbu = new afbu(i);
            float ao = this.y.ao();
            String str = this.s.c;
            afjc afjc = this.k;
            affg = new affn(aeqo, xhv, aajj, aeeu, ae, i2, i3, afgq, afbu, ao, str, afjc, afjc.a(this.c), new afbx(this), new afbw(this, F));
        }
        return new affy(affg, this.m);
    }

    private final afga a(noz noz, noo noo, long j, int i, npo[] npoArr, afgf afgf, afiq afiq) {
        afiw afiw;
        boolean z;
        if (afiq != null) {
            afiw = new afiw(afiq.a());
        } else {
            afiw = a(this.y);
        }
        afiw afiw2 = afiw;
        boolean z2 = i == 0 && this.y.W();
        Handler handler = this.j;
        afcx afcx = this.Z;
        awdg awdg = this.y.c;
        if ((awdg.a & 2) != 0) {
            arhh arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            z = arhh.bt;
        } else {
            z = false;
        }
        return new afga(noz, afiw2, noo, j, i, npoArr, afgf, z2, handler, afcx, z);
    }

    /* JADX WARNING: Missing block: B:10:0x001d, code skipped:
            if (r0.J != false) goto L_0x0022;
     */
    private final boolean K() {
        /*
        r2 = this;
        r0 = r2.s;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x000b;
    L_0x0005:
        r0 = r0.w();
        if (r0 != 0) goto L_0x0022;
    L_0x000b:
        r0 = r2.y;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r0 = r0.d;
        if (r0 != 0) goto L_0x001b;
    L_0x0019:
        r0 = defpackage.arhh.bv;
    L_0x001b:
        r0 = r0.J;
        if (r0 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        r0 = 0;
        return r0;
    L_0x0022:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.K():boolean");
    }

    private final nnj a(nne nne) {
        String k = aewo.k();
        Object libvpxConfig = VpxDecoder.a ? VpxDecoder.getLibvpxConfig() : null;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(k).length() + 40) + String.valueOf(libvpxConfig).length());
        stringBuilder.append("[INFO] Using libvpx ");
        stringBuilder.append(k);
        stringBuilder.append(" built with config: ");
        stringBuilder.append(libvpxConfig);
        xtl.d(stringBuilder.toString());
        return new aewo(nne, this.j, this.U, W(), this.y, this.k);
    }

    private final nnj a(nlx nlx, nok nok, boolean z, boolean z2) {
        if (!z2) {
            afkh afkh = this.p;
            if (afkh != null) {
                afkh.i();
            }
        }
        this.aj = new affz(nok, nlx, (this.y.z() * this.y.y()) << 10, this.j, this.X, F(), this.y.X(), null, L());
        if (z2) {
            return a(this.aj);
        }
        return new aewa(this.a, this.aj, this.ae, this.ao, this.j, this.U, new aewj(this.e, 2, TimeUnit.MILLISECONDS.toMicros((long) this.y.L())), W(), K(), z, V().l, (long) this.y.ad());
    }

    /* JADX WARNING: Missing block: B:6:0x0012, code skipped:
            if (r0.ao != false) goto L_0x0021;
     */
    private final boolean L() {
        /*
        r2 = this;
        r0 = r2.y;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0015;
    L_0x000a:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.arhh.bv;
    L_0x0010:
        r0 = r0.ao;
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0021;
    L_0x0015:
        r0 = r2.aw;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = java.lang.Float.compare(r0, r1);
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r0 = 0;
        return r0;
    L_0x0021:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.L():boolean");
    }

    private static boolean a(aajj aajj, aajs aajs) {
        boolean z = false;
        if (!(aajj == null || aajs == null || !aajj.c())) {
            if (aajs.r()) {
                z = true;
            } else if (aajj.d() && aajs.s()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private final npo[] a(aahr[] aahrArr, String str, int i) {
        i = Math.min(aahrArr.length, i);
        npo[] npoArr = new npo[i];
        for (int i2 = 0; i2 < i; i2++) {
            npoArr[i2] = aexb.a(aahrArr[i2], str, this.y);
        }
        return npoArr;
    }

    public final void m() {
        nlp nlp = this.q;
        if (!(nlp == null || nlp.b() != 5 || this.w)) {
            this.q.a(0);
        }
        this.az = true;
        M();
    }

    private final void M() {
        if (this.q != null) {
            z();
            if (this.az) {
                this.e.f();
                this.q.a(true);
            }
        }
    }

    public final void n() {
        nlp nlp = this.q;
        if (nlp != null) {
            nlp.a(false);
        }
    }

    public final void b(long j) {
        if (this.q != null) {
            aajs aajs = this.s;
            if (aajs == null || aajs.b() || j == 0) {
                if (this.q.d()) {
                    this.i.a(j);
                } else {
                    this.i.b(j);
                }
                aajs = this.s;
                if (aajs != null && aajs.a()) {
                    long max = Math.max(0, Math.max(0, C() - ((long) this.D.b())) - ((long) B()));
                    afgp afgp = this.D;
                    boolean z = j == 0 || (max > 0 && j >= max);
                    afgp.a(z);
                }
                this.w = true;
                afcx afcx = this.Z;
                int binarySearch = Arrays.binarySearch(afcx.a.toArray(), Long.valueOf(1000 * j));
                afcx.b = binarySearch;
                if (binarySearch < 0) {
                    if (binarySearch == -1) {
                        afcx.a();
                    }
                    afcx.b = Math.max((-afcx.b) - 2, 0);
                }
                this.q.a(j);
            }
        }
    }

    private final void N() {
        this.ai = null;
        this.l.a();
    }

    public final void a(boolean z) {
        this.g.d(afne.ANDROID_EXOPLAYER);
        G();
        this.T.a();
        if (this.q != null) {
            O();
            N();
            I();
            if (z) {
                this.i.e();
            }
        }
    }

    public final void p() {
        this.g.e(afne.ANDROID_EXOPLAYER);
        G();
        this.T.a();
        if (this.q != null) {
            O();
            P();
            N();
            I();
            this.i.e();
        }
    }

    /* JADX WARNING: Missing block: B:24:0x003d, code skipped:
            if (r6.e != false) goto L_0x0047;
     */
    /* JADX WARNING: Missing block: B:26:0x0044, code skipped:
            if (r5.x() != false) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:27:0x0047, code skipped:
            r0 = r0 | 2;
     */
    public final int a(defpackage.aajs r5, defpackage.aajj r6) {
        /*
        r4 = this;
        r0 = r4.aE;
        r1 = 1;
        if (r0 != 0) goto L_0x000c;
    L_0x0005:
        r0 = r6.e;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        goto L_0x000c;
    L_0x000a:
        r0 = 0;
        goto L_0x000d;
    L_0x000c:
        r0 = 1;
    L_0x000d:
        r0 = defpackage.afdp.a(r5, r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = 4;
        goto L_0x0016;
    L_0x0015:
        r0 = 5;
    L_0x0016:
        r2 = defpackage.afbo.a(r6, r5);
        if (r2 == 0) goto L_0x001e;
    L_0x001c:
        r0 = r0 | 8;
    L_0x001e:
        r3 = r6.am();
        if (r3 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0049;
    L_0x0025:
        if (r2 != 0) goto L_0x0049;
    L_0x0027:
        r2 = r5.a();
        if (r2 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0049;
    L_0x002e:
        r6 = r6.c;
        r2 = r6.b;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x0040;
    L_0x0035:
        r6 = r6.t;
        if (r6 != 0) goto L_0x003b;
    L_0x0039:
        r6 = defpackage.aywv.f;
    L_0x003b:
        r6 = r6.e;
        if (r6 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0047;
    L_0x0040:
        r5 = r5.x();
        if (r5 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0049;
    L_0x0047:
        r0 = r0 | 2;
    L_0x0049:
        r5 = r4.k;
        r5 = r5.i();
        if (r5 == 0) goto L_0x0054;
    L_0x0051:
        r5 = r0 | 16;
        return r5;
    L_0x0054:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(aajs, aajj):int");
    }

    public final boolean b(aajs aajs, aajj aajj) {
        aajs aajs2 = aajs;
        aajj aajj2 = aajj;
        if (aajs.x() || aajs.d() || aajs.n()) {
            return true;
        }
        if (!aajs.c() && aajj.t()) {
            boolean a = this.k.a(aajj.ah());
            boolean b = affd.b(aajs2, aajj2, this.k, this.b, this.h);
            afjc afjc = this.k;
            Object obj = (affd.b(aajs2, aajj2, afjc, this.b) || affd.a(aajs2, aajj2, afjc) || affd.b(aajs2, aajj2, afjc)) ? 1 : null;
            if (!a && !b && obj == null) {
                return false;
            }
            Set e = aahv.e();
            Set f = aahv.f();
            Set g = aahv.g();
            Set n = aahv.n();
            Set o = aahv.o();
            boolean z = false;
            boolean z2 = false;
            Object obj2 = null;
            for (aahr aahr : aajs2.l) {
                int b2 = aahr.b();
                if (aahr.E()) {
                    if (obj2 == null) {
                        if (!(a && e.contains(Integer.valueOf(b2))) && (!(b && f.contains(Integer.valueOf(b2))) && (obj == null || !g.contains(Integer.valueOf(b2))))) {
                            obj2 = null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (!z2) {
                        z2 = o.contains(Integer.valueOf(b2));
                    }
                }
                if (aahr.F() && !z) {
                    z = n.contains(Integer.valueOf(b2));
                }
                if (z) {
                    if (obj2 != null) {
                        return true;
                    }
                }
            }
            if (!z || z2) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final void O() {
        this.q.f();
        aerz aerz = this.ao;
        if (aerz != null) {
            aerz.e();
        }
    }

    private final void P() {
        if (this.q != null) {
            y();
            this.q.g();
            aerz aerz = this.ao;
            if (aerz != null) {
                aerz.e();
                this.ao = null;
            }
            this.q = null;
            this.C = null;
            this.B = null;
        }
    }

    public final void y() {
        if (!(this.q == null || this.ak == null || this.p == null)) {
            this.g.a(null, afne.ANDROID_EXOPLAYER);
            this.q.b(this.ak, 1, null);
        }
        this.am = null;
        this.an = null;
        R();
        this.i.a(afkn.NONE.ordinal());
    }

    private final void Q() {
        if (!this.aq) {
            this.aq = true;
            b(this.E);
        }
    }

    public final void z() {
        b(false);
    }

    public final void b(boolean z) {
        afkn afkn;
        afkh afkh = this.p;
        aewz aewz = null;
        Surface k = (afkh == null || !afkh.n()) ? null : this.p.k();
        afkh afkh2 = this.p;
        if (afkh2 != null) {
            aewz = afkh2.g();
        }
        String valueOf = String.valueOf(k);
        String valueOf2 = String.valueOf(aewz);
        valueOf.length();
        valueOf2.length();
        if (!(this.q == null || this.ak == null || ((k == null && aewz == null) || (this.am == k && this.an == aewz)))) {
            D();
            if (z) {
                if (k != null) {
                    this.g.a(k, afne.ANDROID_EXOPLAYER);
                    this.q.b(this.ak, 1, k);
                } else {
                    this.q.b(this.ak, 2, aewz);
                }
            } else if (k != null) {
                this.g.a(k, afne.ANDROID_EXOPLAYER);
                this.q.a(this.ak, 1, k);
            } else {
                this.q.a(this.ak, 2, aewz);
            }
            this.q.a(1, 0);
            this.am = k;
            this.an = aewz;
        }
        aeuy aeuy = this.i;
        afkh = this.p;
        if (afkh == null) {
            afkn = afkn.NONE;
        } else {
            afkn = afkh.o();
        }
        aeuy.a(afkn.ordinal());
        R();
    }

    public final boolean A() {
        return (this.am == null && this.an == null) ? false : true;
    }

    private final void R() {
        if (this.p == null) {
            return;
        }
        if (A() && f()) {
            this.p.a(1);
        } else {
            this.p.b(1);
        }
    }

    public final long o() {
        nlp nlp = this.q;
        return nlp != null ? nlp.i() : 0;
    }

    public final long t() {
        long o = o();
        if (o >= 0) {
            long j = this.aA;
            if (j != 0) {
                return o + j;
            }
        }
        return -1;
    }

    public final long u() {
        nlp nlp = this.q;
        return nlp != null ? nlp.h() : 0;
    }

    public final long v() {
        nlp nlp = this.q;
        return nlp != null ? nlp.j() : 0;
    }

    public final int w() {
        return this.D.a(t(), this.ah.a());
    }

    public final int i() {
        nlk T = T();
        if (T == null) {
            return this.ax;
        }
        T.a();
        return this.ax + T.f;
    }

    public final int j() {
        nlk T = T();
        if (T == null || this.aj == null) {
            return this.ay;
        }
        T.a();
        return (((int) this.aj.e) + this.ay) + T.h;
    }

    public final aerm k() {
        aerl aerl;
        WidevineHelper widevineHelper = this.as;
        if (widevineHelper != null) {
            aerz aerz = this.ao;
            aerl = new aerl();
            if (aerz != null) {
                aerl.a(widevineHelper.a(), widevineHelper.i, widevineHelper.h, widevineHelper.k, aerz instanceof aeru);
            }
        } else {
            aerl = new aerl();
        }
        aerl.a = afne.ANDROID_EXOPLAYER;
        aerl.c = this.s;
        return aerl.a();
    }

    private final void S() {
        this.ax = i();
        this.ay = j();
    }

    private final nlk T() {
        nnj nnj = this.ak;
        if (nnj instanceof nmu) {
            return ((nmu) nnj).b;
        }
        return nnj instanceof aewo ? ((aewo) nnj).a : null;
    }

    public final void a(float f) {
        this.ap = f;
        nlp nlp = this.q;
        if (nlp != null) {
            nnj nnj = this.al;
            if (nnj != null) {
                nlp.a(nnj, 1, Float.valueOf(f));
            }
        }
    }

    private final void b(int i) {
        this.aF = i;
        nlp nlp = this.q;
        if (nlp != null) {
            nnj nnj = this.al;
            if (nnj != null) {
                nlp.a(nnj, 3, Integer.valueOf((i & 1) == 0 ? 3 : 4));
            }
        }
    }

    public final void b(float f) {
        nlp nlp = this.q;
        if (nlp != null) {
            this.aw = f;
            nnj nnj = this.al;
            if (nnj != null) {
                nlp.a(nnj, 100, Float.valueOf(f));
            }
            nnj nnj2 = this.ak;
            if (nnj2 != null) {
                this.q.a(nnj2, 100, Float.valueOf(f));
            }
            affy affy = this.r;
            if (affy != null) {
                this.q.a(affy, 4, Float.valueOf(f));
            }
            this.i.a(f);
            affz affz = this.aj;
            if (affz != null) {
                affz.d = L();
            }
        }
    }

    public final float s() {
        return this.aw;
    }

    public final boolean g() {
        nlp nlp = this.q;
        return nlp != null && nlp.b() == 3;
    }

    public final boolean f() {
        nlp nlp = this.q;
        if (nlp == null || !nlp.d()) {
            return false;
        }
        int b = this.q.b();
        if (b == 3 || b == 4) {
            return true;
        }
        return false;
    }

    public final void a(boolean z, int i) {
        xak.a();
        if (this.s != null) {
            this.w = false;
            if (i == 2) {
                this.i.a();
            } else if (i == 3) {
                Q();
                if (z) {
                    this.i.g();
                } else {
                    this.i.h();
                }
                if (this.D.b(o())) {
                    b(0);
                }
            } else if (i == 4) {
                Q();
                if (!z) {
                    this.i.d();
                    this.D.d();
                } else if (this.D.a(o())) {
                    b(0);
                } else {
                    this.i.c();
                }
            } else if (i == 5) {
                this.i.f();
            }
            R();
        }
    }

    public final void a(nlq nlq) {
        xak.a();
        if (!(nlq.getCause() instanceof aeti)) {
            aajs aajs;
            if (nlq.getCause() instanceof nli) {
                aajj aajj = this.y;
                if (!(aajj == null || aajj.aw())) {
                    aajs = this.s;
                    if (aajs != null) {
                        a(aajs, new affa(0), this.ar, this.y);
                        return;
                    }
                }
            }
            afif a = aevl.a((Exception) nlq, o(), this.am, this.c, this.L);
            String str = "staleconfig";
            if (!a.a().equals(str)) {
                a = a.f();
            }
            aajs = this.s;
            if (a.d() || a.a().equals(str)) {
                this.l.a();
                I();
            }
            if (a.a().equals("fmt.decode")) {
                this.g.a(this.i);
            }
            if (aajs != null) {
                this.i.a(a);
            }
        }
    }

    public final void a(afkh afkh) {
        this.g.a(afne.ANDROID_EXOPLAYER);
        this.z = false;
        E();
        this.p = afkh;
        this.p.a(this.ab);
        this.g.a(this.ab, afne.ANDROID_EXOPLAYER);
        boolean z = this.x;
        aajj aajj = this.y;
        float f = 0.0f;
        float aa = aajj != null ? aajj.aa() : 0.0f;
        aajj aajj2 = this.y;
        if (aajj2 != null) {
            f = aajj2.ab();
        }
        afkh.a(z, aa, f);
        if (a(V(), true)) {
            z();
        }
    }

    private final boolean a(afkn afkn, boolean z) {
        if (this.p != null) {
            try {
                this.g.a(afkn, afne.ANDROID_EXOPLAYER);
                this.p.a(afkn, this.k.g(), this.k.h());
                if (this.p.o() == afkn.GL_GVR) {
                    ((afju) this.p.f()).a(U());
                }
                return true;
            } catch (UnsupportedOperationException e) {
                if (afkn == afkn.GL_GVR) {
                    this.g.a(afkn.SURFACE, afne.ANDROID_EXOPLAYER);
                    return a(afkn.SURFACE, z);
                }
                a(e, z);
            } catch (IllegalStateException e2) {
                a(e2, z);
                return false;
            }
        }
        return false;
    }

    private final void a(Exception exception, boolean z) {
        if (z) {
            p();
        }
        if (aevl.a((Throwable) exception)) {
            aeuy aeuy = this.i;
            IllegalStateException illegalStateException = (IllegalStateException) exception;
            long o = o();
            afkh afkh = this.p;
            aeuy.a(aevl.a(illegalStateException, o, afkh != null ? afkh.k() : null));
            return;
        }
        this.i.a(new afif("player.fatalexception", o(), (Object) exception));
    }

    private final boolean U() {
        return this.L == 3;
    }

    private final afkn V() {
        return afdp.a(this.s, this.p, this.y, this.k, U(), this.aE, this.at);
    }

    public final void update(Observable observable, Object obj) {
        if (observable == this.aa) {
            D();
        } else if (observable == this.k && (obj instanceof Integer)) {
            int intValue = ((Integer) obj).intValue();
            if (intValue == 1) {
                affy affy = this.r;
                if (affy != null) {
                    nlp nlp = this.q;
                    if (nlp != null) {
                        nlp.a(affy, 3, Boolean.valueOf(false));
                    }
                }
                c();
            } else if (intValue == 2) {
                X();
            }
        }
    }

    public final int B() {
        int o;
        aahr aahr = this.F;
        if (aahr != null) {
            o = aahr.o();
        } else {
            aajs aajs = this.s;
            if (aajs != null) {
                return aajs.t();
            }
            o = 0;
        }
        return o;
    }

    private static long a(aajs aajs) {
        try {
            int i = aajs.f;
            npf npf = (npf) aajs.i.l;
            npa d = ((npm) ((npe) npf.a(npf.b() - 1).b.get(0)).b.get(0)).d();
            int a = d.a();
            int a2 = d.a(0);
            long j = 0;
            for (i = Math.max(a, (a2 - i) + 1); i <= a2; i++) {
                j += d.a(i, 0);
            }
            return j / 1000;
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new afct(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    private static long c(defpackage.aajs r3, defpackage.aajj r4) {
        /*
        r0 = r4.c;
        r1 = r0.a;
        r1 = r1 & 2;
        r2 = -1;
        if (r1 == 0) goto L_0x001f;
    L_0x0009:
        r0 = r0.d;
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        r0 = defpackage.arhh.bv;
    L_0x000f:
        r0 = r0.aa;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        goto L_0x001f;
    L_0x0014:
        r4 = r4.c;
        r4 = r4.d;
        if (r4 != 0) goto L_0x001c;
    L_0x001a:
        r4 = defpackage.arhh.bv;
    L_0x001c:
        r4 = r4.aa;
        goto L_0x0020;
    L_0x001f:
        r4 = -1;
    L_0x0020:
        if (r4 == r2) goto L_0x0024;
    L_0x0022:
        r3 = (long) r4;
        goto L_0x0028;
    L_0x0024:
        r3 = defpackage.afbo.a(r3);
    L_0x0028:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.c(aajs, aajj):long");
    }

    public final void a(int i, nni nni, nni nni2) {
        if (i == F()) {
            this.aB = nni;
            long[] a = nni2.a();
            this.i.a(a[0], a[1]);
        }
    }

    public final void a(int i, long j, long j2) {
        if (i == F()) {
            this.aA = (j - j2) / 1000;
        }
    }

    public final long C() {
        return this.aB.a()[1];
    }

    private final int W() {
        int ax = this.y.ax();
        return ax <= 0 ? Integer.MAX_VALUE : ax;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A:{Catch:{ afct -> 0x0046 }} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A:{Catch:{ afct -> 0x0046 }} */
    public final void a(int r10, defpackage.nni r11) {
        /*
        r9 = this;
        r0 = r9.s;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x0006:
        r0 = r0.i;
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = r0.l;
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r0 = 1;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        r3 = r9.F();
        if (r10 != r3) goto L_0x0055;
    L_0x0018:
        if (r0 == 0) goto L_0x0055;
    L_0x001a:
        r10 = r9.s;	 Catch:{ afct -> 0x0046 }
        r0 = r9.y;	 Catch:{ afct -> 0x0046 }
        r11 = r11.a();	 Catch:{ afct -> 0x0046 }
        r3 = r10.i;	 Catch:{ afct -> 0x0046 }
        r3 = r3.l;	 Catch:{ afct -> 0x0046 }
        r3 = (defpackage.npf) r3;	 Catch:{ afct -> 0x0046 }
        r3 = r3.c;	 Catch:{ afct -> 0x0046 }
        if (r3 == 0) goto L_0x0031;
    L_0x002c:
        r3 = defpackage.afbo.c(r10, r0);	 Catch:{ afct -> 0x0046 }
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
    L_0x0033:
        r5 = r11[r2];	 Catch:{ afct -> 0x0046 }
        r7 = r11[r1];	 Catch:{ afct -> 0x0046 }
        r7 = r7 - r3;
        r3 = java.lang.Math.max(r5, r7);	 Catch:{ afct -> 0x0046 }
        r11[r1] = r3;	 Catch:{ afct -> 0x0046 }
        r10 = r9.i;	 Catch:{ afct -> 0x0046 }
        r0 = r11[r2];	 Catch:{ afct -> 0x0046 }
        r10.a(r0, r3);	 Catch:{ afct -> 0x0046 }
        return;
    L_0x0046:
        r10 = new afif;
        r11 = 5;
        r0 = r9.o();
        r2 = "unparseable";
        r10.<init>(r11, r2, r0);
        r9.a(r10);
    L_0x0055:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.a(int, nni):void");
    }

    public final void D() {
        afkh afkh = this.p;
        if (afkh != null && this.r != null && this.q != null) {
            afjs a = afdp.a(this.aa, afkh);
            if (!a.equals(this.aD)) {
                this.aD = a;
                this.q.a(this.r, 0, a);
                if (this.s != null && this.y != null && this.E != null) {
                    int k = this.c.k();
                    List asList = Arrays.asList(this.E.a);
                    afgv afgv = this.E;
                    afgq afgq = afgv.f;
                    xhv xhv = this.c;
                    aajj aajj = this.y;
                    aahr a2 = afgz.a(asList, afgq, xhv, aajj, afgv.b[0].f, a.b, a.c, aajj.ao(), this.k.a(k), k);
                    if (!(this.I == null || a2 == null || a2.b() == this.I.b())) {
                        aeuy aeuy = this.i;
                        aahr aahr = this.F;
                        aahr aahr2 = this.G;
                        afgv afgv2 = this.E;
                        aeuy.a(new aetv(aahr, aahr2, a2, afgv2.d, afgv2.e, afgv2.f, 10001, -1, 0));
                    }
                    this.I = a2;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARNING: Missing block: B:5:0x0010, code skipped:
            if (r0.b() != false) goto L_0x0012;
     */
    private final void X() {
        /*
        r3 = this;
        r0 = r3.k;
        r0 = r0.e;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0012;
    L_0x0008:
        r0 = r3.E;
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = r0.b();
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        r1 = 1;
    L_0x0013:
        r0 = r3.at;
        if (r0 == r1) goto L_0x002c;
    L_0x0017:
        r0 = r3.V();
        r3.at = r1;
        r1 = r3.p;
        if (r1 == 0) goto L_0x002c;
    L_0x0021:
        r1 = r3.V();
        if (r0 == r1) goto L_0x002c;
    L_0x0027:
        r0 = r3.p;
        r3.a(r0);
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.X():void");
    }

    public final void r() {
        this.g.b(afne.ANDROID_EXOPLAYER);
        this.z = true;
        G();
        this.t = null;
        nlp nlp = this.q;
        if (!(nlp == null || this.ak == null)) {
            nlp.a(1, -1);
            afde afde = this.X;
            afbo afbo = afde.a;
            afbo.F = null;
            afbo.K = 10002;
            afde.e();
        }
        E();
    }

    public final void E() {
        afkh afkh = this.p;
        if (afkh != null) {
            afkh.c();
            this.p.a(null);
            this.g.a(null, afne.ANDROID_EXOPLAYER);
            y();
            this.p = null;
        }
    }

    public final void q() {
        afkh afkh = this.p;
        if (afkh != null) {
            afkh.c();
        }
    }

    public final void onDrmError(int i, Exception exception) {
        xak.a();
        if (i == F()) {
            a(true);
            a(aevl.a(exception, o(), "keyerror", (Object) exception, false));
        }
    }

    public final void onHdDrmPlayable(int i) {
        xak.a();
        boolean z = true;
        if (i == F()) {
            aajs aajs = this.s;
            if (aajs == null || !aajs.t) {
                z = false;
            }
        }
        amqw.b(z);
        if (i == F()) {
            c();
            this.K = 0;
            this.X.e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARNING: Missing block: B:5:0x0011, code skipped:
            if (r0.t != false) goto L_0x0013;
     */
    public final void onHdDrmUnavailable(int r8, java.lang.String r9) {
        /*
        r7 = this;
        defpackage.xak.a();
        r0 = r7.F();
        r1 = 0;
        r2 = 1;
        if (r8 != r0) goto L_0x0013;
    L_0x000b:
        r0 = r7.s;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r0.t;
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        r1 = 1;
    L_0x0014:
        defpackage.amqw.b(r1);
        r0 = r7.F();
        if (r8 == r0) goto L_0x0033;
    L_0x001d:
        r8 = java.lang.String.valueOf(r9);
        r9 = "Stale HdDrmUnavailable notification received - ignored ";
        r0 = r8.length();
        if (r0 != 0) goto L_0x002f;
    L_0x0029:
        r8 = new java.lang.String;
        r8.<init>(r9);
        return;
    L_0x002f:
        r9.concat(r8);
        return;
    L_0x0033:
        r8 = r7.i;
        r6 = new afif;
        r1 = 4;
        r3 = r7.o();
        r2 = "hdunavailable";
        r0 = r6;
        r5 = r9;
        r0.<init>(r1, r2, r3, r5);
        r8.a(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbo.onHdDrmUnavailable(int, java.lang.String):void");
    }

    /* Access modifiers changed, original: final */
    public final int F() {
        return this.ac.get();
    }

    public final synchronized void G() {
        ScheduledFuture scheduledFuture = this.aC;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.aC = null;
        }
    }

    public final synchronized void a(long j, String str) {
        G();
        this.aC = this.d.schedule(new afcn(this, str), j, TimeUnit.MILLISECONDS);
    }

    private final void Y() {
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.H = aequ.a;
        this.J = afgq.a;
        this.K = 0;
    }

    private final nnj a(nlx nlx, nok nok, int i) {
        noc noc = new noc(nok, nlx, (this.y.A() * this.y.y()) << 10, this.j, this.Y, F(), this.y.X());
        if (i == 6) {
            return new baed(noc, this.j, this.V, this.ag);
        }
        if (i == 5) {
            Handler handler = this.j;
            afcp afcp = this.V;
            return new nqs(noc, handler, afcp, new bael(handler, afcp, new baea((baeu) nwf.a(this.ag))));
        }
        return new aevy(noc, this.ae, this.ao, this.j, this.V, new aewj(this.e, 1, TimeUnit.MILLISECONDS.toMicros((long) this.y.L())), this.y.am());
    }
}
