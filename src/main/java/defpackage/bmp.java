package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: bmp */
public final class bmp implements bmx {
    public final List a;

    public bmp() {
        this.a = Collections.singletonList(new bpf(new PointF(0.0f, 0.0f)));
    }

    public bmp(List list) {
        this.a = list;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.a.size() == 1 && ((bpf) this.a.get(0)).d();
    }

    public final blj a() {
        if (((bpf) this.a.get(0)).d()) {
            return new blt(this.a);
        }
        return new blu(this.a);
    }
}
