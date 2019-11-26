package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: uva */
public final class uva implements akot, OnClickListener {
    private final View a;
    private final RecyclerView b = ((RecyclerView) this.a.findViewById(R.id.methods_list));
    private final uuz c;
    private final uuu d;

    public uva(Context context, uuu uuu, ViewGroup viewGroup) {
        this.d = (uuu) amqw.a((Object) uuu);
        this.a = LayoutInflater.from(context).inflate(R.layout.modal_other_methods_layout, viewGroup, false);
        this.c = new uuz(context, uuu);
        this.a.findViewById(R.id.close_button).setOnClickListener(this);
        this.a.findViewById(R.id.cancel_button).setOnClickListener(this);
        this.b.a(this.c);
        this.b.a(new ans());
        this.b.a(new ams(context));
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        uuz uuz = this.c;
        uuz.c = null;
        uuz.aa_();
    }

    public final void onClick(View view) {
        this.d.d();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        uvl uvl = (uvl) obj;
        uuz uuz = this.c;
        uuz.c = uvl.a;
        uuz.aa_();
    }
}
