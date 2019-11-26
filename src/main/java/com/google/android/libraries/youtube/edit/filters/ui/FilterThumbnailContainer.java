package com.google.android.libraries.youtube.edit.filters.ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.zpb;

public class FilterThumbnailContainer extends FrameLayout {
    public FilterThumbnailContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new zpb(getResources().getDimension(R.dimen.camera_filter_preview_item_corner_radius)));
            setClipToOutline(true);
        }
    }
}
