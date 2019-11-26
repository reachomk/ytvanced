package defpackage;

/* renamed from: atoy */
public final class atoy extends anxl implements anzf {
    public static final atoy c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atoy() {
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
                return anxl.newMessageInfo(c, "\u0001\u0006\u0001\u0000⸵列\u0006\u0000\u0000\u0006⸵м\u0000突ハм\u0000請㙺м\u0000ﭴ㨬м\u0000䣥м\u0000列м\u0000", new Object[]{"b", "a", auuc.class, aqwv.class, aqja.class, arpe.class, ayhz.class, aror.class});
            case 3:
                return new atoy();
            case 4:
                return new atox();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atoy.class) {
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
        atoy atoy = new atoy();
        c = atoy;
        anxl.registerDefaultInstance(atoy.class, atoy);
    }
}
