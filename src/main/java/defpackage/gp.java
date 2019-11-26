package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: gp */
public final class gp extends gc {
    public gp(FloatingActionButton floatingActionButton, hq hqVar) {
        super(floatingActionButton, hqVar);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void j() {
    }

    /* Access modifiers changed, original: final */
    public final void a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.c = h();
        this.c.setTintList(colorStateList);
        if (mode != null) {
            this.c.setTintMode(mode);
        }
        this.c.a(this.D.getContext());
        if (i <= 0) {
            this.e = null;
            drawable = this.c;
        } else {
            Context context = this.D.getContext();
            ft ftVar = new ft((ia) aad.a(this.b));
            int c = ra.c(context, R.color.design_fab_stroke_top_outer_color);
            int c2 = ra.c(context, R.color.design_fab_stroke_top_inner_color);
            int c3 = ra.c(context, R.color.design_fab_stroke_end_inner_color);
            int c4 = ra.c(context, R.color.design_fab_stroke_end_outer_color);
            ftVar.c = c;
            ftVar.d = c2;
            ftVar.e = c3;
            ftVar.f = c4;
            float f = (float) i;
            if (ftVar.b != f) {
                ftVar.b = f;
                ftVar.a.setStrokeWidth(f * 1.3333f);
                ftVar.g = true;
                ftVar.invalidateSelf();
            }
            ftVar.a(colorStateList);
            this.e = ftVar;
            drawable = new LayerDrawable(new Drawable[]{(Drawable) aad.a(this.e), (Drawable) aad.a(this.c)});
        }
        this.d = new RippleDrawable(ho.a(colorStateList2), drawable, null);
        this.f = this.d;
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.D.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(x, a(f, f3));
            stateListAnimator.addState(y, a(f, f2));
            stateListAnimator.addState(z, a(f, f2));
            stateListAnimator.addState(A, a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.D, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.D, View.TRANSLATION_Z, new float[]{this.D.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.D, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(B, animatorSet);
            stateListAnimator.addState(C, a(0.0f, 0.0f));
            this.D.setStateListAnimator(stateListAnimator);
        }
        if (f()) {
            e();
        }
    }

    private final Animator a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.D, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.D, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final float a() {
        return this.D.getElevation();
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.E.a() || !c();
    }

    /* Access modifiers changed, original: final */
    public final void a(int[] iArr) {
        if (VERSION.SDK_INT == 21) {
            if (this.D.isEnabled()) {
                this.D.setElevation(this.i);
                if (this.D.isPressed()) {
                    this.D.setTranslationZ(this.k);
                } else if (this.D.isFocused() || this.D.isHovered()) {
                    this.D.setTranslationZ(this.j);
                    return;
                } else {
                    this.D.setTranslationZ(0.0f);
                    return;
                }
            }
            this.D.setElevation(0.0f);
            this.D.setTranslationZ(0.0f);
        }
    }

    /* Access modifiers changed, original: final */
    public final hu h() {
        ia iaVar = (ia) aad.a(this.b);
        if (this.g) {
            float e = ((float) this.D.e()) / 2.0f;
            iaVar.a(e, e, e, e);
        }
        return new go(iaVar);
    }

    /* Access modifiers changed, original: final */
    public final void a(Rect rect) {
        if (this.E.a()) {
            super.a(rect);
        } else if (c()) {
            rect.set(0, 0, 0, 0);
        } else {
            int e = (this.l - this.D.e()) / 2;
            rect.set(e, e, e, e);
        }
    }
}
