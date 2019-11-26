package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: uzf */
public class uzf implements uza {
    public final uzb a;
    public boolean b;
    public bqj c;
    private final uys d;
    private final Activity e;
    private final uzn f;
    private final usv g;
    private final uyy h;
    private final uzd i;
    private final apxu j;
    private final afpu k;

    public uzf(uzb uzb, Activity activity, uzn uzn, aanz aanz, usv usv, afpu afpu, uys uys, uyy uyy, apxu apxu, boolean z) {
        this.a = uzb;
        this.e = activity;
        this.f = uzn;
        this.g = usv;
        this.k = afpu;
        this.d = uys;
        this.i = new uzd(uys, aanz, apxu);
        this.h = uyy;
        this.j = apxu;
        this.b = z;
    }

    public final void a() {
        if (!this.b) {
            this.b = true;
            this.h.a(new uyw(uyz.STARTED, false));
        }
        c();
    }

    public final void b() {
        if (this.b) {
            this.b = false;
            this.h.a(new uyw(uyz.CANCELLED, false));
        }
    }

    public final void c() {
        this.a.k();
        ust ust = this.k.a() ? (ust) this.k.c() : null;
        this.c = new uze(this);
        usv usv = this.g;
        usv.c.execute(new usy(usv, ust, new WeakReference(this.c)));
    }

    public final void i() {
        uzn uzn = this.f;
        Object obj = this.e;
        uzd uzd = this.i;
        amqw.a(obj);
        if (VERSION.SDK_INT >= 23 || obj.checkCallingOrSelfPermission("android.permission.MANAGE_ACCOUNTS") == 0) {
            uzn.b.addAccount("com.google", null, null, null, obj, uzd != null ? new uzp(uzd) : null, null);
            return;
        }
        if (uzd != null) {
            xtl.d("startAddAccountActivity called with a listener but without MANAGE_ACCOUNTS permission,the listener will be ignored");
        }
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        obj.startActivity(intent);
    }

    public final void j() {
        this.d.a("User requested sign out.");
    }

    public final void g() {
        b();
    }

    public final void h() {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        intent.putExtra("settings", new String[]{"com.google"});
        this.e.startActivity(intent);
    }

    public final void a(aanv aanv) {
        this.d.a(aanv, this.j, new uzh(this));
    }

    public final void a(aanu aanu) {
        Intent intent = aanu.a;
        if (intent != null) {
            this.e.startActivity(intent);
        } else {
            c();
        }
    }
}
