package defpackage;

/* renamed from: aufk */
public final class aufk extends anxl implements anzf {
    public static final aufk i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public boolean e;
    public apxu f;
    public String g = "";
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private aufk() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0005\u0007\u0003\u0006Љ\u0004\b\b\u0005\n\n\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aufk();
            case 4:
                return new aufm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aufk.class) {
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
        aufk aufk = new aufk();
        i = aufk;
        anxl.registerDefaultInstance(aufk.class, aufk);
    }
}
