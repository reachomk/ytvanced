package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: fmx */
public final class fmx implements wev {
    public final aaas a;
    public final SharedPreferences b;
    public final xsc c;
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final ReferenceQueue f = new ReferenceQueue();
    private final albv g;

    public fmx(albv albv, aaas aaas, SharedPreferences sharedPreferences, xsc xsc) {
        this.g = (albv) amqw.a((Object) albv);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = (xsc) amqw.a((Object) xsc);
    }

    public final void a(aruh aruh, View view, Object obj, acvx acvx) {
        a(aruh, view, obj, acvx, null);
    }

    public final void a(aruh aruh, View view, Object obj, acvx acvx, albc albc) {
        a(aruh, view, obj, acvx, albc, false);
    }

    public final void a(aruh aruh, View view, Object obj, acvx acvx, albc albc, boolean z) {
        aruh aruh2 = aruh;
        a();
        if (view != null) {
            if (aruh2 != null) {
                this.e.put(aruh2.b, new fmy(this, aruh, view, acvx, albc));
            }
            if (aruh2 != null) {
                aruj aruj;
                long j;
                if ((aruh2.a & 64) != 0) {
                    artx artx = aruh2.h;
                    if (artx == null) {
                        artx = artx.c;
                    }
                    int a = artz.a(artx.b);
                    if (a != 0 && a == 3) {
                        return;
                    }
                }
                long j2;
                if ((aruh2.a & 16) != 0) {
                    aruj = aruh2.f;
                    if (aruj == null) {
                        aruj = aruj.d;
                    }
                    j2 = aruj.c;
                } else {
                    j2 = 0;
                }
                if ((aruh2.a & 16) != 0) {
                    aruj = aruh2.f;
                    if (aruj == null) {
                        aruj = aruj.d;
                    }
                    j = aruj.b;
                } else {
                    j = 0;
                }
                boolean a2 = fpc.a(this.b, fmx.b(aruh), TimeUnit.SECONDS.toMillis(j), this.c.a());
                if (!this.d.contains(new Pair(aruh2, obj)) && a2 && this.b.getLong(fmx.a(aruh), 0) < j2) {
                    a(aruh, view, obj, acvx, albc, false, z);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    public final void a(defpackage.aruh r12, android.view.View r13, java.lang.Object r14, defpackage.acvx r15, defpackage.albc r16, boolean r17, boolean r18) {
        /*
        r11 = this;
        r7 = r11;
        r8 = r12;
        r9 = r7.g;
        r10 = new fmw;
        r0 = r10;
        r1 = r11;
        r2 = r16;
        r3 = r12;
        r4 = r14;
        r5 = r15;
        r6 = r17;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r0 = r7.g;
        r0 = r0.a();
        r1 = r13;
        r0 = r0.a(r13);
        r1 = r8.g;
        if (r1 != 0) goto L_0x0023;
    L_0x0021:
        r1 = defpackage.arul.c;
    L_0x0023:
        r2 = 3;
        r3 = 4;
        r4 = 1;
        r5 = 2;
        if (r1 == 0) goto L_0x0046;
    L_0x0029:
        r1 = r1.b;
        r1 = defpackage.arun.a(r1);
        if (r1 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0033;
    L_0x0032:
        r1 = 1;
    L_0x0033:
        r1 = r1 + -1;
        if (r1 == r5) goto L_0x0044;
    L_0x0037:
        if (r1 == r2) goto L_0x0040;
    L_0x0039:
        if (r1 == r3) goto L_0x003c;
    L_0x003b:
        goto L_0x0046;
    L_0x003c:
        if (r18 == 0) goto L_0x0044;
    L_0x003e:
        r1 = 4;
        goto L_0x0047;
    L_0x0040:
        if (r18 == 0) goto L_0x0044;
    L_0x0042:
        r1 = 3;
        goto L_0x0047;
    L_0x0044:
        r1 = 2;
        goto L_0x0047;
    L_0x0046:
        r1 = 1;
    L_0x0047:
        r0 = r0.e(r1);
        r0 = r0.d(r5);
        r0 = r0.a(r10);
        r1 = r8.a;
        r1 = r1 & r3;
        if (r1 == 0) goto L_0x0069;
    L_0x0058:
        r1 = r8.d;
        if (r1 != 0) goto L_0x005e;
    L_0x005c:
        r1 = defpackage.arud.c;
    L_0x005e:
        r1 = r1.b;
        r1 = defpackage.aruf.a(r1);
        if (r1 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x006a;
    L_0x0067:
        r1 = 1;
        goto L_0x006a;
    L_0x0069:
        r1 = 2;
    L_0x006a:
        if (r1 != r2) goto L_0x006e;
    L_0x006c:
        r2 = 0;
        goto L_0x006f;
    L_0x006e:
        r2 = 1;
    L_0x006f:
        r0.g(r2);
        if (r1 == r5) goto L_0x0078;
    L_0x0074:
        r1 = r8.e;
        r2 = (int) r1;
        goto L_0x0079;
    L_0x0078:
        r2 = -2;
    L_0x0079:
        r0.c(r2);
        r1 = r8.a;
        r1 = r1 & r5;
        r2 = 0;
        if (r1 == 0) goto L_0x0097;
    L_0x0082:
        r1 = r8.c;
        if (r1 != 0) goto L_0x0088;
    L_0x0086:
        r1 = defpackage.arub.c;
    L_0x0088:
        r6 = r1.a;
        r8 = 106514900; // 0x65949d4 float:4.0867404E-35 double:5.2625353E-316;
        if (r6 != r8) goto L_0x0094;
    L_0x008f:
        r1 = r1.b;
        r1 = (defpackage.artp) r1;
        goto L_0x0098;
    L_0x0094:
        r1 = defpackage.artp.i;
        goto L_0x0098;
    L_0x0097:
        r1 = r2;
    L_0x0098:
        if (r1 == 0) goto L_0x011d;
    L_0x009a:
        r6 = r1.b;
        r4 = r4 ^ r6;
        r4 = r0.d(r4);
        r4 = (defpackage.albx) r4;
        r6 = r1.a;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x00af;
    L_0x00a8:
        r5 = r1.c;
        if (r5 != 0) goto L_0x00b0;
    L_0x00ac:
        r5 = defpackage.arml.f;
        goto L_0x00b0;
    L_0x00af:
        r5 = r2;
    L_0x00b0:
        r5 = defpackage.ajqy.a(r5);
        r4 = r4.d(r5);
        r5 = r1.a;
        r3 = r3 & r5;
        if (r3 == 0) goto L_0x00c4;
    L_0x00bd:
        r3 = r1.d;
        if (r3 != 0) goto L_0x00c5;
    L_0x00c1:
        r3 = defpackage.arml.f;
        goto L_0x00c5;
    L_0x00c4:
        r3 = r2;
    L_0x00c5:
        r3 = defpackage.ajqy.a(r3);
        r3 = r4.c(r3);
        r4 = r1.a;
        r4 = r4 & 512;
        r5 = 47244396; // 0x2d0e46c float:3.069396E-37 double:2.3341833E-316;
        if (r4 == 0) goto L_0x00e8;
    L_0x00d6:
        r4 = r1.h;
        if (r4 != 0) goto L_0x00dc;
    L_0x00da:
        r4 = defpackage.arto.c;
    L_0x00dc:
        r6 = r4.a;
        if (r6 != r5) goto L_0x00e5;
    L_0x00e0:
        r4 = r4.b;
        r4 = (defpackage.artr) r4;
        goto L_0x00e9;
    L_0x00e5:
        r4 = defpackage.artr.j;
        goto L_0x00e9;
    L_0x00e8:
        r4 = r2;
    L_0x00e9:
        r4 = defpackage.fmx.a(r4);
        r3 = r3.c(r4);
        r4 = r1.a;
        r4 = r4 & 256;
        if (r4 == 0) goto L_0x0108;
    L_0x00f7:
        r2 = r1.g;
        if (r2 != 0) goto L_0x00fd;
    L_0x00fb:
        r2 = defpackage.arto.c;
    L_0x00fd:
        r4 = r2.a;
        if (r4 != r5) goto L_0x0106;
    L_0x0101:
        r2 = r2.b;
        r2 = (defpackage.artr) r2;
        goto L_0x0108;
    L_0x0106:
        r2 = defpackage.artr.j;
    L_0x0108:
        r2 = defpackage.fmx.a(r2);
        r2 = r3.d(r2);
        r1 = r1.f;
        r3 = 0;
        r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0118;
    L_0x0117:
        goto L_0x011a;
    L_0x0118:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x011a:
        r2.a(r1);
    L_0x011d:
        r0 = r0.b();
        r9.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmx.a(aruh, android.view.View, java.lang.Object, acvx, albc, boolean, boolean):void");
    }

    public final void a() {
        while (true) {
            Reference poll = this.f.poll();
            if (poll != null) {
                synchronized (this.f) {
                    this.e.remove(((fmz) poll).a);
                }
            } else {
                return;
            }
        }
    }

    private static aphg a(artr artr) {
        apxu apxu = null;
        if (artr == null) {
            return null;
        }
        aphf aphf = (aphf) aphg.s.createBuilder();
        arml arml = artr.e;
        if (arml == null) {
            arml = arml.f;
        }
        aphf.a(arml);
        aphf.a(artr.c);
        arwf arwf = artr.d;
        if (arwf == null) {
            arwf = arwf.c;
        }
        aphf.copyOnWrite();
        aphg aphg = (aphg) aphf.instance;
        if (arwf != null) {
            apxu apxu2;
            aphg.e = arwf;
            int i = 16;
            aphg.a |= 16;
            if ((artr.a & 16) != 0) {
                apxu2 = artr.f;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
            } else {
                apxu2 = null;
            }
            if (apxu2 != null) {
                aphf.a(apxu2);
            }
            if ((artr.a & 32) != 0) {
                apxu = artr.g;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            if (apxu != null) {
                aphf.b(apxu);
            }
            aodx aodx = artr.h;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aphf.copyOnWrite();
            aphg aphg2 = (aphg) aphf.instance;
            if (aodx != null) {
                aphg2.q = aodx;
                aphg2.a |= 32768;
                anvu anvu = artr.i;
                aphf.copyOnWrite();
                aphg2 = (aphg) aphf.instance;
                if (anvu != null) {
                    aphg2.a |= 262144;
                    aphg2.r = anvu;
                    if ((artr.a & 1) != 0) {
                        artt artt = artr.b;
                        if (artt == null) {
                            artt = artt.c;
                        }
                        int a = artv.a(artt.b);
                        if (a != 0 && a == 2) {
                            i = 14;
                        }
                    }
                    aphf.a(i);
                    return (aphg) ((anxl) aphf.build());
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public static String a(aruh aruh) {
        String valueOf = String.valueOf(aruh.b);
        int length = valueOf.length();
        String str = ebn.HINT_ID_PREFIX;
        return length == 0 ? new String(str) : str.concat(valueOf);
    }

    public static String b(aruh aruh) {
        String valueOf = String.valueOf(aruh.b);
        int length = valueOf.length();
        String str = ebn.HINT_LAST_SHOWN;
        return length == 0 ? new String(str) : str.concat(valueOf);
    }
}
