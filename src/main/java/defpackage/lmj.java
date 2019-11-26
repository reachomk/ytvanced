package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: lmj */
final /* synthetic */ class lmj implements lmm {
    public static final lmm a = new lmj();

    private lmj() {
    }

    public final View a(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.swipey_watch_view_holder, viewGroup, false);
    }
}
