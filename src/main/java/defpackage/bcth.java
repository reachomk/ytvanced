package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: bcth */
final class bcth extends bcpt {
    public static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final bctf i;

    static bcth a(DataInput dataInput, String str) {
        int i;
        bctf bctf;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        i = dataInput.readInt();
        long[] jArr = new long[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        String[] strArr2 = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int readUnsignedByte;
            jArr[i2] = bctc.a(dataInput);
            iArr[i2] = (int) bctc.a(dataInput);
            iArr2[i2] = (int) bctc.a(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            }
            readUnsignedByte = dataInput.readUnsignedShort();
            strArr2[i2] = strArr[readUnsignedByte];
        }
        if (dataInput.readBoolean()) {
            bctf = new bctf(str, (int) bctc.a(dataInput), bctg.a(dataInput), bctg.a(dataInput));
        } else {
            bctf = null;
        }
        return new bcth(str, jArr, iArr, iArr2, strArr2, bctf);
    }

    public final boolean b() {
        return false;
    }

    private bcth(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, bctf bctf) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = bctf;
    }

    public final String a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        binarySearch ^= -1;
        if (binarySearch < jArr.length) {
            return binarySearch > 0 ? this.h[binarySearch - 1] : "UTC";
        } else {
            bctf bctf = this.i;
            if (bctf == null) {
                return this.h[binarySearch - 1];
            }
            return bctf.a(j);
        }
    }

    public final int b(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        binarySearch ^= -1;
        if (binarySearch < jArr.length) {
            return binarySearch > 0 ? this.f[binarySearch - 1] : 0;
        } else {
            bctf bctf = this.i;
            if (bctf == null) {
                return this.f[binarySearch - 1];
            }
            return bctf.b(j);
        }
    }

    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        binarySearch ^= -1;
        if (binarySearch < jArr.length) {
            return binarySearch > 0 ? this.g[binarySearch - 1] : 0;
        } else {
            bctf bctf = this.i;
            if (bctf == null) {
                return this.g[binarySearch - 1];
            }
            return bctf.e;
        }
    }

    public final long g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        binarySearch = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ -1;
        int length = jArr.length;
        if (binarySearch < length) {
            return jArr[binarySearch];
        }
        bctf bctf = this.i;
        if (bctf != null) {
            long j2 = jArr[length - 1];
            if (j < j2) {
                j = j2;
            }
            j = bctf.g(j);
        }
        return j;
    }

    public final long h(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
            long h;
            if (binarySearch >= jArr.length) {
                bctf bctf = this.i;
                if (bctf != null) {
                    h = bctf.h(j);
                    if (h < j) {
                        return h;
                    }
                }
                h = jArr[binarySearch - 1];
                return h > Long.MIN_VALUE ? h - 1 : j;
            } else {
                if (binarySearch > 0) {
                    h = jArr[binarySearch - 1];
                    if (h > Long.MIN_VALUE) {
                        return h - 1;
                    }
                }
                return j;
            }
        }
        if (j > Long.MIN_VALUE) {
            j--;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcth) {
            bcth bcth = (bcth) obj;
            if (this.d.equals(bcth.d) && Arrays.equals(this.e, bcth.e) && Arrays.equals(this.h, bcth.h) && Arrays.equals(this.f, bcth.f) && Arrays.equals(this.g, bcth.g)) {
                bctf bctf = this.i;
                if (bctf == null ? bcth.i == null : bctf.equals(bcth.i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
