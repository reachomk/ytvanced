package defpackage;

import java.util.List;

/* renamed from: anin */
abstract class anin extends anig {
    private List d;
    private final /* synthetic */ anio e;

    anin(anio anio, amuh amuh) {
        List g;
        this.e = anio;
        super(anio, amuh, true);
        if (amuh.isEmpty()) {
            g = amul.g();
        } else {
            g = amvj.a(amuh.size());
        }
        this.d = g;
        for (int i = 0; i < amuh.size(); i++) {
            this.d.add(null);
        }
    }

    public abstract Object a(List list);

    /* Access modifiers changed, original: final */
    public final void a(boolean z, int i, Object obj) {
        List list = this.d;
        if (list != null) {
            list.set(i, amqp.c(obj));
        } else {
            amqw.b(this.e.isCancelled(), (Object) "Future was done before all dependencies completed");
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        List list = this.d;
        if (list != null) {
            this.e.a_(a(list));
        } else {
            amqw.b(this.e.isDone());
        }
    }
}
