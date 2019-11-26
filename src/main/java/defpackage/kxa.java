package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kxa */
final class kxa {
    public final kxc a;
    public final View b;
    public final kxe c;

    public kxa(kxg kxg, Context context, akpe akpe, akvz akvz, acwa acwa) {
        kxc kxc = new kxc(new RecyclerView(context), context, akpe, akvz, acwa);
        this.b = LayoutInflater.from(context).inflate(R.layout.primetime_promo_box_layout, null);
        this.c = kxg.a(this.b);
        this.a = kxc;
        ((FrameLayout) this.b.findViewById(R.id.content)).addView(kxc.a);
    }
}
