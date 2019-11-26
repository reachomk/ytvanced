package defpackage;

/* renamed from: aypf */
public final class aypf extends anxl implements anzf {
    public static final aypf w;
    private static volatile anzq y;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public auvr e;
    public apxu f;
    public aypi g;
    public apdh h;
    public apdh i;
    public ayqn j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    public arml q;
    public arml r;
    public arml s;
    public arml t;
    public arml u;
    public apxu v;
    private byte x = (byte) 2;

    private aypf() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.x = b;
                return null;
            case 2:
                return anxl.newMessageInfo(w, "\u0001\u0015\u0000\u0001\u0003'\u0015\u0000\u0000\u0015\u0003Љ\u0010\u0004Љ\u0003\u0007Љ\u0014\bЉ\u0015\tЉ\u0016\nЉ\u0017\u000bЉ\u0018\fЉ\u001b\rЉ\u001c\u000eЉ\u001d\u000fЉ\u001e\u0010Љ\u000f\u0013Љ\u0019\u0014Љ\u001a\u001bЉ\u0005\u001dЉ\u0013\u001fЉ\u0000 Љ\u0001!Љ\u0002\"Љ\t'Љ\n", new Object[]{"a", "j", "e", "l", "m", "n", "o", "p", "s", "t", "u", "v", "i", "q", "r", "f", "k", "b", "c", "d", "g", "h"});
            case 3:
                return new aypf();
            case 4:
                return new aypk();
            case 5:
                return w;
            case 6:
                Object obj3 = y;
                if (obj3 == null) {
                    synchronized (aypf.class) {
                        obj3 = y;
                        if (obj3 == null) {
                            obj3 = new anxn(w);
                            y = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aypf aypf = new aypf();
        w = aypf;
        anxl.registerDefaultInstance(aypf.class, aypf);
    }
}
