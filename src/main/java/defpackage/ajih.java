package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajih */
public final class ajih implements Callable {
    private final ovi a;
    private final aahr b;
    private final String c;
    private final ajid d;
    private final Integer e;

    public ajih(aahr aahr, ovi ovi, String str, Integer num, ajid ajid) {
        this.d = ajid;
        this.a = (ovi) amqw.a((Object) ovi);
        this.b = (aahr) amqw.a((Object) aahr);
        this.c = (String) amqw.a((Object) str);
        this.e = num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    public final /* synthetic */ java.lang.Object call() {
        /*
        r9 = this;
        r0 = r9.e;
        r1 = "cpn";
        if (r0 != 0) goto L_0x001f;
    L_0x0006:
        r0 = r9.b;
        r0 = r0.d;
        r0 = defpackage.xvo.a(r0);
        r2 = r9.c;
        r0.a(r1, r2);
        r1 = "headm";
        r2 = "3";
        r0.a(r1, r2);
        r0 = r0.a();
        goto L_0x003b;
    L_0x001f:
        r0 = r9.b;
        r0 = r0.d;
        r0 = defpackage.xvo.a(r0);
        r2 = r9.c;
        r0.a(r1, r2);
        r1 = r9.e;
        r1 = java.lang.String.valueOf(r1);
        r2 = "sq";
        r0.a(r2, r1);
        r0 = r0.a();
    L_0x003b:
        r2 = r0;
        r0 = new ovm;
        r3 = 0;
        r5 = -1;
        r7 = 0;
        r1 = r0;
        r1.<init>(r2, r3, r5, r7);
        r1 = new ovc;
        r1.<init>();
        r2 = new owu;
        r3 = r9.a;
        r2.<init>(r3, r1);
        r2.a(r0);
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r3 = new byte[r0];
    L_0x005a:
        r4 = 0;
        r5 = r2.a(r3, r4, r0);
        if (r5 > 0) goto L_0x005a;
    L_0x0061:
        r2.a();
        r0 = r1.a;
        r1 = 0;
        if (r0 == 0) goto L_0x006e;
    L_0x0069:
        r0 = r0.toByteArray();
        goto L_0x006f;
    L_0x006e:
        r0 = r1;
    L_0x006f:
        r2 = r0.length;
        if (r2 == 0) goto L_0x0125;
    L_0x0072:
        r2 = new oza;
        r2.<init>(r0);
        r0 = new ajij;
        r0.<init>();
    L_0x007c:
        r3 = r2.b();
        if (r3 <= 0) goto L_0x00fb;
    L_0x0082:
        r3 = r2.k();
        r5 = r3 + -4;
        r6 = 8;
        if (r3 < r6) goto L_0x00f3;
    L_0x008c:
        r6 = r2.b();
        if (r5 > r6) goto L_0x00f3;
    L_0x0092:
        r3 = r3 + -8;
        r5 = 4;
        r5 = r2.e(r5);
        r5 = r5.toLowerCase();
        r6 = r5.hashCode();
        r7 = 3117308; // 0x2f90fc float:4.368279E-39 double:1.540155E-317;
        r8 = 1;
        if (r6 == r7) goto L_0x00b7;
    L_0x00a7:
        r7 = 3346442; // 0x33100a float:4.689364E-39 double:1.653362E-317;
        if (r6 == r7) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00c1;
    L_0x00ad:
        r6 = "mdat";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00c1;
    L_0x00b5:
        r5 = 1;
        goto L_0x00c2;
    L_0x00b7:
        r6 = "emsg";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00c1;
    L_0x00bf:
        r5 = 0;
        goto L_0x00c2;
    L_0x00c1:
        r5 = -1;
    L_0x00c2:
        if (r5 == 0) goto L_0x00d2;
    L_0x00c4:
        if (r5 == r8) goto L_0x00ca;
    L_0x00c6:
        r2.d(r3);
        goto L_0x007c;
    L_0x00ca:
        r3 = r9.d;
        if (r3 == 0) goto L_0x007c;
    L_0x00ce:
        r3.a(r0, r2, r1);
        goto L_0x007c;
    L_0x00d2:
        r2.i();
        r2.r();
        r2.r();
        r2.i();
        r2.i();
        r2.i();
        r2.i();
        r1 = new afhr;
        r3 = defpackage.afhr.a(r2);
        r1.<init>(r3);
        r0.a = r1;
        goto L_0x007c;
    L_0x00f3:
        r0 = new oae;
        r1 = "Bad atom size";
        r0.<init>(r1);
        throw r0;
    L_0x00fb:
        r1 = r0.a;
        if (r1 == 0) goto L_0x011d;
    L_0x00ff:
        r1 = r0.b;
        if (r1 == 0) goto L_0x0115;
    L_0x0103:
        r1 = r0.c;
        if (r1 == 0) goto L_0x010d;
    L_0x0107:
        r1 = new ajig;
        r1.<init>(r0);
        return r1;
    L_0x010d:
        r0 = new oae;
        r1 = "Missing segment time";
        r0.<init>(r1);
        throw r0;
    L_0x0115:
        r0 = new oae;
        r1 = "Missing cues";
        r0.<init>(r1);
        throw r0;
    L_0x011d:
        r0 = new oae;
        r1 = "Missing emsg";
        r0.<init>(r1);
        throw r0;
    L_0x0125:
        r0 = new java.io.IOException;
        r1 = "Received empty segment";
        r0.<init>(r1);
        goto L_0x012e;
    L_0x012d:
        throw r0;
    L_0x012e:
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajih.call():java.lang.Object");
    }
}
