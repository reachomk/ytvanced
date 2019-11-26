package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aktq */
public abstract class aktq extends akvd implements akwm, akxv, OnClickListener {
    private final List a = new ArrayList();
    private final Map b = new HashMap();
    private final akwb c;
    public final akoh d = new akoh();
    public final akos e;
    public final List f = new ArrayList();
    public final xci g;
    public final aktt h;
    public aknh i;
    public aknh j;
    public boolean k;
    public ajtf l;
    public Runnable m;
    private final akxw o;
    private final akxj p;
    private final List q = new ArrayList();
    private boolean r;
    private boolean t;
    private boolean u;
    private ajtf v;

    public aktq(akyd akyd, akos akos, akwn akwn, aana aana, xci xci, akwb akwb, xoi xoi, acvx acvx, akxw akxw, akxj akxj) {
        akyd akyd2 = akyd;
        akos akos2 = akos;
        super(akyd.a(akyd), aana, xci, xci.a(), xoi, acvx);
        this.e = (akos) amqw.a((Object) akos);
        this.g = (xci) amqw.a((Object) xci);
        this.c = (akwb) amqw.a((Object) akwb);
        this.o = (akxw) amqw.a((Object) akxw);
        this.p = (akxj) amqw.a((Object) akxj);
        akwn akwn2 = akwn;
        this.h = new aktt(this, akwn);
        if (akyd2 instanceof akts) {
            akts akts = (akts) akyd2;
            a(akts.a, akts.b);
            this.h.a(akts.c);
            this.v = akts.d;
        }
        akos.a(this.d);
        akos.a(new akod(acvx));
        akos.a(new akxx(this));
        akos.a(this.h);
        this.h.a(this.E, null);
    }

    /* Access modifiers changed, original: protected */
    public void a(akab akab) {
    }

    public abstract void a(Bundle bundle);

