package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.lang.reflect.Field;

/* renamed from: amt */
class amt extends ListView {
    public boolean a;
    public amv b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private Field i;
    private amw j;
    private final boolean k;
    private boolean l;
    private add m;

    amt(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (NoSuchFieldException e) {
            ankx.a(e);
        }
    }

    public boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        this.j = drawable != null ? new amw(drawable) : null;
        super.setSelector(this.j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        if (!this.c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        amv amv = this.b;
        if (amv != null) {
            amt amt = amv.a;
            amt.b = null;
            amt.removeCallbacks(amv);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingTop += listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = listPaddingTop;
        View view = null;
        listPaddingTop = 0;
        int i4 = 0;
        while (listPaddingTop < count) {
            int itemViewType = adapter.getItemViewType(listPaddingTop);
            int i5 = itemViewType == i4 ? i4 : itemViewType;
            if (itemViewType != i4) {
                view = null;
            }
            view = adapter.getView(listPaddingTop, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i4 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i4 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i4);
            view.forceLayout();
            if (listPaddingTop > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
            listPaddingTop++;
            i4 = i5;
        }
        return i3;
    }

    private final void a(boolean z) {
        amw amw = this.j;
        if (amw != null) {
            amw.b = z;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            this.b = new amv(this);
            amv amv = this.b;
            amv.a.post(amv);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015a  */
    public boolean a(android.view.MotionEvent r17, int r18) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r3 = r17.getActionMasked();
        r4 = 1;
        r5 = 0;
        if (r3 == r4) goto L_0x001a;
    L_0x000c:
        r0 = 2;
        if (r3 == r0) goto L_0x0018;
    L_0x000f:
        r0 = 3;
        if (r3 == r0) goto L_0x0015;
    L_0x0012:
        r0 = 1;
        goto L_0x0130;
    L_0x0015:
        r0 = 0;
        goto L_0x0130;
    L_0x0018:
        r0 = 1;
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        r6 = r17.findPointerIndex(r18);
        if (r6 < 0) goto L_0x012e;
    L_0x0021:
        r7 = r2.getX(r6);
        r7 = (int) r7;
        r6 = r2.getY(r6);
        r6 = (int) r6;
        r8 = r1.pointToPosition(r7, r6);
        r9 = -1;
        if (r8 == r9) goto L_0x012c;
    L_0x0032:
        r0 = r16.getFirstVisiblePosition();
        r0 = r8 - r0;
        r10 = r1.getChildAt(r0);
        r7 = (float) r7;
        r6 = (float) r6;
        r1.l = r4;
        r0 = android.os.Build.VERSION.SDK_INT;
        r11 = 21;
        if (r0 < r11) goto L_0x0049;
    L_0x0046:
        r1.drawableHotspotChanged(r7, r6);
    L_0x0049:
        r0 = r16.isPressed();
        if (r0 != 0) goto L_0x0052;
    L_0x004f:
        r1.setPressed(r4);
    L_0x0052:
        r16.layoutChildren();
        r0 = r1.h;
        if (r0 == r9) goto L_0x0070;
    L_0x0059:
        r12 = r16.getFirstVisiblePosition();
        r0 = r0 - r12;
        r0 = r1.getChildAt(r0);
        if (r0 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0070;
    L_0x0065:
        if (r0 == r10) goto L_0x0070;
    L_0x0067:
        r12 = r0.isPressed();
        if (r12 == 0) goto L_0x0070;
    L_0x006d:
        r0.setPressed(r5);
    L_0x0070:
        r1.h = r8;
        r0 = r10.getLeft();
        r0 = (float) r0;
        r0 = r7 - r0;
        r12 = r10.getTop();
        r12 = (float) r12;
        r12 = r6 - r12;
        r13 = android.os.Build.VERSION.SDK_INT;
        if (r13 < r11) goto L_0x0087;
    L_0x0084:
        r10.drawableHotspotChanged(r0, r12);
    L_0x0087:
        r0 = r10.isPressed();
        if (r0 != 0) goto L_0x0090;
    L_0x008d:
        r10.setPressed(r4);
    L_0x0090:
        r11 = r16.getSelector();
        if (r11 != 0) goto L_0x0098;
    L_0x0096:
        r12 = 0;
        goto L_0x009c;
    L_0x0098:
        if (r8 != r9) goto L_0x009b;
    L_0x009a:
        goto L_0x0096;
    L_0x009b:
        r12 = 1;
    L_0x009c:
        if (r12 == 0) goto L_0x00a1;
    L_0x009e:
        r11.setVisible(r5, r5);
    L_0x00a1:
        r0 = r1.c;
        r13 = r10.getLeft();
        r14 = r10.getTop();
        r15 = r10.getRight();
        r5 = r10.getBottom();
        r0.set(r13, r14, r15, r5);
        r5 = r0.left;
        r13 = r1.d;
        r5 = r5 - r13;
        r0.left = r5;
        r5 = r0.top;
        r13 = r1.e;
        r5 = r5 - r13;
        r0.top = r5;
        r5 = r0.right;
        r13 = r1.f;
        r5 = r5 + r13;
        r0.right = r5;
        r5 = r0.bottom;
        r13 = r1.g;
        r5 = r5 + r13;
        r0.bottom = r5;
        r0 = r1.i;	 Catch:{ IllegalAccessException -> 0x00ee }
        r0 = r0.getBoolean(r1);	 Catch:{ IllegalAccessException -> 0x00ee }
        r5 = r10.isEnabled();	 Catch:{ IllegalAccessException -> 0x00ee }
        if (r5 == r0) goto L_0x00f2;
    L_0x00de:
        r5 = r1.i;	 Catch:{ IllegalAccessException -> 0x00ee }
        r0 = r0 ^ r4;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IllegalAccessException -> 0x00ee }
        r5.set(r1, r0);	 Catch:{ IllegalAccessException -> 0x00ee }
        if (r8 == r9) goto L_0x00f2;
    L_0x00ea:
        r16.refreshDrawableState();	 Catch:{ IllegalAccessException -> 0x00ee }
        goto L_0x00f2;
    L_0x00ee:
        r0 = move-exception;
        defpackage.ankx.a(r0);
    L_0x00f2:
        if (r12 == 0) goto L_0x010f;
    L_0x00f4:
        r0 = r1.c;
        r5 = r0.exactCenterX();
        r0 = r0.exactCenterY();
        r12 = r16.getVisibility();
        if (r12 != 0) goto L_0x0106;
    L_0x0104:
        r12 = 1;
        goto L_0x0107;
    L_0x0106:
        r12 = 0;
    L_0x0107:
        r13 = 0;
        r11.setVisible(r12, r13);
        defpackage.st.a(r11, r5, r0);
        goto L_0x0110;
    L_0x010f:
        r13 = 0;
    L_0x0110:
        r0 = r16.getSelector();
        if (r0 == 0) goto L_0x011b;
    L_0x0116:
        if (r8 == r9) goto L_0x011b;
    L_0x0118:
        defpackage.st.a(r0, r7, r6);
    L_0x011b:
        r1.a(r13);
        r16.refreshDrawableState();
        if (r3 != r4) goto L_0x012a;
    L_0x0123:
        r5 = r1.getItemIdAtPosition(r8);
        r1.performItemClick(r10, r8, r5);
    L_0x012a:
        r0 = 1;
        goto L_0x012f;
    L_0x012c:
        r5 = 1;
        goto L_0x0130;
    L_0x012e:
        r0 = 0;
    L_0x012f:
        r5 = 0;
    L_0x0130:
        if (r0 == 0) goto L_0x0137;
    L_0x0132:
        if (r5 == 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0137;
    L_0x0135:
        r3 = 0;
        goto L_0x0150;
    L_0x0137:
        r3 = 0;
        r1.l = r3;
        r1.setPressed(r3);
        r16.drawableStateChanged();
        r5 = r1.h;
        r6 = r16.getFirstVisiblePosition();
        r5 = r5 - r6;
        r5 = r1.getChildAt(r5);
        if (r5 == 0) goto L_0x0150;
    L_0x014d:
        r5.setPressed(r3);
    L_0x0150:
        if (r0 != 0) goto L_0x015a;
    L_0x0152:
        r2 = r1.m;
        if (r2 == 0) goto L_0x016f;
    L_0x0156:
        r2.a(r3);
        goto L_0x016f;
    L_0x015a:
        r3 = r1.m;
        if (r3 != 0) goto L_0x0165;
    L_0x015e:
        r3 = new add;
        r3.<init>(r1);
        r1.m = r3;
    L_0x0165:
        r3 = r1.m;
        r3.a(r4);
        r3 = r1.m;
        r3.onTouch(r1, r2);
    L_0x016f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amt.a(android.view.MotionEvent, int):boolean");
    }

    private final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
