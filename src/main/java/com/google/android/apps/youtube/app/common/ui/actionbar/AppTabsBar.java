package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import defpackage.amqw;
import defpackage.xoe;

public class AppTabsBar extends DefaultTabsBar {
    public int a;
    public int b;

    public AppTabsBar(Context context) {
        super(context);
    }

    public AppTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, ColorStateList colorStateList) {
        super.a(view, colorStateList);
        if ((view instanceof ImageView) && this.f != null) {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(xoe.a(imageView.getDrawable(), colorStateList));
        }
    }

    public final void a(int i, int i2) {
        amqw.a(this.f);
        this.a = i;
        this.b = i2;
        a(this.f.a(i, i, i, i, i, i2));
    }
}
