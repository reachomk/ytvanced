package defpackage;

/* renamed from: oio */
final class oio {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean a(int i, oza oza, boolean z) {
        if (oza.b() >= 7) {
            if (oza.d() == i) {
                if (oza.d() == 118 && oza.d() == 111 && oza.d() == 114 && oza.d() == 98 && oza.d() == 105 && oza.d() == 115) {
                    return true;
                }
                if (z) {
                    return false;
                }
                throw new oae("expected characters 'vorbis'");
            } else if (z) {
                return false;
            } else {
                String valueOf = String.valueOf(Integer.toHexString(i));
                String str = "expected header type ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new oae(valueOf);
            }
        } else if (z) {
            return false;
        } else {
            int b = oza.b();
            StringBuilder stringBuilder = new StringBuilder(29);
            stringBuilder.append("too short header: ");
            stringBuilder.append(b);
            throw new oae(stringBuilder.toString());
        }
    }
}
