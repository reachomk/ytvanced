package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: iyl */
final class iyl implements iyn {
    private boolean a;
    private MediaCodec b;
    private boolean c = false;
    private boolean d;
    private boolean e;
    private ByteBuffer[] f;
    private ByteBuffer[] g;
    private int h;

    public iyl(boolean z) {
        this.c = z;
        this.h = 1;
    }

    public final anvu a(byte[] bArr, int i) {
        anwd h = anvu.h();
        if (!this.e) {
            try {
                int i2 = this.h;
                int i3 = i2 - 1;
                byte[] bArr2 = null;
                if (i2 == 0) {
                    throw null;
                } else if (i3 != 0) {
                    if (i3 == 1) {
                        bArr2 = "#!AMR-WB\n".getBytes();
                    } else if (i3 == 2) {
                        bArr2 = new byte[0];
                    } else if (i3 == 3) {
                        throw new IllegalStateException("Should never happen! Use OggOpusEncoder instead.");
                    }
                    h.write(bArr2);
                    this.e = true;
                } else {
                    throw new IllegalStateException("Trying to make header for unspecified codec!");
                }
            } catch (IOException unused) {
                xtl.c("Unable to write bytes into buffer!");
            }
        }
        int i4 = 0;
        while (i4 < i) {
            int min = Math.min(4096, i - i4);
            a(bArr, i4, min, false, h);
            i4 += min;
        }
        return h.a();
    }

