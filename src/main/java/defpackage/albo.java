package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

@Deprecated
/* renamed from: albo */
public final class albo {
    public final albr a;

    public albo(View view, int i, View view2, int i2, int i3) {
        this(view, i, view2, i2);
        this.a.a(i3);
    }

    public static boolean a(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARNING: Missing block: B:7:0x004e, code skipped:
            if (r8 < r0[1]) goto L_0x0096;
     */
    public albo(android.view.View r8, int r9, android.view.View r10, int r11) {
        /*
        r7 = this;
        r7.<init>();
        defpackage.amqw.a(r8);
        defpackage.amqw.a(r10);
        r0 = new albr;
        r1 = r10.getContext();
        r0.<init>(r1);
        r7.a = r0;
        r0 = r7.a;
        r0.c = r8;
        r1 = new android.widget.PopupWindow;
        r1.<init>(r0);
        r0.a = r1;
        r0.addView(r8);
        r8 = defpackage.albo.a(r9);
        r0 = 3;
        r1 = 2;
        r2 = 1;
        if (r8 == 0) goto L_0x005e;
    L_0x002b:
        r8 = r7.a;
        r0 = defpackage.albo.a(r9);
        if (r0 == 0) goto L_0x0096;
    L_0x0033:
        r0 = new int[r1];
        r10.getLocationInWindow(r0);
        r8 = defpackage.albo.a(r8);
        r3 = r10.getResources();
        r3 = r3.getDisplayMetrics();
        r3 = r3.heightPixels;
        r4 = defpackage.albo.a(r10);
        if (r9 != r2) goto L_0x0053;
    L_0x004c:
        r0 = r0[r2];
        if (r8 >= r0) goto L_0x0051;
    L_0x0050:
        goto L_0x0096;
    L_0x0051:
        r9 = 2;
        goto L_0x0096;
    L_0x0053:
        r3 = r3 - r4;
        r0 = r0[r2];
        r3 = r3 - r0;
        if (r8 < r3) goto L_0x0096;
    L_0x0059:
        if (r9 != r2) goto L_0x005c;
    L_0x005b:
        goto L_0x0051;
    L_0x005c:
        r9 = 1;
        goto L_0x0096;
    L_0x005e:
        r8 = r7.a;
        r2 = defpackage.albo.a(r9);
        if (r2 != 0) goto L_0x0096;
    L_0x0066:
        r2 = defpackage.albo.a(r9, r10);
        r1 = new int[r1];
        r10.getLocationInWindow(r1);
        r8 = defpackage.albo.b(r8);
        r3 = r10.getResources();
        r3 = r3.getDisplayMetrics();
        r3 = r3.widthPixels;
        r4 = defpackage.albo.b(r10);
        r5 = 5;
        r6 = 0;
        if (r2 == r5) goto L_0x008c;
    L_0x0085:
        r3 = r3 - r4;
        r1 = r1[r6];
        r3 = r3 - r1;
        if (r8 < r3) goto L_0x0096;
    L_0x008b:
        goto L_0x0091;
    L_0x008c:
        r1 = r1[r6];
        if (r8 >= r1) goto L_0x0091;
    L_0x0090:
        goto L_0x0096;
    L_0x0091:
        if (r9 != r0) goto L_0x0095;
    L_0x0093:
        r9 = 4;
        goto L_0x0096;
    L_0x0095:
        r9 = 3;
    L_0x0096:
        r8 = r7.a;
        r8.e = r10;
        r8.a();
        r8.d = r9;
        r8.g = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albo.<init>(android.view.View, int, android.view.View, int):void");
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(OnDismissListener onDismissListener) {
        PopupWindow popupWindow = this.a.a;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(onDismissListener);
        }
    }

    public final void a() {
        this.a.a();
        this.a.requestLayout();
    }

    private static int a(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        height = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(height, height);
        return view.getMeasuredHeight();
    }

    private static int b(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        width = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(width, width);
        return view.getMeasuredWidth();
    }

    public static int a(int i, View view) {
        int g = abe.g(view);
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return g != 1 ? 5 : 6;
        } else {
            if (i == 4) {
                return g != 1 ? 6 : 5;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public final void b() {
        this.a.b = true;
    }

    public final boolean c() {
        return this.a.isShown();
    }

    public final void d() {
        albr albr = this.a;
        albr.a.setClippingEnabled(false);
        albr.a.setAnimationStyle(16973826);
        albr.a.setBackgroundDrawable(new BitmapDrawable(albr.e.getResources(), ""));
        albr.a.setOutsideTouchable(albr.b);
        albr.a.showAtLocation(albr.e, 0, 0, 0);
    }

    public final void e() {
        PopupWindow popupWindow = this.a.a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
