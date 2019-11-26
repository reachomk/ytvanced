package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: akyj */
public final class akyj extends ufi {
    public akyj(Context context, boolean z) {
        super(context);
        if (z) {
            add(new akyq());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, Object obj) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof akyk) {
            akyk akyk = (akyk) ufg;
            akyl akyl = (akyl) obj;
            akyl.a.setText(akyk.b);
            if (!TextUtils.isEmpty(akyk.g)) {
                akyl.a.append(akyk.g);
            }
            ColorStateList colorStateList = akyk.c;
            if (colorStateList != null) {
                akyl.a.setTextColor(colorStateList);
            } else {
                akyl.a.setTextColor(xwe.a(getContext(), R.attr.ytTextPrimary, 0));
            }
            Drawable drawable = akyk.d;
            if (drawable != null) {
                akyl.b.setImageDrawable(drawable);
                akyl.b.setVisibility(0);
            } else {
                akyl.b.setVisibility(8);
            }
            drawable = akyk.e;
            if (drawable != null) {
                akyl.c.setImageDrawable(drawable);
                akyl.c.setVisibility(0);
            } else {
                akyl.c.setVisibility(8);
            }
            akyl.a.setAccessibilityDelegate(new akyi(akyk));
        } else if (!(ufg instanceof akyq)) {
            super.a(i, obj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, View view) {
        ufg ufg = (ufg) getItem(i);
        if (ufg instanceof akyk) {
            return new akyl(view);
        }
        if (ufg instanceof akyq) {
            return null;
        }
        return super.a(i, view);
    }
}
