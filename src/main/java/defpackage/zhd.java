package defpackage;

import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhd */
public final /* synthetic */ class zhd implements Runnable {
    private final CameraView a;

    public zhd(CameraView cameraView) {
        this.a = cameraView;
    }

    public final void run() {
        for (zhm Y : this.a.s) {
            Y.Y();
        }
    }
}
