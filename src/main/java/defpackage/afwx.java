package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afwx */
public final class afwx {
    private static final amuw b = amuw.a((Object) "FEnotifications_inbox", (Object) "FEshared");
    public final Map a = new HashMap();
    private final Set c = Collections.newSetFromMap(new WeakHashMap());

    public afwx(bcaa bcaa) {
        this.c.addAll((Collection) bcaa.get());
    }

    public final boolean a(String str) {
        xak.a();
        if (str.equals("FEactivity")) {
            return a("FEshared") || a("FEnotifications_inbox");
        } else {
            afwv d = d(str);
            if (d != null) {
                return d.b() && !((Boolean) this.a.get(d)).booleanValue();
            }
        }
    }

    public final int b(String str) {
        xak.a();
        int i = 0;
        if (str.equals("FEactivity")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"FEshared", "FEnotifications_inbox"}));
            for (afwv afwv : this.a.keySet()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(afwv.a(), (String) it.next())) {
                        if (!((Boolean) this.a.get(afwv)).booleanValue()) {
                            i += afwv.d();
                        }
                        it.remove();
                    }
                }
            }
            return i;
        }
        afwv d = d(str);
        if (d == null || ((Boolean) this.a.get(d)).booleanValue()) {
            return 0;
        }
        return d.d();
    }

    public final void a(afwz afwz, long j) {
        xak.a();
        this.c.add(afwz);
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList, afxa.a);
        int i = 0;
        while (i < arrayList.size()) {
            afwv afwv = (afwv) arrayList.get(i);
            if (!((Boolean) this.a.get(afwv)).booleanValue() || ((long) afwv.c()) > j) {
                String a = afwv.a();
                boolean b = afwv.b();
                int d = afwv.d();
                long c = (long) afwv.c();
                boolean z = i == arrayList.size() + -1 && b.contains(afwv.a());
                afwz.a(a, b, d, c, z);
            }
            i++;
        }
    }

    public final void a(afwz afwz) {
        xak.a();
        this.c.remove(afwz);
    }

    public final void a(afwv afwv) {
        xak.a();
        if (afwv.a() != null) {
            afwv d = d(afwv.a());
            if (d == null) {
                b(afwv);
            } else if (afwv.c() >= d.c()) {
                if (d.b() != afwv.b()) {
                    this.a.remove(d);
                    b(afwv);
                } else if (!((Boolean) this.a.get(d)).booleanValue()) {
                    this.a.remove(d);
                    b(afwv);
                } else if (afwv.c() > d.c()) {
                    this.a.remove(d);
                    b(afwv);
                }
            }
        }
    }

    public final void c(String str) {
        xak.a();
        afwv d = d(str);
        if (d != null) {
            this.a.put(d, Boolean.valueOf(true));
        }
        for (afwz a : this.c) {
            a.a(str);
        }
    }

    private final void b(afwv afwv) {
        this.a.put(afwv, Boolean.valueOf(false));
        for (afwz a : this.c) {
            a.a(afwv.a(), afwv.b(), afwv.d(), (long) afwv.c(), false);
        }
    }

    private final afwv d(String str) {
        for (afwv afwv : this.a.keySet()) {
            if (TextUtils.equals(afwv.a(), str)) {
                return afwv;
            }
        }
        return null;
    }
}
