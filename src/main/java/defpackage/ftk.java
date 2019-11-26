package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Map;

/* renamed from: ftk */
public final class ftk implements aaas {
    private static final ftj a = new ftj();
    private final Activity b;
    private final xci c;
    private final bcaa d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final egv h;
    private final ejz i;
    private final fpt j;
    private final boolean k;

    public ftk(Activity activity, xci xci, bcaa bcaa, Map map, Map map2, Map map3, egv egv, ejz ejz, fpt fpt, akev akev) {
        this.b = activity;
        this.c = xci;
        this.d = bcaa;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = egv;
        this.i = ejz;
        this.j = fpt;
        this.k = akev.p();
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

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011 A:{Splitter:B:3:0x000c, ExcHandler: aabf (r11_1 'e' aabf)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:5:0x0011, code skipped:
            r11 = move-exception;
     */
    /* JADX WARNING: Missing block: B:6:0x0014, code skipped:
            r4 = move-exception;
     */
    /* JADX WARNING: Missing block: B:8:?, code skipped:
            defpackage.afpc.a(2, defpackage.afpf.main, r0, r4);
            r4 = null;
     */
    /* JADX WARNING: Missing block: B:53:0x00f2, code skipped:
            defpackage.xpr.a(r10.b, r11.getMessage(), 1);
     */
    public final void a(defpackage.apxu r11, java.util.Map r12) {
        /*
        r10 = this;
        r0 = "Failed to process the lite Command";
        r1 = r10.b;
        defpackage.amqw.a(r1);
        if (r11 == 0) goto L_0x00fb;
    L_0x0009:
        r1 = 2;
        r2 = 1;
        r3 = 0;
        r4 = defpackage.aaar.a(r11);	 Catch:{ IllegalStateException -> 0x0014, aabf -> 0x0011 }
        goto L_0x001b;
    L_0x0011:
        r11 = move-exception;
        goto L_0x00f2;
    L_0x0014:
        r4 = move-exception;
        r5 = defpackage.afpf.main;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        defpackage.afpc.a(r1, r5, r0, r4);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r3;
    L_0x001b:
        if (r4 == 0) goto L_0x005b;
    L_0x001d:
        r4 = r4.getClass();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = r10.g;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = defpackage.ftk.a(r4, r5);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r5 != 0) goto L_0x005a;
    L_0x0029:
        r5 = r10.k;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r5 != 0) goto L_0x0039;
    L_0x002d:
        r5 = "com.google.protos.youtube.elements.CommandOuterClass.Command";
        r6 = r4.getCanonicalName();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = r5.equals(r6);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r5 != 0) goto L_0x005b;
    L_0x0039:
        r5 = r10.e;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = defpackage.ftk.a(r4, r5);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r5 != 0) goto L_0x005a;
    L_0x0041:
        r5 = r10.i;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = r5.a(r11);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r5 != 0) goto L_0x005b;
    L_0x0049:
        r3 = r10.f;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r3 = defpackage.ftk.a(r4, r3);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r3 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x005b;
    L_0x0052:
        r11 = new aabf;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r12 = "Unknown Command encountered";
        r11.<init>(r12);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        throw r11;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
    L_0x005a:
        r3 = r5;
    L_0x005b:
        if (r3 == 0) goto L_0x00ea;
    L_0x005d:
        r4 = r10.j;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r4.b();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = r10.b;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r4.isInstance(r5);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r4 == 0) goto L_0x008f;
    L_0x006b:
        r4 = "com.google.android.apps.youtube.app.endpoint.flags";
        r5 = 0;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = defpackage.xsb.c(r12, r4, r5);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = (java.lang.Integer) r4;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r4.intValue();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r4 & r2;
        r5 = r3 instanceof defpackage.dxi;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r4 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x008f;
    L_0x0082:
        if (r5 != 0) goto L_0x008f;
    L_0x0084:
        r4 = r10.d;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = r4.get();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4 = (defpackage.fjo) r4;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4.c();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
    L_0x008f:
        r4 = r10.h;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = new java.util.ArrayList;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r6 = r11.c;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5.<init>(r6);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r5 = r5.iterator();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
    L_0x009c:
        r6 = r5.hasNext();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r6 == 0) goto L_0x00e0;
    L_0x00a2:
        r6 = r5.next();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r6 = (defpackage.aule) r6;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r6 == 0) goto L_0x009c;
    L_0x00aa:
        r7 = r6.a;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r7 = r7 & r2;
        if (r7 == 0) goto L_0x009c;
    L_0x00af:
        r7 = r6.b;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r7 = r4.a(r7, r12);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r8 = r4.a;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r8 = r8.a(r7);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r8 != 0) goto L_0x00c1;
    L_0x00bd:
        r4.a(r7, r6);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        goto L_0x009c;
    L_0x00c1:
        r8 = android.os.Looper.myLooper();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r9 = android.os.Looper.getMainLooper();	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        if (r8 != r9) goto L_0x00d6;
    L_0x00cb:
        r8 = r4.b;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r9 = new eha;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r9.<init>(r4, r7, r6);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r8.execute(r9);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        goto L_0x009c;
    L_0x00d6:
        r8 = r4.a;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r7 = r8.b(r7);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r4.a(r7, r6);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        goto L_0x009c;
    L_0x00e0:
        r3.a(r11, r12);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r11 = r10.c;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r12 = a;	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
        r11.c(r12);	 Catch:{ aabf -> 0x0011, IllegalStateException -> 0x00eb }
    L_0x00ea:
        return;
    L_0x00eb:
        r11 = move-exception;
        r12 = defpackage.afpf.main;
        defpackage.afpc.a(r1, r12, r0, r11);
        return;
    L_0x00f2:
        r12 = r10.b;
        r11 = r11.getMessage();
        defpackage.xpr.a(r12, r11, r2);
    L_0x00fb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftk.a(apxu, java.util.Map):void");
    }

    private static aaap a(Class cls, Map map) {
        bcaa bcaa = (bcaa) map.get(cls);
        return bcaa != null ? (aaap) bcaa.get() : null;
    }
}
