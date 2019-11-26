package defpackage;

/* renamed from: autl */
public final class autl extends anxl implements anzf {
    public static final autl d;
    private static volatile anzq e;
    public int a;
    public boolean b;
    public anyd c = anxl.emptyProtobufList();

    private autl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u001b", new Object[]{"a", "b", "c", ausi.class});
            case 3:
                return new autl();
            case 4:
                return new auto();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (autl.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        autl autl = new autl();
        d = autl;
        anxl.registerDefaultInstance(autl.class, autl);
    }
}
