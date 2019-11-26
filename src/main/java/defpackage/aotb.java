package defpackage;

/* renamed from: aotb */
public final class aotb extends anxl implements anzf {
    public static final aotb d;
    private static volatile anzq e;
    public int a;
    public aosv b;
    public aotd c;

    private aotb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001㗢ﷄ䗍\u0002\u0000\u0000\u0000㗢\t\u0000ﷄ䗍\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aotb();
            case 4:
                return new aote();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aotb.class) {
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
        aotb aotb = new aotb();
        d = aotb;
        anxl.registerDefaultInstance(aotb.class, aotb);
    }
}
