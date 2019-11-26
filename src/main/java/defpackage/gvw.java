package defpackage;

import android.widget.ImageView;

/* renamed from: gvw */
final class gvw extends akka {
    private final int a;
    private final /* synthetic */ gvg b;

    gvw(gvg gvg, int i) {
        this.b = gvg;
        this.a = i;
    }

    public final void a(ImageView imageView) {
        this.b.e(this.a);
        imageView.setBackground(null);
    }

    public final void b(ImageView imageView) {
        this.b.e(this.a);
        gvg.a(imageView, this.a);
    }
}
