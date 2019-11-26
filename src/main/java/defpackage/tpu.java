package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: tpu */
public final class tpu implements ActivityLifecycleCallbacks {
    public final tpw a;
    private final tqb b = new tqa();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Set e = new HashSet();
    private final Handler f;
    private final Runnable g;
    private boolean h;
    private final tpr i;

    public tpu(Context context, tpr tpr, tpw tpw) {
        this.i = (tpr) amqw.a((Object) tpr);
        this.a = (tpw) amqw.a((Object) tpw);
        this.f = new Handler(context.getMainLooper());
        this.g = new tpx(this);
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void a(String str, View view, tqm tqm) {
        if (this.a.a()) {
            tql tql = (tql) this.d.get(str);
            if (tql != null) {
                if (view != tql.a()) {
                    tql.a(view);
                }
                tql.s = false;
                a(str, tql);
            } else if (!this.e.contains(str)) {
                b(str, new tql(view, tqm, str, this, this.i));
            }
        }
    }

    public final void a(String str) {
        if (this.a.a()) {
            tql tql;
            if (this.c.containsKey(str)) {
                tql = (tql) this.c.get(str);
            } else {
                tql = (tql) this.d.get(str);
            }
            if (tql != null) {
                if (tql.t) {
                    d(str);
                    c(str);
                } else {
                    tql.s = true;
                    if (!(tql.q || tql.r)) {
                        b(str);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.c.keySet()) {
            tql tql = (tql) this.c.get(str);
            View a = tql.a();
            if (a == null || tql.t) {
                arrayList.add(str);
            } else if (activity == tpu.a(a)) {
                tql.q = true;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            d(str2);
            c(str2);
        }
        size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((String) arrayList2.get(i2));
        }
    }

    public final void onActivityResumed(Activity activity) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.d.keySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            str = (String) it.next();
            tql tql = (tql) this.d.get(str);
            View a = tql.a();
            if (a == null) {
                arrayList.add(str);
            } else if (activity == tpu.a(a)) {
                tql.q = false;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str = (String) arrayList.get(i2);
            d(str);
            c(str);
        }
        size = arrayList2.size();
        while (i < size) {
            String str2 = (String) arrayList2.get(i);
            a(str2, (tql) this.d.get(str2));
            i++;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        View a;
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.c.keySet()) {
            a = ((tql) this.c.get(str2)).a();
            if (a == null || activity == tpu.a(a)) {
                arrayList.add(str2);
            }
        }
        for (String str22 : this.d.keySet()) {
            a = ((tql) this.d.get(str22)).a();
            if (a == null || activity == tpu.a(a)) {
                arrayList.add(str22);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            str22 = (String) arrayList.get(i);
            d(str22);
            c(str22);
        }
    }

    private final void d(String str) {
        tql tql;
        if (this.c.containsKey(str)) {
            tql = (tql) this.c.get(str);
        } else {
            tql = (tql) this.d.get(str);
        }
        tql.f();
    }

    private final void b(String str, tql tql) {
        this.c.put(str, tql);
        if (!this.h) {
            a();
        }
    }

    public final void a() {
        for (tql tql : this.c.values()) {
            tql.a(this.b.a());
            if (tql.c() && !tql.t) {
                tql.n.a(tql.a("lidarim", "v"), tql.a());
                tql.t = true;
            }
        }
        this.f.postDelayed(this.g, 200);
        if (!this.h) {
            this.i.a.a((Object) this);
        }
        this.h = true;
    }

    private final void b() {
        this.f.removeCallbacks(this.g);
        if (this.h) {
            this.i.a.c.remove(this);
        }
        this.h = false;
    }

    public final void a(String str, tql tql) {
        this.d.remove(str);
        b(str, tql);
    }

    public final void b(String str) {
        tql tql = (tql) this.c.get(str);
        if (tql != null) {
            tql.a(this.b.a());
            this.d.put(str, tql);
            this.c.remove(str);
        }
        if (this.c.isEmpty()) {
            b();
        }
    }

    public final void c(String str) {
        this.e.add(str);
        this.c.remove(str);
        this.d.remove(str);
        if (this.c.isEmpty()) {
            b();
        }
    }

    private static Activity a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
