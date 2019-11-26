package defpackage;

import java.security.SecureRandom;

/* renamed from: rbm */
final class rbm extends ThreadLocal {
    rbm() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
