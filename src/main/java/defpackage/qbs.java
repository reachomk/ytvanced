package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: qbs */
abstract class qbs extends pzd {
    private final int a;

    protected qbs(byte[] bArr) {
        pzr.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public abstract byte[] c();

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof pzb)) {
            try {
                pzb pzb = (pzb) obj;
                if (pzb.b() == this.a) {
                    qcs a = pzb.a();
                    if (a != null) {
                        return Arrays.equals(c(), (byte[]) qct.a(a));
                    }
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final qcs a() {
        return qct.a(c());
    }

    public final int b() {
        return this.a;
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
