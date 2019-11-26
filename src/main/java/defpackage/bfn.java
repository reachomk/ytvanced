package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: bfn */
final class bfn extends Property {
    bfn(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bfs bfs = (bfs) obj;
        PointF pointF = (PointF) obj2;
        bfs.a = Math.round(pointF.x);
        bfs.b = Math.round(pointF.y);
        int i = bfs.e + 1;
        bfs.e = i;
        if (i == bfs.f) {
            bfs.a();
        }
    }
}
