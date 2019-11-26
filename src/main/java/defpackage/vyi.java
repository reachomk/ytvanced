package defpackage;

/* renamed from: vyi */
public final class vyi implements aijo {
    private final aajx a;
    private final aamj b;

    public vyi(aajx aajx, aamj aamj) {
        this.a = aajx;
        this.b = aamj;
    }

    public final aakj a(aakj aakj) {
        byte[] d;
        aogi r = aakj.r();
        if (r != null) {
            for (aogm aogm : r.c) {
                ayxm ayxm = aogm.b;
                if (ayxm == null) {
                    ayxm = ayxm.o;
                }
                if ((ayxm.a & 1) != 0) {
                    d = ayxm.b.d();
                    break;
                }
            }
        }
        d = null;
        if (d == null) {
            return null;
        }
        ajxu ajxu = (ajxu) this.b.a(d, ajxu.class);
        if (ajxu == null || ajxu.b == null || ajxu.g == null) {
            return null;
        }
        return new aakj(ajxu, 0, this.a);
    }
}
