package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ujz */
public final class ujz extends nmi implements nma {
    public ujr a;
    private long h = 0;
    private final boolean j = true;

    public ujz(nne nne) {
        super(nne, nmg.a, null, false, null, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nmg nmg, nmx nmx) {
        String str = nmx.b;
        boolean z = false;
        if (nwt.a(str)) {
            if ("audio/x-unknown".equals(str)) {
                z = true;
            } else if (nmg.a(str, false) == null) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, null, mediaCrypto, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, BufferInfo bufferInfo, int i, boolean z) {
        this.h = bufferInfo.presentationTimeUs;
        byteBuffer.position(bufferInfo.offset).limit(bufferInfo.offset + bufferInfo.size);
        if (this.a != null) {
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            this.a.a(byteBuffer.asShortBuffer(), integer, integer2);
        }
        mediaCodec.releaseOutputBuffer(i, false);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final nma h() {
        return !this.j ? null : this;
    }

    public final long k() {
        return this.h;
    }
}
