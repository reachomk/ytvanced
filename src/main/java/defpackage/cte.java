package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;

/* renamed from: cte */
public final class cte {
    public static final cto a = new ctm();
    public static final cto b = new ctl();
    public static final cto c = new ctj();
    public static final cto d = new ctg();
    public static final cto e = new ctd();
    public static final cto f = new cti();
    public static final cto g = new ctf();
    public static final cto[] h = new cto[]{a, b, c, d};

    public static View a(Object obj, cto cto) {
        if (obj instanceof View) {
            return (View) obj;
        }
        String a = cto.a();
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 46) + valueOf.length());
        stringBuilder.append("Animating '");
        stringBuilder.append(a);
        stringBuilder.append("' is only supported on Views (got ");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        throw new RuntimeException(stringBuilder.toString());
    }

    public static float a(View view, boolean z) {
        float f = 0.0f;
        while (view != null) {
            if (view instanceof cpq) {
                return f;
            }
            float x;
            if (z) {
                x = view.getX();
            } else {
                x = view.getY();
            }
            f += x;
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                String valueOf = String.valueOf(view.getParent());
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Expected parent to be View, was ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        throw new RuntimeException("Got unexpected null parent");
    }

    public static View a(Drawable drawable) {
        Callback callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    static {
        cth cth = new cth();
        ctk ctk = new ctk();
    }
}
