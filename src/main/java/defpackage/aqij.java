package defpackage;

/* renamed from: aqij */
public final class aqij extends anxl implements anzf {
    public static final aqij i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public aqtk c;
    public aphj d;
    public aphj e;
    public long f;
    public apxu g;
    public String h = "";
    private byte j = (byte) 2;

    private aqij() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0007Љ\u0007\b\b\b\t\u0002\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "h", "f"});
            case 3:
                return new aqij();
            case 4:
                return new aqii();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqij.class) {
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

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        aqij aqij = new aqij();
        i = aqij;
        anxl.registerDefaultInstance(aqij.class, aqij);
    }
}
