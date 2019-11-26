package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: xnb */
public final class xnb {
    public static final xng a = new xng();
    private static final Handler b = new Handler(Looper.getMainLooper());

    public static void a(xnk xnk, Uri uri, ImageView imageView, xni xni) {
        xnk xnk2 = xnk;
        xnb.a(xnk2, a, new xnj(imageView.getContext()), uri, imageView, xni);
    }

    public static void a(xnk xnk, xne xne, xnh xnh, Uri uri, ImageView imageView, xni xni) {
        amqw.a((Object) xnk);
        amqw.a((Object) uri);
        amqw.a((Object) imageView);
        if (xne != null) {
            xne.a(imageView);
        }
        if (xni != null) {
            xni.c(imageView);
        }
        xnk.a(uri, wxl.a(b, new xnc(imageView, xnh, xni)));
    }

    public static void a(ImageView imageView) {
        imageView.setTag(R.id.bitmap_loader_tag, null);
    }
}
