package defpackage;

/* renamed from: aptt */
public final class aptt extends anxl implements anzf {
    public static final aptt c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aptt() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ἑ⮔\u0002\u0000\u0000\u0002ἑм\u0000⮔м\u0000", new Object[]{"b", "a", aphg.class, aptl.class});
            case 3:
                return new aptt();
            case 4:
                return new apts();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aptt.class) {
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
        aptt aptt = new aptt();
        c = aptt;
        anxl.registerDefaultInstance(aptt.class, aptt);
    }
}
