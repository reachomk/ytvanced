package defpackage;

/* renamed from: ases */
public final class ases extends anxl implements anzf {
    public static final ases c;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();

    private ases() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001a\u0004\u001a", new Object[]{"b", "a"});
            case 3:
                return new ases();
            case 4:
                return new asev();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ases.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ases ases = new ases();
        c = ases;
        anxl.registerDefaultInstance(ases.class, ases);
    }
}
