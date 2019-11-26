package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.vze;

public class AdCountdownTextView extends YouTubeTextView {
    public int a = -1;

    public AdCountdownTextView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Theme theme = context.getTheme();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, vze.a, i, i2);
            if (obtainStyledAttributes.hasValue(vze.b)) {
                this.a = obtainStyledAttributes.getInt(vze.b, -1);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
