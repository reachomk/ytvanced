package defpackage;

/* renamed from: hak */
public final class hak {
    public final awjp a;
    public apxu b;

    public hak(awjp awjp) {
        this.a = (awjp) amqw.a((Object) awjp);
        xvd.a(awjp.b);
        boolean z = true;
        amqw.b((awjp.a & 2) != 0);
        amqw.b((awjp.a & 16) != 0);
        if ((awjp.a & 512) == 0) {
            z = false;
        }
        amqw.b(z);
    }
}
