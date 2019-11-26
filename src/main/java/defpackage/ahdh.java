package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: ahdh */
public final class ahdh {
    public static avoq a(ataw ataw, String str) {
        for (avos avos : ataw.d) {
            avoq avoq = avos.b;
            if (avoq == null) {
                avoq = avoq.k;
            }
            if (avoq.b.equals(str)) {
                avoq avoq2 = avos.b;
                if (avoq2 == null) {
                    avoq2 = avoq.k;
                }
                return avoq2;
            }
        }
        return null;
    }

    public static atam a(ataq ataq, String str) {
        for (atas atas : ataq.c) {
            atam atam = atas.b;
            if (atam == null) {
                atam = atam.h;
            }
            if (atam.b.equals(str)) {
                atam atam2 = atas.b;
                if (atam2 == null) {
                    atam2 = atam.h;
                }
                return atam2;
            }
        }
        return null;
    }

    public static aygk a(aygk aygk, List list) {
        aaft aaft = new aaft(aygk);
        HashSet<aafo> hashSet = new HashSet();
        for (Integer intValue : list) {
            aafo a = aaft.a(intValue.intValue());
            if (a != null) {
                hashSet.add(a);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (aafo aafo : hashSet) {
            aygl aygl = (aygl) aygm.e.createBuilder();
            aygl.a(aafo.a);
            aygl.b(aafo.b);
            aygl.a(aafo.a().toString());
            arrayList.add((aygm) ((anxl) aygl.build()));
        }
        Collections.sort(arrayList, ahdk.a);
        aygj aygj = (aygj) aygk.f.createBuilder();
        aygj.copyOnWrite();
        aygk aygk2 = (aygk) aygj.instance;
        aygk2.b();
        anvf.addAll(arrayList, aygk2.b);
        return (aygk) ((anxl) aygj.build());
    }

    public static azlk a(String str, arlv arlv) {
        return ahdh.a(str, arlv.c, arlv.r, arlv.n);
    }

    public static azlk a(String str, int i, String str2, long j) {
        azlj azlj = (azlj) azlk.f.createBuilder();
        azlj.copyOnWrite();
        azlk azlk = (azlk) azlj.instance;
        if (str != null) {
            azlk.a |= 1;
            azlk.b = str;
            azlj.copyOnWrite();
            azlk azlk2 = (azlk) azlj.instance;
            azlk2.a |= 2;
            azlk2.c = i;
            if (!amqu.a(str2)) {
                azlj.copyOnWrite();
                azlk2 = (azlk) azlj.instance;
                if (str2 != null) {
                    azlk2.a |= 4;
                    azlk2.d = str2;
                } else {
                    throw new NullPointerException();
                }
            }
            if (j > 0) {
                azlj.copyOnWrite();
                azlk2 = (azlk) azlj.instance;
                azlk2.a |= 8;
                azlk2.e = j;
            }
            return (azlk) ((anxl) azlj.build());
        }
        throw new NullPointerException();
    }
}
