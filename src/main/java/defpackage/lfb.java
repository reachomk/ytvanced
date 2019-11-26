package defpackage;

/* renamed from: lfb */
final class lfb extends lev {
    private final /* synthetic */ leu e;

    lfb(leu leu, String str, leh leh) {
        this.e = leu;
        super(str, leh);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (i == 5) {
            leu leu = this.e;
            String str = this.a;
            leh leh = this.b;
            lev b = leu.b(str);
            if (leu.a(str) && leh != null && leh.equals(b.b)) {
                if (this.c == 2) {
                    super.a(4);
                }
                return;
            }
        }
        super.a(i);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        super.a(5);
    }
}
