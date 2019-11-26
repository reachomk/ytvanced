package defpackage;

/* renamed from: axxz */
public final class axxz extends anxl implements anzf {
    public static final axxz k;
    private static volatile anzq m;
    public int a;
    public int b = 0;
    public Object c;
    public axak d;
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public arml g;
    public axak h;
    public axak i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private axxz() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0002\u0007\u0001м\u0000\u0002Љ\u0003\u0003Л\u0004Л\u0005Љ\u0005\u0007\n\b\b<\u0000\tЉ\u0004\nЉ\u0006", new Object[]{"c", "b", "a", aygk.class, "d", "e", arml.class, "f", arml.class, "h", "j", arwf.class, "g", "i"});
            case 3:
                return new axxz();
            case 4:
                return new axxy();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axxz.class) {
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
        axxz axxz = new axxz();
        k = axxz;
        anxl.registerDefaultInstance(axxz.class, axxz);
    }
}
