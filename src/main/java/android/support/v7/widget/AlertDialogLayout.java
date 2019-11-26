package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.anp;
import defpackage.anq;

public class AlertDialogLayout extends anq {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3;
        int combineMeasuredStates;
        int a;
        int measuredHeight;
        int i4;
        int i5 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = view;
        View view3 = view2;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        i3 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i5, 0);
            paddingTop += view.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            combineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i5, 0);
            a = a(view2);
            measuredHeight = view2.getMeasuredHeight() - a;
            paddingTop += a;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        } else {
            a = 0;
            measuredHeight = 0;
        }
        if (view3 == null) {
            i4 = 0;
        } else {
            view3.measure(i5, i3 != 0 ? MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), i3) : 0);
            i4 = view3.getMeasuredHeight();
            paddingTop += i4;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        }
        size -= paddingTop;
        if (view2 != null) {
            paddingTop -= a;
            measuredHeight = Math.min(size, measuredHeight);
            if (measuredHeight > 0) {
                size -= measuredHeight;
                a += measuredHeight;
            }
            view2.measure(i5, MeasureSpec.makeMeasureSpec(a, 1073741824));
            paddingTop += view2.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && size > 0) {
            view3.measure(i5, MeasureSpec.makeMeasureSpec(size + i4, i3));
            paddingTop = (paddingTop - i4) + view3.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        }
        int i6 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            view3 = getChildAt(i3);
            if (view3.getVisibility() != 8) {
                i6 = Math.max(i6, view3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i6 + (getPaddingLeft() + getPaddingRight()), i5, combineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode != 1073741824) {
            mode = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (paddingTop = 0; paddingTop < childCount; paddingTop++) {
                View childAt2 = getChildAt(paddingTop);
                if (childAt2.getVisibility() != 8) {
                    anp anp = (anp) childAt2.getLayoutParams();
                    if (anp.width == -1) {
                        measuredHeight = anp.height;
                        anp.height = childAt2.getMeasuredHeight();
                        measureChildWithMargins(childAt2, mode, 0, i2, 0);
                        anp.height = measuredHeight;
                    }
                }
            }
        }
    }

    private static int a(View view) {
        int o = abe.o(view);
        if (o > 0) {
            return o;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
        r9 = this;
        r10 = r9.getPaddingLeft();
        r13 = r13 - r11;
        r11 = r9.getPaddingRight();
        r11 = r13 - r11;
        r13 = r13 - r10;
        r0 = r9.getPaddingRight();
        r13 = r13 - r0;
        r0 = r9.getMeasuredHeight();
        r1 = r9.getChildCount();
        r2 = r9.getGravity();
        r3 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r3 = r3 & r2;
        r2 = r2 & 112;
        r4 = 16;
        if (r2 == r4) goto L_0x0039;
    L_0x0027:
        r4 = 80;
        if (r2 == r4) goto L_0x0030;
    L_0x002b:
        r12 = r9.getPaddingTop();
        goto L_0x0043;
    L_0x0030:
        r2 = r9.getPaddingTop();
        r2 = r2 + r14;
        r2 = r2 - r12;
        r12 = r2 - r0;
        goto L_0x0043;
    L_0x0039:
        r2 = r9.getPaddingTop();
        r14 = r14 - r12;
        r14 = r14 - r0;
        r14 = r14 / 2;
        r12 = r2 + r14;
    L_0x0043:
        r14 = r9.getDividerDrawable();
        r0 = 0;
        if (r14 == 0) goto L_0x004f;
    L_0x004a:
        r14 = r14.getIntrinsicHeight();
        goto L_0x0050;
    L_0x004f:
        r14 = 0;
    L_0x0050:
        if (r0 >= r1) goto L_0x00af;
    L_0x0052:
        r2 = r9.getChildAt(r0);
        if (r2 == 0) goto L_0x00ac;
    L_0x0058:
        r4 = r2.getVisibility();
        r5 = 8;
        if (r4 == r5) goto L_0x00ac;
    L_0x0060:
        r4 = r2.getMeasuredWidth();
        r5 = r2.getMeasuredHeight();
        r6 = r2.getLayoutParams();
        r6 = (defpackage.anp) r6;
        r7 = r6.h;
        if (r7 < 0) goto L_0x0073;
    L_0x0072:
        goto L_0x0074;
    L_0x0073:
        r7 = r3;
    L_0x0074:
        r8 = defpackage.abe.g(r9);
        r7 = android.view.Gravity.getAbsoluteGravity(r7, r8);
        r7 = r7 & 7;
        r8 = 1;
        if (r7 == r8) goto L_0x008d;
    L_0x0081:
        r8 = 5;
        if (r7 == r8) goto L_0x0088;
    L_0x0084:
        r7 = r6.leftMargin;
        r7 = r7 + r10;
        goto L_0x0098;
    L_0x0088:
        r7 = r11 - r4;
        r8 = r6.rightMargin;
        goto L_0x0097;
    L_0x008d:
        r7 = r13 - r4;
        r7 = r7 / 2;
        r7 = r7 + r10;
        r8 = r6.leftMargin;
        r7 = r7 + r8;
        r8 = r6.rightMargin;
    L_0x0097:
        r7 = r7 - r8;
    L_0x0098:
        r8 = r9.hasDividerBeforeChildAt(r0);
        if (r8 == 0) goto L_0x009f;
    L_0x009e:
        r12 = r12 + r14;
    L_0x009f:
        r8 = r6.topMargin;
        r12 = r12 + r8;
        r4 = r4 + r7;
        r8 = r12 + r5;
        r2.layout(r7, r12, r4, r8);
        r2 = r6.bottomMargin;
        r5 = r5 + r2;
        r12 = r12 + r5;
    L_0x00ac:
        r0 = r0 + 1;
        goto L_0x0050;
    L_0x00af:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }
}
