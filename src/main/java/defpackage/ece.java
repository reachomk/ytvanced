package defpackage;

/* renamed from: ece */
public final class ece extends acxv {
    protected ece(int i, boolean z) {
        super("inline_playback", i, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(xbb xbb) {
        boolean a = super.a(xbb);
        if (!a || xbb.getClass() == ahjq.class) {
            return a;
        }
        a("abandoned_inline_playback");
        return true;
    }
}
