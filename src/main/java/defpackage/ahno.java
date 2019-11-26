package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.view.ViewGroup;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import com.google.vr.sdk.base.GvrViewerParams;

/* renamed from: ahno */
public final class ahno implements ahni {
    private final GvrView a;

    public ahno(Context context) {
        this.a = new GvrView((Context) amqw.a((Object) context));
    }

    public final void a(StereoRenderer stereoRenderer) {
        this.a.setRenderer(stereoRenderer);
    }

    public final void a(boolean z) {
        this.a.setStereoModeEnabled(z);
    }

    public final void b(Runnable runnable) {
        this.a.setOnCloseButtonListener(runnable);
    }

    public final void c(Runnable runnable) {
        this.a.setOnCardboardTriggerListener(runnable);
    }

    public final GvrViewerParams a() {
        return this.a.getGvrViewerParams();
    }

    public final void b() {
        this.a.onResume();
    }

    public final void c() {
        this.a.onPause();
    }

    public final void a(Runnable runnable) {
        this.a.queueEvent(runnable);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.a.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    public final void a(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public final void d() {
        this.a.shutdown();
    }

    public final ViewGroup e() {
        return this.a;
    }
}
