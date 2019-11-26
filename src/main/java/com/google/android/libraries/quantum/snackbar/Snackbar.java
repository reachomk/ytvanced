package com.google.android.libraries.quantum.snackbar;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ufc;
import defpackage.ufd;
import defpackage.ufm;
import defpackage.ufn;
import defpackage.ufo;

public class Snackbar extends LinearLayout implements ufd {
    public final TextView a;
    public int b;
    private final ufc c;
    private final TextView d;

    public Snackbar(Context context) {
        this(context, null);
    }

    public Snackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.snackbarStyle);
    }

    public Snackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ufc(this);
        this.b = 1;
        LayoutInflater.from(context).inflate(R.layout.snackbar, this);
        this.d = (TextView) findViewById(R.id.message);
        this.a = (TextView) findViewById(R.id.action);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ufm.a, i, R.style.Snackbar);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(ufm.c);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(ufm.b);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setBackgroundDrawable(drawable);
        if (colorStateList != null) {
            this.d.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.a.setTextColor(colorStateList2);
        }
    }

    public final boolean b() {
        return getVisibility() != 0;
    }

    public final void a(CharSequence charSequence) {
        a(charSequence, null, null);
    }

    public final void a(CharSequence charSequence, String str, OnClickListener onClickListener) {
        this.d.setText(charSequence);
        this.a.setText(str);
        this.a.setOnClickListener(onClickListener);
        this.a.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
        this.d.requestLayout();
    }

    public final void c() {
        ufc ufc = this.c;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{(float) getHeight(), 0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.addListener(new ufo(this));
        ufc.a();
        if (ufc.a.b()) {
            ufc.b = ofPropertyValuesHolder;
            ufc.b.start();
        }
    }

    public final void d() {
        ufc ufc = this.c;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, (float) getHeight()});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.addListener(new ufn(this));
        ufc.a();
        if (!ufc.a.b()) {
            ufc.b = ofPropertyValuesHolder;
            ufc.b.start();
        }
    }

    public static void a(Snackbar snackbar) {
        String trim = snackbar.d.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            Context context = snackbar.getContext();
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setClassName(Snackbar.class.getName());
                obtain.setPackageName(context.getPackageName());
                obtain.getText().add(trim);
                obtain.setEnabled(true);
                String trim2 = snackbar.a.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2)) {
                    obtain.getText().add(trim2);
                }
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
