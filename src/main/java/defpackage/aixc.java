package defpackage;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: aixc */
public final class aixc implements aixi {
    public final airv a;
    public final aisl b;
    private final Executor c;

    public aixc(airv airv, aisl aisl, Executor executor) {
        this.a = (airv) amqw.a((Object) airv);
        this.b = (aisl) amqw.a((Object) aisl);
        this.c = executor;
    }

    public final Pair a(aiqq aiqq, String str, aiqw aiqw) {
        Object obj;
        aisg a = aisf.a(aiqq, aiqw, str, new aixf(this, aiqw), new aixe(this, aiqw), this.c);
        anjv a2 = a.a();
        if (a.b().a()) {
            obj = (anjv) a.b().b();
        } else {
            obj = this.b.a(aiqq);
        }
        return Pair.create(a2, obj);
    }

    public final anjv a(aiqq aiqq) {
        return this.b.a(aiqq);
    }

    public final anjv a(String str, aiqq aiqq, aiqw aiqw) {
        aixh aixh = new aixh(this, aiqw);
        aisl aisl = this.b;
        aisl.getClass();
        return aisf.a(aiqq, aiqw, str, aixh, new aixg(aisl), this.c).a();
    }

    public final anjv a(aiqq aiqq, String str, int i, aiqw aiqw) {
        this.a.a(aiqq, i);
        return this.a.a(aiqq, str, i, null, null, true, aiqw);
    }
}
