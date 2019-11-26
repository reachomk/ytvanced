package defpackage;

/* renamed from: axfb */
public final class axfb extends anxl implements anzf {
    public static final axfb i;
    private static volatile anzq k;
    public int a;
    public appg b;
    public axdw c;
    public axqn d;
    public auah e;
    public apmy f;
    public axcs g;
    public arbs h;
    private byte j = (byte) 2;

    private axfb() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001ﶝ᜝䤳\u0007\u0000\u0000\u0007ﶝ᜝Љ\u0004ᦌЉ\u0000龜ℶЉ\u0001⒡Љ\u0002⣽Љ\u0003㻿Љ\u0005䤳Љ\u0006", new Object[]{"a", "f", "b", "c", "d", "e", "g", "h"});
            case 3:
                return new axfb();
            case 4:
                return new axfa();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axfb.class) {
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
        axfb axfb = new axfb();
        i = axfb;
        anxl.registerDefaultInstance(axfb.class, axfb);
    }
}
