package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: blv */
public final class blv extends blj {
    private final bnj e = new bnj();
    private final Path f = new Path();

    public blv(List list) {
        super(list);
    }

    public final /* synthetic */ Object a(bpf bpf, float f) {
        bnj bnj = (bnj) bpf.b;
        bnj bnj2 = (bnj) bpf.c;
        bnj bnj3 = this.e;
        if (bnj3.b == null) {
            bnj3.b = new PointF();
        }
        boolean z = true;
        if (!(bnj.c || bnj2.c)) {
            z = false;
        }
        bnj3.c = z;
        if (bnj.a.size() != bnj2.a.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Curves must have the same number of control points. Shape 1: ");
            stringBuilder.append(bnj.a.size());
            stringBuilder.append("\tShape 2: ");
            stringBuilder.append(bnj2.a.size());
            bpb.a(stringBuilder.toString());
        }
        int min = Math.min(bnj.a.size(), bnj2.a.size());
        int size;
        if (bnj3.a.size() < min) {
            for (size = bnj3.a.size(); size < min; size++) {
                bnj3.a.add(new bme());
            }
        } else if (bnj3.a.size() > min) {
            size = bnj3.a.size();
            while (true) {
                size--;
                if (size < min) {
                    break;
                }
                List list = bnj3.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = bnj.b;
        PointF pointF2 = bnj2.b;
        float a = bpd.a(pointF.x, pointF2.x, f);
        float a2 = bpd.a(pointF.y, pointF2.y, f);
        if (bnj3.b == null) {
            bnj3.b = new PointF();
        }
        bnj3.b.set(a, a2);
        min = bnj3.a.size();
        while (true) {
            min--;
            if (min >= 0) {
                bme bme = (bme) bnj.a.get(min);
                bme bme2 = (bme) bnj2.a.get(min);
                PointF pointF3 = bme.a;
                PointF pointF4 = bme.b;
                pointF2 = bme.c;
                PointF pointF5 = bme2.a;
                PointF pointF6 = bme2.b;
                PointF pointF7 = bme2.c;
                bme bme3 = (bme) bnj3.a.get(min);
                bme3.a.set(bpd.a(pointF3.x, pointF5.x, f), bpd.a(pointF3.y, pointF5.y, f));
                bme bme4 = (bme) bnj3.a.get(min);
                bme4.b.set(bpd.a(pointF4.x, pointF6.x, f), bpd.a(pointF4.y, pointF6.y, f));
                bme4 = (bme) bnj3.a.get(min);
                bme4.c.set(bpd.a(pointF2.x, pointF7.x, f), bpd.a(pointF2.y, pointF7.y, f));
            } else {
                bpd.a(this.e, this.f);
                return this.f;
            }
        }
    }
}
