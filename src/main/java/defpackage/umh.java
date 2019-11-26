package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* renamed from: umh */
public final class umh implements ume {
    public umk a;
    public Date b;
    public Date c;
    public Long d;
    public Long e;
    public Float f;
    public Float g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Long l;
    public umb m;

    /* renamed from: b */
    public final ckg a() {
        amqw.a(this.a);
        amqw.a(this.m);
        ckg ckg = new ckg();
        cis ckf = new ckf();
        Long l = this.e;
        if (l != null) {
            ckf.a(l.longValue());
        }
        Float f = this.f;
        if (f != null) {
            ckf.f = (double) f.floatValue();
        }
        f = this.g;
        if (f != null) {
            ckf.g = (double) f.floatValue();
        }
        Boolean bool = this.h;
        if (bool != null) {
            ckf.a(bool.booleanValue());
        }
        bool = this.i;
        if (bool != null) {
            ckf.b(bool.booleanValue());
        }
        Date date = this.b;
        if (date != null) {
            ckf.a(date);
        }
        date = this.c;
        if (date != null) {
            ckf.b(date);
        }
        ckg.a(ckf);
        ckf = new cjh();
        cis cjk = new cjk();
        Date date2 = this.b;
        if (date2 != null) {
            cjk.a = date2;
        }
        Long l2 = this.d;
        if (l2 != null) {
            cjk.c = l2.longValue();
        }
        l2 = this.e;
        if (l2 != null) {
            cjk.d = l2.longValue();
        }
        date2 = this.c;
        if (date2 != null) {
            cjk.b = date2;
        }
        ckf.a(cjk);
        cjk = new cjf();
        cjk.a = this.a.b;
        cjk.b = "VideoHandler";
        ckf.a(cjk);
        cjk = new cjj();
        cjk.a((cip) this.a.c.get());
        cis cix = new cix();
        cis cja = new cja();
        cis ciy = new ciy();
        ciy.m = 1;
        cja.a(ciy);
        cix.a(cja);
        cjk.a(cix);
        cix = new cju();
        cja = new cjs();
        cja.a(this.m.a());
        cix.a(cja);
        cja = new cke();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ckd(1, (long) this.j.intValue()));
        cja.a = arrayList;
        cix.a(cja);
        cja = new cjt();
        arrayList = new ArrayList(1);
        arrayList.add(new cjw(1, 1, 1));
        cja.a = arrayList;
        cix.a(cja);
        cja = new cjr();
        if (this.k != null) {
            cja.a = new long[]{(long) this.k.intValue()};
        }
        cix.a(cja);
        cja = new cjy();
        if (this.l != null) {
            cja.a = new long[]{this.l.longValue()};
        }
        cix.a(cja);
        cjk.a(cix);
        ckf.a(cjk);
        ckg.a(ckf);
        return ckg;
    }
}
