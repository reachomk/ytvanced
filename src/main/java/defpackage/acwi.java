package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: acwi */
public final class acwi implements aaas {
    public static final String a;
    public static final String b = String.valueOf(d).concat(".log_click");
    public static final String c = String.valueOf(d).concat(".click_client_data");
    private static final String d;
    private static final String e = String.valueOf(d).concat(".csn");
    private final aaas f;
    private final acwa g;
    private final Set h;
    private final Set i;

    public acwi(aaas aaas, acwa acwa) {
        this(aaas, acwa, Collections.emptySet(), Collections.emptySet());
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public acwi(aaas aaas, acwa acwa, Set set, Set set2) {
        if (aaas instanceof acwi) {
            this.f = ((acwi) aaas).f;
        } else {
            this.f = (aaas) amqw.a((Object) aaas);
        }
        this.g = (acwa) amqw.a((Object) acwa);
        this.h = (Set) amqw.a((Object) set);
        this.i = (Set) amqw.a((Object) set2);
    }

    /* JADX WARNING: Missing block: B:22:0x008b, code skipped:
            if (r9.i.contains(r3.getClass()) != false) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:24:0x009d, code skipped:
            if (((java.lang.Boolean) defpackage.xsb.c(r11, b, java.lang.Boolean.valueOf(false))).booleanValue() != false) goto L_0x009f;
     */
    public final void a(defpackage.apxu r10, java.util.Map r11) {
        /*
        r9 = this;
        r0 = r9.g;
        r0 = r0.t();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = defpackage.acvx.g;
    L_0x000a:
        if (r11 == 0) goto L_0x0018;
    L_0x000c:
        r1 = "com.google.android.libraries.youtube.logging.interaction_logger";
        r1 = r11.get(r1);
        r1 = (defpackage.acvx) r1;
        if (r1 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        r0 = r1;
    L_0x0018:
        r1 = 0;
        r2 = 0;
        if (r10 == 0) goto L_0x0137;
    L_0x001c:
        r3 = com.google.protos.youtube.api.innertube.UrlEndpointOuterClass.urlEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r10.a(r3);
        r4 = r10.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x002f:
        r3 = com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass.appStoreEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r10.a(r3);
        r4 = r10.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x0042:
        r3 = com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass.androidAppEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r10.a(r3);
        r4 = r10.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x0055:
        r3 = com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r10.a(r3);
        r4 = r10.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x0068:
        r3 = com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r10.a(r3);
        r4 = r10.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x007b:
        r3 = defpackage.aaar.a(r10);
        if (r3 == 0) goto L_0x008d;
    L_0x0081:
        r4 = r9.i;
        r3 = r3.getClass();
        r3 = r4.contains(r3);
        if (r3 != 0) goto L_0x009f;
    L_0x008d:
        r3 = b;
        r4 = java.lang.Boolean.valueOf(r2);
        r3 = defpackage.xsb.c(r11, r3, r4);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 == 0) goto L_0x0137;
    L_0x009f:
        r3 = r10.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x0137;
    L_0x00a5:
        r3 = new acvs;
        r4 = r10.b;
        r3.<init>(r4);
        r4 = c;
        r4 = defpackage.xsb.c(r11, r4);
        r5 = r4 instanceof defpackage.atst;
        if (r5 == 0) goto L_0x00b9;
    L_0x00b6:
        r4 = (defpackage.atst) r4;
        goto L_0x012c;
    L_0x00b9:
        r4 = com.google.protos.youtube.api.innertube.UrlEndpointOuterClass.urlEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r10.a(r4);
        r5 = r10.h;
        r4 = r4.d;
        r4 = r5.a(r4);
        if (r4 != 0) goto L_0x00ce;
    L_0x00cc:
        r4 = r1;
        goto L_0x012c;
    L_0x00ce:
        r4 = defpackage.atst.q;
        r4 = r4.createBuilder();
        r4 = (defpackage.atss) r4;
        r5 = defpackage.atsl.c;
        r5 = r5.createBuilder();
        r5 = (defpackage.atsk) r5;
        r6 = com.google.protos.youtube.api.innertube.UrlEndpointOuterClass.urlEndpoint;
        r6 = defpackage.anxl.checkIsLite(r6);
        r10.a(r6);
        r7 = r10.h;
        r8 = r6.d;
        r7 = r7.b(r8);
        if (r7 != 0) goto L_0x00f4;
    L_0x00f1:
        r6 = r6.b;
        goto L_0x00f8;
    L_0x00f4:
        r6 = r6.a(r7);
    L_0x00f8:
        r6 = (defpackage.ayvl) r6;
        r6 = r6.b;
        r5.copyOnWrite();
        r7 = r5.instance;
        r7 = (defpackage.atsl) r7;
        if (r6 == 0) goto L_0x0131;
    L_0x0105:
        r8 = r7.a;
        r8 = r8 | 1;
        r7.a = r8;
        r7.b = r6;
        r4.copyOnWrite();
        r6 = r4.instance;
        r6 = (defpackage.atst) r6;
        r5 = r5.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.atsl) r5;
        r6.c = r5;
        r5 = r6.a;
        r5 = r5 | 1;
        r6.a = r5;
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.atst) r4;
    L_0x012c:
        r5 = 3;
        r0.a(r5, r3, r4);
        goto L_0x0137;
    L_0x0131:
        r10 = new java.lang.NullPointerException;
        r10.<init>();
        throw r10;
    L_0x0137:
        if (r10 == 0) goto L_0x0169;
    L_0x0139:
        r3 = defpackage.aaar.a(r10);
        if (r3 == 0) goto L_0x0169;
    L_0x013f:
        r4 = r9.h;
        r3 = r3.getClass();
        r3 = r4.contains(r3);
        if (r3 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x0169;
    L_0x014c:
        if (r11 == 0) goto L_0x0156;
    L_0x014e:
        r1 = e;
        r1 = r11.get(r1);
        r1 = (java.lang.String) r1;
    L_0x0156:
        r3 = android.text.TextUtils.isEmpty(r1);
        if (r3 == 0) goto L_0x0165;
    L_0x015c:
        r1 = r0.d();
        r10 = defpackage.acwi.a(r10, r1);
        goto L_0x0169;
    L_0x0165:
        r10 = defpackage.acwi.a(r10, r1);
    L_0x0169:
        r1 = a;
        r2 = java.lang.Integer.valueOf(r2);
        r1 = defpackage.xsb.c(r11, r1, r2);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r1 = r1 & 1;
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0183;
    L_0x017f:
        r10 = r0.a(r10);
    L_0x0183:
        r0 = r9.f;
        r0.a(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwi.a(apxu, java.util.Map):void");
    }

    private static apxu a(apxu apxu, String str) {
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        if (TextUtils.isEmpty(str)) {
            apxx.c(axft.b);
            return (apxu) ((anxl) apxx.build());
        }
        if (!apxx.a(axft.b)) {
            apxx.a(axft.b, axfr.c);
        }
        axfq axfq = (axfq) ((anxo) ((axfr) apxx.b(axft.b)).toBuilder());
        axfq.a(str);
        apxx.a(axft.b, (axfr) ((anxl) axfq.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static Map a(Object obj) {
        return acwi.a(obj, true);
    }

    public static Map a(Map map) {
        return acwi.a(map, true);
    }

    public static Map a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    public static Map a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    static {
        String name = acwi.class.getName();
        d = name;
        a = name.concat(".flags");
    }
}
