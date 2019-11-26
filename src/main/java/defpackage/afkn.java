package defpackage;

/* renamed from: afkn */
public enum afkn {
    UNKNOWN(false, false, false),
    NONE(false, false, false),
    TEXTURE(true, false, false),
    SURFACE(afkh.g, false, true),
    YUV_SURFACE(afkh.g, false, true),
    SECURE_SURFACE(afkh.g, true, true),
    GL_GVR(false, false, false),
    GL_VPX(false, false, false),
    APPLICATION(false, false, false);
    
    public final boolean j;
    public final boolean k;
    public final boolean l;

    private afkn(boolean z, boolean z2, boolean z3) {
        this.j = z;
        this.k = z3;
        this.l = z2;
    }
}
