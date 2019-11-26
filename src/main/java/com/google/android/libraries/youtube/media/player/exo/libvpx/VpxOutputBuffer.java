package com.google.android.libraries.youtube.media.player.exo.libvpx;

import defpackage.nlj;
import defpackage.nxj;
import java.nio.ByteBuffer;

public final class VpxOutputBuffer extends nxj {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public nlj colorInfo;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public int height;
    public int mode;
    public final VpxDecoder owner;
    public int width;
    public ByteBuffer[] yuvPlanes = new ByteBuffer[3];
    public int[] yuvStrides = new int[3];

    VpxOutputBuffer(VpxDecoder vpxDecoder) {
        this.owner = vpxDecoder;
    }

    public final void release() {
        this.owner.a(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean initForRgbFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
        if (isSafeToMultiply(i, i2)) {
            i *= i2;
            if (isSafeToMultiply(i, 2)) {
                i += i;
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i) {
                    try {
                        this.data = ByteBuffer.allocateDirect(i);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                this.data.position(0);
                this.data.limit(i);
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean allocateYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        i = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i)) {
            i2 *= i3;
            i *= i4;
            i5 = (i + i) + i2;
            if (isSafeToMultiply(i, 2) && i5 >= i2) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i5) {
                    try {
                        this.data = ByteBuffer.allocateDirect(i5);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                this.data.limit(i5);
                this.data.position(0);
                this.yuvPlanes[0] = this.data.slice();
                this.yuvPlanes[0].limit(i2);
                this.data.position(i2);
                this.yuvPlanes[1] = this.data.slice();
                this.yuvPlanes[1].limit(i);
                this.data.position(i2 + i);
                this.yuvPlanes[2] = this.data.slice();
                this.yuvPlanes[2].limit(i);
                int[] iArr = this.yuvStrides;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void assignYuvFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.width = i;
        this.height = i2;
        this.colorspace = i8;
        this.data = byteBuffer;
        this.data.position(i3);
        this.yuvPlanes[0] = this.data.slice();
        this.yuvPlanes[0].limit(i6 * i2);
        this.data.position(i4);
        i = ((int) ((((long) i2) + 1) / 2)) * i7;
        this.yuvPlanes[1] = this.data.slice();
        this.yuvPlanes[1].limit(i);
        this.data.position(i5);
        this.yuvPlanes[2] = this.data.slice();
        this.yuvPlanes[2].limit(i);
        int[] iArr = this.yuvStrides;
        iArr[0] = i6;
        iArr[1] = i7;
        iArr[2] = i7;
    }

    private final boolean isSafeToMultiply(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i2 >= 0) {
            if (i2 > 0) {
                return i >= Integer.MAX_VALUE / i2 ? z : true;
            } else {
                z = true;
            }
        }
    }
}
