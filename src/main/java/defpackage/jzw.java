package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: jzw */
public final class jzw implements akot {
    private final Context a;
    private final View b;

    public jzw(Context context) {
        this.a = (Context) amqw.a((Object) context);
        this.b = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_divider, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.b.setLayoutParams(new LayoutParams(this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_width), this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_divider_container_height)));
    }
}
