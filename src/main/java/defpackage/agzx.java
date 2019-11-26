package defpackage;

/* renamed from: agzx */
public final class agzx implements agya {
    private final agxz a;
    private final agvz b;
    private final aajx c;
    private final bcaa d;
    private final agwa e;
    private final agqz f;
    private final String g;
    private final String h;
    private final String i;
    private final byte[] j;
    private final agzo k;
    private aivp l;
    private aivp m;
    private final agzy n;
    private final ahac o;
    private final ahac p;
    private final agps q;
    private final xsc r;
    private final int s;
    private final int t;
    private final ahad u;
    private volatile boolean v;
    private boolean w = false;
    private String x = "";
    private final int y;
    private final int z;

    public agzx(agxz agxz, agvz agvz, aajx aajx, xsc xsc, xua xua, agqz agqz, agzo agzo, ahad ahad, bcaa bcaa, agwa agwa, agps agps) {
        this.a = agxz;
        this.b = agvz;
        this.c = aajx;
        this.r = xsc;
        this.f = agqz;
        this.k = agzo;
        this.u = ahad;
        this.d = bcaa;
        this.e = agwa;
        this.q = agps;
        int e = agxj.e(agqz.f);
        this.s = e;
        this.t = e;
        e = agxj.F(agqz.f);
        this.y = e;
        this.z = e;
        this.g = agqz.a;
        this.h = xua.a();
        this.i = agxj.b(agqz.f);
        this.j = agxj.f(agqz.f);
        this.n = new agzy(xsc, agvz.p(), new agzw(this));
        this.o = new ahac();
        this.p = new ahac();
    }

