package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: srs */
final /* synthetic */ class srs implements syp {
    private final clz a;

    srs(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, baou baou) {
        clz clz = this.a;
        if (baou.b() != 2) {
            clz.d(yogaEdge, baou.a());
        } else {
            clz.c(yogaEdge, baou.a() * 100.0f);
        }
    }
}
