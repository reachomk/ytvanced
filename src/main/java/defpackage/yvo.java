package defpackage;

import android.content.Context;

/* renamed from: yvo */
public final class yvo {
    public final aaas a;
    public final xoi b;
    private final aadw c;
    private final aarh d;
    private final Context e;
    private final afve f;

    public yvo(aadw aadw, aarh aarh, aaas aaas, xoi xoi, Context context, afve afve) {
        this.c = (aadw) amqw.a((Object) aadw);
        this.d = (aarh) amqw.a((Object) aarh);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (xoi) amqw.a((Object) xoi);
        this.e = (Context) amqw.a((Object) context);
        this.f = (afve) amqw.a((Object) afve);
    }

    public final void a(String str, yvx yvx, amuw amuw, int i) {
        ykv ykv = (ykv) this.c.a(str);
        if (ykv != null) {
            if (amuw.contains(ykv.a(ykv, (ymn) this.c.c(str).a("technodrome_metadata", ymn.c.getParserForType())))) {
                a(ykv.a, i);
                this.d.a(yvx.a(ykv), Boolean.valueOf(this.f.a(this.e)), afsy.a(new yvv(this, ykv), new yvy(this, i, ykv)));
            }
        }
    }

    public final bblt a(String str, int i) {
        anxo anxo;
        aadu c = this.c.c(str);
        String str2 = "technodrome_metadata";
        if (c.b.a(str2)) {
            anxo = (ymq) ((anxo) ((ymn) c.a(str2, ymn.c.getParserForType())).toBuilder());
        } else {
            anxo = (ymq) ymn.c.createBuilder();
        }
        aadx aadx = new aadx((arfu) ((anxo) c.b.toBuilder()));
        anxo.copyOnWrite();
        ymn ymn = (ymn) anxo.instance;
        ymn.a |= 1;
        ymn.b = i - 1;
        aadx.a(str2, (anxl) anxo.build());
        return this.c.b().a(str, aadx.a()).a();
    }
}
