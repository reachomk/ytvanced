package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: wel */
public final class wel extends akwe implements xcp {
    public int a;
    private final wdn b;
    private final akxm c = new akxm();
    private ajws d;
    private Object e;

    public wel(akvz akvz, xci xci, xoi xoi, wdn wdn, akdk akdk, aana aana, acvx acvx) {
        super(aana, akvz, xci, xoi, acvx, null);
        this.b = (wdn) amqw.a((Object) wdn);
        this.i.a(new wdu(wdn));
        this.c.a(new akwc());
        if (akdk != null) {
            a((akxt) akdk);
            this.c.a((akxt) akdk);
        }
    }

    public final akyd E_() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn, ajtf ajtf) {
        d();
        super.a(bqn, ajtf);
    }

    private final void d() {
        if (this.a != 0) {
            boolean z = true;
            int i = this.d == null ? 0 : 1;
            if (i >= this.i.d() || !(this.i.c(i) instanceof wkz)) {
                z = false;
            }
            amqw.b(z);
            this.i.a(i, this.a);
            this.a = 0;
        }
    }

    public final void a(Object obj, int i) {
        b(obj, i + (this.d == null ? 0 : 1));
    }

    public final void b() {
        super.b();
        this.d = null;
        this.e = null;
        this.a = 0;
    }

    public final void a(awzv awzv) {
        n();
        int d = this.i.d();
        if (d != 0) {
            if (this.d == null) {
                b();
            } else if (d > 1) {
                this.i.a(1, d - 1);
            }
        }
        a(ajtj.a(awzv));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aafj aafj, ajti ajti) {
        d();
        super.a(aafj, ajti);
    }

    public final void a(aafj aafj) {
        this.b.a();
        c(aafj);
        if (this.d != null) {
            Object e = e();
            if (!(e instanceof arbs) && (e instanceof ajsw) && ((ajsw) e).h && aafj.a().isEmpty()) {
                a(1);
                b(aafj.b());
            }
        }
        a(this.c.a(aafj.a.b));
        b(aafj.b());
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(aafj aafj) {
        c(aafj);
        super.b(aafj);
    }

    private final void c(aafj aafj) {
        ajws ajws = aafj.a.d;
        if (ajws != null) {
            Object obj = ajws.d;
            if (obj == null) {
                Object obj2 = ajws.c;
                if (obj2 != null) {
                    if (this.d == null) {
                        b(obj2, 0);
                    } else {
                        b(e(), obj2);
                    }
                    ajws ajws2 = new ajws();
                    ajws2.c = obj2;
                    this.d = ajws2;
                    this.e = obj2;
                }
                return;
            }
            if (this.d == null) {
                b(obj, 0);
            } else {
                b(e(), obj);
            }
            ajws = new ajws();
            ajws.d = obj;
            this.d = ajws;
            this.e = obj;
        }
    }

    private final Object e() {
        Object obj = this.e;
        if (obj == null) {
            ajws ajws = this.d;
            if (ajws != null) {
                arbs arbs = ajws.d;
                return arbs == null ? ajws.c : arbs;
            } else {
                obj = null;
            }
        }
        return obj;
    }

    private final void a(List list) {
        n();
        int d = this.i.d();
        int i = this.d != null ? 1 : 0;
        int i2 = d - i;
        int min = Math.min(list.size(), i2);
        for (int i3 = 0; i3 < min; i3++) {
            b(this.i.c(i3 + i), list.get(i3));
        }
        if (i2 < list.size()) {
            a(list.subList(i2, list.size()));
        } else if (i2 > list.size()) {
            this.i.a(list.size() + i, (d - list.size()) - i);
        }
    }

    public final void a(int i) {
        amqw.b(this.a == 0);
        wdn wdn = this.b;
        wdn.a();
        wdn.c = -1;
        List linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            linkedList.add(new wkz(i2));
        }
        a(linkedList);
        this.a = i;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != wel.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{zyg.class, zyp.class, aaxd.class, akwd.class};
        } else if (i == 0) {
            a((zyg) obj);
        } else if (i == 1) {
            a((zyp) obj);
        } else if (i == 2) {
            a((aaxd) obj);
        } else if (i == 3) {
            a((akwd) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
