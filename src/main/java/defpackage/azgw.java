package defpackage;

/* renamed from: azgw */
public final class azgw extends anxl implements anzf {
    public static final azgw c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private azgw() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000ﺯ䨣免厯\u0003\u0000\u0000\u0003ﺯ䨣м\u0000䨥м\u0000免厯м\u0000", new Object[]{"b", "a", azha.class, azgu.class, azgo.class});
            case 3:
                return new azgw();
            case 4:
                return new azgz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azgw.class) {
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
        azgw azgw = new azgw();
        c = azgw;
        anxl.registerDefaultInstance(azgw.class, azgw);
    }
}
