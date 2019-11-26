package defpackage;

import android.hardware.Camera;
import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhe */
public final /* synthetic */ class zhe implements Runnable {
    private final CameraView a;
    private final Camera b;

    public zhe(CameraView cameraView, Camera camera) {
        this.a = cameraView;
        this.b = camera;
    }

    public final void run() {
        CameraView cameraView = this.a;
        Camera camera = this.b;
        if (cameraView.d) {
            cameraView.a(camera, "torch");
        }
        for (zhm X : cameraView.s) {
            X.X();
        }
    }
}
