package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;

/* renamed from: aknk */
public final class aknk implements akot {
    private final akou a;
    private final LinearLayout b;
    private final aknm c;

    public aknk(Context context, akou akou, akpb akpb) {
        this.a = (akou) amqw.a((Object) akou);
        this.b = new LinearLayout(context);
        this.b.setOrientation(0);
        this.b.setLayoutParams(new LayoutParams(-1, -2));
        this.b.setGravity(48);
        this.c = new aknm(context, akpb);
        akou.a(this.b);
    }

    public final View K_() {
        return this.a.a();
    }

    /* renamed from: a */
    public final void a_(akor akor, akni akni) {
        this.b.removeAllViews();
        int i = akni.a;
        for (int i2 = 0; i2 < i; i2++) {
            Object a = akni.a(i2);
            aknm aknm = this.c;
            akor a2 = aknm.a(akor);
            a2.a("rowData", new akno(i2, i));
            View a3 = aknm.a(a2, a);
            int i3 = akni.g;
            a3.setPadding(i3, 0, i3, 0);
            this.b.addView(a3);
        }
        String str = "grid_row_presenter_horizontal_row_padding";
        this.b.setPadding(akor.a(str, akni.e), akor.a("grid_row_presenter_top_padding", akni.c), akor.a(str, akni.f), akor.a("grid_row_presenter_bottom_padding", akni.d));
        this.a.a(akor);
    }

    public final void a(akpb akpb) {
        this.c.a(this.b);
    }
}
