package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;

/* renamed from: zfv */
public final class zfv extends nf {
    public akkl a;
    public zev b;
    private zgb c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((zfy) xse.a(M_())).a(this);
        if (bundle != null) {
            this.b = (zev) bundle.getParcelable("track_selection");
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nn p = p();
        this.c = new zgb(p, this.b.a(p()), ((zfk) p).n(), this.a, true);
        View inflate = layoutInflater.inflate(R.layout.audio_swap_track_selection_view, viewGroup, false);
        ((GridView) inflate.findViewById(R.id.audio_swap_track_selection_view)).setAdapter((ListAdapter) amqw.a(this.c));
        return inflate;
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("track_selection", this.b);
    }
}