    public final anvu a() {
        anwd h = anvu.h();
        try {
            a(null, 0, 0, true, h);
            this.b.stop();
        } catch (CodecException unused) {
            xtl.c("Something went wrong in the underlying codec!");
        }
        this.b.release();
        return h.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    private final void a(byte[] r23, int r24, int r25, boolean r26, defpackage.anwd r27) {
        /*
        r22 = this;
        r0 = r22;
        r8 = r25;
        r9 = 0;
        r10 = 1;
        r1 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r8 > r1) goto L_0x000c;
    L_0x000a:
        r1 = 1;
        goto L_0x000d;
    L_0x000c:
        r1 = 0;
    L_0x000d:
        r2 = "length must be less than or equal to CHUNK_SIZE_BYTES!";
        defpackage.amqw.a(r1, r2);
        r11 = new android.media.MediaCodec$BufferInfo;
        r11.<init>();
        r1 = 0;
    L_0x0018:
        if (r1 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001d;
    L_0x001b:
        if (r26 == 0) goto L_0x00e0;
    L_0x001d:
        r12 = -1;
        r13 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r1 == 0) goto L_0x0025;
    L_0x0022:
        r15 = r23;
        goto L_0x0070;
    L_0x0025:
        if (r26 != 0) goto L_0x0028;
    L_0x0027:
        goto L_0x002c;
    L_0x0028:
        r2 = r0.d;
        if (r2 != 0) goto L_0x00d8;
    L_0x002c:
        r2 = r0.b;
        r2 = r2.dequeueInputBuffer(r13);
        if (r2 == r12) goto L_0x0022;
    L_0x0034:
        if (r26 == 0) goto L_0x004b;
    L_0x0036:
        r15 = r0.b;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r21 = 4;
        r16 = r2;
        r15.queueInputBuffer(r16, r17, r18, r19, r21);
        r0.d = r10;
        r15 = r23;
    L_0x0049:
        r1 = 1;
        goto L_0x0070;
    L_0x004b:
        r1 = r0.c;
        if (r1 == 0) goto L_0x0054;
    L_0x004f:
        r1 = r0.f;
        r1 = r1[r2];
        goto L_0x005a;
    L_0x0054:
        r1 = r0.b;
        r1 = r1.getInputBuffer(r2);
    L_0x005a:
        r15 = r23;
        r7 = r24;
        r1.put(r15, r7, r8);
        r1 = r0.b;
        r3 = 0;
        r5 = 0;
        r16 = 0;
        r4 = r25;
        r7 = r16;
        r1.queueInputBuffer(r2, r3, r4, r5, r7);
        goto L_0x0049;
    L_0x0070:
        r2 = r0.b;
        r2 = r2.dequeueOutputBuffer(r11, r13);
        if (r2 != r12) goto L_0x007b;
    L_0x0078:
        r2 = r27;
        goto L_0x00bf;
    L_0x007b:
        r3 = -2;
        if (r2 == r3) goto L_0x00b7;
    L_0x007e:
        r3 = -3;
        if (r2 == r3) goto L_0x00a8;
    L_0x0081:
        r3 = r0.c;
        if (r3 == 0) goto L_0x008a;
    L_0x0085:
        r3 = r0.g;
        r3 = r3[r2];
        goto L_0x0090;
    L_0x008a:
        r3 = r0.b;
        r3 = r3.getOutputBuffer(r2);
    L_0x0090:
        r4 = r11.size;
        r4 = new byte[r4];
        r3.get(r4);
        r3 = r0.b;
        r3.releaseOutputBuffer(r2, r9);
        r2 = r27;
        r2.write(r4);	 Catch:{ IOException -> 0x00a2 }
        goto L_0x00bf;
    L_0x00a2:
        r3 = "Unable to write bytes into buffer!";
        defpackage.xtl.c(r3);
        goto L_0x00bf;
    L_0x00a8:
        r2 = r27;
        r3 = r0.c;
        if (r3 == 0) goto L_0x00bf;
    L_0x00ae:
        r3 = r0.b;
        r3 = r3.getOutputBuffers();
        r0.g = r3;
        goto L_0x00bf;
    L_0x00b7:
        r2 = r27;
        r3 = r0.a;
        if (r3 != 0) goto L_0x00d0;
    L_0x00bd:
        r0.a = r10;
    L_0x00bf:
        r3 = r11.flags;
        r3 = r3 & 4;
        if (r3 == 0) goto L_0x0018;
    L_0x00c5:
        if (r1 == 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00e0;
    L_0x00c8:
        r1 = new java.lang.IllegalStateException;
        r2 = "Didn't process input yet.";
        r1.<init>(r2);
        throw r1;
    L_0x00d0:
        r1 = new java.lang.IllegalStateException;
        r2 = "The codec format was unexpectedly changed.";
        r1.<init>(r2);
        throw r1;
    L_0x00d8:
        r1 = new java.lang.IllegalStateException;
        r2 = "Already flushed!";
        r1.<init>(r2);
        throw r1;
    L_0x00e0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iyl.a(byte[], int, int, boolean, anwd):void");
    }

    public final void a(int i, int i2) {
        int b = iym.b(i2);
        this.h = b;
        if (b == 1 || b == 4) {
            throw new iyo("Codec not set properly.");
        } else if (b != 2 || i == 16000) {
            MediaCodecInfo a = iym.a(iym.a(b));
            if (a != null) {
                this.b = MediaCodec.createByCodecName(a.getName());
                MediaFormat mediaFormat = new MediaFormat();
                int b2 = iym.b(i2);
                mediaFormat.setString("mime", iym.a(b2));
                mediaFormat.setInteger("sample-rate", i);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("max-input-size", 4096);
                if (b2 != 3) {
                    i = i2 - 1;
                    if (i2 != 0) {
                        mediaFormat.setInteger("bitrate", i);
                    } else {
                        throw null;
                    }
                }
                this.b.configure(mediaFormat, null, null, 1);
                this.b.start();
                if (this.c) {
                    this.f = this.b.getInputBuffers();
                    this.g = this.b.getOutputBuffers();
                }
                this.e = false;
                this.d = false;
                this.a = false;
                return;
            }
            throw new iyo("Encoder not found.");
        } else {
            throw new iyo("AMR-WB encoder requires a sample rate of 16kHz.");
        }
    }
}
