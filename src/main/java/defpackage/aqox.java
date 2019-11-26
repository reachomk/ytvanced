package defpackage;

/* renamed from: aqox */
public final class aqox extends anxl implements anzf {
    public static final aqox j;
    private static volatile anzq l;
    public int a;
    public aqtk b;
    public apxu c;
    public arml d;
    public arml e;
    public aphj f;
    public aphj g;
    public String h = "";
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private aqox() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006\n\u0007\bЉ\u0001\t\b\u0006", new Object[]{"a", "b", "d", "e", "f", "g", "i", "c", "h"});
            case 3:
                return new aqox();
            case 4:
                return new aqow();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqox.class) {
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
        aqox aqox = new aqox();
        j = aqox;
        anxl.registerDefaultInstance(aqox.class, aqox);
    }
}
