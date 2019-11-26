package defpackage;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

/* renamed from: acb */
public final class acb implements AccessibilityStateChangeListener {
    private final abz a;

    public acb(abz abz) {
        this.a = abz;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((acb) obj).a);
    }

    public final void onAccessibilityStateChanged(boolean z) {
        this.a.a(z);
    }
}
