package defpackage;

import java.net.MalformedURLException;
import java.util.List;

/* renamed from: vng */
public final class vng {
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    public static defpackage.aagt a(defpackage.atnu r5) {
        /*
        r0 = r5.b;
        r1 = 3;
        r0 = defpackage.xvd.a(r0, r1);
        r1 = new aagt;
        r1.<init>(r0);
        r0 = r5.c;
        r0 = r0.size();
        if (r0 == 0) goto L_0x012b;
    L_0x0014:
        r5 = r5.c;
        r5 = r5.iterator();
    L_0x001a:
        r0 = r5.hasNext();
        r2 = 2;
        if (r0 == 0) goto L_0x0032;
    L_0x0021:
        r0 = r5.next();
        r0 = (defpackage.atmo) r0;
        r3 = r0.b;
        r3 = defpackage.atmq.a(r3);
        if (r3 == 0) goto L_0x001a;
    L_0x002f:
        if (r3 != r2) goto L_0x001a;
    L_0x0031:
        goto L_0x0033;
    L_0x0032:
        r0 = 0;
    L_0x0033:
        if (r0 == 0) goto L_0x0125;
    L_0x0035:
        r5 = r0.d;
        r1.k = r5;
        r5 = r0.c;
        if (r5 != 0) goto L_0x003f;
    L_0x003d:
        r5 = defpackage.atna.h;
    L_0x003f:
        r0 = r5.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x004f;
    L_0x0045:
        r0 = r5.b;
        if (r0 != 0) goto L_0x004b;
    L_0x0049:
        r0 = defpackage.atmu.c;
    L_0x004b:
        r0 = r0.b;
        r1.l = r0;
    L_0x004f:
        r0 = r5.d;
        r0 = r0.iterator();
    L_0x0055:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x007e;
    L_0x005b:
        r3 = r0.next();
        r3 = (defpackage.atns) r3;
        r3 = r3.b;	 Catch:{ MalformedURLException -> 0x0078 }
        r3 = defpackage.xvt.a(r3);	 Catch:{ MalformedURLException -> 0x0078 }
        r4 = r1.b;	 Catch:{ MalformedURLException -> 0x0078 }
        if (r4 != 0) goto L_0x0072;
    L_0x006b:
        r4 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0078 }
        r4.<init>();	 Catch:{ MalformedURLException -> 0x0078 }
        r1.b = r4;	 Catch:{ MalformedURLException -> 0x0078 }
    L_0x0072:
        r4 = r1.b;	 Catch:{ MalformedURLException -> 0x0078 }
        r4.add(r3);	 Catch:{ MalformedURLException -> 0x0078 }
        goto L_0x0055;
    L_0x0078:
        r3 = "Badly formed impression uri - ignoring";
        defpackage.xtl.d(r3);
        goto L_0x0055;
    L_0x007e:
        r0 = r5.c;
        r0 = r0.iterator();
    L_0x0084:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x00ab;
    L_0x008a:
        r3 = r0.next();
        r3 = (java.lang.String) r3;
        r3 = defpackage.xvt.a(r3);	 Catch:{ MalformedURLException -> 0x00a5 }
        r4 = r1.N;	 Catch:{ MalformedURLException -> 0x00a5 }
        if (r4 != 0) goto L_0x009f;
    L_0x0098:
        r4 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x00a5 }
        r4.<init>();	 Catch:{ MalformedURLException -> 0x00a5 }
        r1.N = r4;	 Catch:{ MalformedURLException -> 0x00a5 }
    L_0x009f:
        r4 = r1.N;	 Catch:{ MalformedURLException -> 0x00a5 }
        r4.add(r3);	 Catch:{ MalformedURLException -> 0x00a5 }
        goto L_0x0084;
    L_0x00a5:
        r3 = "Badly formed error uri - ignoring";
        defpackage.xtl.d(r3);
        goto L_0x0084;
    L_0x00ab:
        r0 = r5.e;
        r0 = r0.iterator();
    L_0x00b1:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x00eb;
    L_0x00b7:
        r3 = r0.next();
        r3 = (defpackage.atnc) r3;
        r4 = r3.b;
        r4 = defpackage.atms.a(r4);
        if (r4 == 0) goto L_0x00b1;
    L_0x00c5:
        if (r4 != r2) goto L_0x00b1;
    L_0x00c7:
        r0 = r3.c;
        if (r0 != 0) goto L_0x00cd;
    L_0x00cb:
        r0 = defpackage.atne.b;
    L_0x00cd:
        r2 = r0.a;
        r2 = r2.size();
        if (r2 == 0) goto L_0x00eb;
    L_0x00d5:
        r0 = r0.a;
        r0 = r0.iterator();
    L_0x00db:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x00eb;
    L_0x00e1:
        r2 = r0.next();
        r2 = (defpackage.atno) r2;
        defpackage.vng.a(r2, r1);
        goto L_0x00db;
    L_0x00eb:
        r0 = r5.g;
        r0 = r0.size();
        if (r0 != 0) goto L_0x00f4;
    L_0x00f3:
        goto L_0x011f;
    L_0x00f4:
        r0 = new vna;
        r0.<init>();
        r2 = r5.g;
        r2 = r2.iterator();
    L_0x00ff:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0117;
    L_0x0105:
        r3 = r2.next();
        r3 = (defpackage.astv) r3;
        r3 = defpackage.vmw.a(r3);
        if (r3 == 0) goto L_0x00ff;
    L_0x0111:
        r4 = r0.a;
        r4.add(r3);
        goto L_0x00ff;
    L_0x0117:
        r0 = r0.b();
        r0 = (java.util.List) r0;
        r1.af = r0;
    L_0x011f:
        r5 = r5.f;
        defpackage.vng.a(r5, r1);
        return r1;
    L_0x0125:
        r5 = "Invalid Vast Ad proto with no inLine Ad.";
        defpackage.xtl.d(r5);
        return r1;
    L_0x012b:
        r5 = "Invalid Vast Ad proto with no Ads.";
        defpackage.xtl.d(r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vng.a(atnu):aagt");
    }

    private static void a(List list, aagt aagt) {
        if (list != null) {
            loop0:
            for (atmy atmy : list) {
                for (atmw atmw : atmy.a) {
                    if ((atmw.a & 1) != 0) {
                        atng atng = atmw.b;
                        if (atng == null) {
                            atng = atng.c;
                        }
                        if ("type".equalsIgnoreCase(atng.b)) {
                            if ("adsense".equalsIgnoreCase(atmw.c)) {
                                break loop0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            atmy atmy2 = null;
            if (atmy2 != null) {
                for (atni atni : atmy2.b) {
                    if ((atni.a & 1) != 0) {
                        atng atng2 = atni.b;
                        if (atng2 == null) {
                            atng2 = atng.c;
                        }
                        if ("ConversionUrl".equalsIgnoreCase(atng2.b)) {
                            try {
                                aagt.R = xvt.a(atni.c);
                                return;
                            } catch (MalformedURLException unused) {
                                xtl.d("Badly formed ConversionUrl uri - ignoring");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061 A:{Catch:{ MalformedURLException -> 0x0128 }} */
    private static void a(defpackage.atno r7, defpackage.aagt r8) {
        /*
        r0 = "Badly formed tracking uri - ignoring";
        if (r7 == 0) goto L_0x012c;
    L_0x0004:
        r1 = r7.c;	 Catch:{ MalformedURLException -> 0x0128 }
        r1 = defpackage.xvt.a(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = r7.b;	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = defpackage.atnq.a(r2);	 Catch:{ MalformedURLException -> 0x0128 }
        r3 = 1;
        if (r2 == 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0015;
    L_0x0014:
        r2 = 1;
    L_0x0015:
        r4 = 3;
        switch(r2) {
            case 1: goto L_0x0113;
            case 2: goto L_0x0113;
            case 3: goto L_0x0102;
            case 4: goto L_0x00f1;
            case 5: goto L_0x00e0;
            case 6: goto L_0x00cf;
            case 7: goto L_0x00be;
            case 8: goto L_0x0019;
            case 9: goto L_0x00ad;
            case 10: goto L_0x0019;
            case 11: goto L_0x009c;
            case 12: goto L_0x008b;
            case 13: goto L_0x0019;
            case 14: goto L_0x0019;
            case 15: goto L_0x0019;
            case 16: goto L_0x0019;
            case 17: goto L_0x007a;
            case 18: goto L_0x0072;
            case 19: goto L_0x001b;
            default: goto L_0x0019;
        };	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x0019:
        goto L_0x0124;
    L_0x001b:
        r2 = r8.a;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r2 < r4) goto L_0x0127;
    L_0x001f:
        r7 = r7.d;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x0025;
    L_0x0023:
        r7 = defpackage.atnk.e;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x0025:
        r2 = r7.b;	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = defpackage.atnm.a(r2);	 Catch:{ MalformedURLException -> 0x0128 }
        r5 = 0;
        if (r2 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0047;
    L_0x002f:
        r6 = 2;
        if (r2 != r6) goto L_0x0047;
    L_0x0032:
        r7 = r7.c;	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = 0;
        r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x005f;
    L_0x0039:
        r2 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0040;
    L_0x003f:
        goto L_0x005f;
    L_0x0040:
        r5 = new aagv;	 Catch:{ MalformedURLException -> 0x0128 }
        r7 = (int) r7;	 Catch:{ MalformedURLException -> 0x0128 }
        r5.<init>(r7, r3, r1);	 Catch:{ MalformedURLException -> 0x0128 }
        goto L_0x005f;
    L_0x0047:
        r2 = r7.b;	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = defpackage.atnm.a(r2);	 Catch:{ MalformedURLException -> 0x0128 }
        if (r2 == 0) goto L_0x005a;
    L_0x004f:
        if (r2 != r4) goto L_0x005a;
    L_0x0051:
        r5 = new aagv;	 Catch:{ MalformedURLException -> 0x0128 }
        r7 = r7.d;	 Catch:{ MalformedURLException -> 0x0128 }
        r2 = 0;
        r5.<init>(r7, r2, r1);	 Catch:{ MalformedURLException -> 0x0128 }
        goto L_0x005f;
    L_0x005a:
        r7 = "Badly formed progress tracking uri - ignoring";
        defpackage.xtl.d(r7);	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x005f:
        if (r5 == 0) goto L_0x0127;
    L_0x0061:
        r7 = r8.z;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x006c;
    L_0x0065:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.z = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x006c:
        r7 = r8.z;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r5);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x0072:
        r7 = r8.a;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 < r4) goto L_0x0127;
    L_0x0076:
        r8.a(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x007a:
        r7 = r8.F;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x0085;
    L_0x007e:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.F = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x0085:
        r7 = r8.F;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x008b:
        r7 = r8.J;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x0096;
    L_0x008f:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.J = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x0096:
        r7 = r8.J;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x009c:
        r7 = r8.H;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00a7;
    L_0x00a0:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.H = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00a7:
        r7 = r8.H;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x00ad:
        r7 = r8.G;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00b8;
    L_0x00b1:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.G = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00b8:
        r7 = r8.G;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x00be:
        r7 = r8.I;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00c9;
    L_0x00c2:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.I = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00c9:
        r7 = r8.I;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x00cf:
        r7 = r8.D;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00da;
    L_0x00d3:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.D = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00da:
        r7 = r8.D;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x00e0:
        r7 = r8.y;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00eb;
    L_0x00e4:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.y = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00eb:
        r7 = r8.y;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x00f1:
        r7 = r8.x;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x00fc;
    L_0x00f5:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.x = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x00fc:
        r7 = r8.x;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x0102:
        r7 = r8.w;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x010d;
    L_0x0106:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.w = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x010d:
        r7 = r8.w;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x0113:
        r7 = r8.v;	 Catch:{ MalformedURLException -> 0x0128 }
        if (r7 != 0) goto L_0x011e;
    L_0x0117:
        r7 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.<init>();	 Catch:{ MalformedURLException -> 0x0128 }
        r8.v = r7;	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x011e:
        r7 = r8.v;	 Catch:{ MalformedURLException -> 0x0128 }
        r7.add(r1);	 Catch:{ MalformedURLException -> 0x0128 }
        return;
    L_0x0124:
        defpackage.xtl.d(r0);	 Catch:{ MalformedURLException -> 0x0128 }
    L_0x0127:
        return;
    L_0x0128:
        defpackage.xtl.d(r0);
        return;
    L_0x012c:
        r7 = "Badly formed tracking event - ignoring";
        defpackage.xtl.d(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vng.a(atno, aagt):void");
    }
}
