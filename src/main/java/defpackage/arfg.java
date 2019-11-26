package defpackage;

/* renamed from: arfg */
public final class arfg extends anxl implements anzf {
    public static final arfg i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public axak c;
    public arml d;
    public arfh e;
    public arml f;
    public axak g;
    public axak h;
    private byte j = (byte) 2;

    private arfg() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0001\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0007", new Object[]{"a", "b", "d", "e", "c", "f", "g", "h"});
            case 3:
                return new arfg();
            case 4:
                return new arfi();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arfg.class) {
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
        arfg arfg = new arfg();
        i = arfg;
        anxl.registerDefaultInstance(arfg.class, arfg);
    }
}
