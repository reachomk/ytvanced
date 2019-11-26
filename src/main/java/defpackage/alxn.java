package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: alxn */
public final class alxn implements uil {
    private final acum a;

    public alxn(acum acum) {
        this.a = acum;
    }

    public final void a(uim uim) {
        Iterator it;
        int i;
        uim uim2 = uim;
        ArrayList arrayList = new ArrayList();
        synchronized (uim2.b) {
            try {
                it = uim2.a.values().iterator();
                while (true) {
                    i = 1;
                    if (it.hasNext()) {
                        uii uii = (uii) it.next();
                        if (uii.d.length > 0) {
                            i = 10;
                        }
                        HashMap hashMap = new HashMap(i);
                        uih uih = new uih(uii.c, uii.d);
                        synchronized (uii.b) {
                            uih.c = uii.f;
                            uih.d = uii.g;
                            uii.f = hashMap;
                            uii.g = 0;
                        }
                        arrayList.add(uih);
                    }
                }
                while (true) {
                }
            } catch (Throwable th) {
                while (true) {
                }
            }
        }
        ampk ampk = (ampk) amph.b.createBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj;
            uih uih2 = (uih) arrayList.get(i2);
            if (uih2.d == 0) {
                obj = null;
            } else {
                anrn anrn = (anrn) anrk.e.createBuilder();
                long b = uim.b(uih2.a);
                anrn.copyOnWrite();
                anrk anrk = (anrk) anrn.instance;
                anrk.a |= 2;
                anrk.b = b;
                for (uig uig : uih2.b) {
                    long b2 = uim.b(uig.a);
                    anrn.copyOnWrite();
                    anrk anrk2 = (anrk) anrn.instance;
                    if (!anrk2.c.a()) {
                        anrk2.c = anxl.mutableCopy(anrk2.c);
                    }
                    anrk2.c.a(b2);
                }
                for (Entry entry : uih2.c.entrySet()) {
                    anrp anrp = (anrp) anrm.d.createBuilder();
                    uhz uhz = (uhz) entry.getKey();
                    uic uic = (uic) entry.getValue();
                    if (uih2.b.length > 0) {
                        ArrayList arrayList2 = new ArrayList(uhz.a.length);
                        int i3 = 0;
                        while (i3 < uhz.a.length) {
                            anrr anrr = (anrr) anro.c.createBuilder();
                            Object obj2 = uhz.a[i3];
                            anro anro;
                            if (obj2 instanceof String) {
                                String str = (String) obj2;
                                anrr.copyOnWrite();
                                anro = (anro) anrr.instance;
                                if (str != null) {
                                    anro.a = i;
                                    anro.b = str;
                                } else {
                                    throw new NullPointerException();
                                }
                            } else if (obj2 instanceof Integer) {
                                int intValue = ((Integer) obj2).intValue();
                                anrr.copyOnWrite();
                                anro = (anro) anrr.instance;
                                anro.a = 2;
                                anro.b = Integer.valueOf(intValue);
                            } else if (obj2 instanceof Boolean) {
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                anrr.copyOnWrite();
                                anro = (anro) anrr.instance;
                                anro.a = 3;
                                anro.b = Boolean.valueOf(booleanValue);
                            } else {
                                String valueOf = String.valueOf(obj2);
                                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
                                stringBuilder.append("Field ");
                                stringBuilder.append(i3);
                                stringBuilder.append(" has unexpected value: ");
                                stringBuilder.append(valueOf);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            arrayList2.add((anro) ((anxl) anrr.build()));
                            i3++;
                            i = 1;
                        }
                        anrp.copyOnWrite();
                        anrm anrm = (anrm) anrp.instance;
                        if (!anrm.b.a()) {
                            anrm.b = anxl.mutableCopy(anrm.b);
                        }
                        anvf.addAll(arrayList2, anrm.b);
                    }
                    anrq a = uic.a();
                    anrp.copyOnWrite();
                    anrm anrm2 = (anrm) anrp.instance;
                    if (a != null) {
                        anrm2.c = a;
                        anrm2.a |= 1;
                        anrn.copyOnWrite();
                        anrk anrk3 = (anrk) anrn.instance;
                        if (!anrk3.d.a()) {
                            anrk3.d = anxl.mutableCopy(anrk3.d);
                        }
                        anrk3.d.add((anrm) ((anxl) anrp.build()));
                        i = 1;
                    } else {
                        throw new NullPointerException();
                    }
                }
                obj = (anrk) ((anxl) anrn.build());
            }
            if (obj != null) {
                ampk.copyOnWrite();
                amph amph = (amph) ampk.instance;
                if (!amph.a.a()) {
                    amph.a = anxl.mutableCopy(amph.a);
                }
                amph.a.add(obj);
            }
            i2++;
            i = 1;
        }
        amph amph2 = (amph) ((anxl) ampk.build());
        if (amph2.a.size() != 0) {
            anyd<anrk> anyd = amph2.a;
            if (!anyd.isEmpty()) {
                for (anrk toByteString : anyd) {
                    axvp axvp = (axvp) axvn.c.createBuilder();
                    anvu toByteString2 = toByteString.toByteString();
                    axvp.copyOnWrite();
                    axvn axvn = (axvn) axvp.instance;
                    if (toByteString2 != null) {
                        axvn.a |= 1;
                        axvn.b = toByteString2;
                        axvn axvn2 = (axvn) ((anxl) axvp.build());
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        if (axvn2 != null) {
                            asmw.c = axvn2;
                            asmw.b = 126;
                            this.a.b((asmw) ((anxl) asmz.build()));
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
            }
            return;
        }
    }
}
