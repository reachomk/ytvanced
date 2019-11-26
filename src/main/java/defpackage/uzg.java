package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: uzg */
public class uzg implements uxy, uya, uyb, uyc, uyd, uyr, uzb {
    public final View a;
    private final uxw b = new uxw();
    private final Context c;
    public final uxs d = new uxs();
    public final akpk e;
    public uza f;
    private final acvx g;

    public uzg(Context context, xoi xoi, acvx acvx, akkq akkq, akoe akoe) {
        this.c = context;
        this.g = acvx;
        this.a = a(context);
        this.e = new akpk();
        akvz a = a(context, xoi, acvx, akkq);
        a.a(aanw.class);
        akoc a2 = akoe.a((akpb) a.get());
        a2.a(this.e);
        a().setAdapter(a2);
    }

    public final void h() {
        throw null;
    }

    public final void j() {
        throw null;
    }

    public View a(Context context) {
        ListView listView = new ListView(context);
        listView.setId(R.id.account_list);
        return listView;
    }

    /* Access modifiers changed, original: protected */
    public ListView a() {
        return (ListView) this.a;
    }

    /* Access modifiers changed, original: protected */
    public akpk b() {
        return this.e;
    }

    public akvz a(Context context, xoi xoi, acvx acvx, akkq akkq) {
        return new uxz(context, xoi, acvx, akkq.c(), this, this, this);
    }

    public final void k() {
        this.e.clear();
        b().clear();
        c();
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        this.e.add(this.d);
        this.e.add(this.b);
    }

    public final void a(uta uta) {
        this.e.clear();
        b().clear();
        akpk akpk = this.e;
        akpk b = b();
        aanw aanw = uta.b;
        int i = 0;
        for (aanx b2 : aanw.a()) {
            if (b2.b() != null) {
                i++;
            }
        }
        Throwable th = null;
        Iterable iterable = null;
        for (aanx aanx : aanw.a()) {
            if (i > 1) {
                aanu b3 = aanx.b();
                if (b3 != null) {
                    if (iterable == null) {
                        iterable = new ArrayList();
                    }
                    iterable.add(b3.b);
                }
            }
            akpk.addAll(aanx.a());
        }
        b.addAll(aanw.b());
        if (i > 1) {
            if (iterable != null) {
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    Throwable th2 = (Throwable) it.next();
                    if (th2 != null) {
                        Class cls = th2.getClass();
                        while (it.hasNext()) {
                            if (!cls.equals(((Throwable) it.next()).getClass())) {
                                break;
                            }
                        }
                        th = th2;
                    }
                }
            }
            akpk.add(aanu.a(th));
        }
        d();
        for (aaof aaof : uta.a) {
            this.g.a(aaof.a.c);
        }
    }

    /* Access modifiers changed, original: protected */
    public void d() {
        this.e.add(this.b);
    }

    public final void a(String str) {
        xpr.a(this.c, (CharSequence) str, 1);
    }

    public final void a(aanv aanv) {
        uza uza = this.f;
        if (uza != null) {
            uza.a(aanv);
        }
    }

    public final void a(aanu aanu) {
        uza uza = this.f;
        if (uza != null) {
            uza.a(aanu);
        }
    }

    public final void i() {
        uza uza = this.f;
        if (uza != null) {
            uza.i();
        }
    }

    public final void g() {
        uza uza = this.f;
        if (uza != null) {
            uza.g();
        }
    }
}
