package defpackage;

/* renamed from: auym */
public final class auym extends anxl implements anzf {
    public static final auym c;
    private static volatile anzq e;
    public int a;
    public auyk b;
    private byte d = (byte) 2;

    private auym() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䅡䅡\u0001\u0000\u0000\u0001䅡Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new auym();
            case 4:
                return new auyo();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auym.class) {
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
        auym auym = new auym();
        c = auym;
        anxl.registerDefaultInstance(auym.class, auym);
    }
}
