package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class NoOverlapImageView extends ImageView {
    public NoOverlapImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public NoOverlapImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NoOverlapImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
