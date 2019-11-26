package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.abr;

public class BrandInteractionView extends LinearLayout {
    public final int a;
    public ImageButton b;
    public ImageButton c;
    public LinearLayout d;
    public abr e;
    private final int f;
    private final int g;

    public BrandInteractionView(Context context) {
        super(context);
        Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(R.dimen.brand_interaction_cta_bottom_margin);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(R.dimen.brand_interaction_cta_bottom_margin);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(R.dimen.brand_interaction_cta_bottom_margin);
    }

    public BrandInteractionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Resources resources = context.getResources();
        this.a = resources.getInteger(17694722);
        this.f = resources.getDimensionPixelSize(R.dimen.brand_interaction_default_bottom_margin);
        this.g = resources.getDimensionPixelSize(R.dimen.brand_interaction_cta_bottom_margin);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        if (z || (z2 && z3)) {
            marginLayoutParams.bottomMargin = this.g;
        } else {
            marginLayoutParams.bottomMargin = this.f;
        }
        setLayoutParams(marginLayoutParams);
    }
}
