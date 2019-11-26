package defpackage;

/* renamed from: akqi */
final /* synthetic */ class akqi implements amqv {
    public static final amqv a = new akqi();

    private akqi() {
    }

    public final boolean a(Object obj) {
        akqs akqs = (akqs) obj;
        boolean z = false;
        if (akqs != null) {
            if (!akqs.a.isEmpty()) {
                z = true;
            } else if (akqs.b.isEmpty()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }
}
