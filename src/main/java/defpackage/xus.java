package defpackage;

import java.security.SecureRandom;

/* renamed from: xus */
final /* synthetic */ class xus implements amro {
    private final xtb a;

    xus(xtb xtb) {
        this.a = xtb;
    }

    public final Object get() {
        try {
            this.a.a();
        } catch (IllegalStateException unused) {
        }
        return new SecureRandom();
    }
}
