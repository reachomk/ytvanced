package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.List;

/* renamed from: xrn */
public final class xrn {
    private static final amuw a = amuw.a((Object) "com.google.android.apps.userpanel", (Object) "com.google.android.apps.ads.amt.tvpresence");

    public static AccessibilityManager a(Context context) {
        return (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static boolean b(Context context) {
        return xrn.a(context).isTouchExplorationEnabled();
    }

    public static boolean c(Context context) {
        if (!xrn.b(context)) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = xrn.a(context).getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList != null) {
                for (AccessibilityServiceInfo id : enabledAccessibilityServiceList) {
                    String id2 = id.getId();
                    if (id2 != null && id2.startsWith("com.google")) {
                        amxo amxo = (amxo) a.iterator();
                        while (amxo.hasNext()) {
                            if (id2.startsWith((String) amxo.next())) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean a(Context context, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        return xrn.a(context).addAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    public static boolean b(Context context, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        return xrn.a(context).removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
    }

    public static void a(Context context, AccessibilityEvent accessibilityEvent) {
        xrn.a(context).sendAccessibilityEvent(accessibilityEvent);
    }

    public static void a(View view) {
        view.sendAccessibilityEvent(32);
    }

    public static void a(Context context, View view, CharSequence charSequence) {
        if (xrn.c(context)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(charSequence);
            obtain.setEnabled(true);
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(context.getPackageName());
            new acj(obtain).a.setSource(view);
            xrn.a(context, obtain);
        }
    }
}
