package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: agrt */
public class agrt implements agvw {
    public final agvz a;
    public final String b;
    private final Object c = new Object();
    private Pair d;

    public agrt(agvz agvz, String str) {
        this.a = (agvz) amqw.a((Object) agvz);
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(agqi agqi, List list) {
        synchronized (this.c) {
            this.d = new Pair(agqi, list);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        List emptyList = Collections.emptyList();
        agqi agqi = null;
        if ("PPSV".equals(this.b) && !TextUtils.isEmpty(null)) {
            Object a = !TextUtils.isEmpty(null) ? this.a.k().a(null) : null;
            if (a != null) {
                emptyList = Collections.singletonList(a);
            }
        } else if (!TextUtils.isEmpty(this.b)) {
            agqk a2 = this.a.n().a(this.b);
            if (a2 != null) {
                agqi = a2.a;
            }
            if (agqi != null) {
                emptyList = this.a.n().b(this.b);
            }
        }
        a(agqi, emptyList);
    }

    public final agqi b() {
        agqi agqi;
        synchronized (this.c) {
            if (this.d == null) {
                a();
            }
            agqi = (agqi) this.d.first;
        }
        return agqi;
    }

    public final List c() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList();
            for (agqy agqy : d()) {
                arrayList.add(agqy.a);
            }
        }
        return arrayList;
    }

    public final List d() {
        List list;
        synchronized (this.c) {
            if (this.d == null) {
                a();
            }
            list = (List) this.d.second;
        }
        return list;
    }

    public boolean e() {
        return (TextUtils.isEmpty(this.b) || TextUtils.equals(this.b, "PPSV")) ? false : true;
    }
}
