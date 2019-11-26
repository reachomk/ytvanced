package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: anvu */
public abstract class anvu implements Serializable, Iterable {
    public static final anvu a = new anwe(anxw.b);
    private static final anwa c;
    public int b = 0;

    anvu() {
    }

    public static int a(byte b) {
        return b & 255;
    }

    public abstract byte a(int i);

    public abstract int a(int i, int i2, int i3);

    public abstract anvu a(int i, int i2);

    public abstract String a(Charset charset);

    public abstract void a(anvr anvr);

    public abstract byte b(int i);

    public abstract int b();

    public abstract int b(int i, int i2, int i3);

    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract anwf g();

    public abstract int i();

    public abstract boolean j();

    /* renamed from: a */
    public anvz iterator() {
        return new anvt(this);
    }

    public final boolean c() {
        return b() == 0;
    }

    public static anvu a(byte[] bArr, int i, int i2) {
        anvu.c(i, i + i2, bArr.length);
        return new anwe(c.a(bArr, i, i2));
    }

    public static anvu a(byte[] bArr) {
        return anvu.a(bArr, 0, bArr.length);
    }

    static anvu b(byte[] bArr) {
        return new anwe(bArr);
    }

    static anvu b(byte[] bArr, int i, int i2) {
        return new anvx(bArr, i, i2);
    }

    public static anvu a(String str) {
        return new anwe(str.getBytes(anxw.a));
    }

    public static anvu a(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        if (size == 0) {
            return a;
        }
        return anvu.a(iterable.iterator(), size);
    }

    private static anvu a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (anvu) it.next();
        } else {
            int i2 = i >>> 1;
            anvu a = anvu.a(it, i2);
            anvu a2 = anvu.a(it, i - i2);
            if (Integer.MAX_VALUE - a.b() >= a2.b()) {
                return anzw.a(a, a2);
            }
            i2 = a.b();
            int b = a2.b();
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("ByteString would be too long: ");
            stringBuilder.append(i2);
            stringBuilder.append("+");
            stringBuilder.append(b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @Deprecated
    public final void a(byte[] bArr, int i, int i2, int i3) {
        anvu.c(i, i + i3, b());
        anvu.c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    public final byte[] d() {
        int b = b();
        if (b == 0) {
            return anxw.b;
        }
        byte[] bArr = new byte[b];
        b(bArr, 0, 0, b);
        return bArr;
    }

    public final String e() {
        return b() != 0 ? a(anxw.a) : "";
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            i = b();
            i = b(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    public static anwd h() {
        return new anwd();
    }

    static anwc c(int i) {
        return new anwc(i);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i >= 0) {
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Index > length: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(22);
        stringBuilder2.append("Index < 0: ");
        stringBuilder2.append(i);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    static int c(int i, int i2, int i3) {
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
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }

    static {
        anwa anwg;
        if (anvm.a()) {
            anwg = new anwg();
        } else {
            anwg = new anvy();
        }
        c = anwg;
        anvw anvw = new anvw();
    }
}
