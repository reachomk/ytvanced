package defpackage;

import com.google.android.youtube.R;

/* renamed from: jbc */
final class jbc implements jbp {
    private final /* synthetic */ hpr a;
    private final /* synthetic */ jba b;

    jbc(jba jba, hpr hpr) {
        this.b = jba;
        this.a = hpr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    public final java.lang.CharSequence a(int r10) {
        /*
        r9 = this;
        r0 = (long) r10;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = r2 * r0;
        r10 = r9.a;
        r10 = r10.d;
        r10 = r10.g();
        r10 = r10.ordinal();
        r4 = 1;
        if (r10 == r4) goto L_0x0031;
    L_0x0015:
        r5 = 3;
        if (r10 == r5) goto L_0x002d;
    L_0x0018:
        r5 = 4;
        if (r10 == r5) goto L_0x0031;
    L_0x001b:
        r5 = 5;
        if (r10 == r5) goto L_0x0031;
    L_0x001e:
        r5 = 7;
        if (r10 == r5) goto L_0x002d;
    L_0x0021:
        r5 = 8;
        if (r10 == r5) goto L_0x002d;
    L_0x0025:
        r5 = 9;
        if (r10 == r5) goto L_0x002d;
    L_0x0029:
        r5 = 7340032; // 0x700000 float:1.0285576E-38 double:3.6264577E-317;
        goto L_0x0034;
    L_0x002d:
        r5 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        goto L_0x0034;
    L_0x0031:
        r5 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
    L_0x0034:
        r10 = r9.b;
        r10 = r10.c;
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = r10.getResources();
        r0 = defpackage.xvd.d(r8, r0);
        r1 = 0;
        r7[r1] = r0;
        r0 = r9.b;
        r2 = r2 / r5;
        r3 = (int) r2;
        r2 = 90;
        if (r3 <= r2) goto L_0x0064;
    L_0x004e:
        r0 = r0.c;
        r2 = new java.lang.Object[r4];
        r3 = (float) r3;
        r5 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r3 = r3 / r5;
        r3 = java.lang.Float.valueOf(r3);
        r2[r1] = r3;
        r1 = 2131951902; // 0x7f13011e float:1.9540232E38 double:1.0533241934E-314;
        r0 = r0.getString(r1, r2);
        goto L_0x0079;
    L_0x0064:
        r0 = r0.c;
        r0 = r0.getResources();
        r2 = new java.lang.Object[r4];
        r5 = java.lang.Integer.valueOf(r3);
        r2[r1] = r5;
        r1 = 2131886087; // 0x7f120007 float:1.9406743E38 double:1.0532916764E-314;
        r0 = r0.getQuantityString(r1, r3, r2);
    L_0x0079:
        r7[r4] = r0;
        r0 = 2131951901; // 0x7f13011d float:1.954023E38 double:1.053324193E-314;
        r10 = r10.getString(r0, r7);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbc.a(int):java.lang.CharSequence");
    }

    public final CharSequence b(int i) {
        return this.b.c.getString(R.string.auto_offline_storage_label_end, new Object[]{xvd.d(this.b.c.getResources(), (long) (this.a.b() - i))});
    }
}
