package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.anm;
import defpackage.wgv;
import defpackage.wgw;

public class ImageGridRecyclerView extends RecyclerView {
    public anm T = new wgw(getContext());
    private int U;

    public ImageGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width);
        a(this.T);
        a(new wgv(context));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.T.a(Math.max(1, getMeasuredWidth() / this.U));
    }
}
