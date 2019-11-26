package defpackage;

import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.ZipException;

/* renamed from: ammn */
public final class ammn {
    public static amms a(RandomAccessFile randomAccessFile, long j, int i) {
        randomAccessFile.seek(j);
        int reverseBytes = Integer.reverseBytes(randomAccessFile.readInt());
        if (reverseBytes == 101075792) {
            randomAccessFile.skipBytes(12);
            byte[] bArr = new byte[40];
            randomAccessFile.readFully(bArr);
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            try {
                int i2 = order.getInt();
                int i3 = order.getInt();
                long j2 = order.getLong();
                long j3 = order.getLong();
                order.getLong();
                long j4 = order.getLong();
                if (j2 == j3 && i2 == 0 && i3 == 0) {
                    return new amms(j2, j4, i);
                }
                StringBuilder stringBuilder = new StringBuilder(163);
                stringBuilder.append("Spanned archives not supported : numEntries=");
                stringBuilder.append(j2);
                stringBuilder.append(", totalNumEntries=");
                stringBuilder.append(j3);
                stringBuilder.append(", diskNumber=");
                stringBuilder.append(i2);
                stringBuilder.append(", diskWithCentralDirStart=");
                stringBuilder.append(i3);
                throw new ZipException(stringBuilder.toString());
            } catch (BufferUnderflowException e) {
                ZipException zipException = new ZipException("Error parsing zip64 eocd record.");
                zipException.initCause(e);
                throw zipException;
            }
        }
        String toHexString = Integer.toHexString(reverseBytes);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(toHexString).length() + 66);
        stringBuilder2.append("Invalid zip64 eocd record offset, sig=");
        stringBuilder2.append(toHexString);
        stringBuilder2.append(" offset=");
        stringBuilder2.append(j);
        throw new ZipException(stringBuilder2.toString());
    }

    public static boolean a(ammq ammq) {
        int a;
        int position;
        byte[] bArr = ammq.e;
        if (bArr != null && bArr.length > 0) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            a = ammn.a(order);
            if (a != -1) {
                position = order.position();
                try {
                    if (ammq.c == 4294967295L) {
                        ammq.c = order.getLong();
                    }
                    if (ammq.b == 4294967295L) {
                        ammq.b = order.getLong();
                    }
                    if (ammq.f == 4294967295L) {
                        ammq.f = order.getLong();
                    }
                } catch (BufferUnderflowException e) {
                    ZipException zipException = new ZipException("Error parsing extended info");
                    zipException.initCause(e);
                    throw zipException;
                }
            }
            position = -1;
        } else {
            a = -1;
            position = 0;
        }
        if (a == -1) {
            long j = ammq.b;
            if (j != 4294967295L && ammq.c != 4294967295L && ammq.f != 4294967295L) {
                return false;
            }
            String str = ammq.a;
            long j2 = ammq.c;
            long j3 = ammq.f;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 146);
            stringBuilder.append("File contains no zip64 extended information: name=");
            stringBuilder.append(str);
            stringBuilder.append("compressedSize=");
            stringBuilder.append(j);
            stringBuilder.append(", size=");
            stringBuilder.append(j2);
            stringBuilder.append(", localHeader=");
            stringBuilder.append(j3);
            throw new ZipException(stringBuilder.toString());
        }
        position -= 4;
        a += 4;
        bArr = ammq.e;
        int length = bArr.length - a;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, position);
        System.arraycopy(ammq.e, a + position, bArr2, position, length - position);
        ammq.e = bArr2;
        return true;
    }

    private static int a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            try {
                char c = (char) byteBuffer.getShort();
                if (((char) byteBuffer.getShort()) != 1) {
                    byteBuffer.position(byteBuffer.position() + c);
                } else if (byteBuffer.remaining() >= c) {
                    return c;
                } else {
                    return -1;
                }
            } catch (IllegalArgumentException | BufferUnderflowException unused) {
            }
        }
        return -1;
    }
}
