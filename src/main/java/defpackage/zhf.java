package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhf */
public final /* synthetic */ class zhf implements Runnable {
    private final CameraView a;
    private final zhk b;
    private final Bitmap c;

    public zhf(CameraView cameraView, zhk zhk, Bitmap bitmap) {
        this.a = cameraView;
        this.b = zhk;
        this.c = bitmap;
    }

    public final void run() {
        CameraView cameraView = this.a;
        zhk zhk = this.b;
        Bitmap bitmap = this.c;
        for (zhm aj : cameraView.s) {
            aj.aj();
        }
        zhk.a(bitmap);
        bitmap.recycle();
    }
}
