package defpackage;

import com.google.android.libraries.youtube.media.player.exo.libvpx.VpxOutputBuffer;

/* renamed from: ahtm */
public final class ahtm {
    public static final zy a = new aaa(4);
    public VpxOutputBuffer b;
    public com.google.android.exoplayer2.ext.vp9.VpxOutputBuffer c;
    public ahtn d;

    public final int a() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        if (vpxOutputBuffer != null) {
            return vpxOutputBuffer.height;
        }
        return this.c.height;
    }

    public final int[] b() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        if (vpxOutputBuffer != null) {
            return vpxOutputBuffer.yuvStrides;
        }
        return this.c.yuvStrides;
    }

    public final void c() {
        VpxOutputBuffer vpxOutputBuffer = this.b;
        if (vpxOutputBuffer != null) {
            vpxOutputBuffer.release();
        } else {
            this.c.release();
        }
        a.a(this);
    }
}
