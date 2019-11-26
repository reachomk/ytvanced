package com.google.android.exoplayer.ext.opus;

import defpackage.nnb;
import defpackage.nqw;
import defpackage.nxj;
import defpackage.nxk;
import defpackage.nxm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class OpusDecoder extends nxm {
    public static final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private int f;

    public OpusDecoder(List list) {
        super(new nxk[16], new OpusOutputBuffer[16]);
        int i = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        String str = "Header size is too small.";
        if (length >= 19) {
            int i2 = bArr[9] & 255;
            this.b = i2;
            if (i2 <= 8) {
                int i3;
                i2 = a(bArr, 10);
                int a = a(bArr, 16);
                byte[] bArr2 = new byte[8];
                int i4;
                if (bArr[18] == (byte) 0) {
                    i4 = this.b;
                    if (i4 <= 2) {
                        i4 = i4 == 2 ? 1 : 0;
                        bArr2[0] = (byte) 0;
                        bArr2[1] = (byte) 1;
                        length = i4;
                        i3 = 1;
                    } else {
                        throw new nqw("Invalid Header, missing stream map.");
                    }
                } else if (length >= this.b + 21) {
                    i4 = bArr[19] & 255;
                    length = bArr[20] & 255;
                    while (i < this.b) {
                        bArr2[i] = bArr[i + 21];
                        i++;
                    }
                    i3 = i4;
                } else {
                    throw new nqw(str);
                }
                if (list.size() != 3) {
                    this.c = i2;
                    this.d = 3840;
                } else if (((byte[]) list.get(1)).length == 8 && ((byte[]) list.get(2)).length == 8) {
                    long j = ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong();
                    long j2 = ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong();
                    this.c = a(j);
                    this.d = a(j2);
                } else {
                    throw new nqw("Invalid Codec Delay or Seek Preroll");
                }
                long opusInit = opusInit(48000, this.b, i3, length, a, bArr2);
                this.e = opusInit;
                if (opusInit != 0) {
                    a(5760);
                    return;
                }
                throw new nqw("Failed to initialize decoder");
            }
            StringBuilder stringBuilder = new StringBuilder(34);
            stringBuilder.append("Invalid channel count: ");
            stringBuilder.append(i2);
            throw new nqw(stringBuilder.toString());
        }
        throw new nqw(str);
    }

    public static native String getLibopusVersion();

    private final native void opusClose(long j);

    private final native int opusDecode(long j, ByteBuffer byteBuffer, int i, OpusOutputBuffer opusOutputBuffer, int i2);

    private final native String opusGetErrorMessage(int i);

    private final native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private final native void opusReset(long j);

    public final nxk a() {
        return new nxk();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(OpusOutputBuffer opusOutputBuffer) {
        super.a((nxj) opusOutputBuffer);
    }

    public final void b() {
        super.b();
        opusClose(this.e);
    }

    private static int a(long j) {
        return (int) ((j * 48000) / 1000000000);
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public final /* synthetic */ Exception a(nxk nxk, nxj nxj, boolean z) {
        OpusOutputBuffer opusOutputBuffer = (OpusOutputBuffer) nxj;
        if (z) {
            opusReset(this.e);
            this.f = nxk.a.e != 0 ? this.d : this.c;
        }
        nnb nnb = nxk.a;
        opusOutputBuffer.timestampUs = nnb.e;
        ByteBuffer byteBuffer = nnb.b;
        byteBuffer.position(byteBuffer.position() - nnb.c);
        int opusDecode = opusDecode(this.e, nnb.b, nnb.c, opusOutputBuffer, 48000);
        Exception exception = null;
        if (opusDecode < 0) {
            String valueOf = String.valueOf(opusGetErrorMessage(opusDecode));
            String str = "Decode error: ";
            exception = new nqw(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } else {
            opusOutputBuffer.data.position(0);
            opusOutputBuffer.data.limit(opusDecode);
            int i = this.f;
            if (i > 0) {
                int i2 = this.b;
                i2 += i2;
                int i3 = i * i2;
                if (opusDecode <= i3) {
                    this.f = i - (opusDecode / i2);
                    opusOutputBuffer.setFlag(2);
                    opusOutputBuffer.data.position(opusDecode);
                } else {
                    this.f = 0;
                    opusOutputBuffer.data.position(i3);
                }
            }
        }
        return exception;
    }

    public final /* synthetic */ nxj c() {
        return new OpusOutputBuffer(this);
    }

    static {
        boolean z;
        try {
            System.loadLibrary("opusJNI");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }
}
