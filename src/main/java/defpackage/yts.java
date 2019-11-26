package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.youtube.R;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* renamed from: yts */
public abstract class yts extends ypa implements ynz, yru {
    private static final long g = TimeUnit.DAYS.toMillis(1);
    public final Handler a;
    public final ywk f_;
    private final zar i;
    private final amro j;
    private final bcaa k;
    public final String l;
    public final yyt m;
    public final yxg n;
    public final yxl o;
    public final yty p;
    public final ymx q;
    public final String r;
    public ylf s;
    private String t;
    private ytv u;

    yts(Context context, Handler handler, ywk ywk, yil yil, zar zar, yyt yyt, yxg yxg, yxl yxl, String str, String str2, String str3, yty yty, ymx ymx, amro amro, bcaa bcaa) {
        super(context, handler, ywk, yil);
        this.a = (Handler) amqw.a((Object) handler);
        this.i = (zar) amqw.a((Object) zar);
        this.m = (yyt) amqw.a((Object) yyt);
        this.n = yxg;
        this.o = yxl;
        this.l = xvd.a(str3);
        this.f_ = (ywk) amqw.a((Object) ywk);
        this.j = (amro) amqw.a((Object) amro);
        this.k = (bcaa) amqw.a((Object) bcaa);
        zar.a(new ytw(this, ywk, str, ymx));
        this.p = (yty) amqw.a((Object) yty);
        this.q = (ymx) amqw.a((Object) ymx);
        this.r = xvd.a(str2);
    }

    public final boolean bi_() {
        return false;
    }

    public final String a(String str) {
        throw new UnsupportedOperationException("Call setModelKey(String, AggregationMode) instead!");
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.h)) {
            ((ypd) this.j.get()).a(this.h);
        }
    }

    public final String a(String str, ytv ytv) {
        ylf ylf = this.s;
        if (!(ylf == null || TextUtils.equals(ylf.a, str))) {
            yim yim = this.d;
            if (yim != null) {
                for (String a : yim.a.keySet()) {
                    yim.a(a);
                }
            }
        }
        this.u = ytv;
        return super.a(str);
    }

    public final boolean bg_() {
        return !this.s.a(this.l) && EnumSet.of(ytv.LAST, ytv.SINGLE, ytv.SINGLE_WITH_TIMESTAMP).contains(this.u);
    }

    public final boolean bh_() {
        return !this.s.a(this.l) && EnumSet.of(ytv.FIRST, ytv.FIRST_WITH_TIMESTAMP, ytv.SINGLE, ytv.SINGLE_WITH_TIMESTAMP).contains(this.u);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ylf ylf) {
        if (ylf.b()) {
            String str;
            String valueOf;
            this.s = ylf;
            if (!TextUtils.equals(ylf.getAuthorKey(), this.t)) {
                str = this.t;
                if (!TextUtils.isEmpty(str)) {
                    yim yim = this.d;
                    if (yim != null) {
                        yim.a(str);
                    }
                }
                this.t = ylf.getAuthorKey();
                a(ylf.getAuthorKey(), new ytr(this));
            }
            if (this.n != null) {
                str = "face_pile_";
                valueOf = String.valueOf(ylf.a);
                a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new ytu(this, ylf));
            }
            if (this.o != null) {
                str = "heart_";
                valueOf = String.valueOf(ylf.a);
                a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new ytt(this, ylf));
            }
            boolean a = ylf.a(this.l);
            zar zar = this.i;
            boolean z = this.u == ytv.BETWEEN || this.u == ytv.LAST;
            boolean z2 = this.u == ytv.BETWEEN || this.u == ytv.FIRST;
            zar.a(a, z, z2);
            this.i.a(ylf.c);
            zar zar2 = this.i;
            ylf ylf2 = this.s;
            valueOf = null;
            if (!(ylf2 == null || ylf2.b || (this.u != ytv.FIRST_WITH_TIMESTAMP && this.u != ytv.SINGLE_WITH_TIMESTAMP))) {
                long toMillis = TimeUnit.MICROSECONDS.toMillis(this.s.g());
                String str2 = "%s %s %s";
                valueOf = toMillis < yts.a((Calendar) this.k.get(), -1) ? String.format(str2, new Object[]{DateUtils.formatDateTime(this.e_, toMillis, 16), this.e_.getString(R.string.bullet), DateUtils.formatDateTime(this.e_, toMillis, 1)}) : toMillis < yts.a((Calendar) this.k.get(), 0) ? String.format(str2, new Object[]{this.e_.getString(R.string.yesterday), this.e_.getString(R.string.bullet), DateUtils.formatDateTime(this.e_, toMillis, 1)}) : DateUtils.formatDateTime(this.e_, toMillis, 1);
            }
            zar2.a(valueOf);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(Class cls) {
        return ylf.class.isAssignableFrom(cls);
    }

    private static long a(Calendar calendar, int i) {
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() + (((long) i) * g);
    }
}
