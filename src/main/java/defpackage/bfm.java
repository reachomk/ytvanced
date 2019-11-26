package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: bfm */
final class bfm extends Property {
    bfm(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bfs bfs = (bfs) obj;
        PointF pointF = (PointF) obj2;
        bfs.c = Math.round(pointF.x);
        bfs.d = Math.round(pointF.y);
        int i = bfs.f + 1;
        bfs.f = i;
        if (bfs.e == i) {
            bfs.a();
        }
    }
}
