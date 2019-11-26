package defpackage;

import android.content.Context;
import java.util.TimeZone;

/* renamed from: prc */
public final class prc {
    public final int a;
    public final String b;
    public String c;
    public String d;
    public final rjm e;
    public final pre f;
    public pre g;
    public final boolean h = true;
    public final rjx i = new rjx();
    public boolean j;
    public final /* synthetic */ prd k;

    public /* synthetic */ prc(prd prd, pre pre) {
        this.k = prd;
        prd prd2 = this.k;
        this.a = prd2.f;
        this.b = prd2.e;
        this.c = prd2.g;
        this.d = prd2.h;
        this.e = prd2.j;
        boolean z = false;
        this.j = false;
        this.c = prd.g;
        this.d = prd.h;
        rjx rjx = this.i;
        Context context = prd.b;
        if (qtr.a() && !qtr.a(context)) {
            z = true;
        }
        rjx.g = z;
        this.i.a = prd.l.a();
        this.i.b = prd.l.b();
        rjx rjx2 = this.i;
        prh prh = prd.m;
        rjx2.e = (long) (TimeZone.getDefault().getOffset(rjx2.a) / 1000);
        this.f = pre;
    }
}
