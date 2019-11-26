package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: zhg */
public final /* synthetic */ class zhg implements Runnable {
    private final CameraView a;

    public zhg(CameraView cameraView) {
        this.a = cameraView;
    }

    public final void run() {
        CameraView cameraView = this.a;
        cameraView.l();
        cameraView.f.c();
        cameraView.f.a(null);
        ziu ziu = cameraView.a;
        if (ziu != null) {
            ziu.a();
            cameraView.a = null;
        }
        SurfaceTexture surfaceTexture = cameraView.b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            GLES20.glDeleteTextures(1, new int[]{cameraView.c}, 0);
        }
        synchronized (cameraView.p) {
            cameraView.o = false;
            cameraView.p.notifyAll();
        }
    }
}
