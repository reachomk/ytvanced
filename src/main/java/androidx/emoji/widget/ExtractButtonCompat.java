package androidx.emoji.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.Button;
import android.widget.TextView;
import defpackage.adl;

public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context) {
        super(context, null);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ExtractButtonCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
