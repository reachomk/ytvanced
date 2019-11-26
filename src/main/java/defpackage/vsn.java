package defpackage;

import android.text.TextUtils;

/* renamed from: vsn */
public final class vsn {
    private static final aakh a = new aakh(atdx.p);

    public static aakj a(aajx aajx, aojg aojg, aajj aajj) {
        amqw.a((Object) aojg);
        ateq ateq = (ateq) aten.j.createBuilder();
        for (aoji aoji : aojg.b) {
            if (!(aoji.d.isEmpty() || TextUtils.equals(aoji.d, "null/null") || aoji.e.isEmpty())) {
                arlx arlx = (arlx) arlv.E.createBuilder();
                arlx.a(aoji.e.trim());
                arlx.b(aoji.d);
                arlx.d(aoji.b);
                arlx.c(aoji.c);
                ateq.copyOnWrite();
                aten aten = (aten) ateq.instance;
                aten.a();
                aten.c.add((arlv) ((anxl) arlx.build()));
            }
        }
        if (ateq.a().isEmpty()) {
            return null;
        }
        return new aakj(aajx.a((aten) ((anxl) ateq.build()), null, (long) aojg.c), a, aajj);
    }

    public static aakj a(vso vso) {
        if (vso.i() != null) {
            return vso.i();
        }
        return new aakj(vso.j(), vso.k(), vso.i);
    }
}
