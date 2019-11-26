package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aeqr */
public abstract class aeqr implements aerg {
    private final ArrayList b = new ArrayList();
    private int c = 0;

    aeqr() {
    }

    public abstract float a(int i, List list);

    public abstract int a(int i);

    public abstract float b(float f);

    public abstract float c(float f);

    public abstract int c();

    public final void a() {
        this.c = 0;
    }

    public final void a(float f) {
        c();
        if (this.b.size() >= 10) {
            this.b.remove(0);
        }
        this.b.add(Float.valueOf(b(f)));
        this.c++;
    }

    public final float b() {
        int size = this.b.size();
        return c(a(this.c, this.b.subList(Math.max(0, size - a(this.c)), size)));
    }
}
