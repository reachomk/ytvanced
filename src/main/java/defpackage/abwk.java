package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: abwk */
public final class abwk extends abwb {
    private final View h;
    private RecyclerView i;
    private View j;
    private RecyclerView k;

    public abwk(Context context, akvz akvz, akpe akpe, acwa acwa, View view) {
        super(context, akvz, akpe, acwa.t());
        this.h = view;
    }

    public final RecyclerView a() {
        if (this.i == null) {
            this.i = (RecyclerView) this.h.findViewById(R.id.conversation_list);
        }
        return this.i;
    }

    public final View c() {
        if (this.j == null) {
            this.j = this.h.findViewById(R.id.more_comments_icon);
        }
        return this.j;
    }

    public final RecyclerView b() {
        if (this.k == null) {
            this.k = (RecyclerView) this.h.findViewById(R.id.ticker);
        }
        return this.k;
    }

    public final abwm s() {
        return new abwm(this.a, (abov) this.c, this.h);
    }
}
