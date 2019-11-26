package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import com.google.android.youtube.R;

/* renamed from: aeh */
public class aeh extends afe implements DialogInterface {
    public final AlertController a = new AlertController(getContext(), this, getWindow());

    protected aeh(Context context, int i) {
        super(context, aeh.a(context, i));
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button a(int i) {
        AlertController alertController = this.a;
        if (i != -2) {
            return alertController.k;
        }
        return alertController.o;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A:{SYNTHETIC, RETURN} */
    public void onCreate(android.os.Bundle r15) {
        /*
        r14 = this;
        super.onCreate(r15);
        r15 = r14.a;
        r0 = r15.D;
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        r0 = r15.C;
        goto L_0x000e;
    L_0x000c:
        r0 = r15.C;
    L_0x000e:
        r1 = r15.b;
        r1.setContentView(r0);
        r0 = r15.c;
        r1 = 2131755432; // 0x7f1001a8 float:1.9141743E38 double:1.0532271243E-314;
        r0 = r0.findViewById(r1);
        r1 = 2131755440; // 0x7f1001b0 float:1.914176E38 double:1.053227128E-314;
        r2 = r0.findViewById(r1);
        r3 = 2131755433; // 0x7f1001a9 float:1.9141745E38 double:1.053227125E-314;
        r4 = r0.findViewById(r3);
        r5 = 2131755430; // 0x7f1001a6 float:1.914174E38 double:1.0532271233E-314;
        r6 = r0.findViewById(r5);
        r7 = 2131755439; // 0x7f1001af float:1.9141757E38 double:1.0532271277E-314;
        r0 = r0.findViewById(r7);
        r0 = (android.view.ViewGroup) r0;
        r7 = r15.h;
        r8 = 0;
        if (r7 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0041;
    L_0x0040:
        r7 = r8;
    L_0x0041:
        r9 = -1;
        r10 = 8;
        if (r7 == 0) goto L_0x004c;
    L_0x0046:
        r11 = android.support.v7.app.AlertController.a(r7);
        if (r11 != 0) goto L_0x0055;
    L_0x004c:
        r11 = r15.c;
        r12 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r11.setFlags(r12, r12);
        if (r7 == 0) goto L_0x0076;
    L_0x0055:
        r11 = r15.c;
        r12 = 2131755350; // 0x7f100156 float:1.9141577E38 double:1.053227084E-314;
        r11 = r11.findViewById(r12);
        r11 = (android.widget.FrameLayout) r11;
        r12 = new android.view.ViewGroup$LayoutParams;
        r12.<init>(r9, r9);
        r11.addView(r7, r12);
        r7 = r15.g;
        if (r7 == 0) goto L_0x0079;
    L_0x006c:
        r7 = r0.getLayoutParams();
        r7 = (defpackage.anp) r7;
        r11 = 0;
        r7.g = r11;
        goto L_0x0079;
    L_0x0076:
        r0.setVisibility(r10);
    L_0x0079:
        r1 = r0.findViewById(r1);
        r3 = r0.findViewById(r3);
        r5 = r0.findViewById(r5);
        r1 = android.support.v7.app.AlertController.a(r1, r2);
        r2 = android.support.v7.app.AlertController.a(r3, r4);
        r3 = android.support.v7.app.AlertController.a(r5, r6);
        r4 = r15.c;
        r5 = 2131755435; // 0x7f1001ab float:1.914175E38 double:1.053227126E-314;
        r4 = r4.findViewById(r5);
        r4 = (android.support.v4.widget.NestedScrollView) r4;
        r15.t = r4;
        r4 = r15.t;
        r5 = 0;
        r4.setFocusable(r5);
        r4 = r15.t;
        r4.setNestedScrollingEnabled(r5);
        r4 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r4 = r2.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r15.y = r4;
        r4 = r15.y;
        if (r4 == 0) goto L_0x00ed;
    L_0x00b8:
        r6 = r15.f;
        if (r6 == 0) goto L_0x00c0;
    L_0x00bc:
        r4.setText(r6);
        goto L_0x00ed;
    L_0x00c0:
        r4.setVisibility(r10);
        r4 = r15.t;
        r6 = r15.y;
        r4.removeView(r6);
        r4 = r15.g;
        if (r4 == 0) goto L_0x00ea;
    L_0x00ce:
        r4 = r15.t;
        r4 = r4.getParent();
        r4 = (android.view.ViewGroup) r4;
        r6 = r15.t;
        r6 = r4.indexOfChild(r6);
        r4.removeViewAt(r6);
        r7 = r15.g;
        r11 = new android.view.ViewGroup$LayoutParams;
        r11.<init>(r9, r9);
        r4.addView(r7, r6, r11);
        goto L_0x00ed;
    L_0x00ea:
        r2.setVisibility(r10);
    L_0x00ed:
        r4 = 16908313; // 0x1020019 float:2.38773E-38 double:8.3538166E-317;
        r4 = r3.findViewById(r4);
        r4 = (android.widget.Button) r4;
        r15.k = r4;
        r4 = r15.k;
        r6 = r15.J;
        r4.setOnClickListener(r6);
        r4 = r15.l;
        r4 = android.text.TextUtils.isEmpty(r4);
        r6 = 1;
        if (r4 == 0) goto L_0x010f;
    L_0x0108:
        r4 = r15.k;
        r4.setVisibility(r10);
        r4 = 0;
        goto L_0x011c;
    L_0x010f:
        r4 = r15.k;
        r7 = r15.l;
        r4.setText(r7);
        r4 = r15.k;
        r4.setVisibility(r5);
        r4 = 1;
    L_0x011c:
        r7 = 16908314; // 0x102001a float:2.3877302E-38 double:8.353817E-317;
        r7 = r3.findViewById(r7);
        r7 = (android.widget.Button) r7;
        r15.o = r7;
        r7 = r15.o;
        r11 = r15.J;
        r7.setOnClickListener(r11);
        r7 = r15.p;
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 == 0) goto L_0x013c;
    L_0x0136:
        r7 = r15.o;
        r7.setVisibility(r10);
        goto L_0x014a;
    L_0x013c:
        r7 = r15.o;
        r11 = r15.p;
        r7.setText(r11);
        r7 = r15.o;
        r7.setVisibility(r5);
        r4 = r4 | 2;
    L_0x014a:
        r7 = 16908315; // 0x102001b float:2.3877305E-38 double:8.3538176E-317;
        r7 = r3.findViewById(r7);
        r7 = (android.widget.Button) r7;
        r15.s = r7;
        r7 = r15.s;
        r11 = r15.J;
        r7.setOnClickListener(r11);
        r7 = android.text.TextUtils.isEmpty(r8);
        if (r7 == 0) goto L_0x0168;
    L_0x0162:
        r7 = r15.s;
        r7.setVisibility(r10);
        goto L_0x0174;
    L_0x0168:
        r7 = r15.s;
        r7.setText(r8);
        r7 = r15.s;
        r7.setVisibility(r5);
        r4 = r4 | 4;
    L_0x0174:
        r7 = r15.a;
        r11 = new android.util.TypedValue;
        r11.<init>();
        r7 = r7.getTheme();
        r12 = 2130772526; // 0x7f01022e float:1.7148173E38 double:1.052741504E-314;
        r7.resolveAttribute(r12, r11, r6);
        r7 = r11.data;
        r11 = 2;
        if (r7 == 0) goto L_0x01a3;
    L_0x018a:
        if (r4 == r6) goto L_0x019d;
    L_0x018c:
        if (r4 != r11) goto L_0x0194;
    L_0x018e:
        r4 = r15.o;
        android.support.v7.app.AlertController.a(r4);
        goto L_0x01a8;
    L_0x0194:
        r7 = 4;
        if (r4 != r7) goto L_0x01a3;
    L_0x0197:
        r4 = r15.s;
        android.support.v7.app.AlertController.a(r4);
        goto L_0x01a8;
    L_0x019d:
        r4 = r15.k;
        android.support.v7.app.AlertController.a(r4);
        goto L_0x01a8;
    L_0x01a3:
        if (r4 != 0) goto L_0x01a8;
    L_0x01a5:
        r3.setVisibility(r10);
    L_0x01a8:
        r4 = r15.z;
        r7 = 2131755441; // 0x7f1001b1 float:1.9141761E38 double:1.0532271287E-314;
        if (r4 == 0) goto L_0x01c4;
    L_0x01af:
        r4 = new android.view.ViewGroup$LayoutParams;
        r12 = -2;
        r4.<init>(r9, r12);
        r9 = r15.z;
        r1.addView(r9, r5, r4);
        r4 = r15.c;
        r4 = r4.findViewById(r7);
        r4.setVisibility(r10);
        goto L_0x0230;
    L_0x01c4:
        r4 = r15.c;
        r9 = 16908294; // 0x1020006 float:2.3877246E-38 double:8.353807E-317;
        r4 = r4.findViewById(r9);
        r4 = (android.widget.ImageView) r4;
        r15.w = r4;
        r4 = r15.e;
        r4 = android.text.TextUtils.isEmpty(r4);
        r4 = r4 ^ r6;
        if (r4 == 0) goto L_0x021f;
    L_0x01da:
        r4 = r15.H;
        if (r4 == 0) goto L_0x021f;
    L_0x01de:
        r4 = r15.c;
        r7 = 2131755442; // 0x7f1001b2 float:1.9141763E38 double:1.053227129E-314;
        r4 = r4.findViewById(r7);
        r4 = (android.widget.TextView) r4;
        r15.x = r4;
        r4 = r15.x;
        r7 = r15.e;
        r4.setText(r7);
        r4 = r15.v;
        if (r4 == 0) goto L_0x01fc;
    L_0x01f6:
        r7 = r15.w;
        r7.setImageDrawable(r4);
        goto L_0x0230;
    L_0x01fc:
        r4 = r15.x;
        r7 = r15.w;
        r7 = r7.getPaddingLeft();
        r9 = r15.w;
        r9 = r9.getPaddingTop();
        r12 = r15.w;
        r12 = r12.getPaddingRight();
        r13 = r15.w;
        r13 = r13.getPaddingBottom();
        r4.setPadding(r7, r9, r12, r13);
        r4 = r15.w;
        r4.setVisibility(r10);
        goto L_0x0230;
    L_0x021f:
        r4 = r15.c;
        r4 = r4.findViewById(r7);
        r4.setVisibility(r10);
        r4 = r15.w;
        r4.setVisibility(r10);
        r1.setVisibility(r10);
    L_0x0230:
        r0 = r0.getVisibility();
        if (r0 != r10) goto L_0x0238;
    L_0x0236:
        r0 = 0;
        goto L_0x0239;
    L_0x0238:
        r0 = 1;
    L_0x0239:
        if (r1 == 0) goto L_0x0244;
    L_0x023b:
        r4 = r1.getVisibility();
        if (r4 != r10) goto L_0x0242;
    L_0x0241:
        goto L_0x0244;
    L_0x0242:
        r4 = 1;
        goto L_0x0245;
    L_0x0244:
        r4 = 0;
    L_0x0245:
        r3 = r3.getVisibility();
        if (r3 != r10) goto L_0x024d;
    L_0x024b:
        r3 = 0;
        goto L_0x024e;
    L_0x024d:
        r3 = 1;
    L_0x024e:
        if (r3 != 0) goto L_0x025c;
    L_0x0250:
        r7 = 2131755437; // 0x7f1001ad float:1.9141753E38 double:1.053227127E-314;
        r7 = r2.findViewById(r7);
        if (r7 == 0) goto L_0x025c;
    L_0x0259:
        r7.setVisibility(r5);
    L_0x025c:
        if (r4 == 0) goto L_0x027d;
    L_0x025e:
        r7 = r15.t;
        if (r7 == 0) goto L_0x0265;
    L_0x0262:
        r7.setClipToPadding(r6);
    L_0x0265:
        r7 = r15.f;
        if (r7 != 0) goto L_0x0270;
    L_0x0269:
        r7 = r15.g;
        if (r7 == 0) goto L_0x026e;
    L_0x026d:
        goto L_0x0270;
    L_0x026e:
        r1 = r8;
        goto L_0x0277;
    L_0x0270:
        r7 = 2131755443; // 0x7f1001b3 float:1.9141765E38 double:1.0532271297E-314;
        r1 = r1.findViewById(r7);
    L_0x0277:
        if (r1 == 0) goto L_0x0289;
    L_0x0279:
        r1.setVisibility(r5);
        goto L_0x0289;
    L_0x027d:
        r1 = 2131755436; // 0x7f1001ac float:1.9141751E38 double:1.0532271263E-314;
        r1 = r2.findViewById(r1);
        if (r1 == 0) goto L_0x0289;
    L_0x0286:
        r1.setVisibility(r5);
    L_0x0289:
        r1 = r15.g;
        r7 = r1 instanceof android.support.v7.app.AlertController.RecycleListView;
        if (r7 == 0) goto L_0x02b3;
    L_0x028f:
        r1 = (android.support.v7.app.AlertController.RecycleListView) r1;
        if (r3 != 0) goto L_0x0294;
    L_0x0293:
        goto L_0x0296;
    L_0x0294:
        if (r4 != 0) goto L_0x02b3;
    L_0x0296:
        r7 = r1.getPaddingLeft();
        if (r4 != 0) goto L_0x029f;
    L_0x029c:
        r9 = r1.a;
        goto L_0x02a3;
    L_0x029f:
        r9 = r1.getPaddingTop();
    L_0x02a3:
        r10 = r1.getPaddingRight();
        if (r3 != 0) goto L_0x02ac;
    L_0x02a9:
        r12 = r1.b;
        goto L_0x02b0;
    L_0x02ac:
        r12 = r1.getPaddingBottom();
    L_0x02b0:
        r1.setPadding(r7, r9, r10, r12);
    L_0x02b3:
        if (r0 == 0) goto L_0x02b7;
    L_0x02b5:
        goto L_0x033d;
    L_0x02b7:
        r0 = r15.g;
        if (r0 != 0) goto L_0x02bd;
    L_0x02bb:
        r0 = r15.t;
    L_0x02bd:
        if (r0 == 0) goto L_0x033d;
    L_0x02bf:
        if (r3 != 0) goto L_0x02c2;
    L_0x02c1:
        goto L_0x02c3;
    L_0x02c2:
        r5 = 2;
    L_0x02c3:
        r1 = r4 | r5;
        r3 = r15.c;
        r4 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r3 = r3.findViewById(r4);
        r4 = r15.c;
        r5 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r4 = r4.findViewById(r5);
        r5 = android.os.Build.VERSION.SDK_INT;
        r7 = 23;
        if (r5 < r7) goto L_0x02eb;
    L_0x02dd:
        defpackage.abe.f(r0, r1);
        if (r3 == 0) goto L_0x02e5;
    L_0x02e2:
        r2.removeView(r3);
    L_0x02e5:
        if (r4 == 0) goto L_0x033d;
    L_0x02e7:
        r2.removeView(r4);
        goto L_0x033d;
    L_0x02eb:
        if (r3 == 0) goto L_0x02f5;
    L_0x02ed:
        r0 = r1 & 1;
        if (r0 != 0) goto L_0x02f5;
    L_0x02f1:
        r2.removeView(r3);
        r3 = r8;
    L_0x02f5:
        if (r4 == 0) goto L_0x02ff;
    L_0x02f7:
        r0 = r1 & 2;
        if (r0 != 0) goto L_0x02ff;
    L_0x02fb:
        r2.removeView(r4);
        r4 = r8;
    L_0x02ff:
        if (r3 == 0) goto L_0x0302;
    L_0x0301:
        goto L_0x0304;
    L_0x0302:
        if (r4 == 0) goto L_0x033d;
    L_0x0304:
        r0 = r15.f;
        if (r0 == 0) goto L_0x031c;
    L_0x0308:
        r0 = r15.t;
        r1 = new adx;
        r1.<init>(r3, r4);
        r0.a = r1;
        r0 = r15.t;
        r1 = new aea;
        r1.<init>(r15, r3, r4);
        r0.post(r1);
        goto L_0x033d;
    L_0x031c:
        r0 = r15.g;
        if (r0 == 0) goto L_0x0333;
    L_0x0320:
        r1 = new adz;
        r1.<init>(r3, r4);
        r0.setOnScrollListener(r1);
        r0 = r15.g;
        r1 = new aec;
        r1.<init>(r15, r3, r4);
        r0.post(r1);
        goto L_0x033d;
    L_0x0333:
        if (r3 == 0) goto L_0x0338;
    L_0x0335:
        r2.removeView(r3);
    L_0x0338:
        if (r4 == 0) goto L_0x033d;
    L_0x033a:
        r2.removeView(r4);
    L_0x033d:
        r0 = r15.g;
        if (r0 == 0) goto L_0x0352;
    L_0x0341:
        r1 = r15.A;
        if (r1 == 0) goto L_0x0352;
    L_0x0345:
        r0.setAdapter(r1);
        r15 = r15.B;
        if (r15 < 0) goto L_0x0352;
    L_0x034c:
        r0.setItemChecked(r15, r6);
        r0.setSelection(r15);
    L_0x0352:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.t;
        if (nestedScrollView == null || !nestedScrollView.a(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.t;
        if (nestedScrollView == null || !nestedScrollView.a(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }
}
