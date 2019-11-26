package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: ctj */
final class ctj implements cto {
    private ctj() {
    }

    public final String a() {
        return "width";
    }

    public final void b(Object obj) {
    }

    public final float a(Object obj) {
        return (float) cte.a(obj, (cto) this).getWidth();
    }

    public final float a(clm clm) {
        return (float) clm.a().width();
    }

    public final void a(Object obj, float f) {
        int left;
        if (obj instanceof ComponentHost) {
            View view = (ComponentHost) obj;
            if (view instanceof cpq) {
                cpq cpq = (cpq) view;
                cpq.y = (int) f;
                cpq.requestLayout();
            } else {
                left = view.getLeft();
                clq.a(view, left, view.getTop(), (int) (((float) left) + f), view.getBottom(), false);
            }
            List j = view.j();
            if (j != null) {
                int i = (int) f;
                int height = view.getHeight();
                for (int i2 = 0; i2 < j.size(); i2++) {
                    clq.a((Drawable) j.get(i2), i, height);
                }
            }
        } else if (obj instanceof View) {
            View view2 = (View) obj;
            left = view2.getLeft();
            clq.a(view2, left, view2.getTop(), (int) (((float) left) + f), view2.getBottom(), false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            clq.a(drawable, (int) f, drawable.getBounds().height());
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
            stringBuilder.append("Setting width on unsupported mount content: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* synthetic */ ctj(byte b) {
    }
}
