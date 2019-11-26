package defpackage;

/* renamed from: aspz */
public final class aspz extends anxl implements anzf {
    public static final aspz i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public boolean c;
    public boolean d;
    public anyd e = anxl.emptyProtobufList();
    public boolean f;
    public boolean g;
    public boolean h;
    private byte j = (byte) 2;

    private aspz() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001Љ\u0000\u0002\u0007\u0002\u0003\u0007\u0003\u0004\u001a\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aspz();
            case 4:
                return new asqc();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aspz.class) {
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
        aspz aspz = new aspz();
        i = aspz;
        anxl.registerDefaultInstance(aspz.class, aspz);
    }
}
