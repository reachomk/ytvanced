package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: bib */
final class bib extends bhc {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ View c;
    private final /* synthetic */ bhy d;

    bib(bhy bhy, ViewGroup viewGroup, View view, View view2) {
        this.d = bhy;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void b() {
        bhr.a(this.a).b(this.b);
    }

    public final void c() {
        if (this.b.getParent() == null) {
            bhr.a(this.a).a(this.b);
            return;
        }
        bhy bhy = this.d;
        int size = bhy.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) bhy.o.get(size)).cancel();
        }
        ArrayList arrayList = bhy.p;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) bhy.p.clone();
            size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((bhd) arrayList2.get(i)).a();
            }
        }
    }

    public final void a(bgx bgx) {
        this.c.setTag(R.id.save_overlay_view, null);
        bhr.a(this.a).b(this.b);
        bgx.b((bhd) this);
    }
}
