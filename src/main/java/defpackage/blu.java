package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: blu */
public final class blu extends blp {
    private final PointF e = new PointF();
    private final float[] f = new float[2];
    private blr g;
    private final PathMeasure h = new PathMeasure();

    public blu(List list) {
        super(list);
    }

    public final /* synthetic */ Object a(bpf bpf, float f) {
        blr blr = (blr) bpf;
        Path path = blr.a;
        if (path == null) {
            return (PointF) bpf.b;
        }
        PointF pointF;
        bph bph = this.d;
        if (bph != null) {
            blr.f.floatValue();
            c();
            pointF = (PointF) bph.a;
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.g != blr) {
            this.h.setPath(path, false);
            this.g = blr;
        }
        PathMeasure pathMeasure = this.h;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
        pointF = this.e;
        float[] fArr = this.f;
        pointF.set(fArr[0], fArr[1]);
        return this.e;
    }
}
