package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: afod */
public final class afod implements afoi {
    private final HashMap a;
    private final long b;
    private final long c;
    private final afmx d;
    private final afop e;
    private final afoj f;
    private final wxw g;
    private final wya h;
    private final SharedPreferences i;
    private final xsc j;
    private final xhv k;
    private final Map l = new HashMap();

    public afod(afmx afmx, afop afop, afoj afoj, wxw wxw, wya wya, SharedPreferences sharedPreferences, xsc xsc, xhv xhv) {
        this.d = afmx;
        this.e = afop;
        this.f = afoj;
        this.g = wxw;
        this.h = wya;
        this.i = sharedPreferences;
        this.j = xsc;
        this.k = xhv;
        this.b = (long) afmx.a();
        this.c = (long) afmx.b();
        this.a = new HashMap();
        this.a.put(aqui.DELAYED_EVENT_TIER_DEFAULT, new afoe("delayed_event_dispatch_default_tier_one_off_task", "delayed_event_default_tier_last_dispatch_time_ms", afmx.e()));
        this.a.put(aqui.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY, new afoe("delayed_event_dispatch_dispatch_to_empty_tier_one_off_task", "delayed_event_dispatch_to_empty_tier_last_dispatch_time_ms", afmx.g()));
        this.a.put(aqui.DELAYED_EVENT_TIER_FAST, new afoe("delayed_event_dispatch_fast_tier_one_off_task", "delayed_event_fast_tier_last_dispatch_time_ms", afmx.f()));
        this.a.put(aqui.DELAYED_EVENT_TIER_IMMEDIATE, new afoe("not_applicable_delayed_event_dispatch_immediate_tier_one_off_task", "not_applicable_delayed_event_immediate_tier_last_dispatch_time_ms", afmx.h()));
    }

    private static long a(long j, long j2, long j3) {
        if (j2 <= j) {
            j = j2;
        }
        if (j <= j3) {
            j = 1 + j3;
        }
        return j - j3;
    }

    public final synchronized void a(Set set) {
        for (afog afog : set) {
            String a = afog.a();
            if (!TextUtils.isEmpty(a)) {
                this.l.put(a, afog);
            }
        }
    }

    public final void a() {
        this.g.a("delayed_event_dispatch_one_off_task", new afoc(this));
        this.g.a("delayed_event_dispatch_fast_tier_one_off_task", new afof(this));
        this.g.a("delayed_event_dispatch_default_tier_one_off_task", new afof(this));
        this.g.a("delayed_event_dispatch_dispatch_to_empty_tier_one_off_task", new afof(this));
    }

    public final void a(njz njz) {
        a(njz, this.c);
    }

    public final void a(njz njz, long j) {
        if (this.d.d()) {
            a(aqui.DELAYED_EVENT_TIER_DEFAULT, njz, j);
            return;
        }
        xak.b();
        this.e.a(njz);
        if (a(Integer.valueOf(this.d.a())) || !this.k.c()) {
            a(j);
        } else {
            b();
        }
    }

    public final void a(aqui aqui, njz njz) {
        a(aqui, njz, (long) c(aqui).c.c);
    }

