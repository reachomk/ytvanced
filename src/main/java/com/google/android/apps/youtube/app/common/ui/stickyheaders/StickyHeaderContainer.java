package com.google.android.apps.youtube.app.common.ui.stickyheaders;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.flz;

public final class StickyHeaderContainer extends FrameLayout {
    public final RecyclerView a;

    public StickyHeaderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickyHeaderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, flz.a, i, 0);
        i = obtainStyledAttributes.getResourceId(0, R.layout.recycler_view);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(i, this);
        this.a = (RecyclerView) getChildAt(0);
    }
}
