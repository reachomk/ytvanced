package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: jxt */
public final class jxt extends akpl {
    public final Context a;
    public final akzb b;
    private final akvp c;
    private final ViewGroup d;
    private final akkq e;
    private final LayoutParams f = new LayoutParams(-1, -1);
    private final LayoutParams g;
    private jxs h;
    private jxs i;
    private final int j;

    public jxt(Context context, ezq ezq, akvp akvp, akzb akzb, akkq akkq) {
        this.a = context;
        this.c = akvp;
        this.d = new FrameLayout(context);
        this.b = akzb;
        this.e = akkq;
        this.j = ezq.e();
        this.g = new LayoutParams(-1, -2);
    }

    public final View K_() {
        return this.d;
    }

    private static int a(apaj apaj) {
        apal apal = apaj.i;
        if (apal == null) {
            apal = apal.c;
        }
        return jxt.a(apal) != 4 ? R.layout.background_promo : R.layout.background_promo_zero_state;
    }

    public final void a(akpb akpb) {
        jxs jxs = this.h;
        if (jxs != null) {
            jxs.a();
        }
        jxs = this.i;
        if (jxs != null) {
            jxs.a();
        }
        this.h = null;
        this.i = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019a  */
    public final /* synthetic */ void a(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.apaj) r11;
        r0 = r9.d;
        r0.removeAllViews();
        r0 = r9.a;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r1 = 2;
        r2 = 0;
        if (r0 != r1) goto L_0x0031;
    L_0x0017:
        r3 = r9.h;
        if (r3 != 0) goto L_0x002e;
    L_0x001b:
        r3 = new jxs;
        r4 = r9.a;
        r5 = defpackage.jxt.a(r11);
        r4 = android.view.View.inflate(r4, r5, r2);
        r5 = r9.e;
        r3.<init>(r9, r4, r5, r1);
        r9.h = r3;
    L_0x002e:
        r3 = r9.h;
        goto L_0x004a;
    L_0x0031:
        r3 = r9.i;
        if (r3 != 0) goto L_0x0048;
    L_0x0035:
        r3 = new jxs;
        r4 = r9.a;
        r5 = defpackage.jxt.a(r11);
        r4 = android.view.View.inflate(r4, r5, r2);
        r5 = r9.e;
        r3.<init>(r9, r4, r5, r0);
        r9.i = r3;
    L_0x0048:
        r3 = r9.i;
    L_0x004a:
        r4 = r9.d;
        r5 = r3.a;
        r4.addView(r5);
        r4 = r9.d;
        r5 = r11.f;
        r4.setBackgroundColor(r5);
        r4 = r11.i;
        if (r4 != 0) goto L_0x005e;
    L_0x005c:
        r4 = defpackage.apal.c;
    L_0x005e:
        r4 = defpackage.jxt.a(r4);
        r5 = r9.g;
        r6 = r4 + -1;
        if (r4 == 0) goto L_0x01aa;
    L_0x0068:
        r4 = 3;
        r7 = 1;
        r8 = 0;
        if (r6 == r7) goto L_0x008a;
    L_0x006d:
        if (r6 == r4) goto L_0x007d;
    L_0x006f:
        r0 = r9.a;
        r0 = r0.getResources();
        r6 = 2131624168; // 0x7f0e00e8 float:1.8875508E38 double:1.0531622713E-314;
        r0 = r0.getDimensionPixelSize(r6);
        goto L_0x0091;
    L_0x007d:
        r5 = r9.f;
        if (r0 != r7) goto L_0x0084;
    L_0x0081:
        r0 = r9.j;
        goto L_0x0085;
    L_0x0084:
        r0 = 0;
    L_0x0085:
        r5.bottomMargin = r0;
        r5 = r9.f;
        goto L_0x0090;
    L_0x008a:
        r5 = r9.f;
        r0 = r9.j;
        r5.bottomMargin = r0;
    L_0x0090:
        r0 = 0;
    L_0x0091:
        r6 = r9.d;
        r6.setLayoutParams(r5);
        r5 = r9.d;
        r5.setMinimumHeight(r0);
        r0 = r3.b;
        r5 = r11.a;
        r5 = r5 & r7;
        if (r5 == 0) goto L_0x00a9;
    L_0x00a2:
        r5 = r11.d;
        if (r5 != 0) goto L_0x00aa;
    L_0x00a6:
        r5 = defpackage.arml.f;
        goto L_0x00aa;
    L_0x00a9:
        r5 = r2;
    L_0x00aa:
        r5 = defpackage.ajqy.a(r5);
        defpackage.xpr.a(r0, r5);
        r0 = r3.c;
        r5 = r11.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x00bf;
    L_0x00b8:
        r1 = r11.e;
        if (r1 != 0) goto L_0x00c0;
    L_0x00bc:
        r1 = defpackage.arml.f;
        goto L_0x00c0;
    L_0x00bf:
        r1 = r2;
    L_0x00c0:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r3.h;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r3.i;
        r0.setVisibility(r1);
        r0 = r11.b;
        if (r0 != r4) goto L_0x00f8;
    L_0x00d7:
        r0 = r11.c;
        r0 = (defpackage.apan) r0;
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x00e5;
    L_0x00e3:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x00e5:
        r4 = r3.l;
        r4 = r4.c;
        r0 = r4.a(r0);
        r4 = r3.h;
        r4.setImageResource(r0);
        r0 = r3.h;
        r0.setVisibility(r8);
        goto L_0x010d;
    L_0x00f8:
        r4 = 7;
        if (r0 != r4) goto L_0x010d;
    L_0x00fb:
        r0 = r3.j;
        r4 = r3.i;
        r5 = r11.c;
        r5 = (defpackage.aygk) r5;
        r6 = defpackage.akko.h;
        r0.a(r4, r5, r6);
        r0 = r3.i;
        r0.setVisibility(r8);
    L_0x010d:
        r0 = r11.a;
        r0 = r0 & 32;
        r4 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r0 != 0) goto L_0x011c;
    L_0x0116:
        r0 = r3.d;
        r0.setVisibility(r1);
        goto L_0x0145;
    L_0x011c:
        r0 = r3.e;
        r5 = r11.g;
        if (r5 != 0) goto L_0x0124;
    L_0x0122:
        r5 = defpackage.apah.c;
    L_0x0124:
        r5 = r5.a;
        if (r5 == r4) goto L_0x012a;
    L_0x0128:
        r5 = r2;
        goto L_0x013b;
    L_0x012a:
        r5 = r11.g;
        if (r5 != 0) goto L_0x0130;
    L_0x012e:
        r5 = defpackage.apah.c;
    L_0x0130:
        r6 = r5.a;
        if (r6 != r4) goto L_0x0139;
    L_0x0134:
        r5 = r5.b;
        r5 = (defpackage.aphg) r5;
        goto L_0x013b;
    L_0x0139:
        r5 = defpackage.aphg.s;
    L_0x013b:
        r6 = r10.a;
        r0.a(r5, r6, r2);
        r0 = r3.d;
        r0.setVisibility(r8);
    L_0x0145:
        r0 = r11.a;
        r0 = r0 & 64;
        if (r0 != 0) goto L_0x0151;
    L_0x014b:
        r11 = r3.f;
        r11.setVisibility(r1);
        goto L_0x017a;
    L_0x0151:
        r0 = r3.g;
        r1 = r11.h;
        if (r1 != 0) goto L_0x0159;
    L_0x0157:
        r1 = defpackage.apah.c;
    L_0x0159:
        r1 = r1.a;
        if (r1 == r4) goto L_0x015f;
    L_0x015d:
        r11 = r2;
        goto L_0x0170;
    L_0x015f:
        r11 = r11.h;
        if (r11 != 0) goto L_0x0165;
    L_0x0163:
        r11 = defpackage.apah.c;
    L_0x0165:
        r1 = r11.a;
        if (r1 != r4) goto L_0x016e;
    L_0x0169:
        r11 = r11.b;
        r11 = (defpackage.aphg) r11;
        goto L_0x0170;
    L_0x016e:
        r11 = defpackage.aphg.s;
    L_0x0170:
        r1 = r10.a;
        r0.a(r11, r1, r2);
        r11 = r3.f;
        r11.setVisibility(r8);
    L_0x017a:
        r11 = r3.l;
        r11 = r11.a;
        r11 = r11.getResources();
        r11 = r11.getDisplayMetrics();
        r0 = -1;
        r1 = "BackgroundPromoPresenter.BottomPaddingKey";
        r1 = r10.a(r1, r0);
        if (r1 == r0) goto L_0x0196;
    L_0x018f:
        r1 = defpackage.xss.a(r11, r1);
        r3.a(r1);
    L_0x0196:
        r1 = r3.k;
        if (r1 != r7) goto L_0x01a9;
    L_0x019a:
        r1 = "BackgroundPromoPresenter.BodyTextTopPaddingKey";
        r10 = r10.a(r1, r0);
        if (r10 == r0) goto L_0x01a9;
    L_0x01a2:
        r10 = defpackage.xss.a(r11, r10);
        r3.b(r10);
    L_0x01a9:
        return;
    L_0x01aa:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxt.a(akor, java.lang.Object):void");
    }

    private static int a(apal apal) {
        int a;
        if (apal != null) {
            a = apad.a(apal.b);
            return a != 0 ? a : 1;
        } else {
            a = 1;
        }
    }
}
