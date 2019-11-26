package defpackage;

/* renamed from: afcz */
final class afcz implements aemt {
    public final aemq b;
    public final aemq c;

    public afcz(aemq aemq, aemq aemq2) {
        this.b = (aemq) amqw.a((Object) aemq);
        this.c = (aemq) amqw.a((Object) aemq2);
    }

    public final void a(aepc aepc, int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.c.a(aepc.d, aepc.e, aepc.j, aepc.b);
            } else if (i2 == 1) {
                this.b.a(aepc.d, aepc.e, aepc.j, aepc.b);
                return;
            }
            return;
        }
        throw null;
    }
}
