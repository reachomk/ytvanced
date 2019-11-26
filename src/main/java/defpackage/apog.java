package defpackage;

/* renamed from: apog */
public final class apog extends anxl implements anzf {
    public static final apog c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private apog() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000㊁㊁\u0002\u0000\u0000\u0002㊁м\u0000㊁м\u0000", new Object[]{"b", "a", apoi.class, apoc.class});
            case 3:
                return new apog();
            case 4:
                return new apoj();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apog.class) {
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
        apog apog = new apog();
        c = apog;
        anxl.registerDefaultInstance(apog.class, apog);
    }
}
