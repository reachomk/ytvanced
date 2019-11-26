package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afpi */
public final class afpi implements afmq {
    public final Executor a;
    public volatile Map b;
    public final afpg c;
    public volatile boolean d;
    public final boolean e;
    private final afqv f;
    private final afmi g;

    public afpi(Executor executor, afqv afqv, afmi afmi, afmz afmz, afpg afpg) {
        this.a = executor;
        this.g = afmi;
        this.f = afqv;
        this.e = afmz.a;
        this.c = afpg;
    }

    public final int a() {
        return 72;
    }

    public final boolean d() {
        return true;
    }

    public final Map a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("exception.message", str);
        }
        hashMap.putAll(this.b);
        return hashMap;
    }

    public final void a(xvo xvo, Map map) {
        afqy b = afqv.b("ecatcher");
        b.e = true;
        b.g = map;
        b.a(xvo.a());
        if (this.d) {
            this.f.a(this, b, new afpn());
        }
    }

    public final synchronized void e() {
        this.d = true;
    }

    public final synchronized void f() {
        this.d = false;
        this.b = null;
    }

    public final List b() {
        return amul.a(Integer.valueOf(10), Integer.valueOf(60), Integer.valueOf(3600), Integer.valueOf(43200));
    }

    public final int c() {
        return (int) TimeUnit.HOURS.toMinutes(72);
    }

    public final void a(int i, afpf afpf, String str, Throwable th) {
        if (this.d) {
            this.a.execute(new afpl(this, i, afpf, str, th));
            return;
        }
        xtl.b(String.format("ECatcher disabled: level: %s, category: %s, message: %s", new Object[]{afpe.a(i), afpf, str}), th);
    }

    public final xvo a(int i, afpf afpf, String str) {
        xvo a = xvo.a(Uri.parse("https://www.youtube.com/error_204"));
        String a2 = afpe.a(i);
        if (i != 0) {
            a.b("log.level", a2);
            a.b("exception.category", afpf.toString());
            if (str != null) {
                a.b("exception.type", str);
            }
            a.b("t", "androiderror");
            this.g.a(a);
            return a;
        }
        throw null;
    }
}
