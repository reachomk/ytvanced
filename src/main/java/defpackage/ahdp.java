package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: ahdp */
public final class ahdp {
    public static final byte[] a = new byte[]{(byte) 0};
    private static final byte[] b = new byte[]{(byte) 1};
    private final ArrayDeque c = new ArrayDeque();
    private final MessageDigest d;
    private int e;
    private final boolean f;

    public ahdp() {
        try {
            this.d = MessageDigest.getInstance("SHA-256");
            this.f = false;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public ahdp(boolean z) {
        try {
            this.d = MessageDigest.getInstance("SHA-256");
            this.f = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void a() {
        this.c.clear();
        this.e = 0;
    }

    public final void a(byte[] bArr) {
        this.c.push(new ahdu(0, bArr));
        this.e++;
        d();
    }

    public final byte[] b() {
        while (this.c.size() > 1) {
            ahdu ahdu = (ahdu) this.c.peek();
            ahdu.a++;
            d();
        }
        if (this.c.size() == 1) {
            return ((ahdu) this.c.peek()).b;
        }
        this.d.reset();
        return this.f ? ahdp.b(this.d.digest()) : this.d.digest();
    }

    private final void d() {
        while (this.c.size() >= 2) {
            ahdu ahdu = (ahdu) this.c.pop();
            if (ahdu.a != ((ahdu) this.c.peek()).a) {
                this.c.push(ahdu);
                return;
            }
            ahdu ahdu2 = (ahdu) this.c.pop();
            this.d.reset();
            this.d.update(b);
            this.d.update(ahdu2.b);
            this.d.update(ahdu.b);
            byte[] digest = this.d.digest();
            ArrayDeque arrayDeque = this.c;
            int i = ahdu2.a + 1;
            if (this.f) {
                digest = ahdp.b(digest);
            }
            arrayDeque.push(new ahdu(i, digest));
        }
    }

    static byte[] b(byte[] bArr) {
        return Arrays.copyOf(bArr, 10);
    }

    public static ahdr c() {
        return new ahds(false);
    }

    public static ahdr a(boolean z) {
        return new ahds(z);
    }

    public static ahdr b(boolean z) {
        return new ahdt(z);
    }
}
