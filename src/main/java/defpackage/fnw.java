package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fnw */
public final class fnw implements AccessibilityStateChangeListener {
    public final Context a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public boolean c;

    public fnw(Context context) {
        this.a = context;
    }

    public final void a(AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (!this.c) {
            xrn.a(this.a, (AccessibilityStateChangeListener) this);
            this.c = true;
        }
        this.b.add(accessibilityStateChangeListener);
    }

    public final void a() {
        boolean c = xrn.c(this.a);
        for (AccessibilityStateChangeListener onAccessibilityStateChanged : this.b) {
            onAccessibilityStateChanged.onAccessibilityStateChanged(c);
        }
    }

    public final void onAccessibilityStateChanged(boolean z) {
        a();
    }
}
