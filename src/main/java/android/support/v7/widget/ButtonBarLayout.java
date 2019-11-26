package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.afy;

public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.aE);
        this.a = obtainStyledAttributes.getBoolean(afy.aF, true);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:21:0x004d, code skipped:
            if (r1 != null) goto L_0x004f;
     */
    public final void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = android.view.View.MeasureSpec.getSize(r6);
        r1 = r5.a;
        r2 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x0009:
        r1 = r5.b;
        if (r0 <= r1) goto L_0x0016;
    L_0x000d:
        r1 = r5.a();
        if (r1 == 0) goto L_0x0016;
    L_0x0013:
        r5.a(r2);
    L_0x0016:
        r5.b = r0;
    L_0x0018:
        r1 = r5.a();
        r3 = 1;
        if (r1 != 0) goto L_0x002f;
    L_0x001f:
        r1 = android.view.View.MeasureSpec.getMode(r6);
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 != r4) goto L_0x002f;
    L_0x0027:
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r1 = 1;
        goto L_0x0031;
    L_0x002f:
        r0 = r6;
        r1 = 0;
    L_0x0031:
        super.onMeasure(r0, r7);
        r0 = r5.a;
        if (r0 == 0) goto L_0x004d;
    L_0x0038:
        r0 = r5.a();
        if (r0 != 0) goto L_0x004d;
    L_0x003e:
        r0 = r5.getMeasuredWidthAndState();
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r4;
        r4 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        if (r0 != r4) goto L_0x004d;
    L_0x0049:
        r5.a(r3);
        goto L_0x004f;
    L_0x004d:
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        super.onMeasure(r6, r7);
    L_0x0052:
        r6 = r5.a(r2);
        if (r6 < 0) goto L_0x009d;
    L_0x0058:
        r7 = r5.getChildAt(r6);
        r0 = r7.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r1 = r5.getPaddingTop();
        r7 = r7.getMeasuredHeight();
        r1 = r1 + r7;
        r7 = r0.topMargin;
        r1 = r1 + r7;
        r7 = r0.bottomMargin;
        r2 = r1 + r7;
        r7 = r5.a();
        if (r7 == 0) goto L_0x0098;
    L_0x0078:
        r6 = r6 + r3;
        r6 = r5.a(r6);
        if (r6 < 0) goto L_0x009d;
    L_0x007f:
        r6 = r5.getChildAt(r6);
        r6 = r6.getPaddingTop();
        r7 = r5.getResources();
        r7 = r7.getDisplayMetrics();
        r7 = r7.density;
        r0 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r7 = r7 * r0;
        r7 = (int) r7;
        r6 = r6 + r7;
        goto L_0x009c;
    L_0x0098:
        r6 = r5.getPaddingBottom();
    L_0x009c:
        r2 = r2 + r6;
    L_0x009d:
        r6 = defpackage.abe.o(r5);
        if (r6 == r2) goto L_0x00a6;
    L_0x00a3:
        r5.setMinimumHeight(r2);
    L_0x00a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    private final void a(boolean z) {
        setOrientation(z);
        setGravity(!z ? 80 : 5);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(!z ? 4 : 8);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private final boolean a() {
        return getOrientation() == 1;
    }
}
