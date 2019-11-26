package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aiv;
import defpackage.aiw;
import defpackage.aiy;
import defpackage.aja;
import defpackage.ajl;
import defpackage.ajm;
import defpackage.akf;
import defpackage.akm;
import defpackage.akn;
import defpackage.ako;
import defpackage.akp;
import defpackage.akq;
import defpackage.anq;
import defpackage.asy;

public class ActionMenuView extends anq implements aiy, ajl {
    public aiw a;
    public boolean b;
    public akf c;
    public aiv d;
    public akp e;
    private Context f;
    private int g;
    private ajm h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    public final void a(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void a(akf akf) {
        this.c = akf;
        this.c.a(this);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        akf akf = this.c;
        if (akf != null) {
            akf.a();
            if (this.c.i()) {
                this.c.f();
                this.c.e();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0311  */
    public final void onMeasure(int r30, int r31) {
        /*
        r29 = this;
        r0 = r29;
        r1 = r0.i;
        r2 = android.view.View.MeasureSpec.getMode(r30);
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = 1;
        r5 = 0;
        if (r2 != r3) goto L_0x0010;
    L_0x000e:
        r2 = 1;
        goto L_0x0011;
    L_0x0010:
        r2 = 0;
    L_0x0011:
        r0.i = r2;
        if (r1 == r2) goto L_0x0017;
    L_0x0015:
        r0.j = r5;
    L_0x0017:
        r1 = android.view.View.MeasureSpec.getSize(r30);
        r2 = r0.i;
        if (r2 == 0) goto L_0x002c;
    L_0x001f:
        r2 = r0.a;
        if (r2 == 0) goto L_0x002c;
    L_0x0023:
        r6 = r0.j;
        if (r1 == r6) goto L_0x002c;
    L_0x0027:
        r0.j = r1;
        r2.b(r4);
    L_0x002c:
        r1 = r29.getChildCount();
        r2 = r0.i;
        if (r2 != 0) goto L_0x0038;
    L_0x0034:
        r11 = r31;
        goto L_0x031f;
    L_0x0038:
        if (r1 <= 0) goto L_0x031c;
    L_0x003a:
        r1 = android.view.View.MeasureSpec.getMode(r31);
        r2 = android.view.View.MeasureSpec.getSize(r30);
        r6 = android.view.View.MeasureSpec.getSize(r31);
        r7 = r29.getPaddingLeft();
        r8 = r29.getPaddingRight();
        r9 = r29.getPaddingTop();
        r10 = r29.getPaddingBottom();
        r9 = r9 + r10;
        r10 = -2;
        r11 = r31;
        r10 = getChildMeasureSpec(r11, r9, r10);
        r7 = r7 + r8;
        r2 = r2 - r7;
        r7 = r0.k;
        r8 = r2 / r7;
        r11 = r2 % r7;
        if (r8 != 0) goto L_0x006c;
    L_0x0068:
        r0.setMeasuredDimension(r2, r5);
        return;
    L_0x006c:
        r11 = r11 / r8;
        r7 = r7 + r11;
        r11 = r29.getChildCount();
        r19 = r8;
        r8 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
    L_0x007d:
        if (r8 >= r11) goto L_0x0179;
    L_0x007f:
        r3 = r0.getChildAt(r8);
        r4 = r3.getVisibility();
        r5 = 8;
        if (r4 != r5) goto L_0x0093;
    L_0x008b:
        r23 = r2;
        r20 = r6;
        r21 = r9;
        goto L_0x016c;
    L_0x0093:
        r4 = r3 instanceof android.support.v7.view.menu.ActionMenuItemView;
        r15 = r15 + 1;
        if (r4 == 0) goto L_0x00a2;
    L_0x0099:
        r5 = r0.l;
        r20 = r6;
        r6 = 0;
        r3.setPadding(r5, r6, r5, r6);
        goto L_0x00a5;
    L_0x00a2:
        r20 = r6;
        r6 = 0;
    L_0x00a5:
        r5 = r3.getLayoutParams();
        r5 = (defpackage.akn) r5;
        r5.f = r6;
        r5.c = r6;
        r5.b = r6;
        r5.d = r6;
        r5.leftMargin = r6;
        r5.rightMargin = r6;
        if (r4 == 0) goto L_0x00c5;
    L_0x00b9:
        r6 = r3;
        r6 = (android.support.v7.view.menu.ActionMenuItemView) r6;
        r6 = r6.c();
        if (r6 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c5;
    L_0x00c3:
        r6 = 1;
        goto L_0x00c6;
    L_0x00c5:
        r6 = 0;
    L_0x00c6:
        r5.e = r6;
        r6 = r5.a;
        if (r6 != 0) goto L_0x00cf;
    L_0x00cc:
        r6 = r19;
        goto L_0x00d0;
    L_0x00cf:
        r6 = 1;
    L_0x00d0:
        r21 = r3.getLayoutParams();
        r22 = r15;
        r15 = r21;
        r15 = (defpackage.akn) r15;
        r21 = android.view.View.MeasureSpec.getSize(r10);
        r23 = r2;
        r2 = r21 - r9;
        r21 = r9;
        r9 = android.view.View.MeasureSpec.getMode(r10);
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9);
        if (r4 == 0) goto L_0x00f2;
    L_0x00ee:
        r4 = r3;
        r4 = (android.support.v7.view.menu.ActionMenuItemView) r4;
        goto L_0x00f3;
    L_0x00f2:
        r4 = 0;
    L_0x00f3:
        if (r4 == 0) goto L_0x00fe;
    L_0x00f5:
        r4 = r4.c();
        if (r4 != 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x00fe;
    L_0x00fc:
        r4 = 1;
        goto L_0x00ff;
    L_0x00fe:
        r4 = 0;
    L_0x00ff:
        if (r6 <= 0) goto L_0x0127;
    L_0x0101:
        if (r4 != 0) goto L_0x0104;
    L_0x0103:
        goto L_0x0108;
    L_0x0104:
        r9 = 2;
        if (r6 >= r9) goto L_0x0108;
    L_0x0107:
        goto L_0x0127;
    L_0x0108:
        r6 = r6 * r7;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9);
        r3.measure(r6, r2);
        r6 = r3.getMeasuredWidth();
        r9 = r6 / r7;
        r6 = r6 % r7;
        if (r6 == 0) goto L_0x011e;
    L_0x011c:
        r9 = r9 + 1;
    L_0x011e:
        if (r4 != 0) goto L_0x0121;
    L_0x0120:
        goto L_0x0128;
    L_0x0121:
        r6 = 2;
        if (r9 < r6) goto L_0x0125;
    L_0x0124:
        goto L_0x0128;
    L_0x0125:
        r9 = 2;
        goto L_0x0128;
    L_0x0127:
        r9 = 0;
    L_0x0128:
        r6 = r15.a;
        if (r6 == 0) goto L_0x012e;
    L_0x012c:
        r4 = 0;
        goto L_0x0132;
    L_0x012e:
        if (r4 != 0) goto L_0x0131;
    L_0x0130:
        goto L_0x012c;
    L_0x0131:
        r4 = 1;
    L_0x0132:
        r15.d = r4;
        r15.b = r9;
        r4 = r9 * r7;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);
        r3.measure(r4, r2);
        r2 = java.lang.Math.max(r13, r9);
        r4 = r5.d;
        if (r4 == 0) goto L_0x014b;
    L_0x0149:
        r16 = r16 + 1;
    L_0x014b:
        r4 = r5.a;
        if (r4 != 0) goto L_0x0150;
    L_0x014f:
        goto L_0x0151;
    L_0x0150:
        r14 = 1;
    L_0x0151:
        r19 = r19 - r9;
        r3 = r3.getMeasuredHeight();
        r3 = java.lang.Math.max(r12, r3);
        r4 = 1;
        if (r9 != r4) goto L_0x0168;
    L_0x015e:
        r5 = r4 << r8;
        r4 = (long) r5;
        r4 = r17 | r4;
        r13 = r2;
        r12 = r3;
        r17 = r4;
        goto L_0x016a;
    L_0x0168:
        r13 = r2;
        r12 = r3;
    L_0x016a:
        r15 = r22;
    L_0x016c:
        r8 = r8 + 1;
        r6 = r20;
        r9 = r21;
        r2 = r23;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = 0;
        goto L_0x007d;
    L_0x0179:
        r23 = r2;
        r20 = r6;
        if (r14 != 0) goto L_0x0181;
    L_0x017f:
        r2 = 0;
        goto L_0x0185;
    L_0x0181:
        r2 = 2;
        if (r15 != r2) goto L_0x017f;
    L_0x0184:
        r2 = 1;
    L_0x0185:
        r3 = r19;
        r4 = 0;
    L_0x0188:
        if (r16 > 0) goto L_0x018b;
    L_0x018a:
        goto L_0x01e9;
    L_0x018b:
        if (r3 <= 0) goto L_0x01e9;
    L_0x018d:
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 0;
        r9 = 0;
        r21 = 0;
    L_0x0197:
        if (r8 < r11) goto L_0x01ee;
    L_0x0199:
        r17 = r17 | r21;
        if (r9 > r3) goto L_0x01e9;
    L_0x019d:
        r5 = r5 + 1;
        r4 = r3;
        r3 = 0;
    L_0x01a1:
        if (r3 >= r11) goto L_0x01e6;
    L_0x01a3:
        r6 = r0.getChildAt(r3);
        r8 = r6.getLayoutParams();
        r8 = (defpackage.akn) r8;
        r19 = r12;
        r9 = 1;
        r12 = r9 << r3;
        r26 = r10;
        r9 = (long) r12;
        r24 = r21 & r9;
        r27 = 0;
        r12 = (r24 > r27 ? 1 : (r24 == r27 ? 0 : -1));
        if (r12 != 0) goto L_0x01c4;
    L_0x01bd:
        r6 = r8.b;
        if (r6 != r5) goto L_0x01df;
    L_0x01c1:
        r17 = r17 | r9;
        goto L_0x01df;
    L_0x01c4:
        if (r2 == 0) goto L_0x01d5;
    L_0x01c6:
        r9 = r8.e;
        if (r9 == 0) goto L_0x01d5;
    L_0x01ca:
        r9 = 1;
        if (r4 != r9) goto L_0x01d5;
    L_0x01cd:
        r10 = r0.l;
        r12 = r10 + r7;
        r9 = 0;
        r6.setPadding(r12, r9, r10, r9);
    L_0x01d5:
        r6 = r8.b;
        r9 = 1;
        r6 = r6 + r9;
        r8.b = r6;
        r8.f = r9;
        r4 = r4 + -1;
    L_0x01df:
        r3 = r3 + 1;
        r12 = r19;
        r10 = r26;
        goto L_0x01a1;
    L_0x01e6:
        r3 = r4;
        r4 = 1;
        goto L_0x0188;
    L_0x01e9:
        r26 = r10;
        r19 = r12;
        goto L_0x0221;
    L_0x01ee:
        r26 = r10;
        r19 = r12;
        r6 = r0.getChildAt(r8);
        r6 = r6.getLayoutParams();
        r6 = (defpackage.akn) r6;
        r10 = r6.d;
        if (r10 != 0) goto L_0x0201;
    L_0x0200:
        goto L_0x0219;
    L_0x0201:
        r6 = r6.b;
        if (r6 >= r5) goto L_0x020e;
    L_0x0205:
        r24 = 1;
        r9 = r24 << r8;
        r5 = r6;
        r21 = r9;
        r9 = 1;
        goto L_0x0219;
    L_0x020e:
        r24 = 1;
        if (r6 != r5) goto L_0x0219;
    L_0x0212:
        r27 = r24 << r8;
        r21 = r21 | r27;
        r6 = r9 + 1;
        r9 = r6;
    L_0x0219:
        r8 = r8 + 1;
        r12 = r19;
        r10 = r26;
        goto L_0x0197;
    L_0x0221:
        if (r14 == 0) goto L_0x0226;
    L_0x0223:
        r2 = 1;
    L_0x0224:
        r5 = 0;
        goto L_0x022b;
    L_0x0226:
        r2 = 1;
        if (r15 == r2) goto L_0x022a;
    L_0x0229:
        goto L_0x0224;
    L_0x022a:
        r5 = 1;
    L_0x022b:
        if (r3 <= 0) goto L_0x02de;
    L_0x022d:
        r8 = 0;
        r6 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1));
        if (r6 == 0) goto L_0x02de;
    L_0x0233:
        r15 = r15 + -1;
        if (r3 >= r15) goto L_0x0238;
    L_0x0237:
        goto L_0x023e;
    L_0x0238:
        if (r5 != 0) goto L_0x023e;
    L_0x023a:
        if (r13 > r2) goto L_0x023e;
    L_0x023c:
        goto L_0x02de;
    L_0x023e:
        r2 = java.lang.Long.bitCount(r17);
        r2 = (float) r2;
        if (r5 != 0) goto L_0x027e;
    L_0x0245:
        r5 = 1;
        r5 = r17 & r5;
        r8 = -1090519040; // 0xffffffffbf000000 float:-0.5 double:NaN;
        r9 = 0;
        r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r12 == 0) goto L_0x0261;
    L_0x0251:
        r5 = 0;
        r6 = r0.getChildAt(r5);
        r5 = r6.getLayoutParams();
        r5 = (defpackage.akn) r5;
        r5 = r5.e;
        if (r5 != 0) goto L_0x0261;
    L_0x0260:
        r2 = r2 + r8;
    L_0x0261:
        r5 = r11 + -1;
        r6 = 1;
        r9 = r6 << r5;
        r9 = (long) r9;
        r9 = r17 & r9;
        r12 = 0;
        r6 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x027e;
    L_0x026f:
        r5 = r0.getChildAt(r5);
        r5 = r5.getLayoutParams();
        r5 = (defpackage.akn) r5;
        r5 = r5.e;
        if (r5 != 0) goto L_0x027e;
    L_0x027d:
        r2 = r2 + r8;
    L_0x027e:
        r5 = 0;
        r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r5 <= 0) goto L_0x0289;
    L_0x0283:
        r3 = r3 * r7;
        r3 = (float) r3;
        r3 = r3 / r2;
        r5 = (int) r3;
        goto L_0x028a;
    L_0x0289:
        r5 = 0;
    L_0x028a:
        r2 = 0;
    L_0x028b:
        if (r2 >= r11) goto L_0x02de;
    L_0x028d:
        r3 = 1;
        r6 = r3 << r2;
        r8 = (long) r6;
        r8 = r17 & r8;
        r12 = 0;
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x02da;
    L_0x0299:
        r6 = r0.getChildAt(r2);
        r8 = r6.getLayoutParams();
        r8 = (defpackage.akn) r8;
        r6 = r6 instanceof android.support.v7.view.menu.ActionMenuItemView;
        if (r6 == 0) goto L_0x02ba;
    L_0x02a7:
        r8.c = r5;
        r8.f = r3;
        if (r2 != 0) goto L_0x02b7;
    L_0x02ad:
        r3 = r8.e;
        if (r3 != 0) goto L_0x02b7;
    L_0x02b1:
        r3 = -r5;
        r6 = 2;
        r3 = r3 / r6;
        r8.leftMargin = r3;
        goto L_0x02b8;
    L_0x02b7:
        r6 = 2;
    L_0x02b8:
        r3 = 1;
        goto L_0x02c8;
    L_0x02ba:
        r6 = 2;
        r3 = r8.a;
        if (r3 == 0) goto L_0x02ca;
    L_0x02bf:
        r8.c = r5;
        r3 = 1;
        r8.f = r3;
        r4 = -r5;
        r4 = r4 / r6;
        r8.rightMargin = r4;
    L_0x02c8:
        r4 = 1;
        goto L_0x02db;
    L_0x02ca:
        r3 = 1;
        if (r2 == 0) goto L_0x02d1;
    L_0x02cd:
        r9 = r5 / 2;
        r8.leftMargin = r9;
    L_0x02d1:
        r9 = r11 + -1;
        if (r2 == r9) goto L_0x02db;
    L_0x02d5:
        r9 = r5 / 2;
        r8.rightMargin = r9;
        goto L_0x02db;
    L_0x02da:
        r6 = 2;
    L_0x02db:
        r2 = r2 + 1;
        goto L_0x028b;
    L_0x02de:
        if (r4 == 0) goto L_0x030d;
    L_0x02e0:
        r2 = 0;
    L_0x02e1:
        if (r2 >= r11) goto L_0x030d;
    L_0x02e3:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (defpackage.akn) r4;
        r5 = r4.f;
        if (r5 == 0) goto L_0x0304;
    L_0x02f1:
        r5 = r4.b;
        r5 = r5 * r7;
        r4 = r4.c;
        r5 = r5 + r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4);
        r6 = r26;
        r3.measure(r5, r6);
        goto L_0x0308;
    L_0x0304:
        r6 = r26;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0308:
        r2 = r2 + 1;
        r26 = r6;
        goto L_0x02e1;
    L_0x030d:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 != r4) goto L_0x0314;
    L_0x0311:
        r1 = r20;
        goto L_0x0316;
    L_0x0314:
        r1 = r19;
    L_0x0316:
        r2 = r23;
        r0.setMeasuredDimension(r2, r1);
        return;
    L_0x031c:
        r11 = r31;
        r5 = 0;
    L_0x031f:
        if (r5 >= r1) goto L_0x0333;
    L_0x0321:
        r2 = r0.getChildAt(r5);
        r2 = r2.getLayoutParams();
        r2 = (defpackage.akn) r2;
        r3 = 0;
        r2.rightMargin = r3;
        r2.leftMargin = r3;
        r5 = r5 + 1;
        goto L_0x031f;
    L_0x0333:
        super.onMeasure(r30, r31);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.i) {
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = i3 - i;
            int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
            boolean a = asy.a(this);
            int i8 = paddingRight;
            int i9 = 0;
            int i10 = 0;
            for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
                View childAt = getChildAt(paddingRight);
                if (childAt.getVisibility() != 8) {
                    akn akn = (akn) childAt.getLayoutParams();
                    if (akn.a) {
                        int paddingLeft;
                        int i11;
                        i9 = childAt.getMeasuredWidth();
                        if (b(paddingRight)) {
                            i9 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = getPaddingLeft() + akn.leftMargin;
                            i11 = paddingLeft + i9;
                        } else {
                            i11 = (getWidth() - getPaddingRight()) - akn.rightMargin;
                            paddingLeft = i11 - i9;
                        }
                        i5 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i5, i11, measuredHeight + i5);
                        i8 -= i9;
                        i9 = 1;
                    } else {
                        i8 -= (childAt.getMeasuredWidth() + akn.leftMargin) + akn.rightMargin;
                        b(paddingRight);
                        i10++;
                    }
                }
            }
            if (childCount == 1 && i9 == 0) {
                View childAt2 = getChildAt(0);
                dividerWidth = childAt2.getMeasuredWidth();
                paddingRight = childAt2.getMeasuredHeight();
                i7 = (i7 / 2) - (dividerWidth / 2);
                i6 -= paddingRight / 2;
                childAt2.layout(i7, i6, dividerWidth + i7, paddingRight + i6);
                return;
            }
            i10 -= i9 ^ 1;
            if (i10 > 0) {
                i5 = i8 / i10;
                dividerWidth = 0;
            } else {
                dividerWidth = 0;
                i5 = 0;
            }
            i7 = Math.max(dividerWidth, i5);
            View childAt3;
            akn akn2;
            if (a) {
                paddingRight = getWidth() - getPaddingRight();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    akn2 = (akn) childAt3.getLayoutParams();
                    if (!(childAt3.getVisibility() == 8 || akn2.a)) {
                        paddingRight -= akn2.rightMargin;
                        i9 = childAt3.getMeasuredWidth();
                        i10 = childAt3.getMeasuredHeight();
                        i8 = i6 - (i10 / 2);
                        childAt3.layout(paddingRight - i9, i8, paddingRight, i10 + i8);
                        paddingRight -= (i9 + akn2.leftMargin) + i7;
                    }
                    dividerWidth++;
                }
            } else {
                paddingRight = getPaddingLeft();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    akn2 = (akn) childAt3.getLayoutParams();
                    if (!(childAt3.getVisibility() == 8 || akn2.a)) {
                        paddingRight += akn2.leftMargin;
                        i9 = childAt3.getMeasuredWidth();
                        i10 = childAt3.getMeasuredHeight();
                        i8 = i6 - (i10 / 2);
                        childAt3.layout(paddingRight, i8, paddingRight + i9, i10 + i8);
                        paddingRight += (i9 + akn2.rightMargin) + i7;
                    }
                    dividerWidth++;
                }
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public static akn a() {
        akn akn = new akn();
        akn.h = 16;
        return akn;
    }

    public static akn a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return a();
        }
        akn akn;
        if (layoutParams instanceof akn) {
            akn = new akn((akn) layoutParams);
        } else {
            akn = new akn(layoutParams);
        }
        if (akn.h <= 0) {
            akn.h = 16;
        }
        return akn;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof akn;
    }

    public final boolean a(aja aja) {
        return this.a.a((MenuItem) aja, 0);
    }

    public final void a(aiw aiw) {
        this.a = aiw;
    }

    public final Menu b() {
        if (this.a == null) {
            Context context = getContext();
            this.a = new aiw(context);
            this.a.a(new akq(this));
            this.c = new akf(context);
            this.c.c();
            akf akf = this.c;
            ajm ajm = this.h;
            if (ajm == null) {
                ajm = new ako();
            }
            akf.e = ajm;
            this.a.a(this.c, this.f);
            this.c.a(this);
        }
        return this.a;
    }

    public final void a(ajm ajm, aiv aiv) {
        this.h = ajm;
        this.d = aiv;
    }

    public final void c() {
        akf akf = this.c;
        if (akf != null) {
            akf.g();
        }
    }

    private final boolean b(int i) {
        boolean z = false;
        if (i != 0) {
            View childAt = getChildAt(i - 1);
            View childAt2 = getChildAt(i);
            if (i < getChildCount() && (childAt instanceof akm)) {
                z = ((akm) childAt).e();
            }
            if (i > 0 && (childAt2 instanceof akm)) {
                return ((akm) childAt2).d() | z;
            }
        }
        return z;
    }
}
