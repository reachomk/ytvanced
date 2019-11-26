package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afzk */
public final class afzk {
    private final zzf a;
    private final SharedPreferences b;
    private final xsf c;
    private final Map d = new HashMap();
    private final boolean e;

    public afzk(zzf zzf, SharedPreferences sharedPreferences, xsf xsf, zyw zyw) {
        this.a = zzf;
        this.b = sharedPreferences;
        this.c = xsf;
        boolean z = true;
        if (ahda.d(zyw)) {
            oxu.a = true;
        }
        if (!(ahda.d(zyw) || ahda.e(zyw))) {
            z = false;
        }
        this.e = z;
    }

    public final synchronized oww a(File file) {
        String absolutePath = file.getAbsolutePath();
        if (this.d.containsKey(absolutePath)) {
            return (oww) this.d.get(absolutePath);
        }
        Object b;
        try {
            b = b(file);
        } catch (IllegalStateException e) {
            xtl.a("IllegalStateException while creating SimpleCache", e);
            afpc.a(2, afpf.offline, "SimpleCache Collision", e);
            nxp.a();
            b = b(file);
        }
        this.d.put(absolutePath, b);
        return b;
    }

    public final synchronized void a() {
        for (oww b : this.d.values()) {
            b.b();
        }
        this.d.clear();
    }

    private final oww b(File file) {
        arhb k = this.a.k();
        byte[] bArr = null;
        oxr oxr;
        if (this.e) {
            oxr = new oxr();
            if (k.f) {
                bArr = b();
            }
            return new oxu(file, oxr, bArr, k.g);
        }
        oxr = new oxr();
        if (k.f) {
            bArr = b();
        }
        return new nxp(file, oxr, bArr, k.g);
    }

    private final byte[] b() {
        return this.c.a(this.b).getEncoded();
    }
}
