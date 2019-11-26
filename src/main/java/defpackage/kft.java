package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kft */
public final class kft extends akpl {
    private final Context a;
    private final epv b;
    private final flu c;
    private final FrameLayout d;
    private kfs e;

    public kft(Context context, flu flu, epv epv) {
        this.a = context;
        this.c = (flu) amqw.a((Object) flu);
        this.b = epv;
        this.d = new FrameLayout(context);
        flu.a(this.d);
    }

    public final View K_() {
        return this.c.b;
    }

    public final void a(akpb akpb) {
        if (this.e != null) {
            this.e = null;
        }
        this.d.removeAllViews();
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        avkv avkv = (avkv) obj;
        this.d.removeAllViews();
        int a = aqxa.a(avkv.e);
        int i = R.layout.notification_multi_action_item;
        if (a != 0 && a == 2) {
            akor.a("setBackgroundColor", Integer.valueOf(xwe.a(this.a, R.attr.ytBorderedButtonChipBackground)));
            i = R.layout.notification_multi_action_item_compact_tall;
        }
        this.e = new kfs(LayoutInflater.from(this.a).inflate(i, null), this.b);
        this.e.a_(akor, avkv);
        this.d.addView(this.e.a);
        this.c.a(akor);
    }
}
