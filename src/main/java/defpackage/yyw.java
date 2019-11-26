package defpackage;

import android.content.Context;

/* renamed from: yyw */
final class yyw extends ans {
    private final yyv a;

    public yyw(Context context, yyv yyv) {
        this.a = yyv;
    }

    public final void a(aqh aqh) {
        super.a(aqh);
        yyv yyv = this.a;
        apa apa = yyv.a.m;
        if (apa != null) {
            if (yyv.d || (yyv.e && apa.a() > 0)) {
                yyv.e = false;
                yyv.a(yyv.f);
            }
        }
    }
}
