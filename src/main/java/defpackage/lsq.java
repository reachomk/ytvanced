package defpackage;

import java.util.List;

/* renamed from: lsq */
public final class lsq extends akun implements akwm {
    private final xoi a;
    private final akpk b;
    private akwl c;

    public lsq(aana aana, xci xci, Object obj, xoi xoi, acvx acvx, akpk akpk) {
        super(aana, xci, obj, xoi, acvx);
        this.a = xoi;
        this.b = (akpk) amqw.a((Object) akpk);
    }

    public final void a(List list) {
        super.b(list);
    }

    public final void a(ajti ajti) {
        if (b(ajti)) {
            a(new akuu());
            super.a(ajti);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn, ajtf ajtf) {
        super.a(bqn, ajtf);
        a(new akuv(this.a.b(bqn), ajtf));
    }

    public final void G_() {
        a(ajti.NEXT);
    }

    private final void a(akux akux) {
        if (b(ajti.NEXT)) {
            akwl a;
            akwl akwl = this.c;
            if (akwl == null) {
                akwk a2 = akwl.a();
                a2.a = akux;
                a2.b = this.E;
                a2.d = this;
                a = a2.a();
            } else {
                a = akwl.a(akux);
            }
            a(a);
            return;
        }
        a(null);
    }

    private final void a(akwl akwl) {
        Object obj = this.c;
        if (obj != akwl) {
            if (obj == null || akwl == null) {
                this.b.remove(obj);
                if (akwl != null) {
                    this.b.add(akwl);
                }
            } else {
                this.b.a(obj, (Object) akwl);
            }
            this.c = akwl;
        }
    }
}
