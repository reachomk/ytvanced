package defpackage;

import android.widget.ImageView;

/* renamed from: zsu */
final /* synthetic */ class zsu implements Runnable {
    private final ImageView a;
    private final ss b;

    zsu(ImageView imageView, ss ssVar) {
        this.a = imageView;
        this.b = ssVar;
    }

    public final void run() {
        this.a.setImageDrawable(this.b);
    }
}
