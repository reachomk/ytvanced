package defpackage;

import java.io.Serializable;

/* renamed from: bcpu */
public final class bcpu extends bcql implements bcqf, Serializable {
    public static final bcpu a = new bcpu(0);
    public static final long serialVersionUID = 2471658376918L;

    public static bcpu a(long j) {
        return new bcpu(j);
    }

    public bcpu(long j) {
        super(j);
    }

    public bcpu(bcqe bcqe, bcqe bcqe2) {
        super(bcqe, bcqe2);
    }

    public final long a() {
        return this.b / 1000;
    }
}
