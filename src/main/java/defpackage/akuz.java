package defpackage;

import android.content.res.Configuration;
import java.util.Collection;

/* renamed from: akuz */
public abstract class akuz extends akun implements akvy, xcp {
    public ajtf H;
    private final xci a;
    private boolean b;
    public final akpk i;
    public akwl j;
    public boolean k;
    public boolean l;

    protected akuz(aana aana, xci xci, xoi xoi, acvx acvx, akyd akyd, akpk akpk) {
        super(akyd.a(akyd), aana, xci, xci.a(), xoi, acvx);
        this.a = (xci) amqw.a((Object) xci);
        akuy akuy = new akuy(this);
        akvb akvb = new akvb(this);
        this.i = akpk;
        if (akyd instanceof akva) {
            akva akva = (akva) akyd;
            this.i.a(akva.a);
            this.k = akva.b;
            this.l = akva.c;
            this.H = akva.d;
            akwk akwk = new akwk(akva.e);
            akwk.c = akuy;
            akwk.d = akvb;
            a(akwk.a());
        } else {
            this.k = false;
            this.l = true;
            akwk a = akwl.a();
            a.b = q();
            a.c = akuy;
            a.d = akvb;
            a(a.a());
        }
        xci.a((Object) this, akuz.class, q());
        this.b = true;
    }

    public void a(Configuration configuration) {
    }

    public Class[] a(Class cls, Object obj, int i) {
        return akuj.a(this, obj, i);
    }

    public akuz(aana aana, xci xci, xoi xoi, acvx acvx) {
        this(aana, xci, xoi, acvx, null, new akpk());
    }

    public aknh a() {
        return this.i;
    }

    /* Access modifiers changed, original: protected */
    public void a(bqn bqn, ajtf ajtf) {
        super.a(bqn, ajtf);
        this.H = ajtf;
    }

    public void c() {
        super.c();
        this.a.b(this);
    }

    public akyd E_() {
        return new akva(super.E_(), this.i, this.k, this.l, this.H, this.j);
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        this.i.clear();
        n();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj) {
        b(obj, this.i.size() - d());
    }

    /* Access modifiers changed, original: protected */
    public void b(Object obj, int i) {
        boolean z = false;
        if (i >= 0 && i <= this.i.size() - d()) {
            z = true;
        }
        amqw.b(z);
        this.i.add(i, obj);
        a(this.j);
    }

    public void c(Object obj) {
        if (obj != null) {
            this.i.remove(obj);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(amqv amqv) {
        this.i.a(amqv);
    }

    public final void b(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            this.i.a(obj, obj2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Collection collection) {
        a(collection, this.i.size() - d());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Collection collection, int i) {
        this.i.addAll(i, collection);
        a(this.j);
    }

    public final void f() {
        if (this.b) {
            this.b = false;
            a(this.j);
        }
    }

    public final void a(akvf akvf) {
        a(akvf.a);
    }

    public final void a(akwl akwl) {
        if ((this.l && !this.k) || !this.b) {
            this.i.remove(this.j);
        } else if (this.i.contains(this.j)) {
            Object obj = this.j;
            if (obj != akwl) {
                this.i.a(obj, (Object) akwl);
            }
        } else {
            this.i.add(akwl);
        }
        this.j = akwl;
    }

    private final boolean d() {
        if (!this.i.isEmpty()) {
            akpk akpk = this.i;
            if (akpk.get(akpk.size() - 1) == this.j) {
                return true;
            }
        }
        return false;
    }
}
