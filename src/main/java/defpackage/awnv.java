package defpackage;

/* renamed from: awnv */
public final class awnv extends anxl implements anzf {
    public static final awnv k;
    private static volatile anzq m;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public int e;
    public axak f;
    public arml g;
    public axak h;
    public anvu i = anvu.a;
    public anyd j = anxl.emptyProtobufList();
    private byte l = (byte) 2;

    private awnv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\f\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\t\n\b\nЛ", new Object[]{"a", "b", "c", "d", "e", awnm.a, "f", "g", "h", "i", "j", apxu.class});
            case 3:
                return new awnv();
            case 4:
                return new awny();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (awnv.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return k.getParserForType();
    }

    static {
        awnv awnv = new awnv();
        k = awnv;
        anxl.registerDefaultInstance(awnv.class, awnv);
    }
}
