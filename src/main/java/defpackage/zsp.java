package defpackage;

import java.util.Map;

/* renamed from: zsp */
final /* synthetic */ class zsp implements zte {
    private final zsm a;
    private final apxu b;
    private final Map c;
    private final zsn d;

    zsp(zsm zsm, apxu apxu, Map map, zsn zsn) {
        this.a = zsm;
        this.b = apxu;
        this.c = map;
        this.d = zsn;
    }

    public final void a(int i) {
        zsm zsm = this.a;
        apxu apxu = this.b;
        Map map = this.c;
        zsn zsn = this.d;
        apxu b;
        if (i == 4 || i == 1) {
            b = zsm.b(apxu);
            if (b != null) {
                zsm.b.a(b, map);
            }
            b = zsm.d(apxu);
            if (b != null) {
                zsm.b.a(b, map);
            }
            if (zsn != null) {
                zsn.b();
            }
        } else if (i != 5) {
            b = zsm.c(apxu);
            if (b != null) {
                zsm.b.a(b, map);
            }
        }
        if (zsn != null) {
            zsn.c();
        }
    }
}
