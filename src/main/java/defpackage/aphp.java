package defpackage;

/* renamed from: aphp */
public final class aphp extends anxl implements anzf {
    public static final aphp c;
    private static volatile anzq e;
    public int a;
    public aphl b;
    private byte d = (byte) 2;

    private aphp() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㲉㲉\u0001\u0000\u0000\u0001㲉Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aphp();
            case 4:
                return new aphs();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aphp.class) {
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
        aphp aphp = new aphp();
        c = aphp;
        anxl.registerDefaultInstance(aphp.class, aphp);
    }
}
