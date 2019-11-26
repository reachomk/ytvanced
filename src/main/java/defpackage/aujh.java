package defpackage;

/* renamed from: aujh */
public final class aujh extends anxl implements anzf {
    public static final aujh i;
    private static volatile anzq k;
    public int a;
    public long b;
    public boolean c;
    public arml d;
    public arml e;
    public aygk f;
    public anyd g = anxl.emptyProtobufList();
    public aujj h;
    private byte j = (byte) 2;

    private aujh() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0005\u0001\u0002\u0000\u0002\u0007\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Л\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", aphj.class, "h"});
            case 3:
                return new aujh();
            case 4:
                return new aujk();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aujh.class) {
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
        aujh aujh = new aujh();
        i = aujh;
        anxl.registerDefaultInstance(aujh.class, aujh);
    }
}
