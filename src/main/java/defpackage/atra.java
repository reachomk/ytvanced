package defpackage;

/* renamed from: atra */
public final class atra extends anxl implements anzf {
    public static final atra i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public arwf f;
    public boolean g;
    public apxu h;
    private byte j = (byte) 2;

    private atra() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0003\u0001Љ\u0000\u0002;\u0000\u00037\u0000\u0004\t\u0004\u0005\u0007\u0005\u0007Љ\u0001\bЉ\u0007", new Object[]{"c", "b", "a", "d", "f", "g", "e", "h"});
            case 3:
                return new atra();
            case 4:
                return new atrc();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (atra.class) {
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
        atra atra = new atra();
        i = atra;
        anxl.registerDefaultInstance(atra.class, atra);
    }
}
