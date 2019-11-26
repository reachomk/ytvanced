package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: afwk */
public final class afwk implements afwi, afwq, afxb {
    public final tkd a;
    public final String b;
    public final Executor c;
    public String d;
    private final Map e = new HashMap();
    private final Executor f;
    private final afwh g;
    private final bcaa h;
    private final zzl i;
    private final AtomicInteger j;

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "/topics/";
        if (str.startsWith(str2)) {
            return str;
        }
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public afwk(tkd tkd, String str, afwh afwh, Executor executor, Executor executor2, bcaa bcaa, zzl zzl) {
        Object afwn = new afwn();
        this.b = str;
        this.a = (tkd) amqw.a((Object) tkd);
        this.g = (afwh) amqw.a((Object) afwh);
        this.f = (Executor) amqw.a((Object) executor);
        this.c = (Executor) amqw.a((Object) executor2);
        this.h = bcaa;
        this.i = zzl;
        amqw.a(afwn);
        this.j = new AtomicInteger();
        a(executor);
    }

    public final void a(atun atun, afxc afxc) {
        xak.a();
        if (atun == null || afxc == null) {
            xtl.d("cannot subscribe, invalidationId or listener is null");
            return;
        }
        String b = afwk.b(atun.d);
        if (!TextUtils.isEmpty(b)) {
            if (TextUtils.isEmpty(this.d)) {
                xtl.d("Empty GCM registration token, not subscribing to GCM topic.");
                a(this.f);
            }
            if (!this.e.containsKey(b)) {
                Map map = this.e;
                afwh afwh = this.g;
                map.put(b, new afwd((afwe) afwh.a((afwe) afwh.a.get(), 1), (Executor) afwh.a((Executor) afwh.b.get(), 2), this.d, (atun) afwh.a(atun, 4), (afwi) afwh.a(this, 5), this.j.getAndIncrement()));
                afwp.a(this);
            }
            afwd afwd = (afwd) this.e.get(b);
            Set set = afwd.c;
            if (set != null) {
                set.add(afxc);
                int i = afwd.g;
                if (i == 2) {
                    afxc.a(afwd.a);
                } else if (i == 4) {
                    afwd.d();
                }
            }
        }
    }

    public final void b(atun atun, afxc afxc) {
        xak.a();
        if (afxc == null) {
            xtl.d("Cannot unsubscribeAll a null listener.");
        } else if (atun == null || TextUtils.isEmpty(atun.d)) {
            xtl.d("Cannot unsubscribeAll from a null invalidation ID or from without a topic.");
        } else {
            String b = afwk.b(atun.d);
            if (this.e.containsKey(b)) {
                afwd afwd = (afwd) this.e.get(b);
                afwd.c.remove(afxc);
                if (afwd.g == 2 && afwd.c.isEmpty()) {
                    afwd.c();
                }
            }
        }
    }

    public final void a(String str) {
        xak.a();
        this.e.remove(str);
        afwp.a(this);
    }

    public final void a(String str, atur atur) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.c.execute(new afwj(this, str, atur));
        } else {
            b(str, atur);
        }
    }

    public final void b(String str, atur atur) {
        xak.a();
        if (TextUtils.isEmpty(str)) {
            xtl.d("Do not know how to handle a received topic invalidation for a null or empty topic.");
            return;
        }
        afxh.c(this.h, "RECEIVED", this.i);
        afwd afwd = (afwd) this.e.get(str);
        if (afwd == null) {
            str = String.valueOf(str);
            String str2 = "No listeners for GCM topic: ";
            xtl.d(str.length() == 0 ? new String(str2) : str2.concat(str));
            return;
        }
        amqw.b(TextUtils.equals(afwd.b, str));
        atum atum = (atum) atun.g.createBuilder();
        if (!TextUtils.isEmpty(str) && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        atum.copyOnWrite();
        atun atun = (atun) atum.instance;
        if (str != null) {
            atun.a |= 4;
            atun.d = str;
            afwd.d.execute(new afwf(new HashSet(afwd.c), (atun) ((anxl) atum.build()), atur));
            afxh.c(this.h, "MAPPED", this.i);
            return;
        }
        throw new NullPointerException();
    }

    private final void a(Executor executor) {
        executor.execute(new afwm(this));
        if (TextUtils.isEmpty(this.b)) {
            xtl.d("Can't get GCM registration token because the apiary project ID is missing.");
        }
    }

    /* Access modifiers changed, original: final */
    public final Collection a() {
        xak.a();
        ArrayList arrayList = new ArrayList(this.e.values());
        Collections.sort(arrayList, afwl.a);
        return arrayList;
    }
}
