package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.design.textfield.TextInputLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kv */
public final class kv {
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public int i;
    public ColorStateList j;
    public CharSequence k;
    public boolean l;
    public TextView m;
    public int n;
    public ColorStateList o;
    private LinearLayout p;
    private int q;
    private FrameLayout r;
    private int s;
    private final float t = ((float) this.a.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y));

    public kv(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
    }

    private static boolean c(int i) {
        return i == 0 || i == 1;
    }

    public final void a() {
        this.f = null;
        b();
        if (this.d == 1) {
            if (!this.l || TextUtils.isEmpty(this.k)) {
                this.e = 0;
            } else {
                this.e = 2;
            }
        }
        a(this.d, this.e, a(this.h, null));
    }

    public final boolean a(TextView textView, CharSequence charSequence) {
        boolean z = false;
        if (abe.D(this.b) && this.b.isEnabled()) {
            if (this.e != this.d || textView == null) {
                z = true;
            } else if (TextUtils.equals(textView.getText(), charSequence)) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final void a(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i5 = i;
            int i6 = i2;
            a(arrayList2, this.l, this.m, 2, i5, i6);
            a(arrayList2, this.g, this.h, 1, i5, i6);
            dt.a(animatorSet, arrayList);
            animatorSet.addListener(new ku(this, i2, d(i), i, d(i2)));
            animatorSet.start();
        } else if (i3 != i4) {
            TextView d;
            if (i4 != 0) {
                d = d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i3 != 0) {
                d = d(i);
                if (d != null) {
                    d.setVisibility(4);
                    if (i3 == 1) {
                        d.setText(null);
                    }
                }
            }
            this.d = i4;
        }
        this.b.d();
        this.b.a(z2);
        this.b.f();
    }

    private final void a(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                float f = i3 != i ? 0.0f : 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(dq.a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.t, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(dq.d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final void b() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    private final TextView d(int i) {
        if (i != 1) {
            return i != 2 ? null : this.m;
        } else {
            return this.h;
        }
    }

    public final void c() {
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            EditText editText = this.b.a;
            if (editText != null) {
                abe.a(linearLayout, abe.j(editText), 0, abe.k(this.b.a), 0);
            }
        }
    }

    public final void a(TextView textView, int i) {
        if (this.p == null && this.r == null) {
            this.p = new LinearLayout(this.a);
            this.p.setOrientation(0);
            this.b.addView(this.p, -1, -2);
            this.r = new FrameLayout(this.a);
            this.p.addView(this.r, -1, new LayoutParams(-2, -2));
            this.p.addView(new Space(this.a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.b.a != null) {
                c();
            }
        }
        if (kv.c(i)) {
            this.r.setVisibility(0);
            this.r.addView(textView);
            this.s++;
        } else {
            this.p.addView(textView, i);
        }
        this.p.setVisibility(0);
        this.q++;
    }

    public final void b(TextView textView, int i) {
        if (this.p != null) {
            int i2;
            if (kv.c(i)) {
                ViewGroup viewGroup = this.r;
                if (viewGroup != null) {
                    int i3 = this.s - 1;
                    this.s = i3;
                    kv.a(viewGroup, i3);
                    this.r.removeView(textView);
                    i2 = this.q - 1;
                    this.q = i2;
                    kv.a(this.p, i2);
                }
            }
            this.p.removeView(textView);
            i2 = this.q - 1;
            this.q = i2;
            kv.a(this.p, i2);
        }
    }

    private static void a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean d() {
        if (this.e != 1 || this.h == null || TextUtils.isEmpty(this.f)) {
            return false;
        }
        return true;
    }

    public final int e() {
        TextView textView = this.h;
        return textView != null ? textView.getCurrentTextColor() : -1;
    }

    public final void a(ColorStateList colorStateList) {
        this.j = colorStateList;
        TextView textView = this.h;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void a(int i) {
        this.i = i;
        TextView textView = this.h;
        if (textView != null) {
            this.b.a(textView, i);
        }
    }

    public final void b(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void b(int i) {
        this.n = i;
        TextView textView = this.m;
        if (textView != null) {
            adl.a(textView, i);
        }
    }
}
