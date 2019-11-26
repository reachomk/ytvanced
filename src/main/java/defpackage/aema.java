package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aema */
public final class aema implements aeov {
    private static final xto T = aajx.c;
    private static final amqh i = amqh.a(",");
    private final xsc A;
    private final zzf B;
    private final xto C = new aemb(this, "onesieControllerExecutorService");
    private final bcaa D;
    private final Handler E;
    private aemt F;
    private aajh G;
    private boolean H;
    private String I;
    private final List J;
    private Uri K;
    private boolean L;
    private final StringBuilder M;
    private String N;
    private long O;
    private aemi P;
    private aemn Q;
    private aemk R;
    private boolean S;
    public final aenq a;
    public final afhg b;
    public final aemj c;
    public aeow d;
    public aeow e;
    public final Set f;
    public aaje g;
    public aevc h;
    private final aeez j;
    private final aeeu k;
    private final aemm l;
    private final ScheduledExecutorService m;
    private final ScheduledExecutorService n;
    private final aemv o;
    private final afjj p;
    private final xhv q;
    private final aajk r;
    private final aell s;
    private final afhg t;
    private final zzl u;
    private final zyw v;
    private final ozb w;
    private final afjv x;
    private final afjc y;
    private final boolean z;

    public aema(aenq aenq, aeez aeez, aeeu aeeu, aemm aemm, afhg afhg, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, aemv aemv, afjj afjj, xhv xhv, xsc xsc, zzf zzf, aajk aajk, aell aell, afhg afhg2, zzl zzl, zyw zyw, ozb ozb, afjv afjv, afjc afjc, boolean z, bcaa bcaa) {
        this.a = (aenq) amqw.a((Object) aenq);
        this.j = (aeez) amqw.a((Object) aeez);
        this.k = (aeeu) amqw.a((Object) aeeu);
        this.l = (aemm) amqw.a((Object) aemm);
        this.b = (afhg) amqw.a((Object) afhg);
        this.m = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.n = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService2);
        this.o = (aemv) amqw.a((Object) aemv);
        this.p = (afjj) amqw.a((Object) afjj);
        this.q = (xhv) amqw.a((Object) xhv);
        this.A = (xsc) amqw.a((Object) xsc);
        this.B = (zzf) amqw.a((Object) zzf);
        this.r = aajk;
        this.s = aell;
        this.t = (afhg) amqw.a((Object) afhg2);
        this.u = (zzl) amqw.a((Object) zzl);
        this.v = (zyw) amqw.a((Object) zyw);
        this.z = z;
        this.J = new ArrayList();
        this.f = new HashSet();
        this.c = new aemj(this);
        this.M = new StringBuilder();
        this.w = (ozb) amqw.a((Object) ozb);
        this.x = (afjv) amqw.a((Object) afjv);
        this.y = (afjc) amqw.a((Object) afjc);
        this.h = aeuy.e;
        this.D = (bcaa) amqw.a((Object) bcaa);
        this.E = new Handler(Looper.getMainLooper());
    }

    /* JADX WARNING: Missing block: B:32:0x0065, code skipped:
            return null;
     */
    private final synchronized defpackage.aemk a(defpackage.aaje r6, defpackage.aemt r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r6.l;	 Catch:{ all -> 0x0066 }
        r1 = 0;
        if (r0 != 0) goto L_0x0064;
    L_0x0006:
        r0 = r6.b;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0064;
    L_0x000a:
        r2 = r5.N;	 Catch:{ all -> 0x0066 }
        r0 = android.text.TextUtils.equals(r2, r0);	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0064;
    L_0x0012:
        r0 = r5.G;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0064;
    L_0x0016:
        r0 = r5.H;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0053;
    L_0x001a:
        r0 = r5.P;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0044;
    L_0x001e:
        r2 = r6.i;	 Catch:{ all -> 0x0066 }
        r3 = r0.a;	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x002e;
    L_0x0024:
        r3 = r0.d;	 Catch:{ all -> 0x0066 }
        r4 = r0.e;	 Catch:{ all -> 0x0066 }
        r0 = r0.f;	 Catch:{ all -> 0x0066 }
        r2.a(r3, r4, r0);	 Catch:{ all -> 0x0066 }
        goto L_0x0041;
    L_0x002e:
        r3 = r0.b;	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x0038;
    L_0x0032:
        r0 = r0.g;	 Catch:{ all -> 0x0066 }
        r2.a(r0);	 Catch:{ all -> 0x0066 }
        goto L_0x0041;
    L_0x0038:
        r3 = r0.c;	 Catch:{ all -> 0x0066 }
        if (r3 == 0) goto L_0x0041;
    L_0x003c:
        r0 = r0.h;	 Catch:{ all -> 0x0066 }
        r2.a(r0);	 Catch:{ all -> 0x0066 }
    L_0x0041:
        r5.P = r1;	 Catch:{ all -> 0x0066 }
        goto L_0x0053;
    L_0x0044:
        r6 = 2;
        r7 = defpackage.afpf.onesie;	 Catch:{ all -> 0x0066 }
        r0 = "Early fetch finished too soon";
        r2 = 4587366580439587226; // 0x3fa999999999999a float:-1.5881868E-23 double:0.05;
        defpackage.afpc.a(r6, r7, r0, r2);	 Catch:{ all -> 0x0066 }
        monitor-exit(r5);
        return r1;
    L_0x0053:
        r6 = r6.i;	 Catch:{ all -> 0x0066 }
        r5.G = r6;	 Catch:{ all -> 0x0066 }
        r5.a(r7);	 Catch:{ all -> 0x0066 }
        r5.F = r7;	 Catch:{ all -> 0x0066 }
        r5.N = r1;	 Catch:{ all -> 0x0066 }
        r6 = r5.R;	 Catch:{ all -> 0x0066 }
        r5.R = r1;	 Catch:{ all -> 0x0066 }
        monitor-exit(r5);
        return r6;
    L_0x0064:
        monitor-exit(r5);
        return r1;
    L_0x0066:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.a(aaje, aemt):aemk");
    }

    private final synchronized void a(aemt aemt) {
        aemt aemt2 = this.F;
        if (aemt2 == null) {
            aepe.a("Unexpected null early fetch init segment listener.");
        } else if (aemt2 instanceof aelv) {
            ((aelv) aemt2).a(aemt);
        } else {
            String simpleName = aemt2.getClass().getSimpleName();
            String str = "Unexpected early fetch init segment listener type: ";
            if (simpleName.length() == 0) {
                simpleName = new String(str);
            } else {
                simpleName = str.concat(simpleName);
            }
            aepe.a(simpleName);
        }
    }

    public final synchronized boolean a(aaje aaje, aeuy aeuy) {
        if (aaje.l) {
            aaje aaje2 = this.g;
            if (aaje2 != null) {
                if (TextUtils.equals(aaje.b, aaje2.b)) {
                    return false;
                }
            }
            this.R = a(aaje, new aelv(), aeuy);
            if (this.R == null) {
                return false;
            }
            this.N = aaje.b;
            this.O = this.A.b();
            arvt b = this.u.b();
            if (b != null) {
                auuo auuo = b.k;
                if (auuo == null) {
                    auuo = auuo.k;
                }
                avtg avtg = auuo.c;
                if (avtg == null) {
                    avtg = avtg.k;
                }
                avte avte = avtg.e;
                if (avte == null) {
                    avte = avte.x;
                }
                if (avte.i) {
                    aemi aemi = new aemi();
                    this.P = aemi;
                    this.G = aemi;
                    return true;
                }
            }
            this.P = null;
            return true;
        }
        aepe.a("Sending invalid early fetch Onesie request.");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:415:0x0950 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x094c A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x099c A:{SYNTHETIC, Splitter:B:430:0x099c} */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0991 A:{SYNTHETIC, Splitter:B:425:0x0991} */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x074f A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x070d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x07b8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x094c A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0950 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0991 A:{SYNTHETIC, Splitter:B:425:0x0991} */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x099c A:{SYNTHETIC, Splitter:B:430:0x099c} */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0573 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x079b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x07b8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0950 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x094c A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x099c A:{SYNTHETIC, Splitter:B:430:0x099c} */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0991 A:{SYNTHETIC, Splitter:B:425:0x0991} */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x056a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0573 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e5 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0208 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0237 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0257 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0268 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6 A:{LOOP_END, Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }, LOOP:0: B:40:0x00f0->B:42:0x00f6} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0114 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0183 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b9 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e5 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fa A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0208 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0237 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0257 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0268 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6 A:{LOOP_END, Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }, LOOP:0: B:40:0x00f0->B:42:0x00f6} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0114 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0183 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b9 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e5 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fa A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0208 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0237 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0257 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0268 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ef A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040d A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04bd A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e3 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x057e A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a7 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x05af A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05f8 A:{Catch:{ afgr -> 0x0a93, all -> 0x0a90, all -> 0x0ab2 }} */
    public final synchronized defpackage.aemk a(defpackage.aaje r56, defpackage.aemt r57, defpackage.aeuy r58) {
        /*
        r55 = this;
        r1 = r55;
        r2 = r56;
        monitor-enter(r55);
        r3 = r55.a(r56, r57);	 Catch:{ all -> 0x0ab2 }
        if (r3 != 0) goto L_0x0aa4;
    L_0x000b:
        r3 = r1.p;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        r4 = new aeic;	 Catch:{ afgr -> 0x0a93 }
        r4.<init>();	 Catch:{ afgr -> 0x0a93 }
        r3.a(r4);	 Catch:{ afgr -> 0x0a93 }
        r55.f();	 Catch:{ afgr -> 0x0a93 }
        r3 = r2.h;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x0052;
    L_0x001e:
        r3 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x0052;
    L_0x0024:
        r3 = r1.u;	 Catch:{ afgr -> 0x0a93 }
        r5 = r1.v;	 Catch:{ afgr -> 0x0a93 }
        r6 = r1.B;	 Catch:{ afgr -> 0x0a93 }
        r7 = r1.A;	 Catch:{ afgr -> 0x0a93 }
        r3 = defpackage.aepe.a(r3, r5, r6, r7);	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0049;
    L_0x0032:
        r5 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.b;	 Catch:{ afgr -> 0x0a93 }
        r6 = r56.a();	 Catch:{ afgr -> 0x0a93 }
        r7 = new aeog;	 Catch:{ afgr -> 0x0a93 }
        r7.<init>(r5, r3, r6);	 Catch:{ afgr -> 0x0a93 }
        r3 = new aemg;	 Catch:{ afgr -> 0x0a93 }
        r5 = r1.m;	 Catch:{ afgr -> 0x0a93 }
        r6 = r1.u;	 Catch:{ afgr -> 0x0a93 }
        r3.<init>(r2, r5, r7, r6);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0057;
    L_0x0049:
        r3 = r2.i;	 Catch:{ afgr -> 0x0a93 }
        r5 = "onesie key unavailable";
        r3.a(r5);	 Catch:{ afgr -> 0x0a93 }
        r3 = 0;
        goto L_0x0057;
    L_0x0052:
        r3 = new aeml;	 Catch:{ afgr -> 0x0a93 }
        r3.<init>(r2);	 Catch:{ afgr -> 0x0a93 }
    L_0x0057:
        r1.Q = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r1.Q;	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0a85;
    L_0x005d:
        r1.g = r2;	 Catch:{ afgr -> 0x0a93 }
        r3 = r58;
        r1.h = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r1.M;	 Catch:{ afgr -> 0x0a93 }
        r5 = 0;
        r3.setLength(r5);	 Catch:{ afgr -> 0x0a93 }
        r3 = r1.M;	 Catch:{ afgr -> 0x0a93 }
        r3.trimToSize();	 Catch:{ afgr -> 0x0a93 }
        r3 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0083;
    L_0x0074:
        r3 = r2.j;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.k();	 Catch:{ afgr -> 0x0a93 }
        r6 = r2.b;	 Catch:{ afgr -> 0x0a93 }
        r3 = defpackage.aema.a(r3, r6);	 Catch:{ afgr -> 0x0a93 }
        r1.K = r3;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0091;
    L_0x0083:
        r3 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r2.b;	 Catch:{ afgr -> 0x0a93 }
        r3 = defpackage.aema.a(r3, r6);	 Catch:{ afgr -> 0x0a93 }
        r1.K = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r2.i;	 Catch:{ afgr -> 0x0a93 }
        r1.G = r3;	 Catch:{ afgr -> 0x0a93 }
    L_0x0091:
        r3 = r1.s;	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x009a;
    L_0x0095:
        r3 = r3.a();	 Catch:{ afgr -> 0x0a93 }
        goto L_0x009b;
    L_0x009a:
        r3 = 0;
    L_0x009b:
        r6 = r1.l;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.a();	 Catch:{ afgr -> 0x0a93 }
        r8 = r6;
        r8 = (defpackage.ovx) r8;	 Catch:{ afgr -> 0x0a93 }
        r6 = r1.g;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00e2;
    L_0x00a9:
        r6 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        r7 = r6.q;	 Catch:{ afgr -> 0x0a93 }
        if (r7 == 0) goto L_0x00e2;
    L_0x00af:
        r7 = r6.r;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b8;
    L_0x00b4:
        r9 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x00ba;
    L_0x00b8:
        r13 = r7;
        goto L_0x00cc;
    L_0x00ba:
        r6 = r6.v;	 Catch:{ afgr -> 0x0a93 }
        r9 = r3.b;	 Catch:{ afgr -> 0x0a93 }
        r9 = (float) r9;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6 * r9;
        r9 = (double) r6;	 Catch:{ afgr -> 0x0a93 }
        r9 = java.lang.Math.ceil(r9);	 Catch:{ afgr -> 0x0a93 }
        r6 = (int) r9;	 Catch:{ afgr -> 0x0a93 }
        r6 = java.lang.Math.max(r7, r6);	 Catch:{ afgr -> 0x0a93 }
        r13 = r6;
    L_0x00cc:
        r6 = new aene;	 Catch:{ afgr -> 0x0a93 }
        r9 = r1.l;	 Catch:{ afgr -> 0x0a93 }
        r10 = new aeng;	 Catch:{ afgr -> 0x0a93 }
        r7 = r1.s;	 Catch:{ afgr -> 0x0a93 }
        r10.<init>(r7);	 Catch:{ afgr -> 0x0a93 }
        r11 = r55.e();	 Catch:{ afgr -> 0x0a93 }
        r12 = r1.p;	 Catch:{ afgr -> 0x0a93 }
        r7 = r6;
        r7.<init>(r8, r9, r10, r11, r12, r13);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x00e3;
    L_0x00e2:
        r6 = r8;
    L_0x00e3:
        r6.d();	 Catch:{ afgr -> 0x0a93 }
        r7 = r2.f;	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.entrySet();	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.iterator();	 Catch:{ afgr -> 0x0a93 }
    L_0x00f0:
        r8 = r7.hasNext();	 Catch:{ afgr -> 0x0a93 }
        if (r8 == 0) goto L_0x010c;
    L_0x00f6:
        r8 = r7.next();	 Catch:{ afgr -> 0x0a93 }
        r8 = (java.util.Map.Entry) r8;	 Catch:{ afgr -> 0x0a93 }
        r9 = r8.getKey();	 Catch:{ afgr -> 0x0a93 }
        r9 = (java.lang.String) r9;	 Catch:{ afgr -> 0x0a93 }
        r8 = r8.getValue();	 Catch:{ afgr -> 0x0a93 }
        r8 = (java.lang.String) r8;	 Catch:{ afgr -> 0x0a93 }
        r6.a(r9, r8);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x00f0;
    L_0x010c:
        r7 = r1.u;	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.b();	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x0117;
    L_0x0114:
        r7 = defpackage.awto.f;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0129;
    L_0x0117:
        r7 = r7.k;	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x011d;
    L_0x011b:
        r7 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x011d:
        r7 = r7.h;	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x0123;
    L_0x0121:
        r7 = defpackage.awtq.d;	 Catch:{ afgr -> 0x0a93 }
    L_0x0123:
        r7 = r7.b;	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x0129;
    L_0x0127:
        r7 = defpackage.awto.f;	 Catch:{ afgr -> 0x0a93 }
    L_0x0129:
        r8 = r7.b;	 Catch:{ afgr -> 0x0a93 }
        r9 = 0;
        if (r8 == 0) goto L_0x015b;
    L_0x012f:
        r8 = r7.e;	 Catch:{ afgr -> 0x0a93 }
        r11 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r8 = java.lang.Math.min(r11, r8);	 Catch:{ afgr -> 0x0a93 }
        r11 = (long) r8;	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x014f;
    L_0x013a:
        r8 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        if (r8 == 0) goto L_0x014f;
    L_0x013e:
        r8 = r3.b;	 Catch:{ afgr -> 0x0a93 }
        if (r8 <= 0) goto L_0x014f;
    L_0x0142:
        r13 = (double) r8;	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.c;	 Catch:{ afgr -> 0x0a93 }
        java.lang.Double.isNaN(r13);
        r13 = r13 * r7;
        r7 = java.lang.Math.round(r13);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0152;
    L_0x014f:
        r7 = r7.d;	 Catch:{ afgr -> 0x0a93 }
        r7 = (long) r7;	 Catch:{ afgr -> 0x0a93 }
    L_0x0152:
        r7 = java.lang.Math.min(r7, r11);	 Catch:{ afgr -> 0x0a93 }
        r7 = java.lang.Math.max(r9, r7);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x015c;
    L_0x015b:
        r7 = r9;
    L_0x015c:
        r11 = new aemk;	 Catch:{ afgr -> 0x0a93 }
        r11.<init>();	 Catch:{ afgr -> 0x0a93 }
        r12 = r1.K;	 Catch:{ afgr -> 0x0a93 }
        r13 = r1.o;	 Catch:{ afgr -> 0x0a93 }
        r14 = r1.s;	 Catch:{ afgr -> 0x0a93 }
        r15 = r1.I;	 Catch:{ afgr -> 0x0a93 }
        r4 = r1.r;	 Catch:{ afgr -> 0x0a93 }
        r5 = r1.q;	 Catch:{ afgr -> 0x0a93 }
        r9 = r1.x;	 Catch:{ afgr -> 0x0a93 }
        r10 = r1.A;	 Catch:{ afgr -> 0x0a93 }
        r18 = r6;
        r6 = r1.y;	 Catch:{ afgr -> 0x0a93 }
        r19 = r55.c();	 Catch:{ afgr -> 0x0a93 }
        r20 = r9;
        r9 = r1.u;	 Catch:{ afgr -> 0x0a93 }
        r9 = r9.b();	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x018a;
    L_0x0183:
        r9 = defpackage.amul.g();	 Catch:{ afgr -> 0x0a93 }
    L_0x0187:
        r21 = r10;
        goto L_0x019f;
    L_0x018a:
        r9 = r9.k;	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x0190;
    L_0x018e:
        r9 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x0190:
        r9 = r9.c;	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x0196;
    L_0x0194:
        r9 = defpackage.avtg.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x0196:
        r9 = r9.e;	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x019c;
    L_0x019a:
        r9 = defpackage.avte.x;	 Catch:{ afgr -> 0x0a93 }
    L_0x019c:
        r9 = r9.e;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0187;
    L_0x019f:
        r10 = r55.h();	 Catch:{ afgr -> 0x0a93 }
        r10 = r10.i;	 Catch:{ afgr -> 0x0a93 }
        r22 = r6;
        r6 = r55.h();	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.j;	 Catch:{ afgr -> 0x0a93 }
        r23 = r6;
        r6 = r1.u;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b();	 Catch:{ afgr -> 0x0a93 }
        r24 = r10;
        if (r6 == 0) goto L_0x01cc;
    L_0x01b9:
        r6 = r6.k;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x01bf;
    L_0x01bd:
        r6 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x01bf:
        r6 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x01c5;
    L_0x01c3:
        r6 = defpackage.avtg.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x01c5:
        r6 = r6.h;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x01ca;
    L_0x01c9:
        goto L_0x01cc;
    L_0x01ca:
        r6 = 1;
        goto L_0x01cd;
    L_0x01cc:
        r6 = 0;
    L_0x01cd:
        r10 = r55.d();	 Catch:{ afgr -> 0x0a93 }
        r10 = r10.n;	 Catch:{ afgr -> 0x0a93 }
        r26 = r11;
        r11 = r55.d();	 Catch:{ afgr -> 0x0a93 }
        r11 = r11.m;	 Catch:{ afgr -> 0x0a93 }
        r27 = r9;
        r9 = r1.Q;	 Catch:{ afgr -> 0x0a93 }
        r28 = r9;
        r9 = r1.D;	 Catch:{ afgr -> 0x0a93 }
        if (r10 == 0) goto L_0x01ef;
    L_0x01e5:
        r10 = defpackage.xvo.a(r12);	 Catch:{ afgr -> 0x0a93 }
        r12 = new aeph;	 Catch:{ afgr -> 0x0a93 }
        r12.<init>(r10);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x01f8;
    L_0x01ef:
        r10 = r12.buildUpon();	 Catch:{ afgr -> 0x0a93 }
        r12 = new aepi;	 Catch:{ afgr -> 0x0a93 }
        r12.<init>(r10);	 Catch:{ afgr -> 0x0a93 }
    L_0x01f8:
        if (r3 == 0) goto L_0x0204;
    L_0x01fa:
        r10 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        if (r10 == 0) goto L_0x0204;
    L_0x01fe:
        r3 = defpackage.aepe.a(r12, r3, r11);	 Catch:{ afgr -> 0x0a93 }
        r15 = r3;
        goto L_0x0234;
    L_0x0204:
        if (r14 != 0) goto L_0x0208;
    L_0x0206:
        r15 = 0;
        goto L_0x0234;
    L_0x0208:
        r3 = "cbd";
        r10 = r14.b();	 Catch:{ afgr -> 0x0a93 }
        r10 = java.lang.Long.toString(r10);	 Catch:{ afgr -> 0x0a93 }
        r12.a(r3, r10);	 Catch:{ afgr -> 0x0a93 }
        r3 = r14.c();	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0220;
    L_0x021b:
        r10 = "csr";
        r12.a(r10, r3);	 Catch:{ afgr -> 0x0a93 }
    L_0x0220:
        r3 = android.text.TextUtils.isEmpty(r15);	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x0206;
    L_0x0226:
        r3 = "por";
        r10 = "yes";
        r12.a(r3, r10);	 Catch:{ afgr -> 0x0a93 }
        r3 = "plh";
        r10 = "yes";
        r12.a(r3, r10);	 Catch:{ afgr -> 0x0a93 }
    L_0x0234:
        if (r15 != 0) goto L_0x0237;
    L_0x0236:
        goto L_0x024a;
    L_0x0237:
        r3 = r4.get();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aajj) r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.s();	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0247;
    L_0x0243:
        r15 = defpackage.aepe.b(r15);	 Catch:{ afgr -> 0x0a93 }
    L_0x0247:
        r12.a(r15);	 Catch:{ afgr -> 0x0a93 }
    L_0x024a:
        r3 = "ack";
        r10 = "1";
        r12.a(r3, r10);	 Catch:{ afgr -> 0x0a93 }
        r10 = 0;
        r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r3 > 0) goto L_0x0258;
    L_0x0257:
        goto L_0x0261;
    L_0x0258:
        r3 = "oidm";
        r10 = java.lang.String.valueOf(r7);	 Catch:{ afgr -> 0x0a93 }
        r12.a(r3, r10);	 Catch:{ afgr -> 0x0a93 }
    L_0x0261:
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r6 != 0) goto L_0x026e;
    L_0x0268:
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
    L_0x026a:
        r31 = r7;
        goto L_0x03e9;
    L_0x026e:
        r4 = r4.get();	 Catch:{ afgr -> 0x0a93 }
        r4 = (defpackage.aajj) r4;	 Catch:{ afgr -> 0x0a93 }
        if (r4 != 0) goto L_0x027a;
    L_0x0276:
        r31 = r7;
        goto L_0x03e7;
    L_0x027a:
        if (r5 == 0) goto L_0x0276;
    L_0x027c:
        r14 = r4.q();	 Catch:{ afgr -> 0x0a93 }
        r6 = r4.r();	 Catch:{ afgr -> 0x0a93 }
        r17 = r6.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r17 != 0) goto L_0x03e2;
    L_0x028a:
        r17 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1));
        if (r17 != 0) goto L_0x0290;
    L_0x028e:
        goto L_0x03e2;
    L_0x0290:
        r17 = r5.k();	 Catch:{ afgr -> 0x0a93 }
        r10 = java.lang.Integer.valueOf(r17);	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.contains(r10);	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x02a1;
    L_0x029e:
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x026a;
    L_0x02a1:
        r6 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.r();	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.contains(r10);	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x02b4;
    L_0x02ad:
        r6 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        r10 = r6.q();	 Catch:{ afgr -> 0x0a93 }
        goto L_0x02b9;
    L_0x02b4:
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x02b9:
        r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r6 > 0) goto L_0x02c0;
    L_0x02bd:
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x026a;
    L_0x02c0:
        r6 = defpackage.awdg.J;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.createBuilder();	 Catch:{ afgr -> 0x0a93 }
        r10 = r6;
        r10 = (defpackage.awdf) r10;	 Catch:{ afgr -> 0x0a93 }
        r11 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r11.a;	 Catch:{ afgr -> 0x0a93 }
        r16 = 2;
        r17 = r6 & 2;
        if (r17 == 0) goto L_0x02dc;
    L_0x02d3:
        r11 = r11.d;	 Catch:{ afgr -> 0x0a93 }
        if (r11 != 0) goto L_0x02d9;
    L_0x02d7:
        r11 = defpackage.arhh.bv;	 Catch:{ afgr -> 0x0a93 }
    L_0x02d9:
        r10.a(r11);	 Catch:{ afgr -> 0x0a93 }
    L_0x02dc:
        r11 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r11.b;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6 & 1024;
        if (r6 == 0) goto L_0x02ed;
    L_0x02e4:
        r6 = r11.B;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x02ea;
    L_0x02e8:
        r6 = defpackage.axur.g;	 Catch:{ afgr -> 0x0a93 }
    L_0x02ea:
        r10.a(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x02ed:
        r6 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r11 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r11 = r11 & 16384;
        if (r11 == 0) goto L_0x02fe;
    L_0x02f5:
        r6 = r6.j;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x02fb;
    L_0x02f9:
        r6 = defpackage.aoth.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x02fb:
        r10.a(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x02fe:
        r6 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r11 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r17 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r11 = r11 & r17;
        if (r11 == 0) goto L_0x0312;
    L_0x0309:
        r6 = r6.k;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x030f;
    L_0x030d:
        r6 = defpackage.avjo.d;	 Catch:{ afgr -> 0x0a93 }
    L_0x030f:
        r10.a(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x0312:
        r6 = defpackage.aqsq.h;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.createBuilder();	 Catch:{ afgr -> 0x0a93 }
        r11 = r6;
        r11 = (defpackage.aqsr) r11;	 Catch:{ afgr -> 0x0a93 }
        r6 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r3 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3 & 256;
        if (r3 == 0) goto L_0x0364;
    L_0x0323:
        r3 = r6.z;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x0329;
    L_0x0327:
        r3 = defpackage.aqsq.h;	 Catch:{ afgr -> 0x0a93 }
    L_0x0329:
        r3 = r3.c;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x032f;
    L_0x032d:
        r3 = defpackage.aqso.a;	 Catch:{ afgr -> 0x0a93 }
    L_0x032f:
        r11.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r6 = r11.instance;	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.aqsq) r6;	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x035e;
    L_0x0338:
        r6.c = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r16 = 2;
        r3 = r3 | 2;
        r6.a = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.z;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x034a;
    L_0x0348:
        r3 = defpackage.aqsq.h;	 Catch:{ afgr -> 0x0a93 }
    L_0x034a:
        r3 = r3.f;	 Catch:{ afgr -> 0x0a93 }
        r11.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r6 = r11.instance;	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.aqsq) r6;	 Catch:{ afgr -> 0x0a93 }
        r31 = r7;
        r7 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r8 = 4;
        r7 = r7 | r8;
        r6.a = r7;	 Catch:{ afgr -> 0x0a93 }
        r6.f = r3;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0366;
    L_0x035e:
        r2 = new java.lang.NullPointerException;	 Catch:{ afgr -> 0x0a93 }
        r2.<init>();	 Catch:{ afgr -> 0x0a93 }
        throw r2;	 Catch:{ afgr -> 0x0a93 }
    L_0x0364:
        r31 = r7;
    L_0x0366:
        r11.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r3 = r11.instance;	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aqsq) r3;	 Catch:{ afgr -> 0x0a93 }
        r6 = r3.a;	 Catch:{ afgr -> 0x0a93 }
        r7 = 1;
        r6 = r6 | r7;
        r3.a = r6;	 Catch:{ afgr -> 0x0a93 }
        r3.b = r14;	 Catch:{ afgr -> 0x0a93 }
        r3 = r4.c;	 Catch:{ afgr -> 0x0a93 }
        r4 = r3.b;	 Catch:{ afgr -> 0x0a93 }
        r4 = r4 & 256;
        if (r4 == 0) goto L_0x038d;
    L_0x037d:
        r3 = r3.z;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x0383;
    L_0x0381:
        r3 = defpackage.aqsq.h;	 Catch:{ afgr -> 0x0a93 }
    L_0x0383:
        r4 = new anyc;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.aqsq.e;	 Catch:{ afgr -> 0x0a93 }
        r4.<init>(r3, r6);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x038e;
    L_0x038d:
        r4 = 0;
    L_0x038e:
        r11.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r3 = r11.instance;	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aqsq) r3;	 Catch:{ afgr -> 0x0a93 }
        r6 = r3.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.a();	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x03a5;
    L_0x039d:
        r6 = r3.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.anxl.mutableCopy(r6);	 Catch:{ afgr -> 0x0a93 }
        r3.d = r6;	 Catch:{ afgr -> 0x0a93 }
    L_0x03a5:
        r4 = r4.iterator();	 Catch:{ afgr -> 0x0a93 }
    L_0x03a9:
        r6 = r4.hasNext();	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x03bd;
    L_0x03af:
        r6 = r4.next();	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.avae) r6;	 Catch:{ afgr -> 0x0a93 }
        r7 = r3.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r7.d(r6);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x03a9;
    L_0x03bd:
        r10.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r3 = r10.instance;	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.awdg) r3;	 Catch:{ afgr -> 0x0a93 }
        r4 = r11.build();	 Catch:{ afgr -> 0x0a93 }
        r4 = (defpackage.anxl) r4;	 Catch:{ afgr -> 0x0a93 }
        r4 = (defpackage.aqsq) r4;	 Catch:{ afgr -> 0x0a93 }
        r3.z = r4;	 Catch:{ afgr -> 0x0a93 }
        r4 = r3.b;	 Catch:{ afgr -> 0x0a93 }
        r4 = r4 | 256;
        r3.b = r4;	 Catch:{ afgr -> 0x0a93 }
        r4 = new aajj;	 Catch:{ afgr -> 0x0a93 }
        r3 = r10.build();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.anxl) r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.awdg) r3;	 Catch:{ afgr -> 0x0a93 }
        r4.<init>(r3);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x03e9;
    L_0x03e2:
        r31 = r7;
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x03e9;
    L_0x03e7:
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
    L_0x03e9:
        r3 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x03f8;
    L_0x03ef:
        r3 = T;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.get();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aajs) r3;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x03fa;
    L_0x03f8:
        r3 = r2.j;	 Catch:{ afgr -> 0x0a93 }
    L_0x03fa:
        r7 = r2.n;	 Catch:{ afgr -> 0x0a93 }
        r6 = r2.c;	 Catch:{ afgr -> 0x0a93 }
        r8 = r6.i;	 Catch:{ afgr -> 0x0a93 }
        r10 = r6.j;	 Catch:{ afgr -> 0x0a93 }
        r11 = new java.util.HashSet;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.n;	 Catch:{ afgr -> 0x0a93 }
        r11.<init>(r6);	 Catch:{ afgr -> 0x0a93 }
        r14 = r2.b;	 Catch:{ afgr -> 0x0a93 }
        if (r8 != 0) goto L_0x041a;
    L_0x040d:
        r6 = defpackage.aahv.e();	 Catch:{ afgr -> 0x0a93 }
        r49 = r5;
        r2 = r6;
        r30 = r9;
        r5 = 1;
        r8 = 0;
        goto L_0x04af;
    L_0x041a:
        r6 = r13.f;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b();	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x0428;
    L_0x0422:
        r49 = r5;
        r30 = r9;
        goto L_0x049e;
    L_0x0428:
        r6 = r6.k;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x042e;
    L_0x042c:
        r6 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x042e:
        r6 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x0434;
    L_0x0432:
        r6 = defpackage.avtg.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x0434:
        r6 = r6.e;	 Catch:{ afgr -> 0x0a93 }
        if (r6 != 0) goto L_0x043a;
    L_0x0438:
        r6 = defpackage.avte.x;	 Catch:{ afgr -> 0x0a93 }
    L_0x043a:
        r6 = r6.r;	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x0422;
    L_0x043e:
        r6 = 2;
        if (r7 == r6) goto L_0x0422;
    L_0x0441:
        r8 = r13.h;	 Catch:{ afgr -> 0x0a93 }
        r15 = defpackage.affd.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r13.j;	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.affd.a(r3, r4, r8, r15, r6);	 Catch:{ afgr -> 0x0a93 }
        r2 = new java.util.HashSet;	 Catch:{ afgr -> 0x0a93 }
        r30 = r9;
        r9 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r2.<init>(r9);	 Catch:{ afgr -> 0x0a93 }
        r9 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r49 = r5;
        r5 = defpackage.aahv.f();	 Catch:{ afgr -> 0x0a93 }
        if (r6 != r5) goto L_0x046e;
    L_0x0460:
        r5 = defpackage.affd.c(r3, r4, r8);	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x0474;
    L_0x0466:
        r5 = defpackage.aahv.e();	 Catch:{ afgr -> 0x0a93 }
        r2.addAll(r5);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0474;
    L_0x046e:
        r5 = r8.f();	 Catch:{ afgr -> 0x0a93 }
        if (r5 > 0) goto L_0x0476;
    L_0x0474:
        r5 = 0;
        goto L_0x0498;
    L_0x0476:
        r5 = r3.r;	 Catch:{ afgr -> 0x0a93 }
        if (r5 != 0) goto L_0x047b;
    L_0x047a:
        goto L_0x0474;
    L_0x047b:
        r5 = r15.get();	 Catch:{ afgr -> 0x0a93 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ afgr -> 0x0a93 }
        r5 = r5.booleanValue();	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x0474;
    L_0x0487:
        r5 = r8.o();	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x0474;
    L_0x048d:
        r5 = r8.f();	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.aahv.f();	 Catch:{ afgr -> 0x0a93 }
        r2.addAll(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x0498:
        r6 = new affh;	 Catch:{ afgr -> 0x0a93 }
        r6.<init>(r2, r9, r5);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x04a8;
    L_0x049e:
        r2 = r13.h;	 Catch:{ afgr -> 0x0a93 }
        r5 = defpackage.affd.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r13.j;	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.affd.a(r3, r4, r2, r5, r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x04a8:
        r2 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r5 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r8 = r6;
    L_0x04af:
        r6 = r13.h;	 Catch:{ afgr -> 0x0a93 }
        r9 = defpackage.affd.b;	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.affd.a(r3, r4, r6, r9);	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        if (r19 != 0) goto L_0x04bd;
    L_0x04bb:
        r9 = 0;
        goto L_0x04d1;
    L_0x04bd:
        r9 = r4.t();	 Catch:{ afgr -> 0x0a93 }
        if (r9 == 0) goto L_0x04ca;
    L_0x04c3:
        r9 = r2.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x04ca;
    L_0x04c9:
        goto L_0x04bb;
    L_0x04ca:
        r2 = defpackage.aahv.o();	 Catch:{ afgr -> 0x0a93 }
        r6 = defpackage.afgz.c;	 Catch:{ afgr -> 0x0a93 }
        r9 = 1;
    L_0x04d1:
        r2 = defpackage.aemv.a(r2, r11);	 Catch:{ afgr -> 0x0a93 }
        r11 = defpackage.aemv.a(r6, r11);	 Catch:{ afgr -> 0x0a93 }
        if (r9 == 0) goto L_0x04e3;
    L_0x04db:
        r51 = r7;
        r50 = r10;
        r19 = r12;
        goto L_0x0577;
    L_0x04e3:
        r6 = 2;
        if (r7 == r6) goto L_0x04db;
    L_0x04e6:
        r15 = r13.g;	 Catch:{ afgr -> 0x0a93 }
        r6 = 1;
        r15 = r15.a(r6, r4, r14);	 Catch:{ afgr -> 0x0a93 }
        if (r15 == 0) goto L_0x056a;
    L_0x04ef:
        r6 = new java.util.HashSet;	 Catch:{ afgr -> 0x0a93 }
        r6.<init>(r2);	 Catch:{ afgr -> 0x0a93 }
        r19 = r12;
        r12 = r13.f;	 Catch:{ afgr -> 0x0a93 }
        r12 = r12.b();	 Catch:{ afgr -> 0x0a93 }
        if (r12 != 0) goto L_0x0503;
    L_0x04fe:
        r12 = java.util.Collections.emptyList();	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0511;
    L_0x0503:
        r12 = r12.k;	 Catch:{ afgr -> 0x0a93 }
        if (r12 != 0) goto L_0x0509;
    L_0x0507:
        r12 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x0509:
        r12 = r12.c;	 Catch:{ afgr -> 0x0a93 }
        if (r12 != 0) goto L_0x050f;
    L_0x050d:
        r12 = defpackage.avtg.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x050f:
        r12 = r12.g;	 Catch:{ afgr -> 0x0a93 }
    L_0x0511:
        r6.retainAll(r12);	 Catch:{ afgr -> 0x0a93 }
        r12 = new java.util.HashSet;	 Catch:{ afgr -> 0x0a93 }
        r12.<init>(r11);	 Catch:{ afgr -> 0x0a93 }
        r50 = r10;
        r10 = r13.f;	 Catch:{ afgr -> 0x0a93 }
        r10 = r10.b();	 Catch:{ afgr -> 0x0a93 }
        if (r10 != 0) goto L_0x0528;
    L_0x0523:
        r10 = java.util.Collections.emptyList();	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0536;
    L_0x0528:
        r10 = r10.k;	 Catch:{ afgr -> 0x0a93 }
        if (r10 != 0) goto L_0x052e;
    L_0x052c:
        r10 = defpackage.auuo.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x052e:
        r10 = r10.c;	 Catch:{ afgr -> 0x0a93 }
        if (r10 != 0) goto L_0x0534;
    L_0x0532:
        r10 = defpackage.avtg.k;	 Catch:{ afgr -> 0x0a93 }
    L_0x0534:
        r10 = r10.f;	 Catch:{ afgr -> 0x0a93 }
    L_0x0536:
        r12.retainAll(r10);	 Catch:{ afgr -> 0x0a93 }
        r10 = r6.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r10 != 0) goto L_0x0567;
    L_0x053f:
        r10 = r12.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r10 != 0) goto L_0x0567;
    L_0x0545:
        r10 = new aemz;	 Catch:{ afgr -> 0x0a93 }
        r51 = r7;
        r7 = new java.util.ArrayList;	 Catch:{ afgr -> 0x0a93 }
        r7.<init>(r6);	 Catch:{ afgr -> 0x0a93 }
        r6 = new java.util.ArrayList;	 Catch:{ afgr -> 0x0a93 }
        r6.<init>(r12);	 Catch:{ afgr -> 0x0a93 }
        r12 = r15.b;	 Catch:{ afgr -> 0x0a93 }
        r36 = 0;
        r33 = r10;
        r34 = r7;
        r35 = r6;
        r37 = r12;
        r38 = r5;
        r39 = r8;
        r33.<init>(r34, r35, r36, r37, r38, r39);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0571;
    L_0x0567:
        r51 = r7;
        goto L_0x0570;
    L_0x056a:
        r51 = r7;
        r50 = r10;
        r19 = r12;
    L_0x0570:
        r10 = 0;
    L_0x0571:
        if (r10 == 0) goto L_0x0577;
    L_0x0573:
        r2 = r10;
    L_0x0574:
        r10 = 0;
        goto L_0x076f;
    L_0x0577:
        r6 = r13.b;	 Catch:{ afgr -> 0x0a93 }
        if (r9 == 0) goto L_0x057e;
    L_0x057b:
        r7 = r3.m;	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0580;
    L_0x057e:
        r7 = r3.n;	 Catch:{ afgr -> 0x0a93 }
    L_0x0580:
        r35 = r7;
        r42 = r9 ^ 1;
        r36 = 0;
        r40 = 0;
        r41 = 1;
        r43 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r33 = r6;
        r34 = r4;
        r37 = r2;
        r38 = r11;
        r39 = r42;
        r44 = r14;
        r2 = r33.a(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44);	 Catch:{ afgr -> 0x0a93 }
        r7 = new java.util.ArrayList;	 Catch:{ afgr -> 0x0a93 }
        r7.<init>();	 Catch:{ afgr -> 0x0a93 }
        r6 = r2.b;	 Catch:{ afgr -> 0x0a93 }
        r10 = r6.length;	 Catch:{ afgr -> 0x0a93 }
        if (r10 <= 0) goto L_0x05ad;
    L_0x05a7:
        r10 = 0;
        r6 = r6[r10];	 Catch:{ afgr -> 0x0a93 }
        r7.add(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x05ad:
        if (r9 == 0) goto L_0x05f8;
    L_0x05af:
        r3 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = 0;
        r3 = r3[r6];	 Catch:{ afgr -> 0x0a93 }
        if (r27 == 0) goto L_0x05f3;
    L_0x05b6:
        r6 = r3.b();	 Catch:{ afgr -> 0x0a93 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ afgr -> 0x0a93 }
        r9 = r27;
        r6 = r9.contains(r6);	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x05f3;
    L_0x05c6:
        r6 = new aemz;	 Catch:{ afgr -> 0x0a93 }
        r8 = 1;
        r9 = new defpackage.aahr[r8];	 Catch:{ afgr -> 0x0a93 }
        r10 = 0;
        r9[r10] = r3;	 Catch:{ afgr -> 0x0a93 }
        r9 = java.util.Arrays.asList(r9);	 Catch:{ afgr -> 0x0a93 }
        r34 = defpackage.aemv.a(r9);	 Catch:{ afgr -> 0x0a93 }
        r35 = defpackage.aemv.a(r7);	 Catch:{ afgr -> 0x0a93 }
        r9 = new defpackage.aahr[r8];	 Catch:{ afgr -> 0x0a93 }
        r9[r10] = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = java.util.Arrays.asList(r9);	 Catch:{ afgr -> 0x0a93 }
        r36 = defpackage.aemv.a(r3, r7);	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.f;	 Catch:{ afgr -> 0x0a93 }
        r33 = r6;
        r37 = r2;
        r38 = r5;
        r33.<init>(r34, r35, r36, r37, r38);	 Catch:{ afgr -> 0x0a93 }
        r2 = r6;
        goto L_0x0574;
    L_0x05f3:
        r2 = defpackage.afgr.a();	 Catch:{ afgr -> 0x0a93 }
        throw r2;	 Catch:{ afgr -> 0x0a93 }
    L_0x05f8:
        r9 = r51;
        r6 = 2;
        if (r9 != r6) goto L_0x05ff;
    L_0x05fd:
        r3 = r3.c;	 Catch:{ afgr -> 0x0a93 }
    L_0x05ff:
        r4.ao();	 Catch:{ afgr -> 0x0a93 }
        r3 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r10 = new aena;	 Catch:{ afgr -> 0x0a93 }
        r11 = 0;
        r10.<init>(r11);	 Catch:{ afgr -> 0x0a93 }
        java.util.Arrays.sort(r3, r10);	 Catch:{ afgr -> 0x0a93 }
        r10 = r3.length;	 Catch:{ afgr -> 0x0a93 }
        r10 = new defpackage.nom[r10];	 Catch:{ afgr -> 0x0a93 }
        r11 = 0;
    L_0x0611:
        r12 = r10.length;	 Catch:{ afgr -> 0x0a93 }
        if (r11 >= r12) goto L_0x061f;
    L_0x0614:
        r12 = r3[r11];	 Catch:{ afgr -> 0x0a93 }
        r12 = defpackage.aajy.a(r12);	 Catch:{ afgr -> 0x0a93 }
        r10[r11] = r12;	 Catch:{ afgr -> 0x0a93 }
        r11 = r11 + 1;
        goto L_0x0611;
    L_0x061f:
        r11 = r13.i;	 Catch:{ afgr -> 0x0a93 }
        r11 = r11.get();	 Catch:{ afgr -> 0x0a93 }
        r11 = (defpackage.afjs) r11;	 Catch:{ afgr -> 0x0a93 }
        r12 = new affy;	 Catch:{ afgr -> 0x0a93 }
        r14 = new affn;	 Catch:{ afgr -> 0x0a93 }
        r15 = r13.c;	 Catch:{ afgr -> 0x0a93 }
        r6 = r13.d;	 Catch:{ afgr -> 0x0a93 }
        r27 = r8;
        r8 = r13.e;	 Catch:{ afgr -> 0x0a93 }
        r51 = r5;
        r5 = r11.b;	 Catch:{ afgr -> 0x0a93 }
        r11 = r11.c;	 Catch:{ afgr -> 0x0a93 }
        r52 = r7;
        r7 = r2.f;	 Catch:{ afgr -> 0x0a93 }
        r42 = defpackage.aemy.a;	 Catch:{ afgr -> 0x0a93 }
        r43 = r4.ao();	 Catch:{ afgr -> 0x0a93 }
        r53 = r2;
        r2 = r13.h;	 Catch:{ afgr -> 0x0a93 }
        r54 = r9;
        r9 = r13.d;	 Catch:{ afgr -> 0x0a93 }
        r9 = r9.d();	 Catch:{ afgr -> 0x0a93 }
        if (r9 == 0) goto L_0x065c;
    L_0x0651:
        r9 = r13.h;	 Catch:{ afgr -> 0x0a93 }
        r13 = r13.d;	 Catch:{ afgr -> 0x0a93 }
        r9 = r9.a(r13);	 Catch:{ afgr -> 0x0a93 }
        r46 = r9;
        goto L_0x0662;
    L_0x065c:
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r46 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0662:
        r47 = defpackage.aemx.a;	 Catch:{ afgr -> 0x0a93 }
        r38 = 0;
        r44 = 0;
        r48 = 0;
        r33 = r14;
        r34 = r15;
        r35 = r6;
        r36 = r4;
        r37 = r8;
        r39 = r5;
        r40 = r11;
        r41 = r7;
        r45 = r2;
        r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);	 Catch:{ afgr -> 0x0a93 }
        r2 = defpackage.affr.a;	 Catch:{ afgr -> 0x0a93 }
        r12.<init>(r14, r2);	 Catch:{ afgr -> 0x0a93 }
        r2 = new non;	 Catch:{ afgr -> 0x0a93 }
        r2.<init>();	 Catch:{ afgr -> 0x0a93 }
        r34 = java.util.Collections.emptyList();	 Catch:{ afgr -> 0x0a93 }
        r35 = 0;
        r33 = r12;
        r37 = r10;
        r38 = r2;
        r33.a(r34, r35, r37, r38);	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.c;	 Catch:{ afgr -> 0x0a93 }
        r5 = new java.util.ArrayList;	 Catch:{ afgr -> 0x0a93 }
        r5.<init>();	 Catch:{ afgr -> 0x0a93 }
        if (r2 != 0) goto L_0x06aa;
    L_0x06a1:
        r2 = defpackage.afpf.onesie;	 Catch:{ afgr -> 0x0a93 }
        r3 = "FormatEvaluator picked no format in OnesiePreferredFormatsSupplier.";
        r6 = 1;
        defpackage.afpc.a(r6, r2, r3);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x06fc;
    L_0x06aa:
        r6 = 0;
    L_0x06ab:
        r7 = r3.length;	 Catch:{ afgr -> 0x0a93 }
        r8 = -1;
        if (r6 >= r7) goto L_0x06c0;
    L_0x06af:
        r7 = r3[r6];	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.e;	 Catch:{ afgr -> 0x0a93 }
        r9 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r7 = r7.equals(r9);	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x06be;
    L_0x06bb:
        r6 = r6 + 1;
        goto L_0x06ab;
    L_0x06be:
        r7 = r6;
        goto L_0x06c1;
    L_0x06c0:
        r7 = -1;
    L_0x06c1:
        if (r7 >= 0) goto L_0x06e2;
    L_0x06c3:
        r3 = defpackage.afpf.onesie;	 Catch:{ afgr -> 0x0a93 }
        r6 = "FormatEvaluator picked a format not found in the input formats: ";
        r2 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ afgr -> 0x0a93 }
        r7 = r2.length();	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x06d9;
    L_0x06d3:
        r2 = new java.lang.String;	 Catch:{ afgr -> 0x0a93 }
        r2.<init>(r6);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x06dd;
    L_0x06d9:
        r2 = r6.concat(r2);	 Catch:{ afgr -> 0x0a93 }
    L_0x06dd:
        r6 = 1;
        defpackage.afpc.a(r6, r3, r2);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x06fc;
    L_0x06e2:
        r2 = r54;
        r6 = 2;
        if (r2 != r6) goto L_0x06ed;
    L_0x06e7:
        r2 = r3[r7];	 Catch:{ afgr -> 0x0a93 }
        r5.add(r2);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0707;
    L_0x06ed:
        r2 = r7;
    L_0x06ee:
        r9 = r3.length;	 Catch:{ afgr -> 0x0a93 }
        if (r2 < r9) goto L_0x0a57;
    L_0x06f1:
        r7 = r7 + r8;
    L_0x06f2:
        if (r7 < 0) goto L_0x06fc;
    L_0x06f4:
        r2 = r3[r7];	 Catch:{ afgr -> 0x0a93 }
        r5.add(r2);	 Catch:{ afgr -> 0x0a93 }
        r7 = r7 + -1;
        goto L_0x06f2;
    L_0x06fc:
        r2 = r5.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x0707;
    L_0x0702:
        r2 = defpackage.aemv.a;	 Catch:{ afgr -> 0x0a93 }
        r5.add(r2);	 Catch:{ afgr -> 0x0a93 }
    L_0x0707:
        r2 = r5.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r2 != 0) goto L_0x074f;
    L_0x070d:
        r2 = defpackage.aahv.f();	 Catch:{ afgr -> 0x0a93 }
        r10 = 0;
        r3 = r5.get(r10);	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aahr) r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.b();	 Catch:{ afgr -> 0x0a93 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.contains(r3);	 Catch:{ afgr -> 0x0a93 }
        if (r2 != 0) goto L_0x0727;
    L_0x0726:
        goto L_0x0750;
    L_0x0727:
        if (r50 != 0) goto L_0x0750;
    L_0x0729:
        r2 = r5.iterator();	 Catch:{ afgr -> 0x0a93 }
    L_0x072d:
        r3 = r2.hasNext();	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x0750;
    L_0x0733:
        r3 = r2.next();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.aahr) r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.b();	 Catch:{ afgr -> 0x0a93 }
        r7 = defpackage.aahv.e();	 Catch:{ afgr -> 0x0a93 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ afgr -> 0x0a93 }
        r3 = r7.contains(r3);	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x072d;
    L_0x074b:
        r2.remove();	 Catch:{ afgr -> 0x0a93 }
        goto L_0x072d;
    L_0x074f:
        r10 = 0;
    L_0x0750:
        r2 = new aemz;	 Catch:{ afgr -> 0x0a93 }
        r34 = defpackage.aemv.a(r5);	 Catch:{ afgr -> 0x0a93 }
        r35 = defpackage.aemv.a(r52);	 Catch:{ afgr -> 0x0a93 }
        r9 = r52;
        r36 = defpackage.aemv.a(r5, r9);	 Catch:{ afgr -> 0x0a93 }
        r11 = r53;
        r3 = r11.f;	 Catch:{ afgr -> 0x0a93 }
        r33 = r2;
        r37 = r3;
        r38 = r51;
        r39 = r27;
        r33.<init>(r34, r35, r36, r37, r38, r39);	 Catch:{ afgr -> 0x0a93 }
    L_0x076f:
        r3 = "pvi";
        r5 = i;	 Catch:{ afgr -> 0x0a93 }
        r7 = r2.a;	 Catch:{ afgr -> 0x0a93 }
        r5 = r5.a(r7);	 Catch:{ afgr -> 0x0a93 }
        r12 = r19;
        r12.a(r3, r5);	 Catch:{ afgr -> 0x0a93 }
        r3 = "pai";
        r5 = i;	 Catch:{ afgr -> 0x0a93 }
        r7 = r2.b;	 Catch:{ afgr -> 0x0a93 }
        r5 = r5.a(r7);	 Catch:{ afgr -> 0x0a93 }
        r12.a(r3, r5);	 Catch:{ afgr -> 0x0a93 }
        r3 = r2.f;	 Catch:{ afgr -> 0x0a93 }
        r13 = r26;
        r13.a = r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = r4.r();	 Catch:{ afgr -> 0x0a93 }
        r5 = r3.isEmpty();	 Catch:{ afgr -> 0x0a93 }
        if (r5 != 0) goto L_0x07b1;
    L_0x079b:
        r5 = r49.k();	 Catch:{ afgr -> 0x0a93 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.contains(r5);	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x07b1;
    L_0x07a9:
        r7 = r4.q();	 Catch:{ afgr -> 0x0a93 }
        r14 = 8;
        r7 = r7 / r14;
        goto L_0x07b6;
    L_0x07b1:
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x07b6:
        if (r24 != 0) goto L_0x07e3;
    L_0x07b8:
        r3 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r3 == 0) goto L_0x07db;
    L_0x07be:
        r3 = r2.c;	 Catch:{ afgr -> 0x0a93 }
        if (r3 != 0) goto L_0x07c6;
    L_0x07c2:
        r21 = 0;
        goto L_0x094a;
    L_0x07c6:
        r3 = defpackage.aepe.a(r3);	 Catch:{ afgr -> 0x0a93 }
        r4 = defpackage.aepe.a;	 Catch:{ afgr -> 0x0a93 }
        r3 = java.util.Arrays.asList(r3);	 Catch:{ afgr -> 0x0a93 }
        r3 = r4.a(r3);	 Catch:{ afgr -> 0x0a93 }
        r4 = defpackage.ampv.c;	 Catch:{ afgr -> 0x0a93 }
        r4 = r3.getBytes(r4);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x07df;
    L_0x07db:
        r4 = r28.a();	 Catch:{ afgr -> 0x0a93 }
    L_0x07df:
        r21 = r4;
        goto L_0x094a;
    L_0x07e3:
        r3 = defpackage.atca.h;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.createBuilder();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.atbz) r3;	 Catch:{ afgr -> 0x0a93 }
        r5 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x0818;
    L_0x07f1:
        r5 = r2.c;	 Catch:{ afgr -> 0x0a93 }
        r5 = defpackage.aepe.a(r5);	 Catch:{ afgr -> 0x0a93 }
        r5 = java.util.Arrays.asList(r5);	 Catch:{ afgr -> 0x0a93 }
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r6 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.atca) r6;	 Catch:{ afgr -> 0x0a93 }
        r9 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r9 = r9.a();	 Catch:{ afgr -> 0x0a93 }
        if (r9 != 0) goto L_0x0812;
    L_0x080a:
        r9 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r9 = defpackage.anxl.mutableCopy(r9);	 Catch:{ afgr -> 0x0a93 }
        r6.b = r9;	 Catch:{ afgr -> 0x0a93 }
    L_0x0812:
        r6 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        defpackage.anvf.addAll(r5, r6);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x082d;
    L_0x0818:
        r5 = r28.b();	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x082d;
    L_0x081e:
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r9 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r9 = (defpackage.atca) r9;	 Catch:{ afgr -> 0x0a93 }
        r9.d = r5;	 Catch:{ afgr -> 0x0a93 }
        r5 = r9.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = 2;
        r5 = r5 | r6;
        r9.a = r5;	 Catch:{ afgr -> 0x0a93 }
    L_0x082d:
        if (r23 == 0) goto L_0x0840;
    L_0x082f:
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r5 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r5 = (defpackage.atca) r5;	 Catch:{ afgr -> 0x0a93 }
        r6 = r5.a;	 Catch:{ afgr -> 0x0a93 }
        r9 = 4;
        r6 = r6 | r9;
        r5.a = r6;	 Catch:{ afgr -> 0x0a93 }
        r14 = r23;
        r5.e = r14;	 Catch:{ afgr -> 0x0a93 }
    L_0x0840:
        r5 = r4.aH();	 Catch:{ afgr -> 0x0a93 }
        r15 = 4;
        if (r5 != r15) goto L_0x084c;
    L_0x0847:
        r5 = r49.k();	 Catch:{ afgr -> 0x0a93 }
        r10 = r5;
    L_0x084c:
        r5 = r22;
        r6 = r5.b(r10);	 Catch:{ afgr -> 0x0a93 }
        r9 = r21.a();	 Catch:{ afgr -> 0x0a93 }
        r14 = r6.e;	 Catch:{ afgr -> 0x0a93 }
        r16 = -1;
        r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r11 == 0) goto L_0x0884;
    L_0x085e:
        r9 = r9 - r14;
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r9 / r14;
        r14 = (double) r14;	 Catch:{ afgr -> 0x0a93 }
        r14 = java.lang.Math.log(r14);	 Catch:{ afgr -> 0x0a93 }
        r21 = r9;
        r9 = 4609884578576439706; // 0x3ff999999999999a float:-1.5881868E-23 double:1.6;
        r23 = java.lang.Math.log(r9);	 Catch:{ afgr -> 0x0a93 }
        r14 = r14 / r23;
        r14 = java.lang.Math.round(r14);	 Catch:{ afgr -> 0x0a93 }
        r14 = (double) r14;	 Catch:{ afgr -> 0x0a93 }
        r9 = java.lang.Math.pow(r9, r14);	 Catch:{ afgr -> 0x0a93 }
        java.lang.Math.round(r9);	 Catch:{ afgr -> 0x0a93 }
        r9 = r21;
        goto L_0x0886;
    L_0x0884:
        r9 = r16;
    L_0x0886:
        r11 = new aemh;	 Catch:{ afgr -> 0x0a93 }
        r14 = r6.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r11.<init>(r9, r14, r6);	 Catch:{ afgr -> 0x0a93 }
        r6 = r20.get();	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.afjs) r6;	 Catch:{ afgr -> 0x0a93 }
        r9 = defpackage.apuj.j;	 Catch:{ afgr -> 0x0a93 }
        r9 = r9.createBuilder();	 Catch:{ afgr -> 0x0a93 }
        r9 = (defpackage.apui) r9;	 Catch:{ afgr -> 0x0a93 }
        r10 = r49.m();	 Catch:{ afgr -> 0x0a93 }
        r9.e(r10);	 Catch:{ afgr -> 0x0a93 }
        r14 = r11.a;	 Catch:{ afgr -> 0x0a93 }
        r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r10 == 0) goto L_0x08b9;
    L_0x08aa:
        r10 = r11.b;	 Catch:{ afgr -> 0x0a93 }
        r9.a(r10);	 Catch:{ afgr -> 0x0a93 }
        r10 = r11.c;	 Catch:{ afgr -> 0x0a93 }
        r9.b(r10);	 Catch:{ afgr -> 0x0a93 }
        r10 = r11.a;	 Catch:{ afgr -> 0x0a93 }
        r9.a(r10);	 Catch:{ afgr -> 0x0a93 }
    L_0x08b9:
        r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1));
        if (r10 == 0) goto L_0x08c9;
    L_0x08bd:
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1));
        if (r10 == 0) goto L_0x08c9;
    L_0x08c6:
        r9.b(r7);	 Catch:{ afgr -> 0x0a93 }
    L_0x08c9:
        if (r6 == 0) goto L_0x08db;
    L_0x08cb:
        r7 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        if (r7 <= 0) goto L_0x08db;
    L_0x08cf:
        r8 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        if (r8 <= 0) goto L_0x08db;
    L_0x08d3:
        r9.c(r7);	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.c;	 Catch:{ afgr -> 0x0a93 }
        r9.d(r6);	 Catch:{ afgr -> 0x0a93 }
    L_0x08db:
        r6 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.c();	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x08f6;
    L_0x08e3:
        r6 = r2.d;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6.b;	 Catch:{ afgr -> 0x0a93 }
        r9.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r7 = r9.instance;	 Catch:{ afgr -> 0x0a93 }
        r7 = (defpackage.apuj) r7;	 Catch:{ afgr -> 0x0a93 }
        r8 = r7.a;	 Catch:{ afgr -> 0x0a93 }
        r8 = r8 | 128;
        r7.a = r8;	 Catch:{ afgr -> 0x0a93 }
        r7.i = r6;	 Catch:{ afgr -> 0x0a93 }
    L_0x08f6:
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r6 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r6 = (defpackage.atca) r6;	 Catch:{ afgr -> 0x0a93 }
        r7 = r9.build();	 Catch:{ afgr -> 0x0a93 }
        r7 = (defpackage.anxl) r7;	 Catch:{ afgr -> 0x0a93 }
        r7 = (defpackage.apuj) r7;	 Catch:{ afgr -> 0x0a93 }
        r6.c = r7;	 Catch:{ afgr -> 0x0a93 }
        r7 = r6.a;	 Catch:{ afgr -> 0x0a93 }
        r19 = 1;
        r7 = r7 | 1;
        r6.a = r7;	 Catch:{ afgr -> 0x0a93 }
        r6 = r30;
        r4 = defpackage.affd.a(r5, r4, r6);	 Catch:{ afgr -> 0x0a93 }
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r5 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r5 = (defpackage.atca) r5;	 Catch:{ afgr -> 0x0a93 }
        r6 = r5.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6 | 16;
        r5.a = r6;	 Catch:{ afgr -> 0x0a93 }
        r5.g = r4;	 Catch:{ afgr -> 0x0a93 }
        r4 = r2.e;	 Catch:{ afgr -> 0x0a93 }
        r3.copyOnWrite();	 Catch:{ afgr -> 0x0a93 }
        r5 = r3.instance;	 Catch:{ afgr -> 0x0a93 }
        r5 = (defpackage.atca) r5;	 Catch:{ afgr -> 0x0a93 }
        r6 = r5.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r6 | 8;
        r5.a = r6;	 Catch:{ afgr -> 0x0a93 }
        r5.f = r4;	 Catch:{ afgr -> 0x0a93 }
        r3 = r3.build();	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.anxl) r3;	 Catch:{ afgr -> 0x0a93 }
        r3 = (defpackage.atca) r3;	 Catch:{ afgr -> 0x0a93 }
        r4 = r3.toByteArray();	 Catch:{ afgr -> 0x0a93 }
        r3 = "opr";
        r5 = "1";
        r12.a(r3, r5);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x07df;
    L_0x094a:
        if (r21 != 0) goto L_0x0950;
    L_0x094c:
        r3 = r56;
        r4 = 0;
        goto L_0x098f;
    L_0x0950:
        r3 = r56;
        r4 = r3.k;	 Catch:{ afgr -> 0x0a93 }
        r4 = (double) r4;
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r4);
        r4 = r4 / r6;
        r6 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r6 == 0) goto L_0x0973;
    L_0x0964:
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x0973;
    L_0x096a:
        r6 = "osts";
        r4 = java.lang.String.valueOf(r4);	 Catch:{ afgr -> 0x0a93 }
        r12.a(r6, r4);	 Catch:{ afgr -> 0x0a93 }
    L_0x0973:
        r4 = new aemo;	 Catch:{ afgr -> 0x0a93 }
        r5 = new ovm;	 Catch:{ afgr -> 0x0a93 }
        r20 = r12.a();	 Catch:{ afgr -> 0x0a93 }
        r22 = 0;
        r24 = 0;
        r26 = -1;
        r28 = 0;
        r29 = 0;
        r19 = r5;
        r19.<init>(r20, r21, r22, r24, r26, r28, r29);	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.c;	 Catch:{ afgr -> 0x0a93 }
        r4.<init>(r5, r2);	 Catch:{ afgr -> 0x0a93 }
    L_0x098f:
        if (r4 != 0) goto L_0x099c;
    L_0x0991:
        r2 = r1.p;	 Catch:{ all -> 0x0ab2 }
        r2.c();	 Catch:{ all -> 0x0ab2 }
        r55.f();	 Catch:{ all -> 0x0ab2 }
        monitor-exit(r55);
    L_0x099a:
        r2 = 0;
        return r2;
    L_0x099c:
        r2 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r2 != 0) goto L_0x09a3;
    L_0x09a2:
        goto L_0x09e6;
    L_0x09a3:
        r2 = r55.d();	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.f;	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x09e6;
    L_0x09ab:
        r2 = r4.b;	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x09e6;
    L_0x09af:
        r11 = r1.k;	 Catch:{ afgr -> 0x0a93 }
        r14 = r3.k;	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.iterator();	 Catch:{ afgr -> 0x0a93 }
    L_0x09b7:
        r5 = r2.hasNext();	 Catch:{ afgr -> 0x0a93 }
        if (r5 == 0) goto L_0x09e1;
    L_0x09bd:
        r5 = r2.next();	 Catch:{ afgr -> 0x0a93 }
        r5 = (defpackage.aahr) r5;	 Catch:{ afgr -> 0x0a93 }
        r6 = r5.b;	 Catch:{ afgr -> 0x0a93 }
        r7 = android.text.TextUtils.isEmpty(r6);	 Catch:{ afgr -> 0x0a93 }
        if (r7 != 0) goto L_0x09e6;
    L_0x09cb:
        r7 = r5.b();	 Catch:{ afgr -> 0x0a93 }
        r8 = r5.t();	 Catch:{ afgr -> 0x0a93 }
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ afgr -> 0x0a93 }
        r9 = r5.toMicros(r14);	 Catch:{ afgr -> 0x0a93 }
        r5 = r11;
        r5 = r5.a(r6, r7, r8, r9);	 Catch:{ afgr -> 0x0a93 }
        if (r5 != 0) goto L_0x09b7;
    L_0x09e0:
        goto L_0x09e6;
    L_0x09e1:
        r2 = 0;
        r1.g = r2;	 Catch:{ afgr -> 0x0a93 }
        monitor-exit(r55);
        return r2;
    L_0x09e6:
        r2 = r4.a;	 Catch:{ afgr -> 0x0a93 }
        r5 = r55.e();	 Catch:{ afgr -> 0x0a93 }
        r6 = r18;
        r2 = r1.a(r6, r2, r5, r1);	 Catch:{ afgr -> 0x0a93 }
        r1.d = r2;	 Catch:{ afgr -> 0x0a93 }
        r2 = r1.s;	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x0a01;
    L_0x09f8:
        r5 = r1.z;	 Catch:{ afgr -> 0x0a93 }
        if (r5 != 0) goto L_0x0a01;
    L_0x09fc:
        r5 = "or";
        r2.a(r5);	 Catch:{ afgr -> 0x0a93 }
    L_0x0a01:
        r2 = r1.d;	 Catch:{ afgr -> 0x0a93 }
        r5 = r31;
        r2.a(r5);	 Catch:{ afgr -> 0x0a93 }
        r2 = r1.a;	 Catch:{ afgr -> 0x0a93 }
        r5 = r3.c;	 Catch:{ afgr -> 0x0a93 }
        r6 = r5.p;	 Catch:{ afgr -> 0x0a93 }
        r5 = r5.t;	 Catch:{ afgr -> 0x0a93 }
        r7 = (long) r5;	 Catch:{ afgr -> 0x0a93 }
        r2.a(r6, r7);	 Catch:{ afgr -> 0x0a93 }
        r2 = r56.e();	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x0a42;
    L_0x0a1a:
        r2 = r4.b;	 Catch:{ afgr -> 0x0a93 }
        if (r2 == 0) goto L_0x0a42;
    L_0x0a1e:
        r2 = r2.iterator();	 Catch:{ afgr -> 0x0a93 }
    L_0x0a22:
        r4 = r2.hasNext();	 Catch:{ afgr -> 0x0a93 }
        if (r4 == 0) goto L_0x0a42;
    L_0x0a28:
        r4 = r2.next();	 Catch:{ afgr -> 0x0a93 }
        r4 = (defpackage.aahr) r4;	 Catch:{ afgr -> 0x0a93 }
        r5 = r1.a;	 Catch:{ afgr -> 0x0a93 }
        r6 = r4.b;	 Catch:{ afgr -> 0x0a93 }
        r7 = r4.b();	 Catch:{ afgr -> 0x0a93 }
        r8 = r4.C();	 Catch:{ afgr -> 0x0a93 }
        r10 = r4.t();	 Catch:{ afgr -> 0x0a93 }
        r5.a(r6, r7, r8, r10);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0a22;
    L_0x0a42:
        r2 = r3.c;	 Catch:{ afgr -> 0x0a93 }
        r2 = r2.g;	 Catch:{ afgr -> 0x0a93 }
        if (r2 != 0) goto L_0x0a4b;
    L_0x0a48:
        r2 = r57;
        goto L_0x0a53;
    L_0x0a4b:
        r2 = r1.K;	 Catch:{ afgr -> 0x0a93 }
        r3 = 50;
        r1.a(r2, r3);	 Catch:{ afgr -> 0x0a93 }
        goto L_0x0a48;
    L_0x0a53:
        r1.F = r2;	 Catch:{ afgr -> 0x0a93 }
        monitor-exit(r55);
        return r13;
    L_0x0a57:
        r12 = r19;
        r14 = r23;
        r13 = r26;
        r23 = r30;
        r25 = r31;
        r9 = r52;
        r11 = r53;
        r10 = 0;
        r15 = 4;
        r16 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r19 = 1;
        r6 = r3[r2];	 Catch:{ afgr -> 0x0a93 }
        r5.add(r6);	 Catch:{ afgr -> 0x0a93 }
        r2 = r2 + 1;
        r52 = r9;
        r53 = r11;
        r19 = r12;
        r30 = r23;
        r31 = r25;
        r26 = r13;
        r23 = r14;
        goto L_0x06ee;
    L_0x0a85:
        r2 = r1.p;	 Catch:{ all -> 0x0ab2 }
        r2.c();	 Catch:{ all -> 0x0ab2 }
        r55.f();	 Catch:{ all -> 0x0ab2 }
        monitor-exit(r55);
        goto L_0x099a;
    L_0x0a90:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0a9b;
    L_0x0a93:
        r0 = move-exception;
        r2 = r0;
        r3 = "fmt.noneavailable";
        r1.a(r3, r2);	 Catch:{ all -> 0x0a90 }
        throw r2;	 Catch:{ all -> 0x0a90 }
    L_0x0a9b:
        r3 = r1.p;	 Catch:{ all -> 0x0ab2 }
        r3.c();	 Catch:{ all -> 0x0ab2 }
        r55.f();	 Catch:{ all -> 0x0ab2 }
        throw r2;	 Catch:{ all -> 0x0ab2 }
    L_0x0aa4:
        r2 = r1.p;	 Catch:{ all -> 0x0ab2 }
        r2 = r2.a;	 Catch:{ all -> 0x0ab2 }
        r4 = new aeht;	 Catch:{ all -> 0x0ab2 }
        r4.<init>();	 Catch:{ all -> 0x0ab2 }
        r2.a(r4);	 Catch:{ all -> 0x0ab2 }
        monitor-exit(r55);
        return r3;
    L_0x0ab2:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r55);
        goto L_0x0ab7;
    L_0x0ab6:
        throw r2;
    L_0x0ab7:
        goto L_0x0ab6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.a(aaje, aemt, aeuy):aemk");
    }

    private final ScheduledExecutorService e() {
        aaje aaje = this.g;
        if (aaje != null && aaje.c.s) {
            return (ScheduledExecutorService) this.C.get();
        }
        return this.m;
    }

    private static Uri a(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? uri.buildUpon().appendQueryParameter("cpn", str).build() : uri;
    }

    public final synchronized void a() {
        if (this.N == null || this.A.b() - this.O >= 2000) {
            f();
        }
    }

    private final synchronized void f() {
        aeow aeow = this.d;
        if (aeow != null) {
            aeow.d();
            this.d = null;
        }
        aeow = this.e;
        if (aeow != null) {
            aeow.d();
            this.e = null;
        }
        if (!(this.G == null || this.H)) {
            this.p.b();
            this.G.a(null);
        }
        for (Future cancel : this.J) {
            cancel.cancel(true);
        }
        this.J.clear();
        this.f.clear();
        this.a.b();
        this.G = null;
        this.H = false;
        this.S = false;
        this.g = null;
        this.Q = null;
        this.L = false;
        this.N = null;
        this.R = null;
        this.P = null;
        this.F = null;
        this.h = aeuy.e;
    }

    public final synchronized void a(aajs aajs) {
        List list = aajs.l;
        if (!list.isEmpty()) {
            Uri uri = ((aahr) list.get(0)).d;
            if (uri != null) {
                String host = uri.getHost();
                if (!TextUtils.isEmpty(host)) {
                    if (host.endsWith("googlevideo.com")) {
                        this.I = host;
                    }
                }
                String queryParameter = uri.getQueryParameter("id");
                if (queryParameter != null) {
                    this.a.a(queryParameter, aajs.c);
                }
            }
        }
    }

    private static void a(Exception exception, double d) {
        String a = afht.a((Object) exception, true);
        if (exception.getCause() != null) {
            a = String.valueOf(a);
            String a2 = afht.a(exception.getCause(), true);
            StringBuilder stringBuilder = new StringBuilder((a.length() + 7) + String.valueOf(a2).length());
            stringBuilder.append(a);
            stringBuilder.append(";cause.");
            stringBuilder.append(a2);
            a = stringBuilder.toString();
        }
        afpc.a(2, afpf.onesie, a, d);
    }

    public final synchronized void a(aeow aeow, aepc aepc) {
        if (aeow == this.d || aeow == this.e) {
            if (!(aepc.g || aepc.b.length <= 0 || this.H || this.S)) {
                this.S = true;
                this.p.a.a(new aeik());
            }
            this.a.a(aepc);
            if (aeow == this.e) {
                if (d().t) {
                    aeow = this.d;
                    if (aeow != null) {
                        aeow.d();
                        this.d = null;
                    }
                }
            }
        }
    }

    public final synchronized void a(aeow aeow, byte[] bArr) {
        if ((aeow == this.d || aeow == this.e) && !this.L) {
            this.p.a.a(new aehr());
            try {
                this.a.a(bArr);
                this.L = true;
            } catch (aeoi e) {
                aema.a(e, 1.0d);
            }
        }
    }

    public final void a(aeow aeow, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object obj;
        aemn aemn;
        aajh aajh;
        synchronized (this) {
            obj = null;
            aemn = null;
            if (aeow == this.d || aeow == this.e) {
                if (this.H) {
                    aepe.a("Multiple player responses received.");
                } else {
                    this.p.a.a(new aehu());
                    this.H = true;
                    aemn = this.Q;
                    aajh = this.G;
                    obj = 1;
                }
            }
            aajh = null;
        }
        if (obj != null) {
            if (aemn == null || aajh == null) {
                aepe.a("EncryptedPlayerResponse received without playerResponseListener");
            } else {
                aemn.a(aajh, bArr, bArr2, bArr3);
            }
        }
    }

    /* JADX WARNING: Missing block: B:22:0x005c, code skipped:
            r1.F.a(r3, r2);
     */
    /* JADX WARNING: Missing block: B:23:0x0067, code skipped:
            if (r1.g.c.o == false) goto L_0x006c;
     */
    /* JADX WARNING: Missing block: B:24:0x0069, code skipped:
            a(r3);
     */
    /* JADX WARNING: Missing block: B:25:0x006c, code skipped:
            return;
     */
    public final void b(defpackage.aeow r2, defpackage.aepc r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x008e }
        if (r2 == r0) goto L_0x000c;
    L_0x0005:
        r0 = r1.e;	 Catch:{ all -> 0x008e }
        if (r2 != r0) goto L_0x000a;
    L_0x0009:
        goto L_0x000c;
    L_0x000a:
        r2 = 0;
        goto L_0x005b;
    L_0x000c:
        r2 = r1.a;	 Catch:{ all -> 0x008e }
        r2.a(r3);	 Catch:{ all -> 0x008e }
        r2 = r3.g;	 Catch:{ all -> 0x008e }
        if (r2 == 0) goto L_0x001c;
    L_0x0015:
        r2 = "Encrypted init segment.";
        defpackage.aepe.a(r2);	 Catch:{ all -> 0x008e }
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        return;
    L_0x001c:
        r2 = r1.F;	 Catch:{ all -> 0x008e }
        if (r2 == 0) goto L_0x0087;
    L_0x0020:
        r2 = defpackage.aahv.h();	 Catch:{ all -> 0x008e }
        r0 = r3.d;	 Catch:{ all -> 0x008e }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x008e }
        r2 = r2.contains(r0);	 Catch:{ all -> 0x008e }
        if (r2 == 0) goto L_0x003e;
    L_0x0030:
        r2 = r1.p;	 Catch:{ all -> 0x008e }
        r2 = r2.a;	 Catch:{ all -> 0x008e }
        r0 = new aeim;	 Catch:{ all -> 0x008e }
        r0.<init>();	 Catch:{ all -> 0x008e }
        r2.a(r0);	 Catch:{ all -> 0x008e }
        r2 = 2;
        goto L_0x005b;
    L_0x003e:
        r2 = defpackage.aahv.n();	 Catch:{ all -> 0x008e }
        r0 = r3.d;	 Catch:{ all -> 0x008e }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x008e }
        r2 = r2.contains(r0);	 Catch:{ all -> 0x008e }
        if (r2 == 0) goto L_0x006d;
    L_0x004e:
        r2 = r1.p;	 Catch:{ all -> 0x008e }
        r2 = r2.a;	 Catch:{ all -> 0x008e }
        r0 = new aehd;	 Catch:{ all -> 0x008e }
        r0.<init>();	 Catch:{ all -> 0x008e }
        r2.a(r0);	 Catch:{ all -> 0x008e }
        r2 = 1;
    L_0x005b:
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        r0 = r1.F;
        r0.a(r3, r2);
        r2 = r1.g;
        r2 = r2.c;
        r2 = r2.o;
        if (r2 == 0) goto L_0x006c;
    L_0x0069:
        r1.a(r3);
    L_0x006c:
        return;
    L_0x006d:
        r2 = r3.d;	 Catch:{ all -> 0x008e }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008e }
        r0 = 42;
        r3.<init>(r0);	 Catch:{ all -> 0x008e }
        r0 = "Invalid init segment received: ";
        r3.append(r0);	 Catch:{ all -> 0x008e }
        r3.append(r2);	 Catch:{ all -> 0x008e }
        r2 = r3.toString();	 Catch:{ all -> 0x008e }
        defpackage.aepe.a(r2);	 Catch:{ all -> 0x008e }
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        return;
    L_0x0087:
        r2 = "Null initSegmentListener.";
        defpackage.aepe.a(r2);	 Catch:{ all -> 0x008e }
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        return;
    L_0x008e:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008e }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.b(aeow, aepc):void");
    }

    private final synchronized void a(aepc aepc) {
        this.n.schedule(new aeme(this, aepc), 0, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a(aeow aeow) {
        if (aeow == this.d) {
            this.p.a.a(new aehv());
            if (!(this.e != null || this.H || this.G == null)) {
                g();
            }
        } else if (aeow == this.e) {
            this.p.a.a(new aeig());
            if (!(this.H || this.G == null)) {
                g();
            }
        }
        aeow = this.d;
        if (aeow == null || aeow.e()) {
            aeow = this.e;
            if (aeow == null || aeow.e()) {
                this.a.a();
            }
        }
    }

    public final synchronized void a(aeow aeow, Exception exception) {
        a(aeow, exception, true);
    }

    public final synchronized void b(aeow aeow, Exception exception) {
        a(aeow, exception, false);
    }

    /* JADX WARNING: Missing block: B:34:0x0085, code skipped:
            return;
     */
    private final synchronized void a(defpackage.aeow r6, java.lang.Exception r7, boolean r8) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.d;	 Catch:{ all -> 0x0086 }
        if (r6 == r0) goto L_0x0009;
    L_0x0005:
        r0 = r5.e;	 Catch:{ all -> 0x0086 }
        if (r6 != r0) goto L_0x0084;
    L_0x0009:
        r0 = r7 instanceof defpackage.aekl;	 Catch:{ all -> 0x0086 }
        if (r0 == 0) goto L_0x004b;
    L_0x000d:
        r0 = r7;
        r0 = (defpackage.aekl) r0;	 Catch:{ all -> 0x0086 }
        r0 = r0.a;	 Catch:{ all -> 0x0086 }
        r1 = 5;
        if (r0 != r1) goto L_0x004b;
    L_0x0015:
        r0 = r7.getCause();	 Catch:{ all -> 0x0086 }
        r1 = r0 instanceof java.io.IOException;	 Catch:{ all -> 0x0086 }
        if (r1 == 0) goto L_0x0045;
    L_0x001d:
        r0 = (java.io.IOException) r0;	 Catch:{ all -> 0x0086 }
        r1 = r5.h;	 Catch:{ all -> 0x0086 }
        r2 = defpackage.aeuy.e;	 Catch:{ all -> 0x0086 }
        if (r1 != r2) goto L_0x002b;
    L_0x0025:
        r0 = "Unexpected unavailable medialibPlayerListener.";
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x0086 }
        goto L_0x0058;
    L_0x002b:
        r1 = r5.i();	 Catch:{ all -> 0x0086 }
        if (r1 == 0) goto L_0x0058;
    L_0x0031:
        r1 = r5.q;	 Catch:{ all -> 0x0086 }
        r2 = 0;
        r4 = 1;
        r0 = defpackage.aevl.a(r0, r2, r1, r4);	 Catch:{ all -> 0x0086 }
        r1 = r5.E;	 Catch:{ all -> 0x0086 }
        r2 = new aelz;	 Catch:{ all -> 0x0086 }
        r2.<init>(r5, r0);	 Catch:{ all -> 0x0086 }
        r1.post(r2);	 Catch:{ all -> 0x0086 }
        goto L_0x0058;
    L_0x0045:
        r0 = "net";
        r5.a(r0, r7);	 Catch:{ all -> 0x0086 }
        goto L_0x0058;
    L_0x004b:
        r0 = 4587366580439587226; // 0x3fa999999999999a float:-1.5881868E-23 double:0.05;
        defpackage.aema.a(r7, r0);	 Catch:{ all -> 0x0086 }
        r0 = "response.parse";
        r5.a(r0, r7);	 Catch:{ all -> 0x0086 }
    L_0x0058:
        r0 = r5.p;	 Catch:{ all -> 0x0086 }
        r0.c();	 Catch:{ all -> 0x0086 }
        r0 = r5.d();	 Catch:{ all -> 0x0086 }
        r0 = r0.j;	 Catch:{ all -> 0x0086 }
        if (r0 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x007f;
    L_0x0066:
        r0 = r7.getCause();	 Catch:{ all -> 0x0086 }
        r0 = r0 instanceof defpackage.owb;	 Catch:{ all -> 0x0086 }
        if (r0 == 0) goto L_0x007f;
    L_0x006e:
        r7 = r7.getCause();	 Catch:{ all -> 0x0086 }
        r7 = r7.getCause();	 Catch:{ all -> 0x0086 }
        r7 = r7 instanceof java.net.SocketTimeoutException;	 Catch:{ all -> 0x0086 }
        if (r7 == 0) goto L_0x007f;
    L_0x007a:
        r5.a(r6);	 Catch:{ all -> 0x0086 }
        monitor-exit(r5);
        return;
    L_0x007f:
        if (r8 == 0) goto L_0x0084;
    L_0x0081:
        r5.f();	 Catch:{ all -> 0x0086 }
    L_0x0084:
        monitor-exit(r5);
        return;
    L_0x0086:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.a(aeow, java.lang.Exception, boolean):void");
    }

    private final void a(String str, Object obj) {
        if (this.h == aeuy.e) {
            aepe.a("Unexpected unavailable medialibPlayerListener.");
        } else if (i()) {
            this.E.post(new aemc(this, str, obj));
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            return;
     */
    public final synchronized void b(defpackage.aeow r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0012;
    L_0x0005:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aehh;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
    L_0x0012:
        r0 = r1.e;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0024;
    L_0x0016:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aeib;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);
        return;
    L_0x0024:
        monitor-exit(r1);
        return;
    L_0x0026:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.b(aeow):void");
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            return;
     */
    public final synchronized void c(defpackage.aeow r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0012;
    L_0x0005:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aehy;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
    L_0x0012:
        r0 = r1.e;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0024;
    L_0x0016:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aeif;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);
        return;
    L_0x0024:
        monitor-exit(r1);
        return;
    L_0x0026:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.c(aeow):void");
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            return;
     */
    public final synchronized void d(defpackage.aeow r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0012;
    L_0x0005:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aehm;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
    L_0x0012:
        r0 = r1.e;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0024;
    L_0x0016:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aeid;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);
        return;
    L_0x0024:
        monitor-exit(r1);
        return;
    L_0x0026:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.d(aeow):void");
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            return;
     */
    public final synchronized void e(defpackage.aeow r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0012;
    L_0x0005:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aehk;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        goto L_0x0024;
    L_0x0012:
        r0 = r1.e;	 Catch:{ all -> 0x0026 }
        if (r2 != r0) goto L_0x0024;
    L_0x0016:
        r2 = r1.p;	 Catch:{ all -> 0x0026 }
        r2 = r2.a;	 Catch:{ all -> 0x0026 }
        r0 = new aeie;	 Catch:{ all -> 0x0026 }
        r0.<init>();	 Catch:{ all -> 0x0026 }
        r2.a(r0);	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);
        return;
    L_0x0024:
        monitor-exit(r1);
        return;
    L_0x0026:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.e(aeow):void");
    }

    public final synchronized void a(aeow aeow, String str) {
        if (aeow == this.d || aeow == this.e) {
            a(this.K.buildUpon().authority(str).build(), 0);
        }
    }

    private final synchronized void a(Uri uri, long j) {
        for (int i = 0; i < 2; i++) {
            if (j > 0) {
                this.J.add(this.n.schedule(a(this.t, uri), j, TimeUnit.MILLISECONDS));
            } else {
                this.J.add(this.n.submit(a(this.t, uri)));
            }
        }
    }

    private final synchronized void g() {
        this.p.b();
        this.p.c();
        this.H = true;
        this.G.a("finished without player response");
    }

    public static aemq a(String str, ExecutorService executorService) {
        return new aemq(str, executorService);
    }

    private final aeow a(ovx ovx, ovm ovm, ScheduledExecutorService scheduledExecutorService, aeov aeov) {
        return new aeow(ovx, ovm, scheduledExecutorService, d().c ? this.w : null, aeov);
    }

    /* JADX WARNING: Missing block: B:17:0x0045, code skipped:
            return;
     */
    public final synchronized void a(defpackage.aeow r3, android.net.Uri r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d;	 Catch:{ all -> 0x0046 }
        if (r3 != r0) goto L_0x0039;
    L_0x0005:
        r3 = r2.e;	 Catch:{ all -> 0x0046 }
        if (r3 != 0) goto L_0x0032;
    L_0x0009:
        r3 = r2.p;	 Catch:{ all -> 0x0046 }
        r3 = r3.a;	 Catch:{ all -> 0x0046 }
        r0 = new aeii;	 Catch:{ all -> 0x0046 }
        r0.<init>();	 Catch:{ all -> 0x0046 }
        r3.a(r0);	 Catch:{ all -> 0x0046 }
        r3 = r2.l;	 Catch:{ all -> 0x0046 }
        r3 = r3.c();	 Catch:{ all -> 0x0046 }
        r0 = new ovm;	 Catch:{ all -> 0x0046 }
        r0.<init>(r4);	 Catch:{ all -> 0x0046 }
        r4 = r2.e();	 Catch:{ all -> 0x0046 }
        r3 = r2.a(r3, r0, r4, r2);	 Catch:{ all -> 0x0046 }
        r2.e = r3;	 Catch:{ all -> 0x0046 }
        r3 = r2.e;	 Catch:{ all -> 0x0046 }
        r0 = 0;
        r3.a(r0);	 Catch:{ all -> 0x0046 }
        goto L_0x0044;
    L_0x0032:
        r3 = "Two server push URL parts received.";
        defpackage.aepe.a(r3);	 Catch:{ all -> 0x0046 }
        monitor-exit(r2);
        return;
    L_0x0039:
        r4 = r2.e;	 Catch:{ all -> 0x0046 }
        if (r3 != r4) goto L_0x0044;
    L_0x003d:
        r3 = "Server push URL part found in server push response.";
        defpackage.aepe.a(r3);	 Catch:{ all -> 0x0046 }
        monitor-exit(r2);
        return;
    L_0x0044:
        monitor-exit(r2);
        return;
    L_0x0046:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.a(aeow, android.net.Uri):void");
    }

    public final synchronized void b(aeow aeow, String str) {
        if (aeow == this.d || aeow == this.e) {
            if (this.M.length() > 0) {
                this.M.append(",");
            }
            this.M.append(str);
            afjj afjj = this.p;
            afjj.a.a(new aeij(this.M.toString()));
        }
    }

    public final void a(aeow aeow, String str, Set set) {
        if (aeow == this.d || aeow == this.e) {
            this.j.a.a(str, set);
        }
    }

    public final void a(aeow aeow, aeox aeox) {
        if (aeow == this.d || aeow == this.e) {
            this.a.a(aeox);
        }
    }

    public final void a(aeow aeow, njk njk) {
        if (aeow == this.d || aeow == this.e) {
            this.a.a(njk);
        }
    }

    public final boolean b() {
        return d().b;
    }

    public final boolean c() {
        arvt b = this.u.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (avte.d) {
                return true;
            }
        }
        return false;
    }

    public final avte d() {
        avte avte;
        arvt b = this.u.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte = avtg.e;
            if (avte == null) {
                return avte.x;
            }
        }
        avte = avte.x;
        return avte;
    }

    private final avtg h() {
        avtg avtg;
        arvt b = this.u.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg = auuo.c;
            if (avtg == null) {
                return avtg.k;
            }
        }
        avtg = avtg.k;
        return avtg;
    }

    private final boolean i() {
        arvt b = this.u.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            avtg avtg = auuo.c;
            if (avtg == null) {
                avtg = avtg.k;
            }
            avte avte = avtg.e;
            if (avte == null) {
                avte = avte.x;
            }
            if (avte.q) {
                return true;
            }
        }
        return false;
    }

    private final aemd a(afhg afhg, Uri uri) {
        return new aemd(afhg, uri, this.r);
    }
}
