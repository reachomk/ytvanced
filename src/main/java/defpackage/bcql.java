package defpackage;

import java.io.Serializable;

/* renamed from: bcql */
public class bcql extends bcqg implements bcqf, Serializable {
    public static final long serialVersionUID = 2581698638990L;
    public volatile long b;

    protected bcql(long j) {
        this.b = j;
    }

    protected bcql(bcqe bcqe, bcqe bcqe2) {
        if (bcqe == bcqe2) {
            this.b = 0;
            return;
        }
        this.b = bcrr.a(bcpo.a(bcqe2), -bcpo.a(bcqe));
    }

    public final long b() {
        return this.b;
    }
}
