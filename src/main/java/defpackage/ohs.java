package defpackage;

import java.util.UUID;

/* renamed from: ohs */
public final class ohs {
    public static int a(byte[] bArr) {
        ohv b = ohs.b(bArr);
        if (b == null) {
            return -1;
        }
        return b.b;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        ohv b = ohs.b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid == null || uuid.equals(b.a)) {
            return b.c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(b.a);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 33) + valueOf2.length());
        stringBuilder.append("UUID mismatch. Expected: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", got: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(".");
        oyp.a("PsshAtomUtil", stringBuilder.toString());
        return null;
    }

    public static ohv b(byte[] bArr) {
        oza oza = new oza(bArr);
        if (oza.c >= 32) {
            oza.c(0);
            if (oza.k() == oza.b() + 4 && oza.k() == ogy.ah) {
                int a = ogy.a(oza.k());
                if (a > 1) {
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Unsupported pssh version: ");
                    stringBuilder.append(a);
                    oyp.a("PsshAtomUtil", stringBuilder.toString());
                    return null;
                }
                UUID uuid = new UUID(oza.m(), oza.m());
                if (a == 1) {
                    oza.d(oza.o() << 4);
                }
                int o = oza.o();
                if (o == oza.b()) {
                    byte[] bArr2 = new byte[o];
                    oza.a(bArr2, 0, o);
                    return new ohv(uuid, a, bArr2);
                }
            }
        }
        return null;
    }
}
