package defpackage;

/* renamed from: alzj */
public abstract class alzj extends alyx {
    private final amec a;

    public alzj(amec amec) {
        this.a = amec;
    }

    public abstract bbnr a();

    public void b(amdz amdz) {
    }

    public final void a(amdz amdz) {
        try {
            a().a(amdz, this.a);
            b(amdz);
        } catch (Exception e) {
            throw new RuntimeException("Could not apply the setState BiFunction.", e);
        }
    }
}
