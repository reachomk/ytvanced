package defpackage;

import java.nio.charset.Charset;

/* renamed from: bats */
public final class bats {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final anar b = baum.b;

    public static baur a(String str, batr batr) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return baur.a(str, z, batr);
    }

    public static baum a(byte[]... bArr) {
        return new baum(bArr);
    }

    public static byte[][] a(baum baum) {
        if (baum.b() == baum.a()) {
            return baum.c;
        }
        byte[][] bArr = new byte[baum.b()][];
        System.arraycopy(baum.c, 0, bArr, 0, baum.b());
        return bArr;
    }
}
