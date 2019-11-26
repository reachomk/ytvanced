package defpackage;

import java.nio.ByteBuffer;

/* renamed from: axa */
public final class axa {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final axq b;
    public volatile int c = 0;

    axa(axq axq, int i) {
        this.b = axq;
        this.a = i;
    }

    public final bfc a() {
        bfc bfc = (bfc) d.get();
        if (bfc == null) {
            bfc = new bfc();
            d.set(bfc);
        }
        bff bff = this.b.a;
        int i = this.a;
        int a = bff.a(6);
        if (a != 0) {
            a = bff.c(a) + (i << 2);
            i = bff.b.getInt(a);
            ByteBuffer byteBuffer = bff.b;
            bfc.a = a + i;
            bfc.b = byteBuffer;
        }
        return bfc;
    }

    public final int b() {
        bfc a = a();
        int a2 = a.a(4);
        return a2 != 0 ? a.b.getInt(a2 + a.a) : 0;
    }

    public final short c() {
        bfc a = a();
        int a2 = a.a(14);
        return a2 != 0 ? a.b.getShort(a2 + a.a) : (short) 0;
    }

    public final int a(int i) {
        bfc a = a();
        int a2 = a.a(16);
        return a2 != 0 ? a.b.getInt(a.c(a2) + (i << 2)) : 0;
    }

    public final int d() {
        bfc a = a();
        int a2 = a.a(16);
        return a2 != 0 ? a.b(a2) : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", id:");
        stringBuilder.append(Integer.toHexString(b()));
        stringBuilder.append(", codepoints:");
        int d = d();
        for (int i = 0; i < d; i++) {
            stringBuilder.append(Integer.toHexString(a(i)));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
