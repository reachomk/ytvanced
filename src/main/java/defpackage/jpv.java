package defpackage;

import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: jpv */
public final class jpv implements fab {
    private final fjo a;
    private final xhv b;
    private final ebk c;
    private final xpa d;
    private String e = "";
    private String f;
    private int g;

    public jpv(fjo fjo, xhv xhv, ebk ebk, xpa xpa) {
        this.a = fjo;
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = (ebk) amqw.a((Object) ebk);
        this.d = (xpa) amqw.a((Object) xpa);
    }

    public final int a() {
        return R.id.menu_search;
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.menu;
    }

    public final ezx d() {
        return null;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setActionView(null);
    }

    public final boolean b(MenuItem menuItem) {
        if (this.c.a || this.b.c()) {
            e();
            return true;
        }
        this.d.a();
        return false;
    }

    public final void e() {
        fjo fjo = this.a;
        fjo.a(iqu.a(this.e, this.f, this.g, false, fjo.b()));
    }

    public final void f() {
        fjo fjo = this.a;
        fjo.a(iqu.a(this.e, this.f, this.g, true, fjo.b()));
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void a(int i) {
        this.g = i;
    }
}
