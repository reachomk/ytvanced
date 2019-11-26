package defpackage;

/* renamed from: aiui */
public enum aiui {
    ENABLE(true),
    DISABLE(false);
    
    public final boolean c;

    private aiui(boolean z) {
        this.c = z;
    }

    public static aiui a(boolean z) {
        return !z ? DISABLE : ENABLE;
    }

    public static bcud a(aiug aiug) {
        bdfi h = bdfi.h();
        h.a(new aiuk(aiug));
        return h;
    }
}
