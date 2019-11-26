package defpackage;

/* renamed from: bddi */
abstract class bddi extends bdde {
    private static final Integer b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    public bddi(int i) {
        super(i);
        Math.min(i / 4, b.intValue());
    }
}
