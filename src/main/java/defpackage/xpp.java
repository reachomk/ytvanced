package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: xpp */
public final class xpp {
    public static void a(View view, boolean z, int i, xoe xoe) {
        xoz xoz;
        Drawable background = view.getBackground();
        if (background instanceof xoz) {
            xoz = (xoz) background;
        } else {
            view.setBackground(null);
            xoz xoz2 = new xoz(view.getContext(), background);
            xpv.a(view, xoz2);
            xoz = xoz2;
        }
        if (!(i == 0 || xoe == null)) {
            xoe.a(xoz.getDrawable(1), i);
            xoz.invalidateSelf();
        }
        xoz.getDrawable(1).setAlpha(!z ? 0 : 255);
        xoz.invalidateSelf();
    }
}
