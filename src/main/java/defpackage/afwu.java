package defpackage;

/* renamed from: afwu */
public final class afwu implements afpv {
    public final boolean a(afpu afpu, aofq aofq) {
        if (aofq != null) {
            aofu aofu = aofq.c;
            if (aofu == null) {
                aofu = aofu.c;
            }
            if ((aofu.a & 1) != 0) {
                String a = afpu.c().a();
                aofu aofu2 = aofq.c;
                if (aofu2 == null) {
                    aofu2 = aofu.c;
                }
                if (a.equals(aofu2.b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
