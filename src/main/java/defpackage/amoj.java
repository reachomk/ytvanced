package defpackage;

/* renamed from: amoj */
public final class amoj extends anxl implements anzf {
    public static final amoj d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public amoz c;

    private amoj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0000\u0003\u0000\u0000\u0002\u0007\u0003\u0000\u0001\u0000\u0002\u001b\u0004\f\u0007\t", new Object[]{"b", ampb.class, "a", "c"});
            case 3:
                return new amoj();
            case 4:
                return new amom();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (amoj.class) {
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
        amoj amoj = new amoj();
        d = amoj;
        anxl.registerDefaultInstance(amoj.class, amoj);
    }
}
