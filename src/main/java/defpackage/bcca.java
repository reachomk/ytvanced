package defpackage;

/* renamed from: bcca */
public final class bcca extends anxl implements anzf {
    public static final bcca b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private bcca() {
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = anxl.mutableCopy(this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bcbw.class});
            case 3:
                return new bcca();
            case 4:
                return new bcbz();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (bcca.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcca bcca = new bcca();
        b = bcca;
        anxl.registerDefaultInstance(bcca.class, bcca);
    }
}
