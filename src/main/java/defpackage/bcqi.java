package defpackage;

import java.io.Serializable;

/* renamed from: bcqi */
public class bcqi extends bcqh implements bcqe, Serializable {
    public static final long serialVersionUID = -6728882245981L;
    public volatile long a;
    public volatile bcpl b;

    public bcqi() {
        this(bcpo.a(), bcrf.L());
    }

    public bcqi(bcpt bcpt) {
        this(0, bcrf.b(bcpt));
    }

    private bcqi(long j, bcpl bcpl) {
        this.b = bcpo.a(bcpl);
        bcpl = this.b;
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final bcpl b() {
        return this.b;
    }
}
