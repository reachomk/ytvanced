package defpackage;

/* renamed from: atre */
public final class atre extends anxl implements anzf {
    public static final atre g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aodx e;
    public int f;
    private byte h = (byte) 2;

    private atre() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0003\u0002Љ\u0001\u0003Љ\u0003\u0004\t\u0004\u0005Љ\u0002\u0006\u0004\u0005", new Object[]{"a", "b", "d", "e", "c", "f"});
            case 3:
                return new atre();
            case 4:
                return new atrd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atre.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atre atre = new atre();
        g = atre;
        anxl.registerDefaultInstance(atre.class, atre);
    }
}
