package defpackage;

/* renamed from: arik */
public final class arik extends anxl implements anzf {
    public static final arik p;
    private static volatile anzq r;
    public int a;
    public axak b;
    public aygk c;
    public arml d;
    public arwf e;
    public apxu f;
    public arml g;
    public arml h;
    public arml i;
    public apxu j;
    public arwf k;
    public arml l;
    public arml m;
    public int n;
    public anvu o = anvu.a;
    private byte q = (byte) 2;

    private arik() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\bЉ\u0007\tЉ\b\nЉ\n\fЉ\u000b\r\n\r\u000f\t\u0003\u0010\f\f\u0011\t\t", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "l", "m", "o", "e", "n", arih.a, "k"});
            case 3:
                return new arik();
            case 4:
                return new arij();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (arik.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return p.getParserForType();
    }

    static {
        arik arik = new arik();
        p = arik;
        anxl.registerDefaultInstance(arik.class, arik);
    }
}
