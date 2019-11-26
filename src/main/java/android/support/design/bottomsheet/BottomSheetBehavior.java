package android.support.design.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ado;
import defpackage.adt;
import defpackage.aux;
import defpackage.auy;
import defpackage.ex;
import defpackage.ey;
import defpackage.ez;
import defpackage.fa;
import defpackage.fb;
import defpackage.fc;
import defpackage.fk;
import defpackage.hl;
import defpackage.hu;
import defpackage.ia;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends aux {
    private boolean A;
    private int B;
    private boolean C;
    private int D;
    private VelocityTracker E;
    private int F;
    private Map G;
    private final adt H = new ey(this);
    public boolean a = true;
    public int b;
    public hu c;
    public ValueAnimator d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k = 4;
    public ado l;
    public int m;
    public WeakReference n;
    public WeakReference o;
    public fb p;
    public int q;
    public boolean r;
    private int s = 0;
    private float t;
    private boolean u;
    private int v;
    private boolean w;
    private ia x;
    private float y = 0.5f;
    private float z = -1.0f;

    public final void a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4, int[] iArr) {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.a);
        this.w = obtainStyledAttributes.hasValue(fk.k);
        if (obtainStyledAttributes.hasValue(fk.c)) {
            a(context, attributeSet, true, hl.a(context, obtainStyledAttributes, fk.c));
        } else {
            a(context, attributeSet, false, null);
        }
        this.d = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.d.setDuration(500);
        this.d.addUpdateListener(new ez(this));
        if (VERSION.SDK_INT >= 21) {
            this.z = obtainStyledAttributes.getDimension(fk.b, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(fk.h);
        if (peekValue == null || peekValue.data != -1) {
            a(obtainStyledAttributes.getDimensionPixelSize(fk.h, -1));
        } else {
            a(peekValue.data);
        }
        a(obtainStyledAttributes.getBoolean(fk.g, false));
        boolean z = obtainStyledAttributes.getBoolean(fk.e, true);
        if (this.a != z) {
            this.a = z;
            if (this.n != null) {
                c();
            }
            i = (this.a && this.k == 6) ? 3 : this.k;
            c(i);
        }
        this.j = obtainStyledAttributes.getBoolean(fk.j, false);
        this.s = obtainStyledAttributes.getInt(fk.i, 0);
        float f = obtainStyledAttributes.getFloat(fk.f, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.y = f;
        i = obtainStyledAttributes.getInt(fk.d, 0);
        if (i >= 0) {
            this.e = i;
            obtainStyledAttributes.recycle();
            this.t = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final Parcelable c(View view) {
        return new fa(BaseSavedState.EMPTY_STATE, this);
    }

    public final void a(View view, Parcelable parcelable) {
        fa faVar = (fa) parcelable;
        Parcelable parcelable2 = faVar.g;
        int i = this.s;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.b = faVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = faVar.c;
            }
            if (i == -1 || (i & 4) == 4) {
                this.i = faVar.d;
            }
            if (i == -1 || (i & 8) == 8) {
                this.j = faVar.e;
            }
        }
        i = faVar.a;
        if (i == 1 || i == 2) {
            this.k = 4;
        } else {
            this.k = i;
        }
    }

    public final void a(auy auy) {
        this.n = null;
        this.l = null;
    }

    public final void a_() {
        this.n = null;
        this.l = null;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (abe.v(coordinatorLayout) && !abe.v(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.w) {
            Drawable drawable = this.c;
            if (drawable != null) {
                abe.a(view, drawable);
            }
        }
        hu huVar = this.c;
        if (huVar != null) {
            float f = this.z;
            if (f == -1.0f) {
                f = abe.q(view);
            }
            huVar.b(f);
        }
        if (this.n == null) {
            this.v = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            this.n = new WeakReference(view);
        }
        if (this.l == null) {
            this.l = ado.a((ViewGroup) coordinatorLayout, this.H);
        }
        int top = view.getTop();
        coordinatorLayout.b(view, i);
        this.D = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.m = height;
        this.f = Math.max(0, height - view.getHeight());
        this.g = (int) (((float) this.m) * (1.0f - this.y));
        c();
        height = this.k;
        if (height == 3) {
            abe.d(view, b());
        } else if (height == 6) {
            abe.d(view, this.g);
        } else if (this.i && height == 5) {
            abe.d(view, this.m);
        } else if (height == 4) {
            abe.d(view, this.h);
        } else if (height == 1 || height == 2) {
            abe.d(view, top - view.getTop());
        }
        this.o = new WeakReference(d(view));
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                d();
            }
            if (this.E == null) {
                this.E = VelocityTracker.obtain();
            }
            this.E.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.F = (int) motionEvent.getY();
                if (this.k != 2) {
                    WeakReference weakReference = this.o;
                    View view3 = weakReference != null ? (View) weakReference.get() : null;
                    if (view3 != null && coordinatorLayout.a(view3, x, this.F)) {
                        this.q = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.r = true;
                    }
                }
                boolean z = this.q == -1 && !coordinatorLayout.a(view, x, this.F);
                this.A = z;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.r = false;
                this.q = -1;
                if (this.A) {
                    this.A = false;
                    return false;
                }
            }
            if (!this.A) {
                ado ado = this.l;
                if (ado != null && ado.a(motionEvent)) {
                    return true;
                }
            }
            WeakReference weakReference2 = this.o;
            if (weakReference2 != null) {
                view2 = (View) weakReference2.get();
            }
            return (actionMasked != 2 || view2 == null || this.A || this.k == 1 || coordinatorLayout.a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.l == null || Math.abs(((float) this.F) - motionEvent.getY()) <= ((float) this.l.a)) ? false : true;
        } else {
            this.A = true;
            return false;
        }
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == 1 && actionMasked == 0) {
            return true;
        }
        ado ado = this.l;
        if (ado != null) {
            ado.b(motionEvent);
        }
        if (actionMasked == 0) {
            d();
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        if (actionMasked == 2 && !this.A) {
            float abs = Math.abs(((float) this.F) - motionEvent.getY());
            ado = this.l;
            if (abs > ((float) ado.a)) {
                ado.a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return this.A ^ 1;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.B = 0;
        this.C = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
        if (i2 != 1) {
            WeakReference weakReference = this.o;
            if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
                i2 = view.getTop();
                int i3 = i2 - i;
                if (i > 0) {
                    if (i3 < b()) {
                        i2 -= b();
                        iArr[1] = i2;
                        abe.d(view, -i2);
                        c(3);
                    } else {
                        iArr[1] = i;
                        abe.d(view, -i);
                        c(1);
                    }
                } else if (i < 0 && !view2.canScrollVertically(-1)) {
                    int i4 = this.h;
                    if (i3 <= i4 || this.i) {
                        iArr[1] = i;
                        abe.d(view, -i);
                        c(1);
                    } else {
                        i2 -= i4;
                        iArr[1] = i2;
                        abe.d(view, -i2);
                        c(4);
                    }
                }
                d(view.getTop());
                this.B = i;
                this.C = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca  */
    public final void a(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7) {
        /*
        r3 = this;
        r4 = r5.getTop();
        r7 = r3.b();
        r0 = 3;
        if (r4 != r7) goto L_0x000f;
    L_0x000b:
        r3.c(r0);
        return;
    L_0x000f:
        r4 = r3.o;
        if (r4 == 0) goto L_0x00dd;
    L_0x0013:
        r4 = r4.get();
        if (r6 != r4) goto L_0x00dd;
    L_0x0019:
        r4 = r3.C;
        if (r4 == 0) goto L_0x00dd;
    L_0x001d:
        r4 = r3.B;
        r6 = 6;
        r7 = 4;
        if (r4 <= 0) goto L_0x002a;
    L_0x0023:
        r4 = r3.b();
    L_0x0027:
        r7 = 3;
        goto L_0x00be;
    L_0x002a:
        r4 = r3.i;
        if (r4 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0050;
    L_0x002f:
        r4 = r3.E;
        if (r4 == 0) goto L_0x0043;
    L_0x0033:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r3.t;
        r4.computeCurrentVelocity(r1, r2);
        r4 = r3.E;
        r1 = r3.q;
        r4 = r4.getYVelocity(r1);
        goto L_0x0044;
    L_0x0043:
        r4 = 0;
    L_0x0044:
        r4 = r3.b(r5, r4);
        if (r4 == 0) goto L_0x0050;
    L_0x004a:
        r4 = r3.m;
        r0 = 5;
        r7 = 5;
        goto L_0x00be;
    L_0x0050:
        r4 = r3.B;
        if (r4 != 0) goto L_0x009c;
    L_0x0054:
        r4 = r5.getTop();
        r1 = r3.a;
        if (r1 == 0) goto L_0x0073;
    L_0x005c:
        r6 = r3.f;
        r6 = r4 - r6;
        r6 = java.lang.Math.abs(r6);
        r1 = r3.h;
        r4 = r4 - r1;
        r4 = java.lang.Math.abs(r4);
        if (r6 >= r4) goto L_0x0070;
    L_0x006d:
        r4 = r3.f;
        goto L_0x0027;
    L_0x0070:
        r4 = r3.h;
        goto L_0x00be;
    L_0x0073:
        r1 = r3.g;
        if (r4 >= r1) goto L_0x0087;
    L_0x0077:
        r7 = r3.h;
        r7 = r4 - r7;
        r7 = java.lang.Math.abs(r7);
        if (r4 >= r7) goto L_0x0084;
    L_0x0081:
        r4 = r3.e;
        goto L_0x0027;
    L_0x0084:
        r4 = r3.g;
        goto L_0x00ba;
    L_0x0087:
        r0 = r4 - r1;
        r0 = java.lang.Math.abs(r0);
        r1 = r3.h;
        r4 = r4 - r1;
        r4 = java.lang.Math.abs(r4);
        if (r0 >= r4) goto L_0x0099;
    L_0x0096:
        r4 = r3.g;
        goto L_0x00ba;
    L_0x0099:
        r4 = r3.h;
        goto L_0x00be;
    L_0x009c:
        r4 = r3.a;
        if (r4 == 0) goto L_0x00a3;
    L_0x00a0:
        r4 = r3.h;
        goto L_0x00be;
    L_0x00a3:
        r4 = r5.getTop();
        r0 = r3.g;
        r0 = r4 - r0;
        r0 = java.lang.Math.abs(r0);
        r1 = r3.h;
        r4 = r4 - r1;
        r4 = java.lang.Math.abs(r4);
        if (r0 >= r4) goto L_0x00bc;
    L_0x00b8:
        r4 = r3.g;
    L_0x00ba:
        r7 = 6;
        goto L_0x00be;
    L_0x00bc:
        r4 = r3.h;
    L_0x00be:
        r6 = r3.l;
        r0 = r5.getLeft();
        r4 = r6.a(r5, r0, r4);
        if (r4 == 0) goto L_0x00d7;
    L_0x00ca:
        r4 = 2;
        r3.c(r4);
        r4 = new fc;
        r4.<init>(r3, r5, r7);
        defpackage.abe.a(r5, r4);
        goto L_0x00da;
    L_0x00d7:
        r3.c(r7);
    L_0x00da:
        r4 = 0;
        r3.C = r4;
    L_0x00dd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean a(View view, float f) {
        WeakReference weakReference = this.o;
        if (weakReference == null || view != weakReference.get() || this.k == 3) {
            return false;
        }
        return true;
    }

    public final void a(int i) {
        if (i != -1) {
            if (this.u || this.b != i) {
                this.u = false;
                this.b = Math.max(0, i);
            } else {
                return;
            }
        } else if (!this.u) {
            this.u = true;
        } else {
            return;
        }
        if (this.n != null) {
            c();
            if (this.k == 4) {
                View view = (View) this.n.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (!z && this.k == 5) {
                b(4);
            }
        }
    }

    public final void b(int i) {
        int i2 = this.k;
        if (i != i2) {
            WeakReference weakReference = this.n;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && parent.isLayoutRequested() && abe.H(view)) {
                        view.post(new ex(this, view, i));
                    } else {
                        b(view, i);
                    }
                }
                a(i, i2);
            } else if (i == 4 || i == 3 || (this.i && i == 5)) {
                this.k = i;
            }
        }
    }

    public final void c(int i) {
        int i2 = this.k;
        if (i2 != i) {
            this.k = i;
            WeakReference weakReference = this.n;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 6 || i == 3) {
                        b(true);
                    } else if (i == 5 || i == 4) {
                        b(false);
                    }
                    abe.b(view, 1);
                    view.sendAccessibilityEvent(32);
                    a(i, i2);
                    fb fbVar = this.p;
                    if (fbVar != null) {
                        fbVar.a(i);
                    }
                }
            }
        }
    }

    private final void a(int i, int i2) {
        if (this.c != null) {
            if (i == 3 && (i2 == 5 || i2 == 4)) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator != null && valueAnimator.getAnimatedFraction() == 1.0f) {
                    this.d.reverse();
                }
            }
            if (i == 1 && i2 == 3) {
                ValueAnimator valueAnimator2 = this.d;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }

    private final void c() {
        int max;
        if (this.u) {
            max = Math.max(this.v, this.m - ((this.D * 9) / 16));
        } else {
            max = this.b;
        }
        if (this.a) {
            this.h = Math.max(this.m - max, this.f);
        } else {
            this.h = this.m - max;
        }
    }

    private final void d() {
        this.q = -1;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
    }

    public final boolean b(View view, float f) {
        if (this.j) {
            return true;
        }
        if (view.getTop() < this.h || Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.h)) / ((float) this.b) <= 0.5f) {
            return false;
        }
        return true;
    }

    private final View d(View view) {
        if (!abe.A(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View d = d(viewGroup.getChildAt(i));
                    if (d != null) {
                        return d;
                    }
                }
            }
            view = null;
        }
        return view;
    }

    private final void a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.w) {
            this.x = new ia(context, attributeSet, R.attr.bottomSheetStyle, R.style.f665Widget.Design.BottomSheet.Modal);
            this.c = new hu(this.x);
            this.c.a(context);
            if (z && colorStateList != null) {
                this.c.a(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.c.setTint(typedValue.data);
        }
    }

    public final int b() {
        return !this.a ? this.e : this.f;
    }

    public final void b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.h;
        } else if (i == 6) {
            int i3 = this.g;
            if (this.a) {
                int i4 = this.f;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = b();
        } else if (this.i && i == 5) {
            i2 = this.m;
        } else {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Illegal state argument: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.l.a(view, view.getLeft(), i2)) {
            c(2);
            abe.a(view, new fc(this, view, i));
            return;
        }
        c(i);
    }

    public final void d(int i) {
        if (((View) this.n.get()) != null) {
            fb fbVar = this.p;
            if (fbVar == null) {
                return;
            }
            if (i > this.h) {
                fbVar.a();
            } else {
                fbVar.a();
            }
        }
    }

    public static BottomSheetBehavior b(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof auy) {
            aux aux = ((auy) layoutParams).a;
            if (aux instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) aux;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private final void b(boolean z) {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i = 0;
                if (z) {
                    if (this.G == null) {
                        this.G = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                while (i < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.n.get()) {
                        if (z) {
                            this.G.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            abe.b(childAt, 4);
                        } else {
                            Map map = this.G;
                            if (map != null && map.containsKey(childAt)) {
                                abe.b(childAt, ((Integer) this.G.get(childAt)).intValue());
                            }
                        }
                    }
                    i++;
                }
                if (!z) {
                    this.G = null;
                }
            }
        }
    }
}
