package defpackage;

/* renamed from: amyn */
public enum amyn {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);
    
    public final boolean f;

    private amyn(boolean z) {
        this.f = z;
    }
}
