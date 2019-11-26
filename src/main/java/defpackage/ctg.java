package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: ctg */
final class ctg implements cto {
    private ctg() {
    }

    public final String a() {
        return "height";
    }

    public final void b(Object obj) {
    }

    public final float a(Object obj) {
        return (float) cte.a(obj, (cto) this).getHeight();
    }

    public final float a(clm clm) {
        return (float) clm.a().height();
    }

    public final void a(Object obj, float f) {
        int top;
        if (obj instanceof ComponentHost) {
            View view = (ComponentHost) obj;
            if (view instanceof cpq) {
                cpq cpq = (cpq) view;
                cpq.z = (int) f;
                cpq.requestLayout();
            } else {
                top = view.getTop();
                clq.a(view, view.getLeft(), top, view.getRight(), (int) (((float) top) + f), false);
            }
            List j = view.j();
            if (j != null) {
                int width = view.getWidth();
                int i = (int) f;
                for (int i2 = 0; i2 < j.size(); i2++) {
                    clq.a((Drawable) j.get(i2), width, i);
                }
            }
        } else if (obj instanceof View) {
            View view2 = (View) obj;
            top = view2.getTop();
            clq.a(view2, view2.getLeft(), top, view2.getRight(), (int) (((float) top) + f), false);
        } else if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            clq.a(drawable, drawable.getBounds().width(), (int) f);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
            stringBuilder.append("Setting height on unsupported mount content: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* synthetic */ ctg(byte b) {
    }
}
