package defpackage;

/* renamed from: alrv */
enum alrv {
    STOPPED(false, true, false, false),
    STARTING(true, false, false, false),
    STARTED(true, false, true, false),
    STOPPING(false, false, false, true);
    
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    private alrv(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }
}
