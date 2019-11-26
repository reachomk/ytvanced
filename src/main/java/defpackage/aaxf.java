package defpackage;

/* renamed from: aaxf */
public final class aaxf extends aanf {
    private final aang a;

    protected aaxf() {
        this.a = null;
    }

    public aaxf(aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.a = a(atqs.d, aamf, aaxe.a, aaxh.a);
    }

    public final atqs a(aaxg aaxg) {
        return (atqs) this.a.b(aaxg);
    }

    public static atqo a(aahr aahr) {
        atqn atqn = (atqn) atqo.e.createBuilder();
        int b = aahr.b();
        atqn.copyOnWrite();
        atqo atqo = (atqo) atqn.instance;
        atqo.a |= 1;
        atqo.b = b;
        long C = aahr.C();
        atqn.copyOnWrite();
        atqo atqo2 = (atqo) atqn.instance;
        atqo2.a |= 4;
        atqo2.d = C;
        String t = aahr.t();
        if (t != null) {
            atqn.copyOnWrite();
            atqo atqo3 = (atqo) atqn.instance;
            atqo3.a |= 2;
            atqo3.c = t;
        }
        return (atqo) ((anxl) atqn.build());
    }

    public final aaxg a(atqp atqp, amqp amqp) {
        return new aaxg(this.c, this.d.c(), atqp, (byte[]) amqp.a(zzp.b));
    }
}
