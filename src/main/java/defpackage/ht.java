package defpackage;

/* renamed from: ht */
public class ht implements Cloneable {
    public float a;

    public ht() {
        this.a = 0.0f;
    }

    public void a(float f, ih ihVar) {
    }

    protected ht(float f) {
        this.a = f;
    }

    /* renamed from: a */
    public final ht clone() {
        try {
            return (ht) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
