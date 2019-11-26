package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: blr */
public final class blr extends bpf {
    public Path a;
    private final bpf m;

    public blr(bjj bjj, bpf bpf) {
        super(bjj, bpf.b, bpf.c, bpf.d, bpf.e, bpf.f);
        this.m = bpf;
        a();
    }

    public final void a() {
        Object obj = this.c;
        Object obj2 = null;
        if (obj != null) {
            Object obj3 = this.b;
            if (obj3 != null && ((PointF) obj3).equals(((PointF) obj).x, ((PointF) this.c).y)) {
                obj2 = 1;
            }
        }
        obj = this.c;
        if (obj != null && obj2 == null) {
            PointF pointF = (PointF) this.b;
            PointF pointF2 = (PointF) obj;
            bpf bpf = this.m;
            this.a = bpg.a(pointF, pointF2, bpf.k, bpf.l);
        }
    }
}
