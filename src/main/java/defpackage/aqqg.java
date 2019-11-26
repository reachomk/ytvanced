package defpackage;

/* renamed from: aqqg */
public final class aqqg extends anxp implements anzf {
    public static final aqqg d;
    private static volatile anzq f;
    public int a;
    public anvu b = anvu.a;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aqqg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\n\u0001\u0003Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new aqqg();
            case 4:
                return new aqqi();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqqg.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return d.getParserForType();
    }

    static {
        aqqg aqqg = new aqqg();
        d = aqqg;
        anxl.registerDefaultInstance(aqqg.class, aqqg);
    }
}
