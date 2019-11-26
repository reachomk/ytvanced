package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: alq */
public final class alq extends aoa implements alw {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c = new Rect();
    public final /* synthetic */ AppCompatSpinner d;
    private int s;

    public alq(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        this.d = appCompatSpinner;
        super(context, attributeSet, i);
        this.m = appCompatSpinner;
        h();
        this.l = 0;
        this.n = new alp(this);
    }

    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final void a(CharSequence charSequence) {
        this.a = charSequence;
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        Drawable b = b();
        int i = 0;
        if (b != null) {
            b.getPadding(this.d.d);
            i = !asy.a(this.d) ? -this.d.d.left : this.d.d.right;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        AppCompatSpinner appCompatSpinner = this.d;
        int i2 = appCompatSpinner.c;
        if (i2 == -2) {
            int a = appCompatSpinner.a((SpinnerAdapter) this.b, b());
            i2 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i2) {
                a = i2;
            }
            d(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            d((width - paddingLeft) - paddingRight);
        } else {
            d(i2);
        }
        if (asy.a(this.d)) {
            i += ((width - paddingRight) - this.f) - this.s;
        } else {
            i += paddingLeft + this.s;
        }
        this.g = i;
    }

    public final void a(int i, int i2) {
        boolean e = e();
        g();
        i();
        super.f_();
        amt amt = this.e;
        amt.setChoiceMode(1);
        amt.setTextDirection(i);
        amt.setTextAlignment(i2);
        e(this.d.getSelectedItemPosition());
        if (!e) {
            ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                als als = new als(this);
                viewTreeObserver.addOnGlobalLayoutListener(als);
                a(new alr(this, als));
            }
        }
    }

    public final void c(int i) {
        this.s = i;
    }
}
