package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View.MeasureSpec;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer;

/* renamed from: ahro */
public final class ahro extends afju implements aewz, ofb {
    private final GLSurfaceView h;
    private final ahrq i;

    public ahro(Context context) {
        super(context);
        this.h = new GLSurfaceView(context);
        this.h.setPreserveEGLContextOnPause(true);
        this.h.setEGLContextClientVersion(2);
        this.h.setEGLWindowSurfaceFactory(new ahop(context));
        this.i = new ahrq(new ahxb(context), new Handler(new ahrr(this)));
        this.h.setRenderer(this.i);
        this.h.setRenderMode(0);
        addView(this.h);
        this.b = this;
        this.c = this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void s() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void t() {
    }

    public final void a(VpxOutputBuffer vpxOutputBuffer) {
        ahrq ahrq = this.i;
        ahsf ahsf = ahrq.c;
        if (ahsf != null) {
            ahsf.a(vpxOutputBuffer);
            ahrq.d = true;
        } else {
            vpxOutputBuffer.release();
        }
        this.h.requestRender();
    }

    public final void a(com.google.android.exoplayer2.ext.vp9.VpxOutputBuffer vpxOutputBuffer) {
        ahrq ahrq = this.i;
        ahsf ahsf = ahrq.c;
        if (ahsf != null) {
            ahsf.a(vpxOutputBuffer);
            ahrq.d = true;
        } else {
            vpxOutputBuffer.release();
        }
        this.h.requestRender();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.h, MeasureSpec.makeMeasureSpec(this.d, 1073741824), MeasureSpec.makeMeasureSpec(this.e, 1073741824));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4);
        a(this.h, i3 - i, i4 - i2);
    }

    public final afkn o() {
        return afkn.GL_VPX;
    }

    public final void m() {
        ahrq ahrq = this.i;
        ahso ahso = ahrq.a;
        if (ahso != null) {
            ahso.a();
            ahrq.a = null;
        }
        ahwj ahwj = ahrq.b;
        if (ahwj != null) {
            ahwj.e();
            ahrq.b = null;
        }
        ahsf ahsf = ahrq.c;
        if (ahsf != null) {
            ahsf.b();
            ahrq.c = null;
        }
    }

    public final void setVisibility(int i) {
        if (VERSION.SDK_INT > 19) {
            this.h.setVisibility(i);
        }
        super.setVisibility(i);
    }
}
