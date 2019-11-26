package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;

public class AudioSwapTabsBar extends DefaultTabsBar {
    public ViewPager a;

    public AudioSwapTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b(int i, boolean z) {
        super.b(i, z);
        ViewPager viewPager = this.a;
        if (viewPager != null && z) {
            viewPager.a(i, true);
        }
    }
}
