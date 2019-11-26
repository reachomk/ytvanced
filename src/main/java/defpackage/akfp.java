package defpackage;

/* renamed from: akfp */
final /* synthetic */ class akfp implements amqv {
    public static final amqv a = new akfp();

    private akfp() {
    }

    public final boolean a(Object obj) {
        Float f = (Float) obj;
        return f.floatValue() >= 0.0f && f.floatValue() <= 1.0f;
    }
}
