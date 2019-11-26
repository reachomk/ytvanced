package defpackage;

/* renamed from: apoa */
public final class apoa extends anxl implements anzf {
    public static final apoa c;
    private static volatile anzq e;
    public int a;
    public apny b;
    private byte d = (byte) 2;

    private apoa() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䍆䍆\u0001\u0000\u0000\u0001䍆Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new apoa();
            case 4:
                return new apod();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apoa.class) {
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
        apoa apoa = new apoa();
        c = apoa;
        anxl.registerDefaultInstance(apoa.class, apoa);
    }
}
