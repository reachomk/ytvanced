package defpackage;

import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.view.ViewGroup;
import com.google.vr.sdk.base.GvrView.StereoRenderer;
import com.google.vr.sdk.base.GvrViewerParams;

/* renamed from: ahni */
public interface ahni extends ahsi {
    GvrViewerParams a();

    void a(int i, int i2, int i3, int i4);

    void a(EGLWindowSurfaceFactory eGLWindowSurfaceFactory);

    void a(StereoRenderer stereoRenderer);

    void a(boolean z);

    void b();

    void b(Runnable runnable);

    void c();

    void c(Runnable runnable);

    void d();

    ViewGroup e();
}
