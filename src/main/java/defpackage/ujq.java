package defpackage;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: ujq */
public final class ujq implements ujr {
    private final ujp a;
    private uke b;
    private long c = 0;
    private int d;
    private int e;

    public ujq(ujp ujp) {
        this.a = (ujp) uhy.a((Object) ujp);
    }

    public final void a(ShortBuffer shortBuffer, int i, int i2) {
        if (this.b == null) {
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Creating encoder rate:");
            stringBuilder.append(i);
            stringBuilder.append(" channels:");
            stringBuilder.append(i2);
            ujo.c(stringBuilder.toString());
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat.setInteger("bitrate", 128000);
            try {
                this.b = new uke(createAudioFormat);
                this.d = i;
                this.e = i2;
            } catch (IOException e) {
                throw new RuntimeException("Cannot create an audio encoder", e);
            }
        }
        uhy.a(this.d == i, "samplesPerSec changed from %s to %s", Integer.valueOf(this.d), Integer.valueOf(i));
        uhy.a(this.e == i2, "channelCount changed from %s to %s", Integer.valueOf(this.e), Integer.valueOf(i2));
        do {
            b();
            long remaining = ((((long) shortBuffer.remaining()) * 1000000) / ((long) i)) / ((long) i2);
            int position = shortBuffer.position();
            int remaining2 = shortBuffer.remaining();
            ByteBuffer allocate = ByteBuffer.allocate(remaining2 + remaining2);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.asShortBuffer().put(shortBuffer).flip();
            uke uke = this.b;
            long j = this.c;
            ukk a;
            do {
                a = ukk.a(uke.b);
                if (a == null) {
                    break;
                }
            } while (a.a(allocate, j, 0));
            this.c += remaining;
            shortBuffer.position(Math.min(position + (allocate.position() / 2), shortBuffer.limit()));
        } while (shortBuffer.remaining() > 0);
    }

    public final void a() {
        if (this.b != null) {
            ukk a;
            uke uke;
            long j;
            do {
                b();
                uke = this.b;
                j = this.c;
                a = ukk.a(uke.b);
            } while (a == null);
            a.a(ByteBuffer.allocate(0), j, 4);
            while (true) {
                uke = this.b;
                if (uke.c != 1) {
                    break;
                }
                b();
            }
            uke.c = 3;
            uke.b.stop();
            uke.b.release();
            this.b = null;
        } else {
            ujo.a("Encoder not started!");
        }
        this.a.a();
    }

    private final void b() {
        while (true) {
            int dequeueOutputBuffer;
            ukd ukd;
            uke uke = this.b;
            BufferInfo bufferInfo = new BufferInfo();
            while (true) {
                dequeueOutputBuffer = uke.b.dequeueOutputBuffer(bufferInfo, 1000);
                if (dequeueOutputBuffer >= 0) {
                    if ((bufferInfo.flags & 4) != 0) {
                        uke.c = 2;
                    }
                    ByteBuffer[] outputBuffers = uke.b.getOutputBuffers();
                    uhy.a(dequeueOutputBuffer, outputBuffers.length);
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    ukd = new ukd(uke, dequeueOutputBuffer, byteBuffer, bufferInfo);
                } else if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        if (dequeueOutputBuffer == -1) {
                            ukd = null;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(26);
                            stringBuilder.append("Invalid index: ");
                            stringBuilder.append(dequeueOutputBuffer);
                            throw new ukg(stringBuilder.toString());
                        }
                    } else if (uke.a == null) {
                        uke.a = uke.b.getOutputFormat();
                    } else {
                        throw new ukg("Output format changed twice");
                    }
                }
            }
            if (ukd != null) {
                ukd.c.position(ukd.d.offset);
                ukd.c.limit(ukd.d.offset + ukd.d.size);
                int i = this.d;
                dequeueOutputBuffer = this.e;
                MediaFormat mediaFormat = this.b.a;
                if (mediaFormat != null) {
                    i = mediaFormat.getInteger("sample-rate");
                    dequeueOutputBuffer = mediaFormat.getInteger("channel-count");
                }
                this.a.a(ukd.c, i, dequeueOutputBuffer);
                ukd.b.b.releaseOutputBuffer(ukd.a, false);
            } else {
                return;
            }
        }
    }
}
