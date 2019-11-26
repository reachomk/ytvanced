package defpackage;

/* renamed from: arfd */
public final class arfd extends anxl implements anzf {
    public static final arfd c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private arfd() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000ﳌ䈠峽\u0004\u0000\u0000\u0004ﳌ䈠м\u0000堗м\u0000峋м\u0000峽м\u0000", new Object[]{"b", "a", arfg.class, aooz.class, aoox.class, aoou.class});
            case 3:
                return new arfd();
            case 4:
                return new arfc();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arfd.class) {
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
        arfd arfd = new arfd();
        c = arfd;
        anxl.registerDefaultInstance(arfd.class, arfd);
    }
}
