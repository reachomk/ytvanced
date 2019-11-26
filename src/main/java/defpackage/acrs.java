package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: acrs */
final /* synthetic */ class acrs implements Runnable {
    private final ImageView a;
    private final Bitmap b;

    acrs(ImageView imageView, Bitmap bitmap) {
        this.a = imageView;
        this.b = bitmap;
    }

    public final void run() {
        this.a.setImageBitmap(this.b);
    }
}
