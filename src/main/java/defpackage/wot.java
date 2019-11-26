package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: wot */
public final class wot {
    public static amul a(azns azns) {
        if (azns != null) {
            aznu aznu = azns.c;
            if (aznu == null) {
                aznu = aznu.d;
            }
            if ((aznu.a & 2) != 0) {
                aznu aznu2 = azns.c;
                if (aznu2 == null) {
                    aznu2 = aznu.d;
                }
                azni azni = aznu2.c;
                if (azni == null) {
                    azni = azni.d;
                }
                if (azni.b.size() != 0) {
                    Collection arrayList = new ArrayList(azni.b.size());
                    for (aznk aznk : azni.b) {
                        if ((aznk.a & 1) != 0) {
                            Object obj = aznk.b;
                            if (obj == null) {
                                obj = aznm.h;
                            }
                            arrayList.add(obj);
                        }
                    }
                    return amul.a(arrayList);
                }
            }
        }
        return amul.g();
    }

    public static CharSequence[] a(List list, aaas aaas) {
        if (list.isEmpty()) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charSequenceArr[i] = aabb.a((arml) list.get(i), aaas, false);
        }
        return charSequenceArr;
    }

    public static azne b(azns azns) {
        aznu aznu = azns.c;
        if (aznu == null) {
            aznu = aznu.d;
        }
        azni azni = aznu.c;
        if (azni == null) {
            azni = azni.d;
        }
        if ((azni.a & 1) == 0) {
            return null;
        }
        azne azne;
        aznu aznu2 = azns.c;
        if (aznu2 == null) {
            aznu2 = aznu.d;
        }
        azni azni2 = aznu2.c;
        if (azni2 == null) {
            azni2 = azni.d;
        }
        aznc aznc = azni2.c;
        if (aznc == null) {
            aznc = aznc.c;
        }
        if (aznc.a == 123879355) {
            azne = (azne) aznc.b;
        } else {
            azne = azne.e;
        }
        return azne;
    }
}
