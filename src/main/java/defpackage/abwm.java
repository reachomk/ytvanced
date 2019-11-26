package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: abwm */
public final class abwm extends apk {
    public abxi a;
    public abwo b;
    public int c;
    private final akvz d;
    private final abov e;
    private final ViewGroup f;
    private final View g;
    private final View h;
    private int i;
    private final abwq j = new abwp(this);

    public abwm(akvz akvz, abov abov, View view) {
        this.g = (View) amqw.a((Object) view);
        this.d = (akvz) amqw.a((Object) akvz);
        this.e = (abov) amqw.a((Object) abov);
        this.f = (ViewGroup) view.findViewById(R.id.docked_view_container);
        this.h = view.findViewById(R.id.live_chat_drawer_header_shadow);
        this.i = view.getHeight();
        this.c = -1;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.i == this.g.getHeight()) {
            View a = recyclerView.a(0.0f, 0.0f);
            if (a != null) {
                int e = RecyclerView.e(a);
                if (e != -1) {
                    int i = this.c;
                    if (i == -1 && e != 0) {
                        this.c = e - 1;
                    } else if (e < i) {
                        a();
                    }
                    i = e;
                    while (i > this.c) {
                        if (this.e.b(i)) {
                            break;
                        }
                        i--;
                    }
                    i = -1;
                    if (i != -1) {
                        Object c = this.e.c(i);
                        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.live_chat_docked_header_container, recyclerView, false);
                        if (c instanceof auej) {
                            c = (auej) c;
                            akot a2 = akoz.a((akpb) this.d.get(), c, (ViewGroup) recyclerView);
                            if (a2 != null) {
                                a2.a_(new akor(), c);
                                ((ViewGroup) linearLayout.findViewById(R.id.dock_container)).addView(a2.K_());
                            }
                        }
                        if (linearLayout != null) {
                            if (this.b != null) {
                                this.f.removeAllViews();
                                this.f.setVisibility(8);
                                this.b.g = false;
                            }
                            this.b = new abwo(this.f, linearLayout, this.e.d(i), i);
                            abwo abwo = this.b;
                            abwo.h = this.j;
                            abwo.c.postDelayed(abwo.f, (long) abwo.e);
                            abwo.g = true;
                        } else {
                            return;
                        }
                    }
                    if (this.b != null) {
                        View childAt;
                        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                            childAt = recyclerView.getChildAt(i2);
                            int e2 = RecyclerView.e(childAt);
                            if (this.e.b(e2)) {
                                abwo abwo2 = this.b;
                                if (abwo2.d != e2 && childAt.getTop() <= abwo2.a.getHeight()) {
                                    break;
                                }
                            }
                        }
                        childAt = null;
                        if (childAt == null) {
                            a(true);
                            this.f.setVisibility(0);
                            if (!this.e.b(this.b.d + 1)) {
                                abwo abwo3 = this.b;
                                if (abwo3.g) {
                                    abwo3.a.findViewById(R.id.dock_bottom_shadow).setVisibility(0);
                                }
                            }
                        } else {
                            a(false);
                            abwo abwo4 = this.b;
                            abwo4.a();
                            abwo4.b.setTranslationY((float) (childAt.getTop() - abwo4.a.getHeight()));
                            abwo4.b.setVisibility(0);
                            return;
                        }
                    }
                    this.c = e;
                    return;
                }
            }
            return;
        }
        a();
        this.i = this.g.getHeight();
    }

    private final void a(boolean z) {
        abxi abxi = this.a;
        if (abxi != null) {
            abxi.a(z);
        }
        View view = this.h;
        if (view != null) {
            view.setVisibility(!z ? 0 : 8);
        }
    }

    public final void a() {
        this.b = null;
        this.f.removeAllViews();
        this.f.setVisibility(8);
        this.f.setTranslationY(0.0f);
        a(false);
    }
}
