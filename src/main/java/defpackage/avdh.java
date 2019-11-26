package defpackage;

/* renamed from: avdh */
public final class avdh extends anxl implements anzf {
    public static final avdh g;
    private static volatile anzq i;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public int e;
    public boolean f;
    private byte h = (byte) 2;

    private avdh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005\u000b\u0004\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new avdh();
            case 4:
                return new avdg();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avdh.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avdh avdh = new avdh();
        g = avdh;
        anxl.registerDefaultInstance(avdh.class, avdh);
    }
}
