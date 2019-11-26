package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: iuc */
final class iuc implements OnClickListener {
    private final /* synthetic */ iud a;

    iuc(iud iud) {
        this.a = iud;
    }

    public final void onClick(View view) {
        apxu apxu = (apxu) view.getTag(R.id.tag_endpoint);
        if (apxu != null) {
            this.a.a.a(apxu, null);
        }
    }
}
