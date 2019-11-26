package defpackage;

/* renamed from: arni */
public final class arni extends anxl implements anzf {
    public static final arni i;
    private static volatile anzq k;
    public int a;
    public int b;
    public arml c;
    public String d = "";
    public arml e;
    public arml f;
    public apxu g;
    public aywl h;
    private byte j = (byte) 2;

    private arni() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\f\u0000\u0002Љ\u0001\u0003\b\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", arnj.a, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arni();
            case 4:
                return new arnh();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arni.class) {
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
        arni arni = new arni();
        i = arni;
        anxl.registerDefaultInstance(arni.class, arni);
    }
}
