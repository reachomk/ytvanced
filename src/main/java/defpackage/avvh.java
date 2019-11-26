package defpackage;

/* renamed from: avvh */
public final class avvh extends anxl implements anzf {
    public static final avvh c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private avvh() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0004\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000", new Object[]{"b", "a", avvn.class, avvl.class, avvj.class, axak.class});
            case 3:
                return new avvh();
            case 4:
                return new avvg();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avvh.class) {
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
        avvh avvh = new avvh();
        c = avvh;
        anxl.registerDefaultInstance(avvh.class, avvh);
    }
}
