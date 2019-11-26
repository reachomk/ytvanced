package defpackage;

import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

/* renamed from: jwb */
final /* synthetic */ class jwb implements AccessibilityStateChangeListener {
    private final jvz a;

    jwb(jvz jvz) {
        this.a = jvz;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        jvz jvz = this.a;
        jvz.j = z;
        if (z) {
            jvz.b();
        } else {
            jvz.a();
        }
    }
}
