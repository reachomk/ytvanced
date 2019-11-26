package com.google.android.apps.youtube.app.common.ui.slimstatusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

public class SlimStatusBar extends FrameLayout {
    private TextView a;

    public SlimStatusBar(Context context) {
        super(context);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.text);
    }

    public final void a(int i) {
        this.a.setText(i);
    }
}
