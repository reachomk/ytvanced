package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: umf */
public final class umf implements ume {
    public Date a;
    public Date b;
    public Integer c;
    public Long d;
    public final List e = new ArrayList();
    public int f = 1;

    public final /* synthetic */ cis a() {
        cis cjo = new cjo();
        Date date = this.a;
        if (date != null) {
            cjo.a(date);
        }
        date = this.b;
        if (date != null) {
            cjo.b(date);
        }
        Integer num = this.c;
        if (num != null) {
            cjo.c = (long) num.intValue();
        }
        Long l = this.d;
        if (l != null) {
            cjo.a(l.longValue());
        }
        cjo.e = (long) this.f;
        cjl cjl = new cjl();
        cjl.a(cjo);
        for (umh a : this.e) {
            cjl.a((ckg) a.a());
        }
        return cjl;
    }
}
