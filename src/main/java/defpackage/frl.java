package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: frl */
final class frl implements yps {
    private final View a;
    private final akkq b;

    frl(View view, akkq akkq) {
        this.a = (View) amqw.a((Object) view);
        this.b = (akkq) amqw.a((Object) akkq);
    }

    public final yyg a(yyj yyj) {
        return new yzg(yyj, this.a);
    }

    public final yxm a() {
        return new yyv((RecyclerView) this.a.findViewById(R.id.recycler_view));
    }

    public final LayoutInflater b() {
        return LayoutInflater.from(this.a.getContext());
    }

    public final yxy c() {
        return new yza(this.a.findViewById(R.id.reply_box), this.b);
    }

    public final yyt d() {
        return new yxz((ImageView) this.a.findViewById(R.id.reply_box_author), this.b);
    }

    public final ywx e() {
        return new ywx(this.a, this.b);
    }

    public final yxu a(yxw yxw) {
        return new yxu(this.a, yxw);
    }
}
