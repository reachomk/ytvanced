package defpackage;

/* renamed from: aroe */
public final class aroe extends anxl implements anzf {
    public static final aroe e;
    private static volatile anzq g;
    public int a;
    public aqgs b;
    public aqqg c;
    public aqfs d;
    private byte f = (byte) 2;

    private aroe() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ᠤ⼞\u0003\u0000\u0000\u0003ᠤЉ\u0000ᠲЉ\u0002⼞Љ\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new aroe();
            case 4:
                return new aroh();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aroe.class) {
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
        aroe aroe = new aroe();
        e = aroe;
        anxl.registerDefaultInstance(aroe.class, aroe);
    }
}
