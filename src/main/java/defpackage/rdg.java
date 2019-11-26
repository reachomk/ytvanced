package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: rdg */
public abstract class rdg implements Serializable, Iterable {
    public static final rdg a = new rdn(rfc.b);
    private static final rdj c;
    public int b = 0;

    rdg() {
    }

    public static int a(byte b) {
        return b & 255;
    }

    public abstract byte a(int i);

    public abstract int a();

    public abstract int a(int i, int i2);

    public abstract String a(Charset charset);

    public abstract void a(rdd rdd);

    public abstract void a(byte[] bArr, int i);

    public abstract rdg b(int i);

    public abstract boolean d();

    public abstract rdp e();

    public abstract boolean equals(Object obj);

    public static rdg a(byte[] bArr, int i, int i2) {
        rdg.a(i, i + i2, bArr.length);
        return new rdn(c.a(bArr, i, i2));
    }

    public static rdg a(byte[] bArr) {
        return rdg.a(bArr, 0, bArr.length);
    }

    static rdg b(byte[] bArr) {
        return new rdn(bArr);
    }

    static rdg b(byte[] bArr, int i, int i2) {
        return new rdk(bArr, i, i2);
    }

    public static rdg a(String str) {
        return new rdn(str.getBytes(rfc.a));
    }

    public final byte[] b() {
        int a = a();
        if (a == 0) {
            return rfc.b;
        }
        byte[] bArr = new byte[a];
        a(bArr, a);
        return bArr;
    }

    public final String c() {
        return a() != 0 ? a(rfc.a) : "";
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = a();
            i = a(i, i);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    static rdl c(int i) {
        return new rdl(i);
    }

    static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder stringBuilder;
        if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(32);
            stringBuilder2.append("Beginning index: ");
            stringBuilder2.append(i);
            stringBuilder2.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } else if (i2 < i) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Beginning index larger than ending index: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("End index: ");
            stringBuilder.append(i2);
            stringBuilder.append(" >= ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }

    public final /* synthetic */ Iterator iterator() {
        return new rdf(this);
    }

    static {
        rdj rdq;
        if (rcv.a()) {
            rdq = new rdq();
        } else {
            rdq = new rdh();
        }
        c = rdq;
        rdi rdi = new rdi();
    }
}
