package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aiuf */
public class aiuf extends ViewGroup implements aiug {
    private xol a;
    private final bdfu b;
    public final Rect g;
    public aiuj h;
    public View i;

    public aiuf(Context context) {
        this(context, null);
    }

    public aiuf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new bdfu();
        setFocusable(true);
        setDescendantFocusability(262144);
        this.g = new Rect();
    }

    public final void b(View view) {
        amqw.b(this.i == null, (Object) "videoView has already been set");
        this.i = view;
        addView(view, 0, new aiuh(-2, -2, false));
    }

    public void a(aiub... aiubArr) {
        int i = 0;
        while (i < aiubArr.length) {
            aiub aiub = aiubArr[i];
            View a = aiub.a();
            if (a != null) {
                a(aiub, a);
                i++;
            } else {
                String valueOf = String.valueOf(aiub);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
                stringBuilder.append("Overlay ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" does not provide a View and LayoutParams");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public void a(aiub aiub, View view) {
        addView(view, aiub.b());
    }

    public final void a(aiuj aiuj) {
        this.h = aiuj;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        aiuj aiuj = this.h;
        if (aiuj != null) {
            aiuj.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        xol xol = this.a;
        if (xol != null) {
            arrayList.add(xol.a().a(new aiue(this)));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        this.b.a();
        List a = a();
        if (!a.isEmpty()) {
            this.b.a((bcuo[]) a.toArray(new bcuo[a.size()]));
        }
        super.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.b.a();
        super.onDetachedFromWindow();
    }

    public final void a(xol xol) {
        this.a = (xol) amqw.a((Object) xol);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean fitSystemWindows(Rect rect) {
        xol xol = this.a;
        if (xol != null) {
            xol.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == aocf.UNSET_ENUM_VALUE && mode2 == 0)) {
                size2 = (int) (((float) size) / 1.777f);
            } else {
                float f;
                if (mode2 == 1073741824 || (mode2 == aocf.UNSET_ENUM_VALUE && mode == 0)) {
                    f = (float) size2;
                } else if (mode == aocf.UNSET_ENUM_VALUE && mode2 == aocf.UNSET_ENUM_VALUE) {
                    f = (float) size2;
                    float f2 = ((float) size) / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        i = aiuf.resolveSize(size, i);
        i2 = aiuf.resolveSize(size2, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            a(getChildAt(i3), this.g, i, i2);
        }
        setMeasuredDimension(i, i2);
    }

    public void a(View view, Rect rect, int i, int i2) {
        int i3 = rect.left + rect.right;
        int i4 = rect.top + rect.bottom;
        i = MeasureSpec.makeMeasureSpec(i, 1073741824);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        LayoutParams layoutParams = view.getLayoutParams();
        boolean a = aiuf.a(layoutParams);
        if (!a) {
            i3 = 0;
        }
        i = aiuf.getChildMeasureSpec(i, i3, layoutParams.width);
        if (!a) {
            i4 = 0;
        }
        view.measure(i, aiuf.getChildMeasureSpec(makeMeasureSpec, i4, layoutParams.height));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (z || childAt.getVisibility() != 8) {
                a(childAt, this.g, i, i2, i3, i4);
            }
        }
    }

    public void a(View view, Rect rect, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        i = (i3 - rect.left) - rect.right;
        i2 = (i4 - rect.top) - rect.bottom;
        boolean a = aiuf.a(view.getLayoutParams());
        if (!a) {
            i = i3;
        }
        if (!a) {
            i2 = i4;
        }
        i3 = Math.min(view.getMeasuredWidth(), i);
        i4 = Math.min(view.getMeasuredHeight(), i2);
        int i5 = 0;
        int i6 = a ? rect.left : 0;
        if (a) {
            i5 = rect.top;
        }
        i6 += (i - i3) / 2;
        i5 += (i2 - i4) / 2;
        view.layout(i6, i5, i3 + i6, i4 + i5);
    }

    private static boolean a(LayoutParams layoutParams) {
        return layoutParams instanceof aiuh ? ((aiuh) layoutParams).a : true;
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new aiuh(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new aiuh(-2, -2, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof aiuh;
    }

    public final void a(boolean z) {
        xol xol = this.a;
        if (xol != null) {
            xol.b(z);
        }
    }
}
