package defpackage;

/* renamed from: aqgo */
public final class aqgo extends anxl implements anzf {
    public static final aqgo h;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public axak e;
    public apxu f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private aqgo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0006\u0007Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            case 3:
                return new aqgo();
            case 4:
                return new aqgr();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqgo.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return h.getParserForType();
    }

    static {
        aqgo aqgo = new aqgo();
        h = aqgo;
        anxl.registerDefaultInstance(aqgo.class, aqgo);
    }
}
