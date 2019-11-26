package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: aefd */
public final class aefd implements ovi {
    private final Set a;
    private Uri b;
    private String c;
    private long d;
    private int e;
    private final ovi f = new ovw();

    aefd(Set set) {
        this.a = set;
    }

    public final void a(owt owt) {
        this.f.a(owt);
    }

    public final long a(ovm ovm) {
        this.b = ovm.a;
        this.c = ovm.g;
        this.d = ovm.e;
        this.e = ovm.h;
        d();
        return ovm.f;
    }

    public final void a() {
        this.b = null;
        e();
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a = this.f.a(bArr, i, i2);
        if (a >= 0) {
            this.d += (long) a;
            return a;
        }
        e();
        return d() ? a(bArr, i, i2) : -1;
    }

    public final Uri b() {
        return this.b;
    }

    private final boolean d() {
        for (oww oww : this.a) {
            oxf a = oww.a(this.c, this.d);
            if (a != null) {
                if (a.d) {
                    Uri fromFile = Uri.fromFile(a.e);
                    long j = this.d;
                    long j2 = j - a.b;
                    long j3 = a.c - j2;
                    if (j3 > 0) {
                        this.f.a(new ovm(fromFile, j, j2, j3, this.c, this.e));
                        return true;
                    }
                    throw new EOFException();
                }
                oww.a(a);
            }
        }
        return false;
    }

    private final void e() {
        ovi ovi = this.f;
        if (ovi != null) {
            ovi.a();
        }
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
