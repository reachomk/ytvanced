package defpackage;

/* renamed from: aouy */
public final class aouy extends anxl implements anzf {
    public static final aouy i;
    private static volatile anzq k;
    public int a;
    public arwf b;
    public arml c;
    public apxu d;
    public apxu e;
    public apxu f;
    public arml g;
    public auko h;
    private byte j = (byte) 2;

    private aouy() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0000\u0006\u0001\t\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005ϧЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aouy();
            case 4:
                return new aova();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aouy.class) {
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

    static {
        aouy aouy = new aouy();
        i = aouy;
        anxl.registerDefaultInstance(aouy.class, aouy);
    }
}
