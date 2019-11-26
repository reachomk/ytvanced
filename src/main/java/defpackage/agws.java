package defpackage;

/* renamed from: agws */
public final class agws implements agxg {
    private final agxf a;
    private final agul b;
    private final agvs c;
    private final xhv d;
    private final zzf e;
    private final xsc f;
    private final xry g;
    private final xta h;
    private final agwa i;

    public agws(agxf agxf, agul agul, agvs agvs, xhv xhv, zzf zzf, xsc xsc, xry xry, xta xta, agwa agwa) {
        this.a = agxf;
        this.b = agul;
        this.c = agvs;
        this.d = xhv;
        this.e = zzf;
        this.f = xsc;
        this.g = xry;
        this.h = xta;
        this.i = agwa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a9 A:{Catch:{ ExecutionException -> 0x01f9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163 A:{Catch:{ ExecutionException -> 0x01f9 }} */
    public final synchronized int a(java.lang.String r22, defpackage.agvz r23, boolean r24) {
        /*
        r21 = this;
        r1 = r21;
        monitor-enter(r21);
        defpackage.xak.b();	 Catch:{ all -> 0x0204 }
        r0 = r1.c;	 Catch:{ all -> 0x0204 }
        r0 = r0.j();	 Catch:{ all -> 0x0204 }
        r2 = 1;
        if (r0 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r1.d;	 Catch:{ all -> 0x0204 }
        r0 = r0.e();	 Catch:{ all -> 0x0204 }
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001a;
    L_0x0018:
        monitor-exit(r21);
        return r2;
    L_0x001a:
        r0 = r23.n();	 Catch:{ all -> 0x0204 }
        r3 = r0.d();	 Catch:{ all -> 0x0204 }
        r12 = new java.util.ArrayList;	 Catch:{ all -> 0x0204 }
        r12.<init>();	 Catch:{ all -> 0x0204 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0204 }
    L_0x002b:
        r4 = r3.hasNext();	 Catch:{ all -> 0x0204 }
        r13 = 0;
        if (r4 == 0) goto L_0x00b3;
    L_0x0032:
        r4 = r3.next();	 Catch:{ all -> 0x0204 }
        r4 = (defpackage.agqi) r4;	 Catch:{ all -> 0x0204 }
        r5 = r4.a;	 Catch:{ all -> 0x0204 }
        r5 = r0.f(r5);	 Catch:{ all -> 0x0204 }
        r6 = r4.a;	 Catch:{ all -> 0x0204 }
        r6 = r0.a(r6);	 Catch:{ all -> 0x0204 }
        if (r5 != 0) goto L_0x0062;
    L_0x0046:
        r4 = r4.a;	 Catch:{ all -> 0x0204 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0204 }
        r5 = "No PlaylistProgress found for ";
        r6 = r4.length();	 Catch:{ all -> 0x0204 }
        if (r6 != 0) goto L_0x005a;
    L_0x0054:
        r4 = new java.lang.String;	 Catch:{ all -> 0x0204 }
        r4.<init>(r5);	 Catch:{ all -> 0x0204 }
        goto L_0x005e;
    L_0x005a:
        r4 = r5.concat(r4);	 Catch:{ all -> 0x0204 }
    L_0x005e:
        defpackage.xtl.c(r4);	 Catch:{ all -> 0x0204 }
        goto L_0x002b;
    L_0x0062:
        r7 = r4.a;	 Catch:{ all -> 0x0204 }
        r7 = r0.k(r7);	 Catch:{ all -> 0x0204 }
        if (r7 != 0) goto L_0x006f;
    L_0x006a:
        r7 = new java.lang.String[r13];	 Catch:{ all -> 0x0204 }
        r18 = r7;
        goto L_0x0090;
    L_0x006f:
        r7 = r7.second;	 Catch:{ all -> 0x0204 }
        r7 = (java.util.List) r7;	 Catch:{ all -> 0x0204 }
        r8 = r7.size();	 Catch:{ all -> 0x0204 }
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x0204 }
    L_0x0079:
        r9 = r7.size();	 Catch:{ all -> 0x0204 }
        if (r13 >= r9) goto L_0x008e;
    L_0x007f:
        r9 = r7.get(r13);	 Catch:{ all -> 0x0204 }
        r9 = (defpackage.agqp) r9;	 Catch:{ all -> 0x0204 }
        r9 = r9.a();	 Catch:{ all -> 0x0204 }
        r8[r13] = r9;	 Catch:{ all -> 0x0204 }
        r13 = r13 + 1;
        goto L_0x0079;
    L_0x008e:
        r18 = r8;
    L_0x0090:
        r7 = new aguo;	 Catch:{ all -> 0x0204 }
        r15 = r4.a;	 Catch:{ all -> 0x0204 }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0204 }
        r5 = r5.a;	 Catch:{ all -> 0x0204 }
        r5 = r5.h;	 Catch:{ all -> 0x0204 }
        r8 = r5.getTime();	 Catch:{ all -> 0x0204 }
        r16 = r4.toSeconds(r8);	 Catch:{ all -> 0x0204 }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0204 }
        r5 = r6.e;	 Catch:{ all -> 0x0204 }
        r19 = r4.toSeconds(r5);	 Catch:{ all -> 0x0204 }
        r14 = r7;
        r14.<init>(r15, r16, r18, r19);	 Catch:{ all -> 0x0204 }
        r12.add(r7);	 Catch:{ all -> 0x0204 }
        goto L_0x002b;
    L_0x00b3:
        r0 = r12.isEmpty();	 Catch:{ all -> 0x0204 }
        if (r0 != 0) goto L_0x0202;
    L_0x00b9:
        r0 = r23.j();	 Catch:{ ExecutionException -> 0x01f9 }
        r0 = r0.b();	 Catch:{ ExecutionException -> 0x01f9 }
        r3 = r0.d();	 Catch:{ ExecutionException -> 0x01f9 }
        r5 = 0;
        r5 = java.lang.Math.max(r5, r3);	 Catch:{ ExecutionException -> 0x01f9 }
        r0 = r1.e;	 Catch:{ ExecutionException -> 0x01f9 }
        r3 = r23.j();	 Catch:{ ExecutionException -> 0x01f9 }
        r3 = r3.c();	 Catch:{ ExecutionException -> 0x01f9 }
        r7 = defpackage.xve.a(r0, r3);	 Catch:{ ExecutionException -> 0x01f9 }
        r0 = r23.k();	 Catch:{ ExecutionException -> 0x01f9 }
        r0 = r0.a();	 Catch:{ ExecutionException -> 0x01f9 }
        r0 = r0.iterator();	 Catch:{ ExecutionException -> 0x01f9 }
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x00e8:
        r4 = r0.hasNext();	 Catch:{ ExecutionException -> 0x01f9 }
        if (r4 == 0) goto L_0x010c;
    L_0x00ee:
        r4 = r0.next();	 Catch:{ ExecutionException -> 0x01f9 }
        r4 = (defpackage.agqy) r4;	 Catch:{ ExecutionException -> 0x01f9 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ ExecutionException -> 0x01f9 }
        r11 = r1.f;	 Catch:{ ExecutionException -> 0x01f9 }
        r14 = r11.a();	 Catch:{ ExecutionException -> 0x01f9 }
        r2 = r4.g;	 Catch:{ ExecutionException -> 0x01f9 }
        r14 = r14 - r2;
        r2 = r10.toSeconds(r14);	 Catch:{ ExecutionException -> 0x01f9 }
        r3 = (int) r2;	 Catch:{ ExecutionException -> 0x01f9 }
        if (r3 < 0) goto L_0x010a;
    L_0x0106:
        if (r3 < r9) goto L_0x0109;
    L_0x0108:
        goto L_0x010a;
    L_0x0109:
        r9 = r3;
    L_0x010a:
        r2 = 1;
        goto L_0x00e8;
    L_0x010c:
        r0 = r1.g;	 Catch:{ ExecutionException -> 0x01f9 }
        r10 = r0.a();	 Catch:{ ExecutionException -> 0x01f9 }
        r4 = r1.b;	 Catch:{ ExecutionException -> 0x01f9 }
        r11 = r12;
        r0 = r4.a(r5, r7, r9, r10, r11);	 Catch:{ ExecutionException -> 0x01f9 }
        r2 = r23.n();	 Catch:{ all -> 0x0204 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0204 }
        r3.<init>();	 Catch:{ all -> 0x0204 }
        r4 = new java.util.HashMap;	 Catch:{ all -> 0x0204 }
        r4.<init>();	 Catch:{ all -> 0x0204 }
        r5 = new java.util.HashMap;	 Catch:{ all -> 0x0204 }
        r5.<init>();	 Catch:{ all -> 0x0204 }
        r6 = r1.i;	 Catch:{ all -> 0x0204 }
        r6 = r6.c();	 Catch:{ all -> 0x0204 }
        r8 = r0.d;	 Catch:{ all -> 0x0204 }
        r8 = r6 - r8;
        r6 = r12.size();	 Catch:{ all -> 0x0204 }
        r7 = 0;
        r10 = 0;
    L_0x013c:
        if (r7 >= r6) goto L_0x01db;
    L_0x013e:
        r11 = r12.get(r7);	 Catch:{ all -> 0x0204 }
        r11 = (defpackage.aguo) r11;	 Catch:{ all -> 0x0204 }
        r14 = r11.a;	 Catch:{ all -> 0x0204 }
        r14 = defpackage.ahdh.a(r0, r14);	 Catch:{ all -> 0x0204 }
        if (r14 != 0) goto L_0x014f;
    L_0x014c:
        r15 = r10;
        r10 = 1;
        goto L_0x0161;
    L_0x014f:
        r15 = r14.e;	 Catch:{ all -> 0x0204 }
        r10 = java.lang.Math.max(r10, r15);	 Catch:{ all -> 0x0204 }
        r15 = r14.c;	 Catch:{ all -> 0x0204 }
        if (r15 == 0) goto L_0x015c;
    L_0x0159:
        r15 = r10;
        r10 = 0;
        goto L_0x0161;
    L_0x015c:
        r15 = r14.g;	 Catch:{ all -> 0x0204 }
        if (r15 != 0) goto L_0x014c;
    L_0x0160:
        goto L_0x0159;
    L_0x0161:
        if (r24 != 0) goto L_0x01a9;
    L_0x0163:
        if (r10 != 0) goto L_0x016b;
    L_0x0165:
        r19 = r0;
    L_0x0167:
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x01d3;
    L_0x016b:
        r10 = r11.a;	 Catch:{ all -> 0x0204 }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0204 }
        r13 = "Resyncing playlist: ";
        r19 = r10.length();	 Catch:{ all -> 0x0204 }
        if (r19 != 0) goto L_0x017f;
    L_0x0179:
        r10 = new java.lang.String;	 Catch:{ all -> 0x0204 }
        r10.<init>(r13);	 Catch:{ all -> 0x0204 }
        goto L_0x0182;
    L_0x017f:
        r13.concat(r10);	 Catch:{ all -> 0x0204 }
    L_0x0182:
        r10 = r11.a;	 Catch:{ all -> 0x0204 }
        r3.add(r10);	 Catch:{ all -> 0x0204 }
        r10 = r11.a;	 Catch:{ all -> 0x0204 }
        r19 = r0;
        r13 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0204 }
        r4.put(r10, r0);	 Catch:{ all -> 0x0204 }
        r0 = r11.a;	 Catch:{ all -> 0x0204 }
        if (r14 == 0) goto L_0x01a0;
    L_0x0199:
        r10 = r14.f;	 Catch:{ all -> 0x0204 }
        if (r10 != 0) goto L_0x019e;
    L_0x019d:
        goto L_0x01a0;
    L_0x019e:
        r10 = 0;
        goto L_0x01a1;
    L_0x01a0:
        r10 = 1;
    L_0x01a1:
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0204 }
        r5.put(r0, r10);	 Catch:{ all -> 0x0204 }
        goto L_0x0167;
    L_0x01a9:
        r19 = r0;
        r10 = 1;
        r0 = new java.lang.Object[r10];	 Catch:{ all -> 0x0204 }
        r10 = r11.a;	 Catch:{ all -> 0x0204 }
        r13 = 0;
        r0[r13] = r10;	 Catch:{ all -> 0x0204 }
        r10 = "Force syncing playlist: %s";
        java.lang.String.format(r10, r0);	 Catch:{ all -> 0x0204 }
        r0 = r11.a;	 Catch:{ all -> 0x0204 }
        r3.add(r0);	 Catch:{ all -> 0x0204 }
        r0 = r11.a;	 Catch:{ all -> 0x0204 }
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r13 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0204 }
        r4.put(r0, r13);	 Catch:{ all -> 0x0204 }
        r0 = r11.a;	 Catch:{ all -> 0x0204 }
        r11 = 0;
        r13 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x0204 }
        r5.put(r0, r13);	 Catch:{ all -> 0x0204 }
    L_0x01d3:
        r7 = r7 + 1;
        r10 = r15;
        r0 = r19;
        r13 = 0;
        goto L_0x013c;
    L_0x01db:
        r0 = r3.isEmpty();	 Catch:{ all -> 0x0204 }
        if (r0 != 0) goto L_0x01e6;
    L_0x01e1:
        r6 = 1;
        r7 = r8;
        r2.a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0204 }
    L_0x01e6:
        if (r10 > 0) goto L_0x01ee;
    L_0x01e8:
        r0 = r1.a;	 Catch:{ all -> 0x0204 }
        r0.a();	 Catch:{ all -> 0x0204 }
        goto L_0x01f6;
    L_0x01ee:
        r0 = r1.a;	 Catch:{ all -> 0x0204 }
        r2 = (long) r10;	 Catch:{ all -> 0x0204 }
        r4 = r22;
        r0.a(r4, r2);	 Catch:{ all -> 0x0204 }
    L_0x01f6:
        monitor-exit(r21);
    L_0x01f7:
        r0 = 0;
        return r0;
    L_0x01f9:
        r0 = move-exception;
        r2 = "PlaylistSyncCheckRequest failed";
        defpackage.xtl.a(r2, r0);	 Catch:{ all -> 0x0204 }
        monitor-exit(r21);
        r2 = 1;
        return r2;
    L_0x0202:
        monitor-exit(r21);
        goto L_0x01f7;
    L_0x0204:
        r0 = move-exception;
        monitor-exit(r21);
        goto L_0x0208;
    L_0x0207:
        throw r0;
    L_0x0208:
        goto L_0x0207;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agws.a(java.lang.String, agvz, boolean):int");
    }
}
