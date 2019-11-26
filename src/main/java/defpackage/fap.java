package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: fap */
public final class fap extends fan {
    private ImageView a;
    private TextView b;
    private final akvp c;
    private final Context g;

    public fap(akvp akvp, Context context, ViewStub viewStub) {
        super(viewStub);
        this.c = akvp;
        this.g = context;
    }

    public fap(akvp akvp, Context context, View view) {
        super(view);
        this.c = akvp;
        this.g = context;
    }

    /* JADX WARNING: Missing block: B:35:0x00c4, code skipped:
            r5.f.setBackground(defpackage.fan.a(r5.g));
            r5.b.setTextColor(defpackage.xwe.a(r5.g, com.google.android.youtube.R.attr.ytBadgeText1, 0));
            r5.a.setColorFilter(defpackage.xwe.a(r5.g, com.google.android.youtube.R.attr.ytBadgeText1, 0));
     */
    /* JADX WARNING: Missing block: B:36:0x00e5, code skipped:
            return;
     */
    public final void a(defpackage.auxa r6) {
        /*
        r5 = this;
        r0 = 0;
        if (r6 == 0) goto L_0x014c;
    L_0x0003:
        r1 = r5.b();
        r5.f = r1;
        r1 = r5.f;
        r2 = 2131756098; // 0x7f100442 float:1.9143094E38 double:1.0532274533E-314;
        r1 = r1.findViewById(r2);
        r1 = (android.widget.ImageView) r1;
        r5.a = r1;
        r1 = r5.f;
        r2 = 2131756099; // 0x7f100443 float:1.9143096E38 double:1.053227454E-314;
        r1 = r1.findViewById(r2);
        r1 = (android.widget.TextView) r1;
        r5.b = r1;
        r1 = r5.f;
        r2 = 1;
        defpackage.xpr.a(r1, r2);
        r1 = r6.a;
        r1 = r1 & r2;
        if (r1 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x004a;
    L_0x002f:
        r1 = r5.a;
        r3 = r5.c;
        r4 = r6.b;
        if (r4 != 0) goto L_0x0039;
    L_0x0037:
        r4 = defpackage.arwf.c;
    L_0x0039:
        r4 = r4.b;
        r4 = defpackage.arwh.a(r4);
        if (r4 != 0) goto L_0x0043;
    L_0x0041:
        r4 = defpackage.arwh.UNKNOWN;
    L_0x0043:
        r3 = r3.a(r4);
        r1.setImageResource(r3);
    L_0x004a:
        r1 = r5.a;
        r3 = r6.a;
        r3 = r3 & r2;
        if (r3 != 0) goto L_0x0053;
    L_0x0051:
        r3 = 0;
        goto L_0x0054;
    L_0x0053:
        r3 = 1;
    L_0x0054:
        defpackage.xpr.a(r1, r3);
        r1 = r5.b;
        r3 = r6.d;
        defpackage.xpr.a(r1, r3);
        r1 = r6.a;
        r1 = r1 & 64;
        r3 = 0;
        if (r1 != 0) goto L_0x006b;
    L_0x0065:
        r1 = r5.f;
        r1.setContentDescription(r3);
        goto L_0x0078;
    L_0x006b:
        r1 = r5.f;
        r4 = r6.e;
        if (r4 != 0) goto L_0x0073;
    L_0x0071:
        r4 = defpackage.aodv.c;
    L_0x0073:
        r4 = r4.b;
        r1.setContentDescription(r4);
    L_0x0078:
        r6 = r6.c;
        r6 = defpackage.auxb.a(r6);
        if (r6 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0082;
    L_0x0081:
        r6 = 1;
    L_0x0082:
        r6 = r6 + -1;
        r1 = 3;
        r2 = 2130772261; // 0x7f010125 float:1.7147635E38 double:1.0527413733E-314;
        if (r6 == r1) goto L_0x012a;
    L_0x008a:
        r1 = 4;
        if (r6 == r1) goto L_0x0105;
    L_0x008d:
        r1 = 6;
        r4 = 2130772251; // 0x7f01011b float:1.7147615E38 double:1.0527413683E-314;
        if (r6 == r1) goto L_0x00e6;
    L_0x0093:
        switch(r6) {
            case 11: goto L_0x00b9;
            case 12: goto L_0x00e6;
            case 13: goto L_0x0097;
            default: goto L_0x0096;
        };
    L_0x0096:
        goto L_0x00c4;
    L_0x0097:
        r6 = r5.f;
        r1 = r5.g;
        r1 = defpackage.fan.a(r1);
        r6.setBackground(r1);
        r6 = r5.b;
        r1 = r5.g;
        r1 = defpackage.xwe.a(r1, r2, r0);
        r6.setTextColor(r1);
        r6 = r5.a;
        r1 = r5.g;
        r0 = defpackage.xwe.a(r1, r2, r0);
        r6.setColorFilter(r0);
        return;
    L_0x00b9:
        r6 = r5.b;
        r1 = r6.getPaintFlags();
        r1 = r1 | 16;
        r6.setPaintFlags(r1);
    L_0x00c4:
        r6 = r5.f;
        r1 = r5.g;
        r1 = defpackage.fan.a(r1);
        r6.setBackground(r1);
        r6 = r5.b;
        r1 = r5.g;
        r1 = defpackage.xwe.a(r1, r4, r0);
        r6.setTextColor(r1);
        r6 = r5.a;
        r1 = r5.g;
        r0 = defpackage.xwe.a(r1, r4, r0);
        r6.setColorFilter(r0);
        return;
    L_0x00e6:
        r6 = r5.f;
        r6.setBackground(r3);
        r6 = r5.b;
        r1 = r5.g;
        r0 = defpackage.xwe.a(r1, r4, r0);
        r6.setTextColor(r0);
        r6 = r5.a;
        r0 = r5.g;
        r1 = 2130772285; // 0x7f01013d float:1.7147684E38 double:1.052741385E-314;
        r0 = defpackage.xwe.b(r0, r1);
        defpackage.ade.a(r6, r0);
        return;
    L_0x0105:
        r6 = r5.f;
        r0 = r5.g;
        r0 = defpackage.fan.a(r0);
        r6.setBackground(r0);
        r6 = r5.b;
        r0 = r5.g;
        r1 = 2131559353; // 0x7f0d03b9 float:1.8744048E38 double:1.0531302484E-314;
        r0 = defpackage.ra.c(r0, r1);
        r6.setTextColor(r0);
        r6 = r5.a;
        r0 = r5.g;
        r0 = defpackage.ra.c(r0, r1);
        r6.setColorFilter(r0);
        return;
    L_0x012a:
        r6 = r5.f;
        r1 = r5.g;
        r1 = defpackage.fan.a(r1);
        r6.setBackground(r1);
        r6 = r5.b;
        r1 = r5.g;
        r0 = defpackage.xwe.a(r1, r2, r0);
        r6.setTextColor(r0);
        r6 = r5.a;
        r0 = r5.g;
        r0 = defpackage.xwe.b(r0, r2);
        defpackage.ade.a(r6, r0);
        return;
    L_0x014c:
        r6 = r5.f;
        if (r6 == 0) goto L_0x0153;
    L_0x0150:
        defpackage.xpr.a(r6, r0);
    L_0x0153:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fap.a(auxa):void");
    }
}
