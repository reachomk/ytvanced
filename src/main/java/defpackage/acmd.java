package defpackage;

import android.graphics.Bitmap;

/* renamed from: acmd */
final /* synthetic */ class acmd implements Runnable {
    private final acme a;
    private final Bitmap b;

    acmd(acme acme, Bitmap bitmap) {
        this.a = acme;
        this.b = bitmap;
    }

    public final void run() {
        acme acme = this.a;
        acme.a.ak.setImageBitmap(this.b);
    }
}
