package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: agul */
public final class agul {
    private final aguz a;

    public agul(aguz aguz) {
        this.a = aguz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    public final defpackage.agqp a(java.lang.String r5) {
        /*
        r4 = this;
        defpackage.xak.b();
        r0 = r4.a;
        r0 = r0.a();
        r1 = r0.a;
        r1.add(r5);
        r0.g();
        r1 = r4.a;	 Catch:{ aanq -> 0x0067 }
        r0 = r1.a(r0);	 Catch:{ aanq -> 0x0067 }
        r0 = r0.c;
        r0 = r0.iterator();
    L_0x001d:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x003e;
    L_0x0023:
        r1 = r0.next();
        r1 = (defpackage.avrg) r1;
        r2 = r1.b;
        if (r2 != 0) goto L_0x002f;
    L_0x002d:
        r2 = defpackage.avre.p;
    L_0x002f:
        r2 = r2.b;
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x001d;
    L_0x0037:
        r0 = r1.b;
        if (r0 != 0) goto L_0x003f;
    L_0x003b:
        r0 = defpackage.avre.p;
        goto L_0x003f;
    L_0x003e:
        r0 = 0;
    L_0x003f:
        if (r0 != 0) goto L_0x0062;
    L_0x0041:
        r0 = new java.util.concurrent.ExecutionException;
        r1 = new aanq;
        r5 = java.lang.String.valueOf(r5);
        r2 = "No video data returned for videoId=";
        r3 = r5.length();
        if (r3 != 0) goto L_0x0057;
    L_0x0051:
        r5 = new java.lang.String;
        r5.<init>(r2);
        goto L_0x005b;
    L_0x0057:
        r5 = r2.concat(r5);
    L_0x005b:
        r1.<init>(r5);
        r0.<init>(r1);
        throw r0;
    L_0x0062:
        r5 = defpackage.agqp.a(r0);
        return r5;
    L_0x0067:
        r5 = move-exception;
        r0 = new java.util.concurrent.ExecutionException;
        r0.<init>(r5);
        goto L_0x006f;
    L_0x006e:
        throw r0;
    L_0x006f:
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agul.a(java.lang.String):agqp");
    }

    public final agra a(String str, int i) {
        xak.b();
        agvf a = this.a.a();
        a.b.add(str);
        a.g();
        try {
            List arrayList;
            ataw a2 = this.a.a(a);
            avoq a3 = ahdh.a(a2, str);
            avoq a4 = ahdh.a(a2, str);
            if (a4 != null) {
                arrayList = new ArrayList();
                for (avrg avrg : a4.e) {
                    Object obj = avrg.b;
                    if (obj == null) {
                        obj = avre.p;
                    }
                    arrayList.add(obj);
                }
            } else {
                arrayList = null;
            }
            if (a3 == null || arrayList == null) {
                return null;
            }
            int size;
            if (a3.e.size() != 0) {
                size = a3.e.size();
                avop avop = (avop) ((anxo) a3.toBuilder());
                avop.copyOnWrite();
                ((avoq) avop.instance).e = anxl.emptyProtobufList();
                a3 = (avoq) ((anxl) avop.build());
            } else {
                size = 0;
            }
            aygk aygk = a3.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aaft aaft = new aaft(aygk);
            avnc avnc = a3.d;
            if (avnc == null) {
                avnc = avnc.c;
            }
            agqi a5 = agqi.a(a3, false, size, aaft, agpy.a(avnc));
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(agqp.a((avre) arrayList.get(i2)));
            }
            agra agra = new agra(a5, arrayList2);
            if (i < 0) {
                return null;
            }
            a5 = agra.a;
            List list = agra.b;
            List subList = list.subList(0, Math.min(list.size(), i));
            return new agra(new agqi(a5, subList.size()), subList);
        } catch (aanq e) {
            throw new ExecutionException(e);
        }
    }

    public final ataq a(long j, long j2, int i, float f, List list) {
        xak.b();
        aguz aguz = this.a;
        agvg agvg = new agvg(aguz.c, aguz.d.c());
        agvg.b = j;
        agvg.c = j2;
        agvg.d = i;
        agvg.e = f;
        for (aguo aguo : list) {
            Object obj = aguo.a;
            long j3 = aguo.b;
            Object obj2 = aguo.c;
            long j4 = aguo.d;
            ataj ataj = (ataj) atak.g.createBuilder();
            String str = (String) amqw.a(obj);
            ataj.copyOnWrite();
            atak atak = (atak) ataj.instance;
            if (str != null) {
                atak.a |= 1;
                atak.b = str;
                ataj.copyOnWrite();
                atak atak2 = (atak) ataj.instance;
                atak2.a |= 2;
                atak2.c = j3;
                List asList = Arrays.asList((String[]) amqw.a(obj2));
                ataj.copyOnWrite();
                atak atak3 = (atak) ataj.instance;
                if (!atak3.d.a()) {
                    atak3.d = anxl.mutableCopy(atak3.d);
                }
                anvf.addAll(asList, atak3.d);
                ataj.copyOnWrite();
                atak2 = (atak) ataj.instance;
                atak2.a |= 4;
                atak2.e = true;
                ataj.copyOnWrite();
                atak2 = (atak) ataj.instance;
                atak2.a |= 8;
                atak2.f = j4;
                agvg.a.add((atak) ((anxl) ataj.build()));
            } else {
                throw new NullPointerException();
            }
        }
        agvg.g();
        try {
            return (ataq) this.a.a.b(agvg);
        } catch (aanq e) {
            throw new ExecutionException(e);
        }
    }
}
