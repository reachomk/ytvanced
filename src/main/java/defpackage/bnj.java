package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bnj */
public final class bnj {
    public final List a;
    public PointF b;
    public boolean c;

    public bnj(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public bnj() {
        this.a = new ArrayList();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeData{numCurves=");
        stringBuilder.append(this.a.size());
        stringBuilder.append("closed=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
