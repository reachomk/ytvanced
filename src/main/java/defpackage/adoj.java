package defpackage;

import android.os.Handler;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: adoj */
public final class adoj {
    public static final String a = xtl.b("MDX.promotion");
    public final adou b;
    public final Map c;
    public final Set d;
    public final Set e;
    public final adfq f;
    public final adqf g;
    public final bcuo h;
    public final Set i;
    public adoi j;
    public final Object k = new Object();
    public adiu l;
    public final Handler m;
    public Runnable n;
    public final Comparator o = new adon(this);

    public adoj(Handler handler, adou adou, Set set, Set set2, Set set3, adfq adfq, adqf adqf, bctz bctz) {
        this.m = (Handler) amqw.a((Object) handler);
        this.b = (adou) amqw.a((Object) adou);
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        amqw.a((Object) set);
        this.c = new HashMap();
        for (adog adog : set) {
            this.c.put(adog.a, adog);
        }
        amqw.a(set.size() == this.c.size());
        this.d = (Set) amqw.a((Object) set2);
        this.e = (Set) amqw.a((Object) set3);
        HashSet hashSet = new HashSet();
        for (adoi a : set3) {
            hashSet.add(a.a());
        }
        amqw.a(hashSet.containsAll(this.c.keySet()));
        this.f = (adfq) amqw.a((Object) adfq);
        this.g = (adqf) amqw.a((Object) adqf);
        this.h = bctz.a(new adom(this));
    }

    public final void a(adoh adoh) {
        this.i.add(adoh);
    }

    public final void a() {
        Runnable runnable = this.n;
        if (runnable != null) {
            this.m.removeCallbacks(runnable);
            this.n = null;
        }
    }
}
