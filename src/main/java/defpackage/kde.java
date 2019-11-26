package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kde */
public final class kde implements akot {
    public final RecyclerView a;
    public final epv b;
    private final Context c;
    private final akpe d;
    private arut e;
    private akox f;
    private akox g;
    private final akod h = new akod();
    private final akpk i = new akpk();

    public kde(Context context, epv epv, akpe akpe, ViewGroup viewGroup) {
        this.c = context;
        this.a = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.horizontal_buttons_layout, viewGroup, false);
        this.a.a(new kdi(context));
        this.b = epv;
        this.d = akpe;
    }

    public final View K_() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010a  */
    /* renamed from: a */
    public final void a_(defpackage.akor r23, defpackage.arut r24) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r24;
        r2 = r0.a;
        r3 = 1;
        defpackage.xpr.a(r2, r3);
        r2 = r23;
        r2 = r2.a;
        r4 = r1.d;
        r4 = r4.d();
        r5 = 0;
        r2.a(r4, r5);
        r4 = r0.h;
        r4.a = r2;
        r2 = r0.e;
        if (r2 == r1) goto L_0x011f;
    L_0x0020:
        r0.e = r1;
        r2 = r1.a;
        r2 = r2 & r3;
        if (r2 == 0) goto L_0x003c;
    L_0x0027:
        r2 = r1.c;
        if (r2 != 0) goto L_0x002d;
    L_0x002b:
        r2 = defpackage.arur.c;
    L_0x002d:
        r4 = r2.a;
        r5 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r4 != r5) goto L_0x003a;
    L_0x0034:
        r2 = r2.b;
        r5 = r2;
        r5 = (defpackage.apfb) r5;
        goto L_0x003c;
    L_0x003a:
        r5 = defpackage.apfb.f;
    L_0x003c:
        r2 = new akph;
        r2.<init>();
        r4 = defpackage.aphg.class;
        if (r5 != 0) goto L_0x0047;
    L_0x0045:
        goto L_0x00e3;
    L_0x0047:
        r6 = r5.b;
        r7 = android.graphics.Color.red(r6);
        r7 = (double) r7;
        r9 = 4643176031446892544; // 0x406fe00000000000 float:0.0 double:255.0;
        java.lang.Double.isNaN(r7);
        r7 = r7 / r9;
        r11 = 4612586738352862003; // 0x4003333333333333 float:4.172325E-8 double:2.4;
        r13 = 4607430116779522785; // 0x3ff0e147ae147ae1 float:-3.3760442E-11 double:1.055;
        r15 = 4588087156379966505; // 0x3fac28f5c28f5c29 float:-71.68 double:0.055;
        r17 = 4623462931452961751; // 0x4029d70a3d70a3d7 float:0.05875 double:12.92;
        r19 = 4585821665623414051; // 0x3fa41c8216c61523 float:3.2001964E-25 double:0.03928;
        r21 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1));
        if (r21 < 0) goto L_0x007b;
    L_0x0074:
        r7 = r7 + r15;
        r7 = r7 / r13;
        r7 = java.lang.Math.pow(r7, r11);
        goto L_0x007d;
    L_0x007b:
        r7 = r7 / r17;
    L_0x007d:
        r3 = android.graphics.Color.green(r6);
        r11 = (double) r3;
        java.lang.Double.isNaN(r11);
        r11 = r11 / r9;
        r3 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1));
        if (r3 < 0) goto L_0x0096;
    L_0x008a:
        r11 = r11 + r15;
        r11 = r11 / r13;
        r13 = 4612586738352862003; // 0x4003333333333333 float:4.172325E-8 double:2.4;
        r11 = java.lang.Math.pow(r11, r13);
        goto L_0x0098;
    L_0x0096:
        r11 = r11 / r17;
    L_0x0098:
        r3 = android.graphics.Color.blue(r6);
        r13 = (double) r3;
        java.lang.Double.isNaN(r13);
        r13 = r13 / r9;
        r3 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1));
        if (r3 < 0) goto L_0x00b6;
    L_0x00a5:
        r13 = r13 + r15;
        r9 = 4607430116779522785; // 0x3ff0e147ae147ae1 float:-3.3760442E-11 double:1.055;
        r13 = r13 / r9;
        r9 = 4612586738352862003; // 0x4003333333333333 float:4.172325E-8 double:2.4;
        r9 = java.lang.Math.pow(r13, r9);
        goto L_0x00b8;
    L_0x00b6:
        r9 = r13 / r17;
    L_0x00b8:
        r13 = 4596827742536767164; // 0x3fcb367a0f9096bc float:1.4257557E-29 double:0.2126;
        r7 = r7 * r13;
        r13 = 4604617168452267173; // 0x3fe6e2eb1c432ca5 float:6.457779E-22 double:0.7152;
        r11 = r11 * r13;
        r7 = r7 + r11;
        r11 = 4589866978952703325; // 0x3fb27bb2fec56d5d float:-1.3121288E38 double:0.0722;
        r9 = r9 * r11;
        r7 = r7 + r9;
        r9 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r3 <= 0) goto L_0x00e3;
    L_0x00d5:
        r3 = r0.g;
        if (r3 != 0) goto L_0x00e0;
    L_0x00d9:
        r3 = new kdh;
        r3.<init>(r0);
        r0.g = r3;
    L_0x00e0:
        r3 = r0.g;
        goto L_0x00f0;
    L_0x00e3:
        r3 = r0.f;
        if (r3 != 0) goto L_0x00ee;
    L_0x00e7:
        r3 = new kdg;
        r3.<init>(r0);
        r0.f = r3;
    L_0x00ee:
        r3 = r0.f;
    L_0x00f0:
        r2.a(r4, r3);
        r3 = r0.d;
        r2 = r3.a(r2);
        r3 = r0.i;
        r2.a(r3);
        r3 = r0.h;
        r2.a(r3);
        r3 = r0.a;
        r3.a(r2);
        if (r5 != 0) goto L_0x0118;
    L_0x010a:
        r2 = r0.c;
        r2 = r2.getResources();
        r3 = 2131558844; // 0x7f0d01bc float:1.8743015E38 double:1.053129997E-314;
        r2 = r2.getColor(r3);
        goto L_0x011a;
    L_0x0118:
        r2 = r5.b;
    L_0x011a:
        r3 = r0.a;
        r3.setBackgroundColor(r2);
    L_0x011f:
        r1 = r1.b;
        r1 = r1.iterator();
    L_0x0125:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0143;
    L_0x012b:
        r2 = r1.next();
        r2 = (defpackage.aphj) r2;
        r3 = r2.a;
        r4 = 1;
        r3 = r3 & r4;
        if (r3 == 0) goto L_0x0125;
    L_0x0137:
        r3 = r0.i;
        r2 = r2.b;
        if (r2 != 0) goto L_0x013f;
    L_0x013d:
        r2 = defpackage.aphg.s;
    L_0x013f:
        r3.add(r2);
        goto L_0x0125;
    L_0x0143:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.a_(akor, arut):void");
    }

    public final void a(akpb akpb) {
        this.i.clear();
        xpr.a(this.a, false);
    }
}
