package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: afwd */
public final class afwd implements afvz {
    public final atun a;
    public final String b;
    public final Set c;
    public final Executor d;
    public final afwi e;
    public String f;
    public int g;
    private final afwe h;
    private final int i;
    private afvy j;

    public afwd(afwe afwe, Executor executor, String str, atun atun, afwi afwi, int i) {
        this.f = str;
        this.a = (atun) amqw.a((Object) atun);
        amqw.b((atun.a & 4) != 0);
        Object obj = atun.d;
        if (!TextUtils.isEmpty(obj)) {
            String str2 = "/topics/";
            if (!obj.startsWith(str2)) {
                obj = obj.length() == 0 ? new String(str2) : str2.concat(obj);
            }
        }
        this.b = (String) amqw.a(obj);
        this.e = (afwi) amqw.a((Object) afwi);
        this.c = new HashSet();
        this.g = 4;
        this.d = (Executor) amqw.a((Object) executor);
        this.h = (afwe) amqw.a((Object) afwe);
        this.i = i;
    }

    public final void a() {
        int i = this.g;
        if (i == 1) {
            this.g = 2;
            for (afxc a : new HashSet(this.c)) {
                a.a(this.a);
            }
            if (this.c.isEmpty()) {
                this.j.b();
                this.j = null;
                c();
                return;
            }
        } else if (i == 3) {
            this.g = 4;
            if (!this.c.isEmpty()) {
                this.j.b();
                this.j = null;
                d();
                return;
            } else if (this.c.isEmpty() && this.e != null) {
                this.d.execute(new afwg(this));
            }
        }
        afwp.a(this, false);
        afvy afvy = this.j;
        if (afvy != null) {
            afvy.b();
        }
        this.j = null;
    }

    public final void b() {
        this.j.b();
        this.j = null;
    }

    public final void c() {
        this.g = 3;
        this.j = a(afwc.UNSUBSCRIBE);
        this.j.a();
    }

    public final void d() {
        if (!TextUtils.isEmpty(this.f)) {
            this.g = 1;
            this.j = a(afwc.SUBSCRIBE);
            this.j.a();
        }
    }

    private final afvy a(afwc afwc) {
        atul atul;
        afwe afwe = this.h;
        String str = this.f;
        String str2 = this.b;
        atun atun = this.a;
        if ((atun.a & 32) != 0) {
            atul = atun.f;
            if (atul == null) {
                atul = atul.f;
            }
        } else {
            atul = null;
        }
        return new afvy((wxw) afwe.a((wxw) afwe.a.get(), 1), (wya) afwe.a((wya) afwe.b.get(), 2), (xhv) afwe.a((xhv) afwe.c.get(), 3), (xci) afwe.a((xci) afwe.d.get(), 4), (Executor) afwe.a((Executor) afwe.e.get(), 5), (zzl) afwe.a((zzl) afwe.f.get(), 6), (afvv) afwe.a((afvv) afwe.g.get(), 7), afwe.h, (afvz) afwe.a(this, 9), (String) afwe.a(str, 10), (String) afwe.a(str2, 11), (afwc) afwe.a(afwc, 12), atul, this.i);
    }
}
