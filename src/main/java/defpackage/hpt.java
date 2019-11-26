package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: hpt */
public final class hpt {
    public final ahdm a;
    public final bcaa b;
    public final ExecutorService c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final xsc g;

    public hpt(ahdm ahdm, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, xsc xsc, ExecutorService executorService) {
        this.a = ahdm;
        this.b = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.f = bcaa4;
        this.g = xsc;
        this.c = executorService;
    }

    public final void a(String str, wxg wxg) {
        if (this.a.b()) {
            a(Collections.singletonList(str), wxg);
        }
    }

    public final void a(List list, wxg wxg) {
        if (this.a.b()) {
            this.c.execute(new hpv(this, list, wxg));
        }
    }

    public final void a(Map map, Map map2, wxg wxg) {
        int i;
        wxg wxg2 = wxg;
        xak.b();
        amqw.a(map.size() == map2.size());
        agvx n = ((agwc) this.b.get()).b().n();
        LinkedList linkedList = new LinkedList();
        for (String str : map.keySet()) {
            List list = (List) map2.get(str);
            long toSeconds = TimeUnit.MILLISECONDS.toSeconds(((agqi) map.get(str)).h.getTime());
            agqk a = n.a(str);
            String[] strArr = new String[list.size()];
            for (i = 0; i < strArr.length; i++) {
                strArr[i] = ((agqp) list.get(i)).a();
            }
            linkedList.add(new aguo(str, toSeconds, strArr, TimeUnit.MILLISECONDS.toSeconds(a.e)));
        }
        Map map3 = map;
        agwa agwa = (agwa) this.e.get();
        try {
            agul agul = (agul) this.d.get();
            long a2 = agwa.a();
            long a3 = agwa.a() + agwa.c();
            i = Integer.MAX_VALUE;
            for (agqy agqy : ((agwc) this.b.get()).b().k().a()) {
                int toSeconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(this.g.a() - agqy.g);
                if (toSeconds2 >= 0) {
                    if (toSeconds2 < i) {
                        i = toSeconds2;
                    }
                }
            }
            ataq a4 = agul.a(a2, a3, i, ((xry) this.f.get()).a(), linkedList);
            Set<Object> keySet = map.keySet();
            LinkedList linkedList2 = new LinkedList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            long c = ((agwa) this.e.get()).c() - a4.d;
            for (Object obj : keySet) {
                atam a5 = ahdh.a(a4, (String) obj);
                if (wxg2 != null) {
                    boolean z;
                    if (a5 != null) {
                        if (a5.c) {
                            z = true;
                            wxg2.a(obj, Boolean.valueOf(z));
                        }
                    }
                    z = false;
                    wxg2.a(obj, Boolean.valueOf(z));
                }
                if (!(a5 == null || a5.c)) {
                    if (a5.g || a5.f) {
                        linkedList2.add(obj);
                        hashMap.put(obj, Integer.valueOf(Integer.MAX_VALUE));
                        hashMap2.put(obj, Integer.valueOf(a5.f ^ 1));
                    }
                }
            }
            if (!linkedList2.isEmpty()) {
                ((agwc) this.b.get()).b().n().a(linkedList2, hashMap, hashMap2, 1, c);
            }
        } catch (ExecutionException e) {
            for (Object obj2 : map.keySet()) {
                if (wxg2 != null) {
                    wxg2.a(obj2, (Exception) e);
                } else {
                    String valueOf = String.valueOf(obj2);
                    String str2 = "Failed to sync playlist = ";
                    xtl.a(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), e);
                }
            }
        }
    }
}
