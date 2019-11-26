package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.xpr;

public class HatsHorizontalSurvey extends HatsSurvey {
    private TextView b;
    private TextView c;

    public HatsHorizontalSurvey(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsHorizontalSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.hats_low_text);
        this.c = (TextView) findViewById(R.id.hats_high_text);
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
        xpr.a(this.b, TextUtils.isEmpty(charSequence) ^ 1);
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
        xpr.a(this.c, TextUtils.isEmpty(charSequence) ^ 1);
    }
}
