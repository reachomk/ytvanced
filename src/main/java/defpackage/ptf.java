package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ptf */
public final class ptf {
    private final Set a;
    private final Set b;
    private String c;
    private String d;
    private final Map e;
    private final Context f;
    private final Map g;
    private int h;
    private Looper i;
    private psf j;
    private psq k;
    private final ArrayList l;
    private final ArrayList m;

    public ptf(Context context) {
        this.a = new HashSet();
        this.b = new HashSet();
        this.e = new zj();
        this.g = new zj();
        this.h = -1;
        this.j = psf.a;
        this.k = rxx.a;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f = context;
        this.i = context.getMainLooper();
        this.c = context.getPackageName();
        this.d = context.getClass().getName();
    }

    public ptf(Context context, pte pte, pth pth) {
        this(context);
        pzr.a((Object) pte, (Object) "Must provide a connected listener");
        this.l.add(pte);
        pzr.a((Object) pth, (Object) "Must provide a connection failed listener");
        this.m.add(pth);
    }

    public final ptf a(pte pte) {
        pzr.a((Object) pte, (Object) "Listener must not be null");
        this.l.add(pte);
        return this;
    }

    public final ptf a(pth pth) {
        pzr.a((Object) pth, (Object) "Listener must not be null");
        this.m.add(pth);
        return this;
    }

    public final ptf a(pso pso) {
        pzr.a((Object) pso, (Object) "Api must not be null");
        this.g.put(pso, null);
        List emptyList = Collections.emptyList();
        this.b.addAll(emptyList);
        this.a.addAll(emptyList);
        return this;
    }

    public final ptf a(pso pso, psu psu) {
        pzr.a((Object) pso, (Object) "Api must not be null");
        pzr.a((Object) psu, (Object) "Null options are not permitted for this Api");
        this.g.put(pso, psu);
        List emptyList = Collections.emptyList();
        this.b.addAll(emptyList);
        this.a.addAll(emptyList);
        return this;
    }

    public final pyp a() {
        rxv rxv = rxv.a;
        if (this.g.containsKey(rxx.b)) {
            rxv = (rxv) this.g.get(rxx.b);
        }
        return new pyp(null, this.a, this.e, this.c, this.d, rxv);
    }

    public final ptd b() {
        boolean z = true;
        pzr.b(this.g.isEmpty() ^ 1, "must call addApi() to add at least one API");
        pyp a = a();
        Map map = a.d;
        zj zjVar = new zj();
        zj zjVar2 = new zj();
        ArrayList arrayList = new ArrayList();
        for (pso pso : this.g.keySet()) {
            Object obj = this.g.get(pso);
            boolean z2 = map.get(pso) != null;
            zjVar.put(pso, Boolean.valueOf(z2));
            pxk pxk = new pxk(pso, z2);
            arrayList.add(pxk);
            zjVar2.put(pso.b(), pso.a().a(this.f, this.i, a, obj, pxk, pxk));
        }
        pyp pyp = a;
        pvk pvk = new pvk(this.f, new ReentrantLock(), this.i, pyp, this.j, this.k, zjVar, this.l, this.m, zjVar2, this.h, pvk.a(zjVar2.values()), arrayList);
        synchronized (ptd.a) {
            ptd.a.add(pvk);
        }
        if (this.h >= 0) {
            puf a2 = LifecycleCallback.a(null);
            pxc pxc = (pxc) a2.a("AutoManageHelper", pxc.class);
            if (pxc == null) {
                pxc = new pxc(a2);
            }
            int i = this.h;
            pzr.a((Object) pvk, (Object) "GoogleApiClient instance cannot be null");
            if (pxc.b.indexOfKey(i) >= 0) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Already managing a GoogleApiClient with id ");
            stringBuilder.append(i);
            pzr.a(z, stringBuilder.toString());
            pxg pxg = (pxg) pxc.e.get();
            boolean z3 = pxc.d;
            String.valueOf(pxg).length();
            pxc.b.put(i, new pxf(pxc, i, pvk));
            if (pxc.d && pxg == null) {
                String.valueOf(pvk).length();
                pvk.c();
            }
        }
        return pvk;
    }
}
