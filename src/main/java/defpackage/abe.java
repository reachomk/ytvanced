package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: abe */
public final class abe {
    private static Method a;
    private static Method b;
    private static boolean c;
    private static WeakHashMap d;
    private static WeakHashMap e = null;
    private static Field f;
    private static boolean g = false;
    private static ThreadLocal h;

    private static Rect a() {
        if (h == null) {
            h = new ThreadLocal();
        }
        Rect rect = (Rect) h.get();
        if (rect == null) {
            rect = new Rect();
            h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @Deprecated
    public static boolean a(View view, int i) {
        return view.canScrollVertically(-1);
    }

    public static void a(View view, aca aca) {
        view.onInitializeAccessibilityNodeInfo(aca.a);
    }

    public static void a(View view, aaj aaj) {
        if (aaj == null && (abe.c(view) instanceof aai)) {
            aaj = new aaj();
        }
        view.setAccessibilityDelegate(aaj != null ? aaj.a : null);
    }

    public static int a(View view) {
        if (VERSION.SDK_INT < 26) {
            return 0;
        }
        return view.getImportantForAutofill();
    }

    public static void b(View view) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static AccessibilityDelegate c(View view) {
        if (!g) {
            if (f == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    g = true;
                    return null;
                }
            }
            try {
                Object obj = f.get(view);
                if (obj instanceof AccessibilityDelegate) {
                    return (AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                g = true;
            }
        }
        return null;
    }

    public static boolean d(View view) {
        return view.hasTransientState();
    }

    public static void a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void e(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int f(View view) {
        return view.getImportantForAccessibility();
    }

    public static void b(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static int g(View view) {
        return view.getLayoutDirection();
    }

    public static void h(View view) {
        view.setLayoutDirection(0);
    }

    public static int i(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static void c(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static int j(View view) {
        return view.getPaddingStart();
    }

    public static int k(View view) {
        return view.getPaddingEnd();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    private static void b() {
        try {
            a = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            b = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        c = true;
    }

    public static void l(View view) {
        if (VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!c) {
            abe.b();
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void m(View view) {
        if (VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!c) {
            abe.b();
        }
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static int n(View view) {
        return view.getMinimumWidth();
    }

    public static int o(View view) {
        return view.getMinimumHeight();
    }

    public static abr p(View view) {
        if (e == null) {
            e = new WeakHashMap();
        }
        abr abr = (abr) e.get(view);
        if (abr != null) {
            return abr;
        }
        abr = new abr(view);
        e.put(view, abr);
        return abr;
    }

    @Deprecated
    public static void a(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    public static void b(View view, float f) {
        view.setAlpha(f);
    }

    @Deprecated
    public static void c(View view, float f) {
        view.setScaleX(f);
    }

    public static void d(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static float q(View view) {
        if (VERSION.SDK_INT < 21) {
            return 0.0f;
        }
        return view.getElevation();
    }

    public static void e(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    public static float r(View view) {
        if (VERSION.SDK_INT < 21) {
            return 0.0f;
        }
        return view.getTranslationZ();
    }

    public static void a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (d == null) {
            d = new WeakHashMap();
        }
        d.put(view, str);
    }

    public static String s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap weakHashMap = d;
        return weakHashMap != null ? (String) weakHashMap.get(view) : null;
    }

    public static int t(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void u(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void a(View view, aba aba) {
        if (VERSION.SDK_INT < 21) {
            return;
        }
        if (aba != null) {
            view.setOnApplyWindowInsetsListener(new abh(aba));
        } else {
            view.setOnApplyWindowInsetsListener(null);
        }
    }

    public static abx a(View view, abx abx) {
        if (VERSION.SDK_INT < 21) {
            return abx;
        }
        Object obj = (WindowInsets) abx.a(abx);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
        if (!onApplyWindowInsets.equals(obj)) {
            obj = new WindowInsets(onApplyWindowInsets);
        }
        return abx.a(obj);
    }

    public static abx b(View view, abx abx) {
        if (VERSION.SDK_INT < 21) {
            return abx;
        }
        Object obj = (WindowInsets) abx.a(abx);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
        if (!dispatchApplyWindowInsets.equals(obj)) {
            obj = new WindowInsets(dispatchApplyWindowInsets);
        }
        return abx.a(obj);
    }

    public static boolean w(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean x(View view) {
        return view.isPaddingRelative();
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList y(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof abf ? ((abf) view).getSupportBackgroundTintList() : null;
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = 1;
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    obj = null;
                }
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof abf) {
            ((abf) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static Mode z(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof abf ? ((abf) view).getSupportBackgroundTintMode() : null;
    }

    public static void a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = 1;
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    obj = null;
                }
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof abf) {
            ((abf) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static boolean A(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        return view instanceof aau ? ((aau) view).isNestedScrollingEnabled() : false;
    }

    public static void B(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof aau) {
            ((aau) view).stopNestedScroll();
        }
    }

    public static boolean C(View view) {
        return view.isInLayout();
    }

    public static boolean D(View view) {
        return view.isLaidOut();
    }

    public static boolean E(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static float F(View view) {
        if (VERSION.SDK_INT < 21) {
            return 0.0f;
        }
        return view.getZ();
    }

    public static void f(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view = null;
            view.setZ(f);
        }
    }

    public static void d(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (VERSION.SDK_INT >= 21) {
            int intersects;
            Rect a = abe.a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            abe.g(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            abe.g(view, i);
        }
    }

    private static void g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            abe.N(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                abe.N((View) parent);
            }
        }
    }

    public static void e(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (VERSION.SDK_INT >= 21) {
            int intersects;
            Rect a = abe.a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            abe.h(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            abe.h(view, i);
        }
    }

    private static void h(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            abe.N(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                abe.N((View) parent);
            }
        }
    }

    private static void N(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static Rect G(View view) {
        return view.getClipBounds();
    }

    public static boolean H(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean I(View view) {
        return view.hasOnClickListeners();
    }

    public static void f(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    public static void a(View view, abc abc) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) abc.a);
        }
    }

    public static Display J(View view) {
        return view.getDisplay();
    }

    static boolean a(View view, KeyEvent keyEvent) {
        boolean z = false;
        if (VERSION.SDK_INT < 28) {
            abm a = abm.a(view);
            WeakReference weakReference = a.c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                a.c = new WeakReference(keyEvent);
                SparseArray a2 = a.a();
                WeakReference weakReference2 = null;
                if (keyEvent.getAction() == 1) {
                    int indexOfKey = a2.indexOfKey(keyEvent.getKeyCode());
                    if (indexOfKey >= 0) {
                        weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
                        a2.removeAt(indexOfKey);
                    }
                }
                if (weakReference2 == null) {
                    weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    view = (View) weakReference2.get();
                    if (view == null || !view.isAttachedToWindow()) {
                        z = true;
                    } else {
                        abm.b(view);
                        return true;
                    }
                }
            }
        }
        return z;
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 28) {
            abm a = abm.a(view);
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = a.b;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                if (!abm.a.isEmpty()) {
                    synchronized (abm.a) {
                        if (a.b == null) {
                            a.b = new WeakHashMap();
                        }
                        int size = abm.a.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            View view2 = (View) ((WeakReference) abm.a.get(size)).get();
                            if (view2 == null) {
                                abm.a.remove(size);
                            } else {
                                a.b.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    a.b.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
            view = a.a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (!(view == null || KeyEvent.isModifierKey(keyCode))) {
                    a.a().put(keyCode, new WeakReference(view));
                }
            }
            if (view != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(View view) {
        Boolean bool = (Boolean) new abg(Boolean.class).b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static CharSequence L(View view) {
        return (CharSequence) new abj(CharSequence.class).b(view);
    }

    static void M(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            CharSequence L = abe.L(view);
            if (view.getAccessibilityLiveRegion() != 0 || (L != null && view.getVisibility() == 0)) {
                int i = L == null ? 2048 : 32;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i);
                obtain.setContentChangeTypes(16);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 16);
                } catch (AbstractMethodError e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(view.getParent().getClass().getSimpleName());
                    stringBuilder.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", stringBuilder.toString(), e);
                }
            }
        }
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        abl abl = new abl();
    }
}
