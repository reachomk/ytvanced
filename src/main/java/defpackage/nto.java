package defpackage;

/* renamed from: nto */
final class nto {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean a(int i, nwz nwz, boolean z) {
        if (nwz.d() == i) {
            if (nwz.d() == 118 && nwz.d() == 111 && nwz.d() == 114 && nwz.d() == 98 && nwz.d() == 105 && nwz.d() == 115) {
                return true;
            }
            if (z) {
                return false;
            }
            throw new nnc("expected characters 'vorbis'");
        } else if (z) {
            return false;
        } else {
            String valueOf = String.valueOf(Integer.toHexString(i));
            String str = "expected header type ";
            throw new nnc(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }
}
