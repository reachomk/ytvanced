package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;

/* renamed from: cla */
public final class cla extends ckv {
    public cla() {
        super("mp4s");
    }

    public cla(String str) {
        super(str);
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        byteBuffer = ByteBuffer.allocate(8);
        bakq.a(byteBuffer);
        byteBuffer.position(6);
        this.a = cio.c(byteBuffer);
        a(bakq, j - 8, cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        cin.b(allocate, this.a);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.asList(new List[]{b()}));
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 15);
        stringBuilder.append("MpegSampleEntry");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public final long d() {
        long n = n() + 8;
        int i = 16;
        if (!this.g && n < 4294967296L) {
            i = 8;
        }
        return n + ((long) i);
    }
}
