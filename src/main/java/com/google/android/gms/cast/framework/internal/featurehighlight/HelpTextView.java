package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.R;
import defpackage.quj;

public class HelpTextView extends LinearLayout {
    private TextView a;
    private TextView b;

    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View asView() {
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) quj.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view));
        this.b = (TextView) quj.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view));
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        a(this.a, charSequence);
        a(this.b, charSequence2);
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }
}
