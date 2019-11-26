package defpackage;

/* renamed from: auya */
public final class auya extends anxl implements anzf {
    public static final auya J;
    private static volatile anzq L;
    public aoqt A;
    public aydm B;
    public avce C;
    public avno D;
    public aott E;
    public aotl F;
    public aovh G;
    public aqtq H;
    public aorf I;
    private byte K = (byte) 2;
    public int a;
    public int b;
    public awzj c;
    public aysl d;
    public ayxf e;
    public atlx f;
    public ausm g;
    public attj h;
    public avzm i;
    public aqtu j;
    public argt k;
    public awmg l;
    public aovk m;
    public arhb n;
    public awmw o;
    public arnw p;
    public arhx q;
    public aosh r;
    public aoqb s;
    public aoxw t;
    public avtc u;
    public aqrw v;
    public axqu w;
    public aoqz x;
    public aort y;
    public aovf z;

    private auya() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.K);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.K = b;
                return null;
            case 2:
                return anxl.newMessageInfo(J, "\u0001!\u0000\u0002ﭹ᥏㷖!\u0000\u0000\u0004ﭹ᥏\t\u0000ᮊ\t\u0011︿ḖЉ\u0001；‵\t\u0004遼⃝\t\u000b⃩\t\f﬍⌰\t\u0003ｦ⍲\t\u0012ﾱ⏕\t\u0016┶\t\u0019♵Љ\u001c⮮\t!ﵘ⮰\t\u001eⱓ\t\"⸑\t#ﬥ⼎Љ%⽴\t\u000f⿹\t&〙\t\u001f﵂ヶ\t(ヷ\t'ㅆ\t*ﵝ㏌\t-㔱Љ\u0002㕛\t\r㖌\t\u000e㙁\t/㡣\t0㪮\t1㱋\t6㳠\t7㷔\t8㷖\t:", new Object[]{"a", "b", "c", "m", "d", "g", "h", "i", "f", "n", "o", "p", "q", "t", "r", "u", "v", "w", "l", "x", "s", "z", "y", "A", "B", "e", "j", "k", "C", "D", "E", "F", "G", "H", "I"});
            case 3:
                return new auya();
            case 4:
                return new auxz();
            case 5:
                return J;
            case 6:
                Object obj3 = L;
                if (obj3 == null) {
                    synchronized (auya.class) {
                        obj3 = L;
                        if (obj3 == null) {
                            obj3 = new anxn(J);
                            L = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auya auya = new auya();
        J = auya;
        anxl.registerDefaultInstance(auya.class, auya);
    }
}
