package defpackage;

/* renamed from: aqir */
public final class aqir extends anxl implements anzf {
    public static final anyb k = new aqiu();
    public static final aqir m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public apxu e;
    public anyd f = anxl.emptyProtobufList();
    public String g = "";
    public aqtc h;
    public anvu i = anvu.a;
    public anxz j = anxl.emptyIntList();
    public axak l;
    private byte n = (byte) 2;

    private aqir() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0002\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0004Љ\u0003\u0005Л\u0006\b\u0004\b\t\u0006\t\n\u0007\u000b\u001e\fЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", aqip.class, "g", "h", "i", "j", aqkr.a(), "l"});
            case 3:
                return new aqir();
            case 4:
                return new aqit();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aqir.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return m.getParserForType();
    }

    static {
        aqir aqir = new aqir();
        m = aqir;
        anxl.registerDefaultInstance(aqir.class, aqir);
    }
}
