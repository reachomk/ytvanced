package com.google.android.libraries.youtube.livecreation.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aclj;
import defpackage.acll;
import defpackage.xpr;

public class LiveCreationSettingView extends LinearLayout implements OnClickListener {
    public aclj a;
    private final TextView b;
    private final ImageView c;
    private final ImageView d;
    private final CharSequence e;

    public LiveCreationSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.lc_setting_view, this);
        Theme theme = context.getTheme();
        CharSequence charSequence = acll.c;
        CharSequence charSequence2 = 0;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, charSequence, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            this.e = obtainStyledAttributes.getText(0);
            charSequence = obtainStyledAttributes.getText(2);
            charSequence2 = obtainStyledAttributes.getText(3);
            this.b = (TextView) findViewById(R.id.setting_text);
            this.c = (ImageView) findViewById(R.id.set_setting_button);
            this.d = (ImageView) findViewById(R.id.clear_setting_button);
            this.b.setText(this.e);
            this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
            this.b.setOnClickListener(this);
            this.c.setOnClickListener(this);
            this.d.setOnClickListener(this);
            this.c.setContentDescription(charSequence);
            this.d.setContentDescription(charSequence2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence) ^ 1;
        TextView textView = this.b;
        if (!isEmpty) {
            charSequence = this.e;
        }
        textView.setText(charSequence);
        xpr.a(this.c, isEmpty ^ 1);
        xpr.a(this.d, isEmpty);
    }

    public final void onClick(View view) {
        aclj aclj;
        if (view == this.b || view == this.c) {
            aclj = this.a;
            if (aclj != null) {
                aclj.a();
            }
        } else if (view == this.d) {
            a(null);
            aclj = this.a;
            if (aclj != null) {
                aclj.b();
            }
        }
    }
}
