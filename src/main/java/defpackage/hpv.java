package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: hpv */
final /* synthetic */ class hpv implements Runnable {
    private final hpt a;
    private final List b;
    private final wxg c;

    hpv(hpt hpt, List list, wxg wxg) {
        this.a = hpt;
        this.b = list;
        this.c = wxg;
    }

    public final void run() {
        hpt hpt = this.a;
        List list = this.b;
        wxg wxg = this.c;
        HashSet<String> hashSet = new HashSet(list);
        xak.b();
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, hpt.c.submit(new hpu(hpt, str)));
        }
        LinkedList<Pair> linkedList = new LinkedList();
        for (Object obj : hashMap.keySet()) {
            try {
                linkedList.add((Pair) ((Future) hashMap.get(obj)).get());
            } catch (InterruptedException | ExecutionException e) {
                if (wxg != null) {
                    wxg.a(obj, (Exception) e);
                }
                xtl.a("Failed to fetch playlist and videos", e);
            }
        }
        hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Pair pair : linkedList) {
            String str2 = ((agqi) pair.first).a;
            hashMap.put(str2, (agqi) pair.first);
            hashMap2.put(str2, (List) pair.second);
        }
        hpt.a(hashMap, hashMap2, wxg);
    }
}
