package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: blj */
public abstract class blj {
    public final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    public bph d;
    private final List e;
    private bpf f;
    private bpf g;
    private float h = -1.0f;
    private Object i = null;
    private float j = -1.0f;
    private float k = -1.0f;

    blj(List list) {
        this.e = list;
    }

    public abstract Object a(bpf bpf, float f);

    public final void a(blm blm) {
        this.a.add(blm);
    }

    public void a(float f) {
        if (!this.e.isEmpty()) {
            bpf b = b();
            if (f < g()) {
                f = g();
            } else if (f > e()) {
                f = e();
            }
            if (f != this.c) {
                this.c = f;
                bpf b2 = b();
                if (b != b2 || !b2.d()) {
                    a();
                }
            }
        }
    }

    public void a() {
        for (int i = 0; i < this.a.size(); i++) {
            ((blm) this.a.get(i)).a();
        }
    }

    public final bpf b() {
        bpf bpf = this.f;
        if (bpf != null && bpf.a(this.c)) {
            return this.f;
        }
        List list = this.e;
        bpf = (bpf) list.get(list.size() - 1);
        if (this.c < bpf.b()) {
            int size = this.e.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                bpf = (bpf) this.e.get(size);
                if (bpf.a(this.c)) {
                    break;
                }
            }
        }
        this.f = bpf;
        return bpf;
    }

    /* Access modifiers changed, original: final */
    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        bpf b = b();
        if (b.d()) {
            return 0.0f;
        }
        return (this.c - b.b()) / (b.c() - b.b());
    }

    public final float d() {
        bpf b = b();
        return !b.d() ? b.d.getInterpolation(c()) : 0.0f;
    }

    private final float g() {
        float f = this.j;
        if (f == -1.0f) {
            f = !this.e.isEmpty() ? ((bpf) this.e.get(0)).b() : 0.0f;
            this.j = f;
        }
        return f;
    }

    /* Access modifiers changed, original: 0000 */
    public float e() {
        float f = this.k;
        if (f == -1.0f) {
            if (this.e.isEmpty()) {
                f = 1.0f;
            } else {
                List list = this.e;
                f = ((bpf) list.get(list.size() - 1)).c();
            }
            this.k = f;
        }
        return f;
    }

    public Object f() {
        bpf b = b();
        float d = d();
        if (this.d == null && b == this.g && this.h == d) {
            return this.i;
        }
        this.g = b;
        this.h = d;
        Object a = a(b, d);
        this.i = a;
        return a;
    }
}
