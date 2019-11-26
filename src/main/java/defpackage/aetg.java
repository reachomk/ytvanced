package defpackage;

/* renamed from: aetg */
final class aetg extends bqc {
    private final /* synthetic */ aeth b;

    aetg(aeth aeth) {
        this.b = aeth;
        super(30000, 4, 1.0f);
    }

    public final void a_(bqn bqn) {
        if (bqn instanceof bpx) {
            if (this.a > 0) {
                throw bqn;
            } else if (this.b.a != afpt.g) {
                aeth aeth = this.b;
                afqa afqa = aeth.b;
                if (afqa != null) {
                    afqa.a(aeth.a).a(this.b.a);
                    this.b.n();
                }
            }
        }
        super.a_(bqn);
    }
}
