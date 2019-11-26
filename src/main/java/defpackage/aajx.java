package defpackage;

import java.util.List;

/* renamed from: aajx */
public final class aajx {
    public static final aajx a;
    @Deprecated
    public static final aajx b;
    public static final xto c = new aajw("VideoStreamingDataFactory.Lazy<VideoStreamingData>.create()");
    private final aajz[] d;

    public static aajs a(String str, List list) {
        aajx aajx = a;
        ateq ateq = (ateq) aten.j.createBuilder();
        for (arlv arlv : list) {
            arlx arlx = (arlx) arlv.E.createBuilder();
            arlx.a(arlv.c);
            arlx.b(arlv.f);
            arlx.b(arlv.e);
            int i = arlv.c;
            StringBuilder stringBuilder = new StringBuilder(28);
            stringBuilder.append("http://oda/?itag=");
            stringBuilder.append(i);
            arlx.a(stringBuilder.toString());
            i = arlv.i;
            if (i > 0 && arlv.j > 0) {
                arlx.c(i);
                arlx.d(arlv.j);
            }
            ateq.b((arlv) ((anxl) arlx.build()));
        }
        return aajx.a((aten) ((anxl) ateq.build()), str, -9223372036854775807L);
    }

    public static aajs a(int i) {
        ateq ateq = (ateq) aten.j.createBuilder();
        arlx arlx = (arlx) arlv.E.createBuilder();
        arlx.a(i);
        arlx.d(144);
        ateq.copyOnWrite();
        aten aten = (aten) ateq.instance;
        aten.b();
        aten.d.add((arlv) ((anxl) arlx.build()));
        return a.a((aten) ((anxl) ateq.build()), "zzzzzzzzzzz", -9223372036854775807L);
    }

    public aajx(aajz aajz, aajz... aajzArr) {
        aajz = (aajz) amqw.a((Object) aajz);
        aajzArr = (aajz[]) amqw.a((Object) aajzArr);
        int length = aajzArr.length;
        aajz[] aajzArr2 = new aajz[(length + 1)];
        aajzArr2[0] = aajz;
        System.arraycopy(aajzArr, 0, aajzArr2, 1, length);
        this(aajzArr2);
    }

    private aajx(aajz... aajzArr) {
        this.d = aajzArr;
    }

    public final aajs a(aten aten, String str, long j) {
        return a(aten, str, null, j, 0, false, false, false, 0, new aajo(), "", aajj.b);
    }

    public final aajs a(aten aten, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, int i, aajo aajo, String str3, aajj aajj) {
        aajs a;
        aajs aajs = new aajs(aten, str, j, j2, z, z2, z3, i, aajo, str3, aajj);
        for (aajz a2 : this.d) {
            a = a2.a(a, str2);
        }
        return a;
    }

    static {
        aajx aajx = new aajx(new aajz[0]);
        a = aajx;
        b = aajx;
    }
}
