package defpackage;

import android.opengl.GLSurfaceView.Renderer;
import com.google.vr.sdk.base.GvrView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: ahnk */
final class ahnk implements Renderer {
    private final /* synthetic */ GvrView.Renderer a;
    private final /* synthetic */ ahnl b;

    ahnk(ahnl ahnl, GvrView.Renderer renderer) {
        this.b = ahnl;
        this.a = renderer;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.a.onSurfaceCreated(eGLConfig);
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b.c.setViewport(0, 0, i, i2);
        this.a.onSurfaceChanged(i, i2);
    }

    public final void onDrawFrame(GL10 gl10) {
        this.b.c.setGLViewport();
        GvrView.Renderer renderer = this.a;
        ahnl ahnl = this.b;
        renderer.onDrawFrame(ahnl.a, ahnl.b, null);
        this.a.onFinishFrame(this.b.c);
    }
}
