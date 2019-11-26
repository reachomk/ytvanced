package defpackage;

import android.widget.ImageView;

/* renamed from: xoq */
public final class xoq {
    public static void a(ImageView imageView, int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        amqw.a(z);
        amqw.a((Object) imageView);
        imageView.setImageAlpha(i);
    }
}
