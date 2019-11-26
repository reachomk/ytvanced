package defpackage;

/* renamed from: aqmz */
public final class aqmz extends anxl implements anzf {
    public static final aqmz i;
    private static volatile anzq k;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public arml d;
    public int e;
    public aygk f;
    public boolean g;
    public int h;
    private byte j = (byte) 2;

    private aqmz() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0004\u000b\u0002\u0005Љ\u0003\u0006\u0007\u0004\u0007\u000b\u0005", new Object[]{"a", "b", aygk.class, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqmz();
            case 4:
                return new aqmy();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aqmz.class) {
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
        aqmz aqmz = new aqmz();
        i = aqmz;
        anxl.registerDefaultInstance(aqmz.class, aqmz);
    }
}
