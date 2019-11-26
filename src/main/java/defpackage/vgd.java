package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vgd */
public final class vgd {
    public final String a;
    public final AtomicReference b = new AtomicReference(null);
    public final aakj c;
    public final ajmq d;
    public final CopyOnWriteArrayList e;
    public final List f;
    public final Map g;
    public final Map h;
    public int i;
    private final Map j;
    private vdo k;

    public vgd(aakj aakj, ajmq ajmq, String str) {
        Object arrayList = new ArrayList();
        Object copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.c = (aakj) amqw.a((Object) aakj);
        this.a = (String) amqw.a((Object) str);
        this.f = (List) amqw.a(arrayList);
        this.e = (CopyOnWriteArrayList) amqw.a(copyOnWriteArrayList);
        this.d = (ajmq) amqw.a((Object) ajmq);
        this.g = new HashMap();
        this.j = new HashMap();
        this.h = new HashMap();
        this.i = -1;
    }

    public final vgy a(String str) {
        return (vgy) this.g.get(str);
    }

    public final void a(String str, vgy vgy) {
        this.g.put(str, vgy);
    }

    public final ajmp b(String str) {
        return (ajmp) this.j.get(str);
    }

    public final void a(String str, ajmp ajmp) {
        this.j.put(str, ajmp);
    }

    public final boolean a() {
        return this.c.n().aq();
    }

    public final String b() {
        for (aogi aogi : this.c.q()) {
            int a = aogh.a(aogi.d);
            if (a != 0 && a == 7) {
                return aogi.e;
            }
        }
        return null;
    }

    public final void c(String str) {
        this.b.set(str);
    }

    public final void c() {
        xak.a();
        vdo vdo = this.k;
        if (vdo != null) {
            vdo.a();
            this.k = null;
        }
    }

    public final void a(vdo vdo) {
        xak.a();
        this.k = vdo;
    }

    public final ajpa d(String str) {
        xak.a();
        return (ajpa) this.h.get(str);
    }
}
