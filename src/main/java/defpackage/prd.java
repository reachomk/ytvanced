package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: prd */
public final class prd {
    @Deprecated
    public static final pso a = new pso("ClearcutLogger.API", p, o);
    private static final psv o = new psv();
    private static final psq p = new prz();
    public final Context b;
    public final String c;
    public final int d;
    public final String e;
    public int f = -1;
    public final String g;
    public final String h;
    public final boolean i;
    public rjm j = rjm.DEFAULT;
    public final prg k;
    public final qaw l;
    public final prh m;
    public final prf n;

    @Deprecated
    public prd(Context context, String str) {
        int i;
        prl prl = new prl(context);
        qaz qaz = qaz.a;
        pru pru = new pru(context);
        this.b = context;
        this.c = context.getPackageName();
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            i = 0;
        }
        this.d = i;
        this.f = -1;
        this.e = str;
        this.g = null;
        this.h = null;
        this.i = false;
        this.k = prl;
        this.l = qaz;
        this.m = new prh();
        this.j = rjm.DEFAULT;
        this.n = pru;
    }
}
