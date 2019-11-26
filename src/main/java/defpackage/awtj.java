package defpackage;

/* renamed from: awtj */
public final class awtj extends anxl implements anzf {
    public static final awtj c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private awtj() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000┛㐚\u0004\u0000\u0000\u0003┛м\u0000┛м\u0000〧м\u0000㐚<\u0000", new Object[]{"b", "a", aouo.class, atvd.class, apaa.class, atuv.class});
            case 3:
                return new awtj();
            case 4:
                return new awtl();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awtj.class) {
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
        awtj awtj = new awtj();
        c = awtj;
        anxl.registerDefaultInstance(awtj.class, awtj);
    }
}
