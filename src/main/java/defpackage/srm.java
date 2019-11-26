package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: srm */
final /* synthetic */ class srm implements syn {
    private final clz a;

    srm(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, bdhb bdhb) {
        clz clz = this.a;
        int i = bdhb.b;
        if (i == 0 || i == 1) {
            clz.b(yogaEdge, bdhb.a);
        } else if (i == 2) {
            clz.a(yogaEdge, bdhb.a * 100.0f);
        }
    }
}
