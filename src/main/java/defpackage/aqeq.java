package defpackage;

/* renamed from: aqeq */
public final class aqeq extends anxl implements anzf {
    public static final aqeq k;
    private static volatile anzq m;
    public int a;
    public int b = 0;
    public Object c;
    public arwf d;
    public aygk e;
    public arml f;
    public arml g;
    public String h = "";
    public aqeo i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private aqeq() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0001\u0001\u0001\r\t\u0000\u0000\u0006\u0001\t\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004м\u0000\u0006\n\u000e\tм\u0000\u000bЉ\u000b\f\b\n\rЉ\u0004", new Object[]{"c", "b", "a", "d", "e", "f", apxu.class, "j", apxu.class, "i", "h", "g"});
            case 3:
                return new aqeq();
            case 4:
                return new aqep();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aqeq.class) {
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
        aqeq aqeq = new aqeq();
        k = aqeq;
        anxl.registerDefaultInstance(aqeq.class, aqeq);
    }
}
