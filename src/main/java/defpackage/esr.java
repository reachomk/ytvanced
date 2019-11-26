package defpackage;

import android.content.Context;
import android.widget.TextView;

/* renamed from: esr */
public final class esr {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final boolean j;

    public esr(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.g = i5;
        this.h = i6;
        this.i = z;
        this.c = 0;
        this.f = 0;
        this.j = false;
    }

    public esr(esr esr, int i, int i2) {
        this(0, i, 0, i2, esr.g, esr.h, false);
    }

    public esr(esr esr, int i, int i2, byte b) {
        this.a = 0;
        this.b = 0;
        this.d = 0;
        this.e = 0;
        this.g = esr.g;
        this.h = esr.h;
        this.i = false;
        this.c = i;
        this.f = i2;
        this.j = true;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0138  */
    /* JADX WARNING: Missing block: B:29:0x006c, code skipped:
            if (r1 != 0) goto L_0x0070;
     */
    public final void a(android.widget.TextView r11, defpackage.axwa r12, java.lang.CharSequence r13) {
        /*
        r10 = this;
        r0 = r11.getResources();
        r1 = r12.c;
        r2 = 2;
        r3 = 19;
        r4 = 35;
        r5 = 0;
        if (r1 != r4) goto L_0x0019;
    L_0x000e:
        r1 = r12.d;
        r1 = (defpackage.axwi) r1;
        r1 = r1.d;
        if (r1 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r1 = 0;
        goto L_0x0049;
    L_0x0019:
        r1 = r12.z;
        r1 = defpackage.axwc.a(r1);
        if (r1 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x003b;
    L_0x0022:
        if (r1 != r2) goto L_0x003b;
    L_0x0024:
        r1 = r12.A;
        if (r1 != 0) goto L_0x002a;
    L_0x0028:
        r1 = defpackage.arwf.c;
    L_0x002a:
        r1 = r1.b;
        r1 = defpackage.arwh.a(r1);
        if (r1 != 0) goto L_0x0034;
    L_0x0032:
        r1 = defpackage.arwh.UNKNOWN;
    L_0x0034:
        r6 = defpackage.arwh.PAID;
        if (r1 != r6) goto L_0x0017;
    L_0x0038:
        r1 = r10.a;
        goto L_0x0049;
    L_0x003b:
        r1 = r12.c;
        if (r1 != r3) goto L_0x0047;
    L_0x003f:
        r1 = r12.d;
        r1 = (defpackage.axwe) r1;
        r1 = r1.c;
        if (r1 != 0) goto L_0x0017;
    L_0x0047:
        r1 = r10.d;
    L_0x0049:
        defpackage.adl.a(r11, r1, r5);
        r1 = r12.q;
        if (r1 != 0) goto L_0x0053;
    L_0x0050:
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        goto L_0x0055;
    L_0x0053:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0055:
        r11.setAlpha(r1);
        r1 = r12.q;
        r11.setEnabled(r1);
        r1 = r12.c;
        r6 = 1;
        if (r1 != r3) goto L_0x006f;
    L_0x0062:
        r1 = r12.d;
        r1 = (defpackage.axwe) r1;
        r1 = r1.b;
        r1 = defpackage.axwg.a(r1);
        if (r1 == 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0070;
    L_0x006f:
        r1 = 1;
    L_0x0070:
        r3 = r12.c;
        r7 = 6;
        r8 = 5;
        r9 = 0;
        if (r3 == r4) goto L_0x00b6;
    L_0x0077:
        r3 = r12.z;
        r3 = defpackage.axwc.a(r3);
        if (r3 == 0) goto L_0x0087;
    L_0x007f:
        if (r3 == r2) goto L_0x0082;
    L_0x0081:
        goto L_0x0087;
    L_0x0082:
        r2 = r10.a(r11, r6);
        goto L_0x00e1;
    L_0x0087:
        r2 = r10.i;
        if (r2 != 0) goto L_0x0090;
    L_0x008b:
        r2 = r10.a(r11, r5);
        goto L_0x00e1;
    L_0x0090:
        r2 = r1 + -1;
        if (r1 == 0) goto L_0x00b5;
    L_0x0094:
        if (r2 == r8) goto L_0x00a9;
    L_0x0096:
        if (r2 == r7) goto L_0x009d;
    L_0x0098:
        r2 = r10.a(r11, r5);
        goto L_0x00e1;
    L_0x009d:
        r2 = r11.getResources();
        r3 = 2131558540; // 0x7f0d008c float:1.8742399E38 double:1.0531298467E-314;
        r2 = r2.getColor(r3);
        goto L_0x00e1;
    L_0x00a9:
        r2 = r11.getResources();
        r3 = 2131558541; // 0x7f0d008d float:1.87424E38 double:1.053129847E-314;
        r2 = r2.getColor(r3);
        goto L_0x00e1;
    L_0x00b5:
        throw r9;
    L_0x00b6:
        r2 = r12.o;
        if (r2 != 0) goto L_0x00c5;
    L_0x00ba:
        r2 = r12.d;
        r2 = (defpackage.axwi) r2;
        r2 = r2.b;
        if (r2 != 0) goto L_0x00cf;
    L_0x00c2:
        r2 = defpackage.ayet.d;
        goto L_0x00cf;
    L_0x00c5:
        r2 = r12.d;
        r2 = (defpackage.axwi) r2;
        r2 = r2.c;
        if (r2 != 0) goto L_0x00cf;
    L_0x00cd:
        r2 = defpackage.ayet.d;
    L_0x00cf:
        r3 = r11.getContext();
        r2 = r2.b;
        r2 = defpackage.ayem.a(r2);
        if (r2 != 0) goto L_0x00dd;
    L_0x00db:
        r2 = defpackage.ayem.THEME_ATTRIBUTE_UNKNOWN;
    L_0x00dd:
        r2 = defpackage.alay.a(r3, r2);
    L_0x00e1:
        r11.setTextColor(r2);
        r2 = r1 + -1;
        if (r1 == 0) goto L_0x0137;
    L_0x00e8:
        if (r2 == r8) goto L_0x00ef;
    L_0x00ea:
        if (r2 == r7) goto L_0x00ef;
    L_0x00ec:
        r1 = defpackage.ajrc.ROBOTO_REGULAR;
        goto L_0x00f1;
    L_0x00ef:
        r1 = defpackage.ajrc.ROBOTO_MEDIUM;
    L_0x00f1:
        r2 = r11.getContext();
        r1 = r1.a(r2);
        r11.setTypeface(r1);
        r1 = android.text.TextUtils.isEmpty(r13);
        if (r1 == 0) goto L_0x0108;
    L_0x0102:
        r13 = r10.g;
        r13 = r0.getText(r13);
    L_0x0108:
        r11.setText(r13);
        r13 = r12.o;
        if (r13 != 0) goto L_0x0116;
    L_0x010f:
        r12 = r12.F;
        if (r12 != 0) goto L_0x011c;
    L_0x0113:
        r12 = defpackage.aodx.c;
        goto L_0x011c;
    L_0x0116:
        r12 = r12.G;
        if (r12 != 0) goto L_0x011c;
    L_0x011a:
        r12 = defpackage.aodx.c;
    L_0x011c:
        r12 = r12.b;
        if (r12 != 0) goto L_0x0122;
    L_0x0120:
        r12 = defpackage.aodv.c;
    L_0x0122:
        r13 = r12.b;
        r13 = r13.isEmpty();
        if (r13 == 0) goto L_0x0131;
    L_0x012a:
        r12 = r10.h;
        r12 = r0.getText(r12);
        goto L_0x0133;
    L_0x0131:
        r12 = r12.b;
    L_0x0133:
        r11.setContentDescription(r12);
        return;
    L_0x0137:
        goto L_0x0139;
    L_0x0138:
        throw r9;
    L_0x0139:
        goto L_0x0138;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esr.a(android.widget.TextView, axwa, java.lang.CharSequence):void");
    }

    private final int a(TextView textView, boolean z) {
        if (this.j) {
            int i;
            Context context = textView.getContext();
            if (z) {
                i = this.c;
            } else {
                i = this.f;
            }
            return xwe.a(context, i);
        }
        return textView.getResources().getColor(!z ? this.e : this.b);
    }
}
