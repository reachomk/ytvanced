package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: nye */
public final class nye implements odw {
    public final nyf a;
    public final List b;
    public boolean c;
    public oea d;
    public int e = 3;
    public volatile nyh f;
    private final UUID g;
    private final nyj h;
    private final HashMap i;
    private final Handler j;
    private final nxt k;
    private Looper l;

    public nye(UUID uuid, nyj nyj, HashMap hashMap, Handler handler, nyf nyf, nxt nxt) {
        oxz.a((Object) uuid);
        oxz.a((Object) nyf);
        this.g = uuid;
        this.h = nyj;
        this.i = hashMap;
        this.j = handler;
        this.a = nyf;
        this.k = nxt;
        this.c = false;
        this.b = new ArrayList();
    }

    public final boolean a(odq odq) {
        if (nye.a(odq, this.g, true) == null) {
            if (odq.b != 1 || !odq.a(0).a(nyr.b)) {
                return false;
            }
            String valueOf = String.valueOf(this.g);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 72);
            stringBuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            stringBuilder.append(valueOf);
            Log.w("YTDrmSessionMgr", stringBuilder.toString());
        }
        String str = odq.a;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || ozp.a >= 24;
    }

    public final odu a(Looper looper, odq odq) {
        Looper looper2 = this.l;
        boolean z = looper2 == null || looper2 == looper;
        oxz.b(z);
        if (this.b.isEmpty()) {
            this.l = looper;
            if (this.f == null) {
                this.f = new nyh(this, looper);
            }
        }
        ods a = nye.a(odq, this.g, false);
        if (a == null) {
            nyk nyk = new nyk(this.g);
            Handler handler = this.j;
            if (!(handler == null || this.a == null)) {
                handler.post(new nyg(this, nyk));
            }
            return new ody(new odx(nyk));
        }
        int i;
        nxw nxw;
        nxw d;
        byte[] bArr = a.d;
        String str = a.c;
        nxt nxt = this.k;
        nxw nxw2 = null;
        Object a2 = nxt != null ? nxt.a(bArr) : null;
        this.h.a(Integer.valueOf(a2.b));
        Iterator it = this.b.iterator();
        nxw nxw3 = null;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                nxw = null;
                break;
            }
            nxw = (nxw) it.next();
            if (Arrays.equals(nxw.b, bArr)) {
                break;
            } else if (nxw.j == 4) {
                nxu nxu = nxw.g;
                if (nxu != null) {
                    if (!(a2.b == -1 || nxu.b == -1 || !Arrays.equals(a2.a, nxu.a))) {
                        if (Math.abs(a2.b - nxu.b) <= 1) {
                            nxw3 = nxw;
                        }
                    }
                }
            }
        }
        if (nxw != null) {
            d = nxw.d();
        } else if (nxw3 != null && this.c) {
            oxz.a(a2);
            if (nxw3.d() != null) {
                nxw d2 = nxw3.d();
                for (nxw nxw4 : this.b) {
                    if (nxw4 != d2 && nxw4 != nxw3 && nxw4.d() == d2) {
                        nxw2 = nxw4;
                        break;
                    }
                }
            }
            if (nxw2 != null) {
                nxw2.b();
                this.b.remove(nxw2);
            }
            nxw2 = nxw3.d();
            int i2 = a2.b;
            nxu nxu2 = nxw3.g;
            if (nxu2 != null) {
                i = nxu2.b;
            }
            if (i2 > i) {
                d = a(bArr, str, a2, nxw2);
                this.b.add(d);
                d.a();
            }
            d = nxw2;
        } else {
            d = a(bArr, str, a2, null);
            this.b.add(d);
        }
        d.a();
        return d;
    }

    private final nxw a(byte[] bArr, String str, nxu nxu, nxw nxw) {
        oxz.a(this.d);
        return new nxw(this.g, this.d, bArr, str, this.i, this.h, this.l, this.j, this.a, this.e, nxu, nxw, new nyd(this));
    }

    public final void a(odu odu) {
        if (!(odu instanceof ody)) {
            ((nxw) odu).b();
        }
    }

    private static ods a(odq odq, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(odq.b);
        for (int i = 0; i < odq.b; i++) {
            ods a = odq.a(i);
            if ((a.a(uuid) || (nyr.c.equals(uuid) && a.a(nyr.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (nyr.d.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ods ods = (ods) arrayList.get(i2);
                int a2 = ods.a() ? ohs.a(ods.d) : -1;
                if (ozp.a < 23 && a2 == 0) {
                    return ods;
                }
                if (ozp.a >= 23 && a2 == 1) {
                    return ods;
                }
            }
        }
        return (ods) arrayList.get(0);
    }
}
