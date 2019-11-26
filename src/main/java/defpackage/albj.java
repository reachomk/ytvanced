package defpackage;

import android.view.View.OnClickListener;

/* renamed from: albj */
public abstract class albj implements albe {
    public abstract albj a(acwc acwc);

    public abstract albj a(albc albc);

    public abstract albj a(OnClickListener onClickListener);

    public abstract albj a(aygk aygk);

    public abstract albj a(CharSequence charSequence);

    public abstract albj b(int i);

    public abstract albj b(OnClickListener onClickListener);

    public abstract albj b(CharSequence charSequence);

    public abstract albj c(CharSequence charSequence);

    public abstract albj c(boolean z);

    public abstract albj d(CharSequence charSequence);

    public abstract albg e();

    public final /* bridge */ /* synthetic */ albe f() {
        throw null;
    }

    public final albj a(CharSequence charSequence, OnClickListener onClickListener) {
        return b(charSequence).b(onClickListener);
    }

    public final albj b(CharSequence charSequence, OnClickListener onClickListener) {
        return a(charSequence).a(onClickListener);
    }

    public final albj b(aygk aygk) {
        return b(0).a(aygk);
    }

    public final albj d(int i) {
        return a(null).b(i);
    }
}
