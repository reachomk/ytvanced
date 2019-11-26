package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: krh */
final class krh extends akka {
    private final /* synthetic */ jty a;
    private final /* synthetic */ kre b;

    krh(kre kre, jty jty) {
        this.b = kre;
        this.a = jty;
    }

    public final void a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            this.b.B = bitmapDrawable.getBitmap();
        }
        this.a.a(this.b.C);
    }

    public final void b(ImageView imageView) {
        this.a.a(this.b.C);
    }
}
