package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: gol */
final /* synthetic */ class gol implements Runnable {
    private final ImageView a;
    private final Bitmap b;

    gol(ImageView imageView, Bitmap bitmap) {
        this.a = imageView;
        this.b = bitmap;
    }

    public final void run() {
        this.a.setImageDrawable(new BitmapDrawable(this.b));
    }
}
