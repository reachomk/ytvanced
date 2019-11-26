package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: bly */
public final class bly extends blj {
    private final PointF e = new PointF();
    private final blj f;
    private final blj g;

    public bly(blj blj, blj blj2) {
        super(Collections.emptyList());
        this.f = blj;
        this.g = blj2;
        a(this.c);
    }

    public final void a(float f) {
        this.f.a(f);
        this.g.a(f);
        this.e.set(((Float) this.f.f()).floatValue(), ((Float) this.g.f()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((blm) this.a.get(i)).a();
        }
    }

    /* Access modifiers changed, original: final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object a(bpf bpf, float f) {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object f() {
        return this.e;
    }
}
