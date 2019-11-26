package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jzu */
public final class jzu extends akpl {
    public final Context a;
    public final View b = this.i.findViewById(R.id.channel_status);
    public final GradientDrawable c = ((GradientDrawable) this.b.getBackground());
    public final aaas d;
    public final xhv e;
    private final akkq f;
    private final fmx g;
    private final akko h = akko.h().a((int) R.drawable.missing_avatar).a();
    private final View i;
    private final ImageView j = ((ImageView) this.i.findViewById(R.id.channel_avatar));
    private final TextView k = ((TextView) this.i.findViewById(R.id.channel_avatar_title));

    public jzu(Context context, akkq akkq, aaas aaas, fmx fmx, xhv xhv) {
        this.a = (Context) amqw.a((Object) context);
        this.f = (akkq) amqw.a((Object) akkq);
        this.g = (fmx) amqw.a((Object) fmx);
        this.d = aaas;
        this.e = xhv;
        amqw.a((Object) aaas);
        this.i = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_avatar, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.i;
    }

    private static boolean a(ajse ajse) {
        if (ajse.hasExtension(ajsd.a)) {
            int a = apmw.a(((apmu) ajse.getExtension(ajsd.a)).b);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(ajse ajse) {
        if (ajse.hasExtension(ajsd.a)) {
            int a = apmw.a(((apmu) ajse.getExtension(ajsd.a)).b);
            if (a != 0 && a == 4) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        ajse ajse = (ajse) obj;
        View view = this.i;
        if (jzu.b(ajse)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_width);
        } else if (jzu.a(ajse)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_large_width);
        } else {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_small_width);
        }
        view.setLayoutParams(new LayoutParams(dimensionPixelSize, -2));
        if (jzu.b(ajse)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_larger_avatar_size);
        } else if (jzu.a(ajse)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_large_avatar_size);
        } else {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_small_avatar_size);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.width = dimensionPixelSize2;
        layoutParams.height = dimensionPixelSize2;
        if (jzu.b(ajse)) {
            layoutParams.topMargin = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin);
        } else {
            layoutParams.topMargin = 0;
        }
        this.j.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
        if (jzu.b(ajse)) {
            layoutParams2.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin));
            layoutParams2.bottomMargin = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin);
        } else {
            layoutParams2.setMarginEnd(0);
            layoutParams2.bottomMargin = 0;
        }
        this.b.setLayoutParams(layoutParams2);
        if (jzu.b(ajse)) {
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
        if (jzu.b(ajse)) {
            this.k.setText(ajqy.a(ajse.f));
        } else {
            this.k.setText("");
        }
        this.f.a(this.j, ajse.a, this.h);
        ImageView imageView = this.j;
        aodx aodx = ajse.d;
        CharSequence charSequence = null;
        if (!(aodx == null || (aodx.a & 1) == 0)) {
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        }
        imageView.setContentDescription(charSequence);
        kae.a(this.b, this.c, ajse.g, this.a.getResources());
        apms apms = ajse.e;
        if (apms != null) {
            aruh aruh;
            fmx fmx = this.g;
            if (apms.a == 102716411) {
                aruh = (aruh) apms.b;
            } else {
                aruh = aruh.j;
            }
            fmx.a(aruh, this.i, ajse, akor.a);
        }
        this.i.setOnClickListener(new jzx(this, ajse, akor));
    }
}
