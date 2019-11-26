package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import java.util.List;

/* renamed from: akty */
public abstract class akty extends aktw implements xcp {
    private final xci a;
    private final aknc b;
    private final akpk c;
    public final akao d;
    public final akoh e;
    public final akpk f;
    public final akpk g;
    public final akpk h;
    public boolean i;
    public int j;
    public final amqp k;
    public final List l;
    public final akxm m;
    private final akvg n;
    private final akvh o;
    private boolean p;
    private final akvj q;
    private final akvi r;
    private final int s;
    private final CharSequence t;
    private final apxu u;
    private final akuc v;

    public akty(akvz akvz, xci xci, akao akao, aoca[] aocaArr, int i, akvj akvj, amqp amqp, CharSequence charSequence, apxu apxu, akxt akxt, akyd akyd) {
        this(akvz, xci, akao, aocaArr, i, akvj, amqp, charSequence, apxu, akxt, akyd, akub.a);
    }

    public Class[] a(Class cls, Object obj, int i) {
        return akuj.a(this, obj, i);
    }

    /* Access modifiers changed, original: protected */
    public boolean b() {
        return false;
    }

    public abstract Class d();

    /* Access modifiers changed, original: protected */
    public void e() {
    }

    /* Access modifiers changed, original: protected */
    public void f() {
    }

    public akty(akvz akvz, xci xci, akao akao, aoca[] aocaArr, int i, akvj akvj, amqp amqp, CharSequence charSequence, apxu apxu, akxt akxt, akyd akyd, akuc akuc) {
        amqw.a((Object) akvz);
        amqw.a((Object) aocaArr);
        amqw.a((Object) amqp);
        this.a = (xci) amqw.a((Object) xci);
        this.d = (akao) amqw.a((Object) akao);
        this.s = i;
        this.k = amqp;
        this.e = new akoh();
        this.f = new akpk();
        this.g = new akpk();
        this.b = new aknc(this.g);
        this.c = new akpk();
        this.h = new akpk();
        this.n = new akvg();
        this.o = new akvh();
        this.v = (akuc) amqw.a((Object) akuc);
        akvz.a(d());
        xci.a((Object) this, akty.class);
        if (akvj == null) {
            akvj = akyb.a;
        }
        this.q = akvj;
        this.r = new akua(this);
        this.q.a(this.r);
        this.j = this.q.b();
        this.t = charSequence;
        this.u = apxu;
        this.e.a(new akvl(this.q));
        this.m = new akxm();
        e();
        a(akxt);
        boolean z = true;
        if (akyd instanceof akuf) {
            akuf akuf = (akuf) akyd;
            this.l = akuf.b;
            this.i = akuf.a;
            this.p = akuf.c;
        } else {
            this.l = this.m.a((Object[]) aocaArr);
            this.p = true;
        }
        if (!this.l.isEmpty()) {
            if (this.p) {
                this.e.a(this.f);
                this.e.a(this.b);
                this.e.a(this.c);
                this.e.a(this.h);
            }
            akao akao2 = this.d;
            if (!akao2.i) {
                axak axak = akao2.n;
                if (axak != null) {
                    anxr access$000 = anxl.checkIsLite(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer);
                    axak.a(access$000);
                    if (axak.h.a(access$000.d)) {
                        akpk akpk = this.f;
                        axak = this.d.n;
                        anxr access$0002 = anxl.checkIsLite(RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer);
                        axak.a(access$0002);
                        Object b = axak.h.b(access$0002.d);
                        if (b == null) {
                            b = access$0002.b;
                        } else {
                            b = access$0002.a(b);
                        }
                        akpk.add(b);
                    }
                } else {
                    this.f.add(akao2);
                }
            }
            if (!this.i && this.l.size() > this.s) {
                z = false;
            }
            this.i = z;
            h();
            i();
            j();
            f();
        }
    }

    public final aknh a() {
        return this.e;
    }

    public void c() {
        this.a.b(this);
        this.q.b(this.r);
    }

    public akyd E_() {
        return new akuf(this.i, this.l, this.p);
    }

    public final void a(Object obj) {
        if (obj == this.d) {
            a(false);
        } else if (this.l.remove(obj)) {
            if (this.l.isEmpty()) {
                a(false);
                return;
            }
            if (this.j > 1) {
                i();
            } else {
                this.g.remove(obj);
            }
            j();
        }
    }

    public final void a(boolean z) {
        if (this.p != z) {
            this.p = z;
            if (!z || this.l.isEmpty()) {
                this.e.a();
            } else {
                this.e.a(this.f);
                this.e.a(this.b);
                this.e.a(this.c);
                this.e.a(this.h);
            }
        }
    }

    public final void a(Object obj, Object obj2) {
        int indexOf = this.l.indexOf(obj);
        if (indexOf != -1) {
            this.l.set(indexOf, obj2);
            if (this.j > 1) {
                i();
            } else {
                this.g.set(indexOf, obj2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akxt akxt) {
        this.m.a(akxt);
    }

    public final void h() {
        if (this.i) {
            this.b.b(Integer.MAX_VALUE);
            return;
        }
        int min = Math.min(this.s, this.l.size());
        int i = this.j;
        if (i > 1) {
            min = ((min + i) - 1) / i;
        }
        this.b.b(min);
    }

    public final void i() {
        this.g.clear();
        if (!this.l.isEmpty()) {
            int size = this.l.size();
            if (!(this.j == 1 || size == 1) || b()) {
                int i = this.j;
                if (i > 0) {
                    int i2 = ((size + i) - 1) / i;
                    i = 0;
                    while (i < i2) {
                        int i3 = this.j;
                        int i4 = i + 1;
                        this.g.add(this.v.a(this.j, this.l.subList(i3 * i, Math.min(i4 * i3, size)), i, i2));
                        i = i4;
                    }
                    return;
                }
                return;
            }
            this.g.addAll(this.l);
        }
    }

    public final void j() {
        int d = this.b.d();
        int size = this.g.size();
        Object obj = this.n;
        if (d < size) {
            obj.b = true;
            obj.c = new akud(this);
            this.n.d = null;
        } else if (this.u == null || TextUtils.isEmpty(this.t)) {
            obj = this.o;
        } else {
            akvg akvg = this.n;
            akvg.a = this.t;
            akvg.b = false;
            akvg.c = null;
            akvg.d = this.u;
        }
        if (this.c.isEmpty()) {
            this.c.add(obj);
        } else {
            this.c.a(0, obj);
        }
    }
}
