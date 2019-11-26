package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView.Renderer;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahnl */
public final class ahnl implements ahni {
    public final HeadTransform a = new HeadTransform();
    public final Eye b = new Eye(0);
    public final Viewport c = new Viewport();
    public Renderer d;
    public CountDownLatch e;
    public boolean f;
    private final GLSurfaceView g;
    private final ViewGroup h;

    public ahnl(Context context) {
        this.h = new FrameLayout(context);
        this.g = new ahnp(this, context);
        this.g.setEGLContextClientVersion(2);
        this.g.setPreserveEGLContextOnPause(true);
        this.h.addView(this.g);
    }

    public final void b() {
    }

    public final void b(Runnable runnable) {
    }

    public final void c() {
    }

    public final void c(Runnable runnable) {
    }

    public final void a(StereoRenderer stereoRenderer) {
        ahnn ahnn = new ahnn(stereoRenderer);
        this.d = ahnn;
        this.g.setRenderer(new ahnk(this, ahnn));
    }

    public final void a(boolean z) {
        xtl.c("Stereo mode (VR mode) not supported without GvrView support");
    }

    public final GvrViewerParams a() {
        return new GvrViewerParams();
    }

    public final void a(Runnable runnable) {
        this.g.queueEvent(runnable);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.g.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    public final void a(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.g.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public final void d() {
        if (this.f) {
            if (this.e == null) {
                this.e = new CountDownLatch(1);
                a(new ahnm(this));
                try {
                    this.e.await();
                } catch (InterruptedException e) {
                    String valueOf = String.valueOf(e.toString());
                    String str = "Interrupted during shutdown: ";
                    xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
                this.e = null;
            }
            return;
        }
        xtl.c("The GlSurfaceViewWrapper cannot be shutdown if it's not attached.");
    }

    public final ViewGroup e() {
        return this.h;
    }
}
