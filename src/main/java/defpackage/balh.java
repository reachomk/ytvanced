package defpackage;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: balh */
public final class balh extends AbstractList {
    private civ a;
    private ckg b = null;
    private SoftReference[] c = null;
    private int[] d;
    private long[] e;
    private long[] f;
    private long[][] g;
    private cjr h;
    private int i;

    public balh(long j, civ civ) {
        long j2 = j;
        civ civ2 = civ;
        cjt cjt = null;
        int i = 0;
        this.i = 0;
        this.a = civ2;
        for (ckg ckg : ((cjl) civ2.a(cjl.class).get(0)).a(ckg.class)) {
            if (ckg.a().a == j2) {
                this.b = ckg;
            }
        }
        ckg ckg2 = this.b;
        StringBuilder stringBuilder;
        if (ckg2 == null) {
            stringBuilder = new StringBuilder(52);
            stringBuilder.append("This MP4 does not contain track ");
            stringBuilder.append(j2);
            throw new RuntimeException(stringBuilder.toString());
        } else if (ckg2.g() == null || this.b.g().h() == null) {
            stringBuilder = new StringBuilder(74);
            stringBuilder.append("MP4 track ");
            stringBuilder.append(j2);
            stringBuilder.append(" is missing SampleTableBox or ChunkOffsetBox");
            throw new IOException(stringBuilder.toString());
        } else {
            int i2;
            int a;
            this.e = this.b.g().h().a();
            int length = this.e.length;
            this.f = new long[length];
            this.c = (SoftReference[]) Array.newInstance(SoftReference.class, length);
            this.g = new long[this.e.length][];
            this.h = this.b.g().g();
            cju g = this.b.g();
            cjt cjt2 = g.a;
            if (cjt2 == null) {
                for (cis cis : g.b()) {
                    if (cis instanceof cjt) {
                        g.a = (cjt) cis;
                        cjt = g.a;
                        break;
                    }
                }
            }
            cjt = cjt2;
            List list = cjt.a;
            cjw[] cjwArr = (cjw[]) list.toArray(new cjw[list.size()]);
            cjw cjw = cjwArr[0];
            long j3 = cjw.a;
            length = bana.a(cjw.b);
            int size = size();
            int i3 = 1;
            int i4 = length;
            length = 0;
            int i5 = 1;
            int i6 = 0;
            int i7 = 1;
            do {
                length++;
                if (((long) length) == j3) {
                    if (cjwArr.length > i5) {
                        i2 = i5 + 1;
                        cjw cjw2 = cjwArr[i5];
                        a = bana.a(cjw2.b);
                        long j4 = cjw2.a;
                        i5 = i2;
                        i6 = i4;
                        i4 = a;
                        j3 = j4;
                    } else {
                        i6 = i4;
                        j3 = Long.MAX_VALUE;
                        i4 = -1;
                    }
                }
                this.g[length - 1] = new long[i6];
                i7 += i6;
            } while (i7 <= size);
            this.d = new int[(length + 1)];
            cjw = cjwArr[0];
            j3 = cjw.a;
            i6 = bana.a(cjw.b);
            long j5 = j3;
            length = 0;
            i5 = 1;
            i2 = 1;
            a = 0;
            while (true) {
                i4 = length + 1;
                this.d[length] = i5;
                if (((long) i4) == j5) {
                    if (cjwArr.length > i2) {
                        length = i2 + 1;
                        cjw cjw3 = cjwArr[i2];
                        a = bana.a(cjw3.b);
                        j5 = cjw3.a;
                        i2 = length;
                        int i8 = i6;
                        i6 = a;
                        a = i8;
                    } else {
                        a = i6;
                        i6 = -1;
                        j5 = Long.MAX_VALUE;
                    }
                }
                i5 += a;
                if (i5 > size) {
                    break;
                }
                length = i4;
            }
            this.d[i4] = Integer.MAX_VALUE;
            long j6 = 0;
            while (((long) i3) <= this.h.a()) {
                if (i3 == this.d[i]) {
                    i++;
                    j6 = 0;
                }
                long[] jArr = this.f;
                a = i - 1;
                i6 = i3 - 1;
                jArr[a] = jArr[a] + this.h.a(i6);
                this.g[a][i3 - this.d[a]] = j6;
                j6 += this.h.a(i6);
                i3++;
            }
        }
    }

    private final synchronized int a(int i) {
        i++;
        int[] iArr = this.d;
        int i2 = this.i;
        int i3 = iArr[i2];
        if (i >= i3 && i < iArr[i2 + 1]) {
            return i2;
        }
        if (i < i3) {
            this.i = 0;
            while (true) {
                iArr = this.d;
                i2 = this.i;
                i3 = i2 + 1;
                if (iArr[i3] > i) {
                    return i2;
                }
                this.i = i3;
            }
        } else {
            this.i = i2 + 1;
            while (true) {
                iArr = this.d;
                i2 = this.i;
                i3 = i2 + 1;
                if (iArr[i3] > i) {
                    return i2;
                }
                this.i = i3;
            }
        }
    }

    public final int size() {
        return bana.a(this.b.g().g().a());
    }

    public final /* synthetic */ Object get(int i) {
        int i2 = i;
        if (((long) i2) < this.h.a()) {
            long j;
            ByteBuffer byteBuffer;
            int a = a(i);
            int i3 = this.d[a] - 1;
            long j2 = (long) a;
            long j3 = this.e[bana.a(j2)];
            long[] jArr = this.g[bana.a(j2)];
            long j4 = jArr[i2 - i3];
            ByteBuffer[] byteBufferArr = this.c[bana.a(j2)] != null ? (ByteBuffer[]) this.c[bana.a(j2)].get() : null;
            if (byteBufferArr == null) {
                int length;
                ArrayList arrayList = new ArrayList();
                long j5 = 0;
                int i4 = 0;
                while (true) {
                    try {
                        length = jArr.length;
                        if (i4 >= length) {
                            break;
                        }
                        if ((jArr[i4] + this.h.a(i4 + i3)) - j5 > 268435456) {
                            j = j4;
                            arrayList.add(this.a.a(j3 + j5, jArr[i4] - j5));
                            j5 = jArr[i4];
                        } else {
                            j = j4;
                        }
                        i4++;
                        j4 = j;
                    } catch (IOException e) {
                        throw new IndexOutOfBoundsException(e.getMessage());
                    }
                }
                j = j4;
                arrayList.add(this.a.a(j3 + j5, ((-j5) + jArr[length - 1]) + this.h.a((i3 + length) - 1)));
                byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
                this.c[bana.a(j2)] = new SoftReference(byteBufferArr);
            } else {
                j = j4;
            }
            j4 = j;
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                if (j4 < ((long) byteBuffer2.limit())) {
                    byteBuffer = byteBuffer2;
                    break;
                }
                j4 -= (long) byteBuffer2.limit();
            }
            byteBuffer = null;
            return new balg(this.h.a(i2), byteBuffer, j4);
        }
        throw new IndexOutOfBoundsException();
    }
}
