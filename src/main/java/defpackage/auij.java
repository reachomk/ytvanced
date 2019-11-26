package defpackage;

/* renamed from: auij */
public final class auij extends anxl implements anzf {
    public static final auij i;
    private static volatile anzq k;
    public int a;
    public aqod b;
    public aufs c;
    public auif d;
    public auin e;
    public auxd f;
    public auid g;
    public auih h;
    private byte j = (byte) 2;

    private auij() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001﵇Ὲﱉ䒃\u0007\u0000\u0000\u0007﵇ῈЉ\nℂЉ\u0000⡜Љ\u0007⤦Љ\tⴱЉ\f㟮Љ\u0001ﱉ䒃Љ\r", new Object[]{"a", "f", "b", "d", "e", "g", "c", "h"});
            case 3:
                return new auij();
            case 4:
                return new auim();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (auij.class) {
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
        auij auij = new auij();
        i = auij;
        anxl.registerDefaultInstance(auij.class, auij);
    }
}