    /* JADX WARNING: Removed duplicated region for block: B:482:0x0548 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x058c A:{Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a8 A:{SYNTHETIC, Splitter:B:126:0x02a8} */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0290 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0612 A:{Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0611 A:{Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0623 A:{Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0622 A:{Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x08dd A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07b0 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c9 A:{Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }} */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07d2 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x07cb A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07ec A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07ea A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0819 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0838 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0837 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x08a3 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed A:{SYNTHETIC, Splitter:B:57:0x00ed} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012d A:{SYNTHETIC, Splitter:B:63:0x012d} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190 A:{SYNTHETIC, Splitter:B:70:0x0190} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b8 A:{SYNTHETIC, Splitter:B:76:0x01b8} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c9 A:{Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }} */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07b0 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x07cb A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07d2 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07ea A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07ec A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0819 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0837 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0838 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x08a3 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0abd A:{Catch:{ Exception -> 0x0ad8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0ab3 A:{SYNTHETIC, Splitter:B:445:0x0ab3} */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b3c  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A:{SYNTHETIC, Splitter:B:17:0x0059} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A:{SYNTHETIC, Splitter:B:29:0x0073} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed A:{SYNTHETIC, Splitter:B:57:0x00ed} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012d A:{SYNTHETIC, Splitter:B:63:0x012d} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190 A:{SYNTHETIC, Splitter:B:70:0x0190} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b8 A:{SYNTHETIC, Splitter:B:76:0x01b8} */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x07b0 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c9 A:{Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }} */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x07d2 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x07cb A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07ec A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07ea A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0819 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0838 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0837 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x08a3 A:{Catch:{ agnx -> 0x069a, IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1, IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68, agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0ab3 A:{SYNTHETIC, Splitter:B:445:0x0ab3} */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0abd A:{Catch:{ Exception -> 0x0ad8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0028 A:{Splitter:B:11:0x0038, ExcHandler: Exception (r0_0 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0abd A:{Catch:{ Exception -> 0x0ad8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0ab3 A:{SYNTHETIC, Splitter:B:445:0x0ab3} */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b3c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0a75 A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0a6e A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a68 A:{PHI: r7 r35 , Splitter:B:148:0x0331, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b3c  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0a75 A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0a6e A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a68 A:{PHI: r7 r35 , Splitter:B:148:0x0331, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b3c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0a75 A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0a6e A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a68 A:{PHI: r7 r35 , Splitter:B:148:0x0331, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0700 A:{Splitter:B:173:0x0387, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x06f6 A:{Splitter:B:173:0x0387, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06f1 A:{Splitter:B:189:0x0479, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b3c  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0a75 A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: agyc (e agyc)} */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0a6e A:{PHI: r7 r35 , Splitter:B:99:0x020b, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a68 A:{PHI: r7 r35 , Splitter:B:148:0x0331, ExcHandler: Exception (e java.lang.Exception)} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033 A:{Splitter:B:3:0x0014, ExcHandler: IOException (r0_2 'e' java.io.IOException)} */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0a7e A:{PHI: r3 , Splitter:B:11:0x0038, ExcHandler: InterruptedException (e java.lang.InterruptedException)} */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0028 A:{Splitter:B:11:0x0038, ExcHandler: Exception (r0_0 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:5:0x0028, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:6:0x0029, code skipped:
            r1 = r0;
            r3 = r8;
     */
    /* JADX WARNING: Missing block: B:7:0x002d, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:8:0x002e, code skipped:
            r1 = r0;
            r35 = r8;
     */
    /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:10:0x0034, code skipped:
            r1 = r0;
            r3 = r8;
     */
    /* JADX WARNING: Missing block: B:52:0x00b7, code skipped:
            if (r4.c != false) goto L_0x00a4;
     */
    /* JADX WARNING: Missing block: B:88:0x01ee, code skipped:
            if (defpackage.agoa.a(r4) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Missing block: B:116:0x025b, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:118:0x026d, code skipped:
            throw r13.a(r15, "Unexpected exception getting progress tracker for existing download", defpackage.amqp.b(r0), 8, true);
     */
    /* JADX WARNING: Missing block: B:185:0x0469, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:186:0x046a, code skipped:
            r7 = r53;
            r1 = r0;
            r4 = r26;
     */
    /* JADX WARNING: Missing block: B:187:0x0471, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:188:0x0472, code skipped:
            r7 = r53;
            r1 = r0;
            r4 = r26;
     */
    /* JADX WARNING: Missing block: B:256:0x061c, code skipped:
            if (r7 >= r4.t()) goto L_0x061e;
     */
    /* JADX WARNING: Missing block: B:262:0x062d, code skipped:
            if (r7 < r4.t()) goto L_0x062f;
     */
    /* JADX WARNING: Missing block: B:263:0x062f, code skipped:
            r4 = r26;
     */
    /* JADX WARNING: Missing block: B:265:?, code skipped:
            r5 = r4.b;
            r7 = r1.a().a();
     */
    /* JADX WARNING: Missing block: B:266:0x063b, code skipped:
            r8 = r29;
     */
    /* JADX WARNING: Missing block: B:269:0x0645, code skipped:
            if (r5.a(r8, r7).c() == false) goto L_0x06b9;
     */
    /* JADX WARNING: Missing block: B:271:?, code skipped:
            r1.a().e();
     */
    /* JADX WARNING: Missing block: B:273:?, code skipped:
            r1.b().a().close();
     */
    /* JADX WARNING: Missing block: B:279:0x067f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:280:0x0680, code skipped:
            r7 = r53;
            r1 = r0;
            r4.a((defpackage.aghl) r3, r2, r8);
     */
    /* JADX WARNING: Missing block: B:281:0x0699, code skipped:
            throw r4.a(r25, "Failed to build canary writer for YTB file.", defpackage.amqp.b(r1), 12, r21.a());
     */
    /* JADX WARNING: Missing block: B:282:0x069a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:283:0x069b, code skipped:
            r7 = r53;
            r1 = r0;
            r4.a((defpackage.aghl) r3, r2, r8);
     */
    /* JADX WARNING: Missing block: B:284:0x06b8, code skipped:
            throw r4.a(r25, r1.getMessage(), defpackage.amqp.b(r1), r1.a, r21.a());
     */
    /* JADX WARNING: Missing block: B:285:0x06b9, code skipped:
            r7 = r53;
            r4.a((defpackage.aghl) r3, r2, r8);
     */
    /* JADX WARNING: Missing block: B:286:0x06cf, code skipped:
            throw r4.a(r25, "Could not find progress tracker for in-progress ytb download.", defpackage.ampo.a, 9, r21.a());
     */
    /* JADX WARNING: Missing block: B:287:0x06d0, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:288:0x06d1, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:289:0x06d4, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:290:0x06d5, code skipped:
            r7 = r53;
            r8 = r29;
     */
    /* JADX WARNING: Missing block: B:291:0x06d9, code skipped:
            r1 = r0;
            r4.a((defpackage.aghl) r3, r2, r8);
     */
    /* JADX WARNING: Missing block: B:292:0x06f0, code skipped:
            throw r4.a(r25, "Unexpected exception getting progress tracker from download state", defpackage.amqp.b(r1), 8, r21.a());
     */
    /* JADX WARNING: Missing block: B:293:0x06f1, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:294:0x06f2, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:295:0x06f6, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:296:0x06f7, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:297:0x06fb, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:298:0x06fc, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:299:0x0700, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:300:0x0701, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:305:0x0713, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:306:0x0715, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:311:0x0723, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:312:0x0724, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:313:0x0727, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:314:0x0728, code skipped:
            r7 = r53;
     */
    /* JADX WARNING: Missing block: B:315:0x072b, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:316:0x072c, code skipped:
            r4 = r13;
     */
    /* JADX WARNING: Missing block: B:317:0x072e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:318:0x072f, code skipped:
            r4 = r13;
     */
    /* JADX WARNING: Missing block: B:388:0x08e5, code skipped:
            if (((defpackage.azqx) r1.b()).d != false) goto L_0x08e7;
     */
    /* JADX WARNING: Missing block: B:426:0x0a68, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:427:0x0a69, code skipped:
            r1 = r0;
            r3 = r35;
     */
    /* JADX WARNING: Missing block: B:428:0x0a6e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:429:0x0a70, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:430:0x0a71, code skipped:
            r1 = r0;
            r3 = r35;
     */
    /* JADX WARNING: Missing block: B:431:0x0a75, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:432:0x0a76, code skipped:
            r1 = r0;
            r3 = r35;
     */
    /* JADX WARNING: Missing block: B:435:0x0a7e, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:436:0x0a7f, code skipped:
            r35 = r8;
     */
    /* JADX WARNING: Missing block: B:437:0x0a81, code skipped:
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:439:?, code skipped:
            r2 = r7.g;
            r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 41);
     */
    /* JADX WARNING: Missing block: B:440:0x0a93, code skipped:
            r3 = r35;
     */
    /* JADX WARNING: Missing block: B:442:?, code skipped:
            r4.append(r3);
            r4.append(r2);
            r4.append("] error while downloading video");
            defpackage.xtl.a(r4.toString(), r1);
     */
    /* JADX WARNING: Missing block: B:443:0x0aad, code skipped:
            r5 = "Error encountered while downloading the video";
     */
    /* JADX WARNING: Missing block: B:444:0x0ab1, code skipped:
            if (r7.u.a() != false) goto L_0x0abd;
     */
    /* JADX WARNING: Missing block: B:446:?, code skipped:
            r7.a(defpackage.agyc.a(r5, r1, defpackage.agqf.FAILED_UNKNOWN, 23));
     */
    /* JADX WARNING: Missing block: B:447:0x0abc, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:448:0x0abd, code skipped:
            r7.a(defpackage.agyc.b(r5, r1, defpackage.agqf.FAILED_UNKNOWN, 23));
     */
    /* JADX WARNING: Missing block: B:449:0x0ac6, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:450:0x0ac7, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:451:0x0ac8, code skipped:
            r3 = r35;
     */
    /* JADX WARNING: Missing block: B:452:0x0acb, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:453:0x0acc, code skipped:
            r3 = r8;
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:454:0x0ace, code skipped:
            r7.a(r7.u.a(r1));
     */
    /* JADX WARNING: Missing block: B:455:0x0ad7, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:458:0x0ada, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:459:0x0adb, code skipped:
            r3 = r8;
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:467:0x0b19, code skipped:
            r3 = new java.lang.String(r4);
     */
    /* JADX WARNING: Missing block: B:468:0x0b1f, code skipped:
            r3 = r4.concat(r3);
     */
    /* JADX WARNING: Missing block: B:471:0x0b31, code skipped:
            r7.a(defpackage.agyc.b(r3, r1, defpackage.agqf.FAILED_UNKNOWN, 1));
     */
    /* JADX WARNING: Missing block: B:472:0x0b3b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:473:0x0b3c, code skipped:
            r7.a(defpackage.agyc.a(r3, r1, defpackage.agqf.FAILED_UNKNOWN, 1));
     */
    /* JADX WARNING: Missing block: B:474:0x0b46, code skipped:
            return;
     */
    public final void run() {
        /*
        r53 = this;
        r7 = r53;
        r1 = "UTF-8";
        r8 = "pudl task[";
        r2 = 10;
        android.os.Process.setThreadPriority(r2);
        r3 = r7.g;	 Catch:{ Exception -> 0x0ae1 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0ae1 }
        r3.length();	 Catch:{ Exception -> 0x0ae1 }
        r3 = r7.u;	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r4 = r7.b;	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r4 = r4.h();	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r5 = r5.i();	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r6 = r7.f;	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r3.a(r4, r5, r6);	 Catch:{ agyc -> 0x0038, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        goto L_0x0038;
    L_0x0028:
        r0 = move-exception;
        r1 = r0;
        r3 = r8;
        goto L_0x0ae4;
    L_0x002d:
        r0 = move-exception;
        r1 = r0;
        r35 = r8;
        goto L_0x0a82;
    L_0x0033:
        r0 = move-exception;
        r1 = r0;
        r3 = r8;
        goto L_0x0ace;
    L_0x0038:
        r3 = r7.b;	 Catch:{ agyc -> 0x0ada, IOException -> 0x0acb, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r3 = r3.p();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r4 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r5.i();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r6 = r7.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r6.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = defpackage.agxj.b(r11);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r6.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = defpackage.agxj.o(r12);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = 0;
        r2 = 0;
        if (r12 == 0) goto L_0x006a;
    L_0x0059:
        r12 = android.text.TextUtils.isEmpty(r11);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r12 != 0) goto L_0x006a;
    L_0x005f:
        r11 = r3.a(r11, r14);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r11 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x006a;
    L_0x0066:
        r4 = r11.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r6 = r4;
        goto L_0x00bb;
    L_0x006a:
        r6 = r6.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r6 = defpackage.agxj.a(r6);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = 7;
        if (r6 != r11) goto L_0x00ba;
    L_0x0073:
        r6 = r5.a();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r6 != 0) goto L_0x0085;
    L_0x0079:
        r5 = r5.a;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r6 = "android.permission.WRITE_EXTERNAL_STORAGE";
        r5 = defpackage.ra.a(r5, r6);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r5 == 0) goto L_0x0085;
    L_0x0083:
        r6 = 4;
        goto L_0x00bb;
    L_0x0085:
        r5 = r4.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r5 = r5.b();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r4 = r4.c;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r6 = defpackage.agmn.a(r5, r4);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r6 == 0) goto L_0x0083;
    L_0x0093:
        r6 = "override_ytb_config";
        r6 = r4.getBoolean(r6, r2);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r6 == 0) goto L_0x00a6;
    L_0x009b:
        r5 = "enable_external_ytb_offlining";
        r4 = r4.getBoolean(r5, r2);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x0083;
    L_0x00a4:
        r6 = 3;
        goto L_0x00bb;
    L_0x00a6:
        if (r5 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x0083;
    L_0x00a9:
        r4 = r5.h;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x00af;
    L_0x00ad:
        r4 = defpackage.avoa.w;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
    L_0x00af:
        r4 = r4.d;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x00b5;
    L_0x00b3:
        r4 = defpackage.azqx.e;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
    L_0x00b5:
        r4 = r4.c;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r4 == 0) goto L_0x0083;
    L_0x00b9:
        goto L_0x00a4;
    L_0x00ba:
        r6 = 2;
    L_0x00bb:
        r4 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r7.j;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r25 = 0;
        r26 = 2;
        r21 = r4;
        r22 = r5;
        r23 = r11;
        r24 = r12;
        r27 = r6;
        r4 = r21.a(r22, r23, r24, r25, r26, r27);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r4.e;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = "spacecast_appliance_id";
        r5 = r5.b(r11);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r7.x = r5;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r5.h();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r5.i(r11);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r5 != 0) goto L_0x010e;
    L_0x00ed:
        r5 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r11 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r12 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r31 = r13.h();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.r;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r32 = r13.a();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.c;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r27 = r5;
        r28 = r11;
        r29 = r12;
        r30 = r4;
        r34 = r13;
        r27.a(r28, r29, r30, r31, r32, r34);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
    L_0x010e:
        r5 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        defpackage.ahad.a(r5, r4);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r5.m();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.t;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = defpackage.ahdl.a(r12);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r5 = r5.a(r11, r4, r12);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = android.text.TextUtils.isEmpty(r5);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r28 = 0;
        if (r11 != 0) goto L_0x014c;
    L_0x012d:
        r11 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r12 = r7.j;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r25 = 0;
        r26 = 1;
        r27 = 1;
        r21 = r11;
        r22 = r5;
        r23 = r12;
        r24 = r13;
        r11 = r21.a(r22, r23, r24, r25, r26, r27);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r12 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        defpackage.ahad.a(r12, r11);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r11;
        goto L_0x014e;
    L_0x014c:
        r13 = r28;
    L_0x014e:
        r11 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r15 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r15 = r15.h();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r10 = r7.a;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11.a(r12, r14, r15, r10);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r10 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.h;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r10 = r10.a(r11, r12, r4);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.s;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = r7.y;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r15 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r21 = r4.n();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r2 = r7.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r2 = r2.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r2 = defpackage.agxj.o(r2);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r23 = r4;
        r9 = r13;
        r4 = 3;
        r13 = r14;
        r14 = r15;
        r15 = r10;
        r16 = r21;
        r17 = r3;
        r18 = r2;
        r2 = r11.a(r12, r13, r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r9 == 0) goto L_0x01ae;
    L_0x0190:
        r11 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r12 = r7.g;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.h;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r15 = r11.a(r12, r13, r9);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r11 = r7.u;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r12 = r7.t;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r13 = r7.z;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r16 = r9.n();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        r18 = 0;
        r14 = r5;
        r17 = r3;
        r9 = r11.a(r12, r13, r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        goto L_0x01b0;
    L_0x01ae:
        r9 = r28;
    L_0x01b0:
        r11 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r11 = r11.j();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r11 == 0) goto L_0x01c1;
    L_0x01b8:
        r11 = r11.b();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        if (r11 == 0) goto L_0x01c1;
    L_0x01be:
        r11 = r11.a;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x002d, Exception -> 0x0028 }
        goto L_0x01c3;
    L_0x01c1:
        r11 = r28;
    L_0x01c3:
        r12 = defpackage.agmn.a(r6);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r12 == 0) goto L_0x07b0;
    L_0x01c9:
        r12 = r7.d;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r12.get();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r13 = r12;
        r13 = (defpackage.agoa) r13;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r7.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r12 = r12.q();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = r7.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r15 = r7.f;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = java.lang.String.valueOf(r14);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14.length();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r14 = r15.a;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r4 = r2.a;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x01ea;
    L_0x01e9:
        goto L_0x01f0;
    L_0x01ea:
        r4 = defpackage.agoa.a(r4);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r4 == 0) goto L_0x0282;
    L_0x01f0:
        r4 = r2.b;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x01f5;
    L_0x01f4:
        goto L_0x01fd;
    L_0x01f5:
        r4 = defpackage.agoa.a(r4);	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r4 != 0) goto L_0x01fd;
    L_0x01fb:
        goto L_0x0282;
    L_0x01fd:
        r4 = r2.e;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r17 = r4.getPath();	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        if (r17 == 0) goto L_0x026e;
    L_0x0205:
        r17 = r5;
        r5 = r2.i;	 Catch:{ agyc -> 0x0a7a, IOException -> 0x0033, InterruptedException -> 0x0a7e, Exception -> 0x0028 }
        r35 = r8;
        r8 = r13.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r8.b(r4, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r13.b;	 Catch:{ IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r4.a();	 Catch:{ IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r5.a(r14, r8);	 Catch:{ IOException -> 0x025b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = new java.util.ArrayList;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8.<init>();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = r11;
        r11 = r2.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r11 != 0) goto L_0x0227;
    L_0x0226:
        goto L_0x0236;
    L_0x0227:
        r11 = r11.x();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r11 == 0) goto L_0x0236;
    L_0x022d:
        r11 = r2.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = r11.x();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8.add(r11);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0236:
        r11 = r2.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r11 == 0) goto L_0x0249;
    L_0x023a:
        r11 = r11.x();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r11 == 0) goto L_0x0249;
    L_0x0240:
        r11 = r2.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = r11.x();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8.add(r11);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0249:
        r8 = defpackage.amul.a(r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = new agot;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11.<init>(r4, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = defpackage.agoc.a(r4, r11, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = defpackage.amqp.b(r4);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        goto L_0x028a;
    L_0x025b:
        r0 = move-exception;
        r1 = r0;
        r2 = "Unexpected exception getting progress tracker for existing download";
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 8;
        r18 = 1;
        r14 = r15;
        r15 = r2;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x026e:
        r35 = r8;
        r13.a(r3, r2, r14);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = "YTB URI exists but had no path for existing download.";
        r16 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 1;
        r18 = 1;
        r14 = r15;
        r15 = r1;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0282:
        r17 = r5;
        r35 = r8;
        r18 = r11;
        r4 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x028a:
        r5 = r4.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r5 == 0) goto L_0x02a8;
    L_0x0290:
        r1 = r4.b();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (defpackage.agoc) r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r21 = r4;
        r36 = r9;
        r24 = r10;
        r27 = r12;
        r26 = r13;
        r29 = r14;
        r25 = r15;
        r11 = 0;
        goto L_0x060d;
    L_0x02a8:
        r5 = r13.a;	 Catch:{ aanq -> 0x079c }
        r8 = r2.a();	 Catch:{ aanq -> 0x079c }
        r11 = r2.b();	 Catch:{ aanq -> 0x079c }
        r11 = defpackage.amqp.c(r11);	 Catch:{ aanq -> 0x079c }
        r21 = r2.c();	 Catch:{ aanq -> 0x079c }
        r21 = defpackage.amqp.c(r21);	 Catch:{ aanq -> 0x079c }
        r24 = r10;
        r10 = defpackage.ampo.a;	 Catch:{ aanq -> 0x079c }
        r25 = defpackage.atqq.f;	 Catch:{ aanq -> 0x079c }
        r25 = r25.createBuilder();	 Catch:{ aanq -> 0x079c }
        r36 = r9;
        r9 = r25;
        r9 = (defpackage.atqp) r9;	 Catch:{ aanq -> 0x079c }
        r9.a(r8);	 Catch:{ aanq -> 0x079c }
        r8 = new java.util.ArrayList;	 Catch:{ aanq -> 0x079c }
        r8.<init>();	 Catch:{ aanq -> 0x079c }
        r25 = r11.a();	 Catch:{ aanq -> 0x079c }
        if (r25 == 0) goto L_0x02f0;
    L_0x02dc:
        r11 = r11.b();	 Catch:{ aanq -> 0x02ea }
        r11 = (defpackage.aahr) r11;	 Catch:{ aanq -> 0x02ea }
        r11 = defpackage.aaxf.a(r11);	 Catch:{ aanq -> 0x02ea }
        r8.add(r11);	 Catch:{ aanq -> 0x02ea }
        goto L_0x02f0;
    L_0x02ea:
        r0 = move-exception;
        r1 = r0;
        r4 = r13;
        r5 = r15;
        goto L_0x07a0;
    L_0x02f0:
        r11 = r21.a();	 Catch:{ aanq -> 0x079c }
        if (r11 == 0) goto L_0x0303;
    L_0x02f6:
        r11 = r21.b();	 Catch:{ aanq -> 0x02ea }
        r11 = (defpackage.aahr) r11;	 Catch:{ aanq -> 0x02ea }
        r11 = defpackage.aaxf.a(r11);	 Catch:{ aanq -> 0x02ea }
        r8.add(r11);	 Catch:{ aanq -> 0x02ea }
    L_0x0303:
        r9.copyOnWrite();	 Catch:{ aanq -> 0x079c }
        r11 = r9.instance;	 Catch:{ aanq -> 0x079c }
        r11 = (defpackage.atqq) r11;	 Catch:{ aanq -> 0x079c }
        r21 = r4;
        r4 = r11.d;	 Catch:{ aanq -> 0x079c }
        r4 = r4.a();	 Catch:{ aanq -> 0x079c }
        if (r4 != 0) goto L_0x031c;
    L_0x0314:
        r4 = r11.d;	 Catch:{ aanq -> 0x02ea }
        r4 = defpackage.anxl.mutableCopy(r4);	 Catch:{ aanq -> 0x02ea }
        r11.d = r4;	 Catch:{ aanq -> 0x02ea }
    L_0x031c:
        r4 = r11.d;	 Catch:{ aanq -> 0x079c }
        defpackage.anvf.addAll(r8, r4);	 Catch:{ aanq -> 0x079c }
        r4 = r5.a(r9, r10);	 Catch:{ aanq -> 0x079c }
        r5 = r13.a;	 Catch:{ aanq -> 0x079c }
        r4 = r5.a(r4);	 Catch:{ aanq -> 0x079c }
        r4 = r4.c;	 Catch:{ aanq -> 0x079c }
        if (r4 != 0) goto L_0x0331;
    L_0x032f:
        r4 = defpackage.azqv.c;	 Catch:{ aanq -> 0x02ea }
    L_0x0331:
        r5 = r4.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = 2;
        r5 = r5 & r8;
        if (r5 == 0) goto L_0x078b;
    L_0x0337:
        r5 = r4.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r5 != 0) goto L_0x033d;
    L_0x033b:
        r5 = defpackage.azqt.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x033d:
        r8 = r4.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 != 0) goto L_0x0343;
    L_0x0341:
        r8 = defpackage.azqt.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0343:
        r8 = r8.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r8.size();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 == 0) goto L_0x077a;
    L_0x034b:
        r4 = r4.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r4 != 0) goto L_0x0351;
    L_0x034f:
        r4 = defpackage.azqt.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0351:
        r4 = r4.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r4.isEmpty();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 != 0) goto L_0x0769;
    L_0x0359:
        r8 = 0;
        r9 = r4.get(r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = (defpackage.azle) r9;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r9.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = defpackage.azlc.a(r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 == 0) goto L_0x0769;
    L_0x0368:
        r9 = 3;
        if (r8 != r9) goto L_0x0769;
    L_0x036b:
        r8 = r13.c;	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r8.a(r6, r5);	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r13.b;	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r15.a;	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = r8.a();	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r9.a(r10, r11);	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r5.d;	 Catch:{ agnx -> 0x0748, IOException -> 0x0731, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r25 = r15;
        r15 = r5.e;	 Catch:{ agnx -> 0x072e, IOException -> 0x072b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = r15.d();	 Catch:{ agnx -> 0x072e, IOException -> 0x072b, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r7 = r5.f;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.d();	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.g;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r5 == 0) goto L_0x0392;
    L_0x0391:
        goto L_0x0394;
    L_0x0392:
        r5 = defpackage.azqj.b;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0394:
        r26 = defpackage.azqp.h;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r26 = r26.createBuilder();	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r27 = r12;
        r12 = r26;
        r12 = (defpackage.azqo) r12;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r26 = defpackage.azqf.d;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r26 = r26.createBuilder();	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r29 = r14;
        r14 = r26;
        r14 = (defpackage.azqe) r14;	 Catch:{ agnx -> 0x0727, IOException -> 0x0723, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r26 = r13;
        r13 = defpackage.anxa.c();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r14.mergeFrom(r15, r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (defpackage.anvi) r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (defpackage.azqe) r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.copyOnWrite();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = r12.instance;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = (defpackage.azqp) r14;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r13.build();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (defpackage.anxl) r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (defpackage.azqf) r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14.b = r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r14.a;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r30 = 1;
        r13 = r13 | 1;
        r14.a = r13;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r5);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = 10;
        r10 = r10 << r13;
        r12.a(r10);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = "ftyp";
        r11 = 12;
        r11 = java.nio.ByteBuffer.allocate(r11);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = "yt4 ";
        r13 = r13.getBytes(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11.put(r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = 0;
        r11.putInt(r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = "qt  ";
        r1 = r13.getBytes(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11.put(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r11.array();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = defpackage.amqp.b(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = 1;
        r1 = defpackage.agny.a(r10, r11, r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = "moov";
        r7 = defpackage.amqp.b(r7);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = defpackage.agny.a(r1, r11, r7);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = "uuid[0]";
        r7 = defpackage.amqp.b(r15);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = 2;
        r1 = defpackage.agny.a(r1, r10, r7);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = "uuid[1]";
        r7 = defpackage.ampo.a;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = 4;
        r1 = defpackage.agny.a(r1, r10, r7);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r1.a();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.toBuilder();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = (defpackage.anxo) r7;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = (defpackage.azpy) r7;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.toByteArray();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.length;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (long) r5;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7.b(r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1.a(r7);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = "uuid[2]";
        r5 = defpackage.ampo.a;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = 3;
        r1 = defpackage.agny.a(r1, r7, r5);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r1.a();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.toBuilder();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = (defpackage.anxo) r5;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = (defpackage.azpy) r5;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r12.instance;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = (defpackage.azqp) r7;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.d;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r7 != 0) goto L_0x0479;
    L_0x0466:
        r7 = defpackage.azqb.b;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        goto L_0x0479;
    L_0x0469:
        r0 = move-exception;
        r7 = r53;
        r1 = r0;
        r4 = r26;
        goto L_0x0736;
    L_0x0471:
        r0 = move-exception;
        r7 = r53;
        r1 = r0;
        r4 = r26;
        goto L_0x074d;
    L_0x0479:
        r7 = r7.toByteArray();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.length;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (long) r7;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5.b(r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1.a(r5);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = "free";
        r5 = defpackage.ampo.a;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = 1;
        r1 = defpackage.agny.a(r1, r7, r5);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r1.a();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.toBuilder();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = (defpackage.anxo) r5;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = (defpackage.azpy) r5;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = -1;
        r5.b(r13);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1.a(r5);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r12.instance;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = (defpackage.azqp) r1;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r1.b;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r1 != 0) goto L_0x04b2;
    L_0x04b0:
        r1 = defpackage.azqf.d;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x04b2:
        r1 = r1.c;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r1.iterator();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x04b8:
        r5 = r1.hasNext();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r5 == 0) goto L_0x0526;
    L_0x04be:
        r5 = r1.next();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = (defpackage.azql) r5;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r5.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.size();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r7 == 0) goto L_0x051e;
    L_0x04cc:
        r7 = r5.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.size();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r7 < 0) goto L_0x0516;
    L_0x04d4:
        r7 = defpackage.azqr.h;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.createBuilder();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = (defpackage.azqq) r7;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = defpackage.azpz.g;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = r11.createBuilder();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = (defpackage.azpy) r11;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r15 = r5.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = 0;
        r15 = r15.get(r10);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r15 = (defpackage.azpz) r15;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = r15.b;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11.a(r10);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = r5.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r15 = 0;
        r10 = r10.get(r15);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = (defpackage.azpz) r10;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r10.e;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11.b(r13);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = -1;
        r11.a(r13);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7.a(r11);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.b;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r5 != 0) goto L_0x050e;
    L_0x050c:
        r5 = defpackage.azlk.f;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x050e:
        r7.a(r5);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12.a(r7);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = 4;
        goto L_0x04b8;
    L_0x0516:
        r1 = new agml;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r4 = "Yt4Writer: Got Yt4StreamData with unknown length?!";
        r1.<init>(r4);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        throw r1;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x051e:
        r1 = new agml;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r4 = "Yt4Writer: Got Yt4StreamData with no path?!";
        r1.<init>(r4);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        throw r1;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0526:
        r1 = r12.build();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = (defpackage.anxl) r1;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = (defpackage.azqp) r1;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r9.a(r1);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r9.c();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r1 == 0) goto L_0x0705;
    L_0x0537:
        r1 = new agot;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1.<init>(r8, r9);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r8.a();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r2.a;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r9 = r2.b;	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r10 = r4.iterator();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0548:
        r11 = r10.hasNext();	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r11 == 0) goto L_0x0603;
    L_0x054e:
        r11 = r10.next();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = (defpackage.azle) r11;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12 = r11.a;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = 1;
        r12 = r12 & r13;
        if (r12 == 0) goto L_0x0548;
    L_0x055a:
        r12 = defpackage.ampo.a;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r7 == 0) goto L_0x0571;
    L_0x055e:
        r13 = r7.r();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = r11.b;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r14 != 0) goto L_0x0568;
    L_0x0566:
        r14 = defpackage.azlk.f;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0568:
        r14 = r14.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r13 != r14) goto L_0x0571;
    L_0x056c:
        r12 = defpackage.amqp.b(r7);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        goto L_0x0586;
    L_0x0571:
        if (r9 == 0) goto L_0x0586;
    L_0x0573:
        r13 = r9.r();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = r11.b;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r14 != 0) goto L_0x057d;
    L_0x057b:
        r14 = defpackage.azlk.f;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x057d:
        r14 = r14.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r13 == r14) goto L_0x0582;
    L_0x0581:
        goto L_0x0586;
    L_0x0582:
        r12 = defpackage.amqp.b(r9);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0586:
        r13 = r12.a();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r13 == 0) goto L_0x0548;
    L_0x058c:
        r12 = r12.b();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12 = (defpackage.agql) r12;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r11.a;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r13 & 16;
        if (r13 == 0) goto L_0x05a3;
    L_0x0598:
        r13 = r11.f;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = r13.d();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = defpackage.amqp.b(r13);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        goto L_0x05a5;
    L_0x05a3:
        r13 = defpackage.ampo.a;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x05a5:
        r14 = r11.d;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = r14.d();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = r11.e;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = r11.d();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r15 = defpackage.anxa.c();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r16 = r7;
        r7 = defpackage.azxz.c;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = defpackage.anxl.parseFrom(r7, r14, r15);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = (defpackage.azxz) r7;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12 = r12.y();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12 = r12.a(r5);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r12 = r12.c(r6);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r14 = r13.a();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r14 == 0) goto L_0x05d8;
    L_0x05d1:
        r13 = r13.b();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = (byte[]) r13;	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        goto L_0x05da;
    L_0x05d8:
        r13 = r28;
    L_0x05da:
        r12 = r12.a(r13);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r12.a(r7);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.b(r11);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = 1;
        r7 = r7.b(r11);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r11 = 0;
        r7 = r7.a(r11);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.a();	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r13 = defpackage.agoa.a(r7);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        defpackage.amqw.b(r13);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r3.b(r7);	 Catch:{ agnx -> 0x0471, IOException -> 0x0469, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r16;
        goto L_0x0548;
    L_0x0603:
        r11 = 0;
        r4 = defpackage.amul.a(r4);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = defpackage.agoc.a(r8, r1, r4);	 Catch:{ agnx -> 0x071d, IOException -> 0x0717, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x060d:
        r4 = r2.a;	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r4 != 0) goto L_0x0612;
    L_0x0611:
        goto L_0x061e;
    L_0x0612:
        r7 = r4.c();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r4 = r4.t();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 < 0) goto L_0x062f;
    L_0x061e:
        r4 = r2.b;	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r4 != 0) goto L_0x0623;
    L_0x0622:
        goto L_0x0659;
    L_0x0623:
        r7 = r4.c();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r4 = r4.t();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 >= 0) goto L_0x0659;
    L_0x062f:
        r4 = r26;
        r5 = r4.b;	 Catch:{ IOException -> 0x06d4, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r1.a();	 Catch:{ IOException -> 0x06d4, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r7.a();	 Catch:{ IOException -> 0x06d4, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r8 = r29;
        r5 = r5.a(r8, r7);	 Catch:{ IOException -> 0x06d0, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.c();	 Catch:{ IOException -> 0x06d0, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        if (r5 == 0) goto L_0x06b9;
    L_0x0647:
        r5 = r1.a();	 Catch:{ agnx -> 0x069a }
        r5.e();	 Catch:{ agnx -> 0x069a }
        r5 = r1.b();	 Catch:{ IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r5.a();	 Catch:{ IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5.close();	 Catch:{ IOException -> 0x067f, agyc -> 0x0700, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
    L_0x0659:
        r4 = new agox;	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = r1.b();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r1.c();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r8 = r27;
        r4.<init>(r5, r7, r8);	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r1 = r1.a();	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5 = new agnq;	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r5.<init>(r4, r1);	 Catch:{ agyc -> 0x0700, IOException -> 0x06fb, InterruptedException -> 0x06f6, Exception -> 0x06f1 }
        r7 = r53;
        r1 = r7.k;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r5.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.b = r4;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r5.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r1;
        r8 = 0;
        goto L_0x07bf;
    L_0x067f:
        r0 = move-exception;
        r7 = r53;
        r1 = r0;
        r4.a(r3, r2, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = "Failed to build canary writer for YTB file.";
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = r21.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 12;
        r13 = r4;
        r14 = r25;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x069a:
        r0 = move-exception;
        r7 = r53;
        r1 = r0;
        r4.a(r3, r2, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = r1.getMessage();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = r21.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r13 = r4;
        r14 = r25;
        r17 = r1;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x06b9:
        r7 = r53;
        r4.a(r3, r2, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = "Could not find progress tracker for in-progress ytb download.";
        r16 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = r21.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 9;
        r13 = r4;
        r14 = r25;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x06d0:
        r0 = move-exception;
        r7 = r53;
        goto L_0x06d9;
    L_0x06d4:
        r0 = move-exception;
        r7 = r53;
        r8 = r29;
    L_0x06d9:
        r1 = r0;
        r4.a(r3, r2, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = "Unexpected exception getting progress tracker from download state";
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = r21.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 8;
        r13 = r4;
        r14 = r25;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x06f1:
        r0 = move-exception;
        r7 = r53;
        goto L_0x0a69;
    L_0x06f6:
        r0 = move-exception;
        r7 = r53;
        goto L_0x0a81;
    L_0x06fb:
        r0 = move-exception;
        r7 = r53;
        goto L_0x0a71;
    L_0x0700:
        r0 = move-exception;
        r7 = r53;
        goto L_0x0a76;
    L_0x0705:
        r7 = r53;
        r4 = r26;
        r1 = new agnx;	 Catch:{ agnx -> 0x0715, IOException -> 0x0713, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = "Tried to write initial progress but progress DB did not have it.";
        r6 = 15;
        r1.<init>(r6, r5);	 Catch:{ agnx -> 0x0715, IOException -> 0x0713, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agnx -> 0x0715, IOException -> 0x0713, agyc -> 0x0a75, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0713:
        r0 = move-exception;
        goto L_0x0735;
    L_0x0715:
        r0 = move-exception;
        goto L_0x074c;
    L_0x0717:
        r0 = move-exception;
        r7 = r53;
        r4 = r26;
        goto L_0x0735;
    L_0x071d:
        r0 = move-exception;
        r7 = r53;
        r4 = r26;
        goto L_0x074c;
    L_0x0723:
        r0 = move-exception;
        r7 = r53;
        goto L_0x072c;
    L_0x0727:
        r0 = move-exception;
        r7 = r53;
        goto L_0x072f;
    L_0x072b:
        r0 = move-exception;
    L_0x072c:
        r4 = r13;
        goto L_0x0735;
    L_0x072e:
        r0 = move-exception;
    L_0x072f:
        r4 = r13;
        goto L_0x074c;
    L_0x0731:
        r0 = move-exception;
        r4 = r13;
        r25 = r15;
    L_0x0735:
        r1 = r0;
    L_0x0736:
        r15 = "Failed to create new YT4, or update DB for new YT4.";
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 1;
        r18 = 0;
        r13 = r4;
        r14 = r25;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0748:
        r0 = move-exception;
        r4 = r13;
        r25 = r15;
    L_0x074c:
        r1 = r0;
    L_0x074d:
        r5 = r25;
        r6 = r5.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4.a(r3, r2, r6);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r15 = r1.getMessage();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r16 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r18 = 0;
        r13 = r4;
        r14 = r5;
        r17 = r1;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0769:
        r4 = r13;
        r5 = r15;
        r15 = "Unsupported encryption type in YTB blueprint.";
        r16 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 6;
        r18 = 0;
        r13 = r4;
        r14 = r5;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x077a:
        r4 = r13;
        r5 = r15;
        r15 = "No encryption info provided in YTB Blueprint.";
        r16 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 5;
        r18 = 0;
        r13 = r4;
        r14 = r5;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x078b:
        r4 = r13;
        r5 = r15;
        r15 = "No yt4 skeleton in blueprint response?!";
        r16 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r17 = 4;
        r18 = 0;
        r13 = r4;
        r14 = r5;
        r1 = r13.a(r14, r15, r16, r17, r18);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x079c:
        r0 = move-exception;
        r4 = r13;
        r5 = r15;
        r1 = r0;
    L_0x07a0:
        r2 = 3;
        r8 = 0;
        r4.a(r5, r2, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = "Cannot retrieve ytb blueprint response from the server.";
        r3 = defpackage.agqf.NETWORK_READ_ERROR;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = 25;
        r1 = defpackage.agyc.b(r2, r1, r3, r4);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        throw r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x07b0:
        r17 = r5;
        r35 = r8;
        r36 = r9;
        r24 = r10;
        r18 = r11;
        r8 = 0;
        r11 = 0;
        r9 = r28;
    L_0x07bf:
        r1 = r7.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r3.a(r1, r11);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r10.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r13 = r10.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r36 != 0) goto L_0x07d2;
    L_0x07cb:
        r16 = r9;
        r1 = r24;
        r15 = r36;
        goto L_0x07de;
    L_0x07d2:
        r16 = r9;
        r15 = r36;
        r8 = r15.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r3 + r8;
        r8 = r15.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r13 = r13 + r8;
        r1 = r24;
    L_0x07de:
        r1 = r1.l;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = defpackage.agxj.a(r1, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r7.w = r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x07ec;
    L_0x07ea:
        r8 = 1;
        goto L_0x07ed;
    L_0x07ec:
        r8 = 0;
    L_0x07ed:
        r1 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.c = r13;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.a(r5, r13);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r24 = 0;
        r1 = r53;
        r9 = r2;
        r5 = 0;
        r19 = 4;
        r2 = r3;
        r38 = r17;
        r37 = r23;
        r4 = r24;
        r20 = r6;
        r6 = r8;
        r1.a(r2, r4, r6);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r7.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.a = r2;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.b = r11;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.l;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x082f;
    L_0x0819:
        r1 = r7.k;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agmn.a(r20);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.c = r2;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.k;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r7.l = r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.l;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.b = r2;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x082f:
        r1 = r9.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agzx.a(r1, r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x0838;
    L_0x0837:
        goto L_0x089f;
    L_0x0838:
        r3 = r10.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r3 == 0) goto L_0x0845;
    L_0x083c:
        r4 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r4.a(r3, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        goto L_0x084d;
    L_0x0845:
        r3 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r3.a(r1, r4);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x084d:
        r44 = r3;
        r3 = r7.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.l;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r46 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r48 = r8.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = defpackage.agmn.a(r20);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 != 0) goto L_0x086a;
    L_0x0867:
        r49 = r18;
        goto L_0x086c;
    L_0x086a:
        r49 = r28;
    L_0x086c:
        r8 = r7.o;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = r8.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r8.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r12 = r7.e;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r39 = r3;
        r40 = r4;
        r41 = r5;
        r42 = r6;
        r43 = r1;
        r50 = r11;
        r51 = r8;
        r52 = r12;
        defpackage.ahad.a(r39, r40, r41, r42, r43, r44, r46, r48, r49, r50, r51, r52);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r3.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r11 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r4 + r11;
        r3.b = r4;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.f;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r5.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3.a(r4, r1, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x089f:
        r1 = r7.v;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x0a67;
    L_0x08a3:
        if (r16 == 0) goto L_0x08ea;
    L_0x08a5:
        r1 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r1.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = defpackage.ahda.b(r3);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r3 != 0) goto L_0x08e7;
    L_0x08af:
        r1 = r1.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.b();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 == 0) goto L_0x08d5;
    L_0x08b7:
        r3 = r1.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r3 != 0) goto L_0x08bd;
    L_0x08bb:
        r3 = defpackage.avoa.w;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x08bd:
        r3 = r3.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r3 & 4;
        if (r3 != 0) goto L_0x08c4;
    L_0x08c3:
        goto L_0x08d5;
    L_0x08c4:
        r1 = r1.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x08ca;
    L_0x08c8:
        r1 = defpackage.avoa.w;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x08ca:
        r1 = r1.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x08d0;
    L_0x08ce:
        r1 = defpackage.azqx.e;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x08d0:
        r1 = defpackage.amqp.b(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        goto L_0x08d7;
    L_0x08d5:
        r1 = defpackage.ampo.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x08d7:
        r3 = r1.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r3 == 0) goto L_0x08ea;
    L_0x08dd:
        r1 = r1.b();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (defpackage.azqx) r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 == 0) goto L_0x08ea;
    L_0x08e7:
        r16.c();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x08ea:
        r1 = r9.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agzx.a(r1, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x08f3;
    L_0x08f2:
        goto L_0x095a;
    L_0x08f3:
        r3 = r10.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r3 == 0) goto L_0x0900;
    L_0x08f7:
        r4 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r4.a(r3, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        goto L_0x0908;
    L_0x0900:
        r3 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r3.a(r1, r4);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0908:
        r44 = r3;
        r3 = r7.i;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.l;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r46 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r48 = r8.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = defpackage.agmn.a(r20);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 != 0) goto L_0x0925;
    L_0x0922:
        r49 = r18;
        goto L_0x0927;
    L_0x0925:
        r49 = r28;
    L_0x0927:
        r8 = r7.o;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r8.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r8.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r7.e;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r39 = r3;
        r40 = r4;
        r41 = r5;
        r42 = r6;
        r43 = r1;
        r50 = r9;
        r51 = r8;
        r52 = r10;
        defpackage.ahad.a(r39, r40, r41, r42, r43, r44, r46, r48, r49, r50, r51, r52);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r3.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r4 + r8;
        r3.b = r4;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.u;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.f;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r5.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3.a(r4, r1, r5);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x095a:
        r1 = r7.v;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x0a67;
    L_0x095e:
        if (r15 == 0) goto L_0x0a0a;
    L_0x0960:
        r1 = r7.m;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x0975;
    L_0x0964:
        r1 = r7.k;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = 0;
        r1.c = r3;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r7.m = r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.m;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.b = r3;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0975:
        r1 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r8 = r38;
        r1.a = r8;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r15.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agzx.a(r1, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 == 0) goto L_0x09bd;
    L_0x0983:
        r3 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.m;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r28 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r30 = r6.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.p;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r6.c;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r6.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r7.e;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r26 = 0;
        r21 = r8;
        r22 = r3;
        r23 = r4;
        r24 = r5;
        r25 = r1;
        r31 = r18;
        r32 = r9;
        r33 = r6;
        r34 = r10;
        defpackage.ahad.a(r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r3.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r4 + r9;
        r3.b = r4;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x09bd:
        r1 = r7.v;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 == 0) goto L_0x09c3;
    L_0x09c1:
        goto L_0x0a67;
    L_0x09c3:
        r1 = r15.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agzx.a(r1, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 == 0) goto L_0x0a05;
    L_0x09cb:
        r3 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r7.h;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r5 = r7.m;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r28 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r30 = r6.p();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r7.p;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r6.d;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r6 = r6.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r10 = r7.e;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r26 = 0;
        r21 = r8;
        r22 = r3;
        r23 = r4;
        r24 = r5;
        r25 = r1;
        r31 = r18;
        r32 = r9;
        r33 = r6;
        r34 = r10;
        defpackage.ahad.a(r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r7.n;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r3.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r9 = r1.t();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r4 = r4 + r9;
        r3.b = r4;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0a05:
        r1 = r7.v;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r1 != 0) goto L_0x0a67;
    L_0x0a09:
        goto L_0x0a0c;
    L_0x0a0a:
        r8 = r38;
    L_0x0a0c:
        r6 = r2;
        r4 = 0;
        r1 = r53;
        r2 = r13;
        r1.a(r2, r4, r6);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.i();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r2.h();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r37;
        defpackage.ahad.a(r3, r1, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.length();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        if (r8 == 0) goto L_0x0a5c;
    L_0x0a31:
        r1 = r7.b;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.h();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = defpackage.agqf.COMPLETE;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.b(r8, r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = defpackage.avqw.B;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.createBuilder();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (defpackage.avqv) r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.a(r8);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = 1;
        r1.a(r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = 5;
        r1.c(r2);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = r1.build();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (defpackage.anxl) r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1 = (defpackage.avqw) r1;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r7.q;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2.a(r1);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0a5c:
        r1 = r7.a;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r2 = r7.g;	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r3 = r53.a();	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
        r1.a(r2, r3);	 Catch:{ agyc -> 0x0a75, IOException -> 0x0a70, InterruptedException -> 0x0a6e, Exception -> 0x0a68 }
    L_0x0a67:
        return;
    L_0x0a68:
        r0 = move-exception;
    L_0x0a69:
        r1 = r0;
        r3 = r35;
        goto L_0x0ae4;
    L_0x0a6e:
        r0 = move-exception;
        goto L_0x0a81;
    L_0x0a70:
        r0 = move-exception;
    L_0x0a71:
        r1 = r0;
        r3 = r35;
        goto L_0x0ace;
    L_0x0a75:
        r0 = move-exception;
    L_0x0a76:
        r1 = r0;
        r3 = r35;
        goto L_0x0add;
    L_0x0a7a:
        r0 = move-exception;
        r1 = r0;
        r3 = r8;
        goto L_0x0add;
    L_0x0a7e:
        r0 = move-exception;
        r35 = r8;
    L_0x0a81:
        r1 = r0;
    L_0x0a82:
        r2 = r7.g;	 Catch:{ Exception -> 0x0ac7 }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x0ac7 }
        r3 = r3.length();	 Catch:{ Exception -> 0x0ac7 }
        r3 = r3 + 41;
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0ac7 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0ac7 }
        r3 = r35;
        r4.append(r3);	 Catch:{ Exception -> 0x0ad8 }
        r4.append(r2);	 Catch:{ Exception -> 0x0ad8 }
        r2 = "] error while downloading video";
        r4.append(r2);	 Catch:{ Exception -> 0x0ad8 }
        r2 = r4.toString();	 Catch:{ Exception -> 0x0ad8 }
        defpackage.xtl.a(r2, r1);	 Catch:{ Exception -> 0x0ad8 }
        r2 = r7.u;	 Catch:{ Exception -> 0x0ad8 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0ad8 }
        r4 = 23;
        r5 = "Error encountered while downloading the video";
        if (r2 != 0) goto L_0x0abd;
    L_0x0ab3:
        r2 = defpackage.agqf.FAILED_UNKNOWN;	 Catch:{ Exception -> 0x0ad8 }
        r1 = defpackage.agyc.a(r5, r1, r2, r4);	 Catch:{ Exception -> 0x0ad8 }
        r7.a(r1);	 Catch:{ Exception -> 0x0ad8 }
        return;
    L_0x0abd:
        r2 = defpackage.agqf.FAILED_UNKNOWN;	 Catch:{ Exception -> 0x0ad8 }
        r1 = defpackage.agyc.b(r5, r1, r2, r4);	 Catch:{ Exception -> 0x0ad8 }
        r7.a(r1);	 Catch:{ Exception -> 0x0ad8 }
        return;
    L_0x0ac7:
        r0 = move-exception;
        r3 = r35;
        goto L_0x0ae3;
    L_0x0acb:
        r0 = move-exception;
        r3 = r8;
        r1 = r0;
    L_0x0ace:
        r2 = r7.u;	 Catch:{ Exception -> 0x0ad8 }
        r1 = r2.a(r1);	 Catch:{ Exception -> 0x0ad8 }
        r7.a(r1);	 Catch:{ Exception -> 0x0ad8 }
        return;
    L_0x0ad8:
        r0 = move-exception;
        goto L_0x0ae3;
    L_0x0ada:
        r0 = move-exception;
        r3 = r8;
        r1 = r0;
    L_0x0add:
        r7.a(r1);	 Catch:{ Exception -> 0x0ad8 }
        return;
    L_0x0ae1:
        r0 = move-exception;
        r3 = r8;
    L_0x0ae3:
        r1 = r0;
    L_0x0ae4:
        r2 = r7.g;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 37;
        r5.<init>(r4);
        r5.append(r3);
        r5.append(r2);
        r2 = "] error while pinning video";
        r5.append(r2);
        r2 = r5.toString();
        defpackage.xtl.a(r2, r1);
        r2 = defpackage.afpf.offline;
        r3 = r1.getMessage();
        r3 = java.lang.String.valueOf(r3);
        r4 = "VideoAd pin exception: ";
        r5 = r3.length();
        if (r5 != 0) goto L_0x0b1f;
    L_0x0b19:
        r3 = new java.lang.String;
        r3.<init>(r4);
        goto L_0x0b23;
    L_0x0b1f:
        r3 = r4.concat(r3);
    L_0x0b23:
        r4 = 2;
        defpackage.afpc.a(r4, r2, r3, r1);
        r2 = r7.u;
        r2 = r2.a();
        r3 = "Error encountered while pinning the video";
        if (r2 == 0) goto L_0x0b3c;
    L_0x0b31:
        r2 = defpackage.agqf.FAILED_UNKNOWN;
        r4 = 1;
        r1 = defpackage.agyc.b(r3, r1, r2, r4);
        r7.a(r1);
        return;
    L_0x0b3c:
        r4 = 1;
        r2 = defpackage.agqf.FAILED_UNKNOWN;
        r1 = defpackage.agyc.a(r3, r1, r2, r4);
        r7.a(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzx.run():void");
    }

    public final void a(int i) {
        String.valueOf(this.g).length();
        boolean z = true;
        this.v = true;
        if ((i & 128) != 0) {
            z = false;
        }
        aivp aivp = this.l;
        if (aivp != null) {
            aivp.a(z);
        }
    }

    public final void a(long j, double d, boolean z) {
        this.a.a(this.g, j, d, z);
    }

    private final void a(agyc agyc) {
        String str = "pudl task[";
        String str2;
        String message;
        StringBuilder stringBuilder;
        if (agyc.a) {
            str2 = this.g;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 20) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("] failed: ");
            stringBuilder.append(message);
            xtl.a(stringBuilder.toString(), agyc.getCause());
        } else {
            str2 = this.g;
            message = agyc.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str2).length() + 13) + String.valueOf(message).length());
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append("]: ");
            stringBuilder.append(message);
            xtl.d(stringBuilder.toString());
        }
        this.a.a(this.g, agyc, a());
    }

    private static boolean a(agql agql, boolean z) {
        boolean z2 = true;
        if (!z) {
            if (agql != null) {
                return !agql.u() ? z2 : false;
            } else {
                z2 = false;
            }
        }
    }

    private final agpw a() {
        agpw agpw = this.f.g;
        agxj.d(agpw, this.o.b() + this.p.b());
        agxj.e(agpw, this.o.a() + this.p.a());
        if (!amqu.a(this.x)) {
            agxj.f(agpw, this.x);
            if (this.w) {
                agxj.B(agpw);
            } else {
                agxj.C(agpw);
            }
        }
        return agpw;
    }
}
