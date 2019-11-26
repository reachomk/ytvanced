package defpackage;

/* renamed from: bcat */
public final class bcat extends anxl implements anzf {
    public static final bcat an;
    private static volatile anzq ao;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public bcar F;
    public long G;
    public bcar H;
    public bcar I;
    public bcar J;
    public bcar K;
    public bcar L;
    public bcar M;
    public bcar N;
    public bcar O;
    public bcar P;
    public bcar Q;
    public bcar R;
    public bcar S;
    public bcar T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;
    public int a;
    public long aa;
    public long ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long ag;
    public long ah;
    public long ai;
    public bcar aj;
    public long ak;
    public long al;
    public long am;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public anyd i = anxl.emptyProtobufList();
    public anyd j = anxl.emptyProtobufList();
    public anyd k = anxl.emptyProtobufList();
    public anyd l = anxl.emptyProtobufList();
    public bcar m;
    public anyd n = anxl.emptyProtobufList();
    public anyd o = anxl.emptyProtobufList();
    public anyd p = anxl.emptyProtobufList();
    public anyd q = anxl.emptyProtobufList();
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    private bcat() {
    }

    public final void a() {
        if (!this.g.a()) {
            this.g = anxl.mutableCopy(this.g);
        }
    }

    public final void b() {
        if (!this.h.a()) {
            this.h = anxl.mutableCopy(this.h);
        }
    }

    public final void c() {
        if (!this.i.a()) {
            this.i = anxl.mutableCopy(this.i);
        }
    }

    public final void d() {
        if (!this.j.a()) {
            this.j = anxl.mutableCopy(this.j);
        }
    }

    public final void e() {
        if (!this.k.a()) {
            this.k = anxl.mutableCopy(this.k);
        }
    }

    public final void f() {
        if (!this.l.a()) {
            this.l = anxl.mutableCopy(this.l);
        }
    }

    public final void g() {
        if (!this.n.a()) {
            this.n = anxl.mutableCopy(this.n);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(an, "\u0001?\u0000\u0002\u0001@?\u0000\n\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\t\u0004\f\u001b\r\u001b\u000e\u001b\u000f\u001b\u0010\u0002\u0005\u0011\u0002\u0006\u0012\u0002\u0007\u0013\u0002\b\u0014\u0002\t\u0015\u0002\n\u0016\u0002\u000b\u0017\u0002\f\u0018\u0002\r\u0019\u0002\u000e\u001a\u0002\u000f\u001b\u0002\u0010\u001c\u0002\u0011\u001d\u0002\u0012\u001e\t\u0013\u001f\u0002\u0014 \t\u0015!\t\u0016\"\t\u0017#\t\u0018$\t\u0019%\t\u001a&\t\u001b'\t\u001c(\t\u001d)\t\u001e*\t\u001f+\t ,\t!-\u0002\".\u0002#/\u0002$0\u0002%1\u0002&2\u0002'3\u0002(4\u0002)5\u0002*6\u0002+7\u0002,8\u0002-9\u0002.:\u0002/;\u00020=\t1>\u00022?\u00023@\u00024", new Object[]{"a", "b", "c", "d", "e", "f", "g", bcar.class, "h", bcar.class, "i", bcar.class, "j", bcar.class, "k", bcar.class, "l", bcar.class, "m", "n", bcar.class, "o", bcal.class, "p", bcan.class, "q", bcaj.class, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am"});
            case 3:
                return new bcat();
            case 4:
                return new bcaw();
            case 5:
                return an;
            case 6:
                Object obj3 = ao;
                if (obj3 == null) {
                    synchronized (bcat.class) {
                        obj3 = ao;
                        if (obj3 == null) {
                            obj3 = new anxn(an);
                            ao = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcat bcat = new bcat();
        an = bcat;
        anxl.registerDefaultInstance(bcat.class, bcat);
    }
}
