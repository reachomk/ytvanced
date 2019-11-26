package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: acg */
final class acg extends ach {
    acg(ace ace) {
        super(ace);
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        aca b = this.a.b(i);
        return b != null ? b.a : null;
    }
}
