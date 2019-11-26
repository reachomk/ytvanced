package defpackage;

/* renamed from: gzl */
public final class gzl implements acwx {
    private final gzo a;

    public gzl(gzo gzo) {
        this.a = gzo;
    }

    public final void a() {
    }

    public final void a(atrz atrz) {
        anvu anvu;
        azfa azfa = atrz.c;
        if (azfa == null) {
            azfa = azfa.h;
        }
        azfa azfa2;
        if ((azfa.a & 1) == 0) {
            azfa = atrz.c;
            if (azfa == null) {
                azfa = azfa.h;
            }
            azfa = azfa.f;
            if (azfa == null) {
                azfa = azfa.h;
            }
            if ((azfa.a & 1) != 0) {
                azfa2 = atrz.c;
                if (azfa2 == null) {
                    azfa2 = azfa.h;
                }
                azfa2 = azfa2.f;
                if (azfa2 == null) {
                    azfa2 = azfa.h;
                }
                anvu = azfa2.b;
            } else {
                anvu = null;
            }
        } else {
            azfa2 = atrz.c;
            if (azfa2 == null) {
                azfa2 = azfa.h;
            }
            anvu = azfa2.b;
        }
        if (anvu != null) {
            this.a.a(anvu);
        }
    }
}
