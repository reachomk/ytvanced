package com.google.android.libraries.youtube.ads.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ala;
import defpackage.ra;
import defpackage.st;
import defpackage.wbx;
import defpackage.wbz;
import defpackage.xpr;

public class EditTextWithHelpIcon extends ala {
    public wbz a;
    private Context b;
    private View c;
    private Drawable d;
    private ImageView e;

    public EditTextWithHelpIcon(Context context) {
        super(context);
        this.b = context;
    }

    public EditTextWithHelpIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
    }

    public EditTextWithHelpIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = context;
    }

    public final void a(wbz wbz) {
        Drawable a = ra.a(this.b, (int) R.drawable.quantum_ic_help_outline_grey600_24);
        if (a != null) {
            a.mutate();
            a = st.d(a);
            st.a(a, getCurrentHintTextColor());
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        } else {
            a = null;
        }
        this.d = a;
        this.a = wbz;
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (this.c == null) {
            ViewParent parent = getParent();
            if (parent instanceof FrameLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                this.c = LayoutInflater.from(this.b).inflate(R.layout.text_input_images, viewGroup, false);
                this.e = (ImageView) this.c.findViewById(R.id.help_image);
                viewGroup.addView(this.c);
                a();
            } else {
                Log.e("EditTextWithHelpIcon", "Can't init image view. Must be a direct child of FrameLayout.");
                super.onMeasure(i, i2);
            }
        }
        int measuredWidth = this.c.getMeasuredWidth();
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setBounds(0, 0, measuredWidth, 1);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable, compoundDrawablesRelative[3]);
        if (getMinimumHeight() <= 0) {
            setMinimumHeight(abe.o(this.e));
        }
        super.onMeasure(i, i2);
    }

    private final void a() {
        View view = this.e;
        if (view != null) {
            xpr.a(view, this.d != null);
            this.e.setImageDrawable(this.d);
            if (this.a != null) {
                this.e.setOnClickListener(new wbx(this));
            }
        }
    }
}
