package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: akyy */
public class akyy extends akyu {
    public final TextView e;
    public boolean f;
    public boolean g;
    public int h = 0;
    private final akvp i;
    private final int j;
    private final int k;
    private int l = -1;
    private boolean m = false;

    public akyy(aaas aaas, akvp akvp, akpi akpi, TextView textView) {
        super(aaas, akpi, textView);
        this.i = (akvp) amqw.a((Object) akvp);
        this.e = (TextView) amqw.a((Object) textView);
        this.j = textView.getResources().getDimensionPixelSize(R.dimen.button_corner_radius);
        this.k = textView.getResources().getDimensionPixelSize(R.dimen.button_outline_width);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b1  */
    /* JADX WARNING: Missing block: B:49:0x00ca, code skipped:
            if (r0 != 0) goto L_0x00ce;
     */
    /* JADX WARNING: Missing block: B:65:0x0116, code skipped:
            if (r0 != 0) goto L_0x011a;
     */
    /* JADX WARNING: Missing block: B:108:0x01c3, code skipped:
            if (r9 != 0) goto L_0x01c7;
     */
    public void a(defpackage.aphg r13, defpackage.acvx r14, java.util.Map r15) {
        /*
        r12 = this;
        super.a(r13, r14, r15);
        r14 = 0;
        r15 = 0;
        if (r13 != 0) goto L_0x0021;
    L_0x0007:
        r13 = r12.e;
        r13.setText(r14);
        r13 = r12.e;
        r13.setContentDescription(r14);
        r13 = r12.i;
        if (r13 == 0) goto L_0x036c;
    L_0x0015:
        r13 = r12.e;
        r13.setCompoundDrawablesWithIntrinsicBounds(r15, r15, r15, r15);
        r13 = r12.e;
        r13.setCompoundDrawablePadding(r15);
        goto L_0x036c;
    L_0x0021:
        r0 = r13.a;
        r0 = r0 & 128;
        if (r0 == 0) goto L_0x002e;
    L_0x0027:
        r0 = r13.g;
        if (r0 != 0) goto L_0x002f;
    L_0x002b:
        r0 = defpackage.arml.f;
        goto L_0x002f;
    L_0x002e:
        r0 = r14;
    L_0x002f:
        r0 = defpackage.ajqy.a(r0);
        r1 = r12.e;
        r1.setText(r0);
        r0 = r13.q;
        if (r0 != 0) goto L_0x003e;
    L_0x003c:
        r0 = defpackage.aodx.c;
    L_0x003e:
        r0 = r0.a;
        r1 = 1;
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x004a;
    L_0x0044:
        r0 = r12.e;
        r0.setContentDescription(r14);
        goto L_0x005d;
    L_0x004a:
        r0 = r12.e;
        r2 = r13.q;
        if (r2 != 0) goto L_0x0052;
    L_0x0050:
        r2 = defpackage.aodx.c;
    L_0x0052:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0058;
    L_0x0056:
        r2 = defpackage.aodv.c;
    L_0x0058:
        r2 = r2.b;
        r0.setContentDescription(r2);
    L_0x005d:
        r0 = r13.b;
        r2 = 17;
        if (r0 != r2) goto L_0x0068;
    L_0x0063:
        r0 = r13.c;
        r0 = (defpackage.aphe) r0;
        goto L_0x006a;
    L_0x0068:
        r0 = defpackage.aphe.c;
    L_0x006a:
        r0 = r0.a;
        r3 = 2131558540; // 0x7f0d008c float:1.8742399E38 double:1.0531298467E-314;
        r4 = 2131559580; // 0x7f0d049c float:1.8744508E38 double:1.0531303605E-314;
        r5 = 2130772263; // 0x7f010127 float:1.714764E38 double:1.0527413743E-314;
        r6 = 2131559582; // 0x7f0d049e float:1.8744512E38 double:1.0531303615E-314;
        r7 = 2130772286; // 0x7f01013e float:1.7147686E38 double:1.0527413856E-314;
        r8 = 20;
        r9 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r0 == r9) goto L_0x0141;
    L_0x0082:
        r0 = r13.b;
        if (r0 != r8) goto L_0x008b;
    L_0x0086:
        r0 = r13.c;
        r0 = (defpackage.ayet) r0;
        goto L_0x008d;
    L_0x008b:
        r0 = defpackage.ayet.d;
    L_0x008d:
        r0 = r0.a;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x00b6;
    L_0x0092:
        r0 = r12.e;
        r10 = r0.getContext();
        r11 = r13.b;
        if (r11 != r8) goto L_0x00a1;
    L_0x009c:
        r11 = r13.c;
        r11 = (defpackage.ayet) r11;
        goto L_0x00a3;
    L_0x00a1:
        r11 = defpackage.ayet.d;
    L_0x00a3:
        r11 = r11.b;
        r11 = defpackage.ayem.a(r11);
        if (r11 != 0) goto L_0x00ad;
    L_0x00ab:
        r11 = defpackage.ayem.THEME_ATTRIBUTE_UNKNOWN;
    L_0x00ad:
        r10 = defpackage.alay.a(r10, r11);
        r0.setTextColor(r10);
        goto L_0x015e;
    L_0x00b6:
        r0 = r13.f;
        if (r0 != 0) goto L_0x0106;
    L_0x00ba:
        r0 = r13.b;
        if (r0 != r1) goto L_0x00cd;
    L_0x00be:
        r0 = r13.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00ce;
    L_0x00cd:
        r0 = 1;
    L_0x00ce:
        r10 = r0 + -1;
        if (r0 == 0) goto L_0x0105;
    L_0x00d2:
        switch(r10) {
            case 1: goto L_0x00fa;
            case 2: goto L_0x00f2;
            case 3: goto L_0x00f2;
            case 4: goto L_0x00d5;
            case 5: goto L_0x00d5;
            case 6: goto L_0x00f2;
            case 7: goto L_0x00fa;
            case 8: goto L_0x00d5;
            case 9: goto L_0x00f2;
            case 10: goto L_0x00f2;
            case 11: goto L_0x00f2;
            case 12: goto L_0x00d5;
            case 13: goto L_0x00ed;
            case 14: goto L_0x00e8;
            case 15: goto L_0x00f2;
            case 16: goto L_0x00e0;
            case 17: goto L_0x00d8;
            case 18: goto L_0x00d5;
            case 19: goto L_0x00d5;
            case 20: goto L_0x00ed;
            case 21: goto L_0x00f2;
            case 22: goto L_0x00f2;
            default: goto L_0x00d5;
        };
    L_0x00d5:
        r0 = 0;
        r10 = 0;
        goto L_0x0138;
    L_0x00d8:
        r0 = 2131559491; // 0x7f0d0443 float:1.8744328E38 double:1.0531303166E-314;
        r0 = r12.d(r0);
        goto L_0x0128;
    L_0x00e0:
        r0 = 2131559170; // 0x7f0d0302 float:1.8743676E38 double:1.053130158E-314;
        r0 = r12.d(r0);
        goto L_0x0128;
    L_0x00e8:
        r0 = r12.d(r3);
        goto L_0x0128;
    L_0x00ed:
        r0 = r12.a(r5, r4);
        goto L_0x0128;
    L_0x00f2:
        r0 = 2131559379; // 0x7f0d03d3 float:1.87441E38 double:1.053130261E-314;
        r0 = r12.d(r0);
        goto L_0x0128;
    L_0x00fa:
        r0 = 2130772335; // 0x7f01016f float:1.7147786E38 double:1.05274141E-314;
        r10 = 2131559495; // 0x7f0d0447 float:1.8744336E38 double:1.0531303185E-314;
        r0 = r12.a(r0, r10);
        goto L_0x0128;
    L_0x0105:
        throw r14;
    L_0x0106:
        r0 = r13.b;
        if (r0 != r1) goto L_0x0119;
    L_0x010a:
        r0 = r13.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x0119;
    L_0x0118:
        goto L_0x011a;
    L_0x0119:
        r0 = 1;
    L_0x011a:
        r10 = r0 + -1;
        if (r0 == 0) goto L_0x0140;
    L_0x011e:
        switch(r10) {
            case 20: goto L_0x0133;
            case 21: goto L_0x012b;
            case 22: goto L_0x012b;
            default: goto L_0x0121;
        };
    L_0x0121:
        r0 = 2131559499; // 0x7f0d044b float:1.8744344E38 double:1.0531303205E-314;
        r0 = r12.d(r0);
    L_0x0128:
        r10 = r0;
        r0 = 1;
        goto L_0x0138;
    L_0x012b:
        r0 = 2131559586; // 0x7f0d04a2 float:1.874452E38 double:1.0531303635E-314;
        r0 = r12.d(r0);
        goto L_0x0128;
    L_0x0133:
        r0 = r12.a(r7, r6);
        goto L_0x0128;
    L_0x0138:
        if (r0 == 0) goto L_0x015e;
    L_0x013a:
        r0 = r12.e;
        r0.setTextColor(r10);
        goto L_0x015e;
    L_0x0140:
        throw r14;
    L_0x0141:
        r0 = r12.e;
        r10 = r13.b;
        if (r10 != r2) goto L_0x014c;
    L_0x0147:
        r10 = r13.c;
        r10 = (defpackage.aphe) r10;
        goto L_0x014e;
    L_0x014c:
        r10 = defpackage.aphe.c;
    L_0x014e:
        r11 = r10.a;
        if (r11 != r9) goto L_0x0157;
    L_0x0152:
        r10 = r10.b;
        r10 = (defpackage.apfb) r10;
        goto L_0x0159;
    L_0x0157:
        r10 = defpackage.apfb.f;
    L_0x0159:
        r10 = r10.c;
        r0.setTextColor(r10);
    L_0x015e:
        r0 = r12.g;
        if (r0 != 0) goto L_0x02b8;
    L_0x0162:
        r12.f = r15;
        r0 = defpackage.apgy.d;
        r0 = defpackage.anxl.checkIsLite(r0);
        r13.a(r0);
        r10 = r13.h;
        r0 = r0.d;
        r0 = r10.a(r0);
        if (r0 == 0) goto L_0x01a1;
    L_0x0177:
        r0 = defpackage.apgy.d;
        r0 = defpackage.anxl.checkIsLite(r0);
        r13.a(r0);
        r10 = r13.h;
        r11 = r0.d;
        r10 = r10.b(r11);
        if (r10 != 0) goto L_0x018d;
    L_0x018a:
        r0 = r0.b;
        goto L_0x0191;
    L_0x018d:
        r0 = r0.a(r10);
    L_0x0191:
        r0 = (defpackage.apgy) r0;
        r0 = r0.b;
        r0 = defpackage.apha.a(r0);
        if (r0 != 0) goto L_0x019c;
    L_0x019b:
        goto L_0x01a1;
    L_0x019c:
        if (r0 != r1) goto L_0x019f;
    L_0x019e:
        goto L_0x01a1;
    L_0x019f:
        r0 = 0;
        goto L_0x01a2;
    L_0x01a1:
        r0 = 1;
    L_0x01a2:
        r10 = r13.b;
        if (r10 != r2) goto L_0x01ab;
    L_0x01a6:
        r10 = r13.c;
        r10 = (defpackage.aphe) r10;
        goto L_0x01ad;
    L_0x01ab:
        r10 = defpackage.aphe.c;
    L_0x01ad:
        r10 = r10.a;
        if (r10 == r9) goto L_0x0295;
    L_0x01b1:
        r2 = r13.f;
        r9 = r13.b;
        if (r9 != r1) goto L_0x01c6;
    L_0x01b7:
        r9 = r13.c;
        r9 = (java.lang.Integer) r9;
        r9 = r9.intValue();
        r9 = defpackage.aphh.a(r9);
        if (r9 == 0) goto L_0x01c6;
    L_0x01c5:
        goto L_0x01c7;
    L_0x01c6:
        r9 = 1;
    L_0x01c7:
        r10 = r9 + -1;
        if (r9 == 0) goto L_0x0294;
    L_0x01cb:
        r9 = 2131558444; // 0x7f0d002c float:1.8742204E38 double:1.0531297993E-314;
        r11 = 2130837738; // 0x7f0200ea float:1.7280439E38 double:1.052773723E-314;
        switch(r10) {
            case 1: goto L_0x0271;
            case 2: goto L_0x025b;
            case 3: goto L_0x0244;
            case 4: goto L_0x01d4;
            case 5: goto L_0x01d4;
            case 6: goto L_0x025b;
            case 7: goto L_0x0230;
            case 8: goto L_0x01d4;
            case 9: goto L_0x0244;
            case 10: goto L_0x025b;
            case 11: goto L_0x025b;
            case 12: goto L_0x01d4;
            case 13: goto L_0x0230;
            case 14: goto L_0x0271;
            case 15: goto L_0x0230;
            case 16: goto L_0x0230;
            case 17: goto L_0x0230;
            case 18: goto L_0x01d4;
            case 19: goto L_0x01d4;
            case 20: goto L_0x020f;
            case 21: goto L_0x01f5;
            case 22: goto L_0x01d7;
            default: goto L_0x01d4;
        };
    L_0x01d4:
        r0 = r14;
        goto L_0x0286;
    L_0x01d7:
        if (r0 == 0) goto L_0x01e2;
    L_0x01d9:
        r0 = 2130837737; // 0x7f0200e9 float:1.7280437E38 double:1.0527737227E-314;
        r0 = r12.b(r0);
        goto L_0x0286;
    L_0x01e2:
        r0 = r12.e;
        r0 = r0.getContext();
        r1 = 2130772309; // 0x7f010155 float:1.7147733E38 double:1.052741397E-314;
        r0 = defpackage.xwe.a(r0, r1, r15);
        r0 = r12.a(r0, r15);
        goto L_0x0286;
    L_0x01f5:
        if (r0 != 0) goto L_0x0200;
    L_0x01f7:
        r0 = 2131559614; // 0x7f0d04be float:1.8744577E38 double:1.0531303773E-314;
        r0 = r12.c(r0);
        goto L_0x0286;
    L_0x0200:
        if (r2 != 0) goto L_0x0206;
    L_0x0202:
        r0 = 2130837740; // 0x7f0200ec float:1.7280443E38 double:1.052773724E-314;
        goto L_0x0209;
    L_0x0206:
        r0 = 2130837922; // 0x7f0201a2 float:1.7280812E38 double:1.052773814E-314;
    L_0x0209:
        r0 = r12.b(r0);
        goto L_0x0286;
    L_0x020f:
        if (r0 != 0) goto L_0x021a;
    L_0x0211:
        r0 = 2131559600; // 0x7f0d04b0 float:1.8744549E38 double:1.0531303704E-314;
        r0 = r12.c(r0);
        goto L_0x0286;
    L_0x021a:
        if (r2 != 0) goto L_0x0221;
    L_0x021c:
        r0 = r12.a(r5, r4);
        goto L_0x0225;
    L_0x0221:
        r0 = r12.a(r7, r6);
    L_0x0225:
        r1 = r12.e(r15);
        r2 = r12.k;
        r1.setStroke(r2, r0);
        r0 = r1;
        goto L_0x0286;
    L_0x0230:
        r12.f = r1;
        if (r0 == 0) goto L_0x023c;
    L_0x0234:
        r0 = 2130837736; // 0x7f0200e8 float:1.7280434E38 double:1.052773722E-314;
        r0 = r12.b(r0);
        goto L_0x0286;
    L_0x023c:
        r0 = 17170445; // 0x106000d float:2.461195E-38 double:8.483327E-317;
        r0 = r12.c(r0);
        goto L_0x0286;
    L_0x0244:
        if (r0 == 0) goto L_0x0250;
    L_0x0246:
        if (r2 != 0) goto L_0x024b;
    L_0x0248:
        r11 = 2130837735; // 0x7f0200e7 float:1.7280432E38 double:1.0527737217E-314;
    L_0x024b:
        r0 = r12.b(r11);
        goto L_0x0286;
    L_0x0250:
        if (r2 != 0) goto L_0x0253;
    L_0x0252:
        goto L_0x0256;
    L_0x0253:
        r3 = 2131558444; // 0x7f0d002c float:1.8742204E38 double:1.0531297993E-314;
    L_0x0256:
        r0 = r12.c(r3);
        goto L_0x0286;
    L_0x025b:
        if (r0 != 0) goto L_0x0267;
    L_0x025d:
        if (r2 != 0) goto L_0x0262;
    L_0x025f:
        r9 = 2131558541; // 0x7f0d008d float:1.87424E38 double:1.053129847E-314;
    L_0x0262:
        r0 = r12.c(r9);
        goto L_0x0286;
    L_0x0267:
        if (r2 != 0) goto L_0x026c;
    L_0x0269:
        r11 = 2130837734; // 0x7f0200e6 float:1.728043E38 double:1.052773721E-314;
    L_0x026c:
        r0 = r12.b(r11);
        goto L_0x0286;
    L_0x0271:
        r1 = 2131559375; // 0x7f0d03cf float:1.8744092E38 double:1.0531302593E-314;
        if (r0 == 0) goto L_0x0282;
    L_0x0276:
        r0 = 2130772256; // 0x7f010120 float:1.7147625E38 double:1.052741371E-314;
        r0 = r12.a(r0, r1);
        r0 = r12.e(r0);
        goto L_0x0286;
    L_0x0282:
        r0 = r12.c(r1);
    L_0x0286:
        r1 = r12.e;
        if (r0 != 0) goto L_0x028e;
    L_0x028a:
        r0 = r1.getBackground();
    L_0x028e:
        r2 = r12.h;
        defpackage.xpr.a(r1, r0, r2);
        goto L_0x02b8;
    L_0x0294:
        throw r14;
    L_0x0295:
        r1 = r13.b;
        if (r1 != r2) goto L_0x029e;
    L_0x0299:
        r1 = r13.c;
        r1 = (defpackage.aphe) r1;
        goto L_0x02a0;
    L_0x029e:
        r1 = defpackage.aphe.c;
    L_0x02a0:
        r2 = r1.a;
        if (r2 != r9) goto L_0x02a9;
    L_0x02a4:
        r1 = r1.b;
        r1 = (defpackage.apfb) r1;
        goto L_0x02ab;
    L_0x02a9:
        r1 = defpackage.apfb.f;
    L_0x02ab:
        r1 = r1.b;
        r0 = r12.a(r1, r0);
        r1 = r12.e;
        r2 = r12.h;
        defpackage.xpr.a(r1, r0, r2);
    L_0x02b8:
        r0 = r12.i;
        if (r0 == 0) goto L_0x036c;
    L_0x02bc:
        r0 = r13.a;
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x02d3;
    L_0x02c2:
        r0 = r13.e;
        if (r0 != 0) goto L_0x02c8;
    L_0x02c6:
        r0 = defpackage.arwf.c;
    L_0x02c8:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x02d5;
    L_0x02d0:
        r0 = defpackage.arwh.UNKNOWN;
        goto L_0x02d5;
    L_0x02d3:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x02d5:
        r1 = r12.i;
        r1 = r1.a(r0);
        r2 = r13.b;
        if (r2 != r8) goto L_0x02e4;
    L_0x02df:
        r2 = r13.c;
        r2 = (defpackage.ayet) r2;
        goto L_0x02e6;
    L_0x02e4:
        r2 = defpackage.ayet.d;
    L_0x02e6:
        r2 = r2.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0310;
    L_0x02ec:
        r2 = r12.e;
        r2 = r2.getContext();
        r3 = r13.b;
        if (r3 != r8) goto L_0x02fb;
    L_0x02f6:
        r13 = r13.c;
        r13 = (defpackage.ayet) r13;
        goto L_0x02fd;
    L_0x02fb:
        r13 = defpackage.ayet.d;
    L_0x02fd:
        r13 = r13.c;
        r13 = defpackage.ayem.a(r13);
        if (r13 != 0) goto L_0x0307;
    L_0x0305:
        r13 = defpackage.ayem.THEME_ATTRIBUTE_UNKNOWN;
    L_0x0307:
        r13 = defpackage.alay.a(r2, r13);
        r13 = java.lang.Integer.valueOf(r13);
        goto L_0x0320;
    L_0x0310:
        r13 = r12.m;
        if (r13 == 0) goto L_0x031f;
    L_0x0314:
        r13 = r12.e;
        r13 = r13.getCurrentTextColor();
        r13 = java.lang.Integer.valueOf(r13);
        goto L_0x0320;
    L_0x031f:
        r13 = r14;
    L_0x0320:
        if (r1 == 0) goto L_0x034d;
    L_0x0322:
        if (r13 != 0) goto L_0x0325;
    L_0x0324:
        goto L_0x034d;
    L_0x0325:
        r2 = r12.e;
        r2 = r2.getResources();
        r3 = r12.e;
        r3 = r3.getContext();
        r3 = r3.getTheme();
        r1 = defpackage.rz.a(r2, r1, r3);
        r1 = r1.mutate();
        r13 = r13.intValue();
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;
        r13 = defpackage.xoe.a(r1, r13, r2);
        r1 = r12.e;
        r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r13, r14, r14, r14);
        goto L_0x0352;
    L_0x034d:
        r13 = r12.e;
        r13.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r15, r15, r15);
    L_0x0352:
        r13 = r12.l;
        r14 = -1;
        if (r13 == r14) goto L_0x036c;
    L_0x0357:
        r13 = r12.e;
        r14 = r13.getText();
        r14 = android.text.TextUtils.isEmpty(r14);
        if (r14 != 0) goto L_0x0369;
    L_0x0363:
        r14 = defpackage.arwh.UNKNOWN;
        if (r0 == r14) goto L_0x0369;
    L_0x0367:
        r15 = r12.l;
    L_0x0369:
        r13.setCompoundDrawablePadding(r15);
    L_0x036c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akyy.a(aphg, acvx, java.util.Map):void");
    }

    public final void a(int i) {
        this.l = this.e.getResources().getDimensionPixelOffset(i);
    }

    public final void a() {
        this.h = 1;
    }

    public final void b() {
        this.m = true;
    }

    public final void a(boolean z) {
        aphg aphg = this.b;
        if (aphg != null) {
            aphf aphf = (aphf) ((anxo) aphg.toBuilder());
            aphf.a(z ^ 1);
            this.b = (aphg) ((anxl) aphf.build());
            this.a.setEnabled(z);
            this.a.setClickable(z);
        }
        this.e.setAlpha(!z ? 0.5f : 1.0f);
    }

    private final Drawable b(int i) {
        return rz.a(this.e.getResources(), i, this.e.getContext().getTheme());
    }

    private final Drawable c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(d(i));
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    private final int d(int i) {
        return rz.b(this.e.getResources(), i, this.e.getContext().getTheme());
    }

    private final int a(int i, int i2) {
        return xwe.a(this.e.getContext(), i, d(i2));
    }

    private final GradientDrawable e(int i) {
        return a(i, true);
    }

    private final GradientDrawable a(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        if (z) {
            gradientDrawable.setCornerRadius((float) this.j);
        }
        return gradientDrawable;
    }
}
