package defpackage;

/* renamed from: dzc */
public final class dzc implements aaap {
    private final ahcd a;

    public dzc(ahcd ahcd) {
        this.a = (ahcd) amqw.a((Object) ahcd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    public final void a(defpackage.apxu r6, java.util.Map r7) {
        /*
        r5 = this;
        r0 = com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r6.a(r0);
        r6 = r6.h;
        r1 = r0.d;
        r6 = r6.b(r1);
        if (r6 != 0) goto L_0x0016;
    L_0x0013:
        r6 = r0.b;
        goto L_0x001a;
    L_0x0016:
        r6 = r0.a(r6);
    L_0x001a:
        r6 = (com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) r6;
        r0 = r6.c;
        r0 = defpackage.avov.a(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r0 = 1;
    L_0x0027:
        r0 = r0 + -1;
        if (r0 == r1) goto L_0x005e;
    L_0x002b:
        r7 = 2;
        if (r0 == r7) goto L_0x0051;
    L_0x002e:
        r6 = r6.c;
        r6 = defpackage.avov.a(r6);
        if (r6 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r6 = 1;
    L_0x0038:
        r7 = new java.lang.StringBuilder;
        r0 = 45;
        r7.<init>(r0);
        r0 = "Unsupported Offline Video Action: ";
        r7.append(r0);
        r6 = r6 + -1;
        r7.append(r6);
        r6 = r7.toString();
        defpackage.xtl.d(r6);
        return;
    L_0x0051:
        r7 = r5.a;
        r6 = r6.b;
        r0 = 0;
        r0 = defpackage.ahbv.a(r0);
        r7.a(r6, r0);
        return;
    L_0x005e:
        r0 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r0 = defpackage.xsb.c(r7, r0);
        r2 = r0 instanceof defpackage.aqfs;
        r3 = 0;
        if (r2 == 0) goto L_0x0084;
    L_0x0069:
        r2 = r0;
        r2 = (defpackage.aqfs) r2;
        r4 = r2.s;
        if (r4 != 0) goto L_0x0072;
    L_0x0070:
        r4 = defpackage.aqfu.c;
    L_0x0072:
        r4 = r4.a;
        r1 = r1 & r4;
        if (r1 == 0) goto L_0x00af;
    L_0x0077:
        r1 = r2.s;
        if (r1 != 0) goto L_0x007d;
    L_0x007b:
        r1 = defpackage.aqfu.c;
    L_0x007d:
        r1 = r1.b;
        if (r1 != 0) goto L_0x00b0;
    L_0x0081:
        r1 = defpackage.avsj.h;
        goto L_0x00b0;
    L_0x0084:
        r1 = r0 instanceof defpackage.ajya;
        r2 = 60572968; // 0x39c4528 float:9.184733E-37 double:2.99270226E-316;
        if (r1 == 0) goto L_0x009b;
    L_0x008b:
        r1 = r0;
        r1 = (defpackage.ajya) r1;
        r1 = r1.m;
        if (r1 == 0) goto L_0x00af;
    L_0x0092:
        r4 = r1.a;
        if (r4 != r2) goto L_0x00af;
    L_0x0096:
        r1 = r1.b;
        r1 = (defpackage.avsj) r1;
        goto L_0x00b0;
    L_0x009b:
        r1 = r0 instanceof defpackage.ajxx;
        if (r1 == 0) goto L_0x00af;
    L_0x009f:
        r1 = r0;
        r1 = (defpackage.ajxx) r1;
        r1 = r1.m;
        if (r1 == 0) goto L_0x00af;
    L_0x00a6:
        r4 = r1.a;
        if (r4 != r2) goto L_0x00af;
    L_0x00aa:
        r1 = r1.b;
        r1 = (defpackage.avsj) r1;
        goto L_0x00b0;
    L_0x00af:
        r1 = r3;
    L_0x00b0:
        if (r1 != 0) goto L_0x00dc;
    L_0x00b2:
        r1 = r6.a;
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x00dd;
    L_0x00b8:
        r1 = r6.d;
        if (r1 != 0) goto L_0x00be;
    L_0x00bc:
        r1 = defpackage.axak.a;
    L_0x00be:
        r2 = com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass.offlineabilityRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r3 = r2.d;
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x00d4;
    L_0x00d1:
        r1 = r2.b;
        goto L_0x00d8;
    L_0x00d4:
        r1 = r2.a(r1);
    L_0x00d8:
        r3 = r1;
        r3 = (defpackage.avsj) r3;
        goto L_0x00dd;
    L_0x00dc:
        r3 = r1;
    L_0x00dd:
        if (r3 != 0) goto L_0x00fe;
    L_0x00df:
        r6 = java.lang.String.valueOf(r0);
        r7 = r6.length();
        r0 = new java.lang.StringBuilder;
        r7 = r7 + 39;
        r0.<init>(r7);
        r7 = "Object is not an offlineable playlist: ";
        r0.append(r7);
        r0.append(r6);
        r6 = r0.toString();
        defpackage.xtl.c(r6);
        return;
    L_0x00fe:
        r0 = defpackage.acvx.class;
        r1 = "com.google.android.libraries.youtube.logging.interaction_logger";
        r7 = defpackage.xsb.a(r7, r1, r0);
        r7 = (defpackage.acvx) r7;
        r0 = r5.a;
        r6 = r6.b;
        r0.a(r6, r3, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzc.a(apxu, java.util.Map):void");
    }
}
