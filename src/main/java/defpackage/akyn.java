package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: akyn */
public final class akyn extends ufi implements akng {
    private final boolean a = true;
    private final aknh b;

    public akyn(Context context, aknh aknh) {
        super(context);
        aknh aknh2 = this.b;
        if (aknh2 != null) {
            aknh2.a((akng) this);
        }
        this.b = aknh;
        this.b.b(this);
        notifyDataSetChanged();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, Object obj) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof akyp) {
            akyp akyp = (akyp) ufg;
            akym akym = (akym) obj;
            akym.a.setText(akyp.b);
            ColorStateList colorStateList = akyp.c;
            if (colorStateList != null) {
                akym.a.setTextColor(colorStateList);
            }
            Drawable drawable = akyp.d;
            if (drawable != null) {
                akym.b.setImageDrawable(drawable);
                akym.b.setVisibility(0);
            } else {
                akym.b.setVisibility(8);
            }
            String str = akyp.g;
            if (str != null) {
                akym.c.setText(str);
                akym.c.setVisibility(0);
                akym.d.setText("•");
                akym.d.setVisibility(0);
            } else {
                akym.c.setVisibility(8);
                akym.d.setVisibility(8);
            }
        } else if (!(ufg instanceof akyq)) {
            super.a(i, obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, View view) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof akyp) {
            return new akym(view);
        }
        if (ufg instanceof akyq) {
            return null;
        }
        return super.a(i, view);
    }

    /* renamed from: a */
    public final ufg getItem(int i) {
        if (!this.a) {
            return (ufg) this.b.c(i);
        }
        if (i == 0) {
            return new akyq();
        }
        return (ufg) this.b.c(i - 1);
    }

    public final int getCount() {
        if (this.a) {
            return this.b.d() + 1;
        }
        return this.b.d();
    }

    public final void bF_() {
        notifyDataSetChanged();
    }

    public final void d_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void e_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void f_(int i, int i2) {
        notifyDataSetChanged();
    }

    public final void g_(int i, int i2) {
        notifyDataSetChanged();
    }
}
