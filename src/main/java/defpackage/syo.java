package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: syo */
public final class syo extends syq {
    public static void a(bdgy bdgy, syn syn) {
        boolean z = true;
        syo.a(bdgy.i != null, YogaEdge.ALL, bdgy.i, syn);
        syo.a(bdgy.g != null, YogaEdge.HORIZONTAL, bdgy.g, syn);
        syo.a(bdgy.h != null, YogaEdge.VERTICAL, bdgy.h, syn);
        syo.a(bdgy.e != null, YogaEdge.START, bdgy.e, syn);
        syo.a(bdgy.f != null, YogaEdge.END, bdgy.f, syn);
        syo.a(bdgy.a != null, YogaEdge.TOP, bdgy.a, syn);
        syo.a(bdgy.d != null, YogaEdge.RIGHT, bdgy.d, syn);
        syo.a(bdgy.c != null, YogaEdge.BOTTOM, bdgy.c, syn);
        if (bdgy.b == null) {
            z = false;
        }
        syo.a(z, YogaEdge.LEFT, bdgy.b, syn);
    }

    private static void a(boolean z, YogaEdge yogaEdge, bdhb bdhb, syn syn) {
        if (z) {
            syn.a(yogaEdge, bdhb);
        }
    }
}
