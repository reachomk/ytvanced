package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/* renamed from: xnm */
public class xnm extends LinearLayout implements Checkable {
    private static final int[] a = new int[]{16842912};
    private boolean b = false;

    public xnm(Context context) {
        super(context);
    }

    public xnm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public xnm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public xnm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean isChecked() {
        return this.b;
    }

    public void setChecked(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    public final void toggle() {
        setChecked(this.b ^ 1);
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + a.length);
        if (this.b) {
            xnm.mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(RadioButton.class.getName());
        accessibilityEvent.setChecked(this.b);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.b);
    }
}
