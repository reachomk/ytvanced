package defpackage;

import java.io.Serializable;

/* renamed from: bcqd */
public final class bcqd extends bcqi implements bcqe, Serializable, Cloneable {
    public static final long serialVersionUID = 2852608688135209575L;

    public bcqd(bcpt bcpt) {
        super(bcpt);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public final String toString() {
        return bctb.a.a((bcqe) this);
    }
}
