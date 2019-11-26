package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.youtube.R;
import defpackage.aaa;
import defpackage.aay;
import defpackage.aaz;
import defpackage.aba;
import defpackage.abb;
import defpackage.abe;
import defpackage.abx;
import defpackage.aut;
import defpackage.auu;
import defpackage.auv;
import defpackage.auw;
import defpackage.aux;
import defpackage.auy;
import defpackage.auz;
import defpackage.ava;
import defpackage.avb;
import defpackage.avc;
import defpackage.ave;
import defpackage.avf;
import defpackage.zy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements aay, aaz {
    private static final String f;
    private static final Class[] g = new Class[]{Context.class, AttributeSet.class};
    private static final ThreadLocal h = new ThreadLocal();
    private static final Comparator i;
    private static final zy j = new aaa(12);
    public final avf a;
    public final List b;
    public abx c;
    public boolean d;
    public OnHierarchyChangeListener e;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private avb t;
    private boolean u;
    private Drawable v;
    private aba w;
    private final abb x;

    private static Rect a() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int d(int i) {
        return i == 0 ? 8388661 : i;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        j.a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        super(context, attributeSet, i);
        this.k = new ArrayList();
        this.a = new avf();
        this.l = new ArrayList();
        this.b = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.x = new abb();
        int i2 = 0;
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aut.a, 0, R.style.f752Widget.Support.CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aut.a, i, 0);
        }
        i = obtainStyledAttributes.getResourceId(aut.j, 0);
        if (i != 0) {
            Resources resources = context.getResources();
            this.q = resources.getIntArray(i);
            float f = resources.getDisplayMetrics().density;
            i = this.q.length;
            while (i2 < i) {
                int[] iArr = this.q;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
                i2++;
            }
        }
        this.v = obtainStyledAttributes.getDrawable(aut.k);
        obtainStyledAttributes.recycle();
        b();
        super.setOnHierarchyChangeListener(new auz(this));
    }

    public final void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.e = onHierarchyChangeListener;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.u) {
            if (this.t == null) {
                this.t = new avb(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.t);
        }
        if (this.c == null && abe.v(this)) {
            abe.u(this);
        }
        this.p = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.u && this.t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.t);
        }
        View view = this.s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.p = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (drawable != null && drawable.isVisible() != z) {
            this.v.setVisible(z, false);
        }
    }

    private final void a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            aux aux = ((auy) childAt.getLayoutParams()).a;
            if (aux != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    aux.a(this, childAt, obtain);
                } else {
                    aux.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((auy) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.r = null;
        this.o = false;
    }

    private final boolean a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount - 1;
        while (i2 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
            i2--;
        }
        Comparator comparator = i;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        for (childCount = 0; childCount < size; childCount++) {
            View view = (View) list.get(childCount);
            auy auy = (auy) view.getLayoutParams();
            aux aux = auy.a;
            if (!z || actionMasked == 0) {
                if (!(z || aux == null)) {
                    if (i != 0) {
                        z = aux.b(this, view, motionEvent2);
                    } else {
                        z = aux.a(this, view, motionEvent2);
                    }
                    if (z) {
                        this.r = view;
                    }
                }
                if (auy.a == null) {
                    auy.m = false;
                }
            } else if (aux != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i != 0) {
                    aux.b(this, view, motionEvent3);
                } else {
                    aux.a(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Missing block: B:3:0x0012, code skipped:
            if (r3 == false) goto L_0x0014;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r18.getActionMasked();
        r3 = r0.r;
        r4 = 1;
        r5 = 0;
        if (r3 != 0) goto L_0x0016;
    L_0x000e:
        r3 = r0.a(r1, r4);
        if (r3 != 0) goto L_0x0017;
    L_0x0014:
        r6 = 0;
        goto L_0x0029;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        r6 = r0.r;
        r6 = r6.getLayoutParams();
        r6 = (defpackage.auy) r6;
        r6 = r6.a;
        if (r6 == 0) goto L_0x0014;
    L_0x0023:
        r7 = r0.r;
        r6 = r6.b(r0, r7, r1);
    L_0x0029:
        r7 = r0.r;
        r8 = 0;
        if (r7 != 0) goto L_0x0034;
    L_0x002e:
        r1 = super.onTouchEvent(r18);
        r6 = r6 | r1;
        goto L_0x0047;
    L_0x0034:
        if (r3 == 0) goto L_0x0047;
    L_0x0036:
        r11 = android.os.SystemClock.uptimeMillis();
        r13 = 3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r9 = r11;
        r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16);
        super.onTouchEvent(r8);
    L_0x0047:
        if (r8 == 0) goto L_0x004c;
    L_0x0049:
        r8.recycle();
    L_0x004c:
        if (r2 != r4) goto L_0x004f;
    L_0x004e:
        goto L_0x0052;
    L_0x004f:
        r1 = 3;
        if (r2 != r1) goto L_0x0055;
    L_0x0052:
        r0.a(r5);
    L_0x0055:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.o) {
            a(false);
            this.o = true;
        }
    }

    private final int b(int i) {
        int[] iArr = this.q;
        String str = "CoordinatorLayout";
        StringBuilder stringBuilder;
        if (iArr == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e(str, stringBuilder.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
            Log.e(str, stringBuilder.toString());
            return 0;
        }
    }

    public static aux a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder stringBuilder;
        Object str2;
        if (str2.startsWith(".")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str2);
            str2 = stringBuilder.toString();
        } else if (str2.indexOf(46) < 0 && !TextUtils.isEmpty(f)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(f);
            stringBuilder2.append('.');
            stringBuilder2.append(str2);
            str2 = stringBuilder2.toString();
        }
        try {
            Map map = (Map) h.get();
            if (map == null) {
                map = new HashMap();
                h.set(map);
            }
            Constructor constructor = (Constructor) map.get(str2);
            if (constructor == null) {
                constructor = Class.forName(str2, false, context.getClassLoader()).getConstructor(g);
                constructor.setAccessible(true);
                map.put(str2, constructor);
            }
            return (aux) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not inflate Behavior subclass ");
            stringBuilder.append(str2);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    private static auy c(View view) {
        auy auy = (auy) view.getLayoutParams();
        if (!auy.b) {
            String str = "CoordinatorLayout";
            if (view instanceof auu) {
                aux b = ((auu) view).b();
                if (b == null) {
                    Log.e(str, "Attached behavior class is null");
                }
                auy.a(b);
                auy.b = true;
            } else {
                auw auw = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    auw = (auw) cls.getAnnotation(auw.class);
                    if (auw != null) {
                        break;
                    }
                }
                if (auw != null) {
                    try {
                        auy.a((aux) auw.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(auw.a().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e(str, stringBuilder.toString(), e);
                    }
                }
                auy.b = true;
            }
        }
        return auy;
    }

    /* Access modifiers changed, original: protected|final */
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* Access modifiers changed, original: protected|final */
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ff  */
    /* JADX WARNING: Missing block: B:137:0x028a, code skipped:
            if (r11 != 1) goto L_0x0296;
     */
    /* JADX WARNING: Missing block: B:141:0x0293, code skipped:
            if (r11 == r2) goto L_0x0296;
     */
    /* JADX WARNING: Missing block: B:142:0x0296, code skipped:
            r1 = java.lang.Math.max(0, r8 - r9);
     */
    public final void onMeasure(int r31, int r32) {
        /*
        r30 = this;
        r6 = r30;
        r0 = r6.k;
        r0.clear();
        r0 = r6.a;
        r1 = r0.b;
        r1 = r1.b;
        r7 = 0;
        r2 = 0;
    L_0x000f:
        if (r2 < r1) goto L_0x03af;
    L_0x0011:
        r0 = r0.b;
        r0.clear();
        r0 = r30.getChildCount();
        r1 = 0;
    L_0x001b:
        if (r1 >= r0) goto L_0x016d;
    L_0x001d:
        r2 = r6.getChildAt(r1);
        r3 = c(r2);
        r4 = r3.f;
        r5 = -1;
        r8 = 0;
        if (r4 != r5) goto L_0x0031;
    L_0x002b:
        r3.l = r8;
        r3.k = r8;
        goto L_0x00d8;
    L_0x0031:
        r4 = r3.k;
        if (r4 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x005f;
    L_0x0036:
        r4 = r4.getId();
        r5 = r3.f;
        if (r4 != r5) goto L_0x005f;
    L_0x003e:
        r4 = r3.k;
        r5 = r4.getParent();
    L_0x0044:
        if (r5 != r6) goto L_0x004a;
    L_0x0046:
        r3.l = r4;
        goto L_0x00d8;
    L_0x004a:
        if (r5 != 0) goto L_0x004d;
    L_0x004c:
        goto L_0x005b;
    L_0x004d:
        if (r5 == r2) goto L_0x005b;
    L_0x004f:
        r9 = r5 instanceof android.view.View;
        if (r9 == 0) goto L_0x0056;
    L_0x0053:
        r4 = r5;
        r4 = (android.view.View) r4;
    L_0x0056:
        r5 = r5.getParent();
        goto L_0x0044;
    L_0x005b:
        r3.l = r8;
        r3.k = r8;
    L_0x005f:
        r4 = r3.f;
        r4 = r6.findViewById(r4);
        r3.k = r4;
        r4 = r3.k;
        if (r4 != 0) goto L_0x009f;
    L_0x006b:
        r4 = r30.isInEditMode();
        if (r4 == 0) goto L_0x0076;
    L_0x0071:
        r3.l = r8;
        r3.k = r8;
        goto L_0x00d8;
    L_0x0076:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "Could not find CoordinatorLayout descendant view with id ";
        r1.append(r4);
        r4 = r30.getResources();
        r3 = r3.f;
        r3 = r4.getResourceName(r3);
        r1.append(r3);
        r3 = " to anchor view ";
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x009f:
        if (r4 == r6) goto L_0x00ce;
    L_0x00a1:
        r5 = r4.getParent();
    L_0x00a5:
        if (r5 != r6) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00cb;
    L_0x00a8:
        if (r5 == 0) goto L_0x00cb;
    L_0x00aa:
        if (r5 == r2) goto L_0x00b8;
    L_0x00ac:
        r9 = r5 instanceof android.view.View;
        if (r9 == 0) goto L_0x00b3;
    L_0x00b0:
        r4 = r5;
        r4 = (android.view.View) r4;
    L_0x00b3:
        r5 = r5.getParent();
        goto L_0x00a5;
    L_0x00b8:
        r4 = r30.isInEditMode();
        if (r4 == 0) goto L_0x00c3;
    L_0x00be:
        r3.l = r8;
        r3.k = r8;
        goto L_0x00d8;
    L_0x00c3:
        r0 = new java.lang.IllegalStateException;
        r1 = "Anchor must not be a descendant of the anchored view";
        r0.<init>(r1);
        throw r0;
    L_0x00cb:
        r3.l = r4;
        goto L_0x00d8;
    L_0x00ce:
        r4 = r30.isInEditMode();
        if (r4 == 0) goto L_0x0165;
    L_0x00d4:
        r3.l = r8;
        r3.k = r8;
    L_0x00d8:
        r4 = r6.a;
        r4.a(r2);
        r4 = 0;
    L_0x00de:
        if (r4 < r0) goto L_0x00e4;
    L_0x00e0:
        r1 = r1 + 1;
        goto L_0x001b;
    L_0x00e4:
        if (r4 == r1) goto L_0x0161;
    L_0x00e6:
        r5 = r6.getChildAt(r4);
        r8 = r3.l;
        if (r5 == r8) goto L_0x0115;
    L_0x00ee:
        r8 = defpackage.abe.g(r30);
        r9 = r5.getLayoutParams();
        r9 = (defpackage.auy) r9;
        r9 = r9.g;
        r9 = android.view.Gravity.getAbsoluteGravity(r9, r8);
        if (r9 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x010a;
    L_0x0101:
        r10 = r3.h;
        r8 = android.view.Gravity.getAbsoluteGravity(r10, r8);
        r8 = r8 & r9;
        if (r8 == r9) goto L_0x0115;
    L_0x010a:
        r8 = r3.a;
        if (r8 != 0) goto L_0x010f;
    L_0x010e:
        goto L_0x0161;
    L_0x010f:
        r8 = r8.a_(r5);
        if (r8 == 0) goto L_0x0161;
    L_0x0115:
        r8 = r6.a;
        r8 = r8.b;
        r8 = r8.containsKey(r5);
        if (r8 != 0) goto L_0x0124;
    L_0x011f:
        r8 = r6.a;
        r8.a(r5);
    L_0x0124:
        r8 = r6.a;
        r9 = r8.b;
        r9 = r9.containsKey(r5);
        if (r9 == 0) goto L_0x0159;
    L_0x012e:
        r9 = r8.b;
        r9 = r9.containsKey(r2);
        if (r9 == 0) goto L_0x0159;
    L_0x0136:
        r9 = r8.b;
        r9 = r9.get(r5);
        r9 = (java.util.ArrayList) r9;
        if (r9 == 0) goto L_0x0141;
    L_0x0140:
        goto L_0x0155;
    L_0x0141:
        r9 = r8.a;
        r9 = r9.a();
        r9 = (java.util.ArrayList) r9;
        if (r9 != 0) goto L_0x0150;
    L_0x014b:
        r9 = new java.util.ArrayList;
        r9.<init>();
    L_0x0150:
        r8 = r8.b;
        r8.put(r5, r9);
    L_0x0155:
        r9.add(r2);
        goto L_0x0161;
    L_0x0159:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "All nodes must be present in the graph before being added as an edge";
        r0.<init>(r1);
        throw r0;
    L_0x0161:
        r4 = r4 + 1;
        goto L_0x00de;
    L_0x0165:
        r0 = new java.lang.IllegalStateException;
        r1 = "View can not be anchored to the the parent CoordinatorLayout";
        r0.<init>(r1);
        throw r0;
    L_0x016d:
        r3 = r6.k;
        r4 = r6.a;
        r0 = r4.c;
        r0.clear();
        r0 = r4.d;
        r0.clear();
        r0 = r4.b;
        r5 = r0.b;
        r0 = 0;
    L_0x0180:
        if (r0 < r5) goto L_0x0397;
    L_0x0182:
        r0 = r4.c;
        r3.addAll(r0);
        r0 = r6.k;
        java.util.Collections.reverse(r0);
        r0 = r30.getChildCount();
        r1 = 0;
    L_0x0191:
        r8 = 1;
        if (r1 >= r0) goto L_0x01ba;
    L_0x0194:
        r2 = r6.getChildAt(r1);
        r3 = r6.a;
        r4 = r3.b;
        r4 = r4.b;
        r5 = 0;
    L_0x019f:
        if (r5 >= r4) goto L_0x01b7;
    L_0x01a1:
        r9 = r3.b;
        r9 = r9.c(r5);
        r9 = (java.util.ArrayList) r9;
        if (r9 != 0) goto L_0x01ac;
    L_0x01ab:
        goto L_0x01b4;
    L_0x01ac:
        r9 = r9.contains(r2);
        if (r9 == 0) goto L_0x01b4;
    L_0x01b2:
        r0 = 1;
        goto L_0x01bb;
    L_0x01b4:
        r5 = r5 + 1;
        goto L_0x019f;
    L_0x01b7:
        r1 = r1 + 1;
        goto L_0x0191;
    L_0x01ba:
        r0 = 0;
    L_0x01bb:
        r1 = r6.u;
        if (r0 == r1) goto L_0x01ef;
    L_0x01bf:
        if (r0 == 0) goto L_0x01dc;
    L_0x01c1:
        r0 = r6.p;
        if (r0 == 0) goto L_0x01d9;
    L_0x01c5:
        r0 = r6.t;
        if (r0 != 0) goto L_0x01d0;
    L_0x01c9:
        r0 = new avb;
        r0.<init>(r6);
        r6.t = r0;
    L_0x01d0:
        r0 = r30.getViewTreeObserver();
        r1 = r6.t;
        r0.addOnPreDrawListener(r1);
    L_0x01d9:
        r6.u = r8;
        goto L_0x01ef;
    L_0x01dc:
        r0 = r6.p;
        if (r0 == 0) goto L_0x01ed;
    L_0x01e0:
        r0 = r6.t;
        if (r0 == 0) goto L_0x01ed;
    L_0x01e4:
        r0 = r30.getViewTreeObserver();
        r1 = r6.t;
        r0.removeOnPreDrawListener(r1);
    L_0x01ed:
        r6.u = r7;
    L_0x01ef:
        r9 = r30.getPaddingLeft();
        r0 = r30.getPaddingTop();
        r10 = r30.getPaddingRight();
        r1 = r30.getPaddingBottom();
        r11 = defpackage.abe.g(r30);
        if (r11 == r8) goto L_0x0207;
    L_0x0205:
        r12 = 0;
        goto L_0x0208;
    L_0x0207:
        r12 = 1;
    L_0x0208:
        r13 = android.view.View.MeasureSpec.getMode(r31);
        r14 = android.view.View.MeasureSpec.getSize(r31);
        r15 = android.view.View.MeasureSpec.getMode(r32);
        r16 = android.view.View.MeasureSpec.getSize(r32);
        r17 = r9 + r10;
        r18 = r0 + r1;
        r0 = r30.getSuggestedMinimumWidth();
        r1 = r30.getSuggestedMinimumHeight();
        r2 = r6.c;
        if (r2 == 0) goto L_0x0232;
    L_0x0228:
        r2 = defpackage.abe.v(r30);
        if (r2 != 0) goto L_0x022f;
    L_0x022e:
        goto L_0x0232;
    L_0x022f:
        r19 = 1;
        goto L_0x0234;
    L_0x0232:
        r19 = 0;
    L_0x0234:
        r2 = r6.k;
        r5 = r2.size();
        r3 = r0;
        r2 = 0;
        r4 = 0;
    L_0x023d:
        if (r4 >= r5) goto L_0x037f;
    L_0x023f:
        r0 = r6.k;
        r0 = r0.get(r4);
        r0 = (android.view.View) r0;
        r7 = r0.getVisibility();
        r8 = 8;
        if (r7 == r8) goto L_0x0360;
    L_0x024f:
        r7 = r0.getLayoutParams();
        r7 = (defpackage.auy) r7;
        r8 = r7.e;
        if (r8 >= 0) goto L_0x0263;
    L_0x0259:
        r22 = r1;
        r23 = r2;
        r21 = r3;
        r2 = 1;
    L_0x0260:
        r3 = 0;
        r8 = 0;
        goto L_0x02a9;
    L_0x0263:
        if (r13 == 0) goto L_0x0259;
    L_0x0265:
        r8 = r6.b(r8);
        r22 = r1;
        r1 = r7.c;
        r1 = d(r1);
        r1 = android.view.Gravity.getAbsoluteGravity(r1, r11);
        r1 = r1 & 7;
        r23 = r2;
        r2 = 3;
        if (r1 == r2) goto L_0x027d;
    L_0x027c:
        goto L_0x027f;
    L_0x027d:
        if (r12 == 0) goto L_0x029d;
    L_0x027f:
        r2 = 5;
        if (r1 != r2) goto L_0x0285;
    L_0x0282:
        if (r12 == 0) goto L_0x0285;
    L_0x0284:
        goto L_0x029d;
    L_0x0285:
        if (r1 != r2) goto L_0x028d;
    L_0x0287:
        r2 = 1;
        r21 = r3;
        if (r11 == r2) goto L_0x0290;
    L_0x028c:
        goto L_0x0296;
    L_0x028d:
        r2 = 1;
        r21 = r3;
    L_0x0290:
        r3 = 3;
        if (r1 != r3) goto L_0x0260;
    L_0x0293:
        if (r11 == r2) goto L_0x0296;
    L_0x0295:
        goto L_0x0260;
    L_0x0296:
        r8 = r8 - r9;
        r3 = 0;
        r1 = java.lang.Math.max(r3, r8);
        goto L_0x02a8;
    L_0x029d:
        r21 = r3;
        r2 = 1;
        r3 = 0;
        r1 = r14 - r10;
        r1 = r1 - r8;
        r1 = java.lang.Math.max(r3, r1);
    L_0x02a8:
        r8 = r1;
    L_0x02a9:
        if (r19 != 0) goto L_0x02ae;
    L_0x02ab:
        r25 = r0;
        goto L_0x02df;
    L_0x02ae:
        r1 = defpackage.abe.v(r0);
        if (r1 != 0) goto L_0x02ab;
    L_0x02b4:
        r1 = r6.c;
        r1 = r1.a();
        r2 = r6.c;
        r2 = r2.c();
        r3 = r6.c;
        r3 = r3.b();
        r25 = r0;
        r0 = r6.c;
        r0 = r0.d();
        r1 = r1 + r2;
        r1 = r14 - r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13);
        r3 = r3 + r0;
        r0 = r16 - r3;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15);
        r2 = r0;
        r3 = r1;
        goto L_0x02e3;
    L_0x02df:
        r3 = r31;
        r2 = r32;
    L_0x02e3:
        r0 = r7.a;
        if (r0 != 0) goto L_0x02ff;
    L_0x02e7:
        r1 = r3;
        r28 = r4;
        r29 = r5;
        r26 = r10;
        r27 = r11;
        r11 = r21;
        r10 = r23;
        r0 = r25;
        r23 = 1;
        r24 = 0;
        r25 = r9;
        r9 = r22;
        goto L_0x032e;
    L_0x02ff:
        r1 = r25;
        r25 = r9;
        r9 = r22;
        r22 = r1;
        r1 = r30;
        r20 = r2;
        r26 = r10;
        r10 = r23;
        r23 = 1;
        r2 = r22;
        r27 = r11;
        r11 = r21;
        r24 = 0;
        r21 = r3;
        r28 = r4;
        r4 = r8;
        r29 = r5;
        r5 = r20;
        r0 = r0.b(r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x0332;
    L_0x0328:
        r2 = r20;
        r1 = r21;
        r0 = r22;
    L_0x032e:
        r6.a(r0, r1, r8, r2);
        goto L_0x0334;
    L_0x0332:
        r0 = r22;
    L_0x0334:
        r1 = r0.getMeasuredWidth();
        r1 = r17 + r1;
        r2 = r7.leftMargin;
        r1 = r1 + r2;
        r2 = r7.rightMargin;
        r1 = r1 + r2;
        r1 = java.lang.Math.max(r11, r1);
        r2 = r0.getMeasuredHeight();
        r2 = r18 + r2;
        r3 = r7.topMargin;
        r2 = r2 + r3;
        r3 = r7.bottomMargin;
        r2 = r2 + r3;
        r2 = java.lang.Math.max(r9, r2);
        r0 = r0.getMeasuredState();
        r0 = android.view.View.combineMeasuredStates(r10, r0);
        r3 = r1;
        r1 = r2;
        r2 = r0;
        goto L_0x0371;
    L_0x0360:
        r28 = r4;
        r29 = r5;
        r25 = r9;
        r26 = r10;
        r27 = r11;
        r23 = 1;
        r24 = 0;
        r9 = r1;
        r10 = r2;
        r11 = r3;
    L_0x0371:
        r4 = r28 + 1;
        r9 = r25;
        r10 = r26;
        r11 = r27;
        r5 = r29;
        r7 = 0;
        r8 = 1;
        goto L_0x023d;
    L_0x037f:
        r9 = r1;
        r10 = r2;
        r11 = r3;
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r10;
        r7 = r31;
        r0 = android.view.View.resolveSizeAndState(r11, r7, r0);
        r1 = r10 << 16;
        r8 = r32;
        r1 = android.view.View.resolveSizeAndState(r9, r8, r1);
        r6.setMeasuredDimension(r0, r1);
        return;
    L_0x0397:
        r7 = r31;
        r8 = r32;
        r24 = 0;
        r1 = r4.b;
        r1 = r1.b(r0);
        r2 = r4.c;
        r9 = r4.d;
        r4.a(r1, r2, r9);
        r0 = r0 + 1;
        r7 = 0;
        goto L_0x0180;
    L_0x03af:
        r7 = r31;
        r8 = r32;
        r24 = 0;
        r3 = r0.b;
        r3 = r3.c(r2);
        r3 = (java.util.ArrayList) r3;
        if (r3 == 0) goto L_0x03c7;
    L_0x03bf:
        r3.clear();
        r4 = r0.a;
        r4.a(r3);
    L_0x03c7:
        r2 = r2 + 1;
        r7 = 0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void b(View view, int i) {
        auy auy = (auy) view.getLayoutParams();
        View view2 = auy.k;
        Rect a;
        if (view2 == null && auy.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            a = a();
            try {
                ave.a((ViewGroup) this, view2, a2);
                auy auy2 = (auy) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                a(i, a2, a, auy2, measuredWidth, measuredHeight);
                a(auy2, a, measuredWidth, measuredHeight);
                view.layout(a.left, a.top, a.right, a.bottom);
            } finally {
                a(a2);
                a(a);
            }
        } else {
            int i2 = auy.e;
            if (i2 >= 0) {
                auy auy3 = (auy) view.getLayoutParams();
                int absoluteGravity = Gravity.getAbsoluteGravity(d(auy3.c), i);
                int i3 = absoluteGravity & 7;
                absoluteGravity &= 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i2 = width - i2;
                }
                i = b(i2) - measuredWidth2;
                if (i3 == 1) {
                    i += measuredWidth2 / 2;
                } else if (i3 == 5) {
                    i += measuredWidth2;
                }
                i2 = absoluteGravity != 16 ? absoluteGravity != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
                i = Math.max(getPaddingLeft() + auy3.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth2) - auy3.rightMargin));
                i2 = Math.max(getPaddingTop() + auy3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - auy3.bottomMargin));
                view.layout(i, i2, measuredWidth2 + i, measuredHeight2 + i2);
                return;
            }
            auy = (auy) view.getLayoutParams();
            a = a();
            a.set(getPaddingLeft() + auy.leftMargin, getPaddingTop() + auy.topMargin, (getWidth() - getPaddingRight()) - auy.rightMargin, (getHeight() - getPaddingBottom()) - auy.bottomMargin);
            if (!(this.c == null || !abe.v(this) || abe.v(view))) {
                a.left += this.c.a();
                a.top += this.c.b();
                a.right -= this.c.c();
                a.bottom -= this.c.d();
            }
            Rect a3 = a();
            Gravity.apply(c(auy.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a3, i);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
            a(a);
            a(a3);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int g = abe.g(this);
        i = this.k.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.k.get(i2);
            if (view.getVisibility() != 8) {
                aux aux = ((auy) view.getLayoutParams()).a;
                if (aux == null || !aux.a(this, view, g)) {
                    b(view, g);
                }
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d && this.v != null) {
            abx abx = this.c;
            int b = abx != null ? abx.b() : 0;
            if (b > 0) {
                this.v.setBounds(0, 0, getWidth(), b);
                this.v.draw(canvas);
            }
        }
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        b();
    }

    private final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ave.a((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i, Rect rect, Rect rect2, auy auy, int i2, int i3) {
        int height;
        int i4 = auy.c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = Gravity.getAbsoluteGravity(i4, i);
        i = Gravity.getAbsoluteGravity(c(auy.d), i);
        int i5 = i4 & 7;
        i4 &= 112;
        int i6 = i & 112;
        i &= 7;
        if (i == 1) {
            i = rect.left + (rect.width() / 2);
        } else if (i != 5) {
            i = rect.left;
        } else {
            i = rect.right;
        }
        if (i6 == 16) {
            height = (rect.height() / 2) + rect.top;
        } else if (i6 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i5 == 1) {
            i -= i2 / 2;
        } else if (i5 != 5) {
            i -= i2;
        }
        if (i4 == 16) {
            height -= i3 / 2;
        } else if (i4 != 80) {
            height -= i3;
        }
        rect2.set(i, height, i2 + i, i3 + height);
    }

    private final void a(auy auy, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + auy.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - auy.rightMargin));
        int max = Math.max(getPaddingTop() + auy.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - auy.bottomMargin));
        rect.set(width, max, i + width, i2 + max);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288  */
    public final void a(int r25) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r8 = defpackage.abe.g(r24);
        r2 = r0.k;
        r9 = r2.size();
        r10 = a();
        r11 = a();
        r12 = a();
        r14 = 0;
    L_0x001b:
        if (r14 >= r9) goto L_0x02c4;
    L_0x001d:
        r2 = r0.k;
        r2 = r2.get(r14);
        r15 = r2;
        r15 = (android.view.View) r15;
        r2 = r15.getLayoutParams();
        r7 = r2;
        r7 = (defpackage.auy) r7;
        if (r1 != 0) goto L_0x003e;
    L_0x002f:
        r2 = r15.getVisibility();
        r3 = 8;
        if (r2 != r3) goto L_0x003e;
    L_0x0037:
        r4 = r9;
        r5 = r12;
        r18 = r14;
        r2 = 0;
        goto L_0x02be;
    L_0x003e:
        r6 = 0;
    L_0x003f:
        if (r6 >= r14) goto L_0x00eb;
    L_0x0041:
        r2 = r0.k;
        r2 = r2.get(r6);
        r2 = (android.view.View) r2;
        r3 = r7.l;
        if (r3 != r2) goto L_0x00d5;
    L_0x004d:
        r2 = r15.getLayoutParams();
        r4 = r2;
        r4 = (defpackage.auy) r4;
        r2 = r4.k;
        if (r2 == 0) goto L_0x00d5;
    L_0x0058:
        r3 = a();
        r2 = a();
        r13 = a();
        r5 = r4.k;
        defpackage.ave.a(r0, r5, r3);
        r5 = 0;
        r0.a(r15, r5, r2);
        r5 = r15.getMeasuredWidth();
        r17 = r9;
        r9 = r15.getMeasuredHeight();
        r18 = r14;
        r14 = r2;
        r2 = r8;
        r19 = r3;
        r20 = r4;
        r4 = r13;
        r21 = r5;
        r16 = r12;
        r12 = 1;
        r5 = r20;
        r22 = r6;
        r6 = r21;
        r23 = r7;
        r7 = r9;
        a(r2, r3, r4, r5, r6, r7);
        r2 = r13.left;
        r3 = r14.left;
        if (r2 != r3) goto L_0x00a4;
    L_0x0097:
        r2 = r13.top;
        r3 = r14.top;
        if (r2 == r3) goto L_0x009e;
    L_0x009d:
        goto L_0x00a4;
    L_0x009e:
        r2 = r20;
        r3 = r21;
        r12 = 0;
        goto L_0x00a8;
    L_0x00a4:
        r2 = r20;
        r3 = r21;
    L_0x00a8:
        r0.a(r2, r13, r3, r9);
        r3 = r13.left;
        r4 = r14.left;
        r3 = r3 - r4;
        r4 = r13.top;
        r5 = r14.top;
        r4 = r4 - r5;
        if (r3 == 0) goto L_0x00ba;
    L_0x00b7:
        defpackage.abe.e(r15, r3);
    L_0x00ba:
        if (r4 == 0) goto L_0x00bf;
    L_0x00bc:
        defpackage.abe.d(r15, r4);
    L_0x00bf:
        if (r12 != 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00cb;
    L_0x00c2:
        r3 = r2.a;
        if (r3 == 0) goto L_0x00cb;
    L_0x00c6:
        r2 = r2.k;
        r3.a(r0, r15, r2);
    L_0x00cb:
        a(r19);
        a(r14);
        a(r13);
        goto L_0x00df;
    L_0x00d5:
        r22 = r6;
        r23 = r7;
        r17 = r9;
        r16 = r12;
        r18 = r14;
    L_0x00df:
        r6 = r22 + 1;
        r12 = r16;
        r9 = r17;
        r14 = r18;
        r7 = r23;
        goto L_0x003f;
    L_0x00eb:
        r23 = r7;
        r17 = r9;
        r16 = r12;
        r18 = r14;
        r12 = 1;
        r0.a(r15, r12, r11);
        r2 = r23;
        r3 = r2.g;
        r4 = 5;
        r5 = 3;
        r6 = 80;
        r7 = 48;
        if (r3 == 0) goto L_0x0151;
    L_0x0103:
        r3 = r11.isEmpty();
        if (r3 != 0) goto L_0x0151;
    L_0x0109:
        r3 = r2.g;
        r3 = android.view.Gravity.getAbsoluteGravity(r3, r8);
        r9 = r3 & 112;
        if (r9 == r7) goto L_0x0126;
    L_0x0113:
        if (r9 == r6) goto L_0x0116;
    L_0x0115:
        goto L_0x0130;
    L_0x0116:
        r9 = r10.bottom;
        r13 = r24.getHeight();
        r14 = r11.top;
        r13 = r13 - r14;
        r9 = java.lang.Math.max(r9, r13);
        r10.bottom = r9;
        goto L_0x0130;
    L_0x0126:
        r9 = r10.top;
        r13 = r11.bottom;
        r9 = java.lang.Math.max(r9, r13);
        r10.top = r9;
    L_0x0130:
        r3 = r3 & 7;
        if (r3 == r5) goto L_0x0147;
    L_0x0134:
        if (r3 == r4) goto L_0x0137;
    L_0x0136:
        goto L_0x0151;
    L_0x0137:
        r3 = r10.right;
        r9 = r24.getWidth();
        r13 = r11.left;
        r9 = r9 - r13;
        r3 = java.lang.Math.max(r3, r9);
        r10.right = r3;
        goto L_0x0151;
    L_0x0147:
        r3 = r10.left;
        r9 = r11.right;
        r3 = java.lang.Math.max(r3, r9);
        r10.left = r3;
    L_0x0151:
        r2 = r2.h;
        if (r2 == 0) goto L_0x025a;
    L_0x0155:
        r2 = r15.getVisibility();
        if (r2 != 0) goto L_0x025a;
    L_0x015b:
        r2 = defpackage.abe.D(r15);
        if (r2 == 0) goto L_0x025a;
    L_0x0161:
        r2 = r15.getWidth();
        if (r2 <= 0) goto L_0x025a;
    L_0x0167:
        r2 = r15.getHeight();
        if (r2 <= 0) goto L_0x025a;
    L_0x016d:
        r2 = r15.getLayoutParams();
        r2 = (defpackage.auy) r2;
        r3 = r2.a;
        r9 = a();
        r13 = a();
        r14 = r15.getLeft();
        r12 = r15.getTop();
        r4 = r15.getRight();
        r5 = r15.getBottom();
        r13.set(r14, r12, r4, r5);
        if (r3 == 0) goto L_0x01c6;
    L_0x0192:
        r3 = r3.a(r15, r9);
        if (r3 == 0) goto L_0x01c6;
    L_0x0198:
        r3 = r13.contains(r9);
        if (r3 == 0) goto L_0x019f;
    L_0x019e:
        goto L_0x01c9;
    L_0x019f:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Rect should be within the child's bounds. Rect:";
        r2.append(r3);
        r3 = r9.toShortString();
        r2.append(r3);
        r3 = " | Bounds:";
        r2.append(r3);
        r3 = r13.toShortString();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x01c6:
        r9.set(r13);
    L_0x01c9:
        a(r13);
        r3 = r9.isEmpty();
        if (r3 == 0) goto L_0x01d7;
    L_0x01d2:
        a(r9);
        goto L_0x025a;
    L_0x01d7:
        r3 = r2.h;
        r3 = android.view.Gravity.getAbsoluteGravity(r3, r8);
        r4 = r3 & 48;
        if (r4 != r7) goto L_0x01f5;
    L_0x01e1:
        r4 = r9.top;
        r5 = r2.topMargin;
        r4 = r4 - r5;
        r5 = r2.j;
        r4 = r4 - r5;
        r5 = r10.top;
        if (r4 >= r5) goto L_0x01f5;
    L_0x01ed:
        r5 = r10.top;
        r5 = r5 - r4;
        d(r15, r5);
        r4 = 1;
        goto L_0x01f6;
    L_0x01f5:
        r4 = 0;
    L_0x01f6:
        r5 = r3 & 80;
        if (r5 != r6) goto L_0x0212;
    L_0x01fa:
        r5 = r24.getHeight();
        r6 = r9.bottom;
        r5 = r5 - r6;
        r6 = r2.bottomMargin;
        r5 = r5 - r6;
        r6 = r2.j;
        r5 = r5 + r6;
        r6 = r10.bottom;
        if (r5 >= r6) goto L_0x0212;
    L_0x020b:
        r4 = r10.bottom;
        r5 = r5 - r4;
        d(r15, r5);
        goto L_0x0218;
    L_0x0212:
        if (r4 != 0) goto L_0x0218;
    L_0x0214:
        r4 = 0;
        d(r15, r4);
    L_0x0218:
        r4 = r3 & 3;
        r5 = 3;
        if (r4 != r5) goto L_0x0231;
    L_0x021d:
        r4 = r9.left;
        r5 = r2.leftMargin;
        r4 = r4 - r5;
        r5 = r2.i;
        r4 = r4 - r5;
        r5 = r10.left;
        if (r4 >= r5) goto L_0x0231;
    L_0x0229:
        r5 = r10.left;
        r5 = r5 - r4;
        c(r15, r5);
        r4 = 1;
        goto L_0x0232;
    L_0x0231:
        r4 = 0;
    L_0x0232:
        r3 = r3 & 5;
        r5 = 5;
        if (r3 != r5) goto L_0x0250;
    L_0x0237:
        r3 = r24.getWidth();
        r5 = r9.right;
        r3 = r3 - r5;
        r5 = r2.rightMargin;
        r3 = r3 - r5;
        r2 = r2.i;
        r3 = r3 + r2;
        r2 = r10.right;
        if (r3 >= r2) goto L_0x0250;
    L_0x0248:
        r2 = r10.right;
        r3 = r3 - r2;
        c(r15, r3);
        r2 = 0;
        goto L_0x0256;
    L_0x0250:
        r2 = 0;
        if (r4 != 0) goto L_0x0256;
    L_0x0253:
        c(r15, r2);
    L_0x0256:
        a(r9);
        goto L_0x025b;
    L_0x025a:
        r2 = 0;
    L_0x025b:
        r3 = 2;
        if (r1 == r3) goto L_0x0280;
    L_0x025e:
        r4 = r15.getLayoutParams();
        r4 = (defpackage.auy) r4;
        r4 = r4.o;
        r5 = r16;
        r5.set(r4);
        r4 = r5.equals(r11);
        if (r4 != 0) goto L_0x027d;
    L_0x0271:
        r4 = r15.getLayoutParams();
        r4 = (defpackage.auy) r4;
        r4 = r4.o;
        r4.set(r11);
        goto L_0x0282;
    L_0x027d:
        r4 = r17;
        goto L_0x02be;
    L_0x0280:
        r5 = r16;
    L_0x0282:
        r14 = r18 + 1;
        r4 = r17;
    L_0x0286:
        if (r14 >= r4) goto L_0x02be;
    L_0x0288:
        r6 = r0.k;
        r6 = r6.get(r14);
        r6 = (android.view.View) r6;
        r7 = r6.getLayoutParams();
        r7 = (defpackage.auy) r7;
        r9 = r7.a;
        if (r9 != 0) goto L_0x029c;
    L_0x029a:
        r9 = 1;
        goto L_0x02bb;
    L_0x029c:
        r12 = r9.a_(r15);
        if (r12 == 0) goto L_0x029a;
    L_0x02a2:
        if (r1 == 0) goto L_0x02a5;
    L_0x02a4:
        goto L_0x02ad;
    L_0x02a5:
        r12 = r7.n;
        if (r12 == 0) goto L_0x02ad;
    L_0x02a9:
        r7.a();
        goto L_0x029a;
    L_0x02ad:
        if (r1 == r3) goto L_0x02b5;
    L_0x02af:
        r6 = r9.a(r0, r6, r15);
    L_0x02b3:
        r9 = 1;
        goto L_0x02b7;
    L_0x02b5:
        r6 = 1;
        goto L_0x02b3;
    L_0x02b7:
        if (r1 != r9) goto L_0x02bb;
    L_0x02b9:
        r7.n = r6;
    L_0x02bb:
        r14 = r14 + 1;
        goto L_0x0286;
    L_0x02be:
        r14 = r18 + 1;
        r9 = r4;
        r12 = r5;
        goto L_0x001b;
    L_0x02c4:
        r5 = r12;
        a(r10);
        a(r11);
        a(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.a(int):void");
    }

    private static void c(View view, int i) {
        auy auy = (auy) view.getLayoutParams();
        int i2 = auy.i;
        if (i2 != i) {
            abe.e(view, i - i2);
            auy.i = i;
        }
    }

    private static void d(View view, int i) {
        auy auy = (auy) view.getLayoutParams();
        int i2 = auy.j;
        if (i2 != i) {
            abe.d(view, i - i2);
            auy.j = i;
        }
    }

    public final void a(View view) {
        List b = this.a.b(view);
        if (b != null && !b.isEmpty()) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                aux aux = ((auy) view2.getLayoutParams()).a;
                if (aux != null) {
                    aux.a(this, view2, view);
                }
            }
        }
    }

    public final List b(View view) {
        avf avf = this.a;
        int i = avf.b.b;
        Collection collection = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) avf.b.c(i2);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    collection = new ArrayList();
                }
                collection.add(avf.b.b(i2));
            }
        }
        this.b.clear();
        if (collection != null) {
            this.b.addAll(collection);
        }
        return this.b;
    }

    public final boolean a(View view, int i, int i2) {
        Rect a = a();
        ave.a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            a(a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof auy) && super.checkLayoutParams(layoutParams);
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    public final boolean a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                auy auy = (auy) childAt.getLayoutParams();
                aux aux = auy.a;
                if (aux == null) {
                    auy.a(i3, false);
                } else {
                    boolean a = aux.a(this, childAt, view, view2, i, i2);
                    int i6 = i4 | a;
                    auy.a(i3, a);
                    i4 = i6;
                }
            }
        }
        if (i4 != 0) {
            return true;
        }
        return false;
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    public final void b(View view, View view2, int i, int i2) {
        this.x.a(i, i2);
        this.s = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public final void onStopNestedScroll(View view) {
        a(view, 0);
    }

    public final void a(View view, int i) {
        this.x.b(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            auy auy = (auy) childAt.getLayoutParams();
            if (auy.a(i)) {
                aux aux = auy.a;
                if (aux != null) {
                    aux.a(this, childAt, view, i);
                }
                auy.a(i, false);
                auy.a();
            }
        }
        this.s = null;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(view, i, i2, i3, i4, 0);
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.n);
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int childCount = getChildCount();
        Object obj = null;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                auy auy = (auy) childAt.getLayoutParams();
                if (auy.a(i5)) {
                    aux aux = auy.a;
                    if (aux != null) {
                        int min;
                        int min2;
                        int[] iArr2 = this.m;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        aux.a(this, childAt, i2, i3, i4, i5, iArr2);
                        if (i3 <= 0) {
                            min = Math.min(i6, this.m[0]);
                        } else {
                            min = Math.max(i6, this.m[0]);
                        }
                        if (i4 <= 0) {
                            min2 = Math.min(i7, this.m[1]);
                        } else {
                            min2 = Math.max(i7, this.m[1]);
                        }
                        i6 = min;
                        i7 = min2;
                        obj = 1;
                    }
                }
            } else {
                int i9 = i5;
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (obj != null) {
            a(1);
        }
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        a(view, i, i2, iArr, 0);
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                auy auy = (auy) childAt.getLayoutParams();
                if (auy.a(i3)) {
                    aux aux = auy.a;
                    if (aux != null) {
                        int min;
                        int min2;
                        int[] iArr2 = this.m;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        aux.a(this, childAt, view, i2, iArr2, i3);
                        if (i <= 0) {
                            min = Math.min(i4, this.m[0]);
                        } else {
                            min = Math.max(i4, this.m[0]);
                        }
                        if (i2 <= 0) {
                            min2 = Math.min(i5, this.m[1]);
                        } else {
                            min2 = Math.max(i5, this.m[1]);
                        }
                        i4 = min;
                        i5 = min2;
                        obj = 1;
                    }
                }
            } else {
                int i7 = i3;
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            a(1);
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                auy auy = (auy) childAt.getLayoutParams();
                if (auy.a(0)) {
                    aux aux = auy.a;
                    if (aux != null) {
                        i |= aux.b(f2);
                    }
                }
            }
        }
        if (i == 0) {
            return false;
        }
        a(1);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                auy auy = (auy) childAt.getLayoutParams();
                if (auy.a(0)) {
                    aux aux = auy.a;
                    if (aux != null) {
                        i |= aux.a(view, f2);
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ava) {
            ava ava = (ava) parcelable;
            super.onRestoreInstanceState(ava.g);
            SparseArray sparseArray = ava.a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                aux aux = c(childAt).a;
                if (!(id == -1 || aux == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        aux.a(childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        ava ava = new ava(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aux aux = ((auy) childAt.getLayoutParams()).a;
            if (!(id == -1 || aux == null)) {
                Parcelable c = aux.c(childAt);
                if (c != null) {
                    sparseArray.append(id, c);
                }
            }
        }
        ava.a = sparseArray;
        return ava;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aux aux = ((auy) view.getLayoutParams()).a;
        if (aux == null || !aux.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private final void b() {
        if (VERSION.SDK_INT >= 21) {
            if (abe.v(this)) {
                if (this.w == null) {
                    this.w = new auv(this);
                }
                abe.a((View) this, this.w);
                setSystemUiVisibility(1280);
                return;
            }
            abe.a((View) this, null);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new auy();
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            i = new avc();
        } else {
            i = null;
        }
    }
}
