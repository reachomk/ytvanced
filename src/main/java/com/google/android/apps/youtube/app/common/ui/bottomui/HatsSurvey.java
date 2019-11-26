package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ajqy;
import defpackage.aphg;
import defpackage.arml;
import defpackage.xpr;
import defpackage.xwe;
import java.util.List;

public class HatsSurvey extends GridLayout {
    public ViewGroup a;
    private TextView b;
    private View c;
    private TextView d;
    private View e;

    public HatsSurvey(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected */
    public boolean a() {
        return false;
    }

    public HatsSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.hats_survey_question);
        this.c = findViewById(R.id.hats_branding_logo);
        this.d = (TextView) findViewById(R.id.hats_submit_button);
        this.e = findViewById(R.id.hats_submit_button_spacing);
        this.a = (ViewGroup) findViewById(R.id.hats_survey_response);
    }

    public final void c(CharSequence charSequence) {
        xpr.a(this.b, charSequence);
    }

    public final void a(List list) {
        this.a.removeAllViews();
        int i = 0;
        while (i < list.size()) {
            this.a.addView((View) list.get(i));
            if (a() && i < list.size() - 1) {
                ViewGroup viewGroup = this.a;
                Space space = new Space(getContext());
                space.setLayoutParams(new LayoutParams(0, 0, 1.0f));
                viewGroup.addView(space);
            }
            i++;
        }
    }

    public final void a(aphg aphg, OnClickListener onClickListener) {
        boolean z = aphg != null;
        xpr.a(this.c, z);
        xpr.a(this.d, z);
        xpr.a(this.e, z);
        if (z) {
            TextView textView = this.d;
            arml arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            this.d.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        if (this.d.isClickable() != z) {
            this.d.setClickable(z);
            this.d.setTextColor(xwe.a(getContext(), !z ? R.attr.ytIconDisabled : R.attr.ytCallToAction));
        }
    }
}
