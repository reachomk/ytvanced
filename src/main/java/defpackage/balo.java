package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: balo */
public class balo extends bakp {
    public byte[] a = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
    public List b = Collections.emptyList();
    private int c = -1;
    private int d = -1;

    protected balo(String str) {
        super(str);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if ((n() & 1) > 0) {
            this.c = cio.b(byteBuffer);
            this.d = cio.d(byteBuffer);
            this.a = new byte[16];
            byteBuffer.get(this.a);
        }
        long a = cio.a(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        this.b = a(duplicate, a, 8);
        if (this.b == null) {
            this.b = a(duplicate2, a, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.b == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    private final List a(ByteBuffer byteBuffer, long j, int i) {
        List arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            long j3 = -1 + j2;
            if (j2 <= 0) {
                return arrayList;
            }
            try {
                banq banq = new banq();
                banq.a = new byte[i];
                byteBuffer.get(banq.a);
                if ((n() & 2) > 0) {
                    banq.b = new baoa[cio.c(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        baoa[] baoaArr = banq.b;
                        if (i2 >= baoaArr.length) {
                            break;
                        }
                        int c = cio.c(byteBuffer);
                        long a = cio.a(byteBuffer);
                        banv banv = c <= 127 ? a > 127 ? a > 32767 ? a <= 2147483647L ? new banv(c, a) : new banu(c, a) : new banx(c, a) : new bans(c, a) : c <= 32767 ? a > 127 ? a > 32767 ? a <= 2147483647L ? new baoc(c, a) : new baof(c, a) : new baoe(c, a) : new baod(c, a) : a > 127 ? a > 32767 ? a <= 2147483647L ? new banz(c, a) : new bany(c, a) : new baob(c, a) : new banw(c, a);
                        baoaArr[i2] = banv;
                        i2++;
                    }
                }
                arrayList.add(banq);
                j2 = j3;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    public final boolean a() {
        return (n() & 1) != 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        if (a()) {
            cin.a(byteBuffer, this.c);
            cin.c(byteBuffer, this.d);
            byteBuffer.put(this.a);
        }
        cin.a(byteBuffer, (long) this.b.size());
        for (banq banq : this.b) {
            if (banq.a() > 0) {
                byte[] bArr = banq.a;
                int length = bArr.length;
                if (length == 8 || length == 16) {
                    byteBuffer.put(bArr);
                    if ((n() & 2) > 0) {
                        cin.b(byteBuffer, banq.b.length);
                        for (baoa baoa : banq.b) {
                            cin.b(byteBuffer, baoa.a());
                            cin.a(byteBuffer, baoa.b());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        long length = (a() ? ((long) this.a.length) + 8 : 4) + 4;
        for (banq a : this.b) {
            length += (long) a.a();
        }
        return length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            balo balo = (balo) obj;
            if (this.c == balo.c && this.d == balo.d) {
                List list = this.b;
                if (!list == null ? list.equals(balo.b) : balo.b == null) {
                    return false;
                }
                if (Arrays.equals(this.a, balo.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.c * 31) + this.d) * 31;
        byte[] bArr = this.a;
        int i2 = 0;
        i = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List list = this.b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }
}
