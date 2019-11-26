package defpackage;

/* renamed from: apdh */
public final class apdh extends anxl implements anzf {
    public static final apdh r;
    private static volatile anzq t;
    public int a;
    public apej b;
    public apdn c;
    public aper d;
    public apet e;
    public apev f;
    public apdr g;
    public apdv h;
    public apep i;
    public apdl j;
    public apdf k;
    public ayob l;
    public ayqr m;
    public apdt n;
    public apdd o;
    public avjb p;
    public apdj q;
    private byte s = (byte) 2;

    private apdh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001ᡂ䫓\u0010\u0000\u0000\u000fᡂЉ\u0004ᡆЉ\u0003ￆᡇЉ\u0001ᡈЉ\u0000ᡉЉ\u0002ᲱЉ\u0007ṯ\t\bἀЉ\u000fￜ⚌Љ\t⩷Љ\n⪗Љ\u000bﻠⷡЉ\r〠Љ\u0010䄖Љ\u000eￊ䈕Љ\u0012䫓Љ\u0013", new Object[]{"a", "f", "e", "c", "b", "d", "g", "h", "n", "i", "j", "k", "l", "o", "m", "p", "q"});
            case 3:
                return new apdh();
            case 4:
                return new apdg();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (apdh.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apdh apdh = new apdh();
        r = apdh;
        anxl.registerDefaultInstance(apdh.class, apdh);
    }
}
