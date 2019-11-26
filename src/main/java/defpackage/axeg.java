package defpackage;

/* renamed from: axeg */
public final class axeg extends anxl implements anzf {
    public static final axeg i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public arwf d;
    public anyd e = anxl.emptyProtobufList();
    public anvu f = anvu.a;
    public apxu g;
    public boolean h;
    private byte j = (byte) 2;

    private axeg() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001м\u0000\u0002м\u0000\u0003Л\u0005\n\u0004\u0006\t\u0002\u0007Љ\u0005\b\u0007\u0006", new Object[]{"c", "b", "a", axei.class, arml.class, "e", axek.class, "f", "d", "g", "h"});
            case 3:
                return new axeg();
            case 4:
                return new axej();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axeg.class) {
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
        axeg axeg = new axeg();
        i = axeg;
        anxl.registerDefaultInstance(axeg.class, axeg);
    }
}
