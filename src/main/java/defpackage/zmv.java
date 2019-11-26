package defpackage;

/* renamed from: zmv */
final /* synthetic */ class zmv implements zmo {
    private final zmt a;
    private final zmq b;

    zmv(zmt zmt, zmq zmq) {
        this.a = zmt;
        this.b = zmq;
    }

    public final void a() {
        zmt zmt = this.a;
        zmq zmq = this.b;
        synchronized (zmt.c) {
            zmt.c.remove(zmq);
        }
    }
}
