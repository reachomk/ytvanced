package defpackage;

/* renamed from: ib */
public final class ib extends ht implements Cloneable {
    public ib(float f) {
        super(f);
    }

    public final void a(float f, ih ihVar) {
        float f2 = this.a;
        ihVar.a(f2 * f, 180.0f, 90.0f);
        f2 = (f2 + f2) * f;
        il ilVar = new il(0.0f, 0.0f, f2, f2);
        ilVar.e = 180.0f;
        ilVar.f = 90.0f;
        ihVar.d.add(ilVar);
        ihVar.a(new ij(ilVar), 180.0f, 270.0f);
        float f3 = (0.0f + f2) * 0.5f;
        f2 /= 2.0f;
        ihVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f2) + f3;
        ihVar.c = f3 + (f2 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
