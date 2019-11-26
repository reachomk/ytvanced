package android.support.design.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.button.MaterialButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;
import defpackage.aad;
import defpackage.auu;
import defpackage.aux;
import defpackage.auy;
import defpackage.du;
import defpackage.fw;
import defpackage.fx;
import defpackage.fy;
import defpackage.fz;
import defpackage.ga;
import defpackage.gq;
import defpackage.gu;
import java.util.ArrayList;

public final class ExtendedFloatingActionButton extends MaterialButton implements auu {
    public final Rect a;
    public int b;
    public Animator c;
    public final du d;
    public final du e;
    public du f;
    public du g;
    public final int h;
    public final ArrayList i;
    public final ArrayList j;

    public class ExtendedFloatingActionButtonBehavior extends aux {
        private Rect a;
        private boolean b;
        private boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gq.a);
            this.b = obtainStyledAttributes.getBoolean(gq.b, false);
            this.c = obtainStyledAttributes.getBoolean(gq.c, true);
            obtainStyledAttributes.recycle();
        }

        public final void a(auy auy) {
            if (auy.h == 0) {
                auy.h = 80;
            }
        }

        private static boolean b(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof auy ? ((auy) layoutParams).a instanceof BottomSheetBehavior : false;
        }

        private final boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            auy auy = (auy) extendedFloatingActionButton.getLayoutParams();
            if ((!this.b && !this.c) || auy.f != view.getId()) {
                return false;
            }
            int i = extendedFloatingActionButton.h;
            return true;
        }

        private final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a((View) appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            gu.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                a(extendedFloatingActionButton);
            } else {
                b(extendedFloatingActionButton);
            }
            return true;
        }

        private final boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((auy) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                a(extendedFloatingActionButton);
            } else {
                b(extendedFloatingActionButton);
            }
            return true;
        }

        private final void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.c) {
                ExtendedFloatingActionButton.d();
            } else if (this.b && (extendedFloatingActionButton.getVisibility() != 0 ? extendedFloatingActionButton.b == 2 : extendedFloatingActionButton.b != 1)) {
                Animator animator = extendedFloatingActionButton.c;
                if (animator != null) {
                    animator.cancel();
                }
                if (ExtendedFloatingActionButton.f()) {
                    du duVar = extendedFloatingActionButton.e;
                    if (extendedFloatingActionButton.g == null) {
                        extendedFloatingActionButton.g = du.a(extendedFloatingActionButton.getContext(), R.animator.mtrl_extended_fab_hide_motion_spec);
                    }
                    aad.a(extendedFloatingActionButton.g);
                    AnimatorSet e = ExtendedFloatingActionButton.e();
                    e.addListener(new fx(extendedFloatingActionButton));
                    ArrayList arrayList = extendedFloatingActionButton.j;
                    e.start();
                    return;
                }
                ExtendedFloatingActionButton.c();
            }
        }

        private final void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.c) {
                ExtendedFloatingActionButton.d();
            } else if (this.b && (extendedFloatingActionButton.getVisibility() == 0 ? extendedFloatingActionButton.b == 1 : extendedFloatingActionButton.b != 2)) {
                Animator animator = extendedFloatingActionButton.c;
                if (animator != null) {
                    animator.cancel();
                }
                if (ExtendedFloatingActionButton.f()) {
                    du duVar = extendedFloatingActionButton.d;
                    if (extendedFloatingActionButton.f == null) {
                        extendedFloatingActionButton.f = du.a(extendedFloatingActionButton.getContext(), R.animator.mtrl_extended_fab_show_motion_spec);
                    }
                    aad.a(extendedFloatingActionButton.f);
                    AnimatorSet e = ExtendedFloatingActionButton.e();
                    e.addListener(new fw(extendedFloatingActionButton));
                    ArrayList arrayList = extendedFloatingActionButton.i;
                    e.start();
                    return;
                }
                ExtendedFloatingActionButton.c();
                extendedFloatingActionButton.setAlpha(1.0f);
                extendedFloatingActionButton.setScaleY(1.0f);
                extendedFloatingActionButton.setScaleX(1.0f);
            }
        }
    }

    public static void c() {
        throw new NoSuchMethodError();
    }

    public final aux b() {
        throw null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        throw null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        throw null;
    }

    public final void setVisibility(int i) {
        throw null;
    }

    public static void d() {
        throw new NoSuchMethodError();
    }

    public static AnimatorSet e() {
        throw new NoSuchMethodError();
    }

    public static boolean f() {
        throw new NoSuchMethodError();
    }

    static {
        fz fzVar = new fz(Float.class, "width");
        fy fyVar = new fy(Float.class, "height");
        ga gaVar = new ga(Float.class, "cornerRadius");
    }
}
