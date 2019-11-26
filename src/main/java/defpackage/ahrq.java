package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Handler;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: ahrq */
public final class ahrq implements Renderer {
    private static final float[] e = new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public ahso a;
    public ahwj b;
    public ahsf c;
    public volatile boolean d;
    private final Handler f;
    private final ahxb g;

    public ahrq(ahxb ahxb, Handler handler) {
        this.f = (Handler) amqw.a((Object) handler);
        this.g = (ahxb) amqw.a((Object) ahxb);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.b = new ahwj(this.g, true, false);
            this.b.c();
            this.b.a();
            this.a = new ahso(e, 3);
            this.a.a(this.b.a);
            this.c = new ahsf(this.f);
        } catch (ahsj e) {
            a(e);
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        ahsf ahsf = this.c;
        if (ahsf != null) {
            ahsf.c();
        }
        ahwj ahwj = this.b;
        if (ahwj != null) {
            ahwj.a(this.c);
        }
        if (this.d) {
            GLES20.glDrawArrays(5, 0, 4);
        }
        try {
            ahsl.a();
        } catch (ahsj e) {
            a(e);
        }
    }

    private final void a(ahsj ahsj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ahsj.getMessage());
        String str = "\n";
        stringBuilder.append(str);
        for (Object append : ahsj.getStackTrace()) {
            stringBuilder.append(append);
            stringBuilder.append(str);
        }
        xtl.c(stringBuilder.toString());
        this.f.obtainMessage(3, ahsj).sendToTarget();
    }
}
