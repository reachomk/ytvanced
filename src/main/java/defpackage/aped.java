package defpackage;

/* renamed from: aped */
public final class aped extends anxl implements anzf {
    public static final aped g;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public arml c;
    public arml d;
    public arml e;
    public apef f;
    private byte h = (byte) 2;

    private aped() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0003\u0001\b\u0000\u0002Љ\u0001\u0005\t\u0005\bЉ\u0002\tЉ\u0003", new Object[]{"a", "b", "c", "f", "d", "e"});
            case 3:
                return new aped();
            case 4:
                return new apec();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aped.class) {
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
        aped aped = new aped();
        g = aped;
        anxl.registerDefaultInstance(aped.class, aped);
    }
}
