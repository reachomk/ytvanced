package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: akit */
final /* synthetic */ class akit implements Runnable {
    private final akiu a;
    private final Drawable b;

    akit(akiu akiu, Drawable drawable) {
        this.a = akiu;
        this.b = drawable;
    }

    public final void run() {
        akiu akiu = this.a;
        Drawable drawable = this.b;
        if (drawable == null) {
            bdhi bdhi = akiu.a;
            if (bdhi != null) {
                akis.a(bdhi, akiu.c, akiu.b);
            }
            return;
        }
        akiu.c.setImageDrawable(drawable);
    }
}
