package defpackage;

/* renamed from: atbq */
public final class atbq extends anxl implements anzf {
    public static final atbq i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public anvu c = anvu.a;
    public anvu d = anvu.a;
    public anvu e = anvu.a;
    public anvu f = anvu.a;
    public boolean g;
    public String h = "";
    private byte j = (byte) 2;

    private atbq() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001Љ\u0000\u0002\n\u0001\u0005\n\u0004\u0006\n\u0002\u0007\n\u0003\b\u0007\u0005\t\b\u0006", new Object[]{"a", "b", "c", "f", "d", "e", "g", "h"});
            case 3:
                return new atbq();
            case 4:
                return new atbp();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (atbq.class) {
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
        atbq atbq = new atbq();
        i = atbq;
        anxl.registerDefaultInstance(atbq.class, atbq);
    }
}
