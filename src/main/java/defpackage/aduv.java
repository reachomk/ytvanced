package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.youtube.R;

/* renamed from: aduv */
public final class aduv extends nf implements adus, xfc {
    public aduo a;
    private adux b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ListView listView = (ListView) layoutInflater.inflate(R.layout.mdx_delete_tv_codes_fragment, viewGroup, false);
        this.b = ((adva) xse.a(M_())).a(new aduz(listView, new aduy(this)));
        this.b.a(this);
        aduo aduo = this.a;
        aduo.d = this;
        aduo.a();
        return listView;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        aduo aduo = this.a;
        aduo.c = p();
        aduo.a();
    }

    public final void B() {
        super.B();
        this.a.b();
    }

    public final void a(String str) {
        aduo aduo = this.a;
        aduo.b.a(str, wxc.a(aduo.c, new aduu(aduo)));
    }

    public final /* bridge */ /* synthetic */ Object n() {
        return this.b;
    }
}
