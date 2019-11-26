package defpackage;

import java.util.List;

/* renamed from: ahdn */
public final class ahdn implements ahdx {
    private final agvt a;
    private final int b;
    private final boolean c;

    public ahdn(agvt agvt, int i, boolean z) {
        this.a = agvt;
        this.b = i;
        this.c = z;
    }

    public final byte[] a(String str, arlv arlv) {
        ahdp ahdp = new ahdp(this.c);
        int i = 0;
        loop0:
        while (true) {
            List<agqd> a = this.a.a(str, arlv.c, this.b, i, i + 256);
            for (agqd agqd : a) {
                if (agqd.e() != i || agqd.f() == null) {
                    return null;
                }
                ahdp.a(agqd.f());
                i++;
            }
            if (a.size() != 256) {
                return ahdp.b();
            }
        }
        return null;
    }
}
