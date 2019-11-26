package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: srt */
public final class srt implements sxj {
    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();
    private final Map c;
    private final sxd d;

    public srt(Collection collection, Collection collection2, Map map, sxd sxd) {
        this.d = sxd;
        for (sxl sxl : collection) {
            this.a.put(sxl.a(), sxl);
        }
        for (sxl sxl2 : collection2) {
            this.b.put(sxl2.a(), sxl2);
        }
        amuu amuu = new amuu();
        for (Entry entry : map.entrySet()) {
            amuu.b(Integer.valueOf(((sxo) ((Pair) entry.getValue()).first).a().a()), (Pair) entry.getValue());
        }
        this.c = amuu.b();
    }

    public final void a(cmg cmg, bapc bapc, swn swn) {
        if (bapc != null) {
            baoz baoz = (baoz) sza.a.a();
            HashSet hashSet = new HashSet();
            hashSet.addAll(srt.a(cmg, bapc, swn, this.a, baoz));
            hashSet.addAll(srt.a(cmg, bapc, swn, this.b, baoz));
            Map map = this.c;
            sxd sxd = this.d;
            HashSet hashSet2 = new HashSet();
            for (int i = 0; i < bapc.a(); i++) {
                bapc.a(baoz, i);
                if (baoz.d() != 1) {
                    if (baoz.d() != 2) {
                        hashSet2.add(Integer.valueOf(baoz.a()));
                    } else if (baoz.a() != 224886694) {
                        Pair pair = (Pair) map.get(Integer.valueOf(baoz.a()));
                        if (pair != null) {
                            try {
                                ((sxo) pair.first).a(cmg, (anze) ((anzq) pair.second).a(baoz.c()), swn);
                            } catch (anyg e) {
                                int a = baoz.a();
                                StringBuilder stringBuilder = new StringBuilder(89);
                                stringBuilder.append("Failed to set PB Property Extension in PropertiesConverterFlat. Extension id: ");
                                stringBuilder.append(a);
                                sxd.a(3, stringBuilder.toString(), e);
                            }
                        }
                    }
                }
            }
            hashSet.addAll(hashSet2);
            if (hashSet.isEmpty()) {
                sza.a.a(baoz);
                return;
            }
            String valueOf = String.valueOf(hashSet.toString());
            String str = "Extensions with unknown format: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new sxf(valueOf);
        }
    }

    private static Collection a(cmg cmg, bapc bapc, swn swn, SparseArray sparseArray, baoz baoz) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < bapc.a(); i++) {
            bapc.a(baoz, i);
            if (baoz.d() == 1) {
                sxl sxl = (sxl) sparseArray.get(baoz.a());
                if (sxl != null) {
                    sxl.a(cmg, sxl.a(baoz.c()), swn);
                }
            } else if (baoz.d() != 2) {
                hashSet.add(Integer.valueOf(baoz.a()));
            }
        }
        return hashSet;
    }
}
