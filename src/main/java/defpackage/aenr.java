package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aenr */
final class aenr implements aeob {
    private final List a;
    private final long b;

    aenr() {
        this(0);
    }

    public final synchronized void b() {
    }

    aenr(long j) {
        this.a = new ArrayList();
        this.b = j;
        this.a.add(new aenu(aepb.a(0, 0), new aenw(j)));
    }

    public final synchronized void a(byte[] bArr, int i, int i2, aepb aepb) {
        aenu aenu;
        if (aepb == aepc.a) {
            aenu = (aenu) this.a.get(0);
        } else {
            for (aenu aenu2 : this.a) {
                if (aenu2.a.b() == aepb.a()) {
                    aenu = aenu2;
                    break;
                }
            }
            aenu = new aenu(aepb.a(aepb.a(), aepb.a()), new aenw(this.b));
            this.a.add(aenu);
        }
        aenu.b.a(bArr, i, i2, aepb);
        aenu.a = aepb.a(aenu.a.a(), aenu.a.b() + ((long) i2));
    }

    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        for (aenu aenu : this.a) {
            if (aenu.a.a(j)) {
                break;
            }
        }
        aenu aenu2 = null;
        if (aenu2 == null) {
            return 0;
        }
        return aenu2.b.a(j - aenu2.a.a(), i, bArr, i2);
    }

    public final synchronized boolean a(long j) {
        boolean z;
        for (aenu aenu : this.a) {
            if (aenu.a.a(j)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    public final synchronized long a() {
        return this.b;
    }
}
