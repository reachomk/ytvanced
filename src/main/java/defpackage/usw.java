package defpackage;

import android.accounts.Account;

/* renamed from: usw */
public final class usw implements afpo {
    private final uzn a;

    public usw(uzn uzn) {
        this.a = uzn;
    }

    public final Account a(afpt afpt) {
        if (!(afpt instanceof ust)) {
            return null;
        }
        return uzn.a(((ust) afpt).b(), this.a.b());
    }

    public final Account b(afpt afpt) {
        if (!(afpt instanceof ust)) {
            return null;
        }
        return uzn.a(((ust) afpt).b(), this.a.a());
    }
}
