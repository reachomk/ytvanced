package defpackage;

import java.io.IOException;

/* renamed from: aadx */
public final class aadx {
    private final arfu a;

    aadx() {
        this.a = (arfu) arfv.b.createBuilder();
    }

    public aadx(arfu arfu) {
        this.a = arfu;
    }

    public final aadx a(String str, anze anze) {
        Object a = alux.a();
        amqw.a((Object) str);
        amqw.a((Object) anze);
        amqw.a(a);
        try {
            arfu arfu = this.a;
            anvu a2 = anvu.a(a.a(anze));
            if (a2 != null) {
                arfu.copyOnWrite();
                arfv arfv = (arfv) arfu.instance;
                anyy anyy = arfv.a;
                if (!anyy.a) {
                    arfv.a = anyy.a();
                }
                arfv.a.put(str, a2);
                return this;
            }
            throw new NullPointerException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final aadu a() {
        return new aadu((arfv) ((anxl) this.a.build()));
    }
}
