package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: anaq */
final class anaq extends anai implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    anaq(String str, String str2) {
        this.a = anaq.a(str);
        this.b = this.a.getDigestLength();
        this.d = (String) amqw.a((Object) str2);
        this.c = anaq.a(this.a);
    }

    anaq(String str, int i, String str2) {
        this.d = (String) amqw.a((Object) str2);
        this.a = anaq.a(str);
        int digestLength = this.a.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        amqw.a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = anaq.a(this.a);
    }

    private static boolean a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.d;
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final anal a() {
        if (this.c) {
            try {
                return new anap((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new anap(anaq.a(this.a.getAlgorithm()), this.b);
    }

    /* Access modifiers changed, original: final */
    public final Object writeReplace() {
        return new anas(this.a.getAlgorithm(), this.b, this.d);
    }
}
