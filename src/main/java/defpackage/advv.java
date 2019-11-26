package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;

/* renamed from: advv */
public final class advv {
    public final adfy a;
    public adqc b;
    public adgw c;
    public adwd d;
    public nn e;
    public final EditText f;
    public final EditText g;
    public final EditText h;
    public final EditText i;
    public final ImageView j;
    public final View k;
    public final int l;
    public final View m;

    public advv(View view, acvx acvx, adfy adfy) {
        this.a = adfy;
        Context context = view.getContext();
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(MdxPairingEndpointOuterClass.mdxPairingEndpoint, autr.a);
        acvx.a(acwl.B, (apxu) ((anxl) apxx.build()), null);
        view.findViewById(R.id.tv_code_layout).setLayoutDirection(0);
        int integer = context.getResources().getInteger(R.integer.mdx_use_tv_code_max_length);
        this.l = context.getResources().getInteger(R.integer.mdx_use_tv_code_full_code_length);
        this.f = (EditText) view.findViewById(R.id.tv_code_1);
        this.g = (EditText) view.findViewById(R.id.tv_code_2);
        this.h = (EditText) view.findViewById(R.id.tv_code_3);
        this.i = (EditText) view.findViewById(R.id.tv_code_4);
        int i = integer;
        adwa adwa = new adwa(this, null, this.f, this.g, i);
        this.f.addTextChangedListener(adwa);
        this.f.setOnKeyListener(adwa);
        adwa = new adwa(this, this.f, this.g, this.h, i);
        this.g.addTextChangedListener(adwa);
        this.g.setOnKeyListener(adwa);
        adwa = new adwa(this, this.g, this.h, this.i, i);
        this.h.addTextChangedListener(adwa);
        this.h.setOnKeyListener(adwa);
        adwa = new adwa(this, this.h, this.i, null, i);
        this.i.addTextChangedListener(adwa);
        this.i.setOnKeyListener(adwa);
        this.j = (ImageView) view.findViewById(R.id.tv_code_status);
        this.j.setOnClickListener(new advu(this));
        this.k = view.findViewById(R.id.tv_code_progress);
        this.m = view.findViewById(R.id.connect);
        this.m.setOnClickListener(new advx(this, acvx, adfy));
        acvx.b(acwc.MDX_SMART_PAIRING_USE_TV_CODE_LINK_BUTTON, null);
        view.findViewById(R.id.get_tv_code_title).setOnClickListener(new advw(this, acvx));
        acvx.b(acwc.MDX_SMART_PAIRING_USE_TV_CODE_HELP_BUTTON, null);
    }

    public final void a() {
        adis a = this.b.a(String.valueOf(this.m.getTag()));
        if (a == null) {
            b();
        } else {
            this.c.a(a, new advy(this));
        }
    }

    public final void b() {
        Toast.makeText(this.f.getContext(), R.string.mdx_pref_use_tv_code_link_toast_error, 1).show();
    }

    public final void c() {
        this.k.setVisibility(8);
        this.j.setVisibility(0);
    }

    public final void a(int i) {
        this.f.setTextColor(i);
        this.g.setTextColor(i);
        this.h.setTextColor(i);
        this.i.setTextColor(i);
    }
}
