package android.support.design.internal;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.gr;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] b = new int[]{16842912};
    public boolean a;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        abe.a((View) this, new gr(this));
    }

    public final void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public final boolean isChecked() {
        return this.a;
    }

    public final void toggle() {
        setChecked(this.a ^ 1);
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + b.length), b);
        }
        return super.onCreateDrawableState(i);
    }
}
