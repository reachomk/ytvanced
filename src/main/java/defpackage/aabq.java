package defpackage;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map.Entry;

/* renamed from: aabq */
final /* synthetic */ class aabq implements Runnable {
    private final aabr a;

    aabq(aabr aabr) {
        this.a = aabr;
    }

    public final void run() {
        aabr aabr = this.a;
        aabr.c.a("INTERNAL", "Performing GC");
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Entry entry : aabr.a.e.b.entrySet()) {
            String str = (String) entry.getKey();
            if (!hashSet.contains(str) && ((aaeh) entry.getValue()).b()) {
                arrayDeque.push(str);
                while (!arrayDeque.isEmpty()) {
                    String str2 = (String) arrayDeque.pop();
                    aadq b = aabr.a.e.b(str2);
                    if (b != null) {
                        hashSet.add(str2);
                        amxo amxo = (amxo) b.d().iterator();
                        while (amxo.hasNext()) {
                            str = (String) amxo.next();
                            if (!hashSet.contains(str)) {
                                arrayDeque.push(str);
                            }
                        }
                    }
                }
            }
        }
        for (Entry entry2 : aabr.a.e.a.entrySet()) {
            aadq aadq = ((aabt) entry2.getValue()).b;
            aaeh aaeh = aadq != null ? (aaeh) aabr.a.e.c.get(aadq.getClass()) : null;
            if (!hashSet.contains(entry2.getKey()) && ((aabt) entry2.getValue()).d <= aabr.b.b()) {
                if (aaeh == null || !aaeh.b()) {
                    aaep aaep = aabr.c;
                    String simpleName = ((aabt) entry2.getValue()).getClass().getSimpleName();
                    String valueOf = String.valueOf((String) entry2.getKey());
                    String str3 = "GC: removing ";
                    aaep.a(simpleName, valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
                    aabr.a.e.a.remove(entry2.getKey());
                    aabr.a.e.b.remove(entry2.getKey());
                    if (aaeh != null) {
                        aabr.a.e.c.remove(aadq.getClass());
                    }
                }
            }
        }
    }
}
