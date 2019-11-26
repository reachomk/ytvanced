package defpackage;

/* renamed from: zjs */
public final class zjs {
    public final int a;

    public zjs(int i) {
        this.a = i;
    }

    public static boolean a(zjs zjs) {
        if (zjs != null) {
            int i = zjs.a;
            if (i == 1 || i == 2) {
                return true;
            }
        }
        return false;
    }

    static boolean b(zjs zjs) {
        return zjs != null && zjs.a == 2;
    }
}
