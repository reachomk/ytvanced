package defpackage;

/* renamed from: atqt */
public final class atqt extends anxl implements anzf {
    public static final atqt h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public arwf e;
    public boolean f;
    public aodx g;
    private byte i = (byte) 2;

    private atqt() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0002\u0002Љ\u0001\u0003\t\u0003\u0004\t\u0004\u0005\u0007\u0005\u0006\t\u0006\u0007Љ\u0002", new Object[]{"a", "b", "d", "e", "f", "g", "c"});
            case 3:
                return new atqt();
            case 4:
                return new atqu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atqt.class) {
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

    static {
        atqt atqt = new atqt();
        h = atqt;
        anxl.registerDefaultInstance(atqt.class, atqt);
    }
}
