package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: agoj */
public final class agoj {
    public static agoh a(FileChannel fileChannel) {
        FileChannel fileChannel2 = fileChannel;
        long position = fileChannel.position();
        if (position > 0) {
            fileChannel2.position(-1 + position);
            agoj.a(fileChannel2, 1);
        }
        byte[] bArr = null;
        try {
            agoj.a(fileChannel2, 1);
            fileChannel2.position(position);
            long a = agoj.a(agoj.a(fileChannel2, 4));
            if (a < 8 && a > 1) {
                StringBuilder stringBuilder = new StringBuilder(72);
                stringBuilder.append("Plausibility check failed: boxSize < 8 (boxSize = ");
                stringBuilder.append(a);
                stringBuilder.append(").");
                throw new agml(stringBuilder.toString());
            }
            long a2;
            String b = agoj.b(agoj.a(fileChannel2, 4));
            if (a == 1) {
                ByteBuffer a3 = agoj.a(fileChannel2, 8);
                long a4 = agoj.a(a3) << 32;
                if (a4 >= 0) {
                    a2 = a4 + agoj.a(a3);
                } else {
                    throw new agml("Unable to handle uint64.");
                }
            }
            if (a == 0) {
                a = (fileChannel.size() - fileChannel.position()) + 8;
            }
            a2 = a;
            if ("uuid".equals(b)) {
                bArr = agoj.a(fileChannel2, 16).array();
            }
            long position2 = fileChannel.position();
            agoe agoe = new agoe(b, bArr != null ? agos.a(bArr) : 1, "ftyp".equals(b) ? agoj.b(agoj.a(fileChannel2, 4)) : "", a2, position, position2);
            position += a2;
            if (position >= 0) {
                fileChannel2.position(position);
                return agoe;
            }
            throw new agml("Unable to handle new position.");
        } catch (EOFException unused) {
            return null;
        }
    }

    private static ByteBuffer a(FileChannel fileChannel, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (true) {
            int read = fileChannel.read(allocate);
            i2 += read;
            if (i2 >= i) {
                allocate.rewind();
                return allocate;
            } else if (read < 0) {
                throw new EOFException();
            }
        }
    }

    private static long a(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    private static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return new String(bArr, ampv.c);
    }
}
