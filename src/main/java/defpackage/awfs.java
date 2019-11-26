package defpackage;

/* renamed from: awfs */
public final class awfs extends anxl implements anzf {
    public static final awfs c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private awfs() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ﮧ㴸䝐\u0002\u0000\u0000\u0002ﮧ㴸м\u0000䝐м\u0000", new Object[]{"b", "a", awfq.class, arcu.class});
            case 3:
                return new awfs();
            case 4:
                return new awfv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awfs.class) {
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
        awfs awfs = new awfs();
        c = awfs;
        anxl.registerDefaultInstance(awfs.class, awfs);
    }
}
