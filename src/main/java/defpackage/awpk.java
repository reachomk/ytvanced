package defpackage;

/* renamed from: awpk */
public final class awpk extends anxl implements anzf {
    public static final awpk h;
    private static volatile anzq j;
    public int a;
    public awqy b;
    public awpi c;
    public anyd d = anxl.emptyProtobufList();
    public aojc e;
    public anvu f = anvu.a;
    public String g = "";
    private byte i = (byte) 2;

    private awpk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003\u001b\u0004Љ\u0002\u0006\n\u0004\u0007\b\u0005", new Object[]{"a", "b", "c", "d", awqq.class, "e", "f", "g"});
            case 3:
                return new awpk();
            case 4:
                return new awpn();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awpk.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return h.getParserForType();
    }

    static {
        awpk awpk = new awpk();
        h = awpk;
        anxl.registerDefaultInstance(awpk.class, awpk);
    }
}
