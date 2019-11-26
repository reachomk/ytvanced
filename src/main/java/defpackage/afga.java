package defpackage;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: afga */
public final class afga extends nou implements aevh, aewe {
    public final aewe c;
    private final afgf d;
    private final boolean e;
    private final Handler f;
    private final Boolean g;
    private final Map h = new LinkedHashMap();

    public afga(noz noz, nvo nvo, noo noo, long j, int i, npo[] npoArr, afgf afgf, boolean z, Handler handler, aewe aewe, boolean z2) {
        super(noz, nvo, noo, j, i, (npm[]) npoArr);
        this.d = afgf;
        this.e = z;
        this.f = handler;
        this.c = aewe;
        this.g = Boolean.valueOf(z2);
    }

    /* Access modifiers changed, original: protected|final */
    public final nny a(noy noy, nox nox, nvo nvo, nmx nmx, nov nov, int i, int i2, boolean z) {
        long b;
        noy noy2 = noy;
        nox nox2 = nox;
        nov nov2 = nov;
        int i3 = i;
        npm npm = nox2.c;
        nom nom = npm.b;
        long a = nox2.a(i3);
        int a2 = nox.a();
        int a3 = this.d.a(i3, a(nom.a));
        int i4 = (i3 + a3) - 1;
        int i5 = 1;
        if (i4 == a2) {
            b = nox2.b(i4);
        } else {
            b = nox2.a(i4 + 1);
        }
        long j = b;
        npj d = nox2.d(i3);
        long j2 = d.b;
        while (i5 < a3) {
            j2 += nox2.d(i3 + i5).b;
            i5++;
            a3 = a3;
        }
        nvq nvq = new nvq(d.a(npm.d), d.a, j2, npm.e);
        j2 = noy2.b - npm.c;
        if (nox2.a) {
            return new nor(nvo, nvq, nom, a, j, i, nov2.a, noy2.a);
        }
        int i6;
        int i7;
        if (this.e) {
            i6 = -1;
            i7 = -1;
        } else {
            int i8 = nov2.b;
            i7 = nov2.c;
            i6 = i8;
        }
        int i9 = a3;
        return new afgc(nvo, nvq, i2, nom, a, j, i, j2, nox2.b, nmx, i6, i7, noy2.d, z, noy2.a, i9);
    }

    public final void a(nny nny) {
        if (nny instanceof nop) {
            nrq nrq = ((nop) nny).c;
            if (nrq instanceof nqy) {
                nom nom = nny.f;
                if (nom != null) {
                    String str = nom.a;
                    if (str != null) {
                        this.h.put(str, (nqy) nrq);
                    }
                }
            }
        }
        super.a(nny);
    }

    public final ofj a(String str) {
        nqy nqy = (nqy) this.h.get(str);
        return nqy != null ? new ofj(nqy.b, nqy.c, nqy.d, nqy.e) : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final nrc c(String str) {
        if (!nou.d_(str)) {
            return new nsr();
        }
        nrc aewf;
        if (this.g.booleanValue()) {
            aewf = new aewf(this);
        } else {
            aewf = new nuz((byte) 0);
        }
        return aewf;
    }

    public final void a(byte[] bArr, long j) {
        Handler handler = this.f;
        if (handler != null && this.c != null) {
            handler.post(new afgd(this, bArr, j));
        }
    }
}
