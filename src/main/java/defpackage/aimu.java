package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aimu */
public final class aimu implements ajan, xcp {
    public final ExecutorService a;
    public final Set b;
    public final LruCache c;
    public long d;
    public Bitmap e;
    public long f;
    public Bitmap g;
    public aing h;
    public int i;
    public final Object j;
    public boolean k;
    public boolean l = false;
    public int m;
    private final akkq n;
    private final xci o;
    private final Executor p;
    private final wxg q;
    private boolean r = false;
    private boolean s = false;
    private final aiqf t;
    private final ajam u;
    private final zyw v;
    private final zzl w;
    private String x;
    private boolean y;
    private final bdfu z = new bdfu();

    public aimu(akkq akkq, xci xci, Executor executor, ScheduledExecutorService scheduledExecutorService, aiqf aiqf, ajam ajam, zyw zyw, zzl zzl) {
        aine aine = new aine();
        this.n = (akkq) amqw.a((Object) akkq);
        this.o = (xci) amqw.a((Object) xci);
        this.p = executor;
        this.a = scheduledExecutorService;
        this.j = new Object();
        this.b = Collections.newSetFromMap(new WeakHashMap());
        this.t = aiqf;
        this.u = ajam;
        this.v = zyw;
        this.w = zzl;
        this.m = 0;
        this.c = new LruCache(3);
        this.d = -1;
        this.f = -1;
        this.q = new ainf(this);
        if (aipo.a(this.v, 268435456)) {
            this.z.a(a(this.u));
        } else {
            this.o.a((Object) this);
        }
    }

    public final long e() {
        return 268435456;
    }

    public final boolean a() {
        return this.h != null && this.y;
    }

    public final synchronized void a(ainh ainh) {
        this.b.add(ainh);
    }

