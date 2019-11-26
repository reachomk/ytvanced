package defpackage;

import android.util.Pair;

/* renamed from: str */
final class str implements bbnv {
    private final amur a;

    public str(amur amur) {
        this.a = amur;
    }

    public final /* synthetic */ Object a(Object obj) {
        Object[] objArr = (Object[]) obj;
        amuu e = amur.e();
        for (Object obj2 : objArr) {
            Pair pair = (Pair) obj2;
            String str = (String) pair.first;
            e.b(str, (byte[]) ((amqp) pair.second).a((byte[]) amqw.a((byte[]) this.a.get(str))));
        }
        return e.b();
    }
}
