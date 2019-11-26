package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: agdq */
public final class agdq {
    public final bcaa a;
    public final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public agdq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.c = bcaa2;
        this.b = bcaa3;
        this.d = bcaa4;
    }

    private static agds a(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (agqp agqp : list2) {
            if (list.contains(agqp.a())) {
                hashSet.add(agqp.a());
            } else {
                arrayList2.add(agqp);
            }
        }
        for (String str : list) {
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return new agds(hashSet, arrayList, arrayList2);
    }

    public final boolean a(List list) {
        for (String a : list) {
            agqy a2 = ((agci) this.a.get()).a(a);
            if (a2 == null) {
                return false;
            }
            if (!a2.l.a()) {
                return false;
            }
        }
        return true;
    }

    public final long a(String str, String str2, String str3) {
        agqy a = ((agci) this.a.get()).a(str);
        if (a == null || a.e) {
            return 0;
        }
        Set l = ((afzs) this.c.get()).l(str);
        if (!l.isEmpty() && (l.size() != 1 || str2 == null || !l.contains(str2))) {
            return 0;
        }
        Set h = ((agbu) this.b.get()).h(str);
        if (h.isEmpty() || (h.size() == 1 && str3 != null && h.contains(str3))) {
            return a.g();
        }
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final agdn a(String str, String str2, List list, List list2, avrp avrp, byte[] bArr, boolean z, int i, long j, avsi avsi, int i2) {
        int i3;
        long j2;
        Iterator it;
        String str3 = str;
        String str4 = str2;
        Integer valueOf = Integer.valueOf(1);
        amqw.a((str3 != null ? 1 : 0) ^ (str4 != null ? 1 : 0));
        String str5 = !amqu.a(str) ? str3 : str4;
        HashSet<String> hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int ordinal = avrp.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            agds a = agdq.a(list, list2);
            ahcz ahcz = (ahcz) this.d.get();
            int a2 = ahdl.a(avsi, -1);
            if (a2 != -1) {
                long j3 = j;
                long j4 = 0;
                for (String str6 : a.b) {
                    long a3 = a(str6, str3, str4);
                    j3 += a3;
                    j4 -= a3;
                    hashSet.add(str6);
                }
                if (j3 < 0) {
                    HashMap hashMap = new HashMap();
                    for (String str7 : a.a) {
                        hashMap.put(str7, Long.valueOf(a(str7, str3, str4)));
                    }
                    ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
                    Collections.sort(arrayList3, agdp.a);
                    int size = arrayList3.size();
                    for (i3 = 0; i3 < size; i3++) {
                        Entry entry = (Entry) arrayList3.get(i3);
                        if (j3 >= 0) {
                            break;
                        }
                        j3 += ((Long) entry.getValue()).longValue();
                        j4 -= ((Long) entry.getValue()).longValue();
                        hashSet.add((String) entry.getKey());
                    }
                }
                HashSet hashSet2 = new HashSet();
                long j5 = j3;
                j2 = j4;
                for (agqp agqp : list2) {
                    String a4 = agqp.a();
                    if (a.a.contains(a4)) {
                        arrayList.add(agqp.a());
                    } else if (hashSet2.contains(a4)) {
                        arrayList.add(agqp.a());
                    } else {
                        try {
                            aakj a5 = ahcz.a(a4, null, !z ? 2 : 3, 1, i, bArr);
                            if (ahcz.a(a5) && ahcz.b(a5)) {
                                aahr aahr;
                                aajs aajs = a5.c;
                                boolean a6 = ahcz.a(a2);
                                aahr a7 = ahcz.a(a2, Integer.MAX_VALUE, i2, aajs, true, a5.n());
                                if (a6) {
                                    aahr = null;
                                } else {
                                    aahr = ahcz.a(a2, Integer.MAX_VALUE, i2, aajs, false, a5.n());
                                }
                                if (a7 != null && (a6 || aahr != null)) {
                                    j3 = a7.c() + (!a6 ? aahr.c() : 0);
                                    if (j5 >= j3) {
                                        j5 -= j3;
                                        j2 += j3;
                                        linkedHashSet.add(agqp);
                                        arrayList.add(a4);
                                        hashSet2.add(a4);
                                    }
                                }
                            }
                        } catch (aanq unused) {
                        }
                    }
                }
                for (String str42 : hashSet) {
                    if (arrayList.contains(str42)) {
                        arrayList.removeAll(Collections.singleton(str42));
                    }
                }
            } else {
                j2 = 0;
            }
        } else {
            agds a8 = agdq.a(list, list2);
            for (agqp a9 : list2) {
                arrayList.add(a9.a());
            }
            hashSet.addAll(a8.b);
            linkedHashSet.addAll(a8.c);
            j2 = 0;
        }
        if (avrp == avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE) {
            if (!a(arrayList)) {
                it = hashSet.iterator();
                while (it.hasNext()) {
                    agqy a10 = ((agci) this.a.get()).a((String) it.next());
                    if (a10 != null && a10.l == agqf.COMPLETE) {
                        it.remove();
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str8 : list) {
                if (!hashSet.contains(str8)) {
                    if (linkedHashMap.containsKey(str8)) {
                        linkedHashMap.put(str8, Integer.valueOf(((Integer) linkedHashMap.get(str8)).intValue() + 1));
                    } else {
                        linkedHashMap.put(str8, valueOf);
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = arrayList.size();
            for (i3 = 0; i3 < size2; i3++) {
                String str9 = (String) arrayList.get(i3);
                if (linkedHashMap2.containsKey(str9)) {
                    linkedHashMap2.put(str9, Integer.valueOf(((Integer) linkedHashMap2.get(str9)).intValue() + 1));
                } else {
                    linkedHashMap2.put(str9, valueOf);
                }
            }
            for (String str62 : linkedHashMap2.keySet()) {
                linkedHashMap.put(str62, Integer.valueOf(Math.max(linkedHashMap.containsKey(str62) ? ((Integer) linkedHashMap.get(str62)).intValue() : 0, ((Integer) linkedHashMap2.get(str62)).intValue())));
            }
            for (String str82 : linkedHashMap.keySet()) {
                for (i3 = 0; i3 < ((Integer) linkedHashMap.get(str82)).intValue(); i3++) {
                    arrayList2.add(str82);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return new agdn(str5, hashSet, linkedHashSet, arrayList, null, j2);
        }
        return new agdn(str5, hashSet, linkedHashSet, arrayList, arrayList2, j2);
    }
}
