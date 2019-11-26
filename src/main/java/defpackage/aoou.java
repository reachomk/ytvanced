package defpackage;

/* renamed from: aoou */
public final class aoou extends anxl implements anzf {
    public static final aoou k;
    private static volatile anzq m;
    public int a;
    public int b;
    public aygk c;
    public boolean d;
    public arml e;
    public axak f;
    public axak g;
    public apxu h;
    public apxu i;
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private aoou() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0006\u0001\u000b\u0000\u0002Љ\u0001\u0003\u0007\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0007\t\n\t\nЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "h"});
            case 3:
                return new aoou();
            case 4:
                return new aoow();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (aoou.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoou aoou = new aoou();
        k = aoou;
        anxl.registerDefaultInstance(aoou.class, aoou);
    }
}
