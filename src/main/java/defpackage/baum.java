package defpackage;

import java.util.Arrays;

/* renamed from: baum */
public final class baum {
    public static final bauq a = new bauo();
    public static final anar b = anar.a.a();
    public byte[][] c;
    private int d;

    baum(byte[]... bArr) {
        this.d = bArr.length >> 1;
        this.c = bArr;
    }

    private final byte[] a(int i) {
        return this.c[i + i];
    }

    private final void a(int i, byte[] bArr) {
        this.c[i + i] = bArr;
    }

    private final byte[] b(int i) {
        return this.c[(i + i) + 1];
    }

    private final void b(int i, byte[] bArr) {
        this.c[(i + i) + 1] = bArr;
    }

    public final int a() {
        byte[][] bArr = this.c;
        return bArr != null ? bArr.length : 0;
    }

    public final int b() {
        int i = this.d;
        return i + i;
    }

    private final boolean c() {
        return this.d == 0;
    }

    public final Object a(baur baur) {
        int i = this.d;
        while (true) {
            i--;
            if (i < 0) {
                return null;
            }
            if (Arrays.equals(baur.b, a(i))) {
                return baur.a(b(i));
            }
        }
    }

    public final void a(baur baur, Object obj) {
        amqw.a((Object) baur, (Object) "key");
        amqw.a(obj, (Object) "value");
        if (b() == 0 || b() == a()) {
            int b = b();
            c(Math.max(b + b, 8));
        }
        a(this.d, baur.b);
        b(this.d, baur.a(obj));
        this.d++;
    }

    private final void c(int i) {
        byte[][] bArr = new byte[i][];
        if (!c()) {
            System.arraycopy(this.c, 0, bArr, 0, b());
        }
        this.c = bArr;
    }

    public final void b(baur baur) {
        if (!c()) {
            int i = 0;
            for (int i2 = 0; i2 < this.d; i2++) {
                if (!Arrays.equals(baur.b, a(i2))) {
                    a(i, a(i2));
                    b(i, b(i2));
                    i++;
                }
            }
            Arrays.fill(this.c, i + i, b(), null);
            this.d = i;
        }
    }

    public final void a(baum baum) {
        if (!baum.c()) {
            int a = a() - b();
            if (c() || a < baum.b()) {
                c(b() + baum.b());
            }
            System.arraycopy(baum.c, 0, this.c, b(), baum.b());
            this.d += baum.d;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata(");
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            String str = new String(a(i), ampv.a);
            stringBuilder.append(str);
            stringBuilder.append('=');
            if (str.endsWith("-bin")) {
                stringBuilder.append(b.a(b(i)));
            } else {
                stringBuilder.append(new String(b(i), ampv.a));
            }
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static {
        baul baul = new baul();
    }
}