    private final void a(aqui aqui, njz njz, long j) {
        xak.b();
        if (aqui == aqui.DELAYED_EVENT_TIER_IMMEDIATE) {
            if (this.k.c()) {
                njz.a(aqui.DELAYED_EVENT_TIER_IMMEDIATE);
                this.e.a(njz);
                e(aqui.DELAYED_EVENT_TIER_IMMEDIATE);
                return;
            }
            aqui = aqui.DELAYED_EVENT_TIER_FAST;
        }
        njz.a(aqui);
        this.e.a(njz);
        if (a(Integer.valueOf(this.d.e().b)) || !this.k.c()) {
            String valueOf = String.valueOf(aqui);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 72);
            stringBuilder.append("Schedule a dispatch in the future when cold send or no network for tier ");
            stringBuilder.append(valueOf);
            stringBuilder.toString();
            a(aqui, j);
            return;
        }
        a(aqui);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(aqui aqui) {
        xak.b();
        afoe c = c(aqui);
        if (this.j.a() - this.i.getLong(c.b, 0) >= TimeUnit.SECONDS.toMillis((long) c.c.b)) {
            e(aqui);
            return;
        }
        String valueOf = String.valueOf(aqui);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 81);
        stringBuilder.append("Schedule a dispatch in the future since attempting to dispatch too soon for tier ");
        stringBuilder.append(valueOf);
        stringBuilder.toString();
        d(aqui);
    }

    private final boolean b(aqui aqui) {
        return this.a.containsKey(aqui);
    }

    private final afoe c(aqui aqui) {
        Object aqui2;
        if (!b(aqui2)) {
            xtl.a("GEL_DELAYED_EVENT_DEBUG", "Invalid tier is supplied in getInfoByTier. Falls back to default tier.");
            aqui2 = aqui.DELAYED_EVENT_TIER_DEFAULT;
        }
        return (afoe) this.a.get(aqui2);
    }

    public final void b(njz njz) {
        this.e.b(njz);
    }

    public final void a(afmw afmw, List list, bqn bqn) {
        xak.b();
        if (!aftq.a(bqn)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                njz njz = (njz) it.next();
                if ((((nka) njz.instance).a & 32) == 0) {
                    long a = this.j.a();
                    njz.copyOnWrite();
                    nka nka = (nka) njz.instance;
                    nka.a |= 32;
                    nka.g = a;
                }
                int f = njz.f();
                if (f >= afmw.c()) {
                    it.remove();
                } else {
                    njz.copyOnWrite();
                    nka nka2 = (nka) njz.instance;
                    nka2.a |= 64;
                    nka2.h = f + 1;
                }
            }
            if (!list.isEmpty()) {
                this.e.a(list);
                if (this.d.d()) {
                    d(aqui.DELAYED_EVENT_TIER_DEFAULT);
                } else {
                    d();
                }
            }
        }
    }

    private final void d() {
        a(this.c);
    }

    private final void a(long j) {
        String str = "delayed_event_dispatch_one_off_task";
        this.h.a(str, this.b, afod.a(j, this.c, this.b), false, 1, false, null, null, true, false);
    }

    private final void d(aqui aqui) {
        a(aqui, (long) c(aqui).c.c);
    }

    private final void a(aqui aqui, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("tier_type", aqui.f);
        afoe c = c(aqui);
        String str = c.a;
        aqua aqua = c.c;
        long j2 = j;
        long a = afod.a(j2, (long) aqua.c, (long) aqua.b);
        this.h.a(str, (long) aqua.b, a, false, 1, false, bundle, null, true, false);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void b() {
        xak.b();
        if (c(TimeUnit.SECONDS.toMillis((long) this.d.a()))) {
            e();
        } else {
            d();
        }
    }

    /* JADX WARNING: Missing block: B:12:0x002e, code skipped:
            return;
     */
    private final synchronized void e() {
        /*
        r2 = this;
        monitor-enter(r2);
        defpackage.xak.b();	 Catch:{ all -> 0x002f }
        r0 = r2.l;	 Catch:{ all -> 0x002f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0015;
    L_0x000c:
        r0 = "GEL_DELAYED_EVENT_DEBUG";
        r1 = "Failed delayed event dispatch, no dispatchers.";
        defpackage.xtl.a(r0, r1);	 Catch:{ all -> 0x002f }
        monitor-exit(r2);
        return;
    L_0x0015:
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x002f }
        r0.<init>();	 Catch:{ all -> 0x002f }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x002f }
        r1.<init>();	 Catch:{ all -> 0x002f }
        r2.a(r0, r1);	 Catch:{ all -> 0x002f }
        r0 = defpackage.afod.a(r0);	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r2.c;	 Catch:{ all -> 0x002f }
        r2.a(r0);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r2);
        return;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afod.e():void");
    }

    /* JADX WARNING: Missing block: B:14:0x0034, code skipped:
            return;
     */
    public final synchronized void c() {
        /*
        r2 = this;
        monitor-enter(r2);
        defpackage.xak.b();	 Catch:{ all -> 0x0037 }
        r0 = r2.l;	 Catch:{ all -> 0x0037 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0015;
    L_0x000c:
        r0 = "GEL_DELAYED_EVENT_DEBUG";
        r1 = "Failed delayed event dispatch, no dispatchers.";
        defpackage.xtl.a(r0, r1);	 Catch:{ all -> 0x0037 }
        monitor-exit(r2);
        return;
    L_0x0015:
        r0 = r2.k;	 Catch:{ all -> 0x0037 }
        r0 = r0.c();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x001d:
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0037 }
        r0.<init>();	 Catch:{ all -> 0x0037 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0037 }
        r1.<init>();	 Catch:{ all -> 0x0037 }
        r2.a(r0, r1);	 Catch:{ all -> 0x0037 }
        r0 = defpackage.afod.a(r0);	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0033;
    L_0x0030:
        r2.c();	 Catch:{ all -> 0x0037 }
    L_0x0033:
        monitor-exit(r2);
        return;
    L_0x0035:
        monitor-exit(r2);
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afod.c():void");
    }

    private final void a(Map map, List list) {
        String b;
        long b2 = b(this.j.a());
        HashMap hashMap = new HashMap(this.l.size());
        xbu a = this.e.a();
        while (a.hasNext()) {
            njz njz = (njz) a.next();
            b = njz.b();
            if (!hashMap.containsKey(b)) {
                hashMap.put(b, new ArrayList());
            }
            ((List) hashMap.get(b)).add(njz);
        }
        a.a();
        for (String str : hashMap.keySet()) {
            String str2;
            List list2 = (List) hashMap.get(str2);
            afog afog = (afog) this.l.get(str2);
            if (afog == null) {
                list.addAll(list2);
                str2 = String.valueOf(str2);
                b = "Failed to find delayed event dispatcher for type ";
                xtl.a("GEL_DELAYED_EVENT_DEBUG", str2.length() == 0 ? new String(b) : b.concat(str2));
            } else {
                afmw b3 = afog.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    njz njz2 = (njz) it.next();
                    if (a(njz2, b3)) {
                        arrayList.add(njz2);
                        it.remove();
                    }
                }
                list.addAll(arrayList);
                afoj afoj = this.f;
                if (afoj != null && afoj.a()) {
                    this.f.a(str2, list2.size(), arrayList.size());
                }
                map.put(afog, list2);
            }
        }
        Set hashSet = new HashSet();
        for (afog a2 : map.keySet()) {
            hashSet.addAll(afod.a(map, a2));
        }
        hashSet.addAll(list);
        this.e.a(hashSet);
        a(null, map, b2);
    }

    private final long b(long j) {
        String str = "delayed_event_last_dispatch_time_ms";
        long j2 = this.i.getLong(str, 0);
        this.i.edit().putLong(str, j).apply();
        return j - j2;
    }

    private final boolean a(njz njz, afmw afmw) {
        long a = this.j.a();
        if (a - njz.e() > TimeUnit.HOURS.toMillis((long) afmw.a())) {
            return true;
        }
        if (njz.f() > 0 && a - ((nka) njz.instance).g > TimeUnit.MINUTES.toMillis((long) afmw.d())) {
            return true;
        }
        return false;
    }

    private static List a(Map map, afog afog) {
        List list = (List) map.get(afog);
        return list.subList(0, Math.min(afog.b().b(), list.size()));
    }

    private final void a(aqui aqui, Map map, long j) {
        for (afog afog : map.keySet()) {
            String valueOf = String.valueOf(afog.a());
            String str = "Start to dispatch events in tier dispatch event type ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            List<njz> a = afod.a(map, afog);
            if (!a.isEmpty()) {
                afoj afoj = this.f;
                if (afoj != null && afoj.a()) {
                    this.f.a(afog.a(), a.size(), j);
                }
                HashMap hashMap = new HashMap();
                for (njz njz : a) {
                    nka nka = (nka) njz.instance;
                    zz zzVar = new zz(nka.f, nka.i);
                    if (!hashMap.containsKey(zzVar)) {
                        hashMap.put(zzVar, new ArrayList());
                    }
                    ((List) hashMap.get(zzVar)).add(njz);
                }
                for (zz zzVar2 : hashMap.keySet()) {
                    List list = (List) hashMap.get(zzVar2);
                    String str2 = (String) zzVar2.b;
                    boolean z = false;
                    if (!list.isEmpty()) {
                        z = ((nka) ((njz) list.get(0)).instance).j;
                    }
                    afob afob = new afob(new afot(str2, z), aqui);
                    String valueOf2 = String.valueOf(afog.a());
                    String str3 = "Call dispatcher to dispatch events for each identity in tier dispatch  event type ";
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(str3);
                    } else {
                        str3.concat(valueOf2);
                    }
                    afog.a((String) zzVar2.a, afob, list);
                }
            }
        }
    }

    private static boolean a(Map map) {
        for (afog afog : map.keySet()) {
            if (((List) map.get(afog)).size() - afod.a(map, afog).size() > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(Integer num) {
        return num.intValue() != 0 ? c(TimeUnit.SECONDS.toMillis((long) num.intValue()) * 3) : false;
    }

    private final boolean c(long j) {
        return this.j.a() - this.i.getLong("delayed_event_last_dispatch_time_ms", 0) >= j;
    }

    /* JADX WARNING: Missing block: B:82:0x027b, code skipped:
            return;
     */
    private final synchronized void e(defpackage.aqui r24) {
        /*
        r23 = this;
        r1 = r23;
        monitor-enter(r23);
        r0 = java.lang.String.valueOf(r24);	 Catch:{ all -> 0x0281 }
        r2 = r0.length();	 Catch:{ all -> 0x0281 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0281 }
        r2 = r2 + 28;
        r3.<init>(r2);	 Catch:{ all -> 0x0281 }
        r2 = "Attemp to dispatch for tier ";
        r3.append(r2);	 Catch:{ all -> 0x0281 }
        r3.append(r0);	 Catch:{ all -> 0x0281 }
        r3.toString();	 Catch:{ all -> 0x0281 }
        defpackage.xak.b();	 Catch:{ all -> 0x0281 }
        r0 = r1.l;	 Catch:{ all -> 0x0281 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0281 }
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        r0 = "GEL_DELAYED_EVENT_DEBUG";
        r2 = "Failed delayed event dispatch, no dispatchers.";
        defpackage.xtl.a(r0, r2);	 Catch:{ all -> 0x0281 }
        monitor-exit(r23);
        return;
    L_0x0031:
        r0 = r23.b(r24);	 Catch:{ all -> 0x0281 }
        if (r0 != 0) goto L_0x0041;
    L_0x0037:
        r0 = "GEL_DELAYED_EVENT_DEBUG";
        r2 = "Invalid tier is supplied in dispatchEventsForcedByTier. Falls back to default tier.";
        defpackage.xtl.a(r0, r2);	 Catch:{ all -> 0x0281 }
        r0 = defpackage.aqui.DELAYED_EVENT_TIER_DEFAULT;	 Catch:{ all -> 0x0281 }
        goto L_0x0043;
    L_0x0041:
        r0 = r24;
    L_0x0043:
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x0281 }
        r2.<init>();	 Catch:{ all -> 0x0281 }
        r3 = r1.j;	 Catch:{ all -> 0x0281 }
        r3 = r3.a();	 Catch:{ all -> 0x0281 }
        r5 = r1.i;	 Catch:{ all -> 0x0281 }
        r5 = r5.edit();	 Catch:{ all -> 0x0281 }
        r6 = r1.c(r0);	 Catch:{ all -> 0x0281 }
        r6 = r6.b;	 Catch:{ all -> 0x0281 }
        r5 = r5.putLong(r6, r3);	 Catch:{ all -> 0x0281 }
        r5.apply();	 Catch:{ all -> 0x0281 }
        r3 = r1.b(r3);	 Catch:{ all -> 0x0281 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r5.<init>();	 Catch:{ all -> 0x0281 }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r6.<init>();	 Catch:{ all -> 0x0281 }
        r7 = r1.e;	 Catch:{ all -> 0x0281 }
        r7 = r7.a();	 Catch:{ all -> 0x0281 }
    L_0x0075:
        r8 = r7.hasNext();	 Catch:{ all -> 0x0281 }
        if (r8 == 0) goto L_0x0085;
    L_0x007b:
        r8 = r7.next();	 Catch:{ all -> 0x0281 }
        r8 = (defpackage.njz) r8;	 Catch:{ all -> 0x0281 }
        r6.add(r8);	 Catch:{ all -> 0x0281 }
        goto L_0x0075;
    L_0x0085:
        r7 = new java.util.HashMap;	 Catch:{ all -> 0x0281 }
        r7.<init>();	 Catch:{ all -> 0x0281 }
        r8 = r6.size();	 Catch:{ all -> 0x0281 }
        r9 = 0;
        r10 = 0;
    L_0x0090:
        r11 = 1;
        if (r10 >= r8) goto L_0x0122;
    L_0x0093:
        r12 = r6.get(r10);	 Catch:{ all -> 0x0281 }
        r12 = (defpackage.njz) r12;	 Catch:{ all -> 0x0281 }
        r13 = r12.b();	 Catch:{ all -> 0x0281 }
        r14 = r1.l;	 Catch:{ all -> 0x0281 }
        r14 = r14.get(r13);	 Catch:{ all -> 0x0281 }
        r14 = (defpackage.afog) r14;	 Catch:{ all -> 0x0281 }
        if (r14 != 0) goto L_0x00c4;
    L_0x00a7:
        r5.add(r12);	 Catch:{ all -> 0x0281 }
        r11 = java.lang.String.valueOf(r13);	 Catch:{ all -> 0x0281 }
        r12 = "Failed to find delayed event dispatcher for type ";
        r13 = r11.length();	 Catch:{ all -> 0x0281 }
        if (r13 != 0) goto L_0x00bc;
    L_0x00b6:
        r11 = new java.lang.String;	 Catch:{ all -> 0x0281 }
        r11.<init>(r12);	 Catch:{ all -> 0x0281 }
        goto L_0x00c0;
    L_0x00bc:
        r11 = r12.concat(r11);	 Catch:{ all -> 0x0281 }
    L_0x00c0:
        defpackage.xtl.c(r11);	 Catch:{ all -> 0x0281 }
        goto L_0x011e;
    L_0x00c4:
        r15 = r14.b();	 Catch:{ all -> 0x0281 }
        r15 = r1.a(r12, r15);	 Catch:{ all -> 0x0281 }
        if (r15 == 0) goto L_0x00d5;
    L_0x00ce:
        r5.add(r12);	 Catch:{ all -> 0x0281 }
        defpackage.afod.a(r7, r13, r11);	 Catch:{ all -> 0x0281 }
        goto L_0x011e;
    L_0x00d5:
        r11 = defpackage.aqui.DELAYED_EVENT_TIER_DEFAULT;	 Catch:{ all -> 0x0281 }
        r15 = r12.instance;	 Catch:{ all -> 0x0281 }
        r15 = (defpackage.nka) r15;	 Catch:{ all -> 0x0281 }
        r15 = r15.a;	 Catch:{ all -> 0x0281 }
        r15 = r15 & 512;
        if (r15 != 0) goto L_0x00e2;
    L_0x00e1:
        goto L_0x00f0;
    L_0x00e2:
        r15 = r12.g();	 Catch:{ all -> 0x0281 }
        r15 = r1.b(r15);	 Catch:{ all -> 0x0281 }
        if (r15 == 0) goto L_0x00f0;
    L_0x00ec:
        r11 = r12.g();	 Catch:{ all -> 0x0281 }
    L_0x00f0:
        r15 = r2.containsKey(r14);	 Catch:{ all -> 0x0281 }
        if (r15 != 0) goto L_0x00fe;
    L_0x00f6:
        r15 = new java.util.HashMap;	 Catch:{ all -> 0x0281 }
        r15.<init>();	 Catch:{ all -> 0x0281 }
        r2.put(r14, r15);	 Catch:{ all -> 0x0281 }
    L_0x00fe:
        r14 = r2.get(r14);	 Catch:{ all -> 0x0281 }
        r14 = (java.util.Map) r14;	 Catch:{ all -> 0x0281 }
        r15 = r14.containsKey(r11);	 Catch:{ all -> 0x0281 }
        if (r15 != 0) goto L_0x0112;
    L_0x010a:
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r15.<init>();	 Catch:{ all -> 0x0281 }
        r14.put(r11, r15);	 Catch:{ all -> 0x0281 }
    L_0x0112:
        r11 = r14.get(r11);	 Catch:{ all -> 0x0281 }
        r11 = (java.util.List) r11;	 Catch:{ all -> 0x0281 }
        r11.add(r12);	 Catch:{ all -> 0x0281 }
        defpackage.afod.a(r7, r13, r9);	 Catch:{ all -> 0x0281 }
    L_0x011e:
        r10 = r10 + 1;
        goto L_0x0090;
    L_0x0122:
        r6 = r1.f;	 Catch:{ all -> 0x0281 }
        if (r6 == 0) goto L_0x0168;
    L_0x0126:
        r6 = r6.a();	 Catch:{ all -> 0x0281 }
        if (r6 == 0) goto L_0x0168;
    L_0x012c:
        r6 = r7.entrySet();	 Catch:{ all -> 0x0281 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0281 }
    L_0x0134:
        r7 = r6.hasNext();	 Catch:{ all -> 0x0281 }
        if (r7 == 0) goto L_0x0168;
    L_0x013a:
        r7 = r6.next();	 Catch:{ all -> 0x0281 }
        r7 = (java.util.Map.Entry) r7;	 Catch:{ all -> 0x0281 }
        r8 = r1.f;	 Catch:{ all -> 0x0281 }
        r10 = r7.getKey();	 Catch:{ all -> 0x0281 }
        r10 = (java.lang.String) r10;	 Catch:{ all -> 0x0281 }
        r12 = r7.getValue();	 Catch:{ all -> 0x0281 }
        r12 = (defpackage.zz) r12;	 Catch:{ all -> 0x0281 }
        r12 = r12.a;	 Catch:{ all -> 0x0281 }
        r12 = (java.lang.Integer) r12;	 Catch:{ all -> 0x0281 }
        r12 = r12.intValue();	 Catch:{ all -> 0x0281 }
        r7 = r7.getValue();	 Catch:{ all -> 0x0281 }
        r7 = (defpackage.zz) r7;	 Catch:{ all -> 0x0281 }
        r7 = r7.b;	 Catch:{ all -> 0x0281 }
        r7 = (java.lang.Integer) r7;	 Catch:{ all -> 0x0281 }
        r7 = r7.intValue();	 Catch:{ all -> 0x0281 }
        r8.a(r10, r12, r7);	 Catch:{ all -> 0x0281 }
        goto L_0x0134;
    L_0x0168:
        r6 = defpackage.afod.a(r0, r2);	 Catch:{ all -> 0x0281 }
        r7 = new java.util.HashSet;	 Catch:{ all -> 0x0281 }
        r7.<init>();	 Catch:{ all -> 0x0281 }
        r8 = new java.util.HashMap;	 Catch:{ all -> 0x0281 }
        r8.<init>();	 Catch:{ all -> 0x0281 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0281 }
    L_0x017a:
        r10 = r6.hasNext();	 Catch:{ all -> 0x0281 }
        if (r10 == 0) goto L_0x0245;
    L_0x0180:
        r10 = r6.next();	 Catch:{ all -> 0x0281 }
        r10 = (defpackage.afog) r10;	 Catch:{ all -> 0x0281 }
        r12 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r12.<init>();	 Catch:{ all -> 0x0281 }
        r13 = r2.get(r10);	 Catch:{ all -> 0x0281 }
        r13 = (java.util.Map) r13;	 Catch:{ all -> 0x0281 }
        r14 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r15 = r13.keySet();	 Catch:{ all -> 0x0281 }
        r14.<init>(r15);	 Catch:{ all -> 0x0281 }
        r15 = java.util.Collections.reverseOrder();	 Catch:{ all -> 0x0281 }
        java.util.Collections.sort(r14, r15);	 Catch:{ all -> 0x0281 }
        r15 = r13.containsKey(r0);	 Catch:{ all -> 0x0281 }
        if (r15 == 0) goto L_0x01ad;
    L_0x01a7:
        r14.remove(r0);	 Catch:{ all -> 0x0281 }
        r14.add(r9, r0);	 Catch:{ all -> 0x0281 }
    L_0x01ad:
        r15 = r10.b();	 Catch:{ all -> 0x0281 }
        r15 = r15.b();	 Catch:{ all -> 0x0281 }
        r11 = r14.size();	 Catch:{ all -> 0x0281 }
    L_0x01b9:
        if (r9 >= r11) goto L_0x0231;
    L_0x01bb:
        r16 = r14.get(r9);	 Catch:{ all -> 0x0281 }
        r17 = r6;
        r6 = r16;
        r6 = (defpackage.aqui) r6;	 Catch:{ all -> 0x0281 }
        r16 = r12.size();	 Catch:{ all -> 0x0281 }
        r18 = r11;
        r11 = r15 - r16;
        if (r11 <= 0) goto L_0x022c;
    L_0x01cf:
        r16 = r13.get(r6);	 Catch:{ all -> 0x0281 }
        r19 = r14;
        r14 = r16;
        r14 = (java.util.List) r14;	 Catch:{ all -> 0x0281 }
        r16 = r15;
        r15 = r14.size();	 Catch:{ all -> 0x0281 }
        if (r11 >= r15) goto L_0x0206;
    L_0x01e1:
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r20 = r0;
        r21 = r3;
        r0 = 0;
        r3 = r14.subList(r0, r11);	 Catch:{ all -> 0x0281 }
        r15.<init>(r3);	 Catch:{ all -> 0x0281 }
        r12.addAll(r15);	 Catch:{ all -> 0x0281 }
        r7.addAll(r15);	 Catch:{ all -> 0x0281 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0281 }
        r4 = r14.size();	 Catch:{ all -> 0x0281 }
        r4 = r14.subList(r11, r4);	 Catch:{ all -> 0x0281 }
        r3.<init>(r4);	 Catch:{ all -> 0x0281 }
        r13.put(r6, r3);	 Catch:{ all -> 0x0281 }
        goto L_0x021d;
    L_0x0206:
        r20 = r0;
        r21 = r3;
        r0 = 0;
        r12.addAll(r14);	 Catch:{ all -> 0x0281 }
        r7.addAll(r14);	 Catch:{ all -> 0x0281 }
        r13.remove(r6);	 Catch:{ all -> 0x0281 }
        r3 = r13.isEmpty();	 Catch:{ all -> 0x0281 }
        if (r3 == 0) goto L_0x021d;
    L_0x021a:
        r2.remove(r10);	 Catch:{ all -> 0x0281 }
    L_0x021d:
        r9 = r9 + 1;
        r15 = r16;
        r6 = r17;
        r11 = r18;
        r14 = r19;
        r0 = r20;
        r3 = r21;
        goto L_0x01b9;
    L_0x022c:
        r20 = r0;
        r21 = r3;
        goto L_0x0237;
    L_0x0231:
        r20 = r0;
        r21 = r3;
        r17 = r6;
    L_0x0237:
        r0 = 0;
        r8.put(r10, r12);	 Catch:{ all -> 0x0281 }
        r6 = r17;
        r0 = r20;
        r3 = r21;
        r9 = 0;
        r11 = 1;
        goto L_0x017a;
    L_0x0245:
        r20 = r0;
        r21 = r3;
        r7.addAll(r5);	 Catch:{ all -> 0x0281 }
        r0 = r1.e;	 Catch:{ all -> 0x0281 }
        r0.a(r7);	 Catch:{ all -> 0x0281 }
        r0 = r20;
        r3 = r21;
        r1.a(r0, r8, r3);	 Catch:{ all -> 0x0281 }
        r2 = defpackage.afod.a(r0, r2);	 Catch:{ all -> 0x0281 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0281 }
        r3 = 1;
        r2 = r2 ^ r3;
        if (r2 != 0) goto L_0x0265;
    L_0x0264:
        goto L_0x027a;
    L_0x0265:
        r2 = r1.c(r0);	 Catch:{ all -> 0x0281 }
        r2 = r2.c;	 Catch:{ all -> 0x0281 }
        r2 = r2.d;	 Catch:{ all -> 0x0281 }
        r2 = defpackage.aquk.a(r2);	 Catch:{ all -> 0x0281 }
        if (r2 == 0) goto L_0x027c;
    L_0x0273:
        r3 = 3;
        if (r2 == r3) goto L_0x0277;
    L_0x0276:
        goto L_0x027c;
    L_0x0277:
        r1.e(r0);	 Catch:{ all -> 0x0281 }
    L_0x027a:
        monitor-exit(r23);
        return;
    L_0x027c:
        r1.d(r0);	 Catch:{ all -> 0x0281 }
        monitor-exit(r23);
        return;
    L_0x0281:
        r0 = move-exception;
        monitor-exit(r23);
        goto L_0x0285;
    L_0x0284:
        throw r0;
    L_0x0285:
        goto L_0x0284;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afod.e(aqui):void");
    }

    private static void a(Map map, String str, boolean z) {
        Object zzVar;
        if (!map.containsKey(str)) {
            Integer valueOf = Integer.valueOf(0);
            map.put(str, new zz(valueOf, valueOf));
        }
        zz zzVar2 = (zz) map.get(str);
        if (z) {
            zzVar = new zz((Integer) zzVar2.a, Integer.valueOf(((Integer) zzVar2.b).intValue() + 1));
        } else {
            zzVar = new zz(Integer.valueOf(((Integer) zzVar2.a).intValue() + 1), (Integer) zzVar2.b);
        }
        map.put(str, zzVar);
    }

    private static Set a(aqui aqui, Map map) {
        HashSet hashSet = new HashSet();
        for (afog afog : map.keySet()) {
            if (((Map) map.get(afog)).containsKey(aqui)) {
                hashSet.add(afog);
            }
        }
        return hashSet;
    }
}
