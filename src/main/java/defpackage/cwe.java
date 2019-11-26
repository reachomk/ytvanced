package defpackage;

/* renamed from: cwe */
public final class cwe {
    public cwb a;

    private cwe() {
    }

    public final cwe a(cwk cwk) {
        b();
        if (cwk != null) {
            this.a.b.add(((cxb) cwk).b());
        }
        return this;
    }

    public final cwb a() {
        b();
        cwb cwb = this.a;
        this.a = null;
        cwb.a.a(this);
        return cwb;
    }

    private final void b() {
        if (this.a == null) {
            throw new IllegalStateException(".build() call has been already made on this Builder.");
        }
    }

    /* synthetic */ cwe(byte b) {
    }
}
