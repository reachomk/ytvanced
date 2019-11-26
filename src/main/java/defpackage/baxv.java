package defpackage;

/* renamed from: baxv */
public final class baxv extends batv {
    private final batx b;
    private batv c;
    private baug d;
    private boolean e;
    private final /* synthetic */ baxw f;

    baxv(baxw baxw, batx batx) {
        this.f = baxw;
        this.b = batx;
        this.d = baxw.b.a(baxw.c);
        baug baug = this.d;
        if (baug != null) {
            this.c = baug.a(batx);
            return;
        }
        String str = baxw.c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 182);
        stringBuilder.append("Could not find policy '");
        stringBuilder.append(str);
        stringBuilder.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean b() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120 A:{Catch:{ baxz -> 0x01fd }} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A:{Catch:{ baxz -> 0x01fd }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01af  */
    public final void a(defpackage.bauc r14) {
        /*
        r13 = this;
        r0 = r14.a;
        r14 = r14.b;
        r1 = a;
        r1 = r14.a(r1);
        if (r1 != 0) goto L_0x0223;
    L_0x000c:
        r1 = defpackage.bbbv.a;
        r1 = r14.a(r1);
        r1 = (java.util.Map) r1;
        r2 = 0;
        r3 = 0;
        r4 = new java.util.ArrayList;	 Catch:{ baxz -> 0x01fd }
        r4.<init>();	 Catch:{ baxz -> 0x01fd }
        r5 = r0.iterator();	 Catch:{ baxz -> 0x01fd }
        r6 = 1;
        r7 = 0;
    L_0x0021:
        r8 = r5.hasNext();	 Catch:{ baxz -> 0x01fd }
        if (r8 == 0) goto L_0x003d;
    L_0x0027:
        r8 = r5.next();	 Catch:{ baxz -> 0x01fd }
        r8 = (defpackage.batd) r8;	 Catch:{ baxz -> 0x01fd }
        r9 = r8.b;	 Catch:{ baxz -> 0x01fd }
        r10 = defpackage.bbbv.b;	 Catch:{ baxz -> 0x01fd }
        r9 = r9.a(r10);	 Catch:{ baxz -> 0x01fd }
        if (r9 == 0) goto L_0x0039;
    L_0x0037:
        r7 = 1;
        goto L_0x0021;
    L_0x0039:
        r4.add(r8);	 Catch:{ baxz -> 0x01fd }
        goto L_0x0021;
    L_0x003d:
        if (r1 == 0) goto L_0x0048;
    L_0x003f:
        r1 = defpackage.bbhd.t(r1);	 Catch:{ baxz -> 0x01fd }
        r1 = defpackage.bbhd.a(r1);	 Catch:{ baxz -> 0x01fd }
        goto L_0x0049;
    L_0x0048:
        r1 = r2;
    L_0x0049:
        r5 = "grpclb";
        if (r1 == 0) goto L_0x00c7;
    L_0x004d:
        r8 = r1.isEmpty();	 Catch:{ baxz -> 0x01fd }
        if (r8 != 0) goto L_0x00c7;
    L_0x0053:
        r8 = new java.util.LinkedHashSet;	 Catch:{ baxz -> 0x01fd }
        r8.<init>();	 Catch:{ baxz -> 0x01fd }
        r1 = r1.iterator();	 Catch:{ baxz -> 0x01fd }
    L_0x005c:
        r9 = r1.hasNext();	 Catch:{ baxz -> 0x01fd }
        if (r9 == 0) goto L_0x009e;
    L_0x0062:
        r9 = r1.next();	 Catch:{ baxz -> 0x01fd }
        r9 = (defpackage.bbhg) r9;	 Catch:{ baxz -> 0x01fd }
        r10 = r9.a;	 Catch:{ baxz -> 0x01fd }
        r11 = r13.f;	 Catch:{ baxz -> 0x01fd }
        r11 = r11.b;	 Catch:{ baxz -> 0x01fd }
        r11 = r11.a(r10);	 Catch:{ baxz -> 0x01fd }
        if (r11 != 0) goto L_0x0078;
    L_0x0074:
        r8.add(r10);	 Catch:{ baxz -> 0x01fd }
        goto L_0x005c;
    L_0x0078:
        r1 = r8.isEmpty();	 Catch:{ baxz -> 0x01fd }
        if (r1 != 0) goto L_0x008d;
    L_0x007e:
        r1 = r13.b;	 Catch:{ baxz -> 0x01fd }
        r1 = r1.a();	 Catch:{ baxz -> 0x01fd }
        r7 = "{0} specified by Service Config are not available";
        r12 = new java.lang.Object[r6];	 Catch:{ baxz -> 0x01fd }
        r12[r3] = r8;	 Catch:{ baxz -> 0x01fd }
        r1.a(r6, r7, r12);	 Catch:{ baxz -> 0x01fd }
    L_0x008d:
        r1 = new bayc;	 Catch:{ baxz -> 0x01fd }
        r5 = r10.equals(r5);	 Catch:{ baxz -> 0x01fd }
        if (r5 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0097;
    L_0x0096:
        r4 = r0;
    L_0x0097:
        r5 = r9.b;	 Catch:{ baxz -> 0x01fd }
        r1.<init>(r11, r4, r5);	 Catch:{ baxz -> 0x01fd }
        goto L_0x0126;
    L_0x009e:
        if (r7 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00db;
    L_0x00a1:
        r14 = new baxz;	 Catch:{ baxz -> 0x01fd }
        r0 = java.lang.String.valueOf(r8);	 Catch:{ baxz -> 0x01fd }
        r1 = r0.length();	 Catch:{ baxz -> 0x01fd }
        r1 = r1 + 51;
        r4 = new java.lang.StringBuilder;	 Catch:{ baxz -> 0x01fd }
        r4.<init>(r1);	 Catch:{ baxz -> 0x01fd }
        r1 = "None of ";
        r4.append(r1);	 Catch:{ baxz -> 0x01fd }
        r4.append(r0);	 Catch:{ baxz -> 0x01fd }
        r0 = " specified by Service Config are available.";
        r4.append(r0);	 Catch:{ baxz -> 0x01fd }
        r0 = r4.toString();	 Catch:{ baxz -> 0x01fd }
        r14.<init>(r0);	 Catch:{ baxz -> 0x01fd }
        throw r14;	 Catch:{ baxz -> 0x01fd }
    L_0x00c7:
        if (r7 != 0) goto L_0x00db;
    L_0x00c9:
        r13.e = r3;	 Catch:{ baxz -> 0x01fd }
        r1 = new bayc;	 Catch:{ baxz -> 0x01fd }
        r4 = r13.f;	 Catch:{ baxz -> 0x01fd }
        r5 = r4.c;	 Catch:{ baxz -> 0x01fd }
        r7 = "using default policy";
        r4 = r4.a(r5, r7);	 Catch:{ baxz -> 0x01fd }
        r1.<init>(r4, r0, r2);	 Catch:{ baxz -> 0x01fd }
        goto L_0x0126;
    L_0x00db:
        r1 = r13.f;	 Catch:{ baxz -> 0x01fd }
        r1 = r1.b;	 Catch:{ baxz -> 0x01fd }
        r1 = r1.a(r5);	 Catch:{ baxz -> 0x01fd }
        if (r1 != 0) goto L_0x0120;
    L_0x00e5:
        r1 = r4.isEmpty();	 Catch:{ baxz -> 0x01fd }
        if (r1 != 0) goto L_0x0118;
    L_0x00eb:
        r1 = r13.e;	 Catch:{ baxz -> 0x01fd }
        if (r1 != 0) goto L_0x0108;
    L_0x00ef:
        r13.e = r6;	 Catch:{ baxz -> 0x01fd }
        r1 = "Found balancer addresses but grpclb runtime is missing. Will use round_robin. Please include grpc-grpclb in your runtime depedencies.";
        r5 = r13.b;	 Catch:{ baxz -> 0x01fd }
        r5 = r5.a();	 Catch:{ baxz -> 0x01fd }
        r7 = 4;
        r5.a(r7, r1);	 Catch:{ baxz -> 0x01fd }
        r5 = defpackage.baxw.a;	 Catch:{ baxz -> 0x01fd }
        r7 = java.util.logging.Level.WARNING;	 Catch:{ baxz -> 0x01fd }
        r8 = "io.grpc.internal.AutoConfiguredLoadBalancerFactory$AutoConfiguredLoadBalancer";
        r9 = "decideLoadBalancerProvider";
        r5.logp(r7, r8, r9, r1);	 Catch:{ baxz -> 0x01fd }
    L_0x0108:
        r1 = new bayc;	 Catch:{ baxz -> 0x01fd }
        r5 = r13.f;	 Catch:{ baxz -> 0x01fd }
        r7 = "round_robin";
        r8 = "received balancer addresses but grpclb runtime is missing";
        r5 = r5.a(r7, r8);	 Catch:{ baxz -> 0x01fd }
        r1.<init>(r5, r4, r2);	 Catch:{ baxz -> 0x01fd }
        goto L_0x0126;
    L_0x0118:
        r14 = new baxz;	 Catch:{ baxz -> 0x01fd }
        r0 = "Received ONLY balancer addresses but grpclb runtime is missing";
        r14.<init>(r0);	 Catch:{ baxz -> 0x01fd }
        throw r14;	 Catch:{ baxz -> 0x01fd }
    L_0x0120:
        r4 = new bayc;	 Catch:{ baxz -> 0x01fd }
        r4.<init>(r1, r0, r2);	 Catch:{ baxz -> 0x01fd }
        r1 = r4;
    L_0x0126:
        r2 = r13.d;
        if (r2 == 0) goto L_0x013c;
    L_0x012a:
        r2 = r1.a;
        r2 = r2.c();
        r4 = r13.d;
        r4 = r4.c();
        r2 = r2.equals(r4);
        if (r2 != 0) goto L_0x0181;
    L_0x013c:
        r2 = r13.b;
        r4 = defpackage.basp.CONNECTING;
        r5 = new baxy;
        r5.<init>(r3);
        r2.a(r4, r5);
        r2 = r13.c;
        r2.a();
        r2 = r1.a;
        r13.d = r2;
        r2 = r13.c;
        r4 = r13.d;
        r5 = r13.b;
        r4 = r4.a(r5);
        r13.c = r4;
        r4 = r13.b;
        r4 = r4.a();
        r5 = 2;
        r7 = new java.lang.Object[r5];
        r2 = r2.getClass();
        r2 = r2.getSimpleName();
        r7[r3] = r2;
        r2 = r13.c;
        r2 = r2.getClass();
        r2 = r2.getSimpleName();
        r7[r6] = r2;
        r2 = "Load balancer changed from {0} to {1}";
        r4.a(r5, r2, r7);
    L_0x0181:
        r2 = r1.c;
        if (r2 == 0) goto L_0x01a5;
    L_0x0185:
        r2 = r13.b;
        r2 = r2.a();
        r4 = new java.lang.Object[r6];
        r5 = r1.c;
        r4[r3] = r5;
        r3 = "Load-balancing config: {0}";
        r2.a(r6, r3, r4);
        r14 = r14.b();
        r2 = a;
        r3 = r1.c;
        r14.a(r2, r3);
        r14 = r14.a();
    L_0x01a5:
        r2 = r13.c;
        r3 = r1.b;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x01eb;
    L_0x01af:
        r3 = r2.b();
        if (r3 != 0) goto L_0x01eb;
    L_0x01b5:
        r1 = defpackage.bavx.j;
        r0 = java.lang.String.valueOf(r0);
        r14 = java.lang.String.valueOf(r14);
        r3 = r0.length();
        r4 = r14.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 56;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "Name resolver returned no usable address. addrs=";
        r5.append(r3);
        r5.append(r0);
        r0 = ", attrs=";
        r5.append(r0);
        r5.append(r14);
        r14 = r5.toString();
        r14 = r1.a(r14);
        r2.a(r14);
        return;
    L_0x01eb:
        r0 = defpackage.bauc.a();
        r1 = r1.b;
        r0.a = r1;
        r0.b = r14;
        r14 = r0.a();
        r2.a(r14);
        return;
    L_0x01fd:
        r14 = move-exception;
        r0 = defpackage.bavx.i;
        r14 = r14.getMessage();
        r14 = r0.a(r14);
        r0 = r13.b;
        r1 = defpackage.basp.TRANSIENT_FAILURE;
        r4 = new baxx;
        r4.<init>(r14);
        r0.a(r1, r4);
        r14 = r13.c;
        r14.a();
        r13.d = r2;
        r14 = new baya;
        r14.<init>(r3);
        r13.c = r14;
        return;
    L_0x0223:
        r0 = new java.lang.IllegalArgumentException;
        r1 = a;
        r14 = r14.a(r1);
        r14 = java.lang.String.valueOf(r14);
        r1 = r14.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 53;
        r2.<init>(r1);
        r1 = "Unexpected ATTR_LOAD_BALANCING_CONFIG from upstream: ";
        r2.append(r1);
        r2.append(r14);
        r14 = r2.toString();
        r0.<init>(r14);
        goto L_0x024b;
    L_0x024a:
        throw r0;
    L_0x024b:
        goto L_0x024a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baxv.a(bauc):void");
    }

    public final void a(bavx bavx) {
        this.c.a(bavx);
    }

    public final void a(baue baue, bass bass) {
        this.c.a(baue, bass);
    }

    public final void a() {
        this.c.a();
        this.c = null;
    }
}
