package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ih */
public final class ih {
    public float a;
    public float b;
    public float c;
    public final List d = new ArrayList();
    private float e;
    private float f;
    private final List g = new ArrayList();

    public ih() {
        a();
    }

    public final void a() {
        a(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.d.clear();
        this.g.clear();
    }

    public final void a(float f, float f2) {
        ik ikVar = new ik();
        ikVar.a = f;
        ikVar.b = f2;
        this.d.add(ikVar);
        im iiVar = new ii(ikVar, this.b, this.c);
        a(iiVar, iiVar.a() + 270.0f, iiVar.a() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void a(Matrix matrix, Path path) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((in) this.d.get(i)).a(matrix, path);
        }
    }

    /* Access modifiers changed, original: final */
    public final im a(Matrix matrix) {
        a(this.f);
        return new ig(new ArrayList(this.g), matrix);
    }

    public final void a(im imVar, float f, float f2) {
        a(f);
        this.g.add(imVar);
        this.e = f2;
    }

    private final void a(float f) {
        float f2 = this.e;
        if (f2 != f) {
            f2 = ((f - f2) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                float f3 = this.b;
                float f4 = this.c;
                il ilVar = new il(f3, f4, f3, f4);
                ilVar.e = this.e;
                ilVar.f = f2;
                this.g.add(new ij(ilVar));
                this.e = f;
            }
        }
    }
}
