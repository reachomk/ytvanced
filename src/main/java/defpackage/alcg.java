package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

/* renamed from: alcg */
public final class alcg {
    public final alci a;
    private final View b;
    private final int c;
    private final int d;
    private final int e;

    public alcg(View view, View view2, int i, int i2) {
        this(view, view2, i, i2, 0);
    }

    private static boolean b(int i) {
        return i == 1 || i == 2;
    }

    public alcg(View view, View view2, int i, int i2, int i3) {
        amqw.a((Object) view);
        this.b = (View) amqw.a((Object) view2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = new alci(view.getContext());
        alci alci = this.a;
        alci.f = view;
        alci.c = new PopupWindow(alci);
        alci.addView(view);
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public static int a(int i, View view) {
        int g = abe.g(view);
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return g != 1 ? 4 : 3;
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (g != 1) {
                return 3;
            }
        }
        return i2;
    }

    public final boolean a() {
        return this.a.isShown();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARNING: Missing block: B:10:0x0043, code skipped:
            if (r2 < r11.top) goto L_0x0099;
     */
    public final void a(android.graphics.Rect r11) {
        /*
        r10 = this;
        r6 = r10.c;
        r7 = r10.d;
        r0 = r10.a;
        r1 = r10.b;
        r5 = r10.e;
        r2 = r11;
        r3 = r6;
        r4 = r7;
        r0.a(r1, r2, r3, r4, r5);
        r0 = defpackage.alcg.b(r6);
        r1 = 2;
        r2 = 3;
        r8 = 1;
        r9 = 0;
        if (r0 == 0) goto L_0x0057;
    L_0x001a:
        r0 = r10.a;
        r2 = defpackage.alcg.b(r6);
        if (r2 != 0) goto L_0x0024;
    L_0x0022:
        goto L_0x0099;
    L_0x0024:
        r2 = r0.getHeight();
        if (r2 != 0) goto L_0x0035;
    L_0x002a:
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r9);
        r0.measure(r2, r2);
        r2 = r0.getMeasuredHeight();
    L_0x0035:
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.heightPixels;
        if (r6 != r8) goto L_0x0048;
    L_0x0041:
        r0 = r11.top;
        if (r2 >= r0) goto L_0x0046;
    L_0x0045:
        goto L_0x0099;
    L_0x0046:
        r3 = 2;
        goto L_0x009a;
    L_0x0048:
        r3 = r11.height();
        r0 = r0 - r3;
        r3 = r11.top;
        r0 = r0 - r3;
        if (r2 < r0) goto L_0x0099;
    L_0x0052:
        if (r6 != r8) goto L_0x0055;
    L_0x0054:
        goto L_0x0046;
    L_0x0055:
        r3 = 1;
        goto L_0x009a;
    L_0x0057:
        r0 = r10.a;
        r1 = r10.b;
        r3 = defpackage.alcg.b(r6);
        if (r3 != 0) goto L_0x0099;
    L_0x0061:
        r1 = defpackage.alcg.a(r6, r1);
        r3 = r0.getWidth();
        if (r3 != 0) goto L_0x0076;
    L_0x006b:
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r9);
        r0.measure(r3, r3);
        r3 = r0.getMeasuredWidth();
    L_0x0076:
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.widthPixels;
        if (r1 != r2) goto L_0x0087;
    L_0x0082:
        r0 = r11.left;
        if (r3 < r0) goto L_0x0099;
    L_0x0086:
        goto L_0x0092;
    L_0x0087:
        r1 = r11.width();
        r0 = r0 - r1;
        r1 = r11.left;
        r0 = r0 - r1;
        if (r3 >= r0) goto L_0x0092;
    L_0x0091:
        goto L_0x0099;
    L_0x0092:
        if (r6 != r2) goto L_0x0097;
    L_0x0094:
        r6 = 4;
        r3 = 4;
        goto L_0x009a;
    L_0x0097:
        r3 = 3;
        goto L_0x009a;
    L_0x0099:
        r3 = r6;
    L_0x009a:
        r0 = r10.c;
        if (r3 == r0) goto L_0x00a9;
    L_0x009e:
        r0 = r10.a;
        r1 = r10.b;
        r5 = r10.e;
        r2 = r11;
        r4 = r7;
        r0.a(r1, r2, r3, r4, r5);
    L_0x00a9:
        r11 = r10.a;
        r0 = r11.c;
        r0.setClippingEnabled(r9);
        r0 = r11.c;
        r1 = 16973826; // 0x1030002 float:2.4060906E-38 double:8.3861843E-317;
        r0.setAnimationStyle(r1);
        r0 = r11.h;
        if (r0 == r8) goto L_0x00d6;
    L_0x00bc:
        r0 = r11.c;
        r1 = new android.graphics.drawable.BitmapDrawable;
        r2 = r11.a;
        r2 = r2.getResources();
        r3 = "";
        r1.<init>(r2, r3);
        r0.setBackgroundDrawable(r1);
        r0 = r11.c;
        r1 = r11.e;
        r0.setOutsideTouchable(r1);
        goto L_0x00ff;
    L_0x00d6:
        r0 = new albt;
        r1 = r11.a;
        r2 = r11.g;
        r3 = r11.e;
        r0.<init>(r1, r11, r2, r3);
        r11.b = r0;
        r0 = r11.g;
        r0 = r0.getRootView();
        r0 = r0 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x00fa;
    L_0x00ed:
        r0 = r11.g;
        r0 = r0.getRootView();
        r0 = (android.view.ViewGroup) r0;
        r1 = r11.b;
        r0.addView(r1);
    L_0x00fa:
        r0 = r11.c;
        r0.setOutsideTouchable(r9);
    L_0x00ff:
        r0 = r11.c;
        r1 = new alcl;
        r1.<init>(r11);
        r0.setOnDismissListener(r1);
        r0 = r11.c;
        r11 = r11.g;
        r0.showAtLocation(r11, r9, r9, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alcg.a(android.graphics.Rect):void");
    }

    public final void a(int i) {
        this.a.a(i);
    }
}
