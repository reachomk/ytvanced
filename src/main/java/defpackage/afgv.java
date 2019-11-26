package defpackage;

/* renamed from: afgv */
public final class afgv {
    public final aahr[] a;
    public final aahr[] b;
    public final aahr c;
    public final aajq[] d;
    public final aahn[] e;
    public final afgq f;
    public final afgt g;
    public final int h;

    private afgv(aahr[] aahrArr, aahr[] aahrArr2, aahr aahr, aajq[] aajqArr, aahn[] aahnArr, afgq afgq, afgt afgt) {
        this(aahrArr, aahrArr2, aahr, aajqArr, aahnArr, afgq, afgt, Integer.MAX_VALUE);
    }

    public afgv(aahr[] aahrArr, aahr[] aahrArr2, aahr aahr, aajq[] aajqArr, aahn[] aahnArr, afgq afgq, afgt afgt, int i) {
        this.a = (aahr[]) amqw.a((Object) aahrArr);
        this.b = (aahr[]) amqw.a((Object) aahrArr2);
        this.c = aahr;
        this.d = (aajq[]) amqw.a((Object) aajqArr);
        this.e = (aahn[]) amqw.a((Object) aahnArr);
        this.f = (afgq) amqw.a((Object) afgq);
        this.g = (afgt) amqw.a((Object) afgt);
        this.h = i;
    }

    public final boolean a() {
        return this.c != null && aahv.g().contains(Integer.valueOf(this.c.b()));
    }

    public final boolean b() {
        aahr aahr = this.c;
        if (aahr != null) {
            arlv arlv = aahr.a;
            if ((arlv.a & 536870912) != 0) {
                arlp arlp = arlv.z;
                if (arlp == null) {
                    arlp = arlp.d;
                }
                int a = arln.a(arlp.c);
                if (a != 0 && a == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String c() {
        afgt afgt = this.g;
        Object obj = "none";
        if (afgt.f != -1) {
            long j = afgt.h;
            if (j != -1) {
                j = Math.round(Math.pow(1.6d, (double) Math.round(Math.log((double) (j / 1000)) / Math.log(1.6d))));
                int i = this.g.g;
                if (i != -2) {
                    obj = String.valueOf(i);
                }
                i = d();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 44);
                stringBuilder.append("dt.");
                stringBuilder.append(j);
                stringBuilder.append(";lmq.");
                stringBuilder.append(i);
                stringBuilder.append(";dir.");
                stringBuilder.append(obj);
                return stringBuilder.toString();
            }
        }
        return obj;
    }

    public final int d() {
        return this.g.f;
    }

    static {
        afgv afgv = new afgv(new aahr[0], new aahr[0], new aahr(arlv.E, null, 0), new aajq[0], new aahn[0], afgq.a, new afgt(afgq.a, ""));
    }
}
