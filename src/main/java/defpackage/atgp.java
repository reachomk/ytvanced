package defpackage;

/* renamed from: atgp */
public final class atgp extends anxl implements anzf {
    public static final atgp c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atgp() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000⸵䣥\u0004\u0000\u0000\u0004⸵м\u0000請㙺м\u0000ﲸ䍖м\u0000䣥м\u0000", new Object[]{"b", "a", auuc.class, aqja.class, ayrg.class, ayhz.class});
            case 3:
                return new atgp();
            case 4:
                return new atgs();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atgp.class) {
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
        atgp atgp = new atgp();
        c = atgp;
        anxl.registerDefaultInstance(atgp.class, atgp);
    }
}
