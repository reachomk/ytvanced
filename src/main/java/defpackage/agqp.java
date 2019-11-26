package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: agqp */
public final class agqp {
    public final agpy a;
    public final aaft b;
    public final boolean c;
    public final Date d;
    public final avre e;

    public agqp(avre avre, boolean z, aaft aaft, agpy agpy) {
        this.e = (avre) amqw.a((Object) avre);
        this.c = z;
        this.b = aaft;
        this.a = agpy;
        if (!avre.i.isEmpty()) {
            Uri.parse(avre.i);
        }
        this.d = new Date(TimeUnit.SECONDS.toMillis(avre.g));
    }

    public final String a() {
        return this.e.b;
    }

    public final String b() {
        return this.e.e;
    }

    public final String c() {
        return this.e.f;
    }

    public final String d() {
        return this.e.l;
    }

    public final String e() {
        return this.e.m;
    }

    public final aygk f() {
        aaft aaft = this.b;
        return aaft != null ? aaft.d() : null;
    }

    public final long g() {
        return this.e.h;
    }

    public static agqp a(avre avre) {
        aygk aygk = avre.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aaft aaft = new aaft(aygk);
        avnc avnc = avre.d;
        if (avnc == null) {
            avnc = avnc.c;
        }
        return new agqp(avre, false, aaft, agpy.a(avnc));
    }
}
