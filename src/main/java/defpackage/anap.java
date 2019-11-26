package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: anap */
final class anap extends anaf {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, int i) {
        b();
        this.a.update(bArr, 0, i);
    }

    private final void b() {
        amqw.b(this.c ^ 1, (Object) "Cannot re-use a Hasher after calling hash() on it");
    }

    public final anak a() {
        b();
        this.c = true;
        if (this.b == this.a.getDigestLength()) {
            return anak.a(this.a.digest());
        }
        return anak.a(Arrays.copyOf(this.a.digest(), this.b));
    }

    /* synthetic */ anap(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }
}
