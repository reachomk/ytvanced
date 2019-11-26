package defpackage;

import java.util.Arrays;

/* renamed from: npx */
public final class npx {
    public final String a;
    public final byte[] b;

    public npx(String str, byte[] bArr) {
        this.a = (String) nwf.a((Object) str);
        this.b = (byte[]) nwf.a((Object) bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof npx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        npx npx = (npx) obj;
        return this.a.equals(npx.a) && Arrays.equals(this.b, npx.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Arrays.hashCode(this.b) * 31);
    }
}
