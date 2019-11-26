package defpackage;

/* renamed from: axtl */
public final class axtl extends anxl implements anzf {
    public static final axtl l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public axak e;
    public axak f;
    public arml g;
    public arml h;
    public axak i;
    public arml j;
    public boolean k;
    private byte m = (byte) 2;

    private axtl() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\t\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0007\u0007Љ\u0006\bЉ\u0003\tЉ\b\n\u0007\t", new Object[]{"a", "b", "c", "d", "f", "g", "i", "h", "e", "j", "k"});
            case 3:
                return new axtl();
            case 4:
                return new axtk();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axtl.class) {
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
        axtl axtl = new axtl();
        l = axtl;
        anxl.registerDefaultInstance(axtl.class, axtl);
    }
}
