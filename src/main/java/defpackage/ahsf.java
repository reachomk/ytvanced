package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahsf */
public final class ahsf implements aewz, ahsr, ofb {
    public final Handler a;
    private final int[] b = new int[3];
    private final float[] c;
    private final AtomicReference d;
    private int e = 2;
    private float f;
    private ahtn g;
    private long h;

    public ahsf(Handler handler) {
        this.a = (Handler) amqw.a((Object) handler);
        GLES20.glGenTextures(3, this.b, 0);
        for (int i = 0; i < 3; i++) {
            ahsl.a(this.b[i]);
        }
        this.d = new AtomicReference();
        this.c = new float[16];
        Matrix.setIdentityM(this.c, 0);
        float[] fArr = this.c;
        fArr[5] = -1.0f;
        fArr[13] = 1.0f;
    }

    public final void a() {
    }

    public final boolean d() {
        return true;
    }

    private final synchronized void a(ahtm ahtm) {
        ahtm = (ahtm) this.d.getAndSet(ahtm);
        if (ahtm != null) {
            ahtm.c();
        }
    }

    public final synchronized void a(VpxOutputBuffer vpxOutputBuffer) {
        ahtm ahtm = (ahtm) ahtm.a.a();
        if (ahtm == null) {
            ahtm = new ahtm();
        }
        ahtm.b = (VpxOutputBuffer) amqw.a((Object) vpxOutputBuffer);
        ahtm.c = null;
        nlj nlj = vpxOutputBuffer.colorInfo;
        if (nlj != null) {
            ahtm.d = new ahtn(nlj);
        } else {
            ahtm.d = null;
        }
        a(ahtm);
    }

    public final synchronized void a(com.google.android.exoplayer2.ext.vp9.VpxOutputBuffer vpxOutputBuffer) {
        ahtm ahtm = (ahtm) ahtm.a.a();
        if (ahtm == null) {
            ahtm = new ahtm();
        }
        ahtm.b = null;
        ahtm.c = (com.google.android.exoplayer2.ext.vp9.VpxOutputBuffer) amqw.a((Object) vpxOutputBuffer);
        ozt ozt = vpxOutputBuffer.colorInfo;
        if (ozt != null) {
            ahtm.d = new ahtn(ozt);
        } else {
            ahtm.d = null;
        }
        a(ahtm);
    }

    public final void c() {
        int i;
        ahtm ahtm = (ahtm) this.d.getAndSet(null);
        for (i = 0; i < 3; i++) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.b[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (ahtm != null) {
                int a;
                ByteBuffer[] byteBufferArr;
                if (i != 0) {
                    a = (ahtm.a() + 1) / 2;
                } else {
                    a = ahtm.a();
                }
                int i2 = a;
                GLES20.glPixelStorei(3317, 1);
                int i3 = ahtm.b()[i];
                VpxOutputBuffer vpxOutputBuffer = ahtm.b;
                if (vpxOutputBuffer != null) {
                    byteBufferArr = vpxOutputBuffer.yuvPlanes;
                } else {
                    byteBufferArr = ahtm.c.yuvPlanes;
                }
                GLES20.glTexImage2D(3553, 0, 6409, i3, i2, 0, 6409, 5121, byteBufferArr[i]);
            }
        }
        if (ahtm != null) {
            int i4;
            long j;
            VpxOutputBuffer vpxOutputBuffer2 = ahtm.b;
            if (vpxOutputBuffer2 != null) {
                i4 = vpxOutputBuffer2.colorspace;
            } else {
                i4 = ahtm.c.colorspace;
            }
            this.e = i4;
            this.g = ahtm.d;
            if (vpxOutputBuffer2 == null) {
                i = ahtm.c.width;
            } else {
                i = vpxOutputBuffer2.width;
            }
            this.f = (((float) i) - 8.0f) / ((float) ahtm.b()[0]);
            VpxOutputBuffer vpxOutputBuffer3 = ahtm.b;
            if (vpxOutputBuffer3 != null) {
                j = vpxOutputBuffer3.timestampUs;
            } else {
                j = ahtm.c.timeUs;
            }
            this.h = j;
            ahtm.c();
            ahsl.b();
        }
    }

    public final void b() {
        GLES20.glDeleteTextures(3, this.b, 0);
        ahsl.b();
        for (int i = 0; i < 3; i++) {
            this.b[i] = 0;
        }
    }

    public final int e() {
        return this.e;
    }

    public final float f() {
        return this.f;
    }

    public final float[] g() {
        return this.c;
    }

    public final ahtn h() {
        return this.g;
    }

    public final long i() {
        return this.h;
    }
}
