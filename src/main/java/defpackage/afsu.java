package defpackage;

/* renamed from: afsu */
public final class afsu implements afsw {
    private final afsw a;
    private boolean b;

    public afsu(afsw afsw) {
        this.a = (afsw) amqw.a((Object) afsw);
    }

    public final void a() {
        this.b = true;
    }

    public final void a(bqn bqn) {
        if (!this.b) {
            this.a.a(bqn);
        }
    }

    public final void a(Object obj) {
        if (!this.b) {
            this.a.a(obj);
        }
    }
}
