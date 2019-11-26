package defpackage;

/* renamed from: aymx */
public final class aymx extends anxl implements anzf {
    public static final aymx l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public aphj d;
    public anyd e = anxl.emptyProtobufList();
    public axak f;
    public anvu g = anvu.a;
    public aymv h;
    public apxu i;
    public aphj j;
    public axak k;
    private byte m = (byte) 2;

    private aymx() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\t\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Л\u0006\n\u0004\u0007Љ\u0005\bЉ\u0007\tЉ\u0002\nЉ\b\u000bЉ\u0006", new Object[]{"a", "b", "c", aynb.class, "d", "e", arml.class, "g", "h", "j", "f", "k", "i"});
            case 3:
                return new aymx();
            case 4:
                return new ayna();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aymx.class) {
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
        aymx aymx = new aymx();
        l = aymx;
        anxl.registerDefaultInstance(aymx.class, aymx);
    }
}
