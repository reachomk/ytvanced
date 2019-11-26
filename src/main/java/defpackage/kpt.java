package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kpt */
public final class kpt {
    public View A;
    public Drawable B;
    public final int a;
    public final int b;
    public final int c;
    public final ViewStub d;
    public final Context e;
    public final akkq f;
    public final aaas g;
    public final akvo h;
    public final vmn i;
    public final tpu j;
    public final vod k;
    public final dwk l;
    public final View m;
    public final Resources n;
    public kvp o;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public TextView u;
    public RatingBar v;
    public TextView w;
    public TextView x;
    public TextView y;
    public ImageView z;

    protected kpt(Context context, akkq akkq, aaas aaas, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, View view, int i) {
        this.e = (Context) amqw.a((Object) context);
        this.f = (akkq) amqw.a((Object) akkq);
        this.g = (aaas) amqw.a((Object) aaas);
        this.h = (akvo) amqw.a((Object) akvo);
        this.i = (vmn) amqw.a((Object) vmn);
        this.j = (tpu) amqw.a((Object) tpu);
        this.k = (vod) amqw.a((Object) vod);
        this.l = (dwk) amqw.a((Object) dwk);
        this.m = (View) amqw.a((Object) view);
        this.n = context.getResources();
        this.a = xwe.a(context, R.attr.adBlue, 0);
        this.b = xwe.a(context, R.attr.adText1, 0);
        this.c = xwe.a(context, R.attr.adBackground1, 0);
        this.d = (ViewStub) view.findViewById(i);
    }
}
