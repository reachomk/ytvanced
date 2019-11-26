package com.google.android.apps.youtube.app.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

public class DurationBadgeView extends YouTubeTextView {
    private static final int[] a = new int[]{R.attr.state_live};
    private int[] d;

    public DurationBadgeView(Context context) {
        this(context, null);
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        f();
    }

    private final void f() {
        setBackgroundResource(R.drawable.duration_background);
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        if (this.d != null) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), this.d);
        }
        return super.onCreateDrawableState(i);
    }

    public final void a() {
        int[] iArr = this.d;
        int[] iArr2 = a;
        if (iArr != iArr2) {
            this.d = iArr2;
            refreshDrawableState();
        }
    }

    public final void b() {
        if (this.d != null) {
            this.d = null;
            refreshDrawableState();
        }
    }
}
