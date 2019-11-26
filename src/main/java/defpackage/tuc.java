package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.health.SystemHealthManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tuc */
final class tuc extends ttj implements ttw, ttx, tzh {
    public final ual d;
    private volatile boolean e = false;
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final tzz h;
    private final boolean i;
    private final List j;

    tuc(udc udc, Application application, tzu tzu, tzu tzu2, SharedPreferences sharedPreferences, tzz tzz, boolean z) {
        super(udc, application, tzu, tzu2, 1);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.d = new ual(sharedPreferences);
        this.h = tzz;
        this.i = false;
        this.j = null;
    }

    public final void e() {
    }

    public final void f() {
        if (!this.g.get()) {
            a(null);
        }
        synchronized (this.f) {
            if (!this.e) {
                tty.a(this.a).a((ttp) this);
                this.e = true;
            }
        }
    }

    public final void a(Activity activity) {
        if (this.g.getAndSet(true)) {
            tyv.d("BatteryMetricService", "unexpected state onAppToForeground", new Object[0]);
            return;
        }
        a(bcab.BACKGROUND_TO_FOREGROUND);
    }

    public final void b(Activity activity) {
        if (this.g.getAndSet(false)) {
            a(bcab.FOREGROUND_TO_BACKGROUND);
            return;
        }
        tyv.d("BatteryMetricService", "unexpected state onAppToBackground", new Object[0]);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        synchronized (this.f) {
            if (this.e) {
                tty.a(this.a).b(this);
                this.e = false;
            }
        }
        synchronized (this.d) {
            this.d.a.a.edit().remove("primes.battery.snapshot").commit();
        }
    }

    /* Access modifiers changed, original: final */
    public final uao g() {
        uao uao;
        uia.b();
        synchronized (this.d) {
            udm udm = (udm) this.d.a.a("primes.battery.snapshot", udm.k.getParserForType());
            uao = null;
            if (udm != null) {
                bcab bcab;
                bcbb bcbb;
                if ((udm.a & 32) != 0) {
                    bcab a = bcab.a(udm.g);
                    if (a == null) {
                        a = bcab.UNKNOWN;
                    }
                    bcab = a;
                } else {
                    bcab = null;
                }
                bcat bcat = udm.b;
                if (bcat == null) {
                    bcat = bcat.an;
                }
                Long valueOf = (udm.a & 2) != 0 ? Long.valueOf(udm.c) : null;
                Long valueOf2 = (udm.a & 4) != 0 ? Long.valueOf(udm.d) : null;
                Long valueOf3 = (udm.a & 8) != 0 ? Long.valueOf(udm.e) : null;
                Long valueOf4 = (udm.a & 16) != 0 ? Long.valueOf(udm.f) : null;
                int i = udm.a;
                String str = (i & 64) != 0 ? udm.h : null;
                Boolean valueOf5 = (i & 128) != 0 ? Boolean.valueOf(udm.i) : null;
                if ((udm.a & 256) != 0) {
                    bcbb = udm.j;
                    if (bcbb == null) {
                        bcbb = bcbb.c;
                    }
                }
                uao = new uao(bcat, valueOf, valueOf2, valueOf3, valueOf4, bcab, str, valueOf5, bcbb);
            }
        }
        return uao;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(uao uao) {
        boolean a;
        uia.b();
        synchronized (this.d) {
            udm udm;
            long longValue;
            udm udm2;
            ual ual = this.d;
            udp udp = (udp) udm.k.createBuilder();
            bcat bcat = uao.a;
            if (bcat != null) {
                udp.copyOnWrite();
                udm = (udm) udp.instance;
                udm.b = bcat;
                udm.a |= 1;
            }
            Long l = uao.b;
            if (l != null) {
                longValue = l.longValue();
                udp.copyOnWrite();
                udm2 = (udm) udp.instance;
                udm2.a |= 2;
                udm2.c = longValue;
            }
            l = uao.c;
            if (l != null) {
                longValue = l.longValue();
                udp.copyOnWrite();
                udm2 = (udm) udp.instance;
                udm2.a |= 4;
                udm2.d = longValue;
            }
            l = uao.d;
            if (l != null) {
                longValue = l.longValue();
                udp.copyOnWrite();
                udm2 = (udm) udp.instance;
                udm2.a |= 8;
                udm2.e = longValue;
            }
            l = uao.e;
            if (l != null) {
                longValue = l.longValue();
                udp.copyOnWrite();
                udm2 = (udm) udp.instance;
                udm2.a |= 16;
                udm2.f = longValue;
            }
            bcab bcab = uao.f;
            if (bcab != null) {
                int i = bcab.d;
                udp.copyOnWrite();
                udm = (udm) udp.instance;
                udm.a |= 32;
                udm.g = i;
            }
            String str = uao.g;
            if (str != null) {
                udp.copyOnWrite();
                udm = (udm) udp.instance;
                udm.a |= 64;
                udm.h = str;
            }
            Boolean bool = uao.h;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                udp.copyOnWrite();
                udm = (udm) udp.instance;
                udm.a |= 128;
                udm.i = booleanValue;
            }
            bcbb bcbb = uao.i;
            if (bcbb != null) {
                udp.copyOnWrite();
                udm udm3 = (udm) udp.instance;
                udm3.j = bcbb;
                udm3.a |= 256;
            }
            a = ual.a.a("primes.battery.snapshot", (udm) ((anxl) udp.build()));
        }
        return a;
    }

