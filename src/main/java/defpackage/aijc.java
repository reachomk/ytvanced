package defpackage;

/* renamed from: aijc */
public final class aijc extends ajmp {
    private final /* synthetic */ aiix a;

    public aijc(aiix aiix, long j, long j2) {
        this.a = aiix;
        super(j, j2, ajms.DEFAULT, ajmr.NOT_DRAWABLE, null);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.a.c = false;
            return;
        }
        aiix aiix = this.a;
        aiix.c = true;
        aiix.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.a.c = false;
    }
}
