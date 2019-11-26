package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: kdf */
public final class kdf implements akot {
    private final YouTubeTextView a;
    private final akou b;

    public kdf(Context context, flu flu) {
        amqw.a((Object) context);
        this.b = (akou) amqw.a((Object) flu);
        this.a = (YouTubeTextView) View.inflate(context, R.layout.section_heading, null);
        flu.a(this.a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.a.setText(((akwg) obj).a);
        this.b.a(akor);
    }
}
