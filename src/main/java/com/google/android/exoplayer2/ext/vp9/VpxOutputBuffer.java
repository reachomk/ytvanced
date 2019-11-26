package com.google.android.exoplayer2.ext.vp9;

import defpackage.odm;
import defpackage.ozt;
import java.nio.ByteBuffer;

public final class VpxOutputBuffer extends odm {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public ozt colorInfo;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public int height;
    public int mode;
    public final VpxDecoder owner;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VpxOutputBuffer(VpxDecoder vpxDecoder) {
        this.owner = vpxDecoder;
    }

    public final void release() {
        this.owner.a(this);
    }

    public final void init(long j, int i) {
        this.timeUs = j;
        this.mode = i;
    }

    public final boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        i = (int) ((((long) i2) + 1) / 2);
        if (isSafeToMultiply(i3, i2) && isSafeToMultiply(i4, i)) {
            i2 *= i3;
            i *= i4;
            i5 = (i + i) + i2;
            if (isSafeToMultiply(i, 2) && i5 >= i2) {
                initData(i5);
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                this.yuvPlanes[0] = this.data.slice();
                this.yuvPlanes[0].limit(i2);
                this.data.position(i2);
                this.yuvPlanes[1] = this.data.slice();
                this.yuvPlanes[1].limit(i);
                this.data.position(i2 + i);
                this.yuvPlanes[2] = this.data.slice();
                this.yuvPlanes[2].limit(i);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i3;
                iArr[1] = i4;
                iArr[2] = i4;
                return true;
            }
        }
        return false;
    }

    private final void initData(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i);
            return;
        }
        this.data.position(0);
        this.data.limit(i);
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
