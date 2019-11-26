package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: akpn */
public final class akpn implements akou {
    private View a;
    private OnClickListener b;
    private boolean c;

    public akpn(View view) {
        this.a = (View) amqw.a((Object) view);
    }

    public final void a(View view) {
        amqw.a((Object) view);
        this.a = view;
        OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            this.a.setOnClickListener(onClickListener);
        }
        this.a.setClickable(this.c);
    }

    public final View a() {
        return this.a;
    }

    public final void a(OnClickListener onClickListener) {
        this.b = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        this.c = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    public final View a(akor akor) {
        amqw.a(this.a);
        return this.a;
    }
}
