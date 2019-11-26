package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: xpv */
public final class xpv {
    public static void a(View view, Drawable drawable) {
        amqw.a((Object) view);
        int j = abe.j(view);
        int paddingTop = view.getPaddingTop();
        int k = abe.k(view);
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(drawable);
        abe.a(view, j, paddingTop, k, paddingBottom);
    }
}
