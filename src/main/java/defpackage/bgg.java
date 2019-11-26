package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: bgg */
final class bgg implements bhd {
    private final /* synthetic */ View a;
    private final /* synthetic */ ArrayList b;

    bgg(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(bgx bgx) {
        bgx.b((bhd) this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }
}
