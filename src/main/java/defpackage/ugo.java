package defpackage;

/* renamed from: ugo */
public enum ugo {
    HIDDEN(0.0f),
    COLLAPSED(25.0f),
    EXPANDED(75.0f),
    FULLY_EXPANDED(100.0f);
    
    public ugo e;
    public ugo f;
    public final float g;

    public static ugo a(String str) {
        return (ugo) Enum.valueOf(ugo.class, str);
    }

    private ugo(float f) {
        this.g = f;
    }

    static {
        r5.e = r5;
        r5.f = r5;
        r1.e = r1;
        r1.f = r2;
        r2.e = r1;
        r2.f = r3;
        r3.e = r2;
        r3.f = r3;
    }
}
