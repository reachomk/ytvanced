package defpackage;

/* renamed from: goq */
public final class goq {
    public int a;
    private final aizy b;
    private final ekn c;

    public goq(aizy aizy, ekn ekn) {
        this.b = aizy;
        this.c = ekn;
    }

    public final void a() {
        if (this.a == 0 && this.c.c == eko.REEL) {
            this.b.b();
        }
        this.a++;
    }

    public final void b() {
        int i = this.a;
        if (i > 0) {
            i--;
            this.a = i;
            if (i == 0 && this.c.c == eko.REEL) {
                this.b.a();
            }
        }
    }
}
