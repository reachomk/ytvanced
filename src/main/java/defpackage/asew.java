package defpackage;

/* renamed from: asew */
public final class asew extends anxl implements anzf {
    public static final asew i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public axhs e;
    public String f;
    public String g;
    public String h;
    private byte j = (byte) 2;

    private asew() {
        String str = "";
        this.f = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0001\u0001Љ\u0000\u0002\b\u0002\u0003\u001a\u0004\u001a\u0005\b\u0004\u0007\t\u0001\b\b\u0003", new Object[]{"a", "b", "f", "c", "d", "h", "e", "g"});
            case 3:
                return new asew();
            case 4:
                return new asez();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asew.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asew asew = new asew();
        i = asew;
        anxl.registerDefaultInstance(asew.class, asew);
    }
}
