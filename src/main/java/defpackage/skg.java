package defpackage;

import android.util.SparseArray;
import com.youtube.android.libraries.elements.templates.PbToFb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: skg */
public final class skg implements swz {
    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private final sxd c;

    public skg(Map map, Map map2, sxd sxd) {
        for (sxb sxb : map.values()) {
            this.a.put(sxb.a(), sxb);
        }
        for (sxe sxe : map2.values()) {
            this.b.put(sxe.a().a(), sxe);
        }
        this.c = sxd;
    }

    private final cma a(cmg cmg, swk swk, baov baov, swp swp) {
        int a = baov.a(8);
        a = a != 0 ? baov.d(a) : 0;
        cma cma = null;
        ArrayList arrayList = new ArrayList(Collections.nCopies(a, null));
        ArrayList arrayList2 = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        Collections.shuffle(arrayList2);
        for (int i2 = 0; i2 < a; i2++) {
            int intValue = ((Integer) arrayList2.get(i2)).intValue();
            baov baov2 = new baov();
            int a2 = baov.a(8);
            if (a2 != 0) {
                baov2.a(baov.b(baov.e(a2) + (intValue << 2)), baov.b);
            } else {
                baov2 = null;
            }
            arrayList.set(((Integer) arrayList2.get(i2)).intValue(), a(cmg, swk, baov2, swp));
        }
        baoz baoz = (baoz) sza.a.a();
        a = baov.a(4);
        if (a != 0) {
            baoz.a(baov.b(a + baov.a), baov.b);
        } else {
            baoz = null;
        }
        try {
            if (baoz.d() == 1) {
                sxb sxb = (sxb) this.a.get(baoz.a());
                if (sxb != null) {
                    cma = sxb.a(cmg, swk, sxb.a(baoz.c()), baov.b(), baov.a(), arrayList, swp);
                }
            } else if (baoz.d() == 2) {
                sxe sxe = (sxe) this.b.get(baoz.a());
                if (sxe != null) {
                    cma = sxe.a(cmg, swk, (anze) sxe.a().b().getParserForType().a(baoz.c()), baov.b(), baov.a(), arrayList, swp);
                }
            }
            if (cma == null) {
                sxd sxd = this.c;
                int a3 = baoz.a();
                StringBuilder stringBuilder = new StringBuilder(35);
                stringBuilder.append("Component was not found ");
                stringBuilder.append(a3);
                sxd.b(1, stringBuilder.toString());
                cma = (cza) cza.a(cmg).c();
                sza.a.a(baoz);
            } else {
                sza.a.a(baoz);
            }
        } catch (anyg e) {
            sxd sxd2 = this.c;
            int a4 = baoz.a();
            StringBuilder stringBuilder2 = new StringBuilder(34);
            stringBuilder2.append("Error while converting ");
            stringBuilder2.append(a4);
            sxd2.b(1, stringBuilder2.toString(), e);
            cma = (cza) cza.a(cmg).c();
            sza.a.a(baoz);
        } catch (Throwable th) {
            if (baoz != null) {
                sza.a.a(baoz);
            }
        }
        return cma == null ? (cza) cza.a(cmg).c() : cma;
    }

    public final cma a(cmg cmg, swk swk, byte[] bArr, swp swp, bbmz bbmz) {
        baov baov = new baov();
        try {
            int a = PbToFb.a(bArr, baov);
            if (a == 0) {
                return a(cmg, swk, baov, swp, bbmz);
            }
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("Failed to convert Element to Flatbuffers: ");
            stringBuilder.append(a);
            throw new sxf(stringBuilder.toString());
        } catch (IOException e) {
            throw new sxf("Error parsing Element bytes", e);
        }
    }
}
