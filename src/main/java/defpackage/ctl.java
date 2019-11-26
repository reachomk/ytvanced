package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: ctl */
final class ctl implements cto {
    private ctl() {
    }

    public final String a() {
        return "y";
    }

    public final float a(Object obj) {
        return cte.a(cte.a(obj, (cto) this), false);
    }

    public final float a(clm clm) {
        return (float) clm.a().top;
    }

    public final void a(Object obj, float f) {
        if (obj instanceof cpq) {
            ((View) obj).setY(f);
        } else if (obj instanceof View) {
            View view = (View) obj;
            view.setY(f - cte.a((View) view.getParent(), false));
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            clq.b(drawable, drawable.getBounds().left, (int) (f - cte.a(cte.a(drawable), false)));
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
            stringBuilder.append("Setting Y on unsupported mount content: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public final void b(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    /* synthetic */ ctl(byte b) {
    }
}
