package defpackage;

import android.net.Uri;
import android.widget.ImageView;

/* renamed from: acrq */
final /* synthetic */ class acrq implements Runnable {
    private final acrn a;
    private final auyq b;
    private final Uri c;
    private final ImageView d;

    acrq(acrn acrn, auyq auyq, Uri uri, ImageView imageView) {
        this.a = acrn;
        this.b = auyq;
        this.c = uri;
        this.d = imageView;
    }

    public final void run() {
        acrn acrn = this.a;
        auyq auyq = this.b;
        Uri uri = this.c;
        ImageView imageView = this.d;
        acrn.b.a(acrn.a(auyq), acrn.a, uri, acea.a, new acrp(acrn, imageView));
    }
}
