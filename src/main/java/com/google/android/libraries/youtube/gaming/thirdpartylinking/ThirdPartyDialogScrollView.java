package com.google.android.libraries.youtube.gaming.thirdpartylinking;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import com.google.android.youtube.R;

public class ThirdPartyDialogScrollView extends ScrollView {
    public ThirdPartyDialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.third_party_link_scroll_height);
        setLayoutParams(layoutParams);
    }
}
