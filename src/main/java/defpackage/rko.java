package defpackage;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rko */
public final class rko {
    public static Pair a(RandomAccessFile randomAccessFile, int i) {
        long length = randomAccessFile.length();
        if (length >= 22) {
            int i2;
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            length -= (long) allocate.capacity();
            randomAccessFile.seek(length);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            rko.a(allocate);
            int capacity = allocate.capacity();
            if (capacity >= 22) {
                capacity -= 22;
                char min = Math.min(capacity, 65535);
                char c = 0;
                while (c < min) {
                    i2 = capacity - c;
                    if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == c) {
                        break;
                    }
                    c++;
                }
            }
            i2 = -1;
            if (i2 != -1) {
                allocate.position(i2);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(length + ((long) i2)));
            }
        }
        return null;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }
}
