package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.youtube.R;

/* renamed from: drw */
public final class drw extends uzg {
    public View a;
    public final aaey b;
    public final Activity c;
    private ListView g;
    private ListView h;
    private View i;
    private View j;
    private View k;
    private final akpk l = new akpk();
    private final drc m = new drc();
    private final dve n;

    public drw(Context context, xoi xoi, acvx acvx, akkq akkq, akoe akoe, dve dve, bcaa bcaa, aaey aaey, Activity activity) {
        super(context, xoi, acvx, akkq, akoe);
        this.n = dve;
        this.b = aaey;
        this.c = activity;
        dqs dqs = new dqs(context, this, this.n, bcaa);
        dqs.a(aanw.class);
        akoc a = akoe.a(dqs.a);
        a.a(this.l);
        this.h.setAdapter(a);
    }

    public final View a(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.fusion_account_selector, null);
        ((ImageView) this.a.findViewById(R.id.add_account)).setOnClickListener(new drz(this));
        this.g = (ListView) this.a.findViewById(R.id.account_list);
        this.h = (ListView) this.a.findViewById(R.id.account_list_footer);
        this.i = this.a.findViewById(R.id.sign_out_footer);
        this.i.setOnClickListener(new dry(this));
        this.j = this.a.findViewById(R.id.manage_account_footer);
        this.j.setOnClickListener(new dsb(this));
        this.k = this.a.findViewById(R.id.accounts_help_link);
        this.k.setOnClickListener(new dsa(this));
        return this.a;
    }

    public final akvz a(Context context, xoi xoi, acvx acvx, akkq akkq) {
        return new dqv(context, xoi, acvx, akkq, this, this, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final ListView a() {
        return this.g;
    }

    /* Access modifiers changed, original: protected|final */
    public final akpk b() {
        return this.l;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.e.add(this.d);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        if (this.e.isEmpty()) {
            this.e.add(this.m);
        }
    }

    public final void e() {
        this.i.setVisibility(8);
    }

    public final void f() {
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }
}
