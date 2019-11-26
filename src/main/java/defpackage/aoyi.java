package defpackage;

/* renamed from: aoyi */
public final class aoyi extends anxl implements anzf {
    public static final aoyi i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public int d;
    public aygk e;
    public ayvl f;
    public arml g;
    public arml h;
    private byte j = (byte) 2;

    private aoyi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003\u0004\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aoyi();
            case 4:
                return new aoyh();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aoyi.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        aoyi aoyi = new aoyi();
        i = aoyi;
        anxl.registerDefaultInstance(aoyi.class, aoyi);
    }
}
