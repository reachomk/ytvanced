package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import defpackage.albc;
import defpackage.fbd;
import defpackage.fbe;
import defpackage.fbf;
import defpackage.fbg;
import defpackage.fbh;
import defpackage.fbi;
import defpackage.fbj;
import defpackage.fbk;
import defpackage.fbl;
import defpackage.fbm;
import defpackage.fbn;
import defpackage.fbq;
import defpackage.fbr;
import defpackage.fbt;
import defpackage.fbv;

public class BottomUiContainer extends FrameLayout {
    public fbq a;
    public Snackbar b;
    public Mealbar c;
    public View d;
    public View e;
    public Animator f;
    private fbn g;
    private HatsContainer h;
    private Runnable i;
    private fbv j;
    private boolean k;
    private int l;

    public static fbn a(albc albc, Object obj) {
        return new fbf(albc, obj);
    }

    public BottomUiContainer(Context context) {
        super(context);
        b();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public BottomUiContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }

    private final void b() {
        this.l = getVisibility();
        this.k = true;
    }

    public final HatsContainer a() {
        if (this.h == null) {
            this.h = (HatsContainer) a((int) R.layout.hats_survey_container);
        }
        return this.h;
    }

    public final View a(int i) {
        return a(getContext(), i);
    }

    public final View a(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, this, false);
    }

    public final void a(boolean z) {
        this.k = z;
        setVisibility(this.l);
    }

    public final void setVisibility(int i) {
        this.l = i;
        if (!this.k) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public final void a(View view, fbn fbn) {
        removeAllViews();
        this.d = view;
        this.g = fbn;
        if (view != null) {
            addView(view);
            if (view.getLayoutDirection() != getLayoutDirection()) {
                view.setLayoutDirection(getLayoutDirection());
            }
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    public final void a(fbr fbr, fbt fbt, fbn fbn) {
        b(4);
        Animator animator = this.f;
        if (animator == null) {
            b(fbr, fbt, fbn);
        } else {
            animator.addListener(new fbi(this, fbr, fbt, fbn));
        }
    }

    public final void b(fbr fbr, fbt fbt, fbn fbn) {
        if (this.j == null) {
            this.j = new fbe(this);
        }
        View a = fbt.a(fbr, this.j);
        a(a, fbn);
        if (a.getHeight() == 0) {
            a.addOnLayoutChangeListener(new fbh(this));
            a.setVisibility(0);
            return;
        }
        a(a);
    }

    public final void a(View view) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{(float) view.getHeight(), 0.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.addListener(new fbm(view));
        a(ofPropertyValuesHolder, view);
        a(ofPropertyValuesHolder);
        fbn fbn = this.g;
        if (fbn != null) {
            fbn.a();
        }
    }

    public final void b(int i) {
        View view = this.d;
        if (view != null && view != this.e) {
            fbn fbn = this.g;
            if (fbn != null) {
                fbn.a(i);
            }
            View view2 = this.d;
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, (float) view2.getHeight()});
            Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{ofFloat, ofFloat2});
            ofPropertyValuesHolder.addListener(new fbl(view2));
            a(ofPropertyValuesHolder, view2);
            this.f = ofPropertyValuesHolder;
            this.f.addListener(new fbk(this));
            a(this.f);
        }
    }

    private final void a(Animator animator) {
        if (this.k) {
            animator.start();
        } else {
            animator.end();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.i == null) {
            this.i = new fbd(this);
        }
        getHandler().post(this.i);
    }

    private final void a(Animator animator, View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        animator.addListener(new fbj(this, view, i));
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).addUpdateListener(new fbg(this, view, i));
        }
    }

    public static int a(View view, int i) {
        float height = (float) view.getHeight();
        float translationY = height - view.getTranslationY();
        return (int) (translationY + ((((float) i) * translationY) / height));
    }

    public final void c(int i) {
        fbq fbq = this.a;
        if (fbq != null) {
            fbq.a(i);
        }
    }
}
