package defpackage;

import android.graphics.Bitmap;

/* renamed from: fyw */
final /* synthetic */ class fyw implements Runnable {
    private final fyr a;

    fyw(fyr fyr) {
        this.a = fyr;
    }

    public final void run() {
        fyr fyr = this.a;
        fyo fyo = fyr.e;
        Bitmap bitmap = fyr.d.getBitmap();
        fyo.a.clear();
        fyo.a.add(new fyp(bitmap));
        fyr.b.m();
    }
}
