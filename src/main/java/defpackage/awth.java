package defpackage;

/* renamed from: awth */
public final class awth extends anxl implements anzf {
    public static final awth j;
    private static volatile anzq l;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public apxu e;
    public arml f;
    public arml g;
    public auvr h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private awth() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005\n\b\u0006Љ\u0003\u0007Љ\u0004\bЉ\u0005\tЉ\u0006", new Object[]{"a", "b", "c", "d", "i", "e", "f", "g", "h"});
            case 3:
                return new awth();
            case 4:
                return new awtk();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awth.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return j.getParserForType();
    }

    static {
        awth awth = new awth();
        j = awth;
        anxl.registerDefaultInstance(awth.class, awth);
    }
}
