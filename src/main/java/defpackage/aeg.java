package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertController.RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* renamed from: aeg */
public final class aeg {
    public final aeb a;
    private final int b;

    public aeg(Context context) {
        this(context, aeh.a(context, 0));
    }

    public aeg(Context context, int i) {
        this.a = new aeb(new ContextThemeWrapper(context, aeh.a(context, i)));
        this.b = i;
    }

    public final aeg a(int i) {
        aeb aeb = this.a;
        aeb.d = aeb.a.getText(i);
        return this;
    }

    public final aeg a(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public final aeg b(int i) {
        aeb aeb = this.a;
        aeb.f = aeb.a.getText(i);
        return this;
    }

    public final aeg a(int i, OnClickListener onClickListener) {
        aeb aeb = this.a;
        aeb.g = aeb.a.getText(i);
        this.a.h = onClickListener;
        return this;
    }

    public final aeg b(int i, OnClickListener onClickListener) {
        aeb aeb = this.a;
        aeb.i = aeb.a.getText(i);
        this.a.j = onClickListener;
        return this;
    }

    public final aeg a(boolean z) {
        this.a.k = z;
        return this;
    }

    public final aeg a(OnCancelListener onCancelListener) {
        this.a.l = onCancelListener;
        return this;
    }

    public final aeg a(View view) {
        aeb aeb = this.a;
        aeb.q = view;
        aeb.p = 0;
        aeb.r = false;
        return this;
    }

    public final aeh a() {
        CharSequence charSequence;
        aeh aeh = new aeh(this.a.a, this.b);
        aeb aeb = this.a;
        AlertController alertController = aeh.a;
        View view = aeb.e;
        if (view == null) {
            charSequence = aeb.d;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            Drawable drawable = aeb.c;
            if (drawable != null) {
                alertController.v = drawable;
                alertController.u = 0;
                ImageView imageView = alertController.w;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.w.setImageDrawable(drawable);
                }
            }
        } else {
            alertController.z = view;
        }
        charSequence = aeb.f;
        if (charSequence != null) {
            alertController.f = charSequence;
            TextView textView = alertController.y;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        charSequence = aeb.g;
        if (charSequence != null) {
            alertController.a(-1, charSequence, aeb.h);
        }
        charSequence = aeb.i;
        if (charSequence != null) {
            alertController.a(-2, charSequence, aeb.j);
        }
        if (aeb.n != null) {
            int i;
            RecycleListView recycleListView = (RecycleListView) aeb.b.inflate(alertController.E, null);
            if (aeb.s) {
                i = alertController.F;
            } else {
                i = alertController.G;
            }
            ListAdapter listAdapter = aeb.n;
            if (listAdapter == null) {
                listAdapter = new aef(aeb.a, i);
            }
            alertController.A = listAdapter;
            alertController.B = aeb.t;
            if (aeb.o != null) {
                recycleListView.setOnItemClickListener(new aee(aeb, alertController));
            }
            if (aeb.s) {
                recycleListView.setChoiceMode(1);
            }
            alertController.g = recycleListView;
        }
        View view2 = aeb.q;
        if (view2 != null) {
            alertController.b(view2);
        }
        aeh.setCancelable(this.a.k);
        if (this.a.k) {
            aeh.setCanceledOnTouchOutside(true);
        }
        aeh.setOnCancelListener(this.a.l);
        aeh.setOnDismissListener(null);
        OnKeyListener onKeyListener = this.a.m;
        if (onKeyListener != null) {
            aeh.setOnKeyListener(onKeyListener);
        }
        return aeh;
    }

    public final aeh b() {
        aeh a = a();
        a.show();
        return a;
    }
}
