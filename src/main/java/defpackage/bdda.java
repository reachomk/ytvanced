package defpackage;

/* renamed from: bdda */
abstract class bdda extends bddc {
    private static final long a = bddx.a(bdda.class, "consumerNode");
    public bdcv consumerNode;

    bdda() {
    }

    /* Access modifiers changed, original: protected|final */
    public final bdcv a() {
        return (bdcv) bddx.a.getObjectVolatile(this, a);
    }
}
