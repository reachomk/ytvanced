package defpackage;

/* renamed from: awdy */
public final class awdy extends anxl implements anzf {
    public static final awdy g;
    private static volatile anzq i;
    public int a;
    public String b;
    public String c;
    public String d;
    public arml e;
    public aphj f;
    private byte h = (byte) 2;

    private awdy() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004Љ\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awdy();
            case 4:
                return new awdx();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awdy.class) {
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
        awdy awdy = new awdy();
        g = awdy;
        anxl.registerDefaultInstance(awdy.class, awdy);
    }
}
