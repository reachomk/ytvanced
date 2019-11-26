package defpackage;

/* renamed from: axgw */
public final class axgw extends anxl implements anzf {
    public static final axgw c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axgw() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ﰕẘﵺ嫭\u0002\u0000\u0000\u0002ﰕẘм\u0000ﵺ嫭м\u0000", new Object[]{"b", "a", axgu.class, axgs.class});
            case 3:
                return new axgw();
            case 4:
                return new axgz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axgw.class) {
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
        axgw axgw = new axgw();
        c = axgw;
        anxl.registerDefaultInstance(axgw.class, axgw);
    }
}
