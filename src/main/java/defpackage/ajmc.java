package defpackage;

/* renamed from: ajmc */
public final class ajmc implements ajlz {
    private ajlz a;

    public final synchronized void a(ajlz ajlz) {
        this.a = ajlz;
    }

    public final synchronized boolean a(afif afif) {
        ajlz ajlz = this.a;
        if (ajlz == null) {
            return false;
        }
        return ajlz.a(afif);
    }
}
