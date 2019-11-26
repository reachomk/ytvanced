package defpackage;

import android.view.View;

/* renamed from: epi */
public abstract class epi {
    public final View a;
    public final akkq b;
    public Object c;

    epi(View view, akkq akkq) {
        this(view, akkq, null);
    }

    public abstract void a(epk epk);

    public abstract void a(Object obj);

    epi(View view, akkq akkq, epk epk) {
        this.a = (View) amqw.a((Object) view);
        this.b = (akkq) amqw.a((Object) akkq);
        if (epk != null) {
            a(epk);
        }
    }

    public final void a(boolean z) {
        this.a.setClickable(z);
    }

    public void a() {
        this.a.setVisibility(8);
        a(true);
        this.c = null;
    }

    protected static akko a(int i) {
        return akko.h().a(true).a(new epl(i)).a();
    }
}
