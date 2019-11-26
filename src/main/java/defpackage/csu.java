package defpackage;

/* renamed from: csu */
final class csu {
    public final String a;
    public int b;
    public coj c;
    public coj d;
    public final coj e;
    public boolean f;

    public csu(String str, coj coj, coj coj2, coj coj3) {
        this.a = str;
        this.c = coj;
        this.d = coj2;
        this.e = coj3;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return (this.b & 32) != 0;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z) {
            this.b |= 32;
        } else {
            this.b &= -33;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return (this.b & 30) == 30;
    }
}
