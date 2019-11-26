package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: ador */
public final class ador {
    private static final String a = xtl.b("MDX.promotion");

    public static Set a(Set set) {
        HashSet hashSet = new HashSet();
        for (ausq ausq : set) {
            try {
                adof adof = new adof();
                int a = autj.a(ausq.b);
                if (a == 0) {
                    a = 1;
                }
                adof.a = ador.a(a);
                hashSet.add(new adog(adof.a, ausq.c, ausq.d, ausq.e, ausq.f));
            } catch (IllegalArgumentException e) {
                xtl.a(a, "Failed to convert promotion (MdxNotification proto)", e);
            }
        }
        return hashSet;
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        for (auss auss : set) {
            try {
                int a;
                auta auta;
                int i;
                auta auta2;
                adiw adiw;
                auta auta3;
                auta auta4;
                ArrayList arrayList;
                adoy adoy = new adoy();
                int a2 = autj.a(auss.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                adoy.a = ador.a(a2);
                ausu ausu = auss.c;
                if (ausu == null) {
                    ausu = ausu.l;
                }
                if (ausu.b.size() != 0) {
                    for (autc autc : ausu.b) {
                        a = autf.a(autc.b);
                        if (a == 0) {
                            a = 1;
                        }
                        a = ador.b(a);
                        auta = autc.c;
                        if (auta == null) {
                            auta = auta.d;
                        }
                        i = auta.b;
                        auta2 = autc.c;
                        if (auta2 == null) {
                            auta2 = auta.d;
                        }
                        adoy.b.put(a, new adpa((long) i, (long) auta2.c));
                    }
                }
                if (ausu.c.size() != 0) {
                    for (autc autc2 : ausu.c) {
                        a = autf.a(autc2.b);
                        if (a == 0) {
                            a = 1;
                        }
                        a = ador.b(a);
                        auta = autc2.c;
                        if (auta == null) {
                            auta = auta.d;
                        }
                        i = auta.b;
                        auta2 = autc2.c;
                        if (auta2 == null) {
                            auta2 = auta.d;
                        }
                        adoy.c.put(a, new adpa((long) i, (long) auta2.c));
                    }
                }
                a2 = ausy.a(ausu.d);
                if (a2 == 0) {
                    a2 = 1;
                }
                a2--;
                if (a2 == 1) {
                    adiw = adiw.BROWSE;
                } else if (a2 == 2) {
                    adiw = adiw.WATCH;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Page type: %s is not recognized", new Object[]{Integer.toString(a2)}));
                }
                adoy.d = adiw;
                if (adiw == adiw.WATCH) {
                    adoy.f = true;
                }
                if ((ausu.a & 2) != 0) {
                    auta3 = ausu.e;
                    if (auta3 == null) {
                        auta3 = auta.d;
                    }
                    a2 = auta3.b;
                    auta4 = ausu.e;
                    if (auta4 == null) {
                        auta4 = auta.d;
                    }
                    adoy.e = new adpa((long) a2, (long) auta4.c);
                }
                if ((ausu.a & 32) != 0) {
                    auta3 = ausu.f;
                    if (auta3 == null) {
                        auta3 = auta.d;
                    }
                    a2 = auta3.b;
                    auta4 = ausu.f;
                    if (auta4 == null) {
                        auta4 = auta.d;
                    }
                    adoy.g = new adpa((long) a2, (long) auta4.c);
                }
                if (ausu.k.size() != 0) {
                    arrayList = new ArrayList(ausu.k.size());
                    for (ausw ausw : ausu.k) {
                        int a3 = autj.a(ausw.b);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        adow a4 = ador.a(a3);
                        auta auta5 = ausw.c;
                        if (auta5 == null) {
                            auta5 = auta.d;
                        }
                        long j = (long) auta5.b;
                        auta auta6 = ausw.c;
                        if (auta6 == null) {
                            auta6 = auta.d;
                        }
                        arrayList.add(new adox(a4, new adpa(j, (long) auta6.c), ausw.d));
                    }
                    adoy.l.clear();
                    adoy.l.addAll(arrayList);
                }
                if (ausu.g.size() != 0) {
                    ArrayList<Pair> arrayList2 = new ArrayList(ausu.g.size());
                    for (auth auth : ausu.g) {
                        arrayList2.add(new Pair(Long.valueOf(auth.b), Long.valueOf(auth.c)));
                    }
                    adoy.h.clear();
                    for (Pair pair : arrayList2) {
                        adoy.h.add(new adpa(((Long) pair.first).longValue(), ((Long) pair.second).longValue()));
                    }
                }
                if (ausu.h.size() != 0) {
                    arrayList = new ArrayList(ausu.h.size());
                    for (aute aute : ausu.h) {
                        ArrayList arrayList3 = new ArrayList();
                        if (aute.c.size() != 0) {
                            for (auta auta7 : aute.c) {
                                arrayList3.add(new adpa((long) auta7.b, (long) auta7.c));
                            }
                        }
                        arrayList.add(new adoz((auqx[]) new anyc(aute.a, aute.b).toArray(new auqx[0]), arrayList3));
                    }
                    adoy.i.clear();
                    adoy.i.addAll(arrayList);
                }
                if (ausu.i.size() != 0) {
                    anyd anyd = ausu.i;
                    adoy.j.clear();
                    adoy.j.addAll(anyd);
                }
                if (ausu.j.size() != 0) {
                    anyd anyd2 = ausu.j;
                    adoy.k.clear();
                    adoy.k.addAll(anyd2);
                }
                hashSet.add(new adov(adoy.a, adoy.b, adoy.c, adoy.d, adoy.e, adoy.f, adoy.g, adoy.h, adoy.i, adoy.j, adoy.k, adoy.l));
            } catch (IllegalArgumentException e) {
                xtl.a(a, "Failed to convert promotion trigger (MdxNotificationTrigger proto)", e);
            }
        }
        return hashSet;
    }

    private static adow a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return adow.CAST_TOOLTIP;
                case 2:
                    return adow.CAST_TOOLTIP_REPRESSED;
                case 3:
                    return adow.CAST_SNACKBAR;
                case 4:
                    return adow.CAST_SNACKBAR_REPRESSED;
                case 5:
                    return adow.CAST_CLING;
                case 6:
                    return adow.CAST_CLING_REPRESSED;
                default:
                    String str;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    if (i == 0) {
                        str = "null";
                    } else if (i == 0) {
                        throw null;
                    } else if (i == 0) {
                        throw null;
                    } else {
                        str = Integer.toString(i2);
                    }
                    objArr[0] = str;
                    throw new IllegalArgumentException(String.format(locale, "Promotion type: %s is not recognized", objArr));
            }
        }
        throw null;
    }

    private static int b(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return 0;
        } else {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return 2;
            }
            String str;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            if (i == 0) {
                str = "null";
            } else if (i == 0) {
                throw null;
            } else if (i == 0) {
                throw null;
            } else {
                str = Integer.toString(i2);
            }
            objArr[0] = str;
            throw new IllegalArgumentException(String.format(locale, "Time period: %s is not recognized", objArr));
        }
    }
}
