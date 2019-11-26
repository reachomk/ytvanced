package defpackage;

/* renamed from: atpu */
public final class atpu extends anxl implements anzf {
    public static final atpu c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atpu() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000Ẑ⸒\u0004\u0000\u0000\u0004Ẑм\u0000Ἳм\u0000ⴵм\u0000⸒м\u0000", new Object[]{"b", "a", aqhy.class, azpm.class, azpo.class, auuu.class});
            case 3:
                return new atpu();
            case 4:
                return new atpt();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atpu.class) {
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
        atpu atpu = new atpu();
        c = atpu;
        anxl.registerDefaultInstance(atpu.class, atpu);
    }
}
