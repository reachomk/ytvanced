package defpackage;

/* renamed from: aofq */
public final class aofq extends anxl implements anzf {
    public static final aofq i;
    private static volatile anzq k;
    public int a;
    public aofs b;
    public aofu c;
    public aofw d;
    public aofy e;
    public aofo f;
    public aoga g;
    public aqsu h;
    private byte j = (byte) 2;

    private aofq() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001Ⓩ䥠\u0007\u0000\u0000\u0001Ⓩ\t\u0002Ⓩ\t\u0003ﮎⓐ\t\u0000⤣Љ\u0007２䕛\t\n䜗\t\u0004䥠\t\u000b", new Object[]{"a", "c", "d", "b", "f", "g", "e", "h"});
            case 3:
                return new aofq();
            case 4:
                return new aofp();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aofq.class) {
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
        aofq aofq = new aofq();
        i = aofq;
        anxl.registerDefaultInstance(aofq.class, aofq);
    }
}
