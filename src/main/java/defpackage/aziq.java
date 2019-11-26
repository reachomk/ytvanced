package defpackage;

/* renamed from: aziq */
public final class aziq extends anxl implements anzf {
    public static final aziq n;
    private static volatile anzq p;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public apxu e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public azhc h;
    public azhc i;
    public axak j;
    public axak k;
    public int l;
    public anvu m = anvu.a;
    private byte o = (byte) 2;

    private aziq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005м\u0000\u0006\t\u0007\b\n\r\tм\u0000\nм\u0000\u000bЉ\t\fЉ\n\r\t\b\u000eм\u0000\u000f\f\u000b", new Object[]{"c", "b", "a", "d", "e", "f", "g", azhq.class, aygk.class, "h", "m", arml.class, aphj.class, "j", "k", "i", axak.class, "l", azgn.a});
            case 3:
                return new aziq();
            case 4:
                return new azit();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aziq.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aziq aziq = new aziq();
        n = aziq;
        anxl.registerDefaultInstance(aziq.class, aziq);
    }
}
