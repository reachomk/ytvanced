package defpackage;

/* renamed from: arwn */
public final class arwn extends anxl implements anzf {
    public static final arwn i;
    private static volatile anzq k;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    public anyd g = anxl.emptyProtobufList();
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private arwn() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007\u001b\t\n\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", aule.class, "h"});
            case 3:
                return new arwn();
            case 4:
                return new arwq();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arwn.class) {
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
        arwn arwn = new arwn();
        i = arwn;
        anxl.registerDefaultInstance(arwn.class, arwn);
    }
}