    public final synchronized void a(Bitmap bitmap) {
        ainj a;
        if (bitmap != null) {
            try {
                a = ainj.a(bitmap);
            } catch (Throwable th) {
            }
        } else {
            a = null;
        }
        this.p.execute(new aimx(this, a));
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 268435456)).a(ajcg.a(ajam.O(), 268435456)).a(new aimw(this), aimz.a), ajam.Q().b.a(ajcg.b(ajam.O(), 268435456)).a(ajcg.a(ajam.O(), 268435456)).a(new aimy(this), ainb.a), ajam.Q().d.a(ajcg.b(ajam.O(), 268435456)).a(ajcg.a(ajam.O(), 268435456)).a(new aina(this), aind.a)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014b  */
    public final void a(defpackage.ahkn r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r1.a;
        r2 = r2.ordinal();
        if (r2 == 0) goto L_0x0176;
    L_0x000c:
        r3 = 2;
        if (r2 == r3) goto L_0x0011;
    L_0x000f:
        goto L_0x0179;
    L_0x0011:
        r2 = r1.b;
        if (r2 == 0) goto L_0x0179;
    L_0x0015:
        r2 = r2.a;
        r2 = r2.k;
        r4 = 55735497; // 0x35274c9 float:6.1847516E-37 double:2.75369943E-316;
        if (r2 != 0) goto L_0x0020;
    L_0x001e:
        r2 = 0;
        goto L_0x002a;
    L_0x0020:
        r6 = r2.a;
        if (r6 != r4) goto L_0x001e;
    L_0x0024:
        r2 = r2.b;
        r2 = (defpackage.awgq) r2;
        r2 = r2.b;
    L_0x002a:
        r6 = 1;
        r7 = 0;
        if (r2 != 0) goto L_0x0058;
    L_0x002e:
        r8 = r0.w;
        r8 = defpackage.aipo.a(r8);
        if (r8 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0058;
    L_0x0037:
        r8 = r8.D;
        if (r8 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0058;
    L_0x003c:
        r2 = r1.b;
        r2 = r2.a;
        r2 = r2.k;
        if (r2 != 0) goto L_0x0046;
    L_0x0044:
        r2 = 0;
        goto L_0x0053;
    L_0x0046:
        r8 = r2.a;
        r9 = 70276274; // 0x43054b2 float:2.072759E-36 double:3.47210927E-316;
        if (r8 != r9) goto L_0x0044;
    L_0x004d:
        r2 = r2.b;
        r2 = (defpackage.awei) r2;
        r2 = r2.b;
    L_0x0053:
        if (r2 == 0) goto L_0x0058;
    L_0x0055:
        r8 = r2;
        r2 = 1;
        goto L_0x005a;
    L_0x0058:
        r8 = r2;
        r2 = 0;
    L_0x005a:
        r9 = r1.b;
        r9 = r9.h();
        r17.b();
        if (r2 != 0) goto L_0x00b9;
    L_0x0065:
        r9 = r9 * 1000;
        r2 = (long) r9;
        if (r8 == 0) goto L_0x00b3;
    L_0x006a:
        r9 = 0;
        r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x00b3;
    L_0x0070:
        r9 = "\\|";
        r8 = r8.split(r9);
        r9 = r8.length;
        if (r9 <= r6) goto L_0x00b3;
    L_0x0079:
        r16 = r8[r7];
        r8 = java.util.Arrays.copyOfRange(r8, r6, r9);
        r8 = (java.lang.String[]) r8;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r14 = 0;
    L_0x0087:
        r10 = r8.length;
        if (r14 >= r10) goto L_0x00a1;
    L_0x008a:
        r15 = new aini;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r13 = r8[r14];	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r10 = r15;
        r11 = r16;
        r12 = r14;
        r5 = r14;
        r4 = r15;
        r14 = r2;
        r10.<init>(r11, r12, r13, r14);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r9.add(r5, r4);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r14 = r5 + 1;
        r4 = 55735497; // 0x35274c9 float:6.1847516E-37 double:2.75369943E-316;
        goto L_0x0087;
    L_0x00a1:
        r2 = r9.size();
        r2 = new defpackage.aini[r2];
        r2 = r9.toArray(r2);
        r2 = (defpackage.aini[]) r2;
        r5 = new aing;
        r5.<init>(r2);
        goto L_0x00b4;
    L_0x00b3:
        r5 = 0;
    L_0x00b4:
        r0.h = r5;
        r3 = 0;
        goto L_0x0143;
    L_0x00b9:
        r2 = r0.u;
        r2 = r2.V();
        if (r8 == 0) goto L_0x013f;
    L_0x00c1:
        r4 = -1;
        r5 = "#";
        r4 = r8.split(r5, r4);
        r8 = r4[r6];
        r3 = r4[r3];
        r9 = 3;
        r9 = r4[r9];
        r10 = 4;
        r10 = r4[r10];
        r4 = r4[r7];
        r11 = java.lang.String.valueOf(r8);
        r11 = r11.length();
        r12 = java.lang.String.valueOf(r3);
        r12 = r12.length();
        r13 = java.lang.String.valueOf(r9);
        r13 = r13.length();
        r14 = java.lang.String.valueOf(r10);
        r14 = r14.length();
        r15 = java.lang.String.valueOf(r4);
        r15 = r15.length();
        r7 = new java.lang.StringBuilder;
        r11 = r11 + 10;
        r11 = r11 + r12;
        r11 = r11 + r13;
        r11 = r11 + r14;
        r11 = r11 + r15;
        r7.<init>(r11);
        r7.append(r8);
        r7.append(r5);
        r7.append(r3);
        r3 = "#0#";
        r7.append(r3);
        r7.append(r9);
        r7.append(r5);
        r7.append(r10);
        r3 = "#-1#";
        r7.append(r3);
        r7.append(r4);
        r7.append(r5);
        r3 = r7.toString();
        r4 = new ainl;
        r5 = "$N";
        r4.<init>(r5, r3, r2);
        r5 = new aing;
        r2 = new defpackage.aini[r6];
        r3 = 0;
        r2[r3] = r4;
        r5.<init>(r2);
        goto L_0x0141;
    L_0x013f:
        r3 = 0;
        r5 = 0;
    L_0x0141:
        r0.h = r5;
    L_0x0143:
        r2 = r1.b;
        r2 = r2.a;
        r2 = r2.k;
        if (r2 != 0) goto L_0x0150;
    L_0x014b:
        r5 = 55735497; // 0x35274c9 float:6.1847516E-37 double:2.75369943E-316;
    L_0x014e:
        r7 = 0;
        goto L_0x015d;
    L_0x0150:
        r4 = r2.a;
        r5 = 55735497; // 0x35274c9 float:6.1847516E-37 double:2.75369943E-316;
        if (r4 != r5) goto L_0x014e;
    L_0x0157:
        r4 = r2.b;
        r4 = (defpackage.awgq) r4;
        r7 = r4.c;
    L_0x015d:
        r0.i = r7;
        if (r2 != 0) goto L_0x0162;
    L_0x0161:
        goto L_0x016d;
    L_0x0162:
        r4 = r2.a;
        if (r4 != r5) goto L_0x016d;
    L_0x0166:
        r2 = r2.b;
        r2 = (defpackage.awgq) r2;
        r7 = r2.d;
        r3 = r7;
    L_0x016d:
        r0.m = r3;
        r0.y = r6;
        r1 = r1.e;
        r0.x = r1;
        return;
    L_0x0176:
        r17.b();
    L_0x0179:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimu.a(ahkn):void");
    }

    public final void a(ahkm ahkm) {
        if (this.h != null) {
            this.y = TextUtils.equals(this.x, ahkm.h);
        }
        if (a()) {
            this.r = ahkm.e - ahkm.a > 5000;
        }
    }

    public final void a(ahkr ahkr) {
        if (a()) {
            boolean c = ahkr.c();
            this.s = c;
            boolean z = false;
            if (!c && this.r) {
                z = true;
            }
            this.r = z;
        }
    }

    public final void a(aini aini, int i) {
        if (aini != null && i >= 0) {
            if ((this.r && !this.s) || this.t.k) {
                Uri b = aimu.b(aini, i);
                if (b != null) {
                    this.n.c(b, this.q);
                }
            }
        }
    }

    public static long a(aini aini, long j) {
        return (j << 32) | ((long) aini.g);
    }

    public static Uri b(aini aini, int i) {
        i = (int) Math.floor((double) (i / aini.c()));
        String str = null;
        if (i >= aini.a()) {
            return null;
        }
        if (i >= 0 && i < aini.a()) {
            str = (String) aini.h.get(i);
            if (str == null) {
                String replace = aini.f.replace("$N", aini.d);
                int i2 = aini.g;
                StringBuilder stringBuilder = new StringBuilder(11);
                stringBuilder.append(i2);
                replace = replace.replace("$L", stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder(11);
                stringBuilder2.append(i);
                xvo a = xvo.a(Uri.parse(replace.replace("$M", stringBuilder2.toString())));
                a.b("sigh", aini.e);
                str = a.a().toString();
                aini.h.put(i, str);
            }
        }
        return Uri.parse(str);
    }

    private final void b() {
        if (this.d != -1 || this.f != -1) {
            synchronized (this.j) {
                this.h = null;
                this.r = false;
                this.s = false;
                this.c.evictAll();
                this.e = null;
                this.g = null;
                this.d = -1;
                this.f = -1;
                this.k = false;
                this.l = false;
                this.x = null;
                this.y = false;
                a(this.g);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkm.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
            a((ahkm) obj);
            return null;
        } else if (i == 2) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
