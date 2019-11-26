package defpackage;

/* renamed from: aruh */
public final class aruh extends anxl implements anzf {
    public static final aruh j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public arub c;
    public arud d;
    public long e;
    public aruj f;
    public arul g;
    public artx h;
    public anyd i = anxl.emptyProtobufList();
    private byte k = (byte) 2;

    private aruh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0002\u0001\b\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\u0002\u0003\u0005\t\u0004\u0006\t\u0005\u0007Л\b\t\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", apxu.class, "h"});
            case 3:
                return new aruh();
            case 4:
                return new aruk();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aruh.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aruh aruh = new aruh();
        j = aruh;
        anxl.registerDefaultInstance(aruh.class, aruh);
    }
}
