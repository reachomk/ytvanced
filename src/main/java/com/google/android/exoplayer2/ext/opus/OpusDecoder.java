package com.google.android.exoplayer2.ext.opus;

import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import defpackage.aocf;
import defpackage.odf;
import defpackage.odj;
import defpackage.odl;
import defpackage.odm;
import defpackage.odo;
import defpackage.oew;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class OpusDecoder extends odl {
    public final int a;
    private final ExoMediaCrypto b;
    private final int c;
    private final int d;
    private final long e;
    private int f;

    public OpusDecoder(int i, List list, ExoMediaCrypto exoMediaCrypto) {
        List list2 = list;
        ExoMediaCrypto exoMediaCrypto2 = exoMediaCrypto;
        super(new odj[16], new SimpleOutputBuffer[16]);
        if (OpusLibrary.a()) {
            this.b = exoMediaCrypto2;
            if (exoMediaCrypto2 == null || OpusLibrary.opusIsSecureDecodeSupported()) {
                byte[] bArr = (byte[]) list2.get(0);
                int length = bArr.length;
                String str = "Header size is too small.";
                if (length >= 19) {
                    int i2 = bArr[9] & 255;
                    this.a = i2;
                    if (i2 <= 8) {
                        int i3;
                        i2 = a(bArr, 10);
                        int a = a(bArr, 16);
                        byte[] bArr2 = new byte[8];
                        int i4;
                        if (bArr[18] == (byte) 0) {
                            i4 = this.a;
                            if (i4 <= 2) {
                                i4 = i4 == 2 ? 1 : 0;
                                bArr2[0] = (byte) 0;
                                bArr2[1] = (byte) 1;
                                length = i4;
                                i3 = 1;
                            } else {
                                throw new oew("Invalid Header, missing stream map.");
                            }
                        }
                        i4 = this.a;
                        if (length >= i4 + 21) {
                            length = bArr[19] & 255;
                            int i5 = bArr[20] & 255;
                            System.arraycopy(bArr, 21, bArr2, 0, i4);
                            i3 = length;
                            length = i5;
                        } else {
                            throw new oew(str);
                        }
                        if (list.size() != 3) {
                            this.c = i2;
                            this.d = 3840;
                        } else if (((byte[]) list2.get(1)).length == 8 && ((byte[]) list2.get(2)).length == 8) {
                            long j = ByteBuffer.wrap((byte[]) list2.get(1)).order(ByteOrder.nativeOrder()).getLong();
                            long j2 = ByteBuffer.wrap((byte[]) list2.get(2)).order(ByteOrder.nativeOrder()).getLong();
                            this.c = a(j);
                            this.d = a(j2);
                        } else {
                            throw new oew("Invalid Codec Delay or Seek Preroll");
                        }
                        long opusInit = opusInit(48000, this.a, i3, length, a, bArr2);
                        this.e = opusInit;
                        if (opusInit != 0) {
                            a(i);
                            return;
                        }
                        throw new oew("Failed to initialize decoder");
                    }
                    StringBuilder stringBuilder = new StringBuilder(34);
                    stringBuilder.append("Invalid channel count: ");
                    stringBuilder.append(i2);
                    throw new oew(stringBuilder.toString());
                }
                throw new oew(str);
            }
            throw new oew("Opus decoder does not support secure decode.");
        }
        throw new oew("Failed to load decoder native libraries.");
    }

    private final native void opusClose(long j);

    private final native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private final native int opusGetErrorCode(long j);

    private final native String opusGetErrorMessage(long j);

    private final native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private final native void opusReset(long j);

    private final native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer, int i2, ExoMediaCrypto exoMediaCrypto, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    public final String a() {
        String valueOf = String.valueOf(OpusLibrary.a() ? OpusLibrary.opusGetVersion() : null);
        String str = "libopus";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* Access modifiers changed, original: protected|final */
    public final odj i() {
        return new odj(2);
    }

    public final void e() {
        super.e();
        opusClose(this.e);
    }

    private static int a(long j) {
        return (int) ((j * 48000) / 1000000000);
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Exception a(odj odj, odm odm, boolean z) {
        SimpleOutputBuffer simpleOutputBuffer;
        int opusSecureDecode;
        OpusDecoder opusDecoder;
        odj odj2 = odj;
        SimpleOutputBuffer simpleOutputBuffer2 = (SimpleOutputBuffer) odm;
        if (z) {
            opusReset(this.e);
            this.f = odj2.c != 0 ? this.d : this.c;
        }
        ByteBuffer byteBuffer = odj2.b;
        odf odf = odj2.a;
        if (odj.c()) {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusSecureDecode = opusSecureDecode(this.e, odj2.c, byteBuffer, byteBuffer.limit(), simpleOutputBuffer2, 48000, this.b, odf.c, odf.b, odf.a, odf.f, odf.d, odf.e);
            opusDecoder = this;
        } else {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusDecoder = this;
            opusSecureDecode = opusDecode(opusDecoder.e, odj2.c, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
        }
        String valueOf;
        if (opusSecureDecode >= 0) {
            SimpleOutputBuffer simpleOutputBuffer3 = simpleOutputBuffer;
            ByteBuffer byteBuffer2 = simpleOutputBuffer3.data;
            byteBuffer2.position(0);
            byteBuffer2.limit(opusSecureDecode);
            int i = opusDecoder.f;
            if (i <= 0) {
                return null;
            }
            int i2 = opusDecoder.a;
            i2 += i2;
            int i3 = i * i2;
            if (opusSecureDecode <= i3) {
                opusDecoder.f = i - (opusSecureDecode / i2);
                simpleOutputBuffer3.addFlag(aocf.UNSET_ENUM_VALUE);
                byteBuffer2.position(opusSecureDecode);
                return null;
            }
            opusDecoder.f = 0;
            byteBuffer2.position(i3);
            return null;
        } else if (opusSecureDecode != -2) {
            valueOf = String.valueOf(opusDecoder.opusGetErrorMessage((long) opusSecureDecode));
            String str = "Decode error: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            return new oew(valueOf);
        } else {
            valueOf = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecoder.e));
            String str2 = "Drm error: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            opusDecoder.opusGetErrorCode(opusDecoder.e);
            return new oew(valueOf, new odo(valueOf));
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ odm j() {
        return new SimpleOutputBuffer(this);
    }
}
