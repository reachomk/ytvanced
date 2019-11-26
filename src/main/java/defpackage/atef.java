package defpackage;

/* renamed from: atef */
public final class atef extends anxl implements anzf {
    public static final atef e;
    private static volatile anzq g;
    public int a;
    public auuc b;
    public azko c;
    public ayhz d;
    private byte f = (byte) 2;

    private atef() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001⸵䣥\u0003\u0000\u0000\u0003⸵Љ\u0000㤑Љ\u0001䣥Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atef();
            case 4:
                return new atei();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atef.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atef atef = new atef();
        e = atef;
        anxl.registerDefaultInstance(atef.class, atef);
    }
}
