package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: srq */
final /* synthetic */ class srq implements syp {
    private final clz a;

    srq(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, baou baou) {
        clz clz = this.a;
        if (baou.b() != 2) {
            clz.b(yogaEdge, baou.a());
        } else {
            clz.a(yogaEdge, baou.a() * 100.0f);
        }
    }
}
