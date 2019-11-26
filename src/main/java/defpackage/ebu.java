package defpackage;

/* renamed from: ebu */
public final class ebu extends acxv {
    protected ebu(int i, boolean z) {
        super("browse", i, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(xbb xbb) {
        boolean a = super.a(xbb);
        if (!a || xbb.getClass() == eev.class) {
            return a;
        }
        a("abandoned_browse");
        return true;
    }
}
