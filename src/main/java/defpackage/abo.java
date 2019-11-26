package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: abo */
public final class abo {
    @Deprecated
    public static boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof aaz) {
            return ((aaz) viewParent).a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                Object viewParent2;
                try {
                    viewParent2 = viewParent2.onStartNestedScroll(view, view2, i);
                    return viewParent2;
                } catch (AbstractMethodError e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(viewParent2);
                    stringBuilder.append(" does not implement interface method onStartNestedScroll");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            } else if (viewParent2 instanceof aaw) {
                return ((aaw) viewParent2).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof aaz) {
            ((aaz) viewParent).b(view, view2, i, i2);
        } else if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(viewParent);
                    stringBuilder.append(" does not implement interface method onNestedScrollAccepted");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            } else if (viewParent instanceof aaw) {
                ((aaw) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof aaz) {
            ((aaz) viewParent).a(view, i);
        } else if (i == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(viewParent);
                    stringBuilder.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            } else if (viewParent instanceof aaw) {
                ((aaw) viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof aay) {
            ((aay) viewParent2).a(view, i, i2, i3, i4, i5, iArr);
        } else {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (viewParent2 instanceof aaz) {
                ((aaz) viewParent2).a(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (VERSION.SDK_INT >= 21) {
                    try {
                        viewParent.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        Throwable th = e;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ViewParent ");
                        stringBuilder.append(viewParent);
                        stringBuilder.append(" does not implement interface method onNestedScroll");
                        Log.e("ViewParentCompat", stringBuilder.toString(), th);
                    }
                } else if (viewParent2 instanceof aaw) {
                    ((aaw) viewParent2).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof aaz) {
            ((aaz) viewParent).a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(viewParent);
                    stringBuilder.append(" does not implement interface method onNestedPreScroll");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            } else if (viewParent instanceof aaw) {
                ((aaw) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            Object viewParent2;
            try {
                viewParent2 = viewParent2.onNestedFling(view, f, f2, z);
                return viewParent2;
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent2);
                stringBuilder.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        } else {
            if (viewParent2 instanceof aaw) {
                return ((aaw) viewParent2).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            Object viewParent2;
            try {
                viewParent2 = viewParent2.onNestedPreFling(view, f, f2);
                return viewParent2;
            } catch (AbstractMethodError e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent2);
                stringBuilder.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        } else {
            if (viewParent2 instanceof aaw) {
                return ((aaw) viewParent2).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }
}
