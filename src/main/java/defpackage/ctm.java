package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: ctm */
final class ctm implements cto {
    private ctm() {
    }

    public final String a() {
        return "x";
    }

    public final float a(Object obj) {
        return cte.a(cte.a(obj, (cto) this), true);
    }

    public final float a(clm clm) {
        return (float) clm.a().left;
    }

    public final void a(Object obj, float f) {
        if (obj instanceof cpq) {
            ((View) obj).setX(f);
        } else if (obj instanceof View) {
            View view = (View) obj;
            view.setX(f - cte.a((View) view.getParent(), true));
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            clq.b(drawable, (int) (f - cte.a(cte.a(drawable), true)), drawable.getBounds().top);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
            stringBuilder.append("Setting X on unsupported mount content: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public final void b(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        }
    }

    /* synthetic */ ctm(byte b) {
    }
}
