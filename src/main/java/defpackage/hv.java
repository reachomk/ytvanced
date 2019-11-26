package defpackage;

/* renamed from: hv */
public final class hv implements Cloneable {
    public static void a(float f, ih ihVar) {
        ihVar.a(f, 0.0f);
    }

    /* renamed from: a */
    public final hv clone() {
        try {
            return (hv) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
