package defpackage;

/* renamed from: atlv */
public final class atlv extends anxl implements anzf {
    public static final atlv c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atlv() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000⸓瀞䢤\u0002\u0000\u0000\u0002⸓м\u0000瀞䢤м\u0000", new Object[]{"b", "a", aysp.class, auka.class});
            case 3:
                return new atlv();
            case 4:
                return new atly();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atlv.class) {
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
        atlv atlv = new atlv();
        c = atlv;
        anxl.registerDefaultInstance(atlv.class, atlv);
    }
}
