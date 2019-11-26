package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: ayo */
final class ayo extends InputStream implements DataInput {
    private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
    public ByteOrder a;
    public final int b;
    public int c;
    private DataInputStream f;

    public ayo(InputStream inputStream) {
        this.a = ByteOrder.BIG_ENDIAN;
        this.f = new DataInputStream(inputStream);
        int available = this.f.available();
        this.b = available;
        this.c = 0;
        this.f.mark(available);
    }

    public final String readLine() {
        return null;
    }

    public ayo(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public final void a(long j) {
        long j2 = (long) this.c;
        if (j2 > j) {
            this.c = 0;
            this.f.reset();
            this.f.mark(this.b);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) != i) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final int available() {
        return this.f.available();
    }

    public final int read() {
        this.c++;
        return this.f.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public final int readUnsignedByte() {
        this.c++;
        return this.f.readUnsignedByte();
    }

    public final boolean readBoolean() {
        this.c++;
        return this.f.readBoolean();
    }

    public final char readChar() {
        this.c += 2;
        return this.f.readChar();
    }

    public final String readUTF() {
        this.c += 2;
        return this.f.readUTF();
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.c + i2;
        this.c = i3;
        if (i3 > this.b) {
            throw new EOFException();
        } else if (this.f.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final void readFully(byte[] bArr) {
        int i = this.c;
        int length = bArr.length;
        i += length;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        } else if (this.f.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final byte readByte() {
        int i = this.c + 1;
        this.c = i;
        if (i <= this.b) {
            i = this.f.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i = this.c + 2;
        this.c = i;
        if (i <= this.b) {
            i = this.f.read();
            int read = this.f.read();
            if ((i | read) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (short) ((read << 8) + i);
                }
                if (byteOrder == e) {
                    return (short) ((i << 8) + read);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid byte order: ");
                stringBuilder.append(this.a);
                throw new IOException(stringBuilder.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int readInt() {
        int i = this.c + 4;
        this.c = i;
        if (i <= this.b) {
            i = this.f.read();
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            if ((((i | read) | read2) | read3) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (((read3 << 24) + (read2 << 16)) + (read << 8)) + i;
                }
                if (byteOrder == e) {
                    return (((i << 24) + (read << 16)) + (read2 << 8)) + read3;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid byte order: ");
                stringBuilder.append(this.a);
                throw new IOException(stringBuilder.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i) {
        i = Math.min(i, this.b - this.c);
        int i2 = 0;
        while (i2 < i) {
            i2 += this.f.skipBytes(i - i2);
        }
        this.c += i2;
        return i2;
    }

    public final int readUnsignedShort() {
        int i = this.c + 2;
        this.c = i;
        if (i <= this.b) {
            i = this.f.read();
            int read = this.f.read();
            if ((i | read) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (read << 8) + i;
                }
                if (byteOrder == e) {
                    return (i << 8) + read;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid byte order: ");
                stringBuilder.append(this.a);
                throw new IOException(stringBuilder.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final long a() {
        return ((long) readInt()) & 4294967295L;
    }

    public final long readLong() {
        int i = this.c + 8;
        this.c = i;
        if (i <= this.b) {
            i = this.f.read();
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            int read4 = this.f.read();
            int read5 = this.f.read();
            int read6 = this.f.read();
            int read7 = this.f.read();
            if ((((((((i | read) | read2) | read3) | read4) | read5) | read6) | read7) >= 0) {
                ByteOrder byteOrder = this.a;
                if (byteOrder == d) {
                    return (((((((((long) read7) << 56) + (((long) read6) << 48)) + (((long) read5) << 40)) + (((long) read4) << 32)) + (((long) read3) << 24)) + (((long) read2) << 16)) + (((long) read) << 8)) + ((long) i);
                }
                int i2 = read;
                if (byteOrder == e) {
                    return (((((((((long) i) << 56) + (((long) i2) << 48)) + (((long) read2) << 40)) + (((long) read3) << 32)) + (((long) read4) << 24)) + (((long) read5) << 16)) + (((long) read6) << 8)) + ((long) read7);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid byte order: ");
                stringBuilder.append(this.a);
                throw new IOException(stringBuilder.toString());
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }
}
