package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: klr */
public final class klr implements akot {
    private final euu a;
    private final ImageView b;

    public klr(Context context, eut eut, ViewGroup viewGroup) {
        this.b = (ImageView) LayoutInflater.from(context).inflate(R.layout.subscription_notification_options_button, viewGroup, false);
        this.a = ((eut) amqw.a((Object) eut)).a(this.b);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a.a(null, null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.a.a((axxl) obj, akor.a);
    }
}
