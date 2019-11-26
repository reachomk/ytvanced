package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.util.ArrayList;

/* renamed from: bafc */
public final class bafc extends GvrSurfaceView {
    private final bafb a;
    private boolean b;
    private boolean c;
    private ArrayList d;
    private final bafg e = new bafg();

    public bafc(Context context, bafb bafb) {
        super(context);
        this.a = bafb;
        setEGLContextFactory(this.e);
        setEGLWindowSurfaceFactory(this.e);
    }

    public final void onPause() {
        if (this.b) {
            super.onPause();
        }
    }

    public final void onResume() {
        if (this.b) {
            super.onResume();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        this.c = false;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                super.queueEvent((Runnable) arrayList.get(i));
                i++;
            }
            this.d.clear();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        if (this.b) {
            bafb bafb = this.a;
            if (bafb != null) {
                bafb.onSurfaceViewDetachedFromWindow();
            }
        }
        super.onDetachedFromWindow();
        this.c = true;
    }

    public final void setRenderer(Renderer renderer) {
        super.setRenderer(renderer);
        this.b = true;
    }

    public final void setEGLContextClientVersion(int i) {
        super.setEGLContextClientVersion(2);
        this.e.e = 2;
    }

    public final void queueEvent(Runnable runnable) {
        if (!this.b) {
            runnable.run();
        } else if (this.c) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(runnable);
        } else {
            super.queueEvent(runnable);
        }
    }

    static {
        bafc.class.getSimpleName();
    }
}
