package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: acjp */
public final class acjp {
    public final acey a;
    public final EditText b;
    public final RecyclerView c;
    public final View d;
    public final acjw e = new acjw(new acjq(this));
    public final Executor f;
    public String g;
    private final acjs h;

    public acjp(acey acey, Executor executor, View view, acjs acjs) {
        this.a = acey;
        this.b = (EditText) view.findViewById(R.id.input_text);
        this.c = (RecyclerView) view.findViewById(R.id.game_title_results);
        this.f = executor;
        this.h = acjs;
        view.findViewById(R.id.back_button).setOnClickListener(new acjo(this));
        this.d = view.findViewById(R.id.reset_input_button);
        this.d.setOnClickListener(new acjr(this));
        this.b.addTextChangedListener(new acjv(this));
        RecyclerView recyclerView = this.c;
        recyclerView.getContext();
        recyclerView.a(new ans());
        this.c.a(this.e);
    }

    public final void a(arog arog) {
        xpr.a(this.b);
        acjs acjs = this.h;
        if (acjs != null) {
            acjs.a(arog);
        }
    }
}
