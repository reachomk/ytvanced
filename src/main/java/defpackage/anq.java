package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: anq */
public class anq extends ViewGroup {
    public static final String ACCESSIBILITY_CLASS_NAME = "android.support.v7.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    public static final int INDEX_BOTTOM = 2;
    public static final int INDEX_CENTER_VERTICAL = 0;
    public static final int INDEX_FILL = 3;
    public static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GRAVITY_COUNT = 4;
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public anq(Context context) {
        this(context, null);
    }

    /* Access modifiers changed, original: 0000 */
    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNextLocationOffset(View view) {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int measureNullChild(int i) {
        return 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public anq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public anq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        arz a = arz.a(context, attributeSet, afy.aH, i, 0);
        int a2 = a.a(afy.aO, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        a2 = a.a(afy.aN, -1);
        if (a2 >= 0) {
            setGravity(a2);
        }
        if (!a.a(afy.aL, true)) {
            setBaselineAligned(false);
        }
        this.mWeightSum = a.b.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = a.a(afy.aM, -1);
        this.mUseLargestChild = a.a(afy.aR, false);
        setDividerDrawable(a.a(afy.aP));
        this.mShowDividers = a.a(afy.aS, 0);
        this.mDividerPadding = a.d(afy.aQ, 0);
        a.a();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
                return;
            }
            drawDividersHorizontal(canvas);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((anp) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                virtualChildCount = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                virtualChildCount = virtualChildAt2.getBottom() + ((anp) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawDividersHorizontal(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean a = asy.a(this);
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                int right;
                anp anp = (anp) virtualChildAt.getLayoutParams();
                if (a) {
                    right = virtualChildAt.getRight() + anp.rightMargin;
                } else {
                    right = (virtualChildAt.getLeft() - anp.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, right);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int i2;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                anp anp2 = (anp) virtualChildAt2.getLayoutParams();
                if (a) {
                    virtualChildCount = virtualChildAt2.getLeft() - anp2.leftMargin;
                    i2 = this.mDividerWidth;
                } else {
                    virtualChildCount = virtualChildAt2.getRight() + anp2.rightMargin;
                    drawVerticalDivider(canvas, virtualChildCount);
                }
            } else if (a) {
                virtualChildCount = getPaddingLeft();
                drawVerticalDivider(canvas, virtualChildCount);
            } else {
                virtualChildCount = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
            }
            virtualChildCount -= i2;
            drawVerticalDivider(canvas, virtualChildCount);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.mBaselineAlignedChildIndex;
        if (childCount > i) {
            View childAt = getChildAt(i);
            i = childAt.getBaseline();
            if (i != -1) {
                int i2 = this.mBaselineChildTop;
                if (this.mOrientation == 1) {
                    int i3 = this.mGravity & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                        }
                    }
                }
                return (i2 + ((anp) childAt.getLayoutParams()).topMargin) + i;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("base aligned child index out of range (0, ");
            stringBuilder.append(getChildCount());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    /* Access modifiers changed, original: 0000 */
    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.mShowDividers & 4) != 0;
            } else {
                if ((this.mShowDividers & 2) != 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            if (getChildAt(i).getVisibility() != 8) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return z;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void measureVertical(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int i5 = this.mBaselineAlignedChildIndex;
        boolean z = this.mUseLargestChild;
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Object obj = 1;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int i12 = 8;
            int i13 = i9;
            int i14;
            int i15;
            View view;
            int i16;
            Object obj4;
            if (i11 < virtualChildCount) {
                View virtualChildAt = getVirtualChildAt(i11);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i11);
                    i14 = virtualChildCount;
                    i9 = i13;
                } else {
                    int i17 = i6;
                    if (virtualChildAt.getVisibility() == 8) {
                        i11 += getChildrenSkipCount(virtualChildAt, i11);
                        i14 = virtualChildCount;
                        i9 = i13;
                        i6 = i17;
                    } else {
                        int i18;
                        int i19;
                        if (hasDividerBeforeChildAt(i11)) {
                            this.mTotalLength += this.mDividerHeight;
                        }
                        anp anp = (anp) virtualChildAt.getLayoutParams();
                        float f2 = f + anp.g;
                        int i20;
                        if (mode2 == 1073741824 && anp.height == 0 && anp.g > 0.0f) {
                            i15 = this.mTotalLength;
                            i20 = i7;
                            this.mTotalLength = Math.max(i15, (anp.topMargin + i15) + anp.bottomMargin);
                            i4 = i8;
                            view = virtualChildAt;
                            i18 = i10;
                            i14 = virtualChildCount;
                            i6 = i17;
                            i19 = i20;
                            obj3 = 1;
                            virtualChildCount = i11;
                            i16 = i13;
                            i13 = mode2;
                            mode2 = i16;
                        } else {
                            i20 = i7;
                            if (anp.height != 0 || anp.g <= 0.0f) {
                                i7 = aocf.UNSET_ENUM_VALUE;
                            } else {
                                anp.height = -2;
                                i7 = 0;
                            }
                            i3 = i17;
                            int i21 = i7;
                            i19 = i20;
                            i4 = i8;
                            View view2 = virtualChildAt;
                            i14 = virtualChildCount;
                            i16 = i13;
                            i13 = mode2;
                            mode2 = i16;
                            i18 = i10;
                            virtualChildCount = i11;
                            measureChildBeforeLayout(virtualChildAt, i11, i, 0, i2, f2 == 0.0f ? this.mTotalLength : 0);
                            i15 = i21;
                            if (i15 != aocf.UNSET_ENUM_VALUE) {
                                anp.height = i15;
                            }
                            i15 = view2.getMeasuredHeight();
                            i6 = this.mTotalLength;
                            view = view2;
                            this.mTotalLength = Math.max(i6, (((i6 + i15) + anp.topMargin) + anp.bottomMargin) + getNextLocationOffset(view));
                            if (z) {
                                i6 = Math.max(i15, i3);
                            } else {
                                i6 = i3;
                            }
                        }
                        if (i5 >= 0 && i5 == virtualChildCount + 1) {
                            this.mBaselineChildTop = this.mTotalLength;
                        }
                        if (virtualChildCount >= i5 || anp.g <= 0.0f) {
                            Object obj5;
                            if (mode != 1073741824 && anp.width == -1) {
                                obj5 = 1;
                                obj2 = 1;
                            } else {
                                obj5 = null;
                            }
                            i7 = anp.leftMargin + anp.rightMargin;
                            i9 = view.getMeasuredWidth() + i7;
                            i10 = Math.max(i18, i9);
                            i11 = View.combineMeasuredStates(mode2, view.getMeasuredState());
                            obj4 = (obj == null || anp.width != -1) ? null : 1;
                            if (anp.g > 0.0f) {
                                if (obj5 == null) {
                                    i7 = i9;
                                }
                                i7 = Math.max(i19, i7);
                                i15 = i4;
                            } else {
                                i12 = i19;
                                if (obj5 == null) {
                                    i7 = i9;
                                }
                                i15 = Math.max(i4, i7);
                                i7 = i12;
                            }
                            i9 = i11;
                            obj = obj4;
                            i11 = getChildrenSkipCount(view, virtualChildCount) + virtualChildCount;
                            i8 = i15;
                            f = f2;
                            i11++;
                            i3 = i;
                            i4 = i2;
                            mode2 = i13;
                            virtualChildCount = i14;
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                }
                i13 = mode2;
                i11++;
                i3 = i;
                i4 = i2;
                mode2 = i13;
                virtualChildCount = i14;
            } else {
                i3 = i6;
                i4 = i8;
                i14 = virtualChildCount;
                i16 = i13;
                i13 = mode2;
                mode2 = i16;
                if (this.mTotalLength > 0) {
                    i6 = i14;
                    if (hasDividerBeforeChildAt(i6)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i6 = i14;
                }
                if (z) {
                    i8 = i13;
                    if (i8 == Integer.MIN_VALUE || i8 == 0) {
                        this.mTotalLength = 0;
                        i9 = 0;
                        while (i9 < i6) {
                            View virtualChildAt2 = getVirtualChildAt(i9);
                            if (virtualChildAt2 == null) {
                                this.mTotalLength += measureNullChild(i9);
                            } else if (virtualChildAt2.getVisibility() == i12) {
                                i9 += getChildrenSkipCount(virtualChildAt2, i9);
                            } else {
                                anp anp2 = (anp) virtualChildAt2.getLayoutParams();
                                i5 = this.mTotalLength;
                                this.mTotalLength = Math.max(i5, (((i5 + i3) + anp2.topMargin) + anp2.bottomMargin) + getNextLocationOffset(virtualChildAt2));
                            }
                            i9++;
                            i12 = 8;
                        }
                    }
                } else {
                    i8 = i13;
                }
                i9 = this.mTotalLength + (getPaddingTop() + getPaddingBottom());
                this.mTotalLength = i9;
                i11 = i2;
                i9 = View.resolveSizeAndState(Math.max(i9, getSuggestedMinimumHeight()), i11, 0);
                i12 = (16777215 & i9) - this.mTotalLength;
                if (obj3 == null && (i12 == 0 || f <= 0.0f)) {
                    i15 = Math.max(i4, i7);
                    if (z && r3 != 1073741824) {
                        for (i7 = 0; i7 < i6; i7++) {
                            view = getVirtualChildAt(i7);
                            if (!(view == null || view.getVisibility() == 8 || ((anp) view.getLayoutParams()).g <= 0.0f)) {
                                view.measure(MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
                            }
                        }
                    }
                    i12 = i;
                } else {
                    float f3 = this.mWeightSum;
                    if (f3 > 0.0f) {
                        f = f3;
                    }
                    this.mTotalLength = 0;
                    float f4 = f;
                    i15 = 0;
                    while (i15 < i6) {
                        View virtualChildAt3 = getVirtualChildAt(i15);
                        if (virtualChildAt3.getVisibility() != 8) {
                            int i22;
                            float f5;
                            int i23;
                            anp anp3 = (anp) virtualChildAt3.getLayoutParams();
                            f3 = anp3.g;
                            if (f3 > 0.0f) {
                                i22 = (int) ((((float) i12) * f3) / f4);
                                f5 = f4 - f3;
                                i23 = i12 - i22;
                                i7 = anq.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + anp3.leftMargin) + anp3.rightMargin, anp3.width);
                                if (anp3.height != 0) {
                                    i3 = 1073741824;
                                } else {
                                    i3 = 1073741824;
                                    if (i8 == 1073741824) {
                                        if (i22 <= 0) {
                                            i22 = 0;
                                        }
                                        virtualChildAt3.measure(i7, MeasureSpec.makeMeasureSpec(i22, 1073741824));
                                        mode2 = View.combineMeasuredStates(mode2, virtualChildAt3.getMeasuredState() & -256);
                                        i7 = i23;
                                    }
                                }
                                i22 = virtualChildAt3.getMeasuredHeight() + i22;
                                if (i22 < 0) {
                                    i22 = 0;
                                }
                                virtualChildAt3.measure(i7, MeasureSpec.makeMeasureSpec(i22, i3));
                                mode2 = View.combineMeasuredStates(mode2, virtualChildAt3.getMeasuredState() & -256);
                                i7 = i23;
                            } else {
                                i7 = i12;
                                i12 = i;
                                f5 = f4;
                            }
                            i3 = anp3.leftMargin + anp3.rightMargin;
                            i22 = virtualChildAt3.getMeasuredWidth() + i3;
                            i10 = Math.max(i10, i22);
                            i23 = i7;
                            if (mode != 1073741824) {
                                i14 = i8;
                                i8 = -1;
                                if (anp3.width == -1) {
                                    i22 = i3;
                                }
                            } else {
                                i14 = i8;
                                i8 = -1;
                            }
                            i7 = Math.max(i4, i22);
                            obj4 = (obj == null || anp3.width != i8) ? null : 1;
                            i4 = this.mTotalLength;
                            this.mTotalLength = Math.max(i4, (((virtualChildAt3.getMeasuredHeight() + i4) + anp3.topMargin) + anp3.bottomMargin) + getNextLocationOffset(virtualChildAt3));
                            i4 = i7;
                            obj = obj4;
                            f4 = f5;
                            i7 = i23;
                        } else {
                            i14 = i8;
                            i7 = i12;
                            i12 = i;
                        }
                        i15++;
                        i12 = i7;
                        i8 = i14;
                    }
                    i12 = i;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i15 = i4;
                }
                if (obj != null || mode == 1073741824) {
                    i15 = i10;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i15 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i12, mode2), i9);
                if (obj2 != null) {
                    forceUniformWidth(i6, i11);
                    return;
                }
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                anp anp = (anp) virtualChildAt.getLayoutParams();
                if (anp.width == -1) {
                    int i4 = anp.height;
                    anp.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    anp.height = i4;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043a  */
    public void measureHorizontal(int r38, int r39) {
        /*
        r37 = this;
        r7 = r37;
        r8 = r38;
        r9 = r39;
        r10 = 0;
        r7.mTotalLength = r10;
        r11 = r37.getVirtualChildCount();
        r12 = android.view.View.MeasureSpec.getMode(r38);
        r13 = android.view.View.MeasureSpec.getMode(r39);
        r0 = r7.mMaxAscent;
        r14 = 4;
        if (r0 == 0) goto L_0x001e;
    L_0x001a:
        r0 = r7.mMaxDescent;
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = new int[r14];
        r7.mMaxAscent = r0;
        r0 = new int[r14];
        r7.mMaxDescent = r0;
    L_0x0026:
        r15 = r7.mMaxAscent;
        r6 = r7.mMaxDescent;
        r16 = 3;
        r5 = -1;
        r15[r16] = r5;
        r17 = 2;
        r15[r17] = r5;
        r18 = 1;
        r15[r18] = r5;
        r15[r10] = r5;
        r6[r16] = r5;
        r6[r17] = r5;
        r6[r18] = r5;
        r6[r10] = r5;
        r4 = r7.mBaselineAligned;
        r3 = r7.mUseLargestChild;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r2) goto L_0x004c;
    L_0x0049:
        r19 = 0;
        goto L_0x004e;
    L_0x004c:
        r19 = 1;
    L_0x004e:
        r20 = 0;
        r0 = 0;
        r1 = 0;
        r14 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 1;
        r25 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
    L_0x0061:
        r29 = r6;
        r5 = 8;
        if (r1 >= r11) goto L_0x01f4;
    L_0x0067:
        r6 = r7.getVirtualChildAt(r1);
        if (r6 != 0) goto L_0x007f;
    L_0x006d:
        r5 = r7.mTotalLength;
        r6 = r7.measureNullChild(r1);
        r5 = r5 + r6;
        r7.mTotalLength = r5;
    L_0x0076:
        r6 = r0;
        r31 = r3;
        r36 = r4;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x01e1;
    L_0x007f:
        r10 = r6.getVisibility();
        if (r10 != r5) goto L_0x008b;
    L_0x0085:
        r5 = r7.getChildrenSkipCount(r6, r1);
        r1 = r1 + r5;
        goto L_0x0076;
    L_0x008b:
        r5 = r7.hasDividerBeforeChildAt(r1);
        if (r5 == 0) goto L_0x0098;
    L_0x0091:
        r5 = r7.mTotalLength;
        r10 = r7.mDividerWidth;
        r5 = r5 + r10;
        r7.mTotalLength = r5;
    L_0x0098:
        r5 = r6.getLayoutParams();
        r10 = r5;
        r10 = (defpackage.anp) r10;
        r5 = r10.g;
        r25 = r25 + r5;
        if (r12 != r2) goto L_0x00e1;
    L_0x00a5:
        r5 = r10.width;
        if (r5 != 0) goto L_0x00e1;
    L_0x00a9:
        r5 = r10.g;
        r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x00e1;
    L_0x00af:
        r5 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r32 = r0;
        r0 = r10.rightMargin;
        r2 = r2 + r0;
        r5 = r5 + r2;
        r7.mTotalLength = r5;
        if (r4 == 0) goto L_0x00d2;
    L_0x00bd:
        r0 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0);
        r6.measure(r2, r2);
        r31 = r3;
        r36 = r4;
        r3 = r6;
        r35 = r32;
        r32 = r1;
    L_0x00ce:
        r1 = r28;
        goto L_0x015e;
    L_0x00d2:
        r31 = r3;
        r36 = r4;
        r3 = r6;
        r35 = r32;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r27 = 1;
        r32 = r1;
        goto L_0x0162;
    L_0x00e1:
        r32 = r0;
        r0 = r10.width;
        if (r0 != 0) goto L_0x00f2;
    L_0x00e7:
        r0 = r10.g;
        r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f2;
    L_0x00ed:
        r0 = -2;
        r10.width = r0;
        r5 = 0;
        goto L_0x00f4;
    L_0x00f2:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x00f4:
        r0 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1));
        if (r0 != 0) goto L_0x00fd;
    L_0x00f8:
        r0 = r7.mTotalLength;
        r33 = r0;
        goto L_0x00ff;
    L_0x00fd:
        r33 = 0;
    L_0x00ff:
        r34 = 0;
        r2 = r32;
        r0 = r37;
        r32 = r1;
        r1 = r6;
        r35 = r2;
        r2 = r32;
        r31 = r3;
        r3 = r38;
        r36 = r4;
        r4 = r33;
        r9 = r5;
        r8 = -1;
        r5 = r39;
        r30 = r6;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = r34;
        r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6);
        if (r9 == r8) goto L_0x0125;
    L_0x0123:
        r10.width = r9;
    L_0x0125:
        r0 = r30.getMeasuredWidth();
        if (r19 == 0) goto L_0x013e;
    L_0x012b:
        r1 = r7.mTotalLength;
        r2 = r10.leftMargin;
        r2 = r2 + r0;
        r3 = r10.rightMargin;
        r2 = r2 + r3;
        r3 = r30;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = r1 + r2;
        r7.mTotalLength = r1;
        goto L_0x0155;
    L_0x013e:
        r3 = r30;
        r1 = r7.mTotalLength;
        r2 = r1 + r0;
        r4 = r10.leftMargin;
        r2 = r2 + r4;
        r4 = r10.rightMargin;
        r2 = r2 + r4;
        r4 = r7.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r1 = java.lang.Math.max(r1, r2);
        r7.mTotalLength = r1;
    L_0x0155:
        if (r31 == 0) goto L_0x00ce;
    L_0x0157:
        r1 = r28;
        r28 = java.lang.Math.max(r0, r1);
        goto L_0x0160;
    L_0x015e:
        r28 = r1;
    L_0x0160:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0162:
        if (r13 != r0) goto L_0x0166;
    L_0x0164:
        r1 = 0;
        goto L_0x016f;
    L_0x0166:
        r1 = r10.height;
        r2 = -1;
        if (r1 == r2) goto L_0x016c;
    L_0x016b:
        goto L_0x0164;
    L_0x016c:
        r1 = 1;
        r26 = 1;
    L_0x016f:
        r2 = r10.topMargin;
        r4 = r10.bottomMargin;
        r2 = r2 + r4;
        r4 = r3.getMeasuredHeight();
        r4 = r4 + r2;
        r5 = r3.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r14, r5);
        if (r36 == 0) goto L_0x01a8;
    L_0x0183:
        r6 = r3.getBaseline();
        r8 = -1;
        if (r6 == r8) goto L_0x01a8;
    L_0x018a:
        r8 = r10.h;
        if (r8 >= 0) goto L_0x0190;
    L_0x018e:
        r8 = r7.mGravity;
    L_0x0190:
        r8 = r8 & 112;
        r9 = 4;
        r8 = r8 >> r9;
        r8 = r8 >> 1;
        r9 = r15[r8];
        r9 = java.lang.Math.max(r9, r6);
        r15[r8] = r9;
        r9 = r29[r8];
        r6 = r4 - r6;
        r6 = java.lang.Math.max(r9, r6);
        r29[r8] = r6;
    L_0x01a8:
        r6 = r35;
        r6 = java.lang.Math.max(r6, r4);
        if (r24 == 0) goto L_0x01b8;
    L_0x01b0:
        r8 = r10.height;
        r9 = -1;
        if (r8 == r9) goto L_0x01b6;
    L_0x01b5:
        goto L_0x01b8;
    L_0x01b6:
        r8 = 1;
        goto L_0x01b9;
    L_0x01b8:
        r8 = 0;
    L_0x01b9:
        r9 = r10.g;
        r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1));
        if (r9 <= 0) goto L_0x01c9;
    L_0x01bf:
        if (r1 != 0) goto L_0x01c2;
    L_0x01c1:
        r2 = r4;
    L_0x01c2:
        r10 = r23;
        r23 = java.lang.Math.max(r10, r2);
        goto L_0x01d7;
    L_0x01c9:
        r10 = r23;
        if (r1 != 0) goto L_0x01ce;
    L_0x01cd:
        goto L_0x01cf;
    L_0x01ce:
        r4 = r2;
    L_0x01cf:
        r2 = r22;
        r22 = java.lang.Math.max(r2, r4);
        r23 = r10;
    L_0x01d7:
        r10 = r32;
        r1 = r7.getChildrenSkipCount(r3, r10);
        r1 = r1 + r10;
        r14 = r5;
        r24 = r8;
    L_0x01e1:
        r1 = r1 + 1;
        r8 = r38;
        r9 = r39;
        r0 = r6;
        r6 = r29;
        r3 = r31;
        r4 = r36;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -1;
        r10 = 0;
        goto L_0x0061;
    L_0x01f4:
        r6 = r0;
        r31 = r3;
        r36 = r4;
        r2 = r22;
        r10 = r23;
        r1 = r28;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = r7.mTotalLength;
        if (r3 <= 0) goto L_0x0214;
    L_0x0207:
        r3 = r7.hasDividerBeforeChildAt(r11);
        if (r3 == 0) goto L_0x0214;
    L_0x020d:
        r3 = r7.mTotalLength;
        r4 = r7.mDividerWidth;
        r3 = r3 + r4;
        r7.mTotalLength = r3;
    L_0x0214:
        r3 = r15[r18];
        r4 = -1;
        if (r3 != r4) goto L_0x0229;
    L_0x0219:
        r9 = 0;
        r0 = r15[r9];
        if (r0 != r4) goto L_0x0229;
    L_0x021e:
        r0 = r15[r17];
        if (r0 != r4) goto L_0x0229;
    L_0x0222:
        r0 = r15[r16];
        if (r0 == r4) goto L_0x0227;
    L_0x0226:
        goto L_0x0229;
    L_0x0227:
        r0 = r6;
        goto L_0x0255;
    L_0x0229:
        r0 = r15[r16];
        r9 = 0;
        r4 = r15[r9];
        r5 = r15[r17];
        r3 = java.lang.Math.max(r3, r5);
        r3 = java.lang.Math.max(r4, r3);
        r0 = java.lang.Math.max(r0, r3);
        r3 = r29[r16];
        r4 = r29[r9];
        r5 = r29[r18];
        r9 = r29[r17];
        r5 = java.lang.Math.max(r5, r9);
        r4 = java.lang.Math.max(r4, r5);
        r3 = java.lang.Math.max(r3, r4);
        r0 = r0 + r3;
        r0 = java.lang.Math.max(r6, r0);
    L_0x0255:
        if (r31 != 0) goto L_0x0258;
    L_0x0257:
        goto L_0x02b8;
    L_0x0258:
        if (r12 == r8) goto L_0x025c;
    L_0x025a:
        if (r12 != 0) goto L_0x02b8;
    L_0x025c:
        r3 = 0;
        r7.mTotalLength = r3;
        r3 = 0;
    L_0x0260:
        if (r3 >= r11) goto L_0x02b8;
    L_0x0262:
        r4 = r7.getVirtualChildAt(r3);
        if (r4 != 0) goto L_0x0272;
    L_0x0268:
        r4 = r7.mTotalLength;
        r5 = r7.measureNullChild(r3);
        r4 = r4 + r5;
        r7.mTotalLength = r4;
        goto L_0x02b5;
    L_0x0272:
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 != r6) goto L_0x0280;
    L_0x027a:
        r4 = r7.getChildrenSkipCount(r4, r3);
        r3 = r3 + r4;
        goto L_0x02b5;
    L_0x0280:
        r5 = r4.getLayoutParams();
        r5 = (defpackage.anp) r5;
        if (r19 == 0) goto L_0x029d;
    L_0x0288:
        r6 = r7.mTotalLength;
        r8 = r5.leftMargin;
        r28 = r1 + r8;
        r5 = r5.rightMargin;
        r28 = r28 + r5;
        r4 = r7.getNextLocationOffset(r4);
        r28 = r28 + r4;
        r6 = r6 + r28;
        r7.mTotalLength = r6;
        goto L_0x02b5;
    L_0x029d:
        r6 = r7.mTotalLength;
        r28 = r6 + r1;
        r8 = r5.leftMargin;
        r28 = r28 + r8;
        r5 = r5.rightMargin;
        r28 = r28 + r5;
        r4 = r7.getNextLocationOffset(r4);
        r4 = r28 + r4;
        r4 = java.lang.Math.max(r6, r4);
        r7.mTotalLength = r4;
    L_0x02b5:
        r3 = r3 + 1;
        goto L_0x0260;
    L_0x02b8:
        r3 = r7.mTotalLength;
        r4 = r37.getPaddingLeft();
        r5 = r37.getPaddingRight();
        r4 = r4 + r5;
        r3 = r3 + r4;
        r7.mTotalLength = r3;
        r4 = r37.getSuggestedMinimumWidth();
        r3 = java.lang.Math.max(r3, r4);
        r4 = r38;
        r5 = 0;
        r8 = -1;
        r3 = android.view.View.resolveSizeAndState(r3, r4, r5);
        r5 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r5 = r5 & r3;
        r6 = r7.mTotalLength;
        r5 = r5 - r6;
        if (r27 == 0) goto L_0x02e0;
    L_0x02df:
        goto L_0x0328;
    L_0x02e0:
        if (r5 != 0) goto L_0x02e3;
    L_0x02e2:
        goto L_0x02e7;
    L_0x02e3:
        r9 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1));
        if (r9 > 0) goto L_0x0328;
    L_0x02e7:
        r2 = java.lang.Math.max(r2, r10);
        if (r31 == 0) goto L_0x0324;
    L_0x02ed:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 == r5) goto L_0x0324;
    L_0x02f1:
        r5 = 0;
    L_0x02f2:
        if (r5 < r11) goto L_0x02f5;
    L_0x02f4:
        goto L_0x0324;
    L_0x02f5:
        r8 = r7.getVirtualChildAt(r5);
        if (r8 != 0) goto L_0x02fc;
    L_0x02fb:
        goto L_0x0321;
    L_0x02fc:
        r9 = r8.getVisibility();
        r10 = 8;
        if (r9 == r10) goto L_0x0321;
    L_0x0304:
        r9 = r8.getLayoutParams();
        r9 = (defpackage.anp) r9;
        r9 = r9.g;
        r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1));
        if (r9 <= 0) goto L_0x0321;
    L_0x0310:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9);
        r12 = r8.getMeasuredHeight();
        r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r9);
        r8.measure(r10, r12);
    L_0x0321:
        r5 = r5 + 1;
        goto L_0x02f2;
    L_0x0324:
        r5 = r39;
        goto L_0x04c2;
    L_0x0328:
        r0 = r7.mWeightSum;
        r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1));
        if (r1 <= 0) goto L_0x032f;
    L_0x032e:
        goto L_0x0331;
    L_0x032f:
        r0 = r25;
    L_0x0331:
        r15[r16] = r8;
        r15[r17] = r8;
        r15[r18] = r8;
        r1 = 0;
        r15[r1] = r8;
        r29[r16] = r8;
        r29[r17] = r8;
        r29[r18] = r8;
        r29[r1] = r8;
        r7.mTotalLength = r1;
        r9 = r2;
        r1 = -1;
        r2 = r0;
        r0 = 0;
    L_0x0348:
        if (r0 >= r11) goto L_0x0470;
    L_0x034a:
        r10 = r7.getVirtualChildAt(r0);
        if (r10 != 0) goto L_0x0353;
    L_0x0350:
        r6 = 8;
        goto L_0x035b;
    L_0x0353:
        r8 = r10.getVisibility();
        r6 = 8;
        if (r8 != r6) goto L_0x0363;
    L_0x035b:
        r23 = r5;
        r21 = 4;
        r5 = r39;
        goto L_0x0467;
    L_0x0363:
        r8 = r10.getLayoutParams();
        r8 = (defpackage.anp) r8;
        r6 = r8.g;
        r23 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1));
        if (r23 <= 0) goto L_0x03ca;
    L_0x036f:
        r4 = (float) r5;
        r4 = r4 * r6;
        r4 = r4 / r2;
        r4 = (int) r4;
        r2 = r2 - r6;
        r5 = r5 - r4;
        r6 = r37.getPaddingTop();
        r23 = r37.getPaddingBottom();
        r6 = r6 + r23;
        r23 = r2;
        r2 = r8.topMargin;
        r6 = r6 + r2;
        r2 = r8.bottomMargin;
        r6 = r6 + r2;
        r2 = r8.height;
        r25 = r5;
        r5 = r39;
        r2 = defpackage.anq.getChildMeasureSpec(r5, r6, r2);
        r6 = r8.width;
        if (r6 == 0) goto L_0x0399;
    L_0x0396:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x03a9;
    L_0x0399:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 != r6) goto L_0x03a9;
    L_0x039d:
        if (r4 <= 0) goto L_0x03a0;
    L_0x039f:
        goto L_0x03a1;
    L_0x03a0:
        r4 = 0;
    L_0x03a1:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);
        r10.measure(r4, r2);
        goto L_0x03ba;
    L_0x03a9:
        r27 = r10.getMeasuredWidth();
        r4 = r27 + r4;
        if (r4 < 0) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03b3;
    L_0x03b2:
        r4 = 0;
    L_0x03b3:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);
        r10.measure(r4, r2);
    L_0x03ba:
        r2 = r10.getMeasuredState();
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 & r4;
        r14 = android.view.View.combineMeasuredStates(r14, r2);
        r2 = r23;
        r4 = r25;
        goto L_0x03cf;
    L_0x03ca:
        r4 = r5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r39;
    L_0x03cf:
        if (r12 != r6) goto L_0x03ee;
    L_0x03d1:
        r6 = r7.mTotalLength;
        r23 = r10.getMeasuredWidth();
        r25 = r2;
        r2 = r8.leftMargin;
        r23 = r23 + r2;
        r2 = r8.rightMargin;
        r23 = r23 + r2;
        r2 = r7.getNextLocationOffset(r10);
        r23 = r23 + r2;
        r6 = r6 + r23;
        r7.mTotalLength = r6;
        r23 = r4;
        goto L_0x040a;
    L_0x03ee:
        r25 = r2;
        r2 = r7.mTotalLength;
        r6 = r10.getMeasuredWidth();
        r6 = r6 + r2;
        r23 = r4;
        r4 = r8.leftMargin;
        r6 = r6 + r4;
        r4 = r8.rightMargin;
        r6 = r6 + r4;
        r4 = r7.getNextLocationOffset(r10);
        r6 = r6 + r4;
        r2 = java.lang.Math.max(r2, r6);
        r7.mTotalLength = r2;
    L_0x040a:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 == r2) goto L_0x0416;
    L_0x040e:
        r2 = r8.height;
        r4 = -1;
        if (r2 == r4) goto L_0x0414;
    L_0x0413:
        goto L_0x0416;
    L_0x0414:
        r2 = 1;
        goto L_0x0417;
    L_0x0416:
        r2 = 0;
    L_0x0417:
        r4 = r8.topMargin;
        r6 = r8.bottomMargin;
        r4 = r4 + r6;
        r6 = r10.getMeasuredHeight();
        r6 = r6 + r4;
        r1 = java.lang.Math.max(r1, r6);
        if (r2 != 0) goto L_0x0428;
    L_0x0427:
        r4 = r6;
    L_0x0428:
        r2 = java.lang.Math.max(r9, r4);
        if (r24 == 0) goto L_0x0436;
    L_0x042e:
        r4 = r8.height;
        r9 = -1;
        if (r4 == r9) goto L_0x0434;
    L_0x0433:
        goto L_0x0437;
    L_0x0434:
        r4 = 1;
        goto L_0x0438;
    L_0x0436:
        r9 = -1;
    L_0x0437:
        r4 = 0;
    L_0x0438:
        if (r36 == 0) goto L_0x0460;
    L_0x043a:
        r10 = r10.getBaseline();
        if (r10 == r9) goto L_0x0460;
    L_0x0440:
        r8 = r8.h;
        if (r8 >= 0) goto L_0x0446;
    L_0x0444:
        r8 = r7.mGravity;
    L_0x0446:
        r8 = r8 & 112;
        r21 = 4;
        r8 = r8 >> 4;
        r8 = r8 >> 1;
        r9 = r15[r8];
        r9 = java.lang.Math.max(r9, r10);
        r15[r8] = r9;
        r9 = r29[r8];
        r6 = r6 - r10;
        r6 = java.lang.Math.max(r9, r6);
        r29[r8] = r6;
        goto L_0x0462;
    L_0x0460:
        r21 = 4;
    L_0x0462:
        r9 = r2;
        r24 = r4;
        r2 = r25;
    L_0x0467:
        r0 = r0 + 1;
        r4 = r38;
        r5 = r23;
        r8 = -1;
        goto L_0x0348;
    L_0x0470:
        r5 = r39;
        r0 = r7.mTotalLength;
        r2 = r37.getPaddingLeft();
        r4 = r37.getPaddingRight();
        r2 = r2 + r4;
        r0 = r0 + r2;
        r7.mTotalLength = r0;
        r0 = r15[r18];
        r2 = -1;
        if (r0 != r2) goto L_0x0495;
    L_0x0485:
        r4 = 0;
        r6 = r15[r4];
        if (r6 != r2) goto L_0x0495;
    L_0x048a:
        r4 = r15[r17];
        if (r4 != r2) goto L_0x0495;
    L_0x048e:
        r4 = r15[r16];
        if (r4 == r2) goto L_0x0493;
    L_0x0492:
        goto L_0x0495;
    L_0x0493:
        r0 = r1;
        goto L_0x04c1;
    L_0x0495:
        r2 = r15[r16];
        r4 = 0;
        r6 = r15[r4];
        r8 = r15[r17];
        r0 = java.lang.Math.max(r0, r8);
        r0 = java.lang.Math.max(r6, r0);
        r0 = java.lang.Math.max(r2, r0);
        r2 = r29[r16];
        r4 = r29[r4];
        r6 = r29[r18];
        r8 = r29[r17];
        r6 = java.lang.Math.max(r6, r8);
        r4 = java.lang.Math.max(r4, r6);
        r2 = java.lang.Math.max(r2, r4);
        r0 = r0 + r2;
        r0 = java.lang.Math.max(r1, r0);
    L_0x04c1:
        r2 = r9;
    L_0x04c2:
        if (r24 == 0) goto L_0x04c5;
    L_0x04c4:
        goto L_0x04c9;
    L_0x04c5:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 != r1) goto L_0x04cc;
    L_0x04c9:
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        goto L_0x04ce;
    L_0x04cc:
        r0 = r2;
        goto L_0x04c9;
    L_0x04ce:
        r1 = r1 & r14;
        r1 = r1 | r3;
        r2 = r37.getPaddingTop();
        r3 = r37.getPaddingBottom();
        r2 = r2 + r3;
        r0 = r0 + r2;
        r2 = r37.getSuggestedMinimumHeight();
        r0 = java.lang.Math.max(r0, r2);
        r2 = r14 << 16;
        r0 = android.view.View.resolveSizeAndState(r0, r5, r2);
        r7.setMeasuredDimension(r1, r0);
        if (r26 == 0) goto L_0x04f2;
    L_0x04ed:
        r0 = r38;
        r7.forceUniformHeight(r11, r0);
    L_0x04f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anq.measureHorizontal(int, int):void");
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                anp anp = (anp) virtualChildAt.getLayoutParams();
                if (anp.height == -1) {
                    int i4 = anp.width;
                    anp.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    anp.width = i4;
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        i5 = this.mGravity;
        int i6 = i5 & 8388615;
        i5 &= 112;
        if (i5 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i5 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        }
        int i7 = 0;
        while (i7 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt == null) {
                i5 += measureNullChild(i7);
            } else if (virtualChildAt.getVisibility() != 8) {
                int i8;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                anp anp = (anp) virtualChildAt.getLayoutParams();
                int i9 = anp.h;
                if (i9 < 0) {
                    i9 = i6;
                }
                i9 = Gravity.getAbsoluteGravity(i9, abe.g(this)) & 7;
                if (i9 == 1) {
                    i9 = (((paddingRight2 - measuredWidth) / 2) + paddingLeft) + anp.leftMargin;
                    i8 = anp.rightMargin;
                    i9 -= i8;
                } else if (i9 != 5) {
                    i9 = anp.leftMargin + paddingLeft;
                } else {
                    i9 = paddingRight - measuredWidth;
                    i8 = anp.rightMargin;
                    i9 -= i8;
                }
                i8 = i9;
                if (hasDividerBeforeChildAt(i7)) {
                    i5 += this.mDividerHeight;
                }
                int i10 = i5 + anp.topMargin;
                anp anp2 = anp;
                setChildFrame(virtualChildAt, i8, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i7 += getChildrenSkipCount(virtualChildAt, i7);
                i5 = i10 + ((measuredHeight + anp2.bottomMargin) + getNextLocationOffset(virtualChildAt));
            }
            i7++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109  */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
        r24 = this;
        r6 = r24;
        r0 = defpackage.asy.a(r24);
        r7 = r24.getPaddingTop();
        r1 = r28 - r26;
        r2 = r24.getPaddingBottom();
        r8 = r1 - r2;
        r1 = r1 - r7;
        r2 = r24.getPaddingBottom();
        r9 = r1 - r2;
        r10 = r24.getVirtualChildCount();
        r1 = r6.mGravity;
        r11 = r1 & 112;
        r12 = r6.mBaselineAligned;
        r13 = r6.mMaxAscent;
        r14 = r6.mMaxDescent;
        r2 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r1 = r1 & r2;
        r2 = defpackage.abe.g(r24);
        r1 = android.view.Gravity.getAbsoluteGravity(r1, r2);
        r15 = 2;
        r5 = 1;
        if (r1 == r5) goto L_0x004b;
    L_0x0037:
        r2 = 5;
        if (r1 == r2) goto L_0x003f;
    L_0x003a:
        r1 = r24.getPaddingLeft();
        goto L_0x0056;
    L_0x003f:
        r1 = r24.getPaddingLeft();
        r1 = r1 + r27;
        r1 = r1 - r25;
        r2 = r6.mTotalLength;
        r1 = r1 - r2;
        goto L_0x0056;
    L_0x004b:
        r1 = r24.getPaddingLeft();
        r2 = r27 - r25;
        r3 = r6.mTotalLength;
        r2 = r2 - r3;
        r2 = r2 / r15;
        r1 = r1 + r2;
    L_0x0056:
        r2 = 0;
        if (r0 == 0) goto L_0x0060;
    L_0x0059:
        r0 = r10 + -1;
        r16 = r0;
        r17 = -1;
        goto L_0x0064;
    L_0x0060:
        r16 = 0;
        r17 = 1;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        if (r3 >= r10) goto L_0x0149;
    L_0x0067:
        r0 = r17 * r3;
        r2 = r16 + r0;
        r0 = r6.getVirtualChildAt(r2);
        if (r0 != 0) goto L_0x0082;
    L_0x0071:
        r0 = r6.measureNullChild(r2);
        r1 = r1 + r0;
    L_0x0076:
        r22 = r7;
        r19 = r10;
        r20 = r11;
        r21 = 1;
        r23 = -1;
        goto L_0x013d;
    L_0x0082:
        r5 = r0.getVisibility();
        r15 = 8;
        if (r5 == r15) goto L_0x0139;
    L_0x008a:
        r15 = r0.getMeasuredWidth();
        r5 = r0.getMeasuredHeight();
        r18 = r0.getLayoutParams();
        r4 = r18;
        r4 = (defpackage.anp) r4;
        if (r12 == 0) goto L_0x00aa;
    L_0x009c:
        r18 = r3;
        r3 = r4.height;
        r19 = r10;
        r10 = -1;
        if (r3 == r10) goto L_0x00ae;
    L_0x00a5:
        r3 = r0.getBaseline();
        goto L_0x00af;
    L_0x00aa:
        r18 = r3;
        r19 = r10;
    L_0x00ae:
        r3 = -1;
    L_0x00af:
        r10 = r4.h;
        if (r10 < 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b5;
    L_0x00b4:
        r10 = r11;
    L_0x00b5:
        r10 = r10 & 112;
        r20 = r11;
        r11 = 16;
        if (r10 == r11) goto L_0x00f5;
    L_0x00bd:
        r11 = 48;
        if (r10 == r11) goto L_0x00e2;
    L_0x00c1:
        r11 = 80;
        if (r10 == r11) goto L_0x00ca;
    L_0x00c5:
        r3 = r7;
        r11 = -1;
    L_0x00c7:
        r21 = 1;
        goto L_0x0103;
    L_0x00ca:
        r10 = r8 - r5;
        r11 = r4.bottomMargin;
        r10 = r10 - r11;
        r11 = -1;
        if (r3 == r11) goto L_0x00e0;
    L_0x00d2:
        r21 = r0.getMeasuredHeight();
        r22 = 2;
        r23 = r14[r22];
        r21 = r21 - r3;
        r23 = r23 - r21;
        r10 = r10 - r23;
    L_0x00e0:
        r3 = r10;
        goto L_0x00c7;
    L_0x00e2:
        r11 = -1;
        r10 = r4.topMargin;
        r10 = r10 + r7;
        if (r3 == r11) goto L_0x00f1;
    L_0x00e8:
        r21 = 1;
        r22 = r13[r21];
        r22 = r22 - r3;
        r10 = r10 + r22;
        goto L_0x00f3;
    L_0x00f1:
        r21 = 1;
    L_0x00f3:
        r3 = r10;
        goto L_0x0103;
    L_0x00f5:
        r11 = -1;
        r21 = 1;
        r3 = r9 - r5;
        r10 = 2;
        r3 = r3 / r10;
        r3 = r3 + r7;
        r10 = r4.topMargin;
        r3 = r3 + r10;
        r10 = r4.bottomMargin;
        r3 = r3 - r10;
    L_0x0103:
        r10 = r6.hasDividerBeforeChildAt(r2);
        if (r10 == 0) goto L_0x010c;
    L_0x0109:
        r10 = r6.mDividerWidth;
        r1 = r1 + r10;
    L_0x010c:
        r10 = r4.leftMargin;
        r10 = r10 + r1;
        r1 = r6.getLocationOffset(r0);
        r22 = r10 + r1;
        r1 = r0;
        r0 = r24;
        r25 = r1;
        r11 = r2;
        r2 = r22;
        r22 = r7;
        r23 = -1;
        r7 = r4;
        r4 = r15;
        r0.setChildFrame(r1, r2, r3, r4, r5);
        r0 = r7.rightMargin;
        r15 = r15 + r0;
        r0 = r25;
        r1 = r6.getNextLocationOffset(r0);
        r15 = r15 + r1;
        r10 = r10 + r15;
        r0 = r6.getChildrenSkipCount(r0, r11);
        r3 = r18 + r0;
        r1 = r10;
        goto L_0x013d;
    L_0x0139:
        r18 = r3;
        goto L_0x0076;
    L_0x013d:
        r3 = r3 + 1;
        r10 = r19;
        r11 = r20;
        r7 = r22;
        r5 = 1;
        r15 = 2;
        goto L_0x0065;
    L_0x0149:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anq.layoutHorizontal(int, int, int, int):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        i &= 8388615;
        int i2 = this.mGravity;
        if ((8388615 & i2) != i) {
            this.mGravity = i | (-8388616 & i2);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        i &= 112;
        int i2 = this.mGravity;
        if ((i2 & 112) != i) {
            this.mGravity = i | (i2 & -113);
            requestLayout();
        }
    }

    public anp generateLayoutParams(AttributeSet attributeSet) {
        return new anp(getContext(), attributeSet);
    }

    public anp generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new anp(-2);
        }
        return i == 1 ? new anp(-1) : null;
    }

    public anp generateLayoutParams(LayoutParams layoutParams) {
        return new anp(layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof anp;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }
}
