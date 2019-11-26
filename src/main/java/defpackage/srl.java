package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: srl */
final /* synthetic */ class srl implements syn {
    private final clz a;

    srl(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, bdhb bdhb) {
        clz clz = this.a;
        int i = bdhb.b;
        if (i == 0 || i == 1) {
            clz.f(yogaEdge, bdhb.a);
        } else if (i == 2) {
            clz.e(yogaEdge, bdhb.a * 100.0f);
        }
    }
}
