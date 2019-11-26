package defpackage;

/* renamed from: dhq */
public final class dhq extends anxl implements anzf {
    public static final dhq d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();

    private dhq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"a", "b", "c", dho.class});
            case 3:
                return new dhq();
            case 4:
                return new dht();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (dhq.class) {
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
        dhq dhq = new dhq();
        d = dhq;
        anxl.registerDefaultInstance(dhq.class, dhq);
    }
}
