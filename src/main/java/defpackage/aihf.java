package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* renamed from: aihf */
public final class aihf extends AccessibilityDelegate {
    private final /* synthetic */ aigy a;

    protected aihf(aigy aigy) {
        this.a = aigy;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(this.a.p());
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.a.p());
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (!super.performAccessibilityAction(view, i, bundle)) {
            if (i != 4096 && i != 8192) {
                return false;
            }
            aigy aigy;
            long g = this.a.g() / 20;
            if (i == 4096) {
                aigy = this.a;
                aigy.m = Math.min(aigy.l.c(), this.a.d() + g);
            } else {
                aigy = this.a;
                aigy.m = Math.max(aigy.l.e(), this.a.d() - g);
            }
            aigy = this.a;
            aigy.n.a(3, aigy.m);
            this.a.c();
            this.a.invalidate();
            view.sendAccessibilityEvent(4);
        }
        return true;
    }
}
