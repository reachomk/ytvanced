package defpackage;

import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: zdc */
public final class zdc {
    public static boolean a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                if (((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).d.b() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    public static defpackage.atun b(defpackage.apxu r5) {
        /*
        r0 = defpackage.zdc.a(r5);
        r1 = 0;
        if (r0 == 0) goto L_0x0063;
    L_0x0007:
        r0 = com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r2 = r0.d;
        r5 = r5.b(r2);
        if (r5 != 0) goto L_0x001d;
    L_0x001a:
        r5 = r0.b;
        goto L_0x0021;
    L_0x001d:
        r5 = r0.a(r5);
    L_0x0021:
        r5 = (com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint) r5;
        r5 = r5.d;
        r5 = r5.d();
        r0 = new ajvp;
        r0.<init>();
        defpackage.aocf.mergeFrom(r0, r5);	 Catch:{ aocg -> 0x0063 }
        r5 = r0.b;
        if (r5 == 0) goto L_0x003c;
    L_0x0035:
        r5 = r5.a;
        if (r5 == 0) goto L_0x003c;
    L_0x0039:
        r5 = r5.a;
        goto L_0x003d;
    L_0x003c:
        r5 = r1;
    L_0x003d:
        if (r5 == 0) goto L_0x0046;
    L_0x003f:
        r5 = r5.a;
        if (r5 == 0) goto L_0x0046;
    L_0x0043:
        r5 = r5.f;
        goto L_0x0047;
    L_0x0046:
        r5 = r1;
    L_0x0047:
        r0 = r5.length;
        r2 = 0;
    L_0x0049:
        if (r2 >= r0) goto L_0x0063;
    L_0x004b:
        r3 = r5[r2];
        r4 = r3.a;
        r4 = r4 & 1;
        if (r4 != 0) goto L_0x0056;
    L_0x0053:
        r2 = r2 + 1;
        goto L_0x0049;
    L_0x0056:
        r5 = r3.b;
        if (r5 != 0) goto L_0x005c;
    L_0x005a:
        r5 = defpackage.atuj.f;
    L_0x005c:
        r5 = r5.b;
        if (r5 != 0) goto L_0x0062;
    L_0x0060:
        r5 = defpackage.atun.g;
    L_0x0062:
        return r5;
    L_0x0063:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdc.b(apxu):atun");
    }
}
