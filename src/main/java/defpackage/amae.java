package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: amae */
public final class amae implements amab {
    private final Executor a;
    private final HashMap b = new HashMap();

    public amae(Executor executor) {
        this.a = executor;
    }

    public final synchronized void a(amaq amaq) {
        a("", amaq);
    }

    public final synchronized void a(String str, amaq amaq) {
        for (Entry entry : this.b.entrySet()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) entry.getValue();
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(amaq)) {
                amqw.a(str.equals(entry.getKey()), (Object) "Listener can be associated to only one identity.");
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.b.get(str);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            amqw.b(this.b.put(str, copyOnWriteArrayList2) == null);
        }
        if (!copyOnWriteArrayList2.contains(amaq)) {
            copyOnWriteArrayList2.add(amaq);
        }
    }

    public final synchronized void b(amaq amaq) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        Object obj;
        Iterator it = this.b.entrySet().iterator();
        while (true) {
            copyOnWriteArrayList = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Entry entry = (Entry) it.next();
            copyOnWriteArrayList = (CopyOnWriteArrayList) entry.getValue();
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(amaq)) {
                obj = (String) entry.getKey();
                break;
            }
        }
        boolean z = true;
        amqw.b(copyOnWriteArrayList != null, (Object) "Listener was never mapped to any identity.");
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(amaq);
            if (copyOnWriteArrayList.isEmpty()) {
                if (this.b.remove(obj) == null) {
                    z = false;
                }
                amqw.b(z);
            }
        }
    }

    public final void a(String str, amea amea) {
        this.a.execute(new amad(this, str, amea));
    }

    public final void a(String str, String str2, boolean z) {
        this.a.execute(new amag(this, str, str2, z));
    }

    public final void a(String str, String str2) {
        this.a.execute(new amai(this, str, str2));
    }

    public final void a(String str, String str2, ameo ameo) {
        this.a.execute(new amah(this, str, str2, ameo));
    }

    public final void a(String str, String str2, double d) {
        this.a.execute(new amak(this, str, str2, d));
    }

    public final void a(String str, String str2, long j, long j2, double d) {
        this.a.execute(new amaj(this, str, str2, j, j2, d));
    }

    public final void a(String str, String str2, amec amec) {
        this.a.execute(new amam(this, str, str2, amec));
    }

    public final void a(String str, String str2, String str3) {
        this.a.execute(new amal(this, str, str2, str3));
    }

    public final void a(String str, String str2, boolean z, boolean z2) {
        this.a.execute(new amaf(this, str, str2, z, z2));
    }

    public final synchronized List a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = (List) this.b.get(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        list = (List) this.b.get("");
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final void a(String str, String str2, int i) {
        this.a.execute(new amao(this, str, str2, i));
    }

    public final void b(String str, String str2, int i) {
        this.a.execute(new aman(this, str, str2, i));
    }
}
