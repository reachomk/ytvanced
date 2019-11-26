package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aald */
public final class aald {
    public static final aald a = new aald(aalc.a, aalf.a, new xaj());
    public final zzo b;
    public final bcaa c;
    public final Executor d;

    public aald(zzo zzo, bcaa bcaa, Executor executor) {
        this.b = zzo;
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.d = (Executor) amqw.a((Object) executor);
    }

    public final void a(aocf aocf) {
        this.d.execute(new aale(this, aocf));
    }
}
