package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* renamed from: jic */
public final class jic extends jmz {
    public jie a;
    private View i;

    public jic(ViewGroup viewGroup, akwy akwy, akpe akpe, akvz akvz, aana aana, xci xci, xoi xoi, acvx acvx) {
        super(viewGroup, akwy, akpe, akvz, aana, xci, xoi, acvx);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.a(new ans(0, false));
        ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.drawer_shadow_stub);
        if (viewStub != null && this.i == null) {
            this.i = viewStub.inflate();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akpd akpd) {
        akpd.a(new jib(this, akpd));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, aknh aknh, int i) {
        super.a(akor, aknh, i);
        Object valueOf = Boolean.valueOf(true);
        akor.a("SECTION_LIST_DRAWER_COMPACT_MODE", valueOf);
        akor.a("is_horizontal_drawer_context", valueOf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akpk akpk, axeg axeg, boolean z) {
        if (!axeg.h) {
            boolean z2 = true;
            Object obj = null;
            for (axek axek : axeg.e) {
                if (axek.a == 105604662) {
                    axec axec = (axec) axek.b;
                    if (!axec.n) {
                        if (axec.k) {
                            axec axec2;
                            if (axek.a == 105604662) {
                                axec2 = (axec) axek.b;
                            } else {
                                axec2 = axec.o;
                            }
                            a(axec2, true);
                        }
                        obj = 1;
                    }
                }
            }
            if (akpk.isEmpty() || !(akpk.get(0) instanceof axeg)) {
                z2 = false;
            }
            if (obj == null) {
                if (z && z2) {
                    akpk.remove(0);
                }
            } else if (!z) {
                akpk.add(axeg);
            } else if (z2) {
                akpk.a(0, (Object) axeg);
            } else {
                akpk.add(0, axeg);
            }
        }
    }

    public final void d() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void e() {
        RecyclerView recyclerView = this.c.o;
        if (recyclerView.canScrollVertically(-1) || (recyclerView.getChildAt(0) != null && recyclerView.getChildAt(0).getTop() < 0)) {
            View view = this.i;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        d();
    }
}
