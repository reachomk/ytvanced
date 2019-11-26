package defpackage;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: akyi */
final class akyi extends AccessibilityDelegate {
    private final /* synthetic */ akyk a;

    akyi(akyk akyk) {
        this.a = akyk;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.f);
    }
}