    /* Access modifiers changed, original: final */
    public final uac a(bcab bcab, boolean z) {
        tzz tzz = this.h;
        SystemHealthManager systemHealthManager = (SystemHealthManager) tzz.a.a.getSystemService("systemhealth");
        return new uac(tzz, Long.valueOf(tzz.d.a()), Long.valueOf(tzz.c.a()), systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null, bcab, Boolean.valueOf(z), tzz.b.a());
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:640:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:640:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:20:0x0095, code skipped:
            if ((r9 / r11) <= 3.472222222222222E-5d) goto L_0x0097;
     */
    public final void a(defpackage.uao r20, defpackage.uao r21) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = 2;
        r4 = new defpackage.uao[r3];
        r5 = 0;
        r4[r5] = r1;
        r6 = 1;
        r4[r6] = r2;
        r7 = "BatteryMetricService";
        r8 = "log start: %s\nend: %s";
        defpackage.tyv.a(r7, r8, r4);
        r4 = r0.h;
        r7 = "BatteryCapture";
        if (r1 == 0) goto L_0x09b4;
    L_0x001c:
        if (r2 != 0) goto L_0x0020;
    L_0x001e:
        goto L_0x09b4;
    L_0x0020:
        r9 = r1.d;
        r10 = r2.d;
        r9 = java.util.Objects.equals(r9, r10);
        if (r9 == 0) goto L_0x09b4;
    L_0x002a:
        r9 = r1.e;
        r10 = r2.e;
        r9 = java.util.Objects.equals(r9, r10);
        if (r9 == 0) goto L_0x09b4;
    L_0x0034:
        r9 = r1.b;
        if (r9 == 0) goto L_0x09b4;
    L_0x0038:
        r9 = r1.c;
        if (r9 == 0) goto L_0x09b4;
    L_0x003c:
        r9 = r2.b;
        if (r9 == 0) goto L_0x09b4;
    L_0x0040:
        r10 = r2.c;
        if (r10 == 0) goto L_0x09b4;
    L_0x0044:
        r9 = defpackage.uhy.a(r9);
        r9 = (java.lang.Long) r9;
        r9 = r9.longValue();
        r11 = r1.b;
        r11 = defpackage.uhy.a(r11);
        r11 = (java.lang.Long) r11;
        r11 = r11.longValue();
        r9 = r9 - r11;
        r11 = r2.c;
        r11 = defpackage.uhy.a(r11);
        r11 = (java.lang.Long) r11;
        r11 = r11.longValue();
        r13 = r1.c;
        r13 = defpackage.uhy.a(r13);
        r13 = (java.lang.Long) r13;
        r13 = r13.longValue();
        r11 = r11 - r13;
        r13 = 0;
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 <= 0) goto L_0x09b4;
    L_0x007a:
        r9 = r9 - r11;
        r9 = java.lang.Math.abs(r9);
        r15 = 25;
        r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1));
        if (r17 < 0) goto L_0x0097;
    L_0x0085:
        r9 = (double) r9;
        r11 = (double) r11;
        java.lang.Double.isNaN(r9);
        java.lang.Double.isNaN(r11);
        r9 = r9 / r11;
        r11 = 4540248920338119903; // 0x3f023456789abcdf float:2.510764E34 double:3.472222222222222E-5;
        r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r15 > 0) goto L_0x09b4;
    L_0x0097:
        r4 = r4.a;
        r9 = r2.a;
        r10 = r1.a;
        if (r9 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00a2;
    L_0x00a0:
        if (r10 != 0) goto L_0x00a8;
    L_0x00a2:
        r17 = r4;
        r3 = r7;
        r8 = r9;
        goto L_0x079a;
    L_0x00a8:
        r11 = defpackage.bcat.an;
        r11 = r11.createBuilder();
        r11 = (defpackage.bcaw) r11;
        r12 = r9.a;
        r12 = r12 & r6;
        if (r12 == 0) goto L_0x00c5;
    L_0x00b5:
        r5 = r9.c;
        r17 = r4;
        r3 = r10.c;
        r5 = r5 - r3;
        r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1));
        if (r3 != 0) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00c7;
    L_0x00c1:
        r11.a(r5);
        goto L_0x00c7;
    L_0x00c5:
        r17 = r4;
    L_0x00c7:
        r3 = r9.a;
        r4 = 2;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x00da;
    L_0x00cd:
        r3 = r9.d;
        r5 = r10.d;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00da;
    L_0x00d7:
        r11.b(r3);
    L_0x00da:
        r3 = r9.a;
        r3 = r3 & 4;
        if (r3 == 0) goto L_0x00ed;
    L_0x00e0:
        r3 = r9.e;
        r5 = r10.e;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x00ed;
    L_0x00ea:
        r11.c(r3);
    L_0x00ed:
        r3 = r9.a;
        r3 = r3 & 8;
        if (r3 == 0) goto L_0x00ff;
    L_0x00f3:
        r3 = r9.f;
        r5 = r10.f;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 == 0) goto L_0x00ff;
    L_0x00fc:
        r11.d(r3);
    L_0x00ff:
        r3 = defpackage.uam.a;
        r4 = r9.g;
        r5 = r10.g;
        r3 = r3.a(r4, r5);
        r11.a(r3);
        r3 = defpackage.uam.a;
        r4 = r9.h;
        r5 = r10.h;
        r3 = r3.a(r4, r5);
        r11.b(r3);
        r3 = defpackage.uam.a;
        r4 = r9.i;
        r5 = r10.i;
        r3 = r3.a(r4, r5);
        r11.c(r3);
        r3 = defpackage.uam.a;
        r4 = r9.j;
        r5 = r10.j;
        r3 = r3.a(r4, r5);
        r11.d(r3);
        r3 = defpackage.uam.a;
        r4 = r9.k;
        r5 = r10.k;
        r3 = r3.a(r4, r5);
        r11.e(r3);
        r3 = defpackage.uam.a;
        r4 = r9.l;
        r5 = r10.l;
        r3 = r3.a(r4, r5);
        r11.f(r3);
        r3 = r9.a;
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x015a;
    L_0x0153:
        r3 = r9.m;
        if (r3 != 0) goto L_0x015b;
    L_0x0157:
        r3 = defpackage.bcar.e;
        goto L_0x015b;
    L_0x015a:
        r3 = 0;
    L_0x015b:
        r4 = r10.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x0168;
    L_0x0161:
        r4 = r10.m;
        if (r4 != 0) goto L_0x0169;
    L_0x0165:
        r4 = defpackage.bcar.e;
        goto L_0x0169;
    L_0x0168:
        r4 = 0;
    L_0x0169:
        r3 = defpackage.uag.a(r3, r4);
        if (r3 == 0) goto L_0x0172;
    L_0x016f:
        r11.a(r3);
    L_0x0172:
        r3 = defpackage.uam.a;
        r4 = r9.n;
        r5 = r10.n;
        r3 = r3.a(r4, r5);
        r11.g(r3);
        r3 = defpackage.uah.a;
        r4 = r9.p;
        r5 = r10.p;
        r3 = r3.a(r4, r5);
        r11.h(r3);
        r3 = defpackage.uai.a;
        r4 = r9.q;
        r5 = r10.q;
        r3 = r3.a(r4, r5);
        r11.i(r3);
        r3 = r9.a;
        r3 = r3 & 32;
        if (r3 == 0) goto L_0x01ac;
    L_0x019f:
        r3 = r9.r;
        r5 = r10.r;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01ac;
    L_0x01a9:
        r11.e(r3);
    L_0x01ac:
        r3 = r9.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x01bf;
    L_0x01b2:
        r3 = r9.s;
        r5 = r10.s;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x01bc;
    L_0x01bb:
        goto L_0x01bf;
    L_0x01bc:
        r11.f(r3);
    L_0x01bf:
        r3 = r9.a;
        r3 = r3 & 128;
        if (r3 == 0) goto L_0x01d2;
    L_0x01c5:
        r3 = r9.t;
        r5 = r10.t;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01d2;
    L_0x01cf:
        r11.g(r3);
    L_0x01d2:
        r3 = r9.a;
        r3 = r3 & 256;
        if (r3 == 0) goto L_0x01e5;
    L_0x01d8:
        r3 = r9.u;
        r5 = r10.u;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x01e2;
    L_0x01e1:
        goto L_0x01e5;
    L_0x01e2:
        r11.h(r3);
    L_0x01e5:
        r3 = r9.a;
        r3 = r3 & 512;
        if (r3 == 0) goto L_0x01f8;
    L_0x01eb:
        r3 = r9.v;
        r5 = r10.v;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x01f5;
    L_0x01f4:
        goto L_0x01f8;
    L_0x01f5:
        r11.i(r3);
    L_0x01f8:
        r3 = r9.a;
        r3 = r3 & 1024;
        if (r3 == 0) goto L_0x020b;
    L_0x01fe:
        r3 = r9.w;
        r5 = r10.w;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x0208;
    L_0x0207:
        goto L_0x020b;
    L_0x0208:
        r11.j(r3);
    L_0x020b:
        r3 = r9.a;
        r3 = r3 & 2048;
        if (r3 == 0) goto L_0x021e;
    L_0x0211:
        r3 = r9.x;
        r5 = r10.x;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x021b;
    L_0x021a:
        goto L_0x021e;
    L_0x021b:
        r11.k(r3);
    L_0x021e:
        r3 = r9.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x0231;
    L_0x0224:
        r3 = r9.y;
        r5 = r10.y;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x022e;
    L_0x022d:
        goto L_0x0231;
    L_0x022e:
        r11.l(r3);
    L_0x0231:
        r3 = r9.a;
        r3 = r3 & 8192;
        if (r3 == 0) goto L_0x0244;
    L_0x0237:
        r3 = r9.z;
        r5 = r10.z;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x0241;
    L_0x0240:
        goto L_0x0244;
    L_0x0241:
        r11.m(r3);
    L_0x0244:
        r3 = r9.a;
        r3 = r3 & 16384;
        if (r3 == 0) goto L_0x0257;
    L_0x024a:
        r3 = r9.A;
        r5 = r10.A;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x0254;
    L_0x0253:
        goto L_0x0257;
    L_0x0254:
        r11.n(r3);
    L_0x0257:
        r3 = r9.a;
        r4 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x026c;
    L_0x025f:
        r3 = r9.B;
        r5 = r10.B;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x0269;
    L_0x0268:
        goto L_0x026c;
    L_0x0269:
        r11.o(r3);
    L_0x026c:
        r3 = r9.a;
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0280;
    L_0x0273:
        r3 = r9.C;
        r5 = r10.C;
        r3 = r3 - r5;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x027d;
    L_0x027c:
        goto L_0x0280;
    L_0x027d:
        r11.p(r3);
    L_0x0280:
        r3 = r9.a;
        r4 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0299;
    L_0x0287:
        r5 = r9.D;
        r18 = r9;
        r8 = r10.D;
        r5 = r5 - r8;
        r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0295;
    L_0x0292:
        r5 = r18;
        goto L_0x029a;
    L_0x0295:
        r11.q(r5);
        goto L_0x0292;
    L_0x0299:
        r5 = r9;
    L_0x029a:
        r6 = r5.a;
        r8 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x02ae;
    L_0x02a1:
        r8 = r5.E;
        r3 = r10.E;
        r8 = r8 - r3;
        r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r3 != 0) goto L_0x02ab;
    L_0x02aa:
        goto L_0x02ae;
    L_0x02ab:
        r11.r(r8);
    L_0x02ae:
        r3 = r5.a;
        r4 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x02bc;
    L_0x02b5:
        r8 = r5.F;
        if (r8 != 0) goto L_0x02bd;
    L_0x02b9:
        r8 = defpackage.bcar.e;
        goto L_0x02bd;
    L_0x02bc:
        r8 = 0;
    L_0x02bd:
        r3 = r10.a;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x02c9;
    L_0x02c2:
        r3 = r10.F;
        if (r3 != 0) goto L_0x02ca;
    L_0x02c6:
        r3 = defpackage.bcar.e;
        goto L_0x02ca;
    L_0x02c9:
        r3 = 0;
    L_0x02ca:
        r3 = defpackage.uag.a(r8, r3);
        if (r3 == 0) goto L_0x02d3;
    L_0x02d0:
        r11.b(r3);
    L_0x02d3:
        r3 = r5.a;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x02e9;
    L_0x02da:
        r8 = r5.G;
        r3 = r7;
        r6 = r10.G;
        r8 = r8 - r6;
        r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1));
        if (r6 != 0) goto L_0x02e5;
    L_0x02e4:
        goto L_0x02ea;
    L_0x02e5:
        r11.s(r8);
        goto L_0x02ea;
    L_0x02e9:
        r3 = r7;
    L_0x02ea:
        r6 = r5.a;
        r7 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x02f8;
    L_0x02f1:
        r8 = r5.H;
        if (r8 != 0) goto L_0x02f9;
    L_0x02f5:
        r8 = defpackage.bcar.e;
        goto L_0x02f9;
    L_0x02f8:
        r8 = 0;
    L_0x02f9:
        r6 = r10.a;
        r7 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0307;
    L_0x0300:
        r6 = r10.H;
        if (r6 != 0) goto L_0x0308;
    L_0x0304:
        r6 = defpackage.bcar.e;
        goto L_0x0308;
    L_0x0307:
        r6 = 0;
    L_0x0308:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0311;
    L_0x030e:
        r11.c(r6);
    L_0x0311:
        r6 = r5.a;
        r7 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x031f;
    L_0x0318:
        r8 = r5.I;
        if (r8 != 0) goto L_0x0320;
    L_0x031c:
        r8 = defpackage.bcar.e;
        goto L_0x0320;
    L_0x031f:
        r8 = 0;
    L_0x0320:
        r6 = r10.a;
        r7 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x032e;
    L_0x0327:
        r6 = r10.I;
        if (r6 != 0) goto L_0x032f;
    L_0x032b:
        r6 = defpackage.bcar.e;
        goto L_0x032f;
    L_0x032e:
        r6 = 0;
    L_0x032f:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0338;
    L_0x0335:
        r11.d(r6);
    L_0x0338:
        r6 = r5.a;
        r7 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0346;
    L_0x033f:
        r8 = r5.J;
        if (r8 != 0) goto L_0x0347;
    L_0x0343:
        r8 = defpackage.bcar.e;
        goto L_0x0347;
    L_0x0346:
        r8 = 0;
    L_0x0347:
        r6 = r10.a;
        r7 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0355;
    L_0x034e:
        r6 = r10.J;
        if (r6 != 0) goto L_0x0356;
    L_0x0352:
        r6 = defpackage.bcar.e;
        goto L_0x0356;
    L_0x0355:
        r6 = 0;
    L_0x0356:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x035f;
    L_0x035c:
        r11.e(r6);
    L_0x035f:
        r6 = r5.a;
        r7 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x036d;
    L_0x0366:
        r8 = r5.K;
        if (r8 != 0) goto L_0x036e;
    L_0x036a:
        r8 = defpackage.bcar.e;
        goto L_0x036e;
    L_0x036d:
        r8 = 0;
    L_0x036e:
        r6 = r10.a;
        r7 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x037c;
    L_0x0375:
        r6 = r10.K;
        if (r6 != 0) goto L_0x037d;
    L_0x0379:
        r6 = defpackage.bcar.e;
        goto L_0x037d;
    L_0x037c:
        r6 = 0;
    L_0x037d:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0386;
    L_0x0383:
        r11.f(r6);
    L_0x0386:
        r6 = r5.a;
        r7 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0394;
    L_0x038d:
        r8 = r5.L;
        if (r8 != 0) goto L_0x0395;
    L_0x0391:
        r8 = defpackage.bcar.e;
        goto L_0x0395;
    L_0x0394:
        r8 = 0;
    L_0x0395:
        r6 = r10.a;
        r7 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x03a3;
    L_0x039c:
        r6 = r10.L;
        if (r6 != 0) goto L_0x03a4;
    L_0x03a0:
        r6 = defpackage.bcar.e;
        goto L_0x03a4;
    L_0x03a3:
        r6 = 0;
    L_0x03a4:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x03ad;
    L_0x03aa:
        r11.g(r6);
    L_0x03ad:
        r6 = r5.a;
        r7 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x03bb;
    L_0x03b4:
        r8 = r5.M;
        if (r8 != 0) goto L_0x03bc;
    L_0x03b8:
        r8 = defpackage.bcar.e;
        goto L_0x03bc;
    L_0x03bb:
        r8 = 0;
    L_0x03bc:
        r6 = r10.a;
        r7 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x03ca;
    L_0x03c3:
        r6 = r10.M;
        if (r6 != 0) goto L_0x03cb;
    L_0x03c7:
        r6 = defpackage.bcar.e;
        goto L_0x03cb;
    L_0x03ca:
        r6 = 0;
    L_0x03cb:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x03d4;
    L_0x03d1:
        r11.h(r6);
    L_0x03d4:
        r6 = r5.a;
        r7 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x03e2;
    L_0x03db:
        r8 = r5.N;
        if (r8 != 0) goto L_0x03e3;
    L_0x03df:
        r8 = defpackage.bcar.e;
        goto L_0x03e3;
    L_0x03e2:
        r8 = 0;
    L_0x03e3:
        r6 = r10.a;
        r7 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x03f1;
    L_0x03ea:
        r6 = r10.N;
        if (r6 != 0) goto L_0x03f2;
    L_0x03ee:
        r6 = defpackage.bcar.e;
        goto L_0x03f2;
    L_0x03f1:
        r6 = 0;
    L_0x03f2:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x03fb;
    L_0x03f8:
        r11.i(r6);
    L_0x03fb:
        r6 = r5.a;
        r7 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0409;
    L_0x0402:
        r8 = r5.O;
        if (r8 != 0) goto L_0x040a;
    L_0x0406:
        r8 = defpackage.bcar.e;
        goto L_0x040a;
    L_0x0409:
        r8 = 0;
    L_0x040a:
        r6 = r10.a;
        r7 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0418;
    L_0x0411:
        r6 = r10.O;
        if (r6 != 0) goto L_0x0419;
    L_0x0415:
        r6 = defpackage.bcar.e;
        goto L_0x0419;
    L_0x0418:
        r6 = 0;
    L_0x0419:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0422;
    L_0x041f:
        r11.j(r6);
    L_0x0422:
        r6 = r5.a;
        r7 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0430;
    L_0x0429:
        r8 = r5.P;
        if (r8 != 0) goto L_0x0431;
    L_0x042d:
        r8 = defpackage.bcar.e;
        goto L_0x0431;
    L_0x0430:
        r8 = 0;
    L_0x0431:
        r6 = r10.a;
        r7 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x043f;
    L_0x0438:
        r6 = r10.P;
        if (r6 != 0) goto L_0x0440;
    L_0x043c:
        r6 = defpackage.bcar.e;
        goto L_0x0440;
    L_0x043f:
        r6 = 0;
    L_0x0440:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0449;
    L_0x0446:
        r11.k(r6);
    L_0x0449:
        r6 = r5.a;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0457;
    L_0x0450:
        r8 = r5.Q;
        if (r8 != 0) goto L_0x0458;
    L_0x0454:
        r8 = defpackage.bcar.e;
        goto L_0x0458;
    L_0x0457:
        r8 = 0;
    L_0x0458:
        r6 = r10.a;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0466;
    L_0x045f:
        r6 = r10.Q;
        if (r6 != 0) goto L_0x0467;
    L_0x0463:
        r6 = defpackage.bcar.e;
        goto L_0x0467;
    L_0x0466:
        r6 = 0;
    L_0x0467:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0470;
    L_0x046d:
        r11.l(r6);
    L_0x0470:
        r6 = r5.a;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x047e;
    L_0x0477:
        r8 = r5.R;
        if (r8 != 0) goto L_0x047f;
    L_0x047b:
        r8 = defpackage.bcar.e;
        goto L_0x047f;
    L_0x047e:
        r8 = 0;
    L_0x047f:
        r6 = r10.a;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x048d;
    L_0x0486:
        r6 = r10.R;
        if (r6 != 0) goto L_0x048e;
    L_0x048a:
        r6 = defpackage.bcar.e;
        goto L_0x048e;
    L_0x048d:
        r6 = 0;
    L_0x048e:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0497;
    L_0x0494:
        r11.m(r6);
    L_0x0497:
        r6 = r5.b;
        r7 = 1;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x04a4;
    L_0x049d:
        r8 = r5.S;
        if (r8 != 0) goto L_0x04a5;
    L_0x04a1:
        r8 = defpackage.bcar.e;
        goto L_0x04a5;
    L_0x04a4:
        r8 = 0;
    L_0x04a5:
        r6 = r10.b;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x04b1;
    L_0x04aa:
        r6 = r10.S;
        if (r6 != 0) goto L_0x04b2;
    L_0x04ae:
        r6 = defpackage.bcar.e;
        goto L_0x04b2;
    L_0x04b1:
        r6 = 0;
    L_0x04b2:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x04bb;
    L_0x04b8:
        r11.n(r6);
    L_0x04bb:
        r6 = r5.b;
        r7 = 2;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x04c8;
    L_0x04c1:
        r8 = r5.T;
        if (r8 != 0) goto L_0x04c9;
    L_0x04c5:
        r8 = defpackage.bcar.e;
        goto L_0x04c9;
    L_0x04c8:
        r8 = 0;
    L_0x04c9:
        r6 = r10.b;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x04d5;
    L_0x04ce:
        r6 = r10.T;
        if (r6 != 0) goto L_0x04d6;
    L_0x04d2:
        r6 = defpackage.bcar.e;
        goto L_0x04d6;
    L_0x04d5:
        r6 = 0;
    L_0x04d6:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x04df;
    L_0x04dc:
        r11.o(r6);
    L_0x04df:
        r6 = r5.b;
        r6 = r6 & 4;
        if (r6 == 0) goto L_0x04f2;
    L_0x04e5:
        r6 = r5.U;
        r8 = r10.U;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x04ef;
    L_0x04ee:
        goto L_0x04f2;
    L_0x04ef:
        r11.t(r6);
    L_0x04f2:
        r6 = r5.b;
        r6 = r6 & 8;
        if (r6 == 0) goto L_0x0505;
    L_0x04f8:
        r6 = r5.V;
        r8 = r10.V;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0502;
    L_0x0501:
        goto L_0x0505;
    L_0x0502:
        r11.u(r6);
    L_0x0505:
        r6 = r5.b;
        r6 = r6 & 16;
        if (r6 == 0) goto L_0x0518;
    L_0x050b:
        r6 = r5.W;
        r8 = r10.W;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0515;
    L_0x0514:
        goto L_0x0518;
    L_0x0515:
        r11.v(r6);
    L_0x0518:
        r6 = r5.b;
        r6 = r6 & 32;
        if (r6 == 0) goto L_0x052b;
    L_0x051e:
        r6 = r5.X;
        r8 = r10.X;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0528;
    L_0x0527:
        goto L_0x052b;
    L_0x0528:
        r11.w(r6);
    L_0x052b:
        r6 = r5.b;
        r6 = r6 & 64;
        if (r6 == 0) goto L_0x053e;
    L_0x0531:
        r6 = r5.Y;
        r8 = r10.Y;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x053b;
    L_0x053a:
        goto L_0x053e;
    L_0x053b:
        r11.x(r6);
    L_0x053e:
        r6 = r5.b;
        r6 = r6 & 128;
        if (r6 == 0) goto L_0x0551;
    L_0x0544:
        r6 = r5.Z;
        r8 = r10.Z;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x054e;
    L_0x054d:
        goto L_0x0551;
    L_0x054e:
        r11.y(r6);
    L_0x0551:
        r6 = r5.b;
        r6 = r6 & 256;
        if (r6 == 0) goto L_0x0564;
    L_0x0557:
        r6 = r5.aa;
        r8 = r10.aa;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0561;
    L_0x0560:
        goto L_0x0564;
    L_0x0561:
        r11.z(r6);
    L_0x0564:
        r6 = r5.b;
        r6 = r6 & 512;
        if (r6 == 0) goto L_0x0577;
    L_0x056a:
        r6 = r5.ab;
        r8 = r10.ab;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0574;
    L_0x0573:
        goto L_0x0577;
    L_0x0574:
        r11.A(r6);
    L_0x0577:
        r6 = r5.b;
        r6 = r6 & 1024;
        if (r6 == 0) goto L_0x058a;
    L_0x057d:
        r6 = r5.ac;
        r8 = r10.ac;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0587;
    L_0x0586:
        goto L_0x058a;
    L_0x0587:
        r11.B(r6);
    L_0x058a:
        r6 = r5.b;
        r6 = r6 & 2048;
        if (r6 == 0) goto L_0x059d;
    L_0x0590:
        r6 = r5.ad;
        r8 = r10.ad;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x059a;
    L_0x0599:
        goto L_0x059d;
    L_0x059a:
        r11.C(r6);
    L_0x059d:
        r6 = r5.b;
        r6 = r6 & 4096;
        if (r6 == 0) goto L_0x05b0;
    L_0x05a3:
        r6 = r5.ae;
        r8 = r10.ae;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x05ad;
    L_0x05ac:
        goto L_0x05b0;
    L_0x05ad:
        r11.D(r6);
    L_0x05b0:
        r6 = r5.b;
        r6 = r6 & 8192;
        if (r6 == 0) goto L_0x05c3;
    L_0x05b6:
        r6 = r5.af;
        r8 = r10.af;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x05c0;
    L_0x05bf:
        goto L_0x05c3;
    L_0x05c0:
        r11.E(r6);
    L_0x05c3:
        r6 = r5.b;
        r6 = r6 & 16384;
        if (r6 == 0) goto L_0x05d6;
    L_0x05c9:
        r6 = r5.ag;
        r8 = r10.ag;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x05d3;
    L_0x05d2:
        goto L_0x05d6;
    L_0x05d3:
        r11.F(r6);
    L_0x05d6:
        r6 = r5.b;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x05eb;
    L_0x05de:
        r6 = r5.ah;
        r8 = r10.ah;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x05e8;
    L_0x05e7:
        goto L_0x05eb;
    L_0x05e8:
        r11.G(r6);
    L_0x05eb:
        r6 = r5.b;
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x05ff;
    L_0x05f2:
        r6 = r5.ai;
        r8 = r10.ai;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x05fc;
    L_0x05fb:
        goto L_0x05ff;
    L_0x05fc:
        r11.H(r6);
    L_0x05ff:
        r6 = r5.b;
        r7 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x060d;
    L_0x0606:
        r8 = r5.aj;
        if (r8 != 0) goto L_0x060e;
    L_0x060a:
        r8 = defpackage.bcar.e;
        goto L_0x060e;
    L_0x060d:
        r8 = 0;
    L_0x060e:
        r6 = r10.b;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x061a;
    L_0x0613:
        r6 = r10.aj;
        if (r6 != 0) goto L_0x061b;
    L_0x0617:
        r6 = defpackage.bcar.e;
        goto L_0x061b;
    L_0x061a:
        r6 = 0;
    L_0x061b:
        r6 = defpackage.uag.a(r8, r6);
        if (r6 == 0) goto L_0x0624;
    L_0x0621:
        r11.p(r6);
    L_0x0624:
        r6 = r5.b;
        r7 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x0638;
    L_0x062b:
        r6 = r5.ak;
        r8 = r10.ak;
        r6 = r6 - r8;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 != 0) goto L_0x0635;
    L_0x0634:
        goto L_0x0638;
    L_0x0635:
        r11.I(r6);
    L_0x0638:
        r6 = r5.b;
        r4 = r4 & r6;
        if (r4 == 0) goto L_0x064a;
    L_0x063d:
        r6 = r5.al;
        r8 = r10.al;
        r6 = r6 - r8;
        r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r4 != 0) goto L_0x0647;
    L_0x0646:
        goto L_0x064a;
    L_0x0647:
        r11.J(r6);
    L_0x064a:
        r4 = r5.b;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 & r6;
        if (r4 == 0) goto L_0x065e;
    L_0x0651:
        r4 = r5.am;
        r6 = r10.am;
        r4 = r4 - r6;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 != 0) goto L_0x065b;
    L_0x065a:
        goto L_0x065e;
    L_0x065b:
        r11.K(r4);
    L_0x065e:
        r4 = r11.build();
        r4 = (defpackage.anxl) r4;
        r8 = r4;
        r8 = (defpackage.bcat) r8;
        if (r8 != 0) goto L_0x066c;
    L_0x0669:
        r8 = 0;
        goto L_0x079a;
    L_0x066c:
        r4 = r8.c;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0672:
        r4 = r8.d;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0678:
        r4 = r8.e;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x067e:
        r4 = r8.f;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0684:
        r4 = r8.g;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x068c:
        r4 = r8.h;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x0694:
        r4 = r8.i;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x069c:
        r4 = r8.j;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06a4:
        r4 = r8.k;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06ac:
        r4 = r8.l;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06b4:
        r4 = r8.n;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06bc:
        r4 = r8.o;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06c4:
        r4 = r8.p;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06cc:
        r4 = r8.q;
        r4 = r4.size();
        if (r4 != 0) goto L_0x079a;
    L_0x06d4:
        r4 = r8.r;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06da:
        r4 = r8.s;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06e0:
        r4 = r8.t;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06e6:
        r4 = r8.u;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06ec:
        r4 = r8.v;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06f2:
        r4 = r8.w;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06f8:
        r4 = r8.x;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x06fe:
        r4 = r8.y;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0704:
        r4 = r8.z;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x070a:
        r4 = r8.A;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0710:
        r4 = r8.B;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0716:
        r4 = r8.C;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x071c:
        r4 = r8.D;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0722:
        r4 = r8.E;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0728:
        r4 = r8.G;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x072e:
        r4 = r8.U;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0734:
        r4 = r8.V;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x073a:
        r4 = r8.W;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0740:
        r4 = r8.X;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0746:
        r4 = r8.Y;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x074c:
        r4 = r8.Z;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0752:
        r4 = r8.aa;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0758:
        r4 = r8.ab;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x075e:
        r4 = r8.ac;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0764:
        r4 = r8.ad;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x076a:
        r4 = r8.ae;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0770:
        r4 = r8.af;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0776:
        r4 = r8.ag;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x077c:
        r4 = r8.ah;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0782:
        r4 = r8.ai;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0788:
        r4 = r8.ak;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x078e:
        r4 = r8.al;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 > 0) goto L_0x079a;
    L_0x0794:
        r4 = r8.am;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 <= 0) goto L_0x0669;
    L_0x079a:
        if (r8 == 0) goto L_0x085a;
    L_0x079c:
        r4 = r8.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.bcaw) r4;
        r5 = r17;
        r5 = r5.b;
        r4.a();
        r6 = 0;
    L_0x07ac:
        r7 = r4.b();
        if (r6 >= r7) goto L_0x07c0;
    L_0x07b2:
        r7 = r4.a(r6);
        r7 = r5.a(r7);
        r4.a(r6, r7);
        r6 = r6 + 1;
        goto L_0x07ac;
    L_0x07c0:
        r4.c();
        r6 = 0;
    L_0x07c4:
        r7 = r4.d();
        if (r6 >= r7) goto L_0x07d8;
    L_0x07ca:
        r7 = r4.b(r6);
        r7 = r5.a(r7);
        r4.b(r6, r7);
        r6 = r6 + 1;
        goto L_0x07c4;
    L_0x07d8:
        r4.e();
        r6 = 0;
    L_0x07dc:
        r7 = r4.f();
        if (r6 >= r7) goto L_0x07f0;
    L_0x07e2:
        r7 = r4.c(r6);
        r7 = r5.a(r7);
        r4.c(r6, r7);
        r6 = r6 + 1;
        goto L_0x07dc;
    L_0x07f0:
        r4.g();
        r6 = 0;
    L_0x07f4:
        r7 = r4.h();
        if (r6 >= r7) goto L_0x0808;
    L_0x07fa:
        r7 = r4.d(r6);
        r7 = r5.a(r7);
        r4.d(r6, r7);
        r6 = r6 + 1;
        goto L_0x07f4;
    L_0x0808:
        r4.i();
        r6 = 0;
    L_0x080c:
        r7 = r4.j();
        if (r6 >= r7) goto L_0x0820;
    L_0x0812:
        r7 = r4.e(r6);
        r7 = r5.a(r7);
        r4.e(r6, r7);
        r6 = r6 + 1;
        goto L_0x080c;
    L_0x0820:
        r4.k();
        r6 = 0;
    L_0x0824:
        r7 = r4.l();
        if (r6 >= r7) goto L_0x0838;
    L_0x082a:
        r7 = r4.f(r6);
        r7 = r5.a(r7);
        r4.f(r6, r7);
        r6 = r6 + 1;
        goto L_0x0824;
    L_0x0838:
        r4.m();
        r6 = 0;
    L_0x083c:
        r7 = r4.n();
        if (r6 >= r7) goto L_0x0850;
    L_0x0842:
        r7 = r4.g(r6);
        r7 = r5.a(r7);
        r4.g(r6, r7);
        r6 = r6 + 1;
        goto L_0x083c;
    L_0x0850:
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r8 = r4;
        r8 = (defpackage.bcat) r8;
        goto L_0x085b;
    L_0x085a:
        r8 = 0;
    L_0x085b:
        if (r8 != 0) goto L_0x0867;
    L_0x085d:
        r4 = 0;
        r1 = new java.lang.Object[r4];
        r4 = "null diff";
        defpackage.tyv.b(r3, r4, r1);
        goto L_0x09bd;
    L_0x0867:
        r4 = r8.a;
        r5 = 1;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x09ab;
    L_0x086d:
        r4 = r8.c;
        r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r6 <= 0) goto L_0x09ab;
    L_0x0873:
        r3 = defpackage.bbzz.k;
        r3 = r3.createBuilder();
        r3 = (defpackage.bcac) r3;
        r4 = r2.b;
        r4 = defpackage.uhy.a(r4);
        r4 = (java.lang.Long) r4;
        r4 = r4.longValue();
        r6 = r1.b;
        r6 = defpackage.uhy.a(r6);
        r6 = (java.lang.Long) r6;
        r6 = r6.longValue();
        r3.copyOnWrite();
        r9 = r3.instance;
        r9 = (defpackage.bbzz) r9;
        r10 = r9.a;
        r10 = r10 | 64;
        r9.a = r10;
        r4 = r4 - r6;
        r9.h = r4;
        r4 = r1.f;
        if (r4 != 0) goto L_0x08a8;
    L_0x08a7:
        goto L_0x08c1;
    L_0x08a8:
        r4 = defpackage.uhy.a(r4);
        r4 = (defpackage.bcab) r4;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bbzz) r5;
        if (r4 == 0) goto L_0x09a5;
    L_0x08b7:
        r6 = r5.a;
        r7 = 1;
        r6 = r6 | r7;
        r5.a = r6;
        r4 = r4.d;
        r5.b = r4;
    L_0x08c1:
        r4 = r1.g;
        if (r4 == 0) goto L_0x0913;
    L_0x08c5:
        r4 = r1.h;
        r4 = defpackage.uhy.a(r4);
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x08f3;
    L_0x08d3:
        r4 = r1.g;
        r4 = defpackage.uhy.a(r4);
        r4 = (java.lang.String) r4;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bbzz) r5;
        if (r4 == 0) goto L_0x08ed;
    L_0x08e4:
        r6 = r5.a;
        r6 = r6 | 8;
        r5.a = r6;
        r5.e = r4;
        goto L_0x0913;
    L_0x08ed:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x08f3:
        r4 = r1.g;
        r4 = defpackage.uhy.a(r4);
        r4 = (java.lang.String) r4;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bbzz) r5;
        if (r4 == 0) goto L_0x090d;
    L_0x0904:
        r6 = r5.a;
        r6 = r6 | 4;
        r5.a = r6;
        r5.d = r4;
        goto L_0x0913;
    L_0x090d:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x0913:
        r1 = r1.i;
        if (r1 != 0) goto L_0x0918;
    L_0x0917:
        goto L_0x092f;
    L_0x0918:
        r1 = defpackage.uhy.a(r1);
        r1 = (defpackage.bcbb) r1;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.bbzz) r4;
        if (r1 == 0) goto L_0x099f;
    L_0x0927:
        r4.f = r1;
        r1 = r4.a;
        r1 = r1 | 16;
        r4.a = r1;
    L_0x092f:
        r1 = r2.f;
        if (r1 != 0) goto L_0x0934;
    L_0x0933:
        goto L_0x094d;
    L_0x0934:
        r1 = defpackage.uhy.a(r1);
        r1 = (defpackage.bcab) r1;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.bbzz) r4;
        if (r1 == 0) goto L_0x0999;
    L_0x0943:
        r5 = r4.a;
        r5 = r5 | 32;
        r4.a = r5;
        r1 = r1.d;
        r4.g = r1;
    L_0x094d:
        r1 = r2.b;
        if (r1 == 0) goto L_0x096a;
    L_0x0951:
        r1 = defpackage.uhy.a(r1);
        r1 = (java.lang.Long) r1;
        r4 = r1.longValue();
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.bbzz) r1;
        r6 = r1.a;
        r6 = r6 | 256;
        r1.a = r6;
        r1.j = r4;
    L_0x096a:
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.bbzz) r1;
        r1.i = r8;
        r4 = r1.a;
        r4 = r4 | 128;
        r1.a = r4;
        r1 = defpackage.bcfe.x;
        r1 = r1.createBuilder();
        r1 = (defpackage.bcfd) r1;
        r4 = defpackage.bcad.c;
        r4 = r4.createBuilder();
        r4 = (defpackage.bcag) r4;
        r4.a(r3);
        r1.a(r4);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r8 = r1;
        r8 = (defpackage.bcfe) r8;
        goto L_0x09be;
    L_0x0999:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x099f:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x09a5:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x09ab:
        r1 = 0;
        r1 = new java.lang.Object[r1];
        r4 = "invalid realtime";
        defpackage.tyv.b(r3, r4, r1);
        goto L_0x09bd;
    L_0x09b4:
        r3 = r7;
        r1 = 0;
        r1 = new java.lang.Object[r1];
        r4 = "inconsistent stats";
        defpackage.tyv.b(r3, r4, r1);
    L_0x09bd:
        r8 = 0;
    L_0x09be:
        if (r8 == 0) goto L_0x09cd;
    L_0x09c0:
        r1 = r2.g;
        r3 = r2.h;
        r3 = r3.booleanValue();
        r2 = r2.i;
        r0.a(r1, r3, r8, r2);
    L_0x09cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuc.a(uao, uao):void");
    }

    private final Future a(bcab bcab) {
        if (!this.i) {
            return c().submit(new tuj(this, bcab));
        }
        Future submit = c().submit(new tuh(this, bcab));
        tyv.b("BatteryMetricService", "adding future BatteryCapture", new Object[0]);
        synchronized (this.j) {
            this.j.add(submit);
            if (this.g.get()) {
                return submit;
            }
            ArrayList arrayList;
            synchronized (this.j) {
                arrayList = new ArrayList(this.j);
                this.j.clear();
            }
            tyv.c("BatteryMetricService", "Logging captures: %d", Integer.valueOf(arrayList.size()));
            submit = c().submit(new tug(this, arrayList));
            return submit;
        }
    }
}
