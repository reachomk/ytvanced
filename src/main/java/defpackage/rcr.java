package defpackage;

import java.io.IOException;

/* renamed from: rcr */
public abstract class rcr implements rgh {
    public static boolean zzuct = false;
    public int zzucs = 0;

    /* Access modifiers changed, original: 0000 */
    public void b(int i) {
        throw null;
    }

    /* Access modifiers changed, original: 0000 */
    public int f() {
        throw null;
    }

    public final rdg d() {
        try {
            rdl c = rdg.c(h());
            a(c.a);
            return c.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((name.length() + 62) + "ByteString".length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final byte[] e() {
        try {
            byte[] bArr = new byte[h()];
            rdt a = rdt.a(bArr);
            a(a);
            a.j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((name.length() + 62) + "byte array".length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }
}
