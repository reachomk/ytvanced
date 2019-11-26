package defpackage;

import android.text.Spanned;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: agqa */
public final class agqa {
    public static final Comparator a = agpz.a;
    public static final Comparator b = agqc.a;
    public static final Comparator c = agqb.a;
    public static final Comparator d = agqe.a;
    private static final Set h = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(18), Integer.valueOf(93), Integer.valueOf(134), Integer.valueOf(243)})));
    private static final Set i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(22), Integer.valueOf(95), Integer.valueOf(136), Integer.valueOf(247)})));
    public avsi e = avsi.UNKNOWN_FORMAT_TYPE;
    public final Spanned f;
    public final Spanned g;

    public agqa(avsi avsi, Spanned spanned, Spanned spanned2) {
        this.e = avsi;
        this.f = spanned;
        this.g = spanned2;
    }

    public agqa(avsk avsk) {
        avsi a = avsi.a(avsk.d);
        if (a == null) {
            a = avsi.UNKNOWN_FORMAT_TYPE;
        }
        this.e = a;
        arml arml = avsk.b;
        if (arml == null) {
            arml = arml.f;
        }
        this.f = ajqy.a(arml);
        arml arml2 = avsk.c;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        this.g = ajqy.a(arml2);
    }

    private agqa(arlj arlj, avsi avsi) {
        arml arml;
        this.e = avsi;
        arml arml2 = null;
        if ((arlj.a & 1) != 0) {
            arml = arlj.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.f = ajqy.a(arml);
        if ((arlj.a & 2) != 0) {
            arml2 = arlj.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        this.g = ajqy.a(arml2);
    }

    public static Map a(avsj avsj) {
        HashMap hashMap = new HashMap();
        avsm avsm = avsj.e;
        if (avsm == null) {
            avsm = avsm.c;
        }
        arll arll = avsm.b;
        if (arll == null) {
            arll = arll.c;
        }
        String str = "Overwriting format for: ";
        avsm avsm2;
        arll arll2;
        avsi a;
        String valueOf;
        StringBuilder stringBuilder;
        if (arll.b.size() <= 0) {
            avsm = avsj.e;
            if (avsm == null) {
                avsm = avsm.c;
            }
            arll = avsm.b;
            if (arll == null) {
                arll = arll.c;
            }
            if (arll.a.size() > 0) {
                avsm2 = avsj.e;
                if (avsm2 == null) {
                    avsm2 = avsm.c;
                }
                arll2 = avsm2.b;
                if (arll2 == null) {
                    arll2 = arll.c;
                }
                for (arlj arlj : arll2.a) {
                    a = agqa.a(arlj);
                    if (hashMap.get(a) != null) {
                        valueOf = String.valueOf(a);
                        stringBuilder = new StringBuilder(valueOf.length() + 24);
                        stringBuilder.append(str);
                        stringBuilder.append(valueOf);
                        xtl.d(stringBuilder.toString());
                    }
                    hashMap.put(a, new agqa(arlj, a));
                }
            } else {
                for (avsk avsk : avsj.d) {
                    Object a2 = avsi.a(avsk.d);
                    if (a2 == null) {
                        a2 = avsi.UNKNOWN_FORMAT_TYPE;
                    }
                    hashMap.put(a2, new agqa(avsk));
                }
            }
        } else {
            avsm2 = avsj.e;
            if (avsm2 == null) {
                avsm2 = avsm.c;
            }
            arll2 = avsm2.b;
            if (arll2 == null) {
                arll2 = arll.c;
            }
            for (arlj arlj2 : r7.b) {
                a = agqa.a(arlj2);
                if (hashMap.get(a) != null) {
                    valueOf = String.valueOf(a);
                    stringBuilder = new StringBuilder(valueOf.length() + 24);
                    stringBuilder.append(str);
                    stringBuilder.append(valueOf);
                    xtl.d(stringBuilder.toString());
                }
                hashMap.put(a, new agqa(arlj2, a));
            }
        }
        return hashMap;
    }

    private static avsi a(arlj arlj) {
        Set set = h;
        arlh arlh = arlj.d;
        if (arlh == null) {
            arlh = arlh.c;
        }
        if (set.contains(Integer.valueOf(arlh.b))) {
            return avsi.SD;
        }
        set = i;
        arlh arlh2 = arlj.d;
        if (arlh2 == null) {
            arlh2 = arlh.c;
        }
        if (set.contains(Integer.valueOf(arlh2.b))) {
            return avsi.HD;
        }
        return avsi.LD;
    }
}
