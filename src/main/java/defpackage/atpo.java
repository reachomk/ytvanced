package defpackage;

/* renamed from: atpo */
public final class atpo extends anxl implements anzf {
    public static final atpo c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atpo() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ἊἻ\u0002\u0000\u0000\u0002Ἂм\u0000Ἳм\u0000", new Object[]{"b", "a", azpf.class, azpm.class});
            case 3:
                return new atpo();
            case 4:
                return new atpn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atpo.class) {
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
        atpo atpo = new atpo();
        c = atpo;
        anxl.registerDefaultInstance(atpo.class, atpo);
    }
}
