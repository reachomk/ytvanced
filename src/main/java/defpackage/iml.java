package defpackage;

import android.app.Activity;
import android.net.Uri.Builder;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: iml */
public final class iml {
    public final Activity a;
    public final afpu b;
    public final afqe c;
    public final xoi d;
    private final aazk e;
    private final xci f;
    private final aaas g;
    private final Executor h;

    public iml(Activity activity, afpu afpu, afqe afqe, aazk aazk, xoi xoi, xci xci, aaas aaas, Executor executor) {
        this.a = activity;
        this.e = aazk;
        this.b = afpu;
        this.c = afqe;
        this.d = xoi;
        this.f = xci;
        this.g = aaas;
        this.h = executor;
    }

    public final void a(String str, String str2) {
        amqw.a((Object) str);
        xuz.c(this.a, str2, new Builder().scheme("http").authority("www.youtube.com").appendPath("playlist").appendQueryParameter("list", str).build());
    }

    public final void a(auac auac, String str, byte[] bArr) {
        imo imo = new imo(this);
        Runnable runnable = ankh.a;
        int ordinal = auac.ordinal();
        if (ordinal == 0) {
            aazv a = this.e.a();
            a.a(bArr);
            a.d(str);
            xan.a(this.e.a(a), this.h, imo, new imn(this, str, auac), runnable);
        } else if (ordinal == 1) {
            aazs b = this.e.b();
            b.a(bArr);
            b.d(str);
            xan.a(this.e.a(b), this.h, imo, new imq(this, str, auac), runnable);
        } else if (ordinal == 2) {
            aazu c = this.e.c();
            c.a(bArr);
            c.d(str);
            xan.a(this.e.a(c), this.h, imo, new imp(this, str, auac), runnable);
        }
    }

    public final void a(String str, auac auac, List list) {
        if (list != null && list.size() > 0) {
            this.g.a(list, null);
        }
        this.f.c(new fie(str, auac));
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xtl.a("Error rating", th);
        this.d.c(th);
    }
}
