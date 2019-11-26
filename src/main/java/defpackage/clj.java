package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: clj */
public final class clj {
    private static volatile boolean a = false;

    public static boolean a(Context context) {
        return clj.a((AccessibilityManager) context.getSystemService("accessibility"));
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        return Boolean.getBoolean("is_accessibility_enabled") || (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled());
    }

    public static synchronized void a() {
        synchronized (clj.class) {
            a = false;
        }
    }
}
