package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: wgn */
final class wgn implements wgj {
    private final /* synthetic */ ImageView a;
    private final /* synthetic */ int b;
    private final /* synthetic */ ImageView c;
    private final /* synthetic */ wgm d;

    wgn(wgm wgm, ImageView imageView, int i, ImageView imageView2) {
        this.d = wgm;
        this.a = imageView;
        this.b = i;
        this.c = imageView2;
    }

    public final void a(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
        if (this.d.b == this.b) {
            this.c.setImageBitmap(bitmap);
        }
    }
}
