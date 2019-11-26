package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: hf */
public class hf extends ImageButton {
    public int d;

    public hf(Context context) {
        this(context, null);
    }

    public hf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public hf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }

    public final void setVisibility(int i) {
        a(i, true);
    }

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }
}
