package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: srp */
final /* synthetic */ class srp implements syp {
    private final clz a;

    srp(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, baou baou) {
        clz clz = this.a;
        if (baou.b() != 2) {
            clz.f(yogaEdge, baou.a());
        } else {
            clz.e(yogaEdge, baou.a() * 100.0f);
        }
    }
}
