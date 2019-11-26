package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: adze */
public final class adze {
    public final adzl a;
    public final uud b;
    public final akkq c;
    public final afpu d;
    public final aeab e;
    public final acvx f;
    public final Context g;
    public final View h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final View m;
    public uue n;

    public adze(View view, adzl adzl, uud uud, akkq akkq, afpu afpu, aeab aeab, acvx acvx) {
        this.g = view.getContext();
        this.a = adzl;
        this.b = uud;
        this.c = akkq;
        this.d = afpu;
        this.e = aeab;
        this.f = acvx;
        acvx.a(acwl.G, null, null);
        view.findViewById(R.id.cancel_button).setOnClickListener(new adzh(acvx, adzl));
        this.h = view.findViewById(R.id.profile);
        this.i = (ImageView) view.findViewById(R.id.thumbnail);
        this.j = (TextView) view.findViewById(R.id.name);
        this.k = (TextView) view.findViewById(R.id.email);
        this.l = (TextView) view.findViewById(R.id.continue_as_button);
        this.l.setOnClickListener(new adzg(this, acvx, adzl));
        view.findViewById(R.id.switch_accounts_button).setOnClickListener(new adzj(acvx, adzl));
        this.m = view.findViewById(R.id.sign_in_button);
        this.m.setOnClickListener(new adzi(acvx, adzl));
    }
}
