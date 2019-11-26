package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: wja */
public final class wja implements akot {
    private final View a;
    private final View b = this.a.findViewById(R.id.comment_thread_footer);

    public wja(Context context) {
        this.a = View.inflate(context, R.layout.comment_thread_footer, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.b.setVisibility(0);
    }
}
