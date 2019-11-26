package defpackage;

/* renamed from: ausq */
public final class ausq extends anxl implements anzf {
    public static final ausq g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c = 1;
    public int d;
    public int e = 1;
    public int f;

    private ausq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"a", "b", autm.a, "c", "d", "e", "f"});
            case 3:
                return new ausq();
            case 4:
                return new ausp();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ausq.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ausq ausq = new ausq();
        g = ausq;
        anxl.registerDefaultInstance(ausq.class, ausq);
    }
}
