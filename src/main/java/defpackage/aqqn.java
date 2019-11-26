package defpackage;

/* renamed from: aqqn */
public final class aqqn extends anxl implements anzf {
    public static final aqqn c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aqqn() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000㢄ﶭ愤\u0003\u0000\u0000\u0003㢄м\u0000ﰏ娘м\u0000ﶭ愤м\u0000", new Object[]{"b", "a", apcl.class, apcj.class, awmi.class});
            case 3:
                return new aqqn();
            case 4:
                return new aqqp();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqqn.class) {
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
        aqqn aqqn = new aqqn();
        c = aqqn;
        anxl.registerDefaultInstance(aqqn.class, aqqn);
    }
}
