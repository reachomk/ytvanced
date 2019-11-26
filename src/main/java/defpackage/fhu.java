package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: fhu */
public final class fhu {
    public final xoi a;
    private final aazk b;
    private final xci c;
    private final Activity d;
    private final afpu e;
    private final afqe f;
    private final xhv g;
    private final xpa h;
    private final aaas i;
    private final Executor j;
    private final List k = new LinkedList();

    public fhu(Activity activity, afpu afpu, afqe afqe, aazk aazk, xoi xoi, xci xci, xhv xhv, xpa xpa, aaas aaas, Executor executor) {
        this.d = activity;
        this.b = aazk;
        this.e = afpu;
        this.f = afqe;
        this.a = xoi;
        this.c = xci;
        this.g = xhv;
        this.h = xpa;
        this.i = aaas;
        this.j = executor;
    }

    public final void a(View view) {
        this.k.add(new fib(view));
    }

    public final void a(atzq atzq) {
        if (atzq != null) {
            for (fib fib : this.k) {
                fib.a(0);
                boolean z = ((atzr) atzq.instance).m;
                fib.c.setEnabled(z);
                fib.c.setAlpha(!z ? 0.2f : 1.0f);
                boolean z2 = fib.b;
                fib.c.setOnClickListener(new fic(this, atzq, auac.LIKE));
            }
            if (fhu.a((atzr) ((anxl) atzq.build()))) {
                b(abml.a(atzq), atzq);
                return;
            } else {
                c(abml.a(atzq), atzq);
                return;
            }
        }
        for (fib a : this.k) {
            a.a(8);
        }
    }

    public final void a(auac auac) {
        b(auac, null);
    }

    private final void b(auac auac, atzq atzq) {
        for (fib fib : this.k) {
            fib.a(auac, atzq);
            fib.a(fib.c.getResources().getString(!fib.a(auac) ? R.string.accessibility_save_to_playlists : R.string.accessibility_remove_from_playlists));
        }
    }

    private final void c(auac auac, atzq atzq) {
        for (fib fib : this.k) {
            int i;
            CharSequence quantityString;
            fib.a(auac, atzq);
            boolean z = fib.b;
            int[] iArr = fib.a;
            Resources resources = fib.c.getResources();
            if (atzq != null) {
                boolean z2 = fib.b;
                i = ((atzr) atzq.instance).d;
            } else {
                i = 0;
            }
            if (fib.a(auac)) {
                if (i > 0) {
                    quantityString = resources.getQuantityString(iArr[3], i, new Object[]{Integer.valueOf(i)});
                } else {
                    quantityString = resources.getString(iArr[1]);
                }
            } else if (i > 0) {
                quantityString = resources.getQuantityString(iArr[2], i, new Object[]{Integer.valueOf(i)});
            } else {
                quantityString = resources.getString(iArr[0]);
            }
            fib.a(quantityString);
        }
    }

    public final void a(auac auac, atzq atzq) {
        amqw.a((Object) atzq);
        if (!this.g.c()) {
            this.h.a();
        } else if (this.e.a()) {
            a(auac, atzq, false);
        } else {
            this.f.a(this.d, null, new fhz(this, auac, atzq));
        }
    }

    private static boolean a(atzr atzr) {
        if (!(atzr == null || (atzr.a & 1) == 0)) {
            auad auad = atzr.b;
            if (auad == null) {
                auad = auad.d;
            }
            if (!auad.c.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(auac auac, atzq atzq, boolean z) {
        Runnable runnable = ankh.a;
        int ordinal = auac.ordinal();
        if (ordinal == 0) {
            aazv a = this.b.a();
            a.a(atzq.b().d());
            a.a(atzq.a());
            xan.a(this.b.a(a), this.j, new fht(this), new fhw(this, atzq, z), runnable);
        } else if (ordinal != 1) {
            aazu c = this.b.c();
            c.a(atzq.b().d());
            c.a(atzq.a());
            xan.a(this.b.a(c), this.j, new fhx(this), new fia(this, atzq, z), runnable);
        } else {
            aazs b = this.b.b();
            b.a(atzq.b().d());
            b.a(atzq.a());
            xan.a(this.b.a(b), this.j, new fhv(this), new fhy(this, atzq, z), runnable);
        }
    }

    public final void a(atzq atzq, auac auac, boolean z, List list) {
        if (!(list == null || list.isEmpty())) {
            this.i.a(list, null);
        }
        if (fhu.a((atzr) ((anxl) atzq.build()))) {
            this.c.c(new fie(atzq.a().c, auac));
            return;
        }
        this.c.d(new fid(atzq.a().b, auac, z));
        c(auac, atzq);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b(Throwable th) {
        xtl.a("Error rating", th);
        this.a.c(th);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void c(Throwable th) {
        xtl.a("Error rating", th);
        this.a.c(th);
    }
}
