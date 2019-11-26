package defpackage;

/* renamed from: atqq */
public final class atqq extends anxl implements anzf {
    public static final atqq f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public String c = "";
    public anyd d = anxl.emptyProtobufList();
    public boolean e;
    private byte g = (byte) 2;

    private atqq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002", new Object[]{"a", "b", "c", "d", atqo.class, "e"});
            case 3:
                return new atqq();
            case 4:
                return new atqp();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atqq.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atqq atqq = new atqq();
        f = atqq;
        anxl.registerDefaultInstance(atqq.class, atqq);
    }
}
