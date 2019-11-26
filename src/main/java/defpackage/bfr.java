package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: bfr */
final class bfr extends Property {
    bfr(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        bht.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
