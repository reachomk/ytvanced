package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: kdt */
final class kdt extends akka {
    private final /* synthetic */ jty a;
    private final /* synthetic */ kdr b;

    kdt(kdr kdr, jty jty) {
        this.b = kdr;
        this.a = jty;
    }

    public final void a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            this.b.B = bitmapDrawable.getBitmap();
        }
        this.a.a(this.b.z);
    }

    public final void b(ImageView imageView) {
        this.a.a(this.b.z);
    }
}
