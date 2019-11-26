package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.anm;

public class MediaGridRecyclerView extends RecyclerView {
    private final int T;
    private final anm U = new anm(getContext(), 3);

    public MediaGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        a(this.U);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.U.a(Math.max(1, getMeasuredWidth() / this.T));
    }
}
