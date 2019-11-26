package defpackage;

/* renamed from: axgo */
public final class axgo extends anxl implements anzf {
    public static final axgo c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axgo() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000Ẑ䐄\u0004\u0000\u0000\u0004Ẑм\u0000ￌ䉥м\u0000䐄м\u0000䐄м\u0000", new Object[]{"b", "a", aqhy.class, axhc.class, ayox.class, aypb.class});
            case 3:
                return new axgo();
            case 4:
                return new axgr();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axgo.class) {
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
        axgo axgo = new axgo();
        c = axgo;
        anxl.registerDefaultInstance(axgo.class, axgo);
    }
}
