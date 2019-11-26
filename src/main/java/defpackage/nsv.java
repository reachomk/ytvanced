package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* renamed from: nsv */
public final class nsv {
    public static UUID a(byte[] bArr) {
        Pair b = nsv.b(bArr);
        return b != null ? (UUID) b.first : null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        Pair b = nsv.b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid == null || uuid.equals(b.first)) {
            return (byte[]) b.second;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(b.first);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 33) + valueOf2.length());
        stringBuilder.append("UUID mismatch. Expected: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", got: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(".");
        Log.w("PsshAtomUtil", stringBuilder.toString());
        return null;
    }

    private static Pair b(byte[] bArr) {
        nwz nwz = new nwz(bArr);
        if (nwz.c >= 32) {
            nwz.c(0);
            if (nwz.j() == nwz.b() + 4 && nwz.j() == nsg.X) {
                int c = nsg.c(nwz.j());
                if (c > 1) {
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Unsupported pssh version: ");
                    stringBuilder.append(c);
                    Log.w("PsshAtomUtil", stringBuilder.toString());
                    return null;
                }
                UUID uuid = new UUID(nwz.l(), nwz.l());
                if (c == 1) {
                    nwz.d(nwz.n() << 4);
                }
                c = nwz.n();
                if (c == nwz.b()) {
                    byte[] bArr2 = new byte[c];
                    nwz.a(bArr2, 0, c);
                    return Pair.create(uuid, bArr2);
                }
            }
        }
        return null;
    }
}
