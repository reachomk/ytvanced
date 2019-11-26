package defpackage;

/* renamed from: axyb */
public final class axyb extends anxl implements anzf {
    public static final axyb l;
    private static volatile anzq n;
    public int a;
    public int b = 0;
    public Object c;
    public aygk d;
    public anxz e = anxl.emptyIntList();
    public arml f;
    public arml g;
    public anyd h = anxl.emptyProtobufList();
    public axak i;
    public axak j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private axyb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0002\u0007\u0001Љ\u0003\u0002Љ\u0004\u0003Љ\u0005\u0004Л\u0005Љ\u0006\u0006Љ\u0007\b\n\t\tм\u0000\n<\u0000\u000b\u001d", new Object[]{"c", "b", "a", "d", "f", "g", "h", arml.class, "i", "j", "k", aygk.class, arwf.class, "e"});
            case 3:
                return new axyb();
            case 4:
                return new axya();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axyb.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return l.getParserForType();
    }

    static {
        axyb axyb = new axyb();
        l = axyb;
        anxl.registerDefaultInstance(axyb.class, axyb);
    }
}
