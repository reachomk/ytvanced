package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: azs */
final class azs implements OnGlobalLayoutListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ azl b;

    azs(azl azl, boolean z) {
        this.b = azl;
        this.a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0117 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0190  */
    public final void onGlobalLayout() {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.b;
        r1 = r1.i;
        r1 = r1.getViewTreeObserver();
        r1.removeGlobalOnLayoutListener(r0);
        r1 = r0.b;
        r2 = r1.N;
        r3 = 1;
        if (r2 == 0) goto L_0x0017;
    L_0x0014:
        r1.O = r3;
        return;
    L_0x0017:
        r2 = r0.a;
        r4 = r1.k;
        r4 = defpackage.azl.a(r4);
        r5 = r1.k;
        r6 = -1;
        defpackage.azl.b(r5, r6);
        r5 = r1.c();
        r1.c(r5);
        r5 = r1.getWindow();
        r5 = r5.getDecorView();
        r6 = r1.getWindow();
        r6 = r6.getAttributes();
        r6 = r6.width;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7);
        r7 = 0;
        r5.measure(r6, r7);
        r6 = r1.k;
        defpackage.azl.b(r6, r4);
        r4 = r1.f;
        r4 = r1.j;
        r4 = r4.getDrawable();
        r4 = r4 instanceof android.graphics.drawable.BitmapDrawable;
        if (r4 == 0) goto L_0x0088;
    L_0x0059:
        r4 = r1.j;
        r4 = r4.getDrawable();
        r4 = (android.graphics.drawable.BitmapDrawable) r4;
        r4 = r4.getBitmap();
        if (r4 == 0) goto L_0x0088;
    L_0x0067:
        r6 = r4.getWidth();
        r8 = r4.getHeight();
        r6 = r1.a(r6, r8);
        r8 = r1.j;
        r9 = r4.getWidth();
        r4 = r4.getHeight();
        if (r9 >= r4) goto L_0x0082;
    L_0x007f:
        r4 = android.widget.ImageView.ScaleType.FIT_CENTER;
        goto L_0x0084;
    L_0x0082:
        r4 = android.widget.ImageView.ScaleType.FIT_XY;
    L_0x0084:
        r8.setScaleType(r4);
        goto L_0x0089;
    L_0x0088:
        r6 = 0;
    L_0x0089:
        r4 = r1.c();
        r4 = r1.b(r4);
        r8 = r1.o;
        r8 = r8.size();
        r9 = r1.d;
        r9 = r9.f();
        if (r9 == 0) goto L_0x00ae;
    L_0x009f:
        r9 = r1.w;
        r10 = r1.d;
        r10 = r10.g();
        r10 = r10.size();
        r9 = r9 * r10;
        goto L_0x00af;
    L_0x00ae:
        r9 = 0;
    L_0x00af:
        if (r8 <= 0) goto L_0x00b4;
    L_0x00b1:
        r8 = r1.y;
        r9 = r9 + r8;
    L_0x00b4:
        r8 = r1.x;
        r8 = java.lang.Math.min(r9, r8);
        r9 = r1.M;
        if (r9 != 0) goto L_0x00bf;
    L_0x00be:
        r8 = 0;
    L_0x00bf:
        r9 = java.lang.Math.max(r6, r8);
        r9 = r9 + r4;
        r10 = new android.graphics.Rect;
        r10.<init>();
        r5.getWindowVisibleDisplayFrame(r10);
        r5 = r1.h;
        r5 = r5.getMeasuredHeight();
        r11 = r1.i;
        r11 = r11.getMeasuredHeight();
        r12 = r10.height();
        r5 = r5 - r11;
        r12 = r12 - r5;
        r5 = r1.f;
        r5 = 8;
        if (r6 > 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00f2;
    L_0x00e5:
        if (r9 > r12) goto L_0x00f2;
    L_0x00e7:
        r4 = r1.j;
        r4.setVisibility(r7);
        r4 = r1.j;
        defpackage.azl.b(r4, r6);
        goto L_0x0110;
    L_0x00f2:
        r6 = r1.m;
        r6 = defpackage.azl.a(r6);
        r9 = r1.k;
        r9 = r9.getMeasuredHeight();
        r6 = r6 + r9;
        r9 = r1.i;
        r9 = r9.getMeasuredHeight();
        if (r6 >= r9) goto L_0x0108;
    L_0x0107:
        goto L_0x010d;
    L_0x0108:
        r6 = r1.j;
        r6.setVisibility(r5);
    L_0x010d:
        r9 = r8 + r4;
        r6 = 0;
    L_0x0110:
        r4 = r1.c();
        if (r4 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x011f;
    L_0x0117:
        if (r9 > r12) goto L_0x011f;
    L_0x0119:
        r4 = r1.l;
        r4.setVisibility(r7);
        goto L_0x0124;
    L_0x011f:
        r4 = r1.l;
        r4.setVisibility(r5);
    L_0x0124:
        r4 = r1.l;
        r4 = r4.getVisibility();
        if (r4 != 0) goto L_0x012e;
    L_0x012c:
        r4 = 1;
        goto L_0x012f;
    L_0x012e:
        r4 = 0;
    L_0x012f:
        r1.c(r4);
        r4 = r1.l;
        r4 = r4.getVisibility();
        if (r4 != 0) goto L_0x013c;
    L_0x013a:
        r4 = 1;
        goto L_0x013d;
    L_0x013c:
        r4 = 0;
    L_0x013d:
        r4 = r1.b(r4);
        r5 = java.lang.Math.max(r6, r8);
        r5 = r5 + r4;
        if (r5 <= r12) goto L_0x014b;
    L_0x0148:
        r5 = r5 - r12;
        r8 = r8 - r5;
        r5 = r12;
    L_0x014b:
        r6 = r1.k;
        r6.clearAnimation();
        r6 = r1.m;
        r6.clearAnimation();
        r6 = r1.i;
        r6.clearAnimation();
        if (r2 == 0) goto L_0x016c;
    L_0x015c:
        r6 = r1.k;
        r1.a(r6, r4);
        r4 = r1.m;
        r1.a(r4, r8);
        r4 = r1.i;
        r1.a(r4, r5);
        goto L_0x017b;
    L_0x016c:
        r6 = r1.k;
        defpackage.azl.b(r6, r4);
        r4 = r1.m;
        defpackage.azl.b(r4, r8);
        r4 = r1.i;
        defpackage.azl.b(r4, r5);
    L_0x017b:
        r4 = r1.g;
        r5 = r10.height();
        defpackage.azl.b(r4, r5);
        r4 = r1.d;
        r4 = r4.g();
        r5 = r4.isEmpty();
        if (r5 == 0) goto L_0x019b;
    L_0x0190:
        r2 = r1.o;
        r2.clear();
        r1 = r1.n;
        r1.notifyDataSetChanged();
        return;
    L_0x019b:
        r5 = r1.o;
        r6 = new java.util.HashSet;
        r6.<init>(r5);
        r5 = new java.util.HashSet;
        r5.<init>(r4);
        r5 = r6.equals(r5);
        if (r5 == 0) goto L_0x01b3;
    L_0x01ad:
        r1 = r1.n;
        r1.notifyDataSetChanged();
        return;
    L_0x01b3:
        if (r2 == 0) goto L_0x01ef;
    L_0x01b5:
        r6 = r1.m;
        r8 = r1.n;
        r9 = new java.util.HashMap;
        r9.<init>();
        r10 = r6.getFirstVisiblePosition();
        r11 = 0;
    L_0x01c3:
        r12 = r6.getChildCount();
        if (r11 >= r12) goto L_0x01f0;
    L_0x01c9:
        r12 = r10 + r11;
        r12 = r8.getItem(r12);
        r13 = r6.getChildAt(r11);
        r14 = new android.graphics.Rect;
        r15 = r13.getLeft();
        r5 = r13.getTop();
        r3 = r13.getRight();
        r13 = r13.getBottom();
        r14.<init>(r15, r5, r3, r13);
        r9.put(r12, r14);
        r11 = r11 + 1;
        r3 = 1;
        goto L_0x01c3;
    L_0x01ef:
        r9 = 0;
    L_0x01f0:
        if (r2 != 0) goto L_0x01f4;
    L_0x01f2:
        r8 = 0;
        goto L_0x023a;
    L_0x01f4:
        r3 = r1.e;
        r5 = r1.m;
        r6 = r1.n;
        r8 = new java.util.HashMap;
        r8.<init>();
        r10 = r5.getFirstVisiblePosition();
        r11 = 0;
    L_0x0204:
        r12 = r5.getChildCount();
        if (r11 >= r12) goto L_0x023a;
    L_0x020a:
        r12 = r10 + r11;
        r12 = r6.getItem(r12);
        r13 = r5.getChildAt(r11);
        r14 = r13.getWidth();
        r15 = r13.getHeight();
        r7 = android.graphics.Bitmap.Config.ARGB_8888;
        r7 = android.graphics.Bitmap.createBitmap(r14, r15, r7);
        r14 = new android.graphics.Canvas;
        r14.<init>(r7);
        r13.draw(r14);
        r13 = new android.graphics.drawable.BitmapDrawable;
        r14 = r3.getResources();
        r13.<init>(r14, r7);
        r8.put(r12, r13);
        r11 = r11 + 1;
        r7 = 0;
        goto L_0x0204;
    L_0x023a:
        r3 = r1.o;
        r5 = new java.util.HashSet;
        r5.<init>(r4);
        r5.removeAll(r3);
        r1.p = r5;
        r3 = r1.o;
        r3 = defpackage.bag.a(r3, r4);
        r1.q = r3;
        r3 = r1.o;
        r4 = r1.p;
        r5 = 0;
        r3.addAll(r5, r4);
        r3 = r1.o;
        r4 = r1.q;
        r3.removeAll(r4);
        r3 = r1.n;
        r3.notifyDataSetChanged();
        if (r2 == 0) goto L_0x0295;
    L_0x0264:
        r2 = r1.M;
        if (r2 == 0) goto L_0x0295;
    L_0x0268:
        r2 = r1.p;
        r2 = r2.size();
        r3 = r1.q;
        r3 = r3.size();
        r2 = r2 + r3;
        if (r2 > 0) goto L_0x0278;
    L_0x0277:
        goto L_0x0295;
    L_0x0278:
        r2 = r1.m;
        r3 = 0;
        r2.setEnabled(r3);
        r2 = r1.m;
        r2.requestLayout();
        r2 = 1;
        r1.N = r2;
        r2 = r1.m;
        r2 = r2.getViewTreeObserver();
        r3 = new azu;
        r3.<init>(r1, r9, r8);
        r2.addOnGlobalLayoutListener(r3);
        return;
    L_0x0295:
        r2 = 0;
        r1.p = r2;
        r1.q = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azs.onGlobalLayout():void");
    }
}
