package defpackage;

/* renamed from: amwc */
public final class amwc {
    static boolean a(amvz amvz, Object obj) {
        if (obj == amvz) {
            return true;
        }
        if (!(obj instanceof amvz)) {
            return false;
        }
        return amvz.c().equals(((amvz) obj).c());
    }
}
