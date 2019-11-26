package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: auy */
public final class auy extends MarginLayoutParams {
    public aux a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o = new Rect();
    private boolean p;
    private boolean q;

    public auy() {
        super(-2, -2);
    }

    public auy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aut.b);
        this.c = obtainStyledAttributes.getInteger(aut.c, 0);
        this.f = obtainStyledAttributes.getResourceId(aut.d, -1);
        this.d = obtainStyledAttributes.getInteger(aut.e, 0);
        this.e = obtainStyledAttributes.getInteger(aut.i, -1);
        this.g = obtainStyledAttributes.getInt(aut.h, 0);
        this.h = obtainStyledAttributes.getInt(aut.g, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(aut.f);
        this.b = hasValue;
        if (hasValue) {
            this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(aut.f));
        }
        obtainStyledAttributes.recycle();
        aux aux = this.a;
        if (aux != null) {
            aux.a(this);
        }
    }

    public auy(auy auy) {
        super(auy);
    }

    public auy(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public auy(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void a(aux aux) {
        aux aux2 = this.a;
        if (aux2 != aux) {
            if (aux2 != null) {
                aux2.a_();
            }
            this.a = aux;
            this.b = true;
            if (aux != null) {
                aux.a(this);
            }
        }
    }

    public final void a(int i, boolean z) {
        if (i != 0) {
            this.q = z;
        } else {
            this.p = z;
        }
    }

    public final boolean a(int i) {
        if (i != 0) {
            return this.q;
        }
        return this.p;
    }

    public final void a() {
        this.n = false;
    }
}
