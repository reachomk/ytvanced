package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: ukk */
public final class ukk {
    private final MediaCodec a;
    private final int b;

    private ukk(MediaCodec mediaCodec, int i) {
        this.a = mediaCodec;
        this.b = i;
    }

    public static ukk a(MediaCodec mediaCodec) {
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000);
        return dequeueInputBuffer >= 0 ? new ukk(mediaCodec, dequeueInputBuffer) : null;
    }

    public final boolean a(ByteBuffer byteBuffer, long j, int i) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.a.getInputBuffers()[this.b];
        byteBuffer2.clear();
        byteBuffer.limit(position + Math.min(byteBuffer2.remaining(), limit - position));
        byteBuffer2.put(byteBuffer).flip();
        this.a.queueInputBuffer(this.b, 0, byteBuffer2.remaining(), j, i);
        byteBuffer.limit(limit);
        return byteBuffer.hasRemaining();
    }
}
