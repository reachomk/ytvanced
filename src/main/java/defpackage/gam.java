package defpackage;

import android.widget.ImageView;

/* renamed from: gam */
final class gam extends akka {
    private final /* synthetic */ gan a;

    gam(gan gan) {
        this.a = gan;
    }

    public final void c(ImageView imageView) {
        gan gan = this.a;
        gan.a.setText(null);
        gan.a.setVisibility(0);
        gan.c = true;
    }

    public final void a(ImageView imageView) {
        gan gan = this.a;
        if (gan.c) {
            gan.a.setVisibility(8);
            gan.c = false;
        }
        this.a.b.a();
    }
}
