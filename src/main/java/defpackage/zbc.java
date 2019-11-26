package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: zbc */
public final class zbc implements alpo {
    public final zbd a;
    private final TextView b;
    private final RecyclerView c;
    private final View d;
    private final View e;
    private final View f;
    private final akpk g = new akpk();

    public zbc(View view, akvz akvz, akpe akpe, zbd zbd) {
        this.a = (zbd) amqw.a((Object) zbd);
        this.b = (TextView) view.findViewById(R.id.header);
        this.c = (RecyclerView) view.findViewById(R.id.list);
        this.d = view.findViewById(R.id.loading);
        this.e = view.findViewById(R.id.error);
        this.f = view.findViewById(R.id.retry_button);
        akvz.a(aafj.class);
        apa a = akpe.a((akpb) akvz.get());
        a.a(this.g);
        RecyclerView recyclerView = this.c;
        view.getContext();
        recyclerView.a(new ans());
        this.c.a(a);
        this.f.setOnClickListener(new zbb(this));
    }

    public final /* synthetic */ void a(Object obj, int i) {
        ajtt ajtt = (ajtt) obj;
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.c.setVisibility(8);
        if (i != 1) {
            if (i != 2) {
                this.e.setVisibility(0);
            } else if (ajtt != null) {
                xpr.a(this.b, ajqy.a(ajtt.a));
                ajtw ajtw = ajtt.b;
                if (ajtw != null) {
                    ajwt ajwt = ajtw.a;
                    if (ajwt != null) {
                        this.g.addAll(new aafj(ajwt).a());
                    }
                }
                this.c.setVisibility(0);
            }
            return;
        }
        this.g.clear();
        this.d.setVisibility(0);
    }
}
