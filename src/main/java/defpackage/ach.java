package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: ach */
class ach extends AccessibilityNodeProvider {
    public final ace a;

    ach(ace ace) {
        this.a = ace;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        aca a = this.a.a(i);
        return a != null ? a.a : null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
