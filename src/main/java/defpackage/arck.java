package defpackage;

/* renamed from: arck */
public final class arck extends anxl implements anzf {
    public static final arck k;
    private static volatile anzq m;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public aygk f;
    public aphj g;
    public axak h;
    public axak i;
    public axak j;
    private byte l = (byte) 2;

    private arck() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0004\u0006>\u0000\u0007Љ\u0007\bЉ\b\n;\u0000\u000bЉ\n", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new arck();
            case 4:
                return new arcn();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (arck.class) {
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
        arck arck = new arck();
        k = arck;
        anxl.registerDefaultInstance(arck.class, arck);
    }
}
