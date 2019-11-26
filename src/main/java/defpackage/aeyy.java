package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aeyy */
public final class aeyy extends afao {
    private final aeoj b;
    private int c = 0;

    aeyy(aeoj aeoj, oqx oqx, afjc afjc, int[] iArr, oum oum, int i, ovi ovi, int i2, afag afag, int i3) {
        super(oqx, afjc, iArr, oum, i, ovi, i2, afag, i3);
        this.b = aeoj;
    }

    public final void a(long j, long j2, List list, oql oql) {
        try {
            if (!this.b.a() && this.c < 2) {
                Set hashSet = new HashSet();
                for (afau afau : this.a) {
                    hashSet.add(afau.b.c.a);
                }
                if (this.b.a(hashSet)) {
                    this.c++;
                } else {
                    return;
                }
            }
            super.a(j, j2, list, oql);
        } catch (aeom unused) {
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final oqh a(afau afau, ovi ovi, nzw nzw, int i, Object obj, oqz oqz, oqz oqz2) {
        if (afau.b.d.contains("oda")) {
            try {
                orc b = this.b.b(afau.b.c.a);
                if (b == null) {
                    aepe.a("newInitializationChunk: Null representation.");
                    return null;
                }
                if (oqz != null) {
                    oqz = b.f;
                }
                if (oqz2 != null) {
                    oqz2 = b.a();
                }
            } catch (aeom unused) {
                aepe.a("newInitializationChunk: IncompatibleException.");
                return null;
            }
        }
        return super.a(afau, ovi, nzw, i, obj, oqz, oqz2);
    }
}
