package defpackage;

/* renamed from: agxe */
public final /* synthetic */ class agxe implements xar {
    private final agwu a;

    public agxe(agwu agwu) {
        this.a = agwu;
    }

    public final void accept(Object obj) {
        agwu agwu = this.a;
        amqp amqp = (amqp) obj;
        if (amqp != null && amqp.a()) {
            ((agwc) agwu.d.get()).b().k().b(((agqy) amqp.b()).a(), 0);
        }
    }
}
