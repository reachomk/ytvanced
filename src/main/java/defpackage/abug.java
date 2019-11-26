package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: abug */
public final class abug implements akot {
    public abun a;
    public EditText b;
    public final Handler c;
    public final Runnable d = new abul(this);
    private final Context e;
    private final acvx f;
    private final ViewGroup g;
    private LinearLayout h;
    private ImageView i;
    private ImageView j;
    private akne k;

    public abug(Context context, acvx acvx, Handler handler, ViewGroup viewGroup) {
        this.e = context;
        this.f = acvx;
        this.c = handler;
        this.g = (ViewGroup) amqw.a((Object) viewGroup);
    }

    public final View K_() {
        return this.g;
    }

    /* renamed from: a */
    public final void a_(akor akor, arec arec) {
        if (this.h == null) {
            this.h = (LinearLayout) this.g.findViewById(R.id.emoji_category_container);
        }
        this.h.removeAllViews();
        if (this.i == null) {
            this.i = (ImageView) this.g.findViewById(R.id.keyboard_button);
        }
        if (this.j == null) {
            this.j = (ImageView) this.g.findViewById(R.id.backspace_button);
        }
        this.i.setOnClickListener(new abuj(this));
        this.j.setOnTouchListener(new abui(this));
        this.k = new abuk(this.e, (akpb) akor.a("VIEW_POOL_KEY"));
        akor.a(this.f);
        for (area area : arec.b) {
            if (area.a == 126326585) {
                Object obj;
                this.f.a(null);
                if (area.a == 126326585) {
                    obj = (ardy) area.b;
                } else {
                    obj = ardy.d;
                }
                akne akne = this.k;
                this.h.addView(akne.a(akne.a(akor), obj));
            }
        }
    }

    public final void a(akpb akpb) {
        akne akne = this.k;
        if (akne != null) {
            akne.a(this.g);
        }
        this.h.removeAllViews();
    }
}
