package defpackage;

/* renamed from: akwc */
public final class akwc implements akxt {
    private static final amqv b = new akwf();
    private final amqp a;

    public akwc() {
        this(ampo.a);
    }

    public final boolean b() {
        return false;
    }

    public akwc(amqp amqp) {
        this.a = (amqp) amqw.a((Object) amqp);
    }

    public final amqv a() {
        return b;
    }

    public final /* synthetic */ void a(Object obj, akxs akxs) {
        ajww ajww = (ajww) obj;
        akao akao = ajww.l;
        if (akao != null) {
            akan akan = akao.d;
            if (akan != null) {
                if (akan.a != null) {
                    akxs.a(new aafg(akao));
                } else if (akan.c != null) {
                    akxs.a(new aafs(akao));
                    return;
                }
            }
        }
        obj = aafi.a(ajww);
        if (obj != null) {
            akxs.a(akuk.a(this.a, obj));
        }
    }
}
