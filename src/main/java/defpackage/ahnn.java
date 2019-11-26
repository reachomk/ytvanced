package defpackage;

import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView.Renderer;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import javax.microedition.khronos.egl.EGLConfig;

/* renamed from: ahnn */
final class ahnn implements Renderer {
    private final /* synthetic */ StereoRenderer a;

    ahnn(StereoRenderer stereoRenderer) {
        this.a = stereoRenderer;
    }

    public final void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2) {
        this.a.onNewFrame(headTransform);
        this.a.onDrawEye(eye);
    }

    public final void onFinishFrame(Viewport viewport) {
        this.a.onFinishFrame(viewport);
    }

    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.a.onSurfaceCreated(eGLConfig);
    }

    public final void onSurfaceChanged(int i, int i2) {
        this.a.onSurfaceChanged(i, i2);
    }

    public final void onRendererShutdown() {
        this.a.onRendererShutdown();
    }
}
