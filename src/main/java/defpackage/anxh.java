package defpackage;

/* renamed from: anxh */
enum anxh {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    public final boolean e;

    private anxh(boolean z) {
        this.e = z;
    }
}
