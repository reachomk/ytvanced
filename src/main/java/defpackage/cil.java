package defpackage;

import java.io.Closeable;

/* renamed from: cil */
public final class cil extends bako implements Closeable {
    public cil(bakq bakq, cij cij) {
        long a = bakq.a();
        this.i = bakq;
        long b = bakq.b();
        this.k = b;
        this.j = b;
        bakq.a(bakq.b() + a);
        this.l = bakq.b();
        this.h = cij;
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    public final cjl a() {
        for (cis cis : b()) {
            if (cis instanceof cjl) {
                return (cjl) cis;
            }
        }
        return null;
    }

    public final void close() {
        this.i.close();
    }

    public final String toString() {
        String obj = this.i.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 7);
        stringBuilder.append("model(");
        stringBuilder.append(obj);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    static {
        bang.a(cil.class);
    }
}
