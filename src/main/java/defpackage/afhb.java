package defpackage;

import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: afhb */
final class afhb implements Comparator {
    public boolean a;
    public long b;
    private final oux c;
    private final aeeu d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final long i;
    private final boolean j = false;
    private final boolean k;
    private final afjs l;

    private static float a(int i) {
        return (i == 0 || i == 1) ? 1000.0f : i != 2 ? 1.0f : 900.0f;
    }

    private final boolean a(aahr aahr) {
        String str = aahr.b;
        return !TextUtils.isEmpty(str) && this.d.a(str, aahr.e, 0, 0, 0, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        aahr aahr = (aahr) obj;
        aahr aahr2 = (aahr) obj2;
        float u = (float) aahr.u();
        float u2 = (float) aahr2.u();
        if (this.a) {
            long a;
            if (this.e) {
                u *= afhb.a(aahr.y());
                u2 *= afhb.a(aahr2.y());
            }
            if (this.f) {
                a = this.c.a();
                if (a > 0) {
                    if (((long) aahr.f) <= a) {
                        u *= 10.0f;
                    }
                    if (((long) aahr2.f) <= a) {
                        u2 *= 10.0f;
                    }
                }
            }
            int i2 = aahr.f;
            a = this.b;
            long j = this.i;
            if (((long) i2) + a > j) {
                u /= 10.0f;
            }
            if (((long) aahr2.f) + a > j) {
                u2 /= 10.0f;
            }
            if (this.g) {
                afjs afjs = this.l;
                int i3 = afjs.b;
                i2 = afjs.c;
                if (i3 > 0 && i2 > 0) {
                    if (aahr.f() <= i3 && aahr.g() <= i2 && this.g) {
                        u *= 10.0f;
                    }
                    if (aahr2.f() <= i3 && aahr2.g() <= i2 && this.g) {
                        u2 *= 10.0f;
                    }
                }
            }
            if (this.h) {
                if (u == 1.0f) {
                    u *= 10.0f;
                }
                if (u2 == 1.0f) {
                    u2 *= 10.0f;
                }
            }
            if (this.k) {
                if (a(aahr)) {
                    u *= 800.0f;
                }
                if (a(aahr2)) {
                    u2 *= 800.0f;
                }
            }
        }
        if (u > u2) {
            i = -1;
        } else if (u == u2) {
            return 0;
        } else {
            i = 1;
        }
        return i;
    }

    /* synthetic */ afhb(oux oux, aeeu aeeu, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, afjs afjs) {
        this.c = oux;
        this.d = aeeu;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = j;
        this.k = z5;
        this.l = afjs;
    }
}
