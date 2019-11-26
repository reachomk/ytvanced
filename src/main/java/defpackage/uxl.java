package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: uxl */
public final class uxl implements akox {
    private final int a = R.layout.account_item;
    private final int b = R.drawable.account_switcher_alert;
    private final Context c;
    private final xoi d;
    private final uyb e;

    public uxl(Context context, xoi xoi, uyb uyb) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (xoi) amqw.a((Object) xoi);
        this.e = (uyb) amqw.a((Object) uyb);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new uxh(this.a, this.b, this.c, this.d, this.e);
    }
}
