package defpackage;

/* renamed from: armx */
public final class armx extends anxl implements anzf {
    public static final armx m;
    private static volatile anzq o;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public arml h;
    public axak i;
    public axak j;
    public anvu k = anvu.a;
    public apxu l;
    private byte n = (byte) 2;

    private armx() {
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004Љ\u0005\u0005Љ\u0007\u0007\n\t\bЉ\u0002\tЉ\u0003\nЉ\u0004\u000bЉ\u0006\fЉ\n", new Object[]{"a", "b", "c", "g", axak.class, "h", "j", "k", "d", "e", "f", "i", "l"});
            case 3:
                return new armx();
            case 4:
                return new armz();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (armx.class) {
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
        armx armx = new armx();
        m = armx;
        anxl.registerDefaultInstance(armx.class, armx);
    }
}
