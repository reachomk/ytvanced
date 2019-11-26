package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.zip.Adler32;

/* renamed from: unv */
final class unv implements WritableByteChannel {
    public long a;
    public boolean b;
    private final Adler32 c = new Adler32();
    private final ArrayList d;

    public unv(ArrayList arrayList) {
        uhy.a((Object) arrayList);
        this.d = arrayList;
    }

    public final boolean isOpen() {
        return this.b ^ 1;
    }

    public final void close() {
        if (!this.b) {
            if (this.a % 10485760 != 0) {
                this.d.add(Long.valueOf(this.c.getValue()));
            }
            this.b = true;
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        byte[] array;
        int arrayOffset;
        int remaining;
        uhy.b(this.b ^ 1);
        if (byteBuffer.hasArray()) {
            array = byteBuffer.array();
            arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            remaining = byteBuffer.remaining();
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            array = new byte[byteBuffer.remaining()];
            byteBuffer.get(array);
            remaining = array.length;
            arrayOffset = 0;
        }
        long j = this.a % 10485760;
        int i = remaining;
        while (i > 0) {
            int i2 = (int) (10485760 - j);
            if (i >= i2) {
                this.c.update(array, arrayOffset, i2);
                this.d.add(Long.valueOf(this.c.getValue()));
                this.c.reset();
                arrayOffset += i2;
                i -= i2;
                j = 0;
            } else {
                this.c.update(array, arrayOffset, i);
                j += (long) i;
                arrayOffset += i;
                i = 0;
            }
        }
        this.a += (long) remaining;
        return remaining;
    }
}
