package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ada */
public abstract class ada extends aaj {
    private static final Rect f = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, aocf.UNSET_ENUM_VALUE, aocf.UNSET_ENUM_VALUE);
    public final AccessibilityManager b;
    public final View c;
    public int d = aocf.UNSET_ENUM_VALUE;
    public int e = aocf.UNSET_ENUM_VALUE;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private adb k;
    private int l = aocf.UNSET_ENUM_VALUE;

    public ada(View view) {
        if (view != null) {
            this.c = view;
            this.b = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (abe.f(view) == 0) {
                abe.b(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public abstract int a(float f, float f2);

    public abstract void a(int i, aca aca);

    /* Access modifiers changed, original: protected */
    public void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    public abstract void a(List list);

    public abstract boolean c(int i, int i2);

    public ace a(View view) {
        if (this.k == null) {
            this.k = new adb(this);
        }
        return this.k;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.b.isEnabled() && this.b.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a = a(motionEvent.getX(), motionEvent.getY());
                d(a);
                if (a != aocf.UNSET_ENUM_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.l == aocf.UNSET_ENUM_VALUE) {
                return false;
            } else {
                d(aocf.UNSET_ENUM_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i, int i2) {
        if (i != aocf.UNSET_ENUM_VALUE && this.b.isEnabled()) {
            ViewParent parent = this.c.getParent();
            if (parent != null) {
                return abo.a(parent, this.c, b(i, i2));
            }
        }
        return false;
    }

    private final void d(int i) {
        int i2 = this.l;
        if (i2 != i) {
            this.l = i;
            a(i, 128);
            a(i2, 256);
        }
    }

    public final AccessibilityEvent b(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            aca a = a(i);
            obtain.getText().add(a.i());
            obtain.setContentDescription(a.j());
            obtain.setScrollable(a.g());
            obtain.setPassword(a.f());
            obtain.setEnabled(a.e());
            obtain.setChecked(a.c());
            a(i, obtain);
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(a.h());
            obtain.setSource(this.c, i);
            obtain.setPackageName(this.c.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.c.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    /* Access modifiers changed, original: final */
    public final aca a(int i) {
        int i2 = 0;
        aca a;
        int intValue;
        if (i == -1) {
            a = aca.a(this.c);
            abe.a(this.c, a);
            List arrayList = new ArrayList();
            a(arrayList);
            if (a.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            while (i2 < size) {
                View view = this.c;
                intValue = ((Integer) arrayList.get(i2)).intValue();
                if (VERSION.SDK_INT >= 16) {
                    a.a.addChild(view, intValue);
                }
                i2++;
            }
            return a;
        }
        aca a2 = aca.a();
        a2.g(true);
        a2.c(true);
        a2.a((CharSequence) "android.view.View");
        a2.b(f);
        a2.d(f);
        a2.b(this.c);
        a(i, a2);
        if (a2.i() == null && a2.j() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a2.a(this.h);
        if (this.h.equals(f)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        intValue = a2.b();
        if ((intValue & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((intValue & 128) == 0) {
            a2.a.setPackageName(this.c.getContext().getPackageName());
            a2.a.setSource(this.c, i);
            if (this.d == i) {
                a2.e(true);
                a2.a(128);
            } else {
                a2.e(false);
                a2.a(64);
            }
            boolean z = this.e == i;
            if (z) {
                a2.a(2);
            } else if (a2.d()) {
                a2.a(1);
            }
            a2.a.setFocused(z);
            this.c.getLocationOnScreen(this.j);
            a2.c(this.g);
            if (this.g.equals(f)) {
                a2.a(this.g);
                if (a2.b != -1) {
                    a = aca.a();
                    for (intValue = a2.b; intValue != -1; intValue = a.b) {
                        View view2 = this.c;
                        a.b = -1;
                        if (VERSION.SDK_INT >= 16) {
                            a.a.setParent(view2, -1);
                        }
                        a.b(f);
                        a(intValue, a);
                        a.a(this.h);
                        this.g.offset(this.h.left, this.h.top);
                    }
                    a.a.recycle();
                }
                this.g.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
            }
            if (this.c.getLocalVisibleRect(this.i)) {
                this.i.offset(this.j[0] - this.c.getScrollX(), this.j[1] - this.c.getScrollY());
                if (this.g.intersect(this.i)) {
                    a2.d(this.g);
                    Rect rect = this.g;
                    if (rect != null && !rect.isEmpty() && this.c.getWindowVisibility() == 0) {
                        ViewParent parent = this.c.getParent();
                        while (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= 0.0f || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        }
                        if (parent != null) {
                            a2.d(true);
                        }
                    }
                }
            }
            return a2;
        } else {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
    }

    public final boolean b(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = aocf.UNSET_ENUM_VALUE;
        this.c.invalidate();
        a(i, 65536);
        return true;
    }

    public final boolean c(int i) {
        if (this.e != i) {
            return false;
        }
        this.e = aocf.UNSET_ENUM_VALUE;
        a(i, 8);
        return true;
    }

    static {
        acz acz = new acz();
        adc adc = new adc();
    }
}
