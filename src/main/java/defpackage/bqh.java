package defpackage;

/* renamed from: bqh */
public final class bqh {
    public final Object a;
    public final bpz b;
    public final bqn c;

    public static bqh a(Object obj, bpz bpz) {
        return new bqh(obj, bpz);
    }

    public static bqh a(bqn bqn) {
        return new bqh(bqn);
    }

    public final boolean a() {
        return this.c == null;
    }

    private bqh(Object obj, bpz bpz) {
        this.a = obj;
        this.b = bpz;
        this.c = null;
    }

    private bqh(bqn bqn) {
        this.a = null;
        this.b = null;
        this.c = bqn;
    }
}
