package defpackage;

/* renamed from: awwq */
public final class awwq extends anxl implements anzf {
    public static final awwq f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public apxu d;
    public axak e;
    private byte g = (byte) 2;

    private awwq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002м\u0000\u0005Љ\u0005\u0006м\u0000", new Object[]{"c", "b", "a", "d", azaj.class, "e", aybw.class});
            case 3:
                return new awwq();
            case 4:
                return new awws();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awwq.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awwq awwq = new awwq();
        f = awwq;
        anxl.registerDefaultInstance(awwq.class, awwq);
    }
}
