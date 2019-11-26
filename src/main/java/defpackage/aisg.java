package defpackage;

import android.util.Pair;

/* renamed from: aisg */
public final class aisg {
    private final Pair a;

    public aisg(anjv anjv, amqp amqp) {
        this.a = Pair.create(anjv, amqp);
    }

    public final anjv a() {
        return (anjv) this.a.first;
    }

    public final amqp b() {
        return (amqp) this.a.second;
    }
}
