package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.youtube.R;

/* renamed from: ahoz */
public final class ahoz extends ahnd {
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    private final Resources j;
    private final ahre k;
    private final ahne m;
    private final ahrg n;
    private final ahpt o = new ahpt(this.k, 0.5f, 1.0f);

    public ahoz(Resources resources, bcaa bcaa, bcaa bcaa2, ahrd ahrd, ahpn ahpn, ahpb ahpb) {
        super(new ahou((ahpn) ahpn.clone(), 0.0f, 0.0f));
        this.j = (Resources) amqw.a((Object) resources);
        Bitmap a = ahsl.a(resources, (int) R.raw.vr_hq);
        float a2 = ahsl.a((float) a.getWidth());
        float a3 = ahsl.a((float) a.getHeight());
        this.k = new ahre(a, ahsm.a(a2, a3, ahsm.c), (ahpn) ahpn.clone(), bcaa);
        this.k.a(this.o);
        ahsm a4 = ahsm.a(a2, ahqc.b, ahsm.c);
        this.m = new ahne(a4, (ahpn) ahpn.clone(), ahne.a(ahne.b(-1695465), a4.f), bcaa2);
        this.m.b(0.0f, ((-a3) * 7.0f) / 12.0f, 0.0f);
        this.m.b(new ahpz(this.m, new float[]{0.0f, 1.0f, 1.0f}, new float[]{1.0f, 1.0f, 1.0f}));
        this.n = new ahrg(ahrd, (ahpn) ahpn.clone(), bcaa2, this.k, (a3 + a3) / 3.0f);
        a(this.k);
        a(this.m);
        a(this.n);
        b(a2, a3);
        this.c = new ahoy(this, ahpb);
        c();
    }

    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:15:0x002a, code skipped:
            if (r0 != null) goto L_0x002f;
     */
    public final void c() {
        /*
        r6 = this;
        r0 = r6.e;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x000d;
    L_0x0006:
        r0 = r6.g;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x000d;
    L_0x000b:
        r0 = 0;
        goto L_0x000e;
    L_0x000d:
        r0 = 1;
    L_0x000e:
        r6.f = r0;
        r3 = r6.o;
        if (r0 != 0) goto L_0x0017;
    L_0x0014:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        goto L_0x0019;
    L_0x0017:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0019:
        r3.a = r4;
        r3 = r6.m;
        r4 = r6.g;
        r3.h = r4;
        if (r0 != 0) goto L_0x0028;
    L_0x0023:
        r0 = r6.h;
        if (r0 != 0) goto L_0x002f;
    L_0x0027:
        goto L_0x002d;
    L_0x0028:
        r0 = r6.i;
        if (r0 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x002f;
    L_0x002d:
        r0 = "";
    L_0x002f:
        if (r4 != 0) goto L_0x0035;
    L_0x0031:
        r3 = 2131953870; // 0x7f1308ce float:1.9544223E38 double:1.0533251657E-314;
        goto L_0x0038;
    L_0x0035:
        r3 = 2131953873; // 0x7f1308d1 float:1.954423E38 double:1.053325167E-314;
    L_0x0038:
        r4 = r6.n;
        r5 = r6.j;
        r2 = new java.lang.Object[r2];
        r2[r1] = r0;
        r0 = r5.getString(r3, r2);
        r1 = r4.a;
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahoz.c():void");
    }
}
