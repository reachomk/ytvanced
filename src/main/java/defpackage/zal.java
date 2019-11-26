package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import com.google.android.libraries.youtube.conversation.technodrome.view.ExpandingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: zal */
public final class zal {
    public View a;
    public RecyclerView b;
    public ExpandingFrameLayout c;
    private final View d;

    public zal(View view) {
        this.d = (View) amqw.a((Object) view);
    }

    public final void a() {
        if (this.a == null) {
            this.a = ((ViewStub) this.d.findViewById(R.id.rvr_stub)).inflate();
            this.b = (RecyclerView) this.a.findViewById(R.id.related_video_replies_items);
            this.b.getContext();
            apn ans = new ans();
            ans.b(0);
            this.b.a(ans);
            this.c = (ExpandingFrameLayout) this.d.findViewById(R.id.rvr_container);
        }
    }
}
