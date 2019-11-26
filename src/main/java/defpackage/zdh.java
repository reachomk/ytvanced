package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: zdh */
public final class zdh implements xcp, zdg {
    private final xhv a;
    private final ExecutorService b;
    private final xsv c;
    private final zdi d;
    private final zdl e;
    private final zdo f;

    public zdh(xhv xhv, ExecutorService executorService, xsv xsv, zdi zdi, zdo zdo, zdl zdl) {
        this.a = xhv;
        this.b = executorService;
        this.c = xsv;
        this.d = zdi;
        this.f = zdo;
        this.e = zdl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0291  */
    public final void a() {
        /*
        r19 = this;
        r1 = r19;
        defpackage.xak.b();
        r0 = r1.f;
        defpackage.amqw.a(r0);
        r0 = r1.f;
        r0 = r0.a();
        r2 = "\n";
        r3 = 0;
        r6 = 0;
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0058;
    L_0x0018:
        r7 = r0.b;
        r7 = r7.size();
        if (r7 == 0) goto L_0x0058;
    L_0x0020:
        r7 = r1.e;
        r8 = r0.b;
        r8 = r8.get(r6);
        r8 = (java.lang.String) r8;
        r9 = r0.c;
        r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r11 != 0) goto L_0x0033;
    L_0x0030:
        r9 = "none";
        goto L_0x0037;
    L_0x0033:
        r9 = java.lang.String.valueOf(r9);
    L_0x0037:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "Received MobileDataPlan Api Config\nCPID Endpoint: ";
        r10.append(r11);
        r10.append(r8);
        r8 = "\nCarrier ID: ";
        r10.append(r8);
        r10.append(r9);
        r10.append(r2);
        r8 = r10.toString();
        r7.a(r8);
        r7 = r0;
        goto L_0x0060;
    L_0x0058:
        r0 = r1.e;
        r7 = "No initialization required for mobile data plan API.";
        r0.a(r7);
        r7 = 0;
    L_0x0060:
        if (r7 == 0) goto L_0x02d6;
    L_0x0062:
        r0 = r7.b;
        r0 = r0.get(r6);
        r0 = (java.lang.String) r0;
        r8 = android.net.Uri.parse(r0);
        r9 = r1.d;
        r0 = r1.c;
        r10 = r0.a();
        defpackage.xak.b();
        defpackage.amqw.a(r8);
        r0 = r8.buildUpon();
        r11 = "app";
        r12 = "YouTube";
        r0 = r0.appendQueryParameter(r11, r12);
        r0 = r0.build();
        r0 = r0.toString();
        r0 = defpackage.xhc.a(r0);
        r11 = r0.a();
    L_0x0098:
        r0 = r10.a;
        r12 = r0.c;
        r14 = r10.b;
        r12 = r12 - r14;
        r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1));
        if (r0 > 0) goto L_0x00a6;
    L_0x00a3:
        r5 = 0;
        goto L_0x01d6;
    L_0x00a6:
        r0 = r9.b;
        r12 = r0.b();
        r14 = 2;
        r15 = 1;
        r3 = 3;
        r0 = r9.a;	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r0 = r0.a;	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r0 = r0.a(r11);	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r4 = r0.b();	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r5 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 >= r5) goto L_0x0120;
    L_0x00bf:
        r4 = r0.b();	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r0 = r0.e();	 Catch:{ xhp -> 0x011e, IOException -> 0x0135, all -> 0x0119 }
        r5 = "UTF-8";
        r5 = r0.a(r5);	 Catch:{ xhp -> 0x011e, IOException -> 0x0135, all -> 0x0119 }
        r0 = r9.b;
        r16 = r0.b();
        r0 = defpackage.aqsm.h;
        r0 = r0.createBuilder();
        r0 = (defpackage.aqsl) r0;
        r0.d(r14);
        r0.e(r15);
        r0.b(r4);
        r3 = r10.b;
        r4 = (int) r3;
        r0.a(r4);
        r3 = r16 - r12;
        r4 = (int) r3;
        r0.c(r4);
        r3 = r8.toString();
        r0.a(r3);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqsm) r0;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r3 = r9.c;
        r3.a(r0);
        goto L_0x01d6;
    L_0x0119:
        r0 = move-exception;
        r2 = r0;
        r0 = 1;
        goto L_0x0289;
    L_0x011e:
        r0 = move-exception;
        goto L_0x0185;
    L_0x0120:
        r4 = new xhp;	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r5 = r0.b();	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r0 = r0.c();	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        r4.<init>(r5, r0);	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
        throw r4;	 Catch:{ xhp -> 0x0183, IOException -> 0x0134, all -> 0x012e }
    L_0x012e:
        r0 = move-exception;
        r2 = r0;
        r0 = 1;
        r4 = 0;
        goto L_0x0289;
    L_0x0134:
        r4 = 0;
    L_0x0135:
        r0 = r9.b;
        r14 = r0.b();
        r0 = defpackage.aqsm.h;
        r0 = r0.createBuilder();
        r0 = (defpackage.aqsl) r0;
        r0.d(r3);
        r3 = 4;
        r0.e(r3);
        r0.b(r4);
        r3 = r10.b;
        r4 = (int) r3;
        r0.a(r4);
        r14 = r14 - r12;
        r3 = (int) r14;
        r0.c(r3);
        r3 = r8.toString();
        r0.a(r3);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqsm) r0;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r3 = r9.c;
        r3.a(r0);
        r18 = r7;
        goto L_0x027c;
    L_0x0183:
        r0 = move-exception;
        r4 = 0;
    L_0x0185:
        r0 = r0.a;	 Catch:{ all -> 0x0286 }
        r4 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r0 != r4) goto L_0x0231;
    L_0x018b:
        r0 = r9.b;
        r5 = r0.b();
        r0 = defpackage.aqsm.h;
        r0 = r0.createBuilder();
        r0 = (defpackage.aqsl) r0;
        r0.d(r3);
        r0.e(r3);
        r0.b(r4);
        r3 = r10.b;
        r4 = (int) r3;
        r0.a(r4);
        r5 = r5 - r12;
        r3 = (int) r5;
        r0.c(r3);
        r3 = r8.toString();
        r0.a(r3);
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqsm) r0;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r3 = r9.c;
        r3.a(r0);
        goto L_0x00a3;
    L_0x01d6:
        if (r5 != 0) goto L_0x01e1;
    L_0x01d8:
        r0 = r1.e;
        r2 = "Could not fetch CPID from CPID endpoint";
        r0.a(r2);
        r5 = 0;
        goto L_0x0210;
    L_0x01e1:
        r0 = r1.e;
        r0.c = r8;
        r3 = r0.a;
        r3 = r3.a();
        r0.b = r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Accessed API end point: ";
        r3.append(r4);
        r4 = r8.toString();
        r3.append(r4);
        r4 = "\nReceived CPID response: ";
        r3.append(r4);
        r3.append(r5);
        r3.append(r2);
        r2 = r3.toString();
        r0.a(r2);
    L_0x0210:
        if (r5 == 0) goto L_0x0230;
    L_0x0212:
        r2 = r7.c;
        r0 = r1.e;
        r4 = "Registering CPID Response: ";
        r6 = r5.length();
        if (r6 != 0) goto L_0x0224;
    L_0x021e:
        r6 = new java.lang.String;
        r6.<init>(r4);
        goto L_0x0228;
    L_0x0224:
        r6 = r4.concat(r5);
    L_0x0228:
        r0.a(r6);
        r0 = r1.f;
        r0.a(r5, r2);
    L_0x0230:
        return;
    L_0x0231:
        r4 = r9.b;
        r4 = r4.b();
        r14 = defpackage.aqsm.h;
        r14 = r14.createBuilder();
        r14 = (defpackage.aqsl) r14;
        r14.d(r3);
        r14.e(r3);
        r14.b(r0);
        r18 = r7;
        r6 = r10.b;
        r0 = (int) r6;
        r14.a(r0);
        r4 = r4 - r12;
        r0 = (int) r4;
        r14.c(r0);
        r0 = r8.toString();
        r14.a(r0);
        r0 = r14.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqsm) r0;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r3 = r9.c;
        r3.a(r0);
    L_0x027c:
        r10.a();
        r7 = r18;
        r3 = 0;
        r6 = 0;
        goto L_0x0098;
    L_0x0286:
        r0 = move-exception;
        r2 = r0;
        r0 = 3;
    L_0x0289:
        r5 = r9.b;
        r5 = r5.b();
        if (r0 != r15) goto L_0x0292;
    L_0x0291:
        r3 = 2;
    L_0x0292:
        r7 = defpackage.aqsm.h;
        r7 = r7.createBuilder();
        r7 = (defpackage.aqsl) r7;
        r7.d(r3);
        r7.e(r0);
        r7.b(r4);
        r3 = r10.b;
        r0 = (int) r3;
        r7.a(r0);
        r5 = r5 - r12;
        r0 = (int) r5;
        r7.c(r0);
        r0 = r8.toString();
        r7.a(r0);
        r0 = r7.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqsm) r0;
        r3 = defpackage.asmw.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.asmz) r3;
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asmw) r0;
        r3 = r9.c;
        r3.a(r0);
        throw r2;
    L_0x02d6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdh.a():void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((xgg) obj).a && this.a.g()) {
            this.b.execute(new zdk(this));
            return null;
        }
        return clsArr;
    }
}
