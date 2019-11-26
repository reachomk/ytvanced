package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: bfx */
final class bfx extends Property {
    bfx(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        bfy bfy = (bfy) obj;
        PointF pointF = (PointF) obj2;
        bfy.c = pointF.x;
        bfy.d = pointF.y;
        bfy.a();
    }
}
