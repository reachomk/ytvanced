package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: acjw */
public final class acjw extends apa {
    public final ArrayList c = new ArrayList();
    private final acjs d;

    public acjw(acjs acjs) {
        this.d = acjs;
    }

    public final int a(int i) {
        return R.layout.lc_game_title;
    }

    public final void e() {
        this.c.clear();
    }

    public final aqj a(ViewGroup viewGroup, int i) {
        return new acju(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lc_game_title, viewGroup, false), this.d);
    }

    public final void a(aqj aqj, int i) {
        acju acju = (acju) aqj;
        arog arog = (arog) this.c.get(i);
        acju.r = arog;
        acju.p.setText(arog.b);
        acju.q.setText(arog.c);
    }

    public final int a() {
        return this.c.size();
    }
}
