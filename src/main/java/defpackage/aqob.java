package defpackage;

/* renamed from: aqob */
public final class aqob extends anxl implements anzf {
    public static final aqob c;
    private static volatile anzq e;
    public int a;
    public aqnz b;
    private byte d = (byte) 2;

    private aqob() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﺝ⑩ﺝ⑩\u0001\u0000\u0000\u0001ﺝ⑩Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqob();
            case 4:
                return new aqoa();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqob.class) {
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
        aqob aqob = new aqob();
        c = aqob;
        anxl.registerDefaultInstance(aqob.class, aqob);
    }
}
