package com.google.android.apps.youtube.app.common.ui.chipcloud;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import defpackage.abe;
import java.util.List;

public class ChipCloudView extends ViewGroup {
    public int a;
    private List b;
    private int c;
    private int d;
    private int e;
    private int f;

    public ChipCloudView(Context context) {
        super(context);
        a(context, null);
    }

    public ChipCloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ChipCloudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public ChipCloudView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
    private final void a(android.content.Context r4, android.util.AttributeSet r5) {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3.b = r0;
        r0 = 3;
        r3.c = r0;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3.a = r0;
        r0 = defpackage.fep.a;	 Catch:{ all -> 0x004c }
        r1 = 0;
        r5 = r4.obtainStyledAttributes(r5, r0, r1, r1);	 Catch:{ all -> 0x004c }
        r0 = r5.getInteger(r1, r1);	 Catch:{ all -> 0x004a }
        r3.f = r0;	 Catch:{ all -> 0x004a }
        r0 = r4.getResources();	 Catch:{ all -> 0x004a }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x004a }
        r1 = 2;
        r2 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r1 = r5.getDimension(r1, r2);	 Catch:{ all -> 0x004a }
        r1 = (int) r1;	 Catch:{ all -> 0x004a }
        r0 = defpackage.xss.a(r0, r1);	 Catch:{ all -> 0x004a }
        r3.d = r0;	 Catch:{ all -> 0x004a }
        r4 = r4.getResources();	 Catch:{ all -> 0x004a }
        r4 = r4.getDisplayMetrics();	 Catch:{ all -> 0x004a }
        r0 = 1;
        r0 = r5.getDimension(r0, r2);	 Catch:{ all -> 0x004a }
        r0 = (int) r0;	 Catch:{ all -> 0x004a }
        r4 = defpackage.xss.a(r4, r0);	 Catch:{ all -> 0x004a }
        r3.e = r4;	 Catch:{ all -> 0x004a }
        r5.recycle();
        return;
    L_0x004a:
        r4 = move-exception;
        goto L_0x004e;
    L_0x004c:
        r4 = move-exception;
        r5 = 0;
    L_0x004e:
        if (r5 == 0) goto L_0x0053;
    L_0x0050:
        r5.recycle();
    L_0x0053:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView.a(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(int i) {
        if (i != this.c) {
            this.c = i;
            requestLayout();
        }
    }

    public final void a(int i, int i2) {
        if (this.d != i && this.e != i2) {
            this.d = i;
            this.e = i2;
            requestLayout();
        }
    }

    private static void a(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int paddingStart;
        int i3;
        int size = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) == 0) {
            size = Integer.MAX_VALUE;
        }
        int min = Math.min(getChildCount(), this.a);
        int i4 = 0;
        int i5;
        if (this.c > 0) {
            size -= getPaddingEnd();
            paddingStart = getPaddingStart();
            int i6 = paddingStart;
            int paddingTop = getPaddingTop();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Object obj = null;
            int i10 = 0;
            int i11 = 0;
            while (i7 < min) {
                int i12;
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i4, i4), MeasureSpec.makeMeasureSpec(i4, i4));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i13 = obj != null ? this.e : 0;
                    int i14 = i9 > 0 ? this.d : 0;
                    Object obj2 = 1;
                    if ((i6 + measuredWidth) + i13 > size) {
                        if (i9 >= this.c - 1) {
                            min = i7;
                            break;
                        }
                        paddingTop += i8 + i14;
                        i6 = (paddingStart + measuredWidth) + i13;
                        i14 = paddingTop + this.d;
                        i9++;
                        if (i10 != i7 - 1) {
                            obj2 = null;
                        }
                        if (a()) {
                            a(i10, i7, size);
                        }
                        i4 = paddingStart;
                        i10 = i7;
                        i8 = 0;
                    } else {
                        i4 = i6 + i13;
                        i14 += paddingTop;
                        i6 += i13 + measuredWidth;
                    }
                    i13 = Math.max(i11, i6);
                    i8 = Math.max(i8, measuredHeight);
                    measuredWidth += i4;
                    measuredHeight += i14;
                    if (this.b.size() <= i7) {
                        i11 = this.b.size();
                        while (i11 <= i7) {
                            i5 = min;
                            i12 = paddingStart;
                            this.b.add(new Rect());
                            i11++;
                            min = i5;
                            paddingStart = i12;
                        }
                    }
                    i5 = min;
                    i12 = paddingStart;
                    ((Rect) this.b.get(i7)).set(i4, i14, measuredWidth, measuredHeight);
                    i11 = i13;
                    obj = obj2;
                } else {
                    i5 = min;
                    i12 = paddingStart;
                }
                i7++;
                min = i5;
                paddingStart = i12;
                i4 = 0;
            }
            i5 = min;
            if (a()) {
                a(i10, min, size);
            }
            size = i11 + (i9 <= 0 ? getPaddingEnd() : 0);
            i3 = (paddingTop + i8) + (i9 > 0 ? this.d : 0);
        } else {
            i5 = min;
            i3 = 0;
        }
        if (min > 0) {
            i3 += getPaddingBottom();
        }
        paddingStart = i3;
        i4 = this.b.size();
        while (true) {
            i4--;
            if (i4 >= min) {
                this.b.remove(i4);
            } else {
                setMeasuredDimension(resolveSize(size, i), resolveSize(paddingStart, i2));
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i2 = this.b.size();
        i3 -= i;
        for (i4 = 0; i4 < i2; i4++) {
            int i5;
            int i6;
            View childAt = getChildAt(i4);
            a(childAt, 0);
            Rect rect = (Rect) this.b.get(i4);
            if (abe.g(this) != 1) {
                i5 = rect.left;
                i6 = rect.right;
            } else {
                i5 = i3 - rect.right;
                i6 = i3 - rect.left;
            }
            childAt.layout(i5, rect.top, i6, rect.bottom);
        }
        while (i2 < childCount) {
            a(getChildAt(i2), 8);
            i2++;
        }
    }

    private final void a(int i, int i2, int i3) {
        if (i < i2) {
            i3 -= ((Rect) this.b.get(i2 - 1)).right;
            while (i < i2) {
                Rect rect = (Rect) this.b.get(i);
                rect.set(rect.left + i3, rect.top, rect.right + i3, rect.bottom);
                i++;
            }
        }
    }

    private final boolean a() {
        return this.f == 8388613;
    }
}
