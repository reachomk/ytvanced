package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: hqj */
public final class hqj {
    public final Context a;
    public final albi b;
    public final aaas c;
    public final OnClickListener d = new hql(this);
    private final OnClickListener e = new hqi(this);

    public hqj(Context context, albi albi, aaas aaas) {
        this.a = context;
        this.b = albi;
        this.c = aaas;
    }

    public final void a(int i) {
        this.b.b(a(i, this.e));
    }

    public final void b(int i) {
        this.b.b(c(i).d());
    }

    public final albl a(int i, OnClickListener onClickListener) {
        return c(i).a(this.a.getString(R.string.offline_actions_snackbar_button_text), onClickListener).c(false).d();
    }

    public final albk c(int i) {
        return this.b.b().b(this.a.getString(i)).c(false);
    }
}
