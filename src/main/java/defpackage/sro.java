package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: sro */
final /* synthetic */ class sro implements syn {
    private final clz a;

    sro(clz clz) {
        this.a = clz;
    }

    public final void a(YogaEdge yogaEdge, bdhb bdhb) {
        clz clz = this.a;
        int i = bdhb.b;
        if (i == 0 || i == 1) {
            clz.d(yogaEdge, bdhb.a);
        } else if (i == 2) {
            clz.c(yogaEdge, bdhb.a * 100.0f);
        }
    }
}
