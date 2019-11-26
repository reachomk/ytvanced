package defpackage;

import java.util.Map;

/* renamed from: alid */
public final class alid implements aaap {
    public final xoi a;
    private final aarh b;
    private final aaas c;
    private final acwa d;

    public alid(aarh aarh, xoi xoi, aaas aaas, acwa acwa) {
        this.b = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (acwa) amqw.a((Object) acwa);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    public final void a(defpackage.apxu r8, java.util.Map r9) {
        /*
        r7 = this;
        r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r8.a(r0);
        r1 = r8.h;
        r2 = r0.d;
        r1 = r1.b(r2);
        if (r1 != 0) goto L_0x0016;
    L_0x0013:
        r0 = r0.b;
        goto L_0x001a;
    L_0x0016:
        r0 = r0.a(r1);
    L_0x001a:
        r0 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r0;
        r1 = r0.c;
        if (r1 != 0) goto L_0x0022;
    L_0x0020:
        r1 = defpackage.aseq.d;
    L_0x0022:
        r1 = r1.c;
        r2 = 0;
        if (r1 == 0) goto L_0x0029;
    L_0x0027:
        r0 = r2;
        goto L_0x003c;
    L_0x0029:
        r1 = r0.d;
        if (r1 != 0) goto L_0x002f;
    L_0x002d:
        r1 = defpackage.aseo.i;
    L_0x002f:
        r1 = r1.a;
        r1 = r1 & 2;
        if (r1 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0027;
    L_0x0036:
        r0 = r0.d;
        if (r0 != 0) goto L_0x003c;
    L_0x003a:
        r0 = defpackage.aseo.i;
    L_0x003c:
        r1 = r7.d;
        r1 = defpackage.alia.a(r9, r1);
        if (r0 != 0) goto L_0x0092;
    L_0x0044:
        r0 = byte[].class;
        r3 = "click_tracking_params";
        r0 = defpackage.xsb.a(r9, r3, r0);
        r0 = (byte[]) r0;
        if (r0 == 0) goto L_0x0059;
    L_0x0050:
        r3 = new acvs;
        r3.<init>(r0);
        r0 = 3;
        r1.a(r0, r3, r2);
    L_0x0059:
        r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r8.a(r0);
        r8 = r8.h;
        r1 = r0.d;
        r8 = r8.b(r1);
        if (r8 != 0) goto L_0x006f;
    L_0x006c:
        r8 = r0.b;
        goto L_0x0073;
    L_0x006f:
        r8 = r0.a(r8);
    L_0x0073:
        r8 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r8;
        r0 = r7.b;
        r1 = r8.b;
        if (r1 != 0) goto L_0x007d;
    L_0x007b:
        r1 = defpackage.asfa.f;
    L_0x007d:
        r8 = r8.c;
        if (r8 == 0) goto L_0x0083;
    L_0x0081:
        r2 = r8;
        goto L_0x0086;
    L_0x0083:
        r8 = defpackage.aseq.d;
        goto L_0x0081;
    L_0x0086:
        r6 = new alic;
        r6.<init>(r7, r9);
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0.a(r1, r2, r3, r4, r5, r6);
        return;
    L_0x0092:
        r7.a(r9, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alid.a(apxu, java.util.Map):void");
    }

    public final void a(Map map, aseo aseo) {
        if (aseo.d.size() != 0) {
            this.c.a(aseo.d, null);
        }
        if ((aseo.a & 2) != 0) {
            aaas a = alia.a(map, this.c);
            apxu apxu = aseo.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            a.a(apxu, null);
        }
        alif alif = (alif) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", alif.class);
        if (alif != null) {
            alif.f();
        }
    }
}
