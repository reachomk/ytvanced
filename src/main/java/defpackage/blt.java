package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: blt */
public final class blt extends blp {
    private final PointF e = new PointF();

    public blt(List list) {
        super(list);
    }

    public final /* synthetic */ Object a(bpf bpf, float f) {
        Object obj = bpf.b;
        if (obj != null) {
            Object obj2 = bpf.c;
            if (obj2 != null) {
                PointF pointF = (PointF) obj;
                PointF pointF2 = (PointF) obj2;
                bph bph = this.d;
                if (bph != null) {
                    bpf.f.floatValue();
                    c();
                    PointF pointF3 = (PointF) bph.a;
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