    public boolean a(aafn aafn, Bundle bundle) {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(akuu akuu) {
        return true;
    }

    public abstract void b();

    public abstract void b(int i);

    public void f() {
        throw null;
    }

    public abstract View i();

    public final void a(akoq akoq) {
        this.e.a(akoq);
    }

    public final aknh j() {
        return this.d;
    }

    public final void a(aknh aknh) {
        aknh aknh2 = this.i;
        if (aknh2 != aknh) {
            if (aknh2 != null) {
                this.d.c(aknh2);
            }
            this.i = aknh;
            if (aknh != null && this.k) {
                this.d.b(aknh);
            }
        }
    }

    public final void b(aknh aknh) {
        aknh aknh2 = this.j;
        if (aknh2 != aknh) {
            if (aknh2 != null) {
                this.d.c(aknh2);
            }
            this.j = aknh;
            if (aknh != null) {
                this.d.a(aknh);
            }
        }
    }

    public void d() {
        for (akxu a : this.q) {
            a.a();
        }
        boolean z = this.r;
        if (!z || this.t) {
            this.r = true;
            if ((z ^ 1) != 0) {
                b();
            }
            if (this.f.isEmpty() && b(ajti.RELOAD)) {
                a(ajti.RELOAD);
                this.t = false;
            }
            if (this.t) {
                H_();
                this.t = false;
            }
        }
    }

    public void e() {
        this.t = true;
    }

    public final void k() {
        a(true);
    }

    public final void l() {
        aktt aktt = this.h;
        if (aktt.a != null) {
            if (aktt.b == null) {
                aktt.b = aktt.b(new akuu());
                aktt.a.a(aktt.b);
            }
            aktq aktq = aktt.c;
            aktq.d.a(aktq.o(), aktt.a);
        }
    }

    public final void a(akxu akxu) {
        this.q.add(akxu);
    }

    public final void b(akxu akxu) {
        this.q.remove(akxu);
    }

    public final void a(boolean z) {
        int i = 0;
        this.k = false;
        if (z) {
            if (this.i != null) {
                i = 1;
            }
            if (this.u) {
                i++;
            }
        }
        if (i > 0) {
            akoh akoh = this.d;
            int size = akoh.a.size() - 1;
            xak.a();
            if (!akoh.a.isEmpty() && i <= size && size < akoh.a.size()) {
                int b = ((akog) akoh.a.get(size)).b();
                int i2 = ((akog) akoh.a.get(i)).b;
                while (size >= i) {
                    akoh.b(size);
                    size--;
                }
                akoh.c();
                b -= i2;
                if (b > 0) {
                    akoh.d(i2, b);
                }
            }
        } else {
            this.d.a();
        }
        this.m = null;
        aknh aknh = this.j;
        if (aknh != null) {
            this.d.a(aknh);
        }
        g();
        this.f.clear();
        this.a.clear();
        this.b.clear();
        b(null);
        n();
        for (akxu b2 : this.q) {
            b2.b();
        }
    }

    public final void m() {
        for (akxu e : this.q) {
            e.e();
        }
    }

    public final void a(awzv awzv) {
        f();
        this.h.b();
        a(ajtj.a(awzv));
    }

    public final void a(aafn aafn) {
        a(aafn, null);
    }

    public final void b(aafn aafn) {
        b(aafn, null);
    }

    public final void b(aafn aafn, Bundle bundle) {
        a(aafn, bundle);
        d();
    }

    public final void n() {
        super.n();
        this.l = null;
        aktt aktt = this.h;
        akwl akwl = aktt.b;
        if (akwl != null) {
            aktt.a(akwl.a);
        }
        akwn akwn = aktt.a;
        if (akwn != null) {
            akwn.clear();
        }
        aktt.b = null;
    }

    public final void c(aafn aafn) {
        if (aafn != null) {
            int i = this.k ^ 1;
            if (aafn.b == null) {
                aafn.b = new ArrayList(aafn.a.c.length);
                for (axfd axfd : aafn.a.c) {
                    int i2 = axfd.a;
                    List list;
                    Object obj;
                    if ((i2 & 1) != 0) {
                        list = aafn.b;
                        obj = axfd.b;
                        if (obj == null) {
                            obj = avkc.f;
                        }
                        list.add(ajtj.a(obj));
                    } else if ((i2 & 2) != 0) {
                        list = aafn.b;
                        obj = axfd.c;
                        if (obj == null) {
                            obj = awnh.d;
                        }
                        list.add(ajtj.a(obj));
                    } else if ((i2 & 4) != 0) {
                        list = aafn.b;
                        obj = axfd.d;
                        if (obj == null) {
                            obj = awzv.d;
                        }
                        list.add(ajtj.a(obj));
                    } else if ((i2 & 16) != 0) {
                        list = aafn.b;
                        obj = axfd.f;
                        if (obj == null) {
                            obj = ayhc.e;
                        }
                        list.add(ajtj.a(obj));
                    } else if ((i2 & 8) != 0) {
                        list = aafn.b;
                        obj = axfd.e;
                        if (obj == null) {
                            obj = atuj.f;
                        }
                        list.add(ajtj.a(obj));
                    }
                }
            }
            super.b(aafn.b);
            p();
            if (i != 0) {
                this.u = false;
                a(aafn.a);
            }
            a(aafn.a(), null);
            for (akxu a : this.q) {
                a.a(aafn, i);
            }
        }
    }

    private final void a(List list, List list2) {
        if (!this.k) {
            aknh aknh = this.i;
            if (aknh != null && this.d.d(aknh) == -1) {
                this.d.b(this.i);
            }
        }
        Iterator it = list2 != null ? list2.iterator() : null;
        for (Object next : list) {
            akyd akyd = (it == null || !it.hasNext()) ? null : (akyd) it.next();
            a(next, akyd);
        }
        this.h.b();
        aknh aknh2 = this.j;
        if (aknh2 != null && this.d.d(aknh2) == -1) {
            this.d.a(this.j);
        }
        this.k = true;
    }

    public final int o() {
        int d = this.d.d(this.h.a);
        return d == -1 ? this.d.d(this.j) : d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj) {
        a(obj, null);
    }

    private final void a(Object obj, akyd akyd) {
        akvy a = this.c.a(obj, akyd, this);
        if (a != null) {
            this.f.add(a);
            this.a.add(obj);
            this.d.a(o(), a.a());
            CharSequence charSequence = obj instanceof aafj ? ((aafj) obj).a.f : null;
            if (!TextUtils.isEmpty(charSequence)) {
                this.b.put(charSequence, a);
            }
            if (!b(ajti.NEXT) && (a instanceof akun)) {
                b((akun) a);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj) {
        this.u = true;
        a(obj);
    }

    private final void b(akun akun) {
        akun akun2 = this.a_;
        Object obj = null;
        if (akun2 != null) {
            akun2.L = null;
        }
        this.a_ = akun;
        akun2 = this.a_;
        if (akun2 != null) {
            akun2.L = this.L;
        }
        if (akun != null) {
            obj = akun.q();
        }
        this.h.a(this.E, obj);
        akun = this.a_;
        if ((akun instanceof akuz) && akun.b(ajti.NEXT)) {
            ((akuz) akun).f();
        }
    }

    public final void onClick(View view) {
        a(ajti.NEXT);
    }

    public final void G_() {
        ajtf ajtf = this.v;
        if (ajtf != null) {
            a(ajtf);
            this.v = null;
        }
    }

    public void c() {
        super.c();
        this.m = null;
        g();
        this.h.a();
        for (akxu f : this.q) {
            f.f();
        }
    }

    private final void g() {
        for (akvy c : this.f) {
            c.c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void p() {
        if (ap_()) {
            this.p.a(1);
        } else {
            this.p.a(3);
        }
    }

    public final void a(String str, Runnable runnable) {
        akvy a = a(str);
        if (a != null) {
            int e = this.d.e(a.a());
            if (e >= 0) {
                this.m = runnable;
                b(e);
            }
        }
    }

    public final akvy a(String str) {
        return (akvy) this.b.get(str);
    }

    public final boolean ap_() {
        return b(ajti.RELOAD) || this.o.ap_();
    }

    public void H_() {
        if (b(ajti.RELOAD)) {
            s();
        } else if (this.o.ap_()) {
            this.o.H_();
        } else {
            this.p.a(1);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn, ajtf ajtf) {
        super.a(bqn, ajtf);
        this.v = ajtf;
    }

    public akyd E_() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (akvy E_ : this.f) {
            arrayList.add(E_.E_());
        }
        akyd E_2 = super.E_();
        List list = this.a;
        akwl akwl = this.h.b;
        return new akts(E_2, list, arrayList, akwl != null ? akwl.a : null, this.v);
    }
}
