package defpackage;

/* renamed from: aywv */
public final class aywv extends anxl implements anzf {
    public static final aywv f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    public boolean d;
    public boolean e;
    private byte g = (byte) 2;

    private aywv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002\u0004\u0000\u0003\u0007\u0001\u0004\u0007\u0002", new Object[]{"a", "b", aywt.class, "c", "d", "e"});
            case 3:
                return new aywv();
            case 4:
                return new aywu();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aywv.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aywv aywv = new aywv();
        f = aywv;
        anxl.registerDefaultInstance(aywv.class, aywv);
    }
}
