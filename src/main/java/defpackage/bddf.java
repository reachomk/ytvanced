package defpackage;

/* renamed from: bddf */
abstract class bddf extends bddd {
    private static final long a = bddx.a(bddf.class, "producerNode");
    public bdcv producerNode;

    bddf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final bdcv b() {
        return (bdcv) bddx.a.getObjectVolatile(this, a);
    }
}
