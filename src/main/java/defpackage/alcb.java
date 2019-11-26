package defpackage;

import android.util.Pair;
import android.view.View;
import com.google.android.youtube.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alcb */
public final class alcb implements akpj, akwp {
    private final alck a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ReferenceQueue d = new ReferenceQueue();
    private final alcd e;

    public alcb(alck alck, akpi akpi, akwo akwo, alcd alcd) {
        this.a = alck;
        this.e = alcd;
        akpi.a.add(this);
        akwo.a.add(this);
        alca alca = new alca(this);
        alck.b.add(alca);
        albu albu = alck.d;
        if (albu != null) {
            alca.a(albu);
        }
    }

    public final void a(Object obj, View view) {
        String a = this.e.a(obj);
        if (a != null) {
            a(a, view);
        }
    }

    public final void b(Object obj, View view) {
        String a = this.e.a(obj);
        if (a != null) {
            a(a, view);
        }
    }

    public final void a(ayhz ayhz, amqv amqv) {
        a(ayhz, amqv, true);
    }

    public final void a(ayhz ayhz, amqv amqv, boolean z) {
        String str = ayhz.c;
        WeakReference weakReference = (WeakReference) this.c.get(str);
        View view = null;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (view2 == null || !str.equals(alcb.a(view2))) {
                this.c.remove(str);
            } else if (abe.H(view2)) {
                view = view2;
            }
        }
        if (z && view != null && amqv.a(ayhz)) {
            a(ayhz, view);
        } else {
            this.b.put(ayhz.c, new Pair(ayhz, amqv));
        }
        a();
    }

    public final void a(String str, View view) {
        ayhz ayhz;
        String a = alcb.a(view);
        if (!(a == null || a.equals(str))) {
            alcc alcc = (alcc) this.c.get(a);
            if (alcc != null && view.equals(alcc.get())) {
                this.c.remove(a);
            }
        }
        view.setTag(R.id.tooltip_registry_id, str);
        this.c.put(str, new alcc(view, this.d, str));
        Pair pair = (Pair) this.b.get(str);
        if (pair == null || !((amqv) pair.second).a((ayhz) pair.first)) {
            this.b.remove(str);
            ayhz = null;
        } else {
            ayhz = (ayhz) pair.first;
        }
        a(ayhz, view);
        a();
    }

    public final void a(String str) {
        this.b.remove(str);
        a();
    }

    private final void a(ayhz ayhz, View view) {
        if (ayhz != null && view != null) {
            alck alck = this.a;
            alck.a(((alco) ((alco) alck.a.a(ayhz).a(view)).f()).a());
        }
    }

    private final void a() {
        alcc alcc = (alcc) this.d.poll();
        while (alcc != null) {
            alcc alcc2 = (alcc) this.c.get(alcc.a);
            if (alcc2 != null && alcc2.get() == null) {
                this.c.remove(alcc.a);
            }
            alcc = (alcc) this.d.poll();
        }
    }

    public static String a(View view) {
        return view != null ? (String) view.getTag(R.id.tooltip_registry_id) : null;
    }
}
