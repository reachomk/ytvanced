package defpackage;

/* renamed from: aryv */
public final class aryv extends anxl implements anzf {
    public static final aryv c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aryv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000㝑嵥\u0003\u0000\u0000\u0003㝑м\u0000宅凞м\u0000嵥м\u0000", new Object[]{"b", "a", aryn.class, aryl.class, arhr.class});
            case 3:
                return new aryv();
            case 4:
                return new aryx();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aryv.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        aryv aryv = new aryv();
        c = aryv;
        anxl.registerDefaultInstance(aryv.class, aryv);
    }
}
